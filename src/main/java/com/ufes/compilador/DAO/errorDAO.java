package com.ufes.compilador.DAO;

import com.ufes.compilador.Model.errorModel;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class errorDAO {
    Path caminho;

    /*
     salvando um erro direto ao instanciar a classe
    */
    public errorDAO(int line, String description) {
        this.caminho = Paths.get(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/errors.txt");
        this.salvarError(line, description);
    }
    
    /*
     instanciando a classe
    */
    public errorDAO() {
        this.caminho = Paths.get(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/errors.txt");
    }
    
    /*
     salvo um erro no arquivo
    */
    public void salvarError(int line, String description) {
        try{
            String textoEscrita = "\n-- ERRO --\n" + "Linha: " + line + "\n" + "Erro: " + description + "\n" + "." + "-- FIM ERRO --\n";
            byte[] textoLeitura = Files.readAllBytes(caminho);
            byte[] textoEmByte = textoEscrita.getBytes();
            byte[] textoCompleto = ArrayUtils.addAll(textoEmByte, textoLeitura);
            Files.write(caminho, textoCompleto);
        }
        catch(Exception e){
            System.out.println("Erro ao salvar funcionário no arquivo: " + e);
        }
    }
    
    /*
     limpando o arquivo
    */
    public void resetaArquivo() {
        try {
            File file = new File(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/errors.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch(Exception e) {
            System.out.println("Erro ao ler arquivo: " + e);
        }
    }
    
    // pega a lista de erros
    public List<errorModel> getErrors() {
        try {
            if (!Files.isReadable(caminho)) {
                throw new RuntimeException("Não foi possível ler o arquivo");
            }
            
            List<errorModel> errors = new ArrayList<errorModel>();
            String[] splitErrors = new String(Files.readAllBytes(caminho)).split("-- FIM ERRO --");
            
            if (splitErrors.length > 0) {
                for (int i = 0; i < splitErrors.length; i++) {
                    try {
                        errors.add(leituraToError(splitErrors[i]));
                    } catch(Exception e) {
                        System.out.println("Não foi possível converter o erro em uma instância: " + e);
                    }
                }
                return errors;
            } 
            
        } catch(Exception e) {
            System.out.println("Erro ao ler tokens do arquivo: " + e);
        }
        return new ArrayList<errorModel>();
    }
    
    // transforma a string de um erro em uma instância
    public errorModel leituraToError(String s) {
        s = s.split("-- ERRO --\n")[1];
        
        int linha = Integer.parseInt(s.substring(s.indexOf("Linha: "), s.indexOf("\n" + "Erro: ")).split("Linha: ")[1]);
        String descricao = s.substring(s.indexOf("Erro: "), s.indexOf("\n" + ".")).split("Erro: ")[1];

        return new errorModel(linha, descricao);
    }
}

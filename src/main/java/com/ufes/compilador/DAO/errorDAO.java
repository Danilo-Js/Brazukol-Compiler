package com.ufes.compilador.DAO;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.lang3.ArrayUtils;


/**
 *
 * @author meumacbook
 */
public class errorDAO {
    Path caminho;

    public errorDAO(int line, String description) {
        this.caminho = Paths.get(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/errors.txt");
        this.salvarError(line, description);
    }
    
    public errorDAO() {
        this.caminho = Paths.get(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/errors.txt");
    }
    
    public void salvarError(int line, String description) {
        try{
            String textoEscrita = "\n-- ERRO --\n" + "Linha: " + line + "\n" + "Erro: " + description + "\n" + "-- FIM ERRO --\n";
            byte[] textoLeitura = Files.readAllBytes(caminho);
            byte[] textoEmByte = textoEscrita.getBytes();
            byte[] textoCompleto = ArrayUtils.addAll(textoEmByte, textoLeitura);
            Files.write(caminho, textoCompleto);
        }
        catch(Exception e){
            System.out.println("Erro ao salvar funcionário no arquivo: " + e);
        }
    }
    
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
}

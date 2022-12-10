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
public class tokenDAO {
    Path caminho;
    
    public tokenDAO(String text, String token, int line) {
        this.caminho = Paths.get(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/tokens.txt");
        this.salvarToken(text, token, line);
    }

    public tokenDAO() {
        this.caminho = Paths.get(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/tokens.txt");
    }
    
    public void salvarToken(String text, String token, int line) {
        try{
            String textoEscrita = "\n-- TOKEN --\n" + "Texto: " + text + "\n" + "Token: " + token + "\n" + "Linha: " + line + "\n" + "-- FIM TOKEN --\n";
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
            File file = new File(System.getProperty("user.dir") + "/src/main/java/com/ufes/compilador/DAO/tokens.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch(Exception e) {
            System.out.println("Erro ao ler arquivo: " + e);
        }
    }
}

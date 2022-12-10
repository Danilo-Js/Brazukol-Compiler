package com.ufes.compilador.JFlex;

import com.ufes.compilador.DAO.tokenDAO;

public class Yytoken {
  public Yytoken(String text, int line, String token) {
    new tokenDAO(text, token, line);
  }
  
  public void printToken(String text, String token, int line) {
    System.out.println("\n-- PRINT TOKEN --\n");
    System.out.println("Texto: " + text + "\n");
    System.out.println("Token: " + token + "\n");
    System.out.println("Linha: " + line + "\n");
    System.out.println("-- FIM PRINT TOKEN --\n");
  }
}
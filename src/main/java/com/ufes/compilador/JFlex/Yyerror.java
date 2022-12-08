package com.ufes.compilador.JFlex;

public class Yyerror {
  public Yyerror(int line, String description) {
    this.printError(line, description);
  }
  
  public void printError(int line, String description) {
    System.out.println("\n-- PRINT ERRO --\n");
    System.out.println("Linha: " + line + "\n");   
    System.out.println("Erro: " + description + "\n");
    System.out.println("-- FIM PRINT ERRO --\n");
  }
}

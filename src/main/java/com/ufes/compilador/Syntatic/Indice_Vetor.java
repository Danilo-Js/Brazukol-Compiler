package com.ufes.compilador.Syntatic;

import com.ufes.compilador.JFlex.Yyerror;
import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.tokenModel;
import com.ufes.compilador.Model.vetorCollection;

public class Indice_Vetor {
    public tokenCollection tokenList;
    public vetorCollection vetores;
    
    public boolean estaEmBloco = false;
    public boolean estaEmProcedimento = false;
    public String nome = "";
    public boolean abriuColchetes = false;
    public boolean achouIndex = false;
    public int index = -1;
    
    public Indice_Vetor(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.vetores = new vetorCollection(tokenList);
        this.verify();
    }
    
    public void verificaBloco(tokenModel tk) {
        if (tk.token.equals("TKN_identificador")) {
            this.nome = tk.text;
        }
        if (this.nome.length() > 0 && tk.token.equals("TKN_abreColchetes")) {
            abriuColchetes = true;
        }
        if (this.abriuColchetes = true && tk.token.equals("TKN_tipoInteiro")) {
            this.index = Integer.parseInt(tk.text);
        }
        if (this.index > -1 && tk.token.equals("TKN_fechaColchetes")) {
            if (this.vetores.verifyIndex(this.nome, this.index) == false) {
                new Yyerror(tk.line, "Acessando um índice inexistente no vetor");
            }
            this.nome = "";
            this.abriuColchetes = false;
            this.achouIndex = false;
            this.index = -1;
        }
    }
    
    
    public void verificaProcedimento(tokenModel tk) {
        System.out.println("verificando procedimento: " + tk.text);
    }
    
    public void verify() {                
        for(tokenModel tk : tokenList.tokensReverse) {
            if (tk.token.equals("TKN_declarafuncao") || tk.token.equals("TKN_declaraProcedimento")) {
                this.estaEmProcedimento = true;
            }
            if (!estaEmProcedimento && tk.token.equals("TKN_iniciaBloco")) {
                this.estaEmBloco = true;
            }
            if (tk.token.equals("TKN_terminaBloco")) {
                if (this.estaEmBloco == true) {
                    this.estaEmBloco = false;
                } else {
                    this.estaEmProcedimento = false;
                }
            }
            if (this.estaEmBloco == true) {
                this.verificaBloco(tk);
            } else {
                if (this.estaEmProcedimento == true) {
                    this.verificaProcedimento(tk);
                } else {
                    this.nome = "";
                    this.abriuColchetes = false;
                    this.achouIndex = false;
                    this.index = -1;
                }
            }
        }
    }
}

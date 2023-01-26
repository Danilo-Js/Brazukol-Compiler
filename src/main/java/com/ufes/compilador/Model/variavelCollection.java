package com.ufes.compilador.Model;

import static com.ufes.compilador.Syntatic.Escopo.token_funcao;
import static com.ufes.compilador.Syntatic.Escopo.token_inicio;
import static com.ufes.compilador.Syntatic.Escopo.token_procedimento;
import java.util.ArrayList;
import java.util.List;

public class variavelCollection {
    public tokenCollection tokenList;
    public List<variavelModel> variaveis;
    
    public variavelCollection(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.variaveis = new ArrayList<variavelModel>();
        this.fillVariaveis();
    }
    
    public void printaVariaveis() {
        for (variavelModel v : variaveis) {
            System.out.println(v.name + " : " + v.type);
        }
    }
    
    /*
     preenche o vetor com as variaveis e constantes
    */
    public void fillVariaveis() {
        
        /*
         variáveis auxiliares verificar se a sequencia de tokens representa uma
         variável ou constante
        */
        boolean isDeclaringVariables = false;
        String name = "";
        boolean temDoisPontos = false;
        
        for(tokenModel tk : tokenList.tokensReverse) {
            if (tk.token.equals("TKN_iniciaVariavel") || tk.token.equals("TKN_iniciaConstante")) {
                isDeclaringVariables = true;
            }
            if (tk.token.equals(token_inicio) || tk.token.equals(token_procedimento) || tk.token.equals(token_funcao)) {
                isDeclaringVariables = false;
            }
            if (isDeclaringVariables == true ) {
                if (tk.token.equals("TKN_identificador")) {
                    name = tk.text;
                }
                if (name.length() > 0 && tk.token.equals("TKN_doisPontos")) {
                    temDoisPontos = true;
                }
                if (temDoisPontos = true && tk.token.equals("TKN_tipoVariavel")) {
                    variaveis.add(new variavelModel(name,tk.text));
                    name = "";
                    temDoisPontos = false;
                }
            }
        }
    }
}

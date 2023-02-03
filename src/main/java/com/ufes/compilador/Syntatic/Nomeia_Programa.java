package com.ufes.compilador.Syntatic;

import com.ufes.compilador.JFlex.Yyerror;
import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.tokenModel;

public class Nomeia_Programa {
    public tokenCollection tokenList;

    public Nomeia_Programa(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.verify();
    }
    
    /*
     verifica se o primeiro token nomeia o programa e se
     o segundo é um identificador
    */
    public void verify() {
        boolean achouNomeiaPrograma = false;
        boolean achouIdentificador = false;
        for (tokenModel tk : tokenList.tokensReverse) {
            if(tk.token.equals("TKN_nomeiaPrograma")) {
                achouNomeiaPrograma = true;
            }
            if (!tk.token.equals("TKN_nomeiaPrograma") && achouNomeiaPrograma == true) {
                if (!tk.token.equals("TKN_identificador")) {
                    break;
                } else {
                    achouIdentificador = true;
                }
            }
        }
        if (achouNomeiaPrograma == false || achouIdentificador == false) {
            new Yyerror(0, "Erro na nomeação do programa");
        }
    }
}

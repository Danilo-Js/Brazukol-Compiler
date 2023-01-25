package com.ufes.compilador.Syntatic;

import com.ufes.compilador.JFlex.Yyerror;
import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.tokenModel;
import java.util.ArrayList;
import java.util.List;

public class Escopo {
    public tokenCollection tokenList;
    
    public List<String> variaveis;

    public static final String token_startVars = "TKN_iniciaVariavel";
    public static final String token_startConsts = "TKN_iniciaConstante";

    public static final String token_inicio = "TKN_iniciaBloco";
    public static final String token_procedimento = "TKN_declaraProcedimento";
    public static final String token_funcao = "TKN_declarafuncao";

    
    public boolean isCapturingVars = false;
    
    public Escopo(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.isCapturingVars = false;
        this.variaveis = new ArrayList<String>();
        this.verify();
    }
    
    public void checkVar(String variable, int line) {
        if (variaveis.contains(variable)) {
            new Yyerror(line, "Variável/Constante " + variable + " sendo declarada mais de uma vez");
        } else {
            variaveis.add(variable);
        }

    }
    
    public void verify() {
        for(tokenModel tk : tokenList.tokensReverse) {
            if (this.isCapturingVars) {
                if (tk.token.equals("TKN_identificador")) {
                    this.checkVar(tk.text, tk.line);
                }
            }
            if (tk.token.equals(token_startVars) || tk.token.equals(token_startConsts)) {
                this.isCapturingVars = true;
            } else if (tk.token.equals(token_inicio) || tk.token.equals(token_procedimento) || tk.token.equals(token_funcao)) {
                this.isCapturingVars = false;
            }
        }
    }
}

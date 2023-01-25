package com.ufes.compilador.Syntatic;

import com.ufes.compilador.JFlex.Yyerror;
import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.tokenModel;
import java.util.List;

/**
 *
 * @author Danilo-Js
 */
public class Escopo {
    public tokenCollection tokenList;
    
    public List<tokenModel> variaveis;

    public static final String token_startVars = "TKN_iniciaVariavel";
    public static final String token_startConsts = "TKN_iniciaConstante";

    public static final String token_inicio = "TKN_iniciaBloco";
    public static final String token_procedimento = "TKN_declaraProcedimento";
    public static final String token_funcao = "TKN_declarafuncao";

    
    public boolean isCapturingVars = false;
    
    public Escopo(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.isCapturingVars = false;
        this.verify();
    }
    
    public void checkVar(tokenModel variable) {
        if (variaveis.contains(variable)) {
            new Yyerror(variable.line, "Variável/Constante sendo declarada mais de uma vez");
        } else {
            variaveis.add(variable);
        }
    }
    
    public void verify() {
        for(tokenModel tk : tokenList.tokens) {
            if (this.isCapturingVars) {
                this.checkVar(tk);
            }
            if (tk.token.equals(token_startVars) || tk.token.equals(token_startConsts)) {
                this.isCapturingVars = true;
            } else if (tk.token.equals(token_inicio) || tk.token.equals(token_procedimento) || tk.token.equals(token_funcao)) {
                this.isCapturingVars = false;
            }
        }
    }
}

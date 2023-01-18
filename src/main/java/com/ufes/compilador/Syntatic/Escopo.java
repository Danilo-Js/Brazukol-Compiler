// linha -> tokenList[x].line 
// valor -> tokenList[x].text 
// token atribuído -> tokenList[x].token
// achou o erro -> new Yyerror(linha, descrição do erro);

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

    public static final String token_startVars = "tk_vars";
    public static final String token_endVars = "tk_inicio";
    
    public boolean isCapturingVars = false;
    
    public Escopo(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.isCapturingVars = false;
        this.verify();
    }
    
    public void checkVar(tokenModel variable) {
        if (variaveis.contains(variable)) {
            new Yyerror(variable.line, "Variável sendo declarada mais de uma vez");
        } else {
            variaveis.add(variable);
        }
    }
    
    public void verify() {
        for(tokenModel tk : tokenList.tokens) {
            if (this.isCapturingVars) {
                this.checkVar(tk);
            }
            if (tk.token == token_startVars) {
                this.isCapturingVars = true;
            } else if (tk.token == token_endVars) {
                this.isCapturingVars = false;
            }
        }
    }
}

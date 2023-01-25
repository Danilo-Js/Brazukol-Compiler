package com.ufes.compilador.Syntatic;

import com.ufes.compilador.JFlex.Yyerror;
import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.tokenModel;

public class Break_Continue {
    public tokenCollection tokenList;

    public static final String token_for = "TKN_repita";
    public static final String token_while = "TKN_enquanto";
    public static final String token_break = "TKN_pare";
    public static final String token_continue = "TKN_continua";
    
    public boolean canBreakOrContinue;
    
    public Break_Continue(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.canBreakOrContinue = false;
        this.verify();
    }
    
    public void verify() {
        for(tokenModel tk : tokenList.tokensReverse) {
            if (tk.token.equals(token_for) || tk.token.equals(token_while)) {
                this.canBreakOrContinue = true;
            } else {
                if (tk.token.equals(token_break) || tk.token.equals(token_continue)) {
                    if (!this.canBreakOrContinue) {
                        new Yyerror(tk.line, "Encontrado um pare/continua for de um enquanto/repita");
                    }
                }
            }
        }
    }
}

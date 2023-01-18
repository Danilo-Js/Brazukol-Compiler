// linha -> tokenList[x].line 
// valor -> tokenList[x].text 
// token atribuído -> tokenList[x].token
// achou o erro -> New Yyerror(linha, descrição do erro);

package com.ufes.compilador.Syntatic;

import com.ufes.compilador.JFlex.Yyerror;
import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.tokenModel;

/**
 *
 * @author Danilo-Js
 */
public class Break_Continue {
    public tokenCollection tokenList;

    public static final String token_for = "tk_for";
    public static final String token_while = "tk_while";
    public static final String token_break = "tk_break";
    public static final String token_continue = "tk_continue";
    
    public boolean foundFor = false;
    public boolean foundWhile = false;
    
    public Break_Continue(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.foundFor = false;
        this.foundWhile = false;
        this.verify();
    }
    
    public void dealWithFor() {
        this.foundFor = true;
        this.foundWhile = false;
    }
    
    public void dealWithWhile() {
        this.foundFor = false;
        this.foundWhile = true;
    }
    
    public void dealWithPossibleError(int line) {
        if (!foundFor && !foundWhile) {
            new Yyerror(line, "Encontrado um break/continue for de um while/for");
        }
    }
    
    public void verify() {
        for(tokenModel tk : tokenList.tokens) {
            if (tk.token == token_for) {
                this.dealWithFor();
            } else {
                if (tk.token == token_while) {
                    this.dealWithWhile();
                } else {
                    if (tk.token == token_break | tk.token == token_continue) {
                        this.dealWithPossibleError(tk.line);
                    }
                }
            }
        }
    }
}

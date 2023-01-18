// linha -> tokenList[x].line 
// valor -> tokenList[x].text 
// token atribuído -> tokenList[x].token
// achou o erro -> New Yyerror(linha, descrição do erro);

package com.ufes.compilador.Syntatic;

import com.ufes.compilador.Model.tokenCollection;

/**
 *
 * @author
 */
public class Escopo {
    public tokenCollection tokenList;

    public Escopo(tokenCollection tokenList) {
        this.tokenList = tokenList;
    }
}

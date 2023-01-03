// linha -> tokenList[x].line 
// valor -> tokenList[x].text 
// token atribuído -> tokenList[x].token
// achou o erro -> New Yyerror(linha, descrição do erro);

package com.ufes.compilador.Syntatic;

import com.ufes.compilador.Model.tokenCollection;

/**
 *
 * @author Danilo-Js
 */
public class ErroDeTipo {
    public tokenCollection tokenList;

    public ErroDeTipo(tokenCollection tokenList) {
        this.tokenList = tokenList;
    }
}

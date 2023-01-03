package com.ufes.compilador.Syntatic;

import com.ufes.compilador.Model.tokenCollection;

/**
 *
 * @author Danilo-Js
 */
public class RunSyntatic {
    public tokenCollection tokenList;
    
    public RunSyntatic() {
        new Escopo(tokenList);
        new ErroDeTipo(tokenList);
        new Break_Continue(tokenList);
        new Indice_Vetor(tokenList);
    }
}

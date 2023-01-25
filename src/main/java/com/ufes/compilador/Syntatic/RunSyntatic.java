package com.ufes.compilador.Syntatic;

import com.ufes.compilador.Model.tokenCollection;

public class RunSyntatic {
    
    public RunSyntatic() {
        tokenCollection tokenList = new tokenCollection();
        new Escopo(tokenList);
        new ErroDeTipo(tokenList);
        new Break_Continue(tokenList);
        new Indice_Vetor(tokenList);
    }
}

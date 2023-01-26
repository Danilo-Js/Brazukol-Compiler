package com.ufes.compilador.Syntatic;

import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.variavelCollection;

public class ErroDeTipo {
    public tokenCollection tokenList;
    public variavelCollection variaveis;
    
    public ErroDeTipo(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.variaveis = new variavelCollection(tokenList);
    }
}

package com.ufes.compilador.Syntatic;

import com.ufes.compilador.Model.tokenCollection;
import com.ufes.compilador.Model.vetorCollection;

public class Indice_Vetor {
    public vetorCollection vetores;
    
    public boolean isVetorStarted = false;
    
    public Indice_Vetor(tokenCollection tokenList) {
        this.vetores = new vetorCollection(tokenList);
    }
    

}

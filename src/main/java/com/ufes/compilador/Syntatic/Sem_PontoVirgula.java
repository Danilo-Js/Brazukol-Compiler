package com.ufes.compilador.Syntatic;

import com.ufes.compilador.Model.tokenCollection;

public class Sem_PontoVirgula {
    public tokenCollection tokenList;

    public Sem_PontoVirgula(tokenCollection tokenList) {
        this.tokenList = tokenList;
        this.verify();
    }
    
    /*
     verifica se todas as linhas terminam com ponto e vírgula, com exceção das:
     nomeiam programa, variáveis/constantes, declaram procedimento, iniciam ou terminam bloco
    */
    public void verify () {
        
    }
}

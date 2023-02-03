package com.ufes.compilador.Model;

import com.ufes.compilador.DAO.tokenDAO;
import java.util.List;
import java.util.Collections;

public class tokenCollection {
    public List<tokenModel> tokens; // tokens começando do ultimo para o primeiro
    public List<tokenModel> tokensReverse; // tokens começando do primeiro para o ultimo
    
    public tokenCollection() {
        this.tokens = new tokenDAO().getTokens();        
        this.tokensReverse = new tokenDAO().getTokens();
        Collections.reverse(tokensReverse);
    }
    
    public tokenModel getFirstToken() {
        return tokensReverse.get(0);
    }
    
    public tokenModel getSecondToken() {
        return tokensReverse.get(1);
    }
    
    public void printTokens() {
        for(tokenModel token: tokens) {
            token.printToken();
        }
    }
}

package com.ufes.compilador.Model;

import com.ufes.compilador.DAO.tokenDAO;
import java.util.List;
import java.util.Collections;

public class tokenCollection {
    public List<tokenModel> tokens;
    public List<tokenModel> tokensReverse;
    
    public tokenCollection() {
        this.tokens = new tokenDAO().getTokens();        
        this.tokensReverse = new tokenDAO().getTokens();
        Collections.reverse(tokensReverse);
    }
    
    public void printTokens() {
        for(tokenModel token: tokens) {
            token.printToken();
        }
    }
}

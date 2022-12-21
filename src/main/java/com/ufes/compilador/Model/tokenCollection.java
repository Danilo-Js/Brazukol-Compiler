package com.ufes.compilador.Model;

import com.ufes.compilador.DAO.tokenDAO;
import java.util.List;

/**
 *
 * @author Danilo-Js
 */
public class tokenCollection {
    public List<tokenModel> tokens;
    
    public tokenCollection() {
        this.tokens = new tokenDAO().getTokens();
    }
    
    public void printTokens() {
        for(tokenModel token: tokens) {
            token.printToken();
        }
    }
}

package com.ufes.compilador.Model;

import com.ufes.compilador.Model.Token;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo-Js
 */

public class ResultCollection {
    private List<ResultMessage> collection;

    public ResultCollection(){
        collection = new ArrayList<>();
    }
    
    public String getMessage(Token token) {
        for(ResultMessage element : collection){
//            if(element.getToken().equals(token)) return element.getErrorMessage();
        }
        return null;
    }
    
    public void addError(Token token, String mensagemErro){
//        collection.add(new ResultMessage(token, mensagemErro));
    }

    public List<ResultMessage> getErrorList() {
        return collection;
    }
}

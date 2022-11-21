package com.ufes.compilador.Model;

import com.ufes.compilador.Model.Token;

/**
 *
 * @author Danio-Js
 */
public class ResultMessage {
    private Token token;
    private String errorMessage;

    public ResultMessage(Token token, String errorMessage) {
        this.token = token;
        this.errorMessage = errorMessage;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

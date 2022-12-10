package com.ufes.compilador.Model;

/**
 *
 * @author Danilo-Js
 */
public class errorModel {
    public int line;
    public String description;
    
    public errorModel(int line, String description) {
        this.line = line;
        this.description = description;
    }
}

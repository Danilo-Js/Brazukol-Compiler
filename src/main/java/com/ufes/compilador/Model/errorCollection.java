package com.ufes.compilador.Model;

import com.ufes.compilador.DAO.errorDAO;
import java.util.List;

/**
 *
 * @author Danilo-Js
 */
public class errorCollection {
    public List<errorModel> errors;
    
    public errorCollection() {
        this.errors = new errorDAO().getErrors();
    }
}

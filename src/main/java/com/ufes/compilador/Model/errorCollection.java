package com.ufes.compilador.Model;

import com.ufes.compilador.DAO.errorDAO;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Danilo-Js
 */
public class errorCollection {
    public List<errorModel> errors;
    public List<errorModel> errorsReverse;

    public errorCollection() {
        this.errors = new errorDAO().getErrors();
        this.errorsReverse = new errorDAO().getErrors();
        Collections.reverse(errorsReverse);
    }
}

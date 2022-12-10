package com.ufes.compilador.Presenter;

import com.ufes.compilador.DAO.errorDAO;
import com.ufes.compilador.DAO.tokenDAO;
import com.ufes.compilador.JFlex.YylexTest;
import com.ufes.compilador.View.MainView;

/**
 *
 * @author Danilo-Js
 */
public class MainPresenter {
    private MainView view; // tela principal

    public MainPresenter() {
        this.view = new MainView(); // instanciando a tela principal
        this.setIcons(); 
        
        this.view.getCompileButton().addActionListener((e) -> {
            new errorDAO().resetaArquivo();
            new tokenDAO().resetaArquivo();
            new YylexTest();
            new ResultPresenter();
        });

        this.view.setVisible(true);
    }
    
    private void setIcons() {
//        this.view.getCompileButton().setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufes/Images/compile.png")));
    }
}

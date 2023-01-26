package com.ufes.compilador.Presenter;

import com.ufes.compilador.DAO.errorDAO;
import com.ufes.compilador.DAO.tokenDAO;
import com.ufes.compilador.JFlex.YylexTest;
import com.ufes.compilador.Syntatic.RunSyntatic;
import com.ufes.compilador.View.MainView;
import java.io.File;
import java.io.PrintWriter;

public class MainPresenter {
    private MainView view; // tela principal

    public MainPresenter() {
        this.view = new MainView(); // instanciando a tela principal
        this.setIcons(); 
        
        this.view.getCompileButton().addActionListener((e) -> {
            new errorDAO().resetaArquivo();
            new tokenDAO().resetaArquivo();
            this.setArquivoParaCompilar();
            new YylexTest();
            new RunSyntatic();
            new ResultPresenter();
        });

        this.view.setVisible(true);
    }
    
    /*
     joga todo o código no arquivo que será lido para a análise léxica
    */
    public void setArquivoParaCompilar() {
        try{
            File file = new File(System.getProperty("user.dir") + "/src/test/data/input.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print(this.view.getTextToCompile());
            writer.close();
        }
        catch(Exception e){
            System.out.println("Erro ao salvar código no arquivo para compilar: " + e);
        }
    }
    
    private void setIcons() {
//        this.view.getCompileButton().setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufes/Images/compile.png")));
    }
}

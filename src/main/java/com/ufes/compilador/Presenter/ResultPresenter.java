package com.ufes.compilador.Presenter;

import com.ufes.compilador.View.ResultView;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danilo-Js
 */
public class ResultPresenter {
    private ResultView view; // Tela de resultados

    public ResultPresenter() {
        this.view = new ResultView(); // instanciando a tela de resultados
        this.view.setVisible(true);
    }
    
    private void atualizaTabelaResultado() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) this.view.getJTableResultado().getModel();
            modelo.setNumRows(0);

//            for() {
//                modelo.addRow(new Object[]{
//                    // erro,
//                    // linha,
//                    // coluna,
//                    // token,
//                });
//            }
        } catch(RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela: " + e);
        }
    } 
    
    private void atualizaTabelaLexia() {
        
    }
}

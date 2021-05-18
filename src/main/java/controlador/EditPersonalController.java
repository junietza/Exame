/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Tablamodelo;
import Modelo.Persona;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sistemas-23
 */
public class EditPersonalController {
    private static EditPersonalController editController;
    private  final EditPersonalActionListener actionListener;
    private  EditPersonalDialog dialog;
    private final Tablamodelo tableModel;
    
     private  EditPersonalController() {
         actionListener = new EditPersonalActionListener();
         tableModel = Tablamodelo.getTableModel();
         
     }
     public static EditPersonalDialog getInstance() {
        return editController == null
                ? editController = new EditPersonalDialogController()
                : editController;
    }
      private void setUpController() {
        addListeners();
        try {
            initComponents();
        } catch (ParseException | URISyntaxException ex) {
            Logger.getLogger(EditPersonalDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       private void addListeners() {
        dialog.getBtnSave().addActionListener(actionListener);
        
    }
}

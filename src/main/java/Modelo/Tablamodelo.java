/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sistemas-23
 */
public class Tablamodelo extends AbstractTableModel {
//xx
       private static Tablamodelo tableModel;
       private final List<Object[]> personList;
       
       private final String columnNames[];

    private Tablamodelo() {
        columnNames = new String[]{"N°", "Name one", "Name two", 
            "Lastname one", "Lastname two",
            "BirthDat", "Age","Experience", "Money" };
            
        personList = new ArrayList<>();
     }
    public static Tablamodelo getTableModel() {
        return tableModel == null
                ? tableModel = new Tablamodelo()
                : tableModel;
    }
    public int getRowCount() {
        return personList.size();
    }
        public int getColumnCount() {
        return columnNames.length;
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }
     public String getColumnName(int column) {
        if (column < 0 || column > columnNames.length) {
            return null;
        }
        return columnNames[column];
        }
     
        public Object getValueAt(int rowIndex, int columnIndex) {
        if (personList.isEmpty()) {
            return null;
        } else if (rowIndex < 0 || rowIndex > personList.size()) {
            return null;
        } else if (columnIndex < 0 || columnIndex > columnNames.length) {
            return null;
        }
        return personList.get(rowIndex)[columnIndex];
    }
    public void addRow(Persona person) {
        if (person != null) {
            try {
                personList.add(convertToArray(person));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(Tablamodelo.class.getName()).log(Level.SEVERE, null, ex);
            }
            fireTableRowsInserted(personList.size() - 1, personList.size() - 1);
        }
    }  
        
        
        
    }
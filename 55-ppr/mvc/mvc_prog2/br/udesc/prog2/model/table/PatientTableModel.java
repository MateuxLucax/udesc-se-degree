/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.model.table;

import br.udesc.prog2.model.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matth
 */
public class PatientTableModel extends AbstractTableModel {

    private List<Paciente> pacientes;
    
    private final String[] nomeColunas = {"CPF", "Nome"};
    private final int COLUNA_CPF = 0;
    private final int COLUNA_NOME = 1;
    
    public PatientTableModel(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    
    @Override
    public int getRowCount() {
        return pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return nomeColunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente paciente = this.pacientes.get(rowIndex);
        String valor = null;
        switch(columnIndex){
            case COLUNA_CPF:
                valor = paciente.getCPF();
                break;
            case COLUNA_NOME:
                valor = paciente.getName();
                break;
        }
        return valor;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo método é do tipo Object
        //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
    	Paciente paciente = this.pacientes.get(rowIndex);
        //de acordo com a coluna, ele preenche a célula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
            case COLUNA_CPF:
                paciente.setCPF((String) aValue);
                break;
            case COLUNA_NOME:
                paciente.setName((String) aValue);
            	//Nada vai acontecer
                break;
        }
        //este método é que notifica a tabela que houve alteração de dados
        fireTableDataChanged();
    }
    
}

//******************************************************

//Instituto Federal de São Paulo - Campus Sertãozinho

//Disciplina......: M3LPBD

//Programação de Computadores e Dispositivos Móveis

//Aluno...........: Camila Maria de Oliveira Lima

//******************************************************




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author Camila Lima
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
  
/**
 * @version 1.0 11/09/98
 */
public class ButtonEditor extends DefaultCellEditor {
  protected JButton button;
  private String    label;
  private boolean   isPushed;
  private int       row;
  private JTable    table;
  
  public ButtonEditor(JCheckBox checkBox) {
    super(checkBox);
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          
        
        String value = table.getModel().getValueAt(row, 0).toString();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (
                null, "Tem Certeza que deseja remover esse curso?","Atenção",
                dialogButton
        );
        if(dialogResult == JOptionPane.YES_OPTION){
            removeData(value); 
        }  
      }
    });
  }
  /*Botão responsável por deletar o registro dos dados no banco*/
  
  private void removeData(String id_obj){

    try {

        String cmd = "DELETE FROM `discipline` WHERE id = "
                +id_obj+";";
        // TODO add your handling code here:
        java.sql.Connection con = ConexaoMySQL.getInstance().getConnection();
        con.createStatement().executeUpdate(cmd);

        DefaultTableModel model = (DefaultTableModel) table.getModel();  
        model.removeRow(this.row);
        
        JOptionPane.showMessageDialog(null, 
                "Curso removido com Sucesso!", 
                "Remoção de Curso", 1);

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
 
  }
  /* Tem como função exibir mensagem de alerta para o usuário confirmando o cancelamento, após confirmado o dado será deletado.*/
  
  public Component getTableCellEditorComponent(JTable table, Object value,
                   boolean isSelected, int row, int column) {
      this.row = row;
      this.table = table;
      if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else{
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
    }
    label = (value ==null) ? "" : value.toString();
    button.setText( label );
    isPushed = true;
    return button;
  }
  
  public Object getCellEditorValue() {
    if (isPushed)  {
      JOptionPane.showMessageDialog(button ,label + ": Ouch!");
      // System.out.println(label + ": Ouch!");
    }
    isPushed = false;
    return new String( label ) ;
  }
    
  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }
  
  protected void fireEditingStopped() {
    super.fireEditingStopped();
  }
}
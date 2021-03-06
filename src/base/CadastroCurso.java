//******************************************************

//Instituto Federal de São Paulo - Campus Sertãozinho

//Disciplina......: M3LPBD

//Programação de Computadores e Dispositivos Móveis

//Aluno...........: Camila Maria de Oliveira Lima

//******************************************************

package base;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camila Lima
 */
public class CadastroCurso extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCurso
     */
    public CadastroCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        PlainDocument doc_workload = (PlainDocument) workload.getDocument();
        doc_workload.setDocumentFilter(new ValidatorIntFilter());
        
        PlainDocument doc_number_vacancies = (PlainDocument) number_vacancies.getDocument();
        doc_number_vacancies.setDocumentFilter(new ValidatorIntFilter());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_discipline = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        workload = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        course_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        number_vacancies = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        period = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cursos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Disciplana");

        jLabel2.setText("Nome da disciplina:*");

        name_discipline.setName("name_discipline"); // NOI18N

        jLabel3.setText("Carga horaria:*");

        workload.setName("workload"); // NOI18N

        jLabel4.setText("Curso que ela pertence:*");

        course_name.setName("course_name"); // NOI18N

        jLabel5.setText("Número de vagas:*");

        number_vacancies.setName("number_vacancies"); // NOI18N

        jLabel6.setText("Período:*");

        period.setName("period"); // NOI18N

        cancel.setText("Cancelar");
        cancel.setToolTipText("Cancelar");
        cancel.setName("cancel"); // NOI18N
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Salvar");
        save.setToolTipText("Salvar");
        save.setName("save"); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(period)
                            .addComponent(number_vacancies)
                            .addComponent(name_discipline)
                            .addComponent(workload)
                            .addComponent(course_name))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, save});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(name_discipline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(workload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(number_vacancies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(period, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancel, save});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (name_discipline.getText().equals("") ||
            workload.getText().equals("") ||
            course_name.getText().equals("") ||
            number_vacancies.getText().equals("") ||
            period.getText().equals("")
        ){
            JOptionPane.showMessageDialog(null, 
                    "Preencha todos os campos", 
                    "Cadastro de Curso", 0);
            
        }else{
            String cmd = "INSERT INTO `discipline` (`name_discipline`, `workload`, "
                    + "`course_name`, `number_vacancies`, `period`) "
                    + "VALUES ('"
                    +name_discipline.getText()+"', '"
                    +workload.getText()+"', '"
                    +course_name.getText()+"', '"
                    +number_vacancies.getText()+"', '"
                    +period.getText()+"');";

            try {

                // TODO add your handling code here:
                java.sql.Connection con = ConexaoMySQL.getInstance().getConnection();
                con.createStatement().executeUpdate(cmd);

                JOptionPane.showMessageDialog(null, 
                        "Dados Inseridos com Sucesso!", 
                        "Cadastro de Curso", 1);
                name_discipline.setText("");
                workload.setText("");
                course_name.setText("");
                number_vacancies.setText("");
                period.setText("");

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        };
    }//GEN-LAST:event_saveActionPerformed
    /*Através desse modulo é montado a string de inserção no banco, enviando assim essa string para o banco de dados,o processo sendo efetivado exibirá uma caixa de alerta com mensagem de confirmação para o usuário,recarregando formulário em branco */ 
    
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ListaCursos().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed
   
    /*Programa o botão de cancelar que fechará o formulário de cadastro e retorna para a lista de disciplinas.*/
    
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField course_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name_discipline;
    private javax.swing.JTextField number_vacancies;
    private javax.swing.JTextField period;
    private javax.swing.JButton save;
    private javax.swing.JTextField workload;
    // End of variables declaration//GEN-END:variables

}

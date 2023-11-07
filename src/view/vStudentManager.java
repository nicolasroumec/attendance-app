/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.StudentsDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Student;
import models.StudentDTO;
import java.sql.SQLException;



public class vStudentManager extends javax.swing.JFrame {
    //Declaraciones
    private StudentsDAO studentsDAO;
    private ArrayList<Student> studentsList;
    private DefaultTableModel model;
    
    public vStudentManager() {
        //Inicializaciones
        initComponents();
        IOPanel.setVisible(false);
        filler1.setSize(IOPanel.getWidth(), IOPanel.getHeight());
        this.setLocationRelativeTo(null);
        studentsDAO = new StudentsDAO(); //Cada vez que se abra la ventana se va a generar el DAO de cero.
        model = new DefaultTableModel() {
            @Override 
            public boolean isCellEditable(int row, int column){
                return false;
            }  
        };
        createTableModel();
        updateTable();
    }
    //Metodos
    private void updateTable(){
        while(model.getRowCount()>0){
            model.removeRow(0); //Borra la lista para cargarla para crearla con la nueva modificacion
        }
        studentsList = studentsDAO.getStudent(); //Vuelvo a cargar la lista
        
        for(Student s : studentsList){
            Object student [] = new Object[4];
            student[0] = s.getId();
            student[1] = s.getFirstName();
            student[2] = s.getLastName();
            student[3] = s.getDni();
            
            model.addRow(student);
        }
        studentsTable.setModel(model);
    }
    
    private void createTableModel(){
        model.addColumn("ID");
        model.addColumn("First name");
        model.addColumn("Last name");
        model.addColumn("DNI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddStudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        IOPanel = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        FirstNameOutput = new javax.swing.JTextField();
        DNIOutput = new javax.swing.JTextField();
        LastNameOutput = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        IdOutput = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddStudent.setText("Add student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        studentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentsTable);

        IOPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        FirstNameOutput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FirstNameOutputKeyTyped(evt);
            }
        });

        DNIOutput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DNIOutputKeyTyped(evt);
            }
        });

        LastNameOutput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LastNameOutputKeyTyped(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        IdOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID");

        jLabel2.setText("First name");

        jLabel3.setText("Last name");

        jLabel4.setText("DNI");

        javax.swing.GroupLayout IOPanelLayout = new javax.swing.GroupLayout(IOPanel);
        IOPanel.setLayout(IOPanelLayout);
        IOPanelLayout.setHorizontalGroup(
            IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IOPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(IOPanelLayout.createSequentialGroup()
                        .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LastNameOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DNIOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IdOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        IOPanelLayout.setVerticalGroup(
            IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IOPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IdOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FirstNameOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LastNameOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DNIOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IOPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IOPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        vAddStudent window = new vAddStudent();
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        vMain window = new vMain();
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void studentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsTableMouseClicked
        int fila = studentsTable.getSelectedRow();
        IdOutput.setText(studentsTable.getValueAt(fila, 0).toString());
        FirstNameOutput.setText(studentsTable.getValueAt(fila, 1).toString());
        LastNameOutput.setText(studentsTable.getValueAt(fila, 2).toString());
        DNIOutput.setText(studentsTable.getValueAt(fila, 3).toString());   
        IOPanel.setVisible(true);
    }//GEN-LAST:event_studentsTableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int fila = studentsTable.getSelectedRow();
        try{
            int id = Integer.parseInt (IdOutput.getText());
            String firstName = FirstNameOutput.getText();
            String lastName = LastNameOutput.getText();
            int dni = Integer.parseInt (DNIOutput.getText());
            
            if(firstName.equals("") || lastName.equals("")){
                JOptionPane.showMessageDialog(null, "Empty fields");
                IdOutput.setText(studentsTable.getValueAt(fila, 0).toString());
                FirstNameOutput.setText(studentsTable.getValueAt(fila, 1).toString());
                LastNameOutput.setText(studentsTable.getValueAt(fila, 2).toString());
                DNIOutput.setText(studentsTable.getValueAt(fila, 3).toString());    
            }
            else{
               
                Student student = new Student (id, firstName, lastName, dni);

                student.setId(id);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setDni(dni);

                studentsDAO.updateStudent(student);
                updateTable();
                JOptionPane.showMessageDialog(null, "Student updated");

                FirstNameOutput.setText("");
                LastNameOutput.setText("");
                DNIOutput.setText("");
                IdOutput.setText("");
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fatal error");
            e.printStackTrace();
            DNIOutput.setText(studentsTable.getValueAt(fila, 3).toString());
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int id = Integer.parseInt (IdOutput.getText());
        studentsDAO.deleteStudent(id);
        updateTable();
        JOptionPane.showMessageDialog(null, "Student deleted");
        FirstNameOutput.setText("");
        LastNameOutput.setText("");
        DNIOutput.setText("");
        IdOutput.setText("");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        IOPanel.setVisible(false);
        
        updateTable();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void FirstNameOutputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameOutputKeyTyped
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_FirstNameOutputKeyTyped

    private void LastNameOutputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameOutputKeyTyped
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_LastNameOutputKeyTyped

    private void DNIOutputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIOutputKeyTyped
        char n = evt.getKeyChar();
        
        if(n<'0' || n>'9') evt.consume();
    }//GEN-LAST:event_DNIOutputKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vStudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vStudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vStudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vStudentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vStudentManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNIOutput;
    private javax.swing.JTextField FirstNameOutput;
    private javax.swing.JPanel IOPanel;
    private javax.swing.JLabel IdOutput;
    private javax.swing.JTextField LastNameOutput;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentsTable;
    // End of variables declaration//GEN-END:variables
}

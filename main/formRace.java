package main;

import dao.*;
import java.util.*;
import javax.swing.JOptionPane;
import template.*;

public class formRace extends javax.swing.JDialog {

    public formRace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        reload();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        list1 = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Race>());
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Primeiro");
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
        });
        jPanel1.add(jButton1);

        jButton2.setText("Anterior");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton2ActionPerformed(evt);
        });
        jPanel1.add(jButton2);

        jButton3.setText("Próximo");
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton3ActionPerformed(evt);
        });
        jPanel1.add(jButton3);

        jButton4.setText("Último");
        jButton4.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton4ActionPerformed(evt);
        });
        jPanel1.add(jButton4);

        jButton5.setText("Fechar");
        jButton5.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton5ActionPerformed(evt);
        });
        jPanel1.add(jButton5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRace}"));
        columnBinding.setColumnName("Id Race");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setEditable(false);
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${specie}"));
        columnBinding.setColumnName("Specie");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Listagem", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jButton6.setText("Novo");
        jButton6.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton6ActionPerformed(evt);
        });
        jPanel4.add(jButton6);

        jButton7.setText("Editar");
        jButton7.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton7ActionPerformed(evt);
        });
        jPanel4.add(jButton7);

        jButton8.setText("Cancelar");
        jButton8.setEnabled(false);
        jButton8.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton8ActionPerformed(evt);
        });
        jPanel4.add(jButton8);

        jButton9.setText("Salvar");
        jButton9.setEnabled(false);
        jButton9.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton9ActionPerformed(evt);
        });
        jPanel4.add(jButton9);

        jButton10.setText("Excluir");
        jButton10.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton10ActionPerformed(evt);
        });
        jPanel4.add(jButton10);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Espécie");

        jTextField1.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idRace}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField2.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.name}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField3.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.specie}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(102, 102, 102))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(100, 100, 100))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(94, 94, 94)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(jTextField2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
        );

        jTabbedPane1.addTab("Dados", jPanel3);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.LINE_START);

        bindingGroup.bind();

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTable1.setRowSelectionInterval(0, 0);
        jTable1.scrollRectToVisible(jTable1.getCellRect(0, 0, true));
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int line = jTable1.getSelectedRow() - 1;
        if (line >= 0) {
            jTable1.setRowSelectionInterval(line, line);
            jTable1.scrollRectToVisible(jTable1.getCellRect(line, line, true));
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int line = jTable1.getSelectedRow() + 1;
        if (line < jTable1.getRowCount()) {
            jTable1.setRowSelectionInterval(line, line);
            jTable1.scrollRectToVisible(jTable1.getCellRect(line, line, true));
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        int line = jTable1.getRowCount() - 1;
        jTable1.setRowSelectionInterval(line, line);
        jTable1.scrollRectToVisible(jTable1.getCellRect(line, line, true));
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    DaoRace dao = new DaoRace();

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        list1.add((Race) new Race());
        int line = list1.size() - 1;
        jTable1.setRowSelectionInterval(line, line);
        jTextField2.requestFocus();
        isEditing(true);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField2.requestFocus();
        isEditing(true);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            isEditing(false);
            reload();
        }
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        if (validateFields()) {
            int selectedLine = jTable1.getSelectedRow();
            Race obj = list1.get(selectedLine);
            isEditing(false);
            dao.save(obj);
            reload();
        }
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir " + jTextField2.getText(), "Excluir", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            int selectedLine = jTable1.getSelectedRow();
            if (selectedLine != -1) {
                Race obj = list1.get(selectedLine);
                dao.delete(obj);
                reload();
            }
        }
    }

    public void reload() {
        list1.clear();
        list1.addAll(dao.getList());
        int line = list1.size() - 1;
        if (line >= 0) {
            jTable1.setRowSelectionInterval(line, line);
            jTable1.scrollRectToVisible(jTable1.getCellRect(line, line, true));
        }
    }

    private void isEditing(boolean state) {
        jButton1.setEnabled(!state);
        jButton2.setEnabled(!state);
        jButton3.setEnabled(!state);
        jButton4.setEnabled(!state);
        jButton5.setEnabled(!state);
        jButton6.setEnabled(!state);
        jButton7.setEnabled(!state);
        jButton8.setEnabled(state);
        jButton9.setEnabled(state);
        jButton10.setEnabled(!state);

        jTextField2.setEditable(state);
        jTextField3.setEditable(state);
    }

    private boolean validateFields() {
        if (jTextField2.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Nome inválido", "Erro no Preenchimento do Formulário", JOptionPane.WARNING_MESSAGE);
            jTextField2.requestFocus();
            return false;
        }
        if (jTextField3.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Espécie inválida", "Erro no Preenchimento do Formulário", JOptionPane.WARNING_MESSAGE);
            jTextField3.requestFocus();
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            formRace dialog = new formRace(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.util.List<Race> list1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   
}

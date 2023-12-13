package main;

import dao.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;
import template.*;

public class formAnimal extends JDialog {

    public formAnimal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DaoCustomer cus = new DaoCustomer();
        list2.clear();
        list2.addAll(cus.getList());
        DaoRace rac = new DaoRace();
        list3.clear();
        list3.addAll(rac.getList());
        reload();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        list1 = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Animal>());
        list2 = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Customer>());
        list3 = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Race>());
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jTabbedPane1 = new JTabbedPane();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jPanel5 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jComboBox1 = new JComboBox();
        jComboBox2 = new JComboBox();
        jComboBox3 = new JComboBox();
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("####-##-##");
        } catch (Exception e) {}
        jTextField3 = new JFormattedTextField(mask);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(BorderFactory.createTitledBorder("Navegação"));
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
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idAnimal}"));
        columnBinding.setColumnName("Id Animal");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCustomer}"));
        columnBinding.setColumnName("Id Customer");
        columnBinding.setColumnClass(Customer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gender}"));
        columnBinding.setColumnName("Gender");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${birthDate}"));
        columnBinding.setColumnName("Birth Date");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRace}"));
        columnBinding.setColumnName("Id Race");
        columnBinding.setColumnClass(Race.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Listagem", jPanel2);

        jPanel4.setBorder(BorderFactory.createTitledBorder("Ações"));
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

        jLabel2.setText("Dono");

        jLabel3.setText("Nome");

        jLabel4.setText("Gênero");

        jLabel5.setText("Data de nascimento");

        jLabel6.setText("Raça");

        jTextField1.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idAnimal}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField2.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.name}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField3.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.birthDate}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jComboBox1.setEnabled(false);
        
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list2, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idCustomer}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox2.setEnabled(false);
        jComboBox2.setModel(new DefaultComboBoxModel(new String[]{"F", "M"}));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.gender}"), jComboBox2, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox3.setEnabled(false);
        
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list3, jComboBox3);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idRace}"), jComboBox3, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2))
                        .addGap(206, 206, 206))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(77, Short.MAX_VALUE))
        );

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    DaoAnimal dao = new DaoAnimal();

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        list1.add((Animal) new Animal());
        int line = list1.size() - 1;
        jTable1.setRowSelectionInterval(line, line);
        jComboBox1.requestFocus();
        isEditing(true);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jComboBox1.requestFocus();
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
            Animal obj = list1.get(selectedLine);
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
                Animal obj = list1.get(selectedLine);
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
        jComboBox1.setEnabled(state);
        jComboBox2.setEnabled(state);
        jComboBox3.setEnabled(state);

    }

    private boolean validateFields() {
        if (jTextField2.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Nome inválido", "Erro no Preenchimento do Formulário", JOptionPane.WARNING_MESSAGE);
            jTextField2.requestFocus();
            return false;
        }
        if (!DefaultVerification.dateVerification(jTextField3.getText())) {
            JOptionPane.showMessageDialog(null, "Data inválida", "Erro no Preenchimento do Formulário", JOptionPane.WARNING_MESSAGE);
            jTextField3.requestFocus();
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            formAnimal dialog = new formAnimal(new JFrame(), true);
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
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JFormattedTextField jTextField3;
    private java.util.List<Animal> list1;
    private java.util.List<Customer> list2;
    private java.util.List<Race> list3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   
}

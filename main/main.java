package main;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import assets.*;

public class main extends JFrame {

    public main() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem6 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     
        jPanel1 = new assets.image("/assets/a.png");
        
        jMenu1.setText("Cadastrar");

        jMenuItem1.setText("Animais");
        jMenuItem1.addActionListener((ActionEvent evt) -> redirect(evt, "Animals"));
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener((ActionEvent evt) -> redirect(evt, "Customers"));
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Consultas");
        jMenuItem3.addActionListener((ActionEvent evt) -> redirect(evt, "Consultations"));
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Médicos");
        jMenuItem4.addActionListener((ActionEvent evt) -> redirect(evt, "Doctors"));
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Raças");
        jMenuItem5.addActionListener((ActionEvent evt) -> redirect(evt, "Races"));
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem6.setText("Sobre");
        jMenuItem6.addActionListener((ActionEvent evt) -> redirect(evt, "Test"));
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );
    
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void redirect(ActionEvent evt, String table) {
        switch (table) {
            case "Animals":
                formAnimal animal = new formAnimal(this, true);
                animal.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                animal.setLocationRelativeTo(null);
                animal.setTitle("Novo Animal");
                animal.setVisible(true);
                break;
            case "Consultations":
                formConsultation consultation = new formConsultation(this, true);
                consultation.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                consultation.setLocationRelativeTo(null);
                consultation.setTitle("Nova Consulta");
                consultation.setVisible(true);
                break;
            case "Customers":
                formCustomer customer = new formCustomer(this, true);
                customer.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                customer.setLocationRelativeTo(null);
                customer.setTitle("Novo Cliente");
                customer.setVisible(true);
                break;
            case "Doctors":
                formDoctor doctor = new formDoctor(this, true);
                doctor.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                doctor.setLocationRelativeTo(null);
                doctor.setTitle("Novo Médico");
                doctor.setVisible(true);
                break;
            case "Races":
                formRace race = new formRace(this, true);
                race.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                race.setLocationRelativeTo(null);
                race.setTitle("ver Raças");
                race.setVisible(true);
                break;
        }
    }

    public static void Form() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    private JPanel jPanel1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
}

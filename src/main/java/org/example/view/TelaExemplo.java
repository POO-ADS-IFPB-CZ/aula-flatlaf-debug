package org.example.view;

import javax.swing.*;

public class TelaExemplo extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JComboBox comboBox1;
    private JButton buttonOK;

    public TelaExemplo() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }
}

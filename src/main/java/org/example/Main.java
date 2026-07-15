package org.example;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import org.example.view.TelaExemplo;

import javax.swing.*;

public class Main {
    static void main() {

        try{
            UIManager.setLookAndFeel(new FlatMacLightLaf());

            TelaExemplo telaExemplo = new TelaExemplo();
            telaExemplo.pack();
            telaExemplo.setVisible(true);
            System.exit(0);

        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

    }
}

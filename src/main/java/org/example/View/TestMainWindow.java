package org.example.View;

import javax.swing.*;

public class TestMainWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}

package org.example.View;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeView extends JFrame {

    public TreeView() {
        setTitle("Tree View");
        JTree jt = new JTree(createTreeNode());
        Container contentPane = getContentPane();
        contentPane.add(new JScrollPane(jt));
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private DefaultMutableTreeNode createTreeNode() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Painting");
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Impressionism");
        root.add(style);
        DefaultMutableTreeNode artist = new DefaultMutableTreeNode("Caravaggio");

        style.add(artist);
        setSize(300, 200);
        setVisible(true);
        artist = new DefaultMutableTreeNode("Degas");
        style.add(artist);
        artist = new DefaultMutableTreeNode("Monet");
        style.add(artist);
        style = new DefaultMutableTreeNode("Expressionism");
        root.add(style);
        artist = new DefaultMutableTreeNode("Henry Moore");
        style.add(artist);
        artist = new DefaultMutableTreeNode("Salvador Dali");
        style.add(artist);
        return root;
    }
}

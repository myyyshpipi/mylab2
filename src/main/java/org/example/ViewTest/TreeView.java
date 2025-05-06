package org.example.ViewTest;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeView extends JFrame {

    public TreeView() {
        setTitle("Tree View");
        JTree jt = new JTree(createTreeNode());
        Container contentPane = getContentPane();
        contentPane.add(new JScrollPane(jt));
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private DefaultMutableTreeNode createTreeNode() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Mordor Army");

        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Mordor Race");
        root.add(node1);
        DefaultMutableTreeNode orc1 = new DefaultMutableTreeNode("Orc11");
        node1.add(orc1);
        orc1 = new DefaultMutableTreeNode("Orc12");
        node1.add(orc1);
        orc1 = new DefaultMutableTreeNode("Orc13");
        node1.add(orc1);

        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Dolguldur Race");
        root.add(node2);
        DefaultMutableTreeNode orc2 = new DefaultMutableTreeNode("Orc21");
        node2.add(orc2);
        orc2 = new DefaultMutableTreeNode("Orc22");
        node2.add(orc2);
        orc2 = new DefaultMutableTreeNode("Orc23");
        node2.add(orc2);

        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("MistyMounts Race");
        root.add(node3);
        DefaultMutableTreeNode orc3 = new DefaultMutableTreeNode("Orc31");
        node3.add(orc3);
        orc3 = new DefaultMutableTreeNode("Orc32");
        node3.add(orc3);
        orc3 = new DefaultMutableTreeNode("Orc33");
        node3.add(orc3);

        setSize(600, 400);
        setVisible(true);
        return root;
    }
}

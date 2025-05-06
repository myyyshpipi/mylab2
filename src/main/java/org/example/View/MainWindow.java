package org.example.View;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private JTree characterTree;
    private DefaultTreeModel treeModel;
    private JProgressBar levelProgress, strengthProgress, agilityProgress;
    private JComboBox<String> raceComboBox;
    private JRadioButton humanRadio, elfRadio, dwarfRadio;
    private int characterCounter = 1;

    public MainWindow() {
        super("Character Creator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        initUI();
    }

    private void initUI() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // Left panel with character tree
        JPanel leftPanel = new JPanel(new BorderLayout());
        treeModel = new DefaultTreeModel(new DefaultMutableTreeNode("Characters"));
        characterTree = new JTree(treeModel);
        characterTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        characterTree.addTreeSelectionListener(this::handleTreeSelection);

        leftPanel.add(new JScrollPane(characterTree), BorderLayout.CENTER);
        leftPanel.setPreferredSize(new Dimension(200, 600));

        // Right panel with progress bars
        JPanel rightPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        levelProgress = createProgressBar("Level", 20);
        strengthProgress = createProgressBar("Strength", 10);
        agilityProgress = createProgressBar("Agility", 10);

        rightPanel.add(levelProgress);
        rightPanel.add(strengthProgress);
        rightPanel.add(agilityProgress);

        // Control panel
        JPanel controlPanel = new JPanel(new GridLayout(0, 1, 5, 5));

        // Race selection
        JPanel racePanel = new JPanel(new GridLayout(0, 1));
        ButtonGroup raceGroup = new ButtonGroup();
        humanRadio = new JRadioButton("Human");
        elfRadio = new JRadioButton("Elf");
        dwarfRadio = new JRadioButton("Dwarf");

        raceGroup.add(humanRadio);
        raceGroup.add(elfRadio);
        raceGroup.add(dwarfRadio);

        racePanel.add(new JLabel("Select Race:"));
        racePanel.add(humanRadio);
        racePanel.add(elfRadio);
        racePanel.add(dwarfRadio);

        // Combo box
        raceComboBox = new JComboBox<>(new String[]{"Human", "Elf", "Dwarf"});

        // Create character button
        JButton createButton = new JButton("Create New Character");
        createButton.addActionListener(this::createCharacter);

        controlPanel.add(racePanel);
        controlPanel.add(raceComboBox);
        controlPanel.add(createButton);

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.CENTER);
        mainPanel.add(controlPanel, BorderLayout.NORTH);

        add(mainPanel);
    }

    private JProgressBar createProgressBar(String title, int max) {
        JProgressBar progressBar = new JProgressBar(0, max);
        progressBar.setStringPainted(true);
        progressBar.setBorder(BorderFactory.createTitledBorder(title));
        return progressBar;
    }

    private void createCharacter(ActionEvent e) {
        CharacterDialog dialog = new CharacterDialog(this, getSelectedRace());
        dialog.setVisible(true);

        if (dialog.isSaved()) {
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) treeModel.getRoot();
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(dialog.getCharacter());
            root.add(node);
            treeModel.reload();
        }
    }

    private String getSelectedRace() {
        if (humanRadio.isSelected()) return "Human";
        if (elfRadio.isSelected()) return "Elf";
        if (dwarfRadio.isSelected()) return "Dwarf";
        return (String) raceComboBox.getSelectedItem();
    }

    private void handleTreeSelection(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                characterTree.getLastSelectedPathComponent();

        if (node == null || node.isRoot()) return;

        Character character = (Character) node.getUserObject();
        updateProgressBars(character);
    }

    private void updateProgressBars(Character character) {
        levelProgress.setValue(character.getLevel());
        strengthProgress.setValue(character.getStrength());
        agilityProgress.setValue(character.getAgility());
    }


}


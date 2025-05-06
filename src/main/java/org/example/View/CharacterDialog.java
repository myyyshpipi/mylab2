package org.example.View;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class CharacterDialog extends JDialog {
    private Character character;
    private boolean saved = false;
    private JProgressBar levelProgress, strengthProgress, agilityProgress;

    public CharacterDialog(Frame owner, String race) {
        super(owner, "New Character", true);
        setSize(300, 200);
        initUI(race);
    }

    private void initUI(String race) {
        JPanel panel = new JPanel(new GridLayout(4, 1, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        character = generateCharacter(race);

        levelProgress = createProgressBar("Level", 20);
        strengthProgress = createProgressBar("Strength", 10);
        agilityProgress = createProgressBar("Agility", 10);

        updateProgressBars();

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            saved = true;
            dispose();
        });

        JButton regenerateButton = new JButton("Regenerate");
        regenerateButton.addActionListener(e -> {
            character = generateCharacter(character.getRace());
            updateProgressBars();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(regenerateButton);

        panel.add(levelProgress);
        panel.add(strengthProgress);
        panel.add(agilityProgress);
        panel.add(buttonPanel);

        add(panel);
    }

    private JProgressBar createProgressBar(String title, int max) {
        JProgressBar progressBar = new JProgressBar(0, max);
        progressBar.setStringPainted(true);
        progressBar.setBorder(BorderFactory.createTitledBorder(title));
        return progressBar;
    }

    private void updateProgressBars() {
        levelProgress.setValue(character.getLevel());
        strengthProgress.setValue(character.getStrength());
        agilityProgress.setValue(character.getAgility());
    }

    private Character generateCharacter(String race) {
        Random rand = new Random();
        return new Character(
                "Character " + System.currentTimeMillis(),
                race,
                rand.nextInt(20) + 1,
                rand.nextInt(10) + 1,
                rand.nextInt(10) + 1
        );
    }

    public boolean isSaved() {
        return saved;
    }

    public Character getCharacter() {
        return character;
    }
}

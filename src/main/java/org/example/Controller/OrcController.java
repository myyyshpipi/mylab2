package org.example.Controller;

import org.example.Model.OrcModel;
import org.example.Model.Orc.Orc;
import org.example.Model.Orc.OrcRace;
import org.example.Model.Orc.OrcType;
import org.example.Model.OrcFactory.OrcDirector;
import org.example.View.*;


import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrcController {
    private OrcModel model;
    private PanelAddView addView;
    private PanelTreeView treeView;
    private PanelInfoView infoView;

    public OrcController(OrcModel model, PanelAddView addView, PanelTreeView treeView, PanelInfoView infoView) {
        this.model = model;
        this.addView = addView;
        this.treeView = treeView;
        this.infoView = infoView;
        setupListeners();
    }

    private void addNewOrc() {
        String name = addView.getOrcName();
        OrcType type = addView.getOrcType();
        OrcRace race = addView.getOrcRace();

        OrcDirector orcDirector = new OrcDirector( race );
        Orc orc = null;
        switch (type) {
            case BASIC:
                orc = orcDirector.createBasicOrc( name);
                break;
            case SCOUTE:
                orc = orcDirector.createScoutOrc( name );
                break;
            case LEADER:
                orc = orcDirector.createLeaderOrc(name);
                break;
            default:
                System.out.println("Не известный тип орка");
        }
        model.addOrc(orc);
        treeView.updateTreeStructure(orc);
        addView.clearInputs();
        //System.out.println("# Add Orc : " + orc);
    }

    private void setupListeners() {

        // Слушатель кнопки добавления орка
        addView.setAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewOrc();
            }
        });

        // Слушатель выбора в дереве
        treeView.setSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                Orc selectedOrc = treeView.getSelectedOrc();
                infoView.displayCharacter(selectedOrc);
            }
        });
    }

}

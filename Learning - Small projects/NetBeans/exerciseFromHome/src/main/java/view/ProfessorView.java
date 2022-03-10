package view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.edunova.model.Professor;

public class ProfessorView extends JLabel implements ListCellRenderer<Professor> {

    
    public ProfessorView(){
        setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Professor> list, Professor value, int index, boolean isSelected, boolean cellHasFocus) {

        setText(value.getName() + " " + value.getSurname());

        if (isSelected) {
            setBackground(Color.BLUE);
            setForeground(Color.WHITE);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }

        return this;

    }

}

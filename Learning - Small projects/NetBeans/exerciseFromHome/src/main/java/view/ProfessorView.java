package view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.edunova.model.Professor;

@Deprecated(since = "PersonView")
public class ProfessorView extends JLabel implements ListCellRenderer<Professor> {

    public ProfessorView() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Professor> list, Professor value, int index, boolean isSelected, boolean cellHasFocus) {

        if (isSelected) {
            setBackground(Color.BLUE);
            setForeground(Color.WHITE);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }

        setText((value.getName() == null ? "Unknown" : value.getName()) + " "
                + (value.getSurname() == null ? "Unknown" : value.getSurname()));

        return this;

    }

}

package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.edunova.model.Student;

public class StudentView extends JLabel implements ListCellRenderer<Student> {

    private String name;
    private DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
    private int maxNameLenght = 12;

    public StudentView() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Student> list, Student value, int index, boolean isSelected, boolean cellHasFocus) {

        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        renderer.setFont(new Font("Courier new", Font.BOLD, 12));

        if (isSelected) {
            renderer.setBackground(Color.BLUE);
            renderer.setForeground(Color.WHITE);

        } else {
            renderer.setBackground(Color.WHITE);
            renderer.setForeground(Color.BLACK);
        }

        name = value.getName();
        for(int i = 0; i < maxNameLenght;i++){
            name += " ";
        }
        name = name.substring(0,maxNameLenght);
        renderer.setText(name + value.getSurname());
        
        return renderer;

    }

}

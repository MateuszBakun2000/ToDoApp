import javax.swing.*;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;




public class ButtonBtn extends JPanel{

    private JButton addTask;
    private JButton clean;
    Border emptyBorder =BorderFactory.createEmptyBorder();

    ButtonBtn()
    {
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.red);

        addTask = new JButton("Add Tasks");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clean = new JButton("clean");
        clean.setBorder(emptyBorder);
        clean.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(clean);
    }
    public JButton getNewTask()
    {
        return addTask;
    }

    public JButton getClear()
    {
        return clean;
    }
}

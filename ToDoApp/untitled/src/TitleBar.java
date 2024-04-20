import javax.swing.*;
import java.awt.*;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;

public class TitleBar extends JPanel {
    TitleBar() {
        this.setPreferredSize(new Dimension(400,80));
        JLabel titleText = new JLabel("To Do List");
        titleText.setFont(new Font("Arial", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}

import java.awt.*;

import javax.swing.JPanel;

import java.awt.Color;


class Lista extends JPanel{
    Lista()
    {
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(5);
        this.setLayout(layout);
        this.setBackground(Color.PINK);

    }

    public void UpdateNumbers()
    {
        Component[] listItems = this.getComponents();

        for (int i = 0; i < listItems.length; i++) {
            if(listItems[i] instanceof Taski)
            {
                ((Taski)listItems[i]).changeIndex(i+1);
            }
        }
    }

}

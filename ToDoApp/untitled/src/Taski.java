import javax.swing.*;
import java.awt.*;

public class Taski extends JPanel
{
    private JLabel index;
    private JTextField task;
    private JButton done;
    private boolean checked;
    Taski()
    {
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.cyan);

        this.setLayout(new BorderLayout());

        checked = false;
        index = new JLabel("");
        index.setPreferredSize(new Dimension(40,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        task = new JTextField("Zadanie");
        task.setBorder(BorderFactory.createEmptyBorder());
        task.setBackground(Color.yellow);
        this.add(task,BorderLayout.CENTER);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBackground(Color.yellow);
        this.add(index,BorderLayout.EAST);

    }
    public JButton getDone()
    {
        return done;
    }
    public void changeIndex(int num)
    {
        this.index.setText(String.valueOf(num));
        this.revalidate();
    }

    public void changeState()
    {
        this.setBackground(Color.GREEN);
        task.setBackground(Color.GREEN);
        checked = true;
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame
{
    private ButtonBtn btn;
    private TitleBar title;
    private Lista list;

    private JButton addTask;
    private JButton clean;
    AppFrame()
    {
        this.setSize(400,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title=new TitleBar();
        list= new Lista();
        btn=new ButtonBtn();
        this.add(title, BorderLayout.NORTH);
        this.add(btn,BorderLayout.SOUTH);

        this.add(list,BorderLayout.CENTER);

        addTask = btn.getNewTask();
        clean = btn.getClear();

        addListiners();

    }

    public void addListiners()
    {
        addTask.addMouseListener(new MouseAdapter() {
         @Override
            public void mousePressed(MouseEvent e)
         {
             Taski task = new Taski();
             list.add(task);
             list.UpdateNumbers();

             task.getDone().addMouseListener(new MouseAdapter() {
                 @Override
                 public void mousePressed(MouseEvent e) {
                     task.changeState();
                     revalidate();
                 }
             });
             revalidate();
         }
        });
    }
}

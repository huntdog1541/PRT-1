import javax.swing.*;
import java.awt.*;

/**
 * Created by David on 7/17/2015.
 */
public class Graphic {

    public JFrame frame;
    private TxtContent content;

    public Graphic()
    {
        frame = new JFrame();
        content = new TxtContent();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 600));
        frame.setVisible(true);
        frame.add(content.getTextArea());
        this.start();
    }

    public void start()
    {
        boolean ans = content.startPrompt();
        while(ans == false)
        {
            ans = content.startPrompt();
        }
    }


}

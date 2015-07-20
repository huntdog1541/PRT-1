import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * Created by David on 7/17/2015.
 */
public class TxtContent {

    private String prompt;
    private String command;
    private char[] storeTemp;
    private StringBuilder storeCommand;
    private JTextArea area;

    public TxtContent()
    {
        area = new JTextArea();
        storeCommand = new StringBuilder();
        MyKeyListener kyList = new MyKeyListener();
        area.addKeyListener(kyList);
        area.setFocusable(true);
        printPrompt();
    }

    public JTextArea getTextArea()
    {
        return area;
    }

    public boolean startPrompt()
    {
        boolean ans = false;
        ans = updateString();
        return ans;
    }

    public void printPrompt()
    {
        area.append("$> ");
    }

    public void entFunct()
    {
        printPrompt();
    }

    public boolean updateString()
    {
        boolean ans = false;
        Scanner in = new Scanner(System.in);
        String cmdAns = in.nextLine();
        return ans;
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent evt) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                System.out.println("Check for key codes: " + evt.getKeyCode());
                command = storeCommand.toString();
                storeCommand = new StringBuilder();
                System.out.println("The command is " + command);
                entFunct();
            }
            else
            {
                storeCommand.append(evt.getKeyChar());
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1_2;

/**
 *
 * @author trevor.scott880
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;

public class NewWindow extends JFrame
{
    public static final int WIDTH = 600; 
    public static final int HEIGHT = 400;
    
    public NewWindow(Color theColor)
    {
        super();
        setSize(WIDTH, HEIGHT);

        setTitle("Here's a Window!");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton newButton = new JButton("Click to make New Window!");
        newButton.addActionListener(new NewButtonListener( ));
        add(newButton);
    }
    
    public NewWindow( )
    {
        this(Color.PINK);
    }
}

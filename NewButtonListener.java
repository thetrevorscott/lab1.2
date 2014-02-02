/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1_2;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author trevor.scott880
 */

public class NewButtonListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) 
    {
        NewWindow w = new NewWindow( );
        w.setVisible(true);
    }
}

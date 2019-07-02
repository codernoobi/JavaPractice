/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import javax.swing.*;
public class SwingComponents {
    public static void main(String args[]){
        JFrame f=new JFrame();
        f.setSize(400,400);
        f.setLayout(null);
        JTextField tf=new JTextField("Text Field");
        tf.setBounds(150,50,100,20);
        f.add(tf);
        JCheckBox c1=new JCheckBox("CheckBox1");
        c1.setBounds(50,100,100,20);
        f.add(c1);
        JCheckBox c2=new JCheckBox("CheckBox2");
        c2.setBounds(150,100,100,20);
        f.add(c2);
        JRadioButton r1=new JRadioButton("RadinButton1");
        r1.setBounds(50,150,120,20);
        f.add(r1);
        JRadioButton r2=new JRadioButton("RadinButton2");
        r2.setBounds(170,150,120,20);
        f.add(r2);
        ButtonGroup br=new ButtonGroup();
        br.add(r1);
        br.add(r2);
        JTextArea ta=new JTextArea("Text Area");
        ta.setBounds(150,200,100,50);
        f.add(ta);
        JSlider s=new JSlider(0,100,50);        
        s.setBounds(50,300,200,20);
        f.add(s);
        f.setVisible(true);
        
    }
}

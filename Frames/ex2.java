import javax.swing.*;
import java.awt.event.ActionListener;

public class ex2 extends JFrame{
    ex2(){
        JTextField t = new JTextField();
        t.setBounds(50,50,50,50);
        JButton b =new JButton("click");
        b.setBounds(100,100,30,30);
        JRadioButton r = new JRadioButton();
        r.setBounds(50,20,30,30);
        add(r);
        add(b);
       add(t);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ex2 e = new ex2();
    }
}

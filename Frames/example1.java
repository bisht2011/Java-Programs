
import java.awt.*;
import java.awt.event.*;

public class example1 extends Frame implements ActionListener {

    example1(){
        TextField tf = new TextField();
        tf.setBounds(50,50,100,50);
        Button b1 = new Button("click");
        b1.setBounds(50,30,50,20);
        add(tf);
        add(b1);
        setSize(400,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               dispose();
            }
        });
        b1.addActionListener(e -> tf.setText("hello"));
    }


    public static void main(String[] args) {
        example1 ex = new example1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        tf.set
//    }
}

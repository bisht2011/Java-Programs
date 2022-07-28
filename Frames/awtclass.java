
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class awtclass extends Frame implements ActionListener {

     awtclass() {
         Label l = new Label("EMP ID");
         l.setBounds(60,70,30,20);
         TextField tf1 = new TextField();
         tf1.setBounds(50, 100, 50, 30);
//         TextField tf2 = new TextField();
//         tf1.setBounds(75,100,20,20);
//         TextField tf3 = new TextField();
//         tf1.setBounds(100,100,20,20);
         Button b1 = new Button("click");
         b1.setBounds(120, 100, 50, 50);
//         Button b2 = new Button();
//         b2.setBounds(150,100,20,20);
         this.setVisible(true);
         this.setSize(300,300);
         this.setTitle("example");
         add(tf1);
        add(b1);
         add(l);
         addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 dispose();
             }
         });
         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 tf1.setText("hello");
             }
         });


     }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        awtclass f = new awtclass();
    }
}

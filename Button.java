import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Button extends JFrame implements ActionListener {
//public class Button extends JFrame {
    JButton button;
    JLabel label;
        Button(){
            ImageIcon icon = new ImageIcon("down.jpg");

            label = new JLabel();
            label.setIcon(icon);
            label.setBounds(50,50,120,120);
            label.setVisible(false);





            button = new JButton();
            button.setBounds(100,100,100,50);
//            button.addActionListener(e-> System.out.println("Poo"));
            button.addActionListener(this);
            button.setText("Click !");
            button.setFocusable(false);
            button.setBorder(BorderFactory.createEtchedBorder());

//            button.setEnabled(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
            this.setLayout(null);
            this.setSize(420,420);  // sets dimensions
            this.setVisible(true);  // make this visible
            this.add(button);
            this.add(label);

    }

//    short cut by lambda  (e->)
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
//            System.out.println("poo");
//    button.setEnabled(false);  // after click on button. button get disabled
            label.setVisible(true);
        }
    }
}

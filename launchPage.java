import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class launchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myBtn = new JButton("New Window");

    launchPage(){

        myBtn.setBounds(100,160,200,40);
        myBtn.setFocusable((false));
        myBtn.addActionListener(this);

        frame.add(myBtn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==myBtn){
            frame.dispose();
            newWindow myWindow = new newWindow();
        }
    }
}

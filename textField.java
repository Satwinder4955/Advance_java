import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textField extends JFrame implements ActionListener {

    JButton btn;
    JTextField field;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon yIcon;
    JRadioButton pizza;
    JRadioButton burger;
    JRadioButton coffee;

            textField() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        // btn
        btn =  new JButton("Submit");
        btn.setFocusable(false);
        btn.addActionListener(this);

            // Images
        xIcon = new ImageIcon("wrong.png");
        yIcon = new ImageIcon("right.png");


        //-TEXT FIELD-
        field = new JTextField();
        field.setPreferredSize(new Dimension(240, 40));


        //-CHECK BOX-
        checkBox = new JCheckBox();
        checkBox.setText("I AM NOT A ROBOT");
        checkBox.setFocusable(false); // get rid of focused border
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(yIcon);

        //-JRadioButton-
        pizza = new JRadioButton("pizza");
        burger = new JRadioButton("burger");
        coffee = new JRadioButton("coffee");

        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(burger);
        group.add(coffee);

        pizza.addActionListener(this);
        burger.addActionListener(this);
        coffee.addActionListener(this);


        this.add(pizza);
        this.add(burger);
        this.add(coffee);
        this.add(checkBox);
        this.add(btn);
        this.add(checkBox);



//        this.add(field);
        this.pack();
        this.setVisible(true);

    }

//    @Override
                    //-TEXT FIELD-
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == btn) {
//            System.out.println("Welcome " + field.getText());
//            field.setEditable(false);  // it makes user to do not make changes in the txt
//        }
//
//    }

    //-CHECK BOX-
//@Override
//public void actionPerformed(ActionEvent e) {
//
//    if (e.getSource() == btn) {
//        System.out.println(checkBox.isSelected());
//        }
//}
//}


@Override
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == pizza) {
        System.out.println("You Got Your Pizza");
    } else if (e.getSource()==burger) {
        System.out.println("You Got Burger");
    } else if (e.getSource()==coffee) {
        System.out.println("You Got Coffee");
    }else{
        System.out.println("Please order somethig");
    }
}
}



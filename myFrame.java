import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class myFrame extends JFrame implements ActionListener {


//    ----------------------------------------- Image ---------------------------------------------
//    myFrame(){
//        this.setTitle("Anything");  // sets title
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//        this.setSize(420,420);  // sets dimensions
//        this.setResizable(false);  // prevent this from being resize
//        this.setVisible(true);  // make this visible
//
//        ImageIcon image = new ImageIcon("images.png");  // this will create image icon
//        this.setIconImage(image.getImage());  // this will change icon of this
//
////        this.getContentPane().setBackground(Color.blue); // this will change the background
//        this.getContentPane().setBackground(new Color(215,200,215)); // this will change the background
//    }


//    ------------------------------------------------Combo box ----------------------------------------------
//    JComboBox combo;
//    myFrame(){
//        this.setTitle("Anything");  // sets title
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//
//        this.setLayout(new FlowLayout());
//        String[] Animals = {
//                "dog","cat","Bird"
//        };


//        combo = new JComboBox(Animals);
//        combo.addActionListener(this);
//        combo.setEditable(true); // By this we can write in the box
//        combo.addItem("horse");
//        combo.insertItemAt("caol" , 0);  //adding item at index
//        combo.setSelectedIndex(0);  // By default item get selected
//        combo.removeItem("coal");  // remove the item
//
//        this.add(combo);
//        this.pack();
//        this.setVisible(true);
//    }
//
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//            if(e.getSource()==combo){
//    System.out.println(combo.getSelectedItem());
//
//               }
//    }
//}

//  -------------------------------------------------Menu Bar ----------------------------------------------

//    JMenuBar menu;
//    JMenu fileMenu;
//    JMenu editMenu;
//    JMenu helpMenu;
//    JMenuItem loadItem;
//    JMenuItem saveItem;
//    JMenuItem exitItem;
//
//
//
//            myFrame() {
//
//           this.setTitle("Anything");  // sets title
//           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//           this.setSize(420, 420);  // sets dimensions
//
//           menu = new JMenuBar();
//
//           fileMenu = new JMenu("File");
//           editMenu = new JMenu("Edit");
//           helpMenu = new JMenu("Help");
//
//           loadItem = new JMenuItem("load");
//           saveItem = new JMenuItem("save");
//           exitItem = new JMenuItem("exit");
//
//           loadItem.addActionListener(this);
//           saveItem.addActionListener(this);
//           exitItem.addActionListener(this);
//
//           loadItem.setMnemonic(KeyEvent.VK_L);  // L for load a file
//           saveItem.setMnemonic(KeyEvent.VK_S);
//           exitItem.setMnemonic(KeyEvent.VK_E);
//
//           fileMenu.add(loadItem);
//           fileMenu.add(saveItem);
//           fileMenu.add(exitItem);
//
//
//
//           menu.add(fileMenu);
//           menu.add(editMenu);
//           menu.add(helpMenu);
//
//
//           this.setJMenuBar(menu);
//           this.setVisible(true);  // make this visible
//
//
//       }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//           if(e.getSource()==loadItem){
//               System.out.println("Beep Loading a file");
//           }if(e.getSource()==saveItem){
//            System.out.println("saving a file");
//        }if(e.getSource()==exitItem){
//            System.exit(0);
//        }
//
//    }
//}

// ----------------------------------------------Choose a file---------------------------------------------
JButton button;
        myFrame(){
        this.setTitle("Anything");  // sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setSize(420, 420);  // sets dimensions

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);

        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null); // select file to open
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }

    }
}

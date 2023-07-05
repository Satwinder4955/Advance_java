//--------------------------------------------- FILE ---------------------------------------

//import java.io.File;
//
//public class Advance {
//    public static void main(String[] args) {
//        // File -> An abstract representation of file and directory path names
//
//        File file = new File("secret.txt");
//
//        if(file.exists()){
//            System.out.println("That file exists! :O!");
//            System.out.println(file.getPath());
//            System.out.println(file.getAbsolutePath());
//
//        }else{
//            System.out.println("That file won't exists :(");
//        }
//
//    }
//}

//-----------------------------------------FILE WRITER-------------------------------------------------//

//import java.io.FileWriter;
//
//public class Advance {
//    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("peon.txt");
//            writer.write("Roses are Red \nViolets are blue");
//            writer.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}


//---------------------------------------FILE READER-----------------------------------------------------//

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//public class Advance {
//    public static void main(String[] args) {
//        // FileReader -> read the contents of a file as a stream of characters. One by one read() return an int
//        // value which contains the byte value when read() return -1, there is no more data to be read
//
//        try  {
//            FileReader reader = new FileReader("art.txt");
//            int data = reader.read();
//            while(data != -1){
//                System.out.println((char)data );
//                data = reader.read();
//            }
//            reader.close();
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//    }
//}


//--------------------------------------------AUDIO------------------------------------------------------------//

//import javax.sound.sampled.*;
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//import java.util.zip.Deflater;
//
//public class Advance {
//    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
//
//        Scanner scanner = new Scanner(System.in);
//        File file = new File("Lawrence.wav");
//        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioStream);
//
//        String response =  "";
//
//        while(!response.equals("Q")){
//            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
//            System.out.println("Enter your choice: ");
//
//            response = scanner.next();
//            response = response.toUpperCase();
//
//            switch (response){
//                case  "P":
//                    clip.start();
//                    break;
//                case  "S":
//                    clip.stop();
//                    break;
//                case  "R":
//                    clip.setMicrosecondPosition(0);
//                    break;
//                case  "Q":
//                    clip.close();
//                    break;
//                default:
//                    System.out.println("Not A Valid command");
//            }
//        }
//        System.out.println("Thanks");
//
//    }
//
//}

//----------------------------------------------JFRAMES----------------------------------------------------//

//import javax.swing.*;
//import java.awt.*;

//public class Advance {
//    public static void main(String[] args) {
//        // JFrame = a GUI window to add components to
//
//        JFrame frame = new JFrame();  // create a frame
//        frame.setTitle("Anything");  // sets title
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//        frame.setSize(420,420);  // sets dimensions
//        frame.setResizable(false);  // prevent frame from being resize
//        frame.setVisible(true);  // make frame visible
//
//        ImageIcon image = new ImageIcon("images.png");  // this will create image icon
//        frame.setIconImage(image.getImage());  // this will change icon of frame
//
////        frame.getContentPane().setBackground(Color.blue); // this will change the background
//        frame.getContentPane().setBackground(new Color(215,200,215)); // this will change the background


        //////   myFrame myfram = new myFrame();

//    }
//}

//------------------------------------------JLABELS------------------------------------------------- //
//import javax.swing.*;
//import javax.swing.border.Border;
//import java.awt.*;
//
//import static java.awt.Color.getColor;
//import static java.awt.Color.green;
//
//public class Advance {
//    public static void main(String[] args) {
//        // JLabel -> a GUI display area for a string of text, an image, or both
//
//        ImageIcon image = new ImageIcon("download.jpg");
//        Border border = BorderFactory.createLineBorder(Color.green,10);  // set the border
//
//
//        JLabel label = new JLabel(); // create a label
//        label.setText("Bro, You can code"); // Set text of label
//        label.setIcon(image);
//        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER,RIGHT of imageIcon
//        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,BOTTOM,CENTER of imageIcon
//        label.setForeground(Color.green); // set color of txt
//        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font txt
//        label.setIconTextGap(20); // set gap between txt and image
//        label.setBackground(Color.black);  // set background color
//        label.setOpaque(true);  // display background color
//        label.setBorder(border); // display border
//        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+txt within label
//        label.setHorizontalAlignment((JLabel.CENTER)); // set Horizontal position of icon+txt within label
//        label.setBounds(100,120,250,250); // set x,y position within frame as well as dimensions
//
//
//
//
//
//        JFrame frame = new JFrame();
////        frame.setSize(420,420);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
////        frame.setLayout(null);
//        frame.add(label);
//        frame.pack(); // should use after adding all components
//
//    }
//}

//-------------------------------------------------------------------------------------------------------//
// --------------------------------------------------- PANELS ---------------------------------------------//
//import javax.swing.*;
//import java.awt.*;
//
//public class Advance {
//    public static void main(String[] args) {
//        // JPanel -> a GUI component that function as a container to hold other components
//
//        JPanel redpanel = new JPanel();
//        redpanel.setBackground(Color.red);
//        redpanel.setBounds(0,0,210,210);
//        redpanel.setLayout(new BorderLayout());
//
//
//        JPanel bluepanel = new JPanel();
//        bluepanel.setBackground(Color.blue);
//        bluepanel.setBounds(250,0,210,210);
//
//        JPanel greenpanel = new JPanel();
//        greenpanel.setBackground(Color.green);
//        greenpanel.setBounds(0,210,420,320);
//        greenpanel.setLayout(new BorderLayout());
//
//
//        JLabel label = new JLabel("HEY");
////        label.setVerticalAlignment(JLabel.TOP);
////        label.setHorizontalAlignment(JLabel.RIGHT);
//        label.setBounds(100,100,75,75);
//
//
//
//        JFrame frame = new JFrame();
//        frame.setSize(420,420);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setLayout(null);
//        frame.add(redpanel);
//        greenpanel.add(label); // adding txt to panel
//        frame.add(bluepanel);
//        frame.add(greenpanel);
//    }
//}


// --------------------------------------------BUTTONS---------------------------------------------------//
//public  class Advance {
//    public static void main(String[] args) {
//        // JButton -> a button that performs an action when clicked on
//
//        new Button();
//
//
//
//    }
//}

//import javax.swing.*;
//import java.awt.*;

//-----------------------------------------BORDER LAYOUT----------------------------------------------//
//public class Advance {
//    public static void main(String[] args) {
//        // Layout manager -> Defines the natural layout for components within a container
//        // 3 common  managers
//        // BorderLayout -> A BorderLayout places components in five areas: NORTH,SOUTH,EAST,WEST, CENTER.
////        All extra space is placed in the center ares
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(new BorderLayout(10,10));
//        frame.setVisible(true);
//
//        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel();
//
//        panel1.setBackground(Color.red);
//        panel2.setBackground(Color.black);
//        panel3.setBackground(Color.green);
//        panel4.setBackground(Color.orange);
//        panel5.setBackground(Color.blue);
//
//        panel1.setPreferredSize(new Dimension(40,80));
//        panel2.setPreferredSize(new Dimension(40,80));
//        panel3.setPreferredSize(new Dimension(40,80));
//        panel4.setPreferredSize(new Dimension(40,80));
//        panel5.setPreferredSize(new Dimension(40,80));
////        ---------------------------------------------- Sub Panel -----------------------------------------
//
//        JPanel panel6 = new JPanel();
//        JPanel panel7 = new JPanel();
//        JPanel panel8 = new JPanel();
//        JPanel panel9 = new JPanel();
//        JPanel panel10 = new JPanel();
//
//        panel6.setBackground(Color.gray);
//        panel7.setBackground(Color.yellow);
//        panel8.setBackground(Color.pink);
//        panel9.setBackground(Color.white);
//        panel10.setBackground(Color.darkGray);
//
//        panel5.setLayout(new BorderLayout());
//
//        panel6.setPreferredSize(new Dimension(50,20));
//        panel7.setPreferredSize(new Dimension(50,20));
//        panel8.setPreferredSize(new Dimension(50,20));
//        panel9.setPreferredSize(new Dimension(50,20));
//        panel10.setPreferredSize(new Dimension(50,20));
//
//        panel5.add(panel6,BorderLayout.EAST);
//        panel5.add(panel7,BorderLayout.WEST);
//        panel5.add(panel8,BorderLayout.NORTH);
//        panel5.add(panel9,BorderLayout.SOUTH);
////        panel5.add(panel10,BorderLayout.CENTER);
//
////        ---------------------------------------------- Sub Panel -----------------------------------------
//        frame.add(panel1,BorderLayout.NORTH);
//        frame.add(panel2,BorderLayout.SOUTH);
//        frame.add(panel3,BorderLayout.EAST);
//        frame.add(panel4,BorderLayout.WEST);
//        frame.add(panel5,BorderLayout.CENTER);
//
//
//    }
//}

//--------------------------------------  FLOW LAYOUT  ------------------------------------------------//
//public class Advance {
//    public static void main(String[] args) {
//        // Layout Manager -> Defines the natural layout for components within a container
//        // FlowLayout -> places components in a row, sized at their preferred size. If the Horizontal space
//        //               in the container is too small, the flowLayout class uses the next available row.
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
////        frame.setVisible(true);
//
//        JPanel panel = new JPanel();
//        panel.setPreferredSize(new Dimension(250,250));
//        panel.setBackground(Color.GRAY);
//        panel.setLayout(new FlowLayout());
//
//
//        panel.add(new JButton("1"));
//        panel.add(new JButton("2"));
//        panel.add(new JButton("3"));
//        panel.add(new JButton("4"));
//        panel.add(new JButton("5"));
//
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//}

//---------------------------------------------------GRID LAYOUT---------------------------------

//public class Advance {
//    public static void main(String[] args) {
//        // Layout Manager -> Defines the natural layout for components within a container
//        // Grid Layout -> places components in a grid of cells. Each component takes all the available
//        //                spaces within its cell, and each cell is the same size
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(new GridLayout(3,2,10,10));
//
//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//
//        frame.setVisible(true);
//
//    }
//}

//import javax.swing.*;
//import java.awt.*;

//-----------------------------------------------------LAYERED PANE---------------------------------------
//public class Advance {
//    public static void main(String[] args) {
//        // JLayeredPane -> Swing container that provides a third dimension for positioning components
//        //                 ex. depth, Z-index
//
//        JLabel label = new JLabel();
//        label.setOpaque(true);
//        label.setBackground(Color.BLUE);
//        label.setBounds(50,50,200,200);
//
//        JLabel label1 = new JLabel();
//        label1.setOpaque(true);
//        label1.setBackground(Color.DARK_GRAY);
//        label1.setBounds(100,100,200,200);
//
//        JLabel label2 = new JLabel();
//        label2.setOpaque(true);
//        label2.setBackground(Color.MAGENTA);
//        label2.setBounds(150,150,200,200);
//
//
//        JLayeredPane layer = new JLayeredPane();
//        layer.setBounds(0,0,500,500);
//
//        layer.add(label, Integer.valueOf(2));
//        layer.add(label1, Integer.valueOf(3));
//        layer.add(label2, Integer.valueOf(1));
//
//
//        JFrame frame = new JFrame();
//        frame.add(layer);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}

//-----------------------------------------------------LAUNCH PAGE-------------------------------------
//public class Advance {
//    public static void main(String[] args) {
//
//        launchPage page = new launchPage();
//
//    }
//}

//----------------------------------------------------DIALOG BOX----------------------------------------

//public class Advance {
//    public static void main(String[] args) {
//        // JOptionPane -> pop up a standard dialog box that prompts users for a value or informs them of something.
//
////        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
////        JOptionPane.showMessageDialog(null,"What are you doing here ?","title",JOptionPane.QUESTION_MESSAGE);
////        JOptionPane.showMessageDialog(null,"To get More information go back .","title",JOptionPane.INFORMATION_MESSAGE);
////        JOptionPane.showMessageDialog(null,"Stay away from this site !","title",JOptionPane.WARNING_MESSAGE);
////        JOptionPane.showMessageDialog(null,"This Site Is Not Working","title",JOptionPane.ERROR_MESSAGE);
//
////          JOptionPane.showConfirmDialog(null,"bro !!!", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//
//        String response[] = {"No, You are Student", "Thank You","Take Care"};
//        ImageIcon icon = new ImageIcon("images.png");
//          String name = JOptionPane.showInputDialog(null,"What is your name: ", "Name");
//          System.out.println("Hello " + name);
//          JOptionPane.showOptionDialog(null,
//                  "you are ",
//                  "Mesage",
//                  JOptionPane.YES_NO_CANCEL_OPTION,
//                  JOptionPane.INFORMATION_MESSAGE,
//                  icon,
//                  response,
//                  0);
//
//
//    }
//}

//----------------------------------------------------TEXT FIELD----------------------------------------

//public class Advance {
//    public static void main(String[] args) {
//
//        // JTextField -> A GUI text box component that can be used to add, set, or get text
//
//        textField field = new textField();
//
//    }
//}


//-----------------------------------------------------CHECK BOX---------------------------------------------------
//public class Advance {
//    public static void main(String[] args) {
//        // JCheckBox -> A GUI component that can be selected or deselected
//
//        textField field = new textField();
//
//    }
//}

//-----------------------------------------------------RADIO BUTTON-------------------------------------------

//public class Advance {
//    public static void main(String[] args) {
//        // JRadioButton -> One or more buttons in a grouping in which only 1 may be selected per group
//
//        new textField();
//
//    }
//}

//-----------------------------------------------------COMBO BOX--------------------------------------------------

//public class Advance {
//    public static void main(String[] args) {
//
//        // JComboBox -> A component that combines a button or editable field and a drop-down list
//
//
//        new myFrame();
//
//    }
//}

//------------------------------------------- JSliders ----------------------------------------------------------

//public class Advance {
//    public static void main(String[] args) {
//
//        // JSlider -> GUI component that lets enter a value by using an adjustable sliding knob on a track
//
//        SliderDemo slider = new SliderDemo();
//
//
//    }
//}

//------------------------------------------- Progress Bar -------------------------------------------

//public class Advance {
//    public static void main(String[] args) {
//
//        // Progress bar -> Visual aid to let the user know that an operation is processing.
//
//        ProgressBar bar = new ProgressBar();
//
//    }
//}

import javax.swing.*;
import java.awt.*;

//----------------------------------------------Menu Bar----------------------------------------------
//public class Advance {
//    public static void main(String[] args) {
//
//        // Menu bar
//
//        new myFrame();
//
//    }
//}

//------------------------------------------------Select a File------------------------------------------------
public class Advance {
    public static void main(String[] args) {

        // JFileChooser -> A GUI mechanism that let's a user choose a file (helpful for opening or saving files)

        new myFrame();

    }
}















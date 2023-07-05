import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slide;

    SliderDemo(){


        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slide = new JSlider(0,100,10);

        slide.setPreferredSize(new Dimension(400,200));
        slide.setPaintTicks(true);  //add lines
        slide.setMinorTickSpacing(5);  // small space

        slide.setPaintTrack(true);  // add big lines
        slide.setMajorTickSpacing(20); // large space

        slide.setPaintLabels(true);  // label the numbers choose major space to add no.

        slide.setFont(new Font("MV Boli", Font.PLAIN,15));
        slide.setOrientation(SwingConstants.VERTICAL);  // by default it is horizontal

        label.setFont(new Font("MV Boli", Font.PLAIN,25));
        label.setText("C =  " + slide.getValue());

        slide.addChangeListener(this);

        panel.add(slide);
        panel.add(label);
        frame.add(panel);
        frame.setSize(520,520);

        frame.setVisible(true);

    }


    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("C =  " + slide.getValue());
    }
}

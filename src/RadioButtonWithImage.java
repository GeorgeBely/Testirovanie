import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class RadioButtonWithImage extends JToggleButton {

    private JRadioButton radio;
    private JLabel image;

    public RadioButtonWithImage(Icon icon) {
        image = new  JLabel(icon);
        radio = new JRadioButton();
        add(radio);
        add(image);
    }

    public void addToButtonGroup(ButtonGroup group) {
        group.add(radio);
    }

    public void addActionListener(ActionListener listener) {
        if (radio != null)
        radio.addActionListener(listener);
    }

    public void addChangeListener(ChangeListener listener) {
        if (radio != null)
        radio.addChangeListener(listener);
    }

    public Icon getImage() {
        return image.getIcon();
    }

    public void setImage(Icon icon) {
        image.setIcon(icon);
    }

    public JRadioButton getRadio() {
        return radio;
    }
}
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class RadioButtonWithImage extends JToggleButton {

    private JRadioButton radio;
    private JLabel image;

    public RadioButtonWithImage(Icon icon) {
        image = new JLabel(icon);
        add(getRadio());
        add(image);
    }

    public void addToButtonGroup(ButtonGroup group) {
        group.add(getRadio());
    }

    public void addActionListener(ActionListener listener) {
        getRadio().addActionListener(listener);
    }

    public void addChangeListener(ChangeListener listener) {
        getRadio().addChangeListener(listener);
    }

    public Icon getImage() {
        return image.getIcon();
    }

    public void setImage(Icon icon) {
        image.setIcon(icon);
    }

    public JRadioButton getRadio() {
        if (radio == null)
            radio = new JRadioButton();
        return radio;
    }
}
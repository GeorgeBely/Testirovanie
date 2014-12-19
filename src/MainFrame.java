import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class MainFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 400;

    public MainFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width / 2 - WIDTH / 2, screenSize.height / 2 - HEIGHT / 2);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {{
            setLayout(null);
        }};
        add(panel);


        JTextPane textPane = new JTextPane() {{
            setSize(500, 100);
            setText("Какой из приведённых ниже вариантов создаёт переменную типа число со значением 5");
            setFont(new Font("TimesRoman", Font.ITALIC, 15));
        }};
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        panel.add(textPane);


    }
}

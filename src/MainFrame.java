import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 700;

    private List<Question> questions;
    private Question currentQuestion;
    private List<Answer> selectedAnswer;
    private int index = 0;
    private boolean finish = false;

    private JButton buttonBack;
    private ButtonGroup radioGroup = new ButtonGroup();
    private List<JToggleButton> toggleButtons = new ArrayList<>();
    private JPanel panelContainer;
    private JTextPane textPane;
    private JButton buttonNext;

    private Map<Question, List<Answer>> answers = new HashMap<>();

    public MainFrame(List<Question> questions) {
        this.questions = questions;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width / 2 - WIDTH / 2, screenSize.height / 2 - HEIGHT / 2);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {{
            setLayout(null);
            setBackground(Color.white);
        }};
        add(panel);


        textPane = new JTextPane() {{
            setSize(490, 150);
            setLocation(5, 0);
            setFont(new Font("TimesRoman", Font.ITALIC, 15));
        }};
        panel.add(textPane);

        buttonBack = new JButton("Назад") {{
            setLocation(55, 595);
            setSize(120, 30);
            setVisible(false);
        }};
        buttonBack.addActionListener(e -> back());
        panel.add(buttonBack);

        buttonNext = new JButton("Далее") {{
            setLocation(345, 595);
            setSize(120, 30);
        }};
        buttonNext.addActionListener(e -> next());
        panel.add(buttonNext);

        final Container container = new Container() {{
            setLocation(5, 155);
            setSize(490, 400);
        }};
        panel.add(container);

        panelContainer = new JPanel() {{
            setLocation(0, 0);
            setSize(container.getSize());
            setBackground(Color.white);
        }};
        container.add(panelContainer);

        selectQuestion();
    }

    public void back() {
        if (index > 0) {
            if (index == questions.size() - 1)
                buttonNext.setText("Далее");

            if (selectedAnswer != null && !finish)
                answers.put(currentQuestion, selectedAnswer);

            index--;
            if (index == 0)
                buttonBack.setVisible(false);
            selectQuestion();
        }
    }

    public void next() {
        if (selectedAnswer != null && !finish)
            answers.put(currentQuestion, selectedAnswer);

        if (index == questions.size() - 1) {

            JFrame frame = new JFrame() {{
                setTitle("Ты уверен?");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                setLocation(screenSize.width / 2 - 50, screenSize.height / 2 - 50);
                setSize(280, 150);
                setResizable(false);
                setLayout(null);
            }};
            frame.setVisible(true);

            JLabel result = new JLabel("Ты уверен?") {{
                setSize(280, 20);
                setLocation(0, 20);
                setFont(new Font("TimesRoman", Font.BOLD, 15));
            }};
            frame.add(result);

            JButton button = new JButton("Да") {{
                setSize(100, 30);
                setLocation(20, 80);
            }};
            button.addActionListener(e -> {finish(); frame.dispose();});
            frame.add(button);

            JButton buttonNot = new JButton("Нет") {{
                setSize(100, 30);
                setLocation(150, 80);
            }};
            buttonNot.addActionListener(e -> frame.dispose());
            frame.add(buttonNot);

            return;
        }

        index++;
        buttonBack.setVisible(true);
        selectQuestion();

        if (index == questions.size() - 1)
            buttonNext.setText("Завершить");

    }

    private void selectQuestion() {
        currentQuestion = questions.get(index);
        selectedAnswer = answers.get(currentQuestion);
        if (toggleButtons != null) {
            for (JToggleButton toggleButton : toggleButtons) {
                radioGroup.remove(toggleButton);
                panelContainer.remove(toggleButton);
            }
        }

        for (Answer answer : currentQuestion.getAnswers()) {
            JToggleButton answerButton;
            if (answer.getValue() instanceof Icon) {
                panelContainer.setLayout(new FlowLayout());
            } else {
                panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
            }
            if ("CheckBox".equals(currentQuestion.getType())) {
                answerButton = new JCheckBox((String) answer.getValue());
                answerButton.addActionListener(e -> {
                    if (!finish) {
                        if (selectedAnswer == null)
                            selectedAnswer = new ArrayList<>();
                        if (selectedAnswer.contains(answer))
                            selectedAnswer.remove(answer);
                        else
                            selectedAnswer.add(answer);
                    }
                });
            } else {
                if (answer.getValue() instanceof Icon) {
                    answerButton = new RadioButtonWithImage((Icon) answer.getValue());
                    ((RadioButtonWithImage) answerButton).addToButtonGroup(radioGroup);
                } else {
                    answerButton = new JRadioButton((String) answer.getValue());
                }
                answerButton.addActionListener(e -> {
                    if (!finish) {
                        selectedAnswer = new ArrayList<>();
                        selectedAnswer.add(answer);
                    }
                });
                radioGroup.add(answerButton);
            }
            toggleButtons.add(answerButton);
            panelContainer.add(answerButton);

            if (selectedAnswer != null && selectedAnswer.contains(answer)) {
                if (answerButton instanceof RadioButtonWithImage)
                    ((RadioButtonWithImage) answerButton).getRadio().setSelected(true);
                else
                    answerButton.setSelected(true);
                if (finish) {
                    if (currentQuestion.getRightAnswer().contains(answer))
                        answerButton.setBackground(Color.GREEN);
                    else
                        answerButton.setBackground(Color.RED);
                }
            }
        }
        textPane.setText(currentQuestion.getName());
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        if (currentQuestion.isLeftTitle())
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_LEFT);
        else
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        panelContainer.setVisible(false);
        panelContainer.setVisible(true);
    }

    private void finish() {
        finish = true;

        Double rightCount = 0d;
        for (Map.Entry<Question, List<Answer>> answerEntry : answers.entrySet()) {
            int questionRightAnswer = 0;
            for (Answer answer : answerEntry.getValue()) {
                if (answerEntry.getKey().getRightAnswer().contains(answer))
                    questionRightAnswer++;
                else
                    questionRightAnswer--;
            }
            if (questionRightAnswer > 0) {
                rightCount += 1d / answerEntry.getKey().getRightAnswer().size() * questionRightAnswer;
            }
        }

        JFrame frame = new JFrame() {{
            setTitle("Результат");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(screenSize.width / 2 - 50, screenSize.height / 2 - 50);
            setSize(280, 150);
            setResizable(false);
            setLayout(null);
        }};
        frame.setVisible(true);

        JLabel result = new JLabel("Правельных ответов: " + rightCount.intValue() + " из " +
                questions.size() + "   " + (int) (100d / questions.size() * rightCount) + "%") {{
            setSize(280, 20);
            setLocation(0, 20);
        }};
        frame.add(result);

        JButton button = new JButton("Закрыть") {{
            setSize(100, 30);
            setLocation(50, 80);
        }};
        button.addActionListener(e -> frame.dispose());
        frame.add(button);

        selectQuestion();
    }

}

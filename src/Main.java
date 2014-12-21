

public class Main {

    public static MainFrame frame;


    public static void main(String[] args) {
        frame = new MainFrame(QuestionService.getQuestions());
        frame.setVisible(true);
    }

}

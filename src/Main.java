
public class Main {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame(QuestionService.getQuestions());
        frame.setVisible(true);
    }

}

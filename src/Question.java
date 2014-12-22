import java.util.ArrayList;
import java.util.List;

public class Question {

    private String name;
    private List<Answer> answers;
    private String type;
    private List<Answer> rightAnswer;
    private boolean leftTitle;

    public Question(String name, String type, List<Answer> answers, int... indexRightAnswer) {
        this(name, type, answers, false, indexRightAnswer);
    }

    public Question(String name, String type, List<Answer> answers, boolean leftTitle, int... indexRightAnswer) {
        this.name = name;
        this.answers = answers;
        this.type = type;
        this.leftTitle = leftTitle;
        this.rightAnswer = new ArrayList<>();
        for (int i : indexRightAnswer)
            this.rightAnswer.add(answers.get(i));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Answer> getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(List<Answer> rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public boolean isLeftTitle() {
        return leftTitle;
    }

    public void setLeftTitle(boolean leftTitle) {
        this.leftTitle = leftTitle;
    }
}

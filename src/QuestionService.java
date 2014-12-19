import java.util.ArrayList;
import java.util.List;

public class QuestionService {

    public static List<Question> questionsProgramm = new ArrayList<Question>() {{
        add(new Question("Какой из приведённых ниже вариантов создаёт переменную типа число со значением 5", "Radio",
                new ArrayList<Object>(){{
                    add("int 5 = value");
                    add("boolean value = 5;");
                    add("int value = 50");
                    add("int value = 5;");
                }}
        ));
        add(new Question("Какой из приведённых ниже вариантов устанавливает пин 6 в состояние подачи тока.", "Radio",
                new ArrayList<Object>(){{
                    add("digitalWrite(6, HIGH);");
                    add("analogRead(6);");
                    add("delay(6);");
                    add("digitalWrite(6, false);");
                }}
        ));
        add(new Question("С помощью какой команды осуществлена задержка на 2 секунды", "Radio",
                new ArrayList<Object>(){{
                    add("digitalRead(2000);");
                    add("analogRead(2000);");
                    add("delay(2000);");
                    add("digitalRead(2);");
                }}
        ));
        add(new Question("C помощью какой команды можно считать значение потенциометра подключённого к пину 2", "Radio",
                new ArrayList<Object>(){{
                    add("digitalWrite(2, true);");
                    add("analogRead(2);");
                    add("digitalRead(2);");
                    add("analogWrite(2, 255);");
                }}
        ));
        add(new Question("Укажи верную проверку того, что численная переменная value равна 3", "Radio",
                new ArrayList<Object>(){{
                    add("if (value == 3) {\n}");
                    add("if (value = 3); {\n}");
                    add("if { value = 3;\n}");
                    add("if() {\n\tvalue == 3;\n}");
                }}
        ));
        add(new Question("Какой из приведённых ниже вариантов создаст переменную типа (\"да\", \"нет\") со значением \"да\"", "Radio",
                new ArrayList<Object>(){{
                    add("boolean value = LOW;");
                    add("int value = 1;");
                    add("boolean value = true;");
                    add("boolean value = да");
                }}
        ));
        add(new Question("Какой метод выполняется в цикле на всём протяжение работы arduino", "Radio",
                new ArrayList<Object>(){{
                    add("startUp()");
                    add("loop()");
                    add("delay(100000)");
                    add("changeButton()");
                }}
        ));
        add(new Question("", "Radio",
                new ArrayList<Object>(){{
                    add("");
                    add("");
                    add("");
                    add("");
                }}
        ));
        add(new Question("", "Radio",
                new ArrayList<Object>(){{
                    add("");
                    add("");
                    add("");
                    add("");
                }}
        ));
    }};
}

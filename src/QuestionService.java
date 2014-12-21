import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionService {

    public static List<Question> questionsProgramm = new ArrayList<Question>() {{
        add(new Question("Какой из приведённых ниже вариантов устанавливает пин 6 в состояние подачи тока.", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("digitalWrite(6, HIGH);", 0));
                    add(new Answer("analogRead(6);", 1));
                    add(new Answer("delay(6);", 2));
                    add(new Answer("digitalWrite(6, false);", 3));
                }}, 0
        ));
        add(new Question("Какой из приведённых ниже вариантов создаёт переменную типа число со значением 5", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("int 5 = value", 0));
                    add(new Answer("boolean value = 5;", 1));
                    add(new Answer("int value = 50", 2));
                    add(new Answer("int value = 5;", 3));
                }}, 3
        ));
        add(new Question("С помощью какой команды осуществлена задержка на 2 секунды", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("digitalRead(2000);", 0));
                    add(new Answer("analogRead(2000);", 1));
                    add(new Answer("delay(2000);", 2));
                    add(new Answer("digitalRead(2);", 3));
                }}, 2
        ));
        add(new Question("C помощью какой команды можно считать значение потенциометра подключённого к пину 2", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("digitalWrite(2, true);", 0));
                    add(new Answer("analogRead(2);", 1));
                    add(new Answer("digitalRead(2);", 2));
                    add(new Answer("analogWrite(2, 255);", 3));
                }}, 1
        ));
        add(new Question("Укажи верную проверку того, что численная переменная value равна 3", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("if (value == 3) {\n}", 0));
                    add(new Answer("if (value = 3); {\n}", 1));
                    add(new Answer("if { value = 3;\n}", 2));
                    add(new Answer("if() {\n\tvalue == 3;\n}", 3));
                }}, 0
        ));
        add(new Question("Какой/какие из приведённых ниже вариантов создаст переменную типа (\"да\", \"нет\") со значением \"да\"", "CheckBox",
                new ArrayList<Answer>() {{
                    add(new Answer("boolean value = HIGH;", 0));
                    add(new Answer("int value = 1;", 1));
                    add(new Answer("boolean value = true;", 2));
                    add(new Answer("boolean value = да", 3));
                }}, 0, 2
        ));
        add(new Question("Какой метод выполняется в цикле на всём протяжение работы arduino", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("startUp()", 0));
                    add(new Answer("loop()", 1));
                    add(new Answer("delay(100000)", 2));
                    add(new Answer("changeButton()", 3));
                }}, 1
        ));
        add(new Question("Какие методы/метод отключит подачу тока с пина 4", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("analogWrite(4, 0);", 0));
                    add(new Answer("analogWrite(4, 1023);", 1));
                    add(new Answer("digitalWrite(4, false);", 2));
                    add(new Answer("digitalWrite(4, HIGH);", 3));
                }}, 0, 2
        ));
        add(new Question("Какой метод выполняется при запуске arduino", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("changeButton()", 0));
                    add(new Answer("loop()", 1));
                    add(new Answer("setup()", 2));
                    add(new Answer("delay()", 3));
                }}, 2
        ));
        add(new Question("В каких строчках/строчке сделана ошибка:\n1. void loop() {\n2. int pin = 5\n3. boolean value = analogRead(pin);\n4. digitalWrite(value);\n5. }", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("1", 0));
                    add(new Answer("2", 1));
                    add(new Answer("3", 2));
                    add(new Answer("4", 3));
                    add(new Answer("5", 4));
                }}, true, 1, 2, 3
        ));
        add(new Question("В каких строчках/строчке сделана ошибка:\n1. void loop() {\n2. int pin = HIGH;\n3. boolean value = digitalRead(pin);\n4. if(value); {\n5. digitalWrite(value);\n6. }\n7. }}", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("1", 0));
                    add(new Answer("2", 1));
                    add(new Answer("3", 2));
                    add(new Answer("4", 3));
                    add(new Answer("5", 4));
                    add(new Answer("6", 5));
                    add(new Answer("7", 6));
                }}, true, 1, 3, 4, 6
        ));
    }};

    public static List<Question> questionsElectronic = new ArrayList<Question>() {{
        add(new Question("Каким сиволом из приведённых ниже обозначается резистор", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer(ImagesService.getImage("button.png"), 0));
                    add(new Answer(ImagesService.getImage("led.png"), 1));
                    add(new Answer(ImagesService.getImage("resistor.png"), 2));
                    add(new Answer(ImagesService.getImage("transistor.png"), 3));
                }}, 2
        ));
        add(new Question("Укажи правильную цепь при которой будет гореть светодиод", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer(ImagesService.getImage("c1.png"), 0));
                    add(new Answer(ImagesService.getImage("c2.png"), 1));
                    add(new Answer(ImagesService.getImage("c3.png"), 2));
                    add(new Answer(ImagesService.getImage("c4.png"), 3));
                }}, 3
        ));
        add(new Question("Каким символом из приведённых ниже обозначается \"светодиод\"", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer(ImagesService.getImage("button.png"), 0));
                    add(new Answer(ImagesService.getImage("resistor.png"), 1));
                    add(new Answer(ImagesService.getImage("led.png"), 2));
                    add(new Answer(ImagesService.getImage("pot.png"), 3));
                }}, 2
        ));
        add(new Question("С помощью какого/каких компонентов в радиоэлектронике можно контроллировать подачу тока", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("транзистор", 0));
                    add(new Answer("светодиод", 1));
                    add(new Answer("резистор", 2));
                    add(new Answer("потенциометр", 3));
                    add(new Answer("кнопка", 4));
                }}, 0, 3, 4
        ));
        add(new Question("С помощью какого/каких компонентов в радиоэлектронике можно уменьшить напряжение в сети", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("транзистор", 0));
                    add(new Answer("кнопка", 1));
                    add(new Answer("резистор", 2));
                    add(new Answer("потенциометр", 3));
                }}, 2, 3
        ));
    }};

    public static List<Question> questionsPhysic = new ArrayList<Question>() {{
        add(new Question("Как правильно пишется закон Ома", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("I = U*R", 0));
                    add(new Answer("I = U/R", 1));
                    add(new Answer("U = I*R", 2));
                    add(new Answer("R = U/I", 3));
                }}, 0
        ));
        add(new Question("В чём измеряется сопротивление", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("в омах", 0));
                    add(new Answer("в амперах", 1));
                    add(new Answer("в ваттах", 2));
                    add(new Answer("в вольтах", 3));
                }}, 0
        ));
        add(new Question("В чём измеряется напряжение", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("в омах", 0));
                    add(new Answer("в амперах", 1));
                    add(new Answer("в ваттах", 2));
                    add(new Answer("в вольтах", 3));
                }}, 1
        ));
        add(new Question("Как обозначается сила тока", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("O", 0));
                    add(new Answer("R", 1));
                    add(new Answer("I", 2));
                    add(new Answer("U", 3));
                }}, 2
        ));
        add(new Question("Как обозначается сопротивление", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("O", 0));
                    add(new Answer("R", 1));
                    add(new Answer("I", 2));
                    add(new Answer("U", 3));
                }}, 1
        ));
        add(new Question("Источник питания выдаёт мощьность в 220В, электрическая цепь потребляет 60В. Сопротивление в сети = 8кОм. Чему равно напряжение в сети", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("0.03", 0));
                    add(new Answer("0.3", 1));
                    add(new Answer("0.003", 2));
                    add(new Answer("0.02", 3));
                }}, 3
        ));
        add(new Question("Сила тока в электрической цепи равна 2В. Напряжение в сети равно 0.02А. Чему равно сопротивление в сети", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("100Ом", 0));
                    add(new Answer("20Ом", 1));
                    add(new Answer("200Ом", 2));
                    add(new Answer("300Ом", 3));
                }}, 0
        ));
        add(new Question("Для чего нужно подключать резистор", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("Чтобы уменьшить ток в сети", 0));
                    add(new Answer("Чтобы уменьшить напряжение в сети", 1));
                    add(new Answer("Чтобы увеличить сопротивление светодиода", 2));
                    add(new Answer("Для того, чтобы можно было подключить что-то другое", 3));
                }}, 1
        ));
    }};

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.addAll(questionsProgramm);
        questions.addAll(questionsElectronic);
        questions.addAll(questionsPhysic);

        List<Question> result = new ArrayList<>();
        while (questions.size() > 0) {
            int i = new Random().nextInt(questions.size());
            result.add(questions.get(i));
            questions.remove(i);
        }
        return result;
    }
}

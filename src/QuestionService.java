import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionService {

    public static List<Question> questionsProgramm = new ArrayList<Question>() {{
        add(new Question("Какой из приведённых ниже вариантов устанавливает пин 6 в состояние подачи тока.", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("digitalWrite(6, HIGH);"));
                    add(new Answer("analogRead(6);"));
                    add(new Answer("delay(6);"));
                    add(new Answer("digitalWrite(6, false);"));
                }}, 0
        ));
        add(new Question("Какой из приведённых ниже вариантов создаёт переменную типа число со значением 5", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("int 5 = value"));
                    add(new Answer("boolean value = 5;"));
                    add(new Answer("int value = 50"));
                    add(new Answer("int value = 5;"));
                }}, 3
        ));
        add(new Question("С помощью какой команды осуществлена задержка на 2 секунды", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("digitalRead(2000);"));
                    add(new Answer("analogRead(2000);"));
                    add(new Answer("delay(2000);"));
                    add(new Answer("digitalRead(2);"));
                }}, 2
        ));
        add(new Question("C помощью какой команды можно считать значение потенциометра подключённого к пину 2", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("digitalWrite(2, true);"));
                    add(new Answer("analogRead(2);"));
                    add(new Answer("digitalRead(2);"));
                    add(new Answer("analogWrite(2, 255);"));
                }}, 1
        ));
        add(new Question("Укажи верную проверку того, что численная переменная value равна 3", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("if (value == 3) {\n}"));
                    add(new Answer("if (value = 3); {\n}"));
                    add(new Answer("if { value = 3;\n}"));
                    add(new Answer("if() {\n\tvalue == 3;\n}"));
                }}, 0
        ));
        add(new Question("Какой/какие из приведённых ниже вариантов создаст переменную типа (\"да\", \"нет\") со значением \"да\"", "CheckBox",
                new ArrayList<Answer>() {{
                    add(new Answer("boolean value = HIGH;"));
                    add(new Answer("int value = 1;"));
                    add(new Answer("boolean value = true;"));
                    add(new Answer("boolean value = да"));
                }}, 0, 2
        ));
        add(new Question("Какой метод выполняется в цикле на всём протяжение работы arduino", "Radio",
                new ArrayList<Answer>() {{
                    add(new Answer("startUp()"));
                    add(new Answer("loop()"));
                    add(new Answer("delay(100000)"));
                    add(new Answer("changeButton()"));
                }}, 1
        ));
        add(new Question("Какие методы/метод отключит подачу тока с пина 4", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("analogWrite(4, 0);"));
                    add(new Answer("analogWrite(4, 1023);"));
                    add(new Answer("digitalWrite(4, false);"));
                    add(new Answer("digitalWrite(4, HIGH);"));
                }}, 0, 2
        ));
        add(new Question("Какой метод выполняется при запуске arduino", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("changeButton()"));
                    add(new Answer("loop()"));
                    add(new Answer("setup()"));
                    add(new Answer("delay()"));
                }}, 2
        ));
        add(new Question("В каких строчках/строчке сделана ошибка:\n1. void loop() {\n2. int pin = 5\n3. boolean value = analogRead(pin);\n4. digitalWrite(value);\n5. }", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("1"));
                    add(new Answer("2"));
                    add(new Answer("3"));
                    add(new Answer("4"));
                    add(new Answer("5"));
                }}, true, 1, 2, 3
        ));
        add(new Question("В каких строчках/строчке сделана ошибка:\n1. void loop() {\n2. int pin = HIGH;\n3. boolean value = digitalRead(pin);\n4. if(value); {\n5. digitalWrite(value);\n6. }\n7. }}", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("1"));
                    add(new Answer("2"));
                    add(new Answer("3"));
                    add(new Answer("4"));
                    add(new Answer("5"));
                    add(new Answer("6"));
                    add(new Answer("7"));
                }}, true, 1, 3, 4, 6
        ));
    }};

    public static List<Question> questionsElectronic = new ArrayList<Question>() {{
        add(new Question("Каким сиволом из приведённых ниже обозначается резистор", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer(ImagesService.getImage("button.png")));
                    add(new Answer(ImagesService.getImage("led.png")));
                    add(new Answer(ImagesService.getImage("resistor.png")));
                    add(new Answer(ImagesService.getImage("transistor.png")));
                }}, 2
        ));
        add(new Question("Укажи правильную цепь при которой будет гореть светодиод", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer(ImagesService.getImage("c1.png")));
                    add(new Answer(ImagesService.getImage("c2.png")));
                    add(new Answer(ImagesService.getImage("c3.png")));
                    add(new Answer(ImagesService.getImage("c4.png")));
                }}, 3
        ));
        add(new Question("Каким символом из приведённых ниже обозначается \"светодиод\"", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer(ImagesService.getImage("button.png")));
                    add(new Answer(ImagesService.getImage("resistor.png")));
                    add(new Answer(ImagesService.getImage("led.png")));
                    add(new Answer(ImagesService.getImage("pot.png")));
                }}, 2
        ));
        add(new Question("С помощью какого/каких компонентов в радиоэлектронике можно контроллировать подачу тока", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("транзистор"));
                    add(new Answer("светодиод"));
                    add(new Answer("резистор"));
                    add(new Answer("потенциометр"));
                    add(new Answer("кнопка"));
                }}, 0, 3, 4
        ));
        add(new Question("С помощью какого/каких компонентов в радиоэлектронике можно уменьшить напряжение в сети", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("транзистор"));
                    add(new Answer("кнопка"));
                    add(new Answer("резистор"));
                    add(new Answer("потенциометр"));
                }}, 2, 3
        ));
    }};

    public static List<Question> questionsPhysic = new ArrayList<Question>() {{
        add(new Question("Как правильно пишется закон Ома", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("I = U*R"));
                    add(new Answer("I = U/R"));
                    add(new Answer("U = I*R"));
                    add(new Answer("R = U/I"));
                }}, 0
        ));
        add(new Question("В чём измеряется сопротивление", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("в омах"));
                    add(new Answer("в амперах"));
                    add(new Answer("в ваттах"));
                    add(new Answer("в вольтах"));
                }}, 0
        ));
        add(new Question("В чём измеряется напряжение", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("в омах"));
                    add(new Answer("в амперах"));
                    add(new Answer("в ваттах"));
                    add(new Answer("в вольтах"));
                }}, 1
        ));
        add(new Question("Как обозначается сила тока", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("O"));
                    add(new Answer("R"));
                    add(new Answer("I"));
                    add(new Answer("U"));
                }}, 2
        ));
        add(new Question("Как обозначается сопротивление", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("O"));
                    add(new Answer("R"));
                    add(new Answer("I"));
                    add(new Answer("U"));
                }}, 1
        ));
        add(new Question("Источник питания выдаёт мощьность в 220В, электрическая цепь потребляет 60В. Сопротивление в сети = 8кОм. Чему равно напряжение в сети", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("0.03"));
                    add(new Answer("0.3"));
                    add(new Answer("0.003"));
                    add(new Answer("0.02"));
                }}, 3
        ));
        add(new Question("Сила тока в электрической цепи равна 2В. Напряжение в сети равно 0.02А. Чему равно сопротивление в сети", "Radio",
                new ArrayList<Answer>(){{
                    add(new Answer("100Ом"));
                    add(new Answer("20Ом"));
                    add(new Answer("200Ом"));
                    add(new Answer("300Ом"));
                }}, 0
        ));
        add(new Question("Для чего нужно подключать резистор", "CheckBox",
                new ArrayList<Answer>(){{
                    add(new Answer("Чтобы уменьшить ток в сети"));
                    add(new Answer("Чтобы уменьшить напряжение в сети"));
                    add(new Answer("Чтобы увеличить сопротивление светодиода"));
                    add(new Answer("Для того, чтобы можно было подключить что-то другое"));
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

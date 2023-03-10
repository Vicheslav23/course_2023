import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Задача 3: На входе имеется текст, необходимо получить ответ на вопрос,
//        какие слова встречаются в нем чаще других?

        System.out.println("Частота слов в предложении");
        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

//        String sentence = "Это простое предложение";
        System.out.println("Дано предложение: " + sentence);

        String[] s = sentence.split(" "); // массив со словами, разделенными " " (пробел
        int w = s.length;
        System.out.println("Количество слов в предложении: " + w);

        int[] frequency = new int[w];

        for (int i = 0; i < s.length; i++) { // цикл по словам в предложении
            for (int j = 0; j < s.length; j++) { // перебираем каждое слово в предложении для сравнения
                if (s[i].equals(s[j])) { // сравнение двух String, если слово из предложения нашлось среди всех других слов в этом предложении
                    frequency[i]++;
                }
            }
        }
        HashMap<String, Integer> wordFrequency = new HashMap<String, Integer>(); // инициализация HastMap

        for (int i = 0; i < s.length; i++) { // заполнение HashMap в цикле
            wordFrequency.put(s[i], frequency[i]); // если опять нашлось слово, то в HashMap запишется последнее значение
        }
        for (String i : wordFrequency.keySet()) {
            System.out.println("Слово: " + i + " | Количество повторов: " + wordFrequency.get(i));
        }
    }
}
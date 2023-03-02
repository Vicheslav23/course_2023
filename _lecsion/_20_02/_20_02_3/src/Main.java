import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

//        Задача 1: посчитать количество разных слов в тексте (частоту повторений пока посчитать не можем).
//        Это "класическая" задача на HashMap и "лексический разбор".

        // разбить предложение на слова с помощью метода .split("divider") и занести эти слова в массив
        // узанть длину массива, то есть количество слов в предложении
        // инициализировать HashSet
        // занести в цикле for все слова в HashMap
        // размер HashMap - это и будеет количество уникальных слов в предложении


        System.out.println("Задача на количество уникальных слов в предложении.");

        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
        System.out.println(sentence);

        String[] s = sentence.split(" "); // разбили строку на массив слов, разделитель - это " " (пробел).
        int k = sentence.length(); // вычислили количество слов
        System.out.println("Количество слов в предложении: " + k);

        HashSet<String> words = new HashSet<String>(); // инициализация HashSet

        for (int i = 0; i < s.length; i++) {
            words.add(s[i]); // добавляем в HashSet слова из массива s[i]
        }
        int k1 = words.size(); // определеили размер полученного списка слов
        System.out.println("Количество уникальных слов в предложении: " + k1);
        // напечатаем эти слова

        for (String st : words) {
            System.out.println(st);
        }
    }
}







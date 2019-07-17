package Jd1june2019.Lection10;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        String text = " ак     Лексический повтор - это повторение  ак ак    одного и того же слова или группы слов. " +
                "Лексический повтор может использоваться в литературе для придания экспрессивности, " +
                "иллюзии движения, для того, чтобы ак ак ак подчеркнуть важную мысль. С этой целью авторы топ топ топ топ применяют " +
                "рефрены, анафоры, эпифоры. Если повтор не является оправданным (не выполняет никакой функции), " +
                "он становится ошибкой и его следует избегать, заменяя часть слов синонимами или местоимениями. топ ";
        text = text.trim();
        text = text.toLowerCase();
        String[] textArray = text.split("\\s*(\\s|-|,|!|\\(|\\).|\\.)\\s*");//форматируем и сплитуем текст
        text = null;//удаляем не нужное
        List<String> list = new ArrayList<>();
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i < textArray.length; i++) {//заносим в текст массив слов
            iterator.add(textArray[i]);
        }
        textArray = null;//удаляем не нужное
        int[] array = new int[list.size()];//массив для подсчета частоты слов.
        Map<String, Integer> map = new HashMap<String, Integer>();
        //  Set<Map.Entry<String, Integer>> entrySet = map.entrySet();


        while (iterator.hasPrevious()) {
            String word = iterator.previous();
            map.put(word, Collections.frequency(list, word));//пишем все в карту одновременно рассчитывая количество каждого слова!

        }
        System.out.println("stop debug");
        //задаче не было условия вывести. Можно глянуть через дебаг.
        //если надо - добавлю ;- тороплюсь - не успеваю задачи решать.
    }
}
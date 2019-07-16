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
        String[] textArray = text.split("\\s*(\\s|-|,|!|\\(|\\).|\\.)\\s*");
        text=null;
        List<String> list = new ArrayList<>();
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i < textArray.length; i++) {
            iterator.add(textArray[i]);
        }
        textArray = null;
        LinkedHashSet <String> set = new LinkedHashSet<>();
        set.addAll(list);
        Iterator<String> iterator2 = set.iterator();
int [] array=new int[set.size()];
int i=0;
while(iterator2.hasNext()){
array[i]=Collections.frequency(list,iterator2.next());
        i++;}

    Map <String, Integer> map=new LinkedHashMap<String, Integer>();


    }

}

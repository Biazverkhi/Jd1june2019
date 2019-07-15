package Jd1june2019.Lection09;

public final class PairUtil {

    public static Pair swap(Pair pair) {
        Pair pair2 = new Pair(pair.getV(), pair.getK());// по идее так тоже работать будет.
        return pair2;
    }

    public static <K, V> Pair<V, K> swap2(Pair<K, V> pair) {
        Pair<V, K> pair2 = new Pair<>(pair.getV(), pair.getK());

        return pair2;
    }


}// как сделать проще?????????????
//попросить объяснить еще раз значение дженериков в методах.




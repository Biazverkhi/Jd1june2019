package Jd1june2019.Lection09;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pair<K, V> {
    private K k;
    private V v;

    public  Pair(K k, V v) {//почему не могу сделать типизированный конструктор?
        this.k = k;
        this.v = v;
    }

    public K getPair() {

        return k;
    }

}

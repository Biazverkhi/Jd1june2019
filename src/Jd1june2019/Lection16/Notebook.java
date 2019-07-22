package Jd1june2019.Lection16;

import Jd1june2019.Lection16.Task2.Computer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Notebook extends Computer {
    private byte touchpad;
    private transient float diagonal;

    public Notebook() {
        super();
        touchpad = 125;
        diagonal = 11.3f;
    }
}

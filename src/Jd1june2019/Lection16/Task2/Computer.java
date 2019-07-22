package Jd1june2019.Lection16.Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Computer implements Serializable {
    private static double id;
    private int FreeSpace;
    private String name;
    private long frame;
    private byte numberKey;
    private char versionChip;

    public Computer() {
        this.FreeSpace = 1024;
        this.name = "MyComp";
        this.frame = 2023231351;
        this.numberKey = 127;
        this.versionChip = 'D';
        id = 132132.213;
    }


}

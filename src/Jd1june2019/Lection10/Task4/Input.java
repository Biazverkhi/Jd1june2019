package Jd1june2019.Lection10.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Input {
    static Stack input(Stack stack) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader.close();
        String[] list = text.split("()");
        for (String x : list
        ) {
            stack.addStackValue(Integer.parseInt(x));
        }
        return stack;
    }

}

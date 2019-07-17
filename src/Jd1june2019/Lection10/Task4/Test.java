package Jd1june2019.Lection10.Task4;

import java.io.IOException;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {


    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();//это мой стек а не java.util
        stack.setMaxSize(10);//указываю размер стека
        //stack.addStackValue(5);//заношу цифру. Демонтрация метода.
stack=Input.input(stack);//заполняю стек цифрами
        //System.out.println(stack.getStackValue());//тут можно просто извлечь цифру из стека
Iterator iterator =stack.getStack().iterator();//тут вывожу весь стек в обратном порядке
        while (iterator.hasNext()){

            System.out.print(iterator.next());
        }

        System.out.println("stop debug");
    }
}

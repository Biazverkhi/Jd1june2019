package Jd1june2019.Lection10.Task4;

import java.util.ArrayDeque;
import java.util.Deque;


public class Stack {
    private int maxSize;
    private Deque<Integer> stack;//в документации написано, что данный класс будет быстрее Stack. вот я и решил его попробовать.

    public Deque getStack() {
        return stack;
    }

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayDeque<>();
    }

    public Stack() {
        //this.maxSize = 10;
        this.stack = new ArrayDeque<>();
    }

    public void setMaxSize(int maxSize) {//задаем размер стека
        this.maxSize = maxSize;
    }

    public void addStackValue(int value) {//добавляем элемент
        if (stack.size() < maxSize) {
            stack.push(value);
        } else {
            System.out.println("стек переполнен");
        }
    }

    public int getStackValue() {
        int stackValue;
        stackValue = stack.poll();

        return stackValue;
    }


}

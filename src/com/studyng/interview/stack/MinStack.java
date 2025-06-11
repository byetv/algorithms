package com.studyng.interview.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private static List<Integer> stack = new ArrayList<>();
    private static List<Integer> minStack = new ArrayList<>();

    public static void main(String[] args) {
        pushOrAddElement(3);
        pushOrAddElement(15);
        pushOrAddElement(12);
        pushOrAddElement(1);
        printElements();
        System.out.println("Minimum Element: " + getMinElement());
        popOrRemoveElement();
        printElements();
        System.out.println("After removing the last element");
        System.out.println("Minimum Element: " + getMinElement());
        popOrRemoveElement();
        printElements();
        System.out.println("After removing the last element");
        System.out.println("Minimum Element: " + getMinElement());

        pushOrAddElement(2);
        printElements();
        System.out.println("Minimum Element: " + getMinElement());
    }

    private static void printElements(){
        for (int i = 0; i < stack.size() ; i++) {
            System.out.println("Stack: " + stack.get(i) + "\n");
        }
    }

    public static void pushOrAddElement(int element){
        stack.add(element);
        if(minStack.isEmpty() || element <= minStack.get(minStack.size()-1)){
            minStack.add(element);
        }
    }

    public static void popOrRemoveElement(){
        Integer removedElement = stack.remove(stack.size() - 1);

        if(!minStack.isEmpty() && removedElement == minStack.get(minStack.size()-1)){
            minStack.remove(minStack.size()-1);
        }
    }

    public static int getMinElement(){
        return minStack.get(minStack.size()-1);
    }
}

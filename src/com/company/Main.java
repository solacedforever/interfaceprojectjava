package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Soldier firstMarine = new Marine("Billy","Captain", 3);
        firstMarine.drive();
        System.out.println(firstMarine.name + " go " + firstMarine.drive()+" and then " + firstMarine.speak());;
    }
}

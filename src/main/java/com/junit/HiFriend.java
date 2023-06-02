package com.junit;

public class HiFriend {

    public String getGreeting() {
        return "Hi Larry Sprinkle!";
    }

    public static void main(String[] args) {
        HiFriend hiFriend = new HiFriend();
        String greeting = hiFriend.getGreeting();
        System.out.println(greeting);
    }
}


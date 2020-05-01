package com.springbootwebsocket.springbootwebsocket;

/*
 * Date: 01/05/2020 - 8:03 pm
 * User: shivam.si
 */
public class Greeting {
    private String greeting;
    Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return greeting;
    }
}

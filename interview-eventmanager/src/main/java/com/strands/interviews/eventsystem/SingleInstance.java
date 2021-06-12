package com.strands.interviews.eventsystem;

public class SingleInstance {

    private static SingleInstance instance = null;

    private SingleInstance() { }

    public static SingleInstance getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new SingleInstance();
        }
    }
}

package com.javaexamples;

public class HelloRunnable implements Runnable {
    public void run() {
        for(int i=0; i< 10 ; i++){
            System.out.println(i);
        }
    }
}

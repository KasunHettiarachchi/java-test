package com.javaexamples.Thread;

public class TestMultiPriority extends Thread {
    public void run() {
        System.out.println("thread name : " + Thread.currentThread().getName());
        System.out.println("thread priority : " + Thread.currentThread().getPriority() + " | thread name : " + Thread.currentThread().getName());
    }
}

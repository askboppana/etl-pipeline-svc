package com.forgeops;
public class Worker {
    private final String name;
    public Worker(String name) { this.name = name; }
    public String process(String input) { return "[" + name + "] processed: " + input; }
    public String getName() { return name; }
    public static void main(String[] args) {
        Worker w = new Worker("etl-pipeline-svc");
        System.out.println(w.process("startup"));
    }
}

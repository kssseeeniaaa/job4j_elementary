package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rs1 = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rs1 = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            rs1 = "See you later.";
        }
        return rs1;
    }

    public static void main(String[] arg) {
        System.out.println(answer("Hi, Bot."));
        System.out.println(answer("Bye."));
    }
}

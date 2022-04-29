package dataStructures;

import java.util.Date;

public class DSMain {

    public static void main(String[] args) {

        Task task1 = new Task("Buy milk");
        Task task2 = new Task("Empty bins");
        Task task3 = new Task("Cut grass");

        Diary diary = new Diary();

        diary.addTask(task1);
        diary.addTask(task2);
        diary.addTask(task3);

        System.out.println(diary.getNextTask());
        System.out.println(diary.getNextTask());
        System.out.println(diary.getNextTask());

    }

}

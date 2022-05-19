package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        String text;
        if (taskQueue.getTasks().size() == 1){
            text = " task";
        } else {
            text = " tasks";
        }
        System.out.println(mentorName + ": New task from " + taskQueue.getStudentName() + "\n" +
                " (total: " + taskQueue.getTasks().size() + text + " submitted)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

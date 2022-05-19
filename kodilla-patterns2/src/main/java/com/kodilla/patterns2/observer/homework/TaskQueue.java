package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements ObservableHomework {
    private final List<ObserverHomework> mentors;
    private final List<String> tasks;
    private final String studentName;

    public TaskQueue(String studentName) {
        mentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void sendTask(String task) {
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(ObserverHomework observerHomework) {
        mentors.add(observerHomework);
    }

    @Override
    public void notifyMentors() {
        for (ObserverHomework observerHomework : mentors) {
            observerHomework.update(this);
        }
    }

    @Override
    public void removeMentor(ObserverHomework mentor) {
        mentors.remove(mentor);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}

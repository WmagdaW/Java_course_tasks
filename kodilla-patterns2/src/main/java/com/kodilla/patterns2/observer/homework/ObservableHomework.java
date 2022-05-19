package com.kodilla.patterns2.observer.homework;

public interface ObservableHomework {
    void registerMentor(ObserverHomework observerHomework);
    void notifyMentors();
    void removeMentor(ObserverHomework observerHomework);
}

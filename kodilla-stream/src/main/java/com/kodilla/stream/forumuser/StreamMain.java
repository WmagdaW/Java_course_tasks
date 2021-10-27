package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map <Integer, ForumUser> theResultMapOfForumUsers= theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter (forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears()>=20)
                .filter (forumUser -> forumUser.getPostNo() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));


        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}


package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map <Integer, ForumUser> theResultMapOfForumUsers= theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter (forumUser -> forumUser.getDateOfBirth().getYear() <= 2001)
                .filter (forumUser -> forumUser.getPostNo() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}


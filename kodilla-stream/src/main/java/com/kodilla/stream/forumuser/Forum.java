package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public List<ForumUser> getUserList(){
    userList.add( new ForumUser(001, "Mike", 'M', 1980,01,01, 0 ));
    userList.add( new ForumUser(002, "John", 'M', 2010, 02, 01, 10 ));
    userList.add( new ForumUser(003, "Tom", 'M', 1982,03,01, 15 ));
    userList.add( new ForumUser(004, "Chris", 'M', 2001,10,30, 15 ));
    userList.add( new ForumUser(005, "Kate", 'F', 1983,04,01, 20 ));
    userList.add( new ForumUser(006, "Alex", 'M', 2001,10,20, 5 ));
    return new ArrayList<>(userList);
    }
}

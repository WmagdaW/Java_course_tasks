package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public List<ForumUser> getUserList(){
    userList.add( new ForumUser(1, "Mike", 'M', 1980,1,1, 0 ));
    userList.add( new ForumUser(2, "John", 'M', 2010, 2, 1, 10 ));
    userList.add( new ForumUser(3, "Tom", 'M', 1982,3,1, 15 ));
    userList.add( new ForumUser(4, "Chris", 'M', 2001,10,30, 15 ));
    userList.add( new ForumUser(5, "Kate", 'F', 1983,4,1, 20 ));
    userList.add( new ForumUser(6, "Alex", 'M', 2001,10,20, 5 ));
    return new ArrayList<>(userList);
    }
}

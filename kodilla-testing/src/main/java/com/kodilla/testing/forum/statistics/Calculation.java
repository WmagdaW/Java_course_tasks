package com.kodilla.testing.forum.statistics;

import java.util.List;

public class Calculation {

    private Statistics statistics;
    public int userQuantity;
    public int postQuantity;
    public int commentQuantity;
    public double postAveragePerUser;
    public double commentAveragePerUser;
    public double commentAveragePerPost;

    public Calculation(Statistics statistics) {
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getCommentQuantity() {
        return commentQuantity;
    }

    public double getPostAveragePerUser() {
        return postAveragePerUser;
    }

    public double getCommentAveragePerUser() {
        return commentAveragePerUser;
    }

    public double getCommentAveragePerPost() {
        return commentAveragePerPost;
    }

    private double calculatePostAveragePerUser() {
        if (userQuantity > 0) {
            return (double) postQuantity / userQuantity;
        } else{
                return 0;
            }
            }


    private double calculateCommentAveragePerUser() {
        if (userQuantity > 0) {
            return (double) commentQuantity / userQuantity;
        } else{
                return 0;
            }
            }


    private double calculateCommentAveragePerPost() {
        if (postQuantity > 0) {
            return (double) commentQuantity / postQuantity;
        } else{
                return 0;
            }
            }


    public void calculateAdvStatistics(Statistics statistics) {

      userQuantity = statistics.usersNames().size();
      postQuantity = statistics.postsCount();
      commentQuantity = statistics.commentsCount();
      postAveragePerUser = calculatePostAveragePerUser();
      commentAveragePerUser = calculateCommentAveragePerUser();
      commentAveragePerPost = calculateCommentAveragePerPost() ;
   }
   private void showStatistics() {
        System.out.println ("User quantity:" + userQuantity);
       System.out.println ("Post quantity:" + postQuantity);
       System.out.println ("Comment quantity:" + commentQuantity);
       System.out.println ("Post average per user:" + postAveragePerUser);
       System.out.println ("Comment average per user:" +  commentAveragePerUser);
       System.out.println ("Comment average per post:" + commentAveragePerPost);
   }
}

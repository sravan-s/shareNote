package com.example.qasas.sharenote;

import android.app.Application;
/**
 * Created by ss192 on 7/22/15.
 */
public class globalData {
    private String universityName, courseName, branchName;
    private int userId, userNumber;
    globalData(){
        universityName = "default";
        courseName = "default";
        branchName = "default";
        userId = -1;
        userNumber = -1;
    }
    public void setUniversityName( String x){
        universityName = x;
    }
    public void setCourseName(String x){
        courseName = x;
    }
    public void setBranchName(String x){
        branchName = x;
    }
    public String putUniversity(){
        return universityName;
    }
    public String putCourse(){
        return courseName;
    }
    public String putBranch(){
        return branchName;
    }
    public int putUserId(){
        return userId;
    }
    public int putUserNumber(){
        return userNumber;
    }
}

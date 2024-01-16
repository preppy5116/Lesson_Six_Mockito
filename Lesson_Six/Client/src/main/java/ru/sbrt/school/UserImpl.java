package ru.sbrt.school;

public class UserImpl implements User {
    int userID;

    public UserImpl(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }
}

package ru.sbrt.school;

public class MessageCreator implements Message {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

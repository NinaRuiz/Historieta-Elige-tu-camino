package model;

public class Node {
    int id;
    String message;
    String question;
    int optionA;
    int optionB;

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getQuestion() {
        return question;
    }

    public int getOptionA() {
        return optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptionA(int optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(int optionB) {
        this.optionB = optionB;
    }
}

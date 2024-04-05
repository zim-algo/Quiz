package miu.edu.cs.quiz.app.model;

public class Email {

    private String emailAddress;
    private Label label;

    public Email(String emailAddress, Label label) {
        this.emailAddress = emailAddress;
        this.label = label;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailAddress='" + emailAddress + '\'' +
                ", label=" + label +
                '}';
    }
}

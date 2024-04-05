package miu.edu.cs.quiz.app.model;

public class Phone {

    private Long number;
    private Label label;

    public Phone(Long number, Label label) {
        this.number = number;
        this.label = label;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", label=" + label +
                '}';
    }
}

package miu.edu.cs.quiz.app.model;


public class Contact {

    private String firstName;
    private String lastname;
    private String company;
    private String job;

    private Phone phone;
    private Email email;

    public Contact(String firstName, String lastname, String company, String job) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.company = company;
        this.job = job;
    }

    public Contact() {
    }

    public Contact(String firstName, String lastname, String company, String job, Phone phone, Email email) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.company = company;
        this.job = job;
        this.phone = phone;
        this.email = email;
    }

    public Contact(String david, String sanger, String argosLlc, String salesManager, long l, String mail) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", company='" + company + '\'' +
                ", job='" + job + '\'' +
                ", phone=" + phone +
                ", email=" + email +
                '}';
    }

    public String toJson() {

        return String.format("\t{\t\n \"firstName\": \"%d\", \t\n\"lastname\": \"%s\", \t\n\"company\": \"%s\"," +
                        "\t\n \"job\": \"%s\"\t\n, \"phone\": %d, \t\n\"email\": %s}",
                firstName, lastname, company, job, phone, email);
    }


}

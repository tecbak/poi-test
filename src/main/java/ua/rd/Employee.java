package ua.rd;

public class Employee {
    private String name;
    private String upsaEmail;
    private String personalEmail;
    private String phone;
    private String recruiterEnglish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpsaEmail() {
        return upsaEmail;
    }

    public void setUpsaEmail(String upsaEmail) {
        this.upsaEmail = upsaEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRecruiterEnglish() {
        return recruiterEnglish;
    }

    public void setRecruiterEnglish(String recruiterEnglish) {
        this.recruiterEnglish = recruiterEnglish;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", upsaEmail='").append(upsaEmail).append('\'');
        sb.append(", personalEmail='").append(personalEmail).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", recruiterEnglish='").append(recruiterEnglish).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

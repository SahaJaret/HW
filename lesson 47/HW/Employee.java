

public abstract class Employee {
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double hours;
    protected int yearsOfExperience; // Новое поле: стаж работы
    protected String education; // Новое поле: образование

    public Employee(int id, String firstName, String lastName, int age, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hours = hours;
        this.yearsOfExperience = yearsOfExperience;
        this.education = education;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hours=" + hours +
                ", yearsOfExperience=" + yearsOfExperience +
                ", education='" + education + '\'' +
                '}';
    }

    public abstract double calcSalary();

    // Геттеры и сеттеры для всех полей
}

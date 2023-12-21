package athlete;

public class Athlete {
    private String lastName;
    private String firstName;
    private String registrationNumber;
    private String club;
    private double resultInSeconds;

    public Athlete(String lastName, String firstName, String registrationNumber, String club, double resultInSeconds) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.resultInSeconds = resultInSeconds;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public double getResultInSeconds() {
        return resultInSeconds;
    }

    public void setResultInSeconds(double resultInSeconds) {
        this.resultInSeconds = resultInSeconds;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", club='" + club + '\'' +
                ", resultInSeconds=" + resultInSeconds +
                '}';
    }
}

package pl.edu.pw.webapi.dto;

public class CreateTeamCaptainDTO {

    private String firstName;
    private String lastName;

    public CreateTeamCaptainDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CreateTeamCaptainDTO() {
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

}

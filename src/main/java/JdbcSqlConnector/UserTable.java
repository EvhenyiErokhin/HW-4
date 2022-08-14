package JdbcSqlConnector;

public class UserTable {
    private String userLogin;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "userLogin ='" + userLogin + '\'' +
                ", password='" + password + '\'' +
                ", firstName=" + firstName + '\'' +
                ", lastName=" + lastName + '\'' +
                ", email=" + email +
                '}';
    }
}

public class User {
    private String name;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String name, String password, String email, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;

        validateInformation();
    }

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;

        validateInformation();
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;

        validateInformation();
    }

    //getters
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //to String
    @Override
    public String toString() {
        String toPrint = "User" + "\n";

        if(name != null) toPrint += "Name: " + name + "\n";
        if(password != null) toPrint += "Password: " + password + "\n";
        if(email != null) toPrint += "Email: " + email + "\n";
        if(phoneNumber != null) toPrint += "Phone: " + phoneNumber;

        return toPrint;
    }

    private void validateInformation(){

        if (email != null && !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("Invalid email address for " + name);
        } else if(name.length() <= 2 || name.length() >= 12 || Character.isLowerCase(name.charAt(0))) {
            throw new IllegalArgumentException(name + " please enter a valid username, 2-12 letters/numbers and capital first letter");
        } else {
            System.out.println("User: " + name + " has been successfully created \n");

        }
    }
}

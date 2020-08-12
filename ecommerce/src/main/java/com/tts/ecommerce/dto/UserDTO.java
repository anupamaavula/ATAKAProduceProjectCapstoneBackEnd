 
package com.tts.ecommerce.dto;

public class UserDTO {
         
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private Boolean authenticated = false;

    public UserDTO() {
         super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    @Override
    public String toString() {
        return "UserDTO [authenticated=" + authenticated + ", emailAddress=" + emailAddress + ", firstName=" + firstName
                + ", lastName=" + lastName + ", password=" + password + ", phoneNumber=" + phoneNumber + ", userName="
                + userName + "]";
    }
    
     

    

}
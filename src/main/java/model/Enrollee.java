package model;

import utils.Role;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Enrollee {
    private int id;
    private String email;
    private String password;
    private Role role;
    private String firstName;
    private String fatherName;
    private String secondName;
    private String city;
    private String state;
    private String schoolName;
    private byte[] schoolCertificate;
    private boolean isBlocked;
    private LocalDateTime applicationTime;

    public Enrollee(String email, String password){
        this.email = email;
        this.password = password;
    }

    public Enrollee(int id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Enrollee(int id, String email, String password, Role role, String firstName, String fatherName,
                    String secondName, String city, String state, String schoolName, byte[] schoolCertificate,
                    boolean isBlocked, LocalDateTime applicationTime){
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.secondName = secondName;
        this.city = city;
        this.state = state;
        this.schoolName = schoolName;
        this.schoolCertificate = schoolCertificate;
        this.isBlocked = isBlocked;
        this.applicationTime = applicationTime;
    }
    public Enrollee(String email, String password, Role role, String firstName, String fatherName,
                    String secondName, String city, String state, String schoolName, byte[] schoolCertificate,
                    boolean isBlocked, LocalDateTime applicationTime){
        this.email = email;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.secondName = secondName;
        this.city = city;
        this.state = state;
        this.schoolName = schoolName;
        this.schoolCertificate = schoolCertificate;
        this.isBlocked = isBlocked;
        this.applicationTime = applicationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public byte[] getSchoolCertificate() {
        return schoolCertificate;
    }

    public void setSchoolCertificate(byte[] schoolCertificate) {
        this.schoolCertificate = schoolCertificate;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public LocalDateTime getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(LocalDateTime applicationTime) {
        this.applicationTime = applicationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollee enrollee = (Enrollee) o;
        return id == enrollee.id &&
                isBlocked == enrollee.isBlocked &&
                email.equals(enrollee.email) &&
                password.equals(enrollee.password) &&
                role == enrollee.role &&
                firstName.equals(enrollee.firstName) &&
                fatherName.equals(enrollee.fatherName) &&
                secondName.equals(enrollee.secondName) &&
                city.equals(enrollee.city) &&
                state.equals(enrollee.state) &&
                schoolName.equals(enrollee.schoolName) &&
                Arrays.equals(schoolCertificate, enrollee.schoolCertificate) &&
                applicationTime.equals(enrollee.applicationTime);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, email, password, role, firstName, fatherName, secondName, city, state, schoolName, isBlocked, applicationTime);
        result = 31 * result + Arrays.hashCode(schoolCertificate);
        return result;
    }

    @Override
    public String toString() {
        return "Enrollee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", firstName='" + firstName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", schoolCertificate=" + Arrays.toString(schoolCertificate) +
                ", isBlocked=" + isBlocked +
                ", applicationTime=" + applicationTime +
                '}';
    }
}

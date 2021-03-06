package io.zipcoder.zcw_licensebuilder.domain.anthropoid.license;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class License {

    @Id
    @GeneratedValue
    @Column(name = "LICENSE_ID")
    private Long id;

    @Column(name = "LICENSE_FIRSTNAME")
    private String firstName;

    @Column(name = "LICENSE_LASTNAME")
    private String lastName;

    @Column(name = "LICENSE_MIDDLENAME")
    private String middleName;

    @Column(name = "LICENSE_STREETADDRESS")
    private String streetAddress;

    @Column(name = "LICENSE_CITY")
    private String city;

    @Column(name = "LICENSE_STATE")
    private String state;

    @Column(name = "LICENSE_ISFEMALE")
    private boolean isFemale;

    @Column(name = "LICENSE_BIRTHDATE")
    private Date birthDate;

    @Column(name = "LICENSE_EXPIRATIONDATE")
    private Date expirationDate;

    @Column(name = "LICENSE_ISSUEDATE")
    private Date issueDate;

    @Column(name = "LICENSE_LICENSECLASS")
    private Character licenseClass;

    public License(String firstName, String lastName, String middleName, String streetAddress, String city, String state,
                   boolean isFemale, Date birthDate, Date expirationDate, Date issueDate, Character licenseClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.birthDate = birthDate;
        this.expirationDate = expirationDate;
        this.issueDate = issueDate;
        this.licenseClass = licenseClass;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Character getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(Character licenseClass) {
        this.licenseClass = licenseClass;
    }
}

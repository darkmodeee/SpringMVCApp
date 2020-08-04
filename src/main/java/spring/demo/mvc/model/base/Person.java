package spring.demo.mvc.model.base;

import org.springframework.format.annotation.DateTimeFormat;
import spring.demo.mvc.model.course.Address;

import java.util.Date;

public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
    private Address address;
    private String contact;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    public Customer() {
    }

/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
@Id
    @Column(name = "customer_id")
/*@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")*/
/*@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "customer_id")*/
    private String id;

    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;

    public Customer(String id, String companyName, String contactName, String contactTitle,
                    String address, String city, String region, String postalCode,
                    String country, String phone, String fax) {
        this.id = id;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
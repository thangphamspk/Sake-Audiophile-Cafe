package com.sake.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phone;

    private String email;

    private String address;

    private String taxCode;

    private boolean enable;

    @OneToMany(mappedBy = "supplier")
    private Set<MaterialContract> materialContracts;

    @OneToMany(mappedBy = "supplier")
    private Set<DrinkContract> drinkContracts;

    public Supplier() {
    }

    public Supplier(String name, String phone, String email, String address, String taxCode, boolean enable) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.taxCode = taxCode;
        this.enable = enable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Set<MaterialContract> getMaterialContracts() {
        return materialContracts;
    }

    public void setMaterialContracts(Set<MaterialContract> materialContracts) {
        this.materialContracts = materialContracts;
    }

    public Set<DrinkContract> getDrinkContracts() {
        return drinkContracts;
    }

    public void setDrinkContracts(Set<DrinkContract> drinkContracts) {
        this.drinkContracts = drinkContracts;
    }
}

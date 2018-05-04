package com.sake.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class DrinkContract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;

    private Double total;

    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "drink_id", referencedColumnName = "id")
    private Drink drink;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    private Supplier supplier;

    @OneToMany(mappedBy = "drinkContract")
    private Set<DrinkContractDetail> drinkContractDetails;

    public DrinkContract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Set<DrinkContractDetail> getDrinkContractDetails() {
        return drinkContractDetails;
    }

    public void setDrinkContractDetails(Set<DrinkContractDetail> drinkContractDetails) {
        this.drinkContractDetails = drinkContractDetails;
    }
}

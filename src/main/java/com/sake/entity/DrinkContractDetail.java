package com.sake.entity;

import javax.persistence.*;

@Entity(name = "drink_contract_detail")
public class DrinkContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double amount;

    private String unit;


    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contract_id", referencedColumnName = "id")
    private DrinkContract drinkContract;

    public DrinkContractDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public DrinkContract getDrinkContract() {
        return drinkContract;
    }

    public void setDrinkContract(DrinkContract drinkContract) {
        this.drinkContract = drinkContract;
    }

}

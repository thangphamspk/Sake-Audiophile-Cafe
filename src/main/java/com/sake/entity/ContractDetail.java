package com.sake.entity;

import javax.persistence.*;

@Entity(name = "contract_details")
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Số lượng
    private Double amount;

    //Đơn vị tính
    private String unit;

    //Ghi chú
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "material_id", referencedColumnName = "material_id"),
            @JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id")
    })
    private SupplyContract supplyContract;

    public ContractDetail() {
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

    public SupplyContract getSupplyContract() {
        return supplyContract;
    }

    public void setSupplyContract(SupplyContract supplyContract) {
        this.supplyContract = supplyContract;
    }
}

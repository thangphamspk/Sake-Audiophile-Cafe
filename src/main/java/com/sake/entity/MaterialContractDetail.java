package com.sake.entity;

import javax.persistence.*;

@Entity(name = "material_contract_details")
public class MaterialContractDetail {

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
    @JoinColumn(name = "contract_id", referencedColumnName = "id")
    private MaterialContract materialContract;

    public MaterialContractDetail() {
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

    public MaterialContract getMaterialContract() {
        return materialContract;
    }

    public void setMaterialContract(MaterialContract materialContract) {
        this.materialContract = materialContract;
    }
}

package com.sake.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "supply_contracts")
public class SupplyContract {

    @EmbeddedId
    private SupplyContractId id;

    //Ngày cung cấp
    private Date date;

    //Giá trị hợp đồng
    private Double total;

    private String note;

    @OneToMany(mappedBy = "supplyContract")
    private Set<ContractDetail> contractDetails;

    public SupplyContract() {
    }

    public SupplyContractId getId() {
        return id;
    }

    public void setId(SupplyContractId id) {
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

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}

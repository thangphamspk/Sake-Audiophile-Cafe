package com.sake.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "material_contracts")
public class MaterialContract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;

    private Double total;

    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    private Supplier supplier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id", referencedColumnName = "id")
    private Material material;

    @OneToMany(mappedBy = "materialContract")
    private Set<MaterialContractDetail> materialContractDetails;

    public MaterialContract() {
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Set<MaterialContractDetail> getMaterialContractDetails() {
        return materialContractDetails;
    }

    public void setMaterialContractDetails(Set<MaterialContractDetail> materialContractDetails) {
        this.materialContractDetails = materialContractDetails;
    }
}

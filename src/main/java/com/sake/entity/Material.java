package com.sake.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "materials")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String unit;

    @OneToMany(mappedBy = "material")
    private Set<MaterialContract> materialContracts;

    public Material() {
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Set<MaterialContract> getMaterialContracts() {
        return materialContracts;
    }

    public void setMaterialContracts(Set<MaterialContract> materialContracts) {
        this.materialContracts = materialContracts;
    }

}

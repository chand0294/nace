package com.example.demo.entity.nace;

import javax.persistence.*;

@Entity
@Table(name="nace")
public class Nace {

    @Id
    @GeneratedValue
    @Column(name="order_no")
    private Long order;

    @Column(name="level")
    private Integer level;

    @Column(name="code")
    private String code;

    @Column(name="parent")
    private String parent;

    @Column(name="description")
    private String description;

    @Column(name="includes")
    private String includes;


    @Column(name="also_includes")
    private String alsoIncludes;

    @Column(name="rulings")
    private String rulings;

    @Column(name="excludes")
    private String excludes;

    @Column(name="reference")
    private String reference;


    public  Nace(){};

    public Nace(Integer level, String code, String parent, String description, String includes, String alsoIncludes, String rulings, String excludes, String reference) {
        this.level = level;
        this.code = code;
        this.parent = parent;
        this.description = description;
        this.includes = includes;
        this.alsoIncludes = alsoIncludes;
        this.rulings = rulings;
        this.excludes = excludes;
        this.reference = reference;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIncludes() {
        return includes;
    }

    public void setIncludes(String includes) {
        this.includes = includes;
    }

    public String getAlsoIncludes() {
        return alsoIncludes;
    }

    public void setAlsoIncludes(String alsoIncludes) {
        this.alsoIncludes = alsoIncludes;
    }

    public String getRulings() {
        return rulings;
    }

    public void setRulings(String rulings) {
        this.rulings = rulings;
    }

    public String getExcludes() {
        return excludes;
    }

    public void setExcludes(String excludes) {
        this.excludes = excludes;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Nace{" +
                "order=" + order +
                ", level=" + level +
                ", code='" + code + '\'' +
                ", parent='" + parent + '\'' +
                ", description='" + description + '\'' +
                ", includes='" + includes + '\'' +
                ", alsoIncludes='" + alsoIncludes + '\'' +
                ", rulings='" + rulings + '\'' +
                ", excludes='" + excludes + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}

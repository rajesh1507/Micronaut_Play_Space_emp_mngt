package com.play.space;

import io.micronaut.core.annotation.Introspected;
import java.util.Objects;

@Introspected
public class Resource{
    private String empId;
    private String expertise;

    public Resource(String empId, String expertise){
        this.empId = empId;
        this.expertise = expertise;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        if (Objects.equals(empId, resource.empId) && Objects.equals(expertise, resource.expertise)) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, expertise);
    }
}


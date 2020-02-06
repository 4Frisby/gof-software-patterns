package com.tariknural.softwarepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements CompanyInterface {

    // composition of other leafs
    List<CompanyInterface> childDepartments;

    public HeadDepartment() {
        this.childDepartments = new ArrayList<>();
        this.childDepartments.add(new ChildDepartment());
    }

    @Override
    public void printName() {
        System.out.println("head department");
        childDepartments.forEach(CompanyInterface::printName);
    }

    public List<CompanyInterface> getChildDepartments() {
        return this.childDepartments;
    }

    public void setChildDepartments(List<CompanyInterface> childDepartments) {
        this.childDepartments = childDepartments;
    }
    

}
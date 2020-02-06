package com.tariknural.softwarepatterns.structural.composite;

public class HrDepartment implements CompanyInterface {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

}
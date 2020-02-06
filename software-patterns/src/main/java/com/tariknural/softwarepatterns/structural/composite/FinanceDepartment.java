package com.tariknural.softwarepatterns.structural.composite;

public class FinanceDepartment implements CompanyInterface{

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

}
package com.tariknural.softwarepatterns.structural.composite;

class ChildDepartment implements CompanyInterface {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
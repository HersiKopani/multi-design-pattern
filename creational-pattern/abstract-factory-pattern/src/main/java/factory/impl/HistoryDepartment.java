package factory.impl;

import factory.abs.Department;

import java.util.List;

public class HistoryDepartment implements Department {
    @Override
    public String getDepartment(String departmentName) {
        return departmentName;
    }
}

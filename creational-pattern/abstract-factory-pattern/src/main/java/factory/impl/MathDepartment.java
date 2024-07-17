package factory.impl;

import factory.abs.Department;

import java.util.*;

public class MathDepartment implements Department {

    @Override
    public String getDepartment(String departmentName) {
        return departmentName;
    }
}

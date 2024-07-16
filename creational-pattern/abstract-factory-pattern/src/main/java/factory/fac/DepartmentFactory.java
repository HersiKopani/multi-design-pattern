package factory.fac;

import factory.abs.AbstractFactory;
import factory.abs.Department;
import factory.abs.Store;
import factory.abs.User;
import factory.impl.HistoryDepartment;
import factory.impl.MathDepartment;

public class DepartmentFactory extends AbstractFactory {

    @Override
    public Department getDepartment(String departmentName) {
        if(departmentName.equalsIgnoreCase("MATH")){
            return new MathDepartment();
        }
        return new HistoryDepartment();

    }

    @Override
    public User getUserName() {
        return null;
    }

    @Override
    public Store getNumberOfStores(int numberOfStore) {
        return null;
    }
}

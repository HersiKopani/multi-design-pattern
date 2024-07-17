package factory.fac;

import factory.abs.AbstractFactory;
import factory.abs.Department;
import factory.abs.Store;
import factory.abs.User;
import factory.impl.OxfordStudent;

public class UserFactory extends AbstractFactory {
    @Override
    public Department getDepartment(String departmentName) {
        return null;
    }

    @Override
    public User getUserName() {
        return new OxfordStudent();
    }

    @Override
    public Store getNumberOfStores(int numberOfStore) {
        return null;
    }
}

package factory.fac;

import factory.abs.AbstractFactory;
import factory.abs.Department;
import factory.abs.Store;
import factory.abs.User;
import factory.impl.UKStore;
import factory.impl.USAStore;

public class StoreFactory extends AbstractFactory {
    @Override
    public Department getDepartment(String departmentName) {
        return null;
    }

    @Override
    public User getUserName() {
        return null;
    }

    @Override
    public Store getNumberOfStores(int numberOfStore) {
        if(numberOfStore <5){
            return new UKStore();
        }else return new USAStore();
    }
}

package factory;

import factory.abs.AbstractFactory;
import factory.fac.DepartmentFactory;
import factory.fac.StoreFactory;
import factory.fac.UserFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("USER")){
            return new UserFactory();
        } else if(choice.equalsIgnoreCase("Dep")){
            return new DepartmentFactory();
        } else if(choice.equalsIgnoreCase("STORE")){
            return new StoreFactory();
        }
        return null;
    }
}

package factory;

import factory.abs.AbstractFactory;
import factory.abs.Department;
import factory.abs.User;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory pattern");
        AbstractFactory df = FactoryCreator.getFactory("Dep");
        Department dep = Objects.requireNonNull(df).getDepartment("HISTORY");
        System.out.println(dep.getDepartment("HISTORY"));

        AbstractFactory uf = FactoryCreator.getFactory("USER");
        User user = uf.getUserName();
        System.out.println(user.getUserName());

        AbstractFactory store = FactoryCreator.getFactory("STORE");
        System.out.println(store.getNumberOfStores(5).getNumberOfStores(5));
    }
}
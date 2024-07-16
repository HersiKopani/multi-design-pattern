package factory.abs;

public abstract class AbstractFactory {
    public abstract Department getDepartment(String departmentName);
    public abstract User getUserName();
    public abstract Store getNumberOfStores(int numberOfStore);
}

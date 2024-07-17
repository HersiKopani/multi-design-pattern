package builder.pattern.impl;

public class ConcreteHouseBuilder implements HomeBuilder{
    private Home home;
    public ConcreteHouseBuilder() {
        this.home = new Home();
    }
    @Override
    public void buildFoundation() {
        System.out.println("Build Foundation");
    }

    @Override
    public void buildWalls() {
        System.out.println("Build Walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Build Roofs");
    }

    @Override
    public void buildGarage() {
        System.out.println("Build Garage");
    }

    @Override
    public void buildSwimmingPool() {
        System.out.println("Build Swiming Pool");
    }

    @Override
    public void buildGarden() {
        System.out.println("Build Garden");
    }

    @Override
    public Home getHouse() {
        return this.home;
    }
}

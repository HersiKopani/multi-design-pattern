package builder.pattern.impl;

public class Director extends ConcreteHouseBuilder {

    private HomeBuilder homeBuilder;

    public Director(HomeBuilder homeBuilder) {
        this.homeBuilder = homeBuilder;
    }

    public void constructLuxuryHouse() {
        homeBuilder.buildFoundation();
        homeBuilder.buildWalls();
        homeBuilder.buildRoof();
        homeBuilder.buildGarage();
        homeBuilder.buildSwimmingPool();
        homeBuilder.buildGarden();
    }

    public void constructSimpleHouse() {
        homeBuilder.buildFoundation();
        homeBuilder.buildWalls();
        homeBuilder.buildRoof();
    }

    public Home getHouse() {
        return this.homeBuilder.getHouse();
    }
}

package builder.pattern.impl;

public interface HomeBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    void buildGarage();
    void buildSwimmingPool();
    void buildGarden();
    Home getHouse();
}

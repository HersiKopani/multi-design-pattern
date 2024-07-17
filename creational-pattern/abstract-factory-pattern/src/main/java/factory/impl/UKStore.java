package factory.impl;

import factory.abs.Store;

public class UKStore implements Store {
    @Override
    public int getNumberOfStores(int numberOfStore) {
        return 5;
    }
}

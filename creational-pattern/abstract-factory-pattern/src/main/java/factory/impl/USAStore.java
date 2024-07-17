package factory.impl;

import factory.abs.Store;

public class USAStore implements Store {
    @Override
    public int getNumberOfStores(int numberOfStore) {
        return 10;
    }
    
}

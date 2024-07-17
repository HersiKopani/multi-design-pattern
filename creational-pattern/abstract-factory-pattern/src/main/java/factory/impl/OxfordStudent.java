package factory.impl;

import factory.abs.User;

public class OxfordStudent implements User {
    @Override
    public String getUserName() {
        return "Oxford Student 1";
    }

    @Override
    public String getUserSurname() {
        return "Student 1";
    }
}

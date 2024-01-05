package com.asif.BuilderFactory;

public class User {

    private final String name;
    private final int id;
    private final String email;

    private User(UserBuilder builder) {

        this.email = builder.email;
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.email + " : " + this.id;
    }

    //inner Class to create object
    static class UserBuilder {

        private String name;
        private int id;
        private String email;

        public UserBuilder() {

        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}

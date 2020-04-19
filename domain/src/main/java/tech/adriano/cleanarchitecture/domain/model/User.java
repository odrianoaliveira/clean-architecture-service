package tech.adriano.cleanarchitecture.domain.model;

import tech.adriano.cleanarchitecture.domain.model.primitive.*;

import java.util.StringJoiner;

public class User extends Entity {

    private Name name;
    private Email email;
    private Credential credential;

    public User(Id id, Name name, Email email, Credential credential) {
        super(id);
        this.email = email;
        this.credential = credential;
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Credential getCredential() {
        return credential;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("name=" + name)
                .add("email=" + email)
                .add("credential=" + credential)
                .toString();
    }

    public static class UserBuilder {
        private Name name;
        private Email email;
        private Credential credential;

        public UserBuilder email(Email email) {
            this.email = email;
            return this;
        }

        public UserBuilder credential(Credential credential) {
            this.credential = credential;
            return this;
        }

        public UserBuilder name(Name name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(Id.generate(), name, email, credential);
        }
    }
}

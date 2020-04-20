package tech.adriano.service.domain.model.primitive;

public final class Credential {
    private final String name;
    private final String password;

    public Credential(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

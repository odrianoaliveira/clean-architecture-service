package tech.adriano.cleanarchitecture.domain.model.primitive;

public final class Email {
    private final String value;

    public Email(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

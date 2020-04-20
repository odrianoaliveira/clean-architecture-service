package tech.adriano.service.domain.model.primitive;

import java.util.StringJoiner;

public final class Email {
    private final String value;

    public Email(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Email.class.getSimpleName() + "[", "]")
                .add("value='" + value + "'")
                .toString();
    }
}

package tech.adriano.service.domain.model.primitive;

import java.util.UUID;

public final class Id {
    private final String id;

    private Id(String id) {
        this.id = id;
    }

    public static Id generate() {
        return new Id(UUID.randomUUID().toString());
    }

    public String getId() {
        return id;
    }
}

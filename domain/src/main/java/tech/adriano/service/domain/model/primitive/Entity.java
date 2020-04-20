package tech.adriano.service.domain.model.primitive;

public abstract class Entity {
    private Id id;

    public Entity(Id id) {
        this.id = id;
    }

    public Id getId() {
        return id;
    }
}

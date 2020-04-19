package tech.adriano.cleanarchitecture.domain.model.primitive;

public final class Name {
    private final String first;
    private final String last;

    public Name(String first, String last) {
        this.last = last;
        this.first = first;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}

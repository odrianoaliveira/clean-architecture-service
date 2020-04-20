package tech.adriano.service.repository;


import java.util.Collections;
import java.util.Optional;

public class UserUserRepositoryImpl implements UserRepository {
    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(Id id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByEmail(Email email) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return Collections.emptyList();
    }
}

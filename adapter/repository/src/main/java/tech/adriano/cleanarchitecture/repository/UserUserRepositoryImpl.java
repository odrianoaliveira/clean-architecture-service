package tech.adriano.cleanarchitecture.repository;

import tech.adriano.cleanarchitecture.domain.model.User;
import tech.adriano.cleanarchitecture.domain.model.primitive.Email;
import tech.adriano.cleanarchitecture.domain.model.primitive.Id;
import tech.adriano.cleanarchitecture.usecase.port.UserRepository;

import java.util.Collections;
import java.util.List;
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

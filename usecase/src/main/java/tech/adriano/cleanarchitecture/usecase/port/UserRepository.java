package tech.adriano.cleanarchitecture.usecase.port;

import tech.adriano.cleanarchitecture.domain.model.User;
import tech.adriano.cleanarchitecture.domain.model.primitive.Email;
import tech.adriano.cleanarchitecture.domain.model.primitive.Id;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User create(User user);

    Optional<User> findById(Id id);

    Optional<User> findByEmail(Email email);

    List<User> findAll();
}

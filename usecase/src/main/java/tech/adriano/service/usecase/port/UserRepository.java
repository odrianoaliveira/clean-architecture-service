package tech.adriano.service.usecase.port;

import java.util.List;
import java.util.Optional;

import tech.adriano.service.domain.model.User;
import tech.adriano.service.domain.model.primitive.Email;
import tech.adriano.service.domain.model.primitive.Id;

public interface UserRepository {

    User create(User user);

    Optional<User> findById(Id id);

    Optional<User> findByEmail(Email email);

    List<User> findAll();
}

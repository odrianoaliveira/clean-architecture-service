package tech.adriano.service.usecase;

import tech.adriano.service.domain.model.User;
import tech.adriano.service.usecase.exception.UserAlreadyExistsException;
import tech.adriano.service.usecase.port.UserRepository;

public class CreateUser {
    private final UserRepository userRepository;

    public CreateUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException(user.getEmail());
        }

        userRepository.create(user);

        return user;
    }
}

package tech.adriano.cleanarchitecture.usecase.exception;

import tech.adriano.cleanarchitecture.domain.model.primitive.Email;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(Email email) {
        super(email.toString());
    }
}

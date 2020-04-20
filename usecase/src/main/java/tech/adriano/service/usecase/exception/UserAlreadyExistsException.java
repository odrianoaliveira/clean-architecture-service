package tech.adriano.service.usecase.exception;

import tech.adriano.service.domain.model.primitive.Email;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(Email email) {
        super(email.toString());
    }
}

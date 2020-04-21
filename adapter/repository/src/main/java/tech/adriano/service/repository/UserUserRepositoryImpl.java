package tech.adriano.service.repository;


import java.util.Collections;
import java.util.List;
import java.util.Optional;

import tech.adriano.service.domain.model.User;
import tech.adriano.service.domain.model.primitive.Email;
import tech.adriano.service.domain.model.primitive.Id;
import tech.adriano.service.usecase.port.UserRepository;

public class UserUserRepositoryImpl implements UserRepository {
	
	@Override
	public User create(User user) {
		return user;
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

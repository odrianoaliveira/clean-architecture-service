package tech.adriano.service.repository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import tech.adriano.service.domain.model.User;
import tech.adriano.service.domain.model.primitive.Email;
import tech.adriano.service.domain.model.primitive.Id;
import tech.adriano.service.usecase.port.UserRepository;

public class UserRepositoryImpl implements UserRepository {
	
	private final SpringUserRepository springUserRepository;
	
	
	public UserRepositoryImpl(SpringUserRepository springUserRepository) {
		this.springUserRepository = springUserRepository;
	}
	
	
	@Override
	public User create(User user) {
		return springUserRepository.save(new UserRecord(user))
				.toUser();
	}
	
	
	@Override
	public Optional<User> findById(Id id) {
		return springUserRepository.findById(id.getId())
				.map(UserRecord::toUser);
	}
	
	
	@Override
	public Optional<User> findByEmail(Email email) {
		return springUserRepository.findByEmail(email)
				.map(UserRecord::toUser);
	}
	
	
	@Override
	public List<User> findAll() {
		return springUserRepository.findAll().stream()
				.map(UserRecord::toUser)
				.collect(Collectors.toList());
	}
}

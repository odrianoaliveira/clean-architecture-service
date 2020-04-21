package tech.adriano.service.repository;

import tech.adriano.service.domain.model.User;
import tech.adriano.service.domain.model.primitive.Credential;
import tech.adriano.service.domain.model.primitive.Email;
import tech.adriano.service.domain.model.primitive.Id;
import tech.adriano.service.domain.model.primitive.Name;

public final class UserRecord {
	
	@org.springframework.data.annotation.Id
	private final Id id;
	private final Name name;
	private final Email email;
	private final Credential credential;
	
	
	public UserRecord(User user) {
		id = user.getId();
		name = user.getName();
		email = user.getEmail();
		credential = user.getCredential();
	}
	
	
	public User toUser() {
		return User.builder()
				.id(id)
				.email(email)
				.name(name)
				.credential(credential)
				.build();
	}
	
	
	public Id getId() {
		return id;
	}
	
	
	public Name getName() {
		return name;
	}
	
	
	public Email getEmail() {
		return email;
	}
	
	
	public Credential getCredential() {
		return credential;
	}
	
}

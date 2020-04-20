package tech.adriano.service.domain.model;

import java.util.StringJoiner;

import tech.adriano.service.domain.model.primitive.Credential;
import tech.adriano.service.domain.model.primitive.Email;
import tech.adriano.service.domain.model.primitive.Entity;
import tech.adriano.service.domain.model.primitive.Id;
import tech.adriano.service.domain.model.primitive.Name;

public class User extends Entity {
	
	private Name name;
	private Email email;
	private Credential credential;
	
	
	public User(Id id, Name name, Email email, Credential credential) {
		super(id);
		this.email = email;
		this.credential = credential;
		this.name = name;
	}
	
	public static UserBuilder builder() {
		return new UserBuilder();
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
	
	
	@Override
	public String toString() {
		return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
				.add("name=" + name)
				.add("email=" + email)
				.add("credential=" + credential)
				.toString();
	}
	
	
	public static class UserBuilder {
		
		private Name name;
		private Email email;
		private Credential credential;
		
		
		public UserBuilder email(Email email) {
			this.email = email;
			return this;
		}
		
		
		public UserBuilder credential(Credential credential) {
			this.credential = credential;
			return this;
		}
		
		
		public UserBuilder name(Name name) {
			this.name = name;
			return this;
		}
		
		
		public User build() {
			return new User(Id.generate(), name, email, credential);
		}
		
		
		private UserBuilder() {
		}
	}
}

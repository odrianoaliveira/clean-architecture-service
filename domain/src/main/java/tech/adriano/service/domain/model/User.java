package tech.adriano.service.domain.model;

import java.util.Objects;
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
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(name, user.name) &&
				Objects.equals(email, user.email) &&
				Objects.equals(credential, user.credential);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, email, credential);
	}
	
	
	public static class UserBuilder {
		
		private Id id;
		private Name name;
		private Email email;
		private Credential credential;
		
		
		public UserBuilder id(Id id) {
			this.id = id;
			return this;
		}
		
		
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
			return new User(id, name, email, credential);
		}
		
		
		private UserBuilder() {
		}
	}
}

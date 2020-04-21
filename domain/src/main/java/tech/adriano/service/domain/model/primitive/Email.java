package tech.adriano.service.domain.model.primitive;

import java.util.Objects;
import java.util.StringJoiner;

public final class Email {
	
	private final String value;
	
	
	public Email(String value) {
		this.value = value;
	}
	
	
	public String getValue() {
		return value;
	}
	
	
	public static EmailBuilder builder() {
		return new EmailBuilder();
	}
	
	
	@Override
	public String toString() {
		return new StringJoiner(", ", Email.class.getSimpleName() + "[", "]")
				.add("value='" + value + "'")
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
		Email email = (Email) o;
		return Objects.equals(value, email.value);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
	
	
	public static final class EmailBuilder {
		
		private String value;
		
		
		public EmailBuilder value(String value) {
			this.value = value;
			return this;
		}
		
		
		public Email build() {
			return new Email(value);
		}
		
		
		private EmailBuilder() {
		}
	}
}

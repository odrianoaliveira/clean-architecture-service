package tech.adriano.service.usecase;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.adriano.service.domain.model.User;
import tech.adriano.service.domain.model.primitive.Email;
import tech.adriano.service.usecase.exception.UserAlreadyExistsException;
import tech.adriano.service.usecase.port.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CreateUserTest {
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private CreateUser createUser;
	
	
	@Test
	void existingEmail_create_fails() {
		// given an existing email
		User user = User.builder()
				.email(Email.builder().value("anEmail").build())
				.build();
		when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.of(user));
		
		//when
		assertThatThrownBy(() -> createUser.create(user))
				//then
				.isInstanceOf(UserAlreadyExistsException.class);
	}
	
	
	@Test
	void user_create_succeeds() {
		// given an existing email
		User user = User.builder().build();
		
		// when
		User result = createUser.create(user);
		
		// then
		assertThat(result).isNotSameAs(user);
	}
}
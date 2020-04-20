package tech.adriano.cleanarchitecture.usecase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.adriano.cleanarchitecture.domain.model.User;
import tech.adriano.cleanarchitecture.usecase.port.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CreateUserTest {
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private CreateUser createUser;
	
	
	@Test
	void anUser_create_succeeds() {
		// given
		User user = User.builder().build();
		
		// when
		User result = createUser.create(user);
		
		// then
		assertThat(result).isEqualTo(user);
	}
}
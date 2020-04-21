package tech.adriano.service.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import tech.adriano.service.domain.model.User;
import tech.adriano.service.domain.model.primitive.Name;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE,
		classes = { UserRepositoryImplTest.TestConfig.class, SpringUserRepository.class })
@DisplayName("UserRepository adapter test")
public class UserRepositoryImplTest {
	
	@Autowired
	public SpringUserRepository repository;
	
	
	@Test
	public void create() {
		// given
		User user = User.builder().name(Name.builder().build()).build();
		
		// when
		UserRecord userRecord = repository.save(new UserRecord(user));
		
		// then
		assertThat(user).isEqualTo(userRecord.toUser());
	}
	
	
	@TestConfiguration
	@EnableMongoRepositories
	static class TestConfig {
	
	}
}
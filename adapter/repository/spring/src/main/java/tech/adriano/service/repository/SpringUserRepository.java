package tech.adriano.service.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.adriano.service.domain.model.primitive.Email;

@Repository
public interface SpringUserRepository extends MongoRepository<UserRecord, String> {
	
	Optional<UserRecord> findByEmail(Email email);
	
}

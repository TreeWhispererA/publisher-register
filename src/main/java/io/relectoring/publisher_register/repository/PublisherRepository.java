package io.relectoring.publisher_register.repository;

import io.relectoring.publisher_register.model.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface PublisherRepository extends MongoRepository<Publisher, String> {
}

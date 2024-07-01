package org.encode.rabo.repository;

import org.encode.rabo.model.Gift;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface GiftRepository extends MongoRepository<Gift, String> {

}

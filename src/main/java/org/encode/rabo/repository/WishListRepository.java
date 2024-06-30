package org.encode.rabo.repository;

import org.encode.rabo.model.WishList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WishListRepository extends MongoRepository<WishList, String> {
}

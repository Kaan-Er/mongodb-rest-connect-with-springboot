package com.mongorest.test.repository;

import com.mongorest.test.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface KullaniciRepository extends MongoRepository<Kullanici, String> {


}

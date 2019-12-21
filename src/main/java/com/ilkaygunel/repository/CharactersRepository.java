package com.ilkaygunel.repository;

import com.ilkaygunel.entity.Characters;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharactersRepository extends MongoRepository<Characters,Long> {
}

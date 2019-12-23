package com.mueller.ideastorage.dao;

import com.mueller.ideastorage.document.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaMongoRepository extends MongoRepository<Idea, String> {
}

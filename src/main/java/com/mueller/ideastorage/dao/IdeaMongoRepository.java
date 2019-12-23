package com.mueller.ideastorage.dao;

import com.mueller.ideastorage.document.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdeaMongoRepository extends MongoRepository<Idea, String> {
}

package com.mueller.ideastorage.service;

import com.mueller.ideastorage.document.Idea;

import java.util.List;
import java.util.Optional;

public interface IdeaMongoService {

    public List<Idea> findAll();

    public Optional<Idea> findById(String id);

    public void save(Idea theIdea);

    public void deleteById(String id);
}

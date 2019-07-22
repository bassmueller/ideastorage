package com.mueller.ideastorage.service;

import com.mueller.ideastorage.entity.Idea;

import java.util.List;
import java.util.Optional;

public interface IdeaService {

    public List<Idea> findAll();

    public Optional<Idea> findById(int id);

    public void save(Idea theIdea);

    public void deleteById(int id);
}

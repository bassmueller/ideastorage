package com.mueller.ideastorage.service;

import com.mueller.ideastorage.dao.IdeaMongoRepository;
import com.mueller.ideastorage.document.Idea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdeaMongoServieImpl implements IdeaMongoService {

    private IdeaMongoRepository ideaRepository;

    @Autowired
    public IdeaMongoServieImpl(IdeaMongoRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    @Override
    public List<Idea> findAll() {
        return ideaRepository.findAll();
    }

    @Override
    public Optional<Idea> findById(String id) {
        return ideaRepository.findById(id);
    }

    @Override
    public void save(Idea theIdea) {
        ideaRepository.save(theIdea);
    }

    @Override
    public void deleteById(String id) {
        ideaRepository.deleteById(id);
    }
}

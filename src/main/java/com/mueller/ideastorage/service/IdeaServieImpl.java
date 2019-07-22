package com.mueller.ideastorage.service;

import com.mueller.ideastorage.dao.IdeaRepository;
import com.mueller.ideastorage.entity.Idea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdeaServieImpl implements IdeaService{

    private IdeaRepository ideaRepository;

    @Autowired
    public IdeaServieImpl(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    @Override
    public List<Idea> findAll() {
        return ideaRepository.findAll();
    }

    @Override
    public Optional<Idea> findById(int id) {
        return ideaRepository.findById(id);
    }

    @Override
    public void save(Idea theIdea) {
        ideaRepository.save(theIdea);
    }

    @Override
    public void deleteById(int id) {
        ideaRepository.deleteById(id);
    }
}

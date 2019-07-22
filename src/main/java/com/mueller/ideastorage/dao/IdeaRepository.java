package com.mueller.ideastorage.dao;

import com.mueller.ideastorage.entity.Idea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaRepository extends JpaRepository<Idea, Integer> {
}

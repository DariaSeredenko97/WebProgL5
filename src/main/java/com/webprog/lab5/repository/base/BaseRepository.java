package com.webprog.lab5.repository.base;

import com.webprog.lab5.model.base.EntityBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends EntityBase<PK>, PK extends Serializable> extends JpaRepository<T, PK> {
}
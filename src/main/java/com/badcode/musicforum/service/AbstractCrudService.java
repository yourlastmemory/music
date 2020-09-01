package com.badcode.musicforum.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractCrudService<T, ID> implements ICrudService<T> {

    protected final JpaRepository<T, ID> repository;

    protected AbstractCrudService(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T save(T item) {
        return repository.save(item);
    }

    @Override
    public void delete(T item) {
        repository.delete(item);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public List<T> saveAll(Iterable<T> items) {
        return repository.saveAll(items);
    }
}

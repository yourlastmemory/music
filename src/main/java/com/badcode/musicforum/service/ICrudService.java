package com.badcode.musicforum.service;

import java.util.List;

public interface ICrudService<T> {

    List<T> findAll();

    T save(T item);

    void delete(T item);

    long count();

    List<T> saveAll(Iterable<T> items);

}

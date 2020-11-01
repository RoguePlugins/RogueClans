package com.github.viiictorxd.rogueclans.repository.service;

import com.github.viiictorxd.rogueclans.repository.Repository;

public interface EntityService<K, V> extends Service, Repository<K, V> {

    void create(V value);

    void delete(V value);

    void update(V value);
}

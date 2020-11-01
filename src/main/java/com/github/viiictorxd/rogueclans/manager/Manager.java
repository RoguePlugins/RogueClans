package com.github.viiictorxd.rogueclans.manager;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class Manager<K, V> {

    protected Map<K, V> values = new HashMap<>();

    public Map<K, V> getValues() {
        return values;
    }

    public V get(K key) {
        return values.getOrDefault(key, null);
    }

    public V put(K key, V value) {
        return values.put(key, value);
    }

    public V remove(K key) {
        return values.remove(key);
    }

    public Collection<V> getAll() {
        return values.values();
    }

    public Optional<V> found(Predicate<? super V> predicate) {
        return getAll()
                .stream()
                .filter(predicate)
                .findFirst();
    }

    public boolean exists(K key) {
        return values.containsKey(key);
    }
}

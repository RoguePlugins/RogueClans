package me.viiictorxd.rogueclans.repository;

import java.util.Map;

public interface Repository<K, V> {

    Map<K, V> getAll();
}

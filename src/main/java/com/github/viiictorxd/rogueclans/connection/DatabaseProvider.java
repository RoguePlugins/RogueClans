package com.github.viiictorxd.rogueclans.connection;

import java.util.List;

public interface DatabaseProvider<E> {

    List<E> getAll();

    boolean contains(E element);
}

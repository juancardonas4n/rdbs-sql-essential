package org.jfcmc.dao.users;

import java.util.Optional;
import java.util.List;

public interface DAO<T> {
    Optional<T> get(long id);
    List<T> getAll();
    void save(T t);
    void update(T t, String[] params);
    void delete(T t);
}

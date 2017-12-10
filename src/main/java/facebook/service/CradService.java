package facebook.service;

public interface CradService<T> {

    void update(T entity);

    void create(T entity);

    void delete(Long id);
}

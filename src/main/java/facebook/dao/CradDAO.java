package facebook.dao;

public interface CradDAO<T> {

    /**
     * Update T Entity
     */
    void create(T entity);

    /**
     * Delete T Entity
     */
    void delete(Long Id);

    /**
     * Update T Entity
     */
    void update(T entity);
}

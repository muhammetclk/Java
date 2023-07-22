public interface IEntityRepository<T extends IEntity>   {//java bunda extends etmemizi istiyor.
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}

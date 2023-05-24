package src.controller;

public interface Controller<T> {
    public T create(T t);
    public T search(Integer id);
    public T searchByName(String nome);
}

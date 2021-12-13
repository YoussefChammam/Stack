package AlgorithmenUbung3.StackPackage;

public interface IStackable<T> {
    public void push(T data);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public int size();

    public void clear();

    public void print();
}

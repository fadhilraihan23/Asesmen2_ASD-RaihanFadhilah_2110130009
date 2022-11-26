public interface Antrian<E>{
    public void enqueue(E daftar);
    
    public E dequeue();

    public int size();
    
    public boolean isEmpty();
}
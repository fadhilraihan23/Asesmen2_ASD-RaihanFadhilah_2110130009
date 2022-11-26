public class Array<E> implements Antrian<E>{
    private E[] data;
    private int f=0;
    private int sz=0;

    public Array(){
        this(10);
    }

    public Array(int capacity){
        data=(E[]) new Object[capacity];
    }

    public void enqueue(E daftar) throws IllegalStateException{
        if (sz==data.length)
            throw new IllegalStateException("Queue is full");
        int avail=(f+sz)%data.length;
        data[avail]=daftar;
        sz++;
    }

    public E dequeue(){
        if (isEmpty())
            return null;
        E answer=data[f];
        data[f]=null;
        f=(f+1)% data.length;
        sz--;
        return answer;
    }

    public int size(){
        return sz;
    }

    public boolean isEmpty(){
        return (sz==0);
    }
}
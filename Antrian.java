public class Antrian {
    private LinkedList<Integer> list = new LinkedList<>();
    
    public int size() {
        return list.size();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public void enqueue(String daftar) {
        list.addLast(daftar);
    }
    
    public int dequeue() {
        return list.removeFirst();
    }
    
    public int first() {
        return list.first();
    }
    
    public int last() {
        return list.last();
    }
    
    public void print() {
        list.print();
    }

    public int peek() {
        return 0;
    }
}
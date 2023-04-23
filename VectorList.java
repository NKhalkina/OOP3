package HW3;
import java.util.Iterator;
public class VectorList<T> implements Iterable<T> {
    private Node<T> node = null;
    private int counter = 0;
    public VectorList() { 
        node = new Node<>();
    }

    public int size() { 
        return counter;
    }

    public void add(T element){
        if (counter == 0){
            node.set(element);
        }
        else{
            node.add(element);
        }
        counter++;
    }

    @Override
    public Iterator<T> iterator(){
        return new VectorIterator(node);
    }
    private class Node<T>{
        private T element;
        private Node<T> next = null;
        Node(){}
        Node(T element) {
            set(element);
        }
        void set(T element) { 
            this.element = element;
        }
        void add(T element){
            if (isNext()){
            next.add(element);
            }
            else{
                next = new Node<>(element);
            }
        }
        T get(){ 
            return element;
        }
        boolean isNext(){ 
            return next != null;
        }
    }

    private class VectorIterator implements Iterator<T>{
        private Node<T> current;
        private boolean isFirst = true;
        VectorIterator(Node<T> node){
            current = node;
        }
        @Override
        public boolean hasNext(){
            if (counter == 1 && isFirst) return true;
                return current.isNext();
            }
        
        @Override
        public T next(){
            if (isFirst) {
                isFirst = false;
            }
            else {
                current = current.next;
            }
            return current.get();
        }
    }
}
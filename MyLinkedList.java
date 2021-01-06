public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList() {
   size = 0;
   start = null;
   end = null;
 }
 public int size() {
   return size;
 }
 public boolean add(String value) {
   Node n = new Node(value);
   if(size==0) {
     start = n;
     end = n;
   }
   else {
     n.setPrev(end);
     end.setNext(n);
     end = n;
   }
   size++;
   return true;
 }
 public void add(int index, String value) {
   System.out.println("what");
 }
 public String get(int index) {
   return findNode(index).getData();
 }
 public String set(int index, String value) {
   Node newVal = new Node(value);
   Node x = findNode(index);
   if (size()==1) {
     start = newVal;
     end = newVal;
   }
   else if(index==0) {
     newVal.setNext(start.getNext());
     start.getNext().setPrev(newVal);
     start = newVal;
   }
   else if(index==size()-1) {
     newVal.setPrev(end.getPrev());
     end.getPrev().setNext(newVal);
     end = newVal;
   }
   else {
     newVal.setPrev(x.getPrev());
     newVal.setNext(x.getNext());
     x.getPrev().setNext(newVal);
     x.getNext().setPrev(newVal);
   }
   return x.getData();
 }
 public String toString() {
   String mll = "";
   Node current = start;
   for(int i = 0; i<size()-1; i++) {
     mll += current.getData() + ", ";
     current = current.getNext();
   }
   return mll + end.getData();
 }

 private Node findNode(int index) {
   Node current = start;
   for(int i = 0; i<index; i++) {
     current = current.getNext();
   }
   return current;
 }
}

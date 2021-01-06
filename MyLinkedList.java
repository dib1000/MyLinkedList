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
   size+=1;
   if(size==1) {
     start = n;
     n.setNext(end);
   }
   else if(size==2) {
     n.setPrev(start);
     end = n;
   }
   else {
     n.setPrev(end);
     end = n;
   }
   return true;
 }
 public void add(int index, String value) {
   System.out.println("what");
 }
 public String get(int index) {
   return null;
 }
 public String set(int index, String value) {
   return null;
 }
 public String toString() {
   return null;
 }
}

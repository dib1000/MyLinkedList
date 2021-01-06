public class listTester {
  public static void main(String[] args) {
    MyLinkedList m = new MyLinkedList();
    System.out.println(m.size());
    m.add("a");
    System.out.println(m.size());
    m.add("b");
    m.add("c");
    System.out.println(m);
  }
}

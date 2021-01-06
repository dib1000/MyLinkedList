public class listTester {
  public static void main(String[] args) {
    MyLinkedList m = new MyLinkedList();
    System.out.println(m.size());
    m.add("a");
    System.out.println(m.size());
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    m.add("b");
    m.add("c");
    System.out.println(m);
    System.out.println(m.get(10));
    System.out.println(m.get(0));

    System.out.println();
    MyLinkedList n = new MyLinkedList();
    n.add("n");
    System.out.println(m.set(0,"X"));
    System.out.println(n.set(0,"hi"));
    System.out.println(m);
    System.out.println(n);
    System.out.println(m.set(m.size()-1,"X"));
    System.out.println(m);
    System.out.println(m.set(5,"X"));
    System.out.println(m);
  }
}

public class nodeTester {
  public static void main(String[] args) {
    Node n = new Node("bye");
    System.out.println(n.getData());
    n.setData("hi");
    System.out.println(n.getData());
    Node e = new Node("ho");
    Node nd = new Node("HO");
    n.setNext(e);
    System.out.println(n.getNext());
    n.setNext(nd);
    System.out.println(n.getNext());
  }
}

public class nodeTester {
  public static void main(String[] args) {
    Node n = new Node("bye");
    System.out.println(n.getData());
    n.setData("hi");
    System.out.println(n.getData());
  }
}

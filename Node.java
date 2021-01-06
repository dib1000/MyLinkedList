public class Node {
  private String data;
  private Node next,prev;

  public Node(String value) {
    data = value;
    next = null;
    prev = null;
  }

  public void setData(String d) {
    data = d;
  }

  public String getData() {
    return data;
  }

  public void setNext(Node n) {
    this.next = n;
  }

  public Node getNext() {
    return next;
  }

  public void setPrev(Node n) {
    this.prev = n;
  }
  public Node getPrev() {
    return prev;
  }
}

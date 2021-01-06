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
}

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
    try {
     m.get(-1);
   }
   catch(IndexOutOfBoundsException e) {
     e.printStackTrace();
   }
   try {
    m.get(m.size()+1);
  }
  catch(IndexOutOfBoundsException e) {
    e.printStackTrace();
  }

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
    try {
     m.set(-1,"j");
   }
    catch(IndexOutOfBoundsException e) {
     e.printStackTrace();
   }
    try {
      m.set(m.size()+1,"f");
    }
    catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    System.out.println();

    MyLinkedList a = new MyLinkedList();
    a.add(0,"zzz");
    System.out.println(a);
    m.add(m.size(),"Y");
    System.out.println(m);
    System.out.println(m.size());
    m.add(0,"Y");
    System.out.println(m);
    System.out.println(m.size());
    m.add(10,"Y");
    System.out.println(m);
    System.out.println(m.size());
    try {
     m.add(-1,"j");
   }
    catch(IndexOutOfBoundsException e) {
     e.printStackTrace();
   }
    try {
      m.add(m.size()+1,"f");
    }
    catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
  }
}

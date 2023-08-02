public class Main {
    public static void main(String[] args) {
        DynamicList d = new DynamicList();
        d.insertAtBeg(10);
        d.insertAtBeg("Umer");
        d.insertAtBeg(1.23);
        d.insertAtLast(false);
        d.insertAtIndex(333,2);
        d.deleteFromIndex(3);
        d.reverse();
        d.traversal();

    }

}
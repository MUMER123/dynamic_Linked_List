public class DynamicList {
    private Node<Object> head;
    public DynamicList() {
        this.head = null;
    }
    public void insertAtBeg(Object data){
        Node<Object> newNode = new Node<>(data);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public void insertAtLast(Object data){
        if(isEmpty()){
            head=new Node<>(data);
            return;
        }

        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(new Node<>(data));
    }
    public int length(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.getNext();
            count++;
        }
        return count;
    }
    public void deleteFromBeg(){
        if(isEmpty())
            return;

        head = head.getNext();
    }
    public void deleteFromLast(){
        if(isEmpty())
            return;
        Node temp=head;
        while(temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(null);
    }

    public void traversal(){
        Node p = head;
        while(p!=null){
            System.out.print(p.getData()+ "-->");
            p = p.getNext();
        }
        System.out.println("NULL");
    }
    public boolean insertAtIndex(Object data,int index){
        if(index>=this.length())
            return false;

        Node temp=head;
        while(index!=1){
            temp=temp.getNext();
            index--;
        }
        Node temp2=temp.getNext();
        temp.setNext(new Node<>(data));
        temp.getNext().setNext(temp2);
        return true;
    }
    public boolean deleteFromIndex(int index){
        if(isEmpty())return false;
        if(index>=length())return false;
        Node temp = head;
        for(int i=1;i<index-1;i++){
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
        return true;
    }
    public void reverse(){
        DynamicList l = new DynamicList();
        while(head!=null){
            l.insertAtBeg(head.getData());
            deleteFromBeg();
        }
        this.head = l.head;
    }
}
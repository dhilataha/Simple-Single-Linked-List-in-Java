public class LinkedList {
    Node first;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void addHead(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

    public void addTail(int data){
        Node node, current;
        node = new Node(data);
        // node.next = null;

        if (isEmpty()){
            first = node;
        }
        else {
            current = first;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void addMid(int data, int x){
        if (x == 0){
            addHead(data);
            return;
        }

        Node current = first;
        for (int i=0; i<x-1; i++){
            current = current.next;
            if (current == null){
                System.out.println("Salah input bro");
                return;
            }
        }
        Node node = new Node(data);
        node.next = current.next;
        current.next = node;
    }

    public Node deleteHead(){
        if(!isEmpty()){
            Node temp = first;
            first = first.next;
            return temp;
        }else{
            return null;
        }
    }

    public Node deleteTail(){
        if(!isEmpty()){
            Node temp, current;
            current=first;
            while(current.next.next != null){
                current=current.next;
            }
            temp=current.next;
            current.next=null;
            return temp;
        }else{
            Node temp = first;
            first = null;
            return temp;
        }
    }

    public void search(int data){
        Node head = first;
        int i=0;

        while (head != null){
            if (head.data == data){
                System.out.println("Data " + data + " berada di data ke -"+i);
                return;
            }
            head = head.next;
            i++;
        }
        System.out.println("Data tidak ditemukan");
    }

    public void count(){
        Node head = first;
        int i=0;

        while (head != null){
            head = head.next;
            i++;
        }
        System.out.println("Jumlah Node adalah  "+i);
    }

    public void print(){
        Node current = first;
        if (current == null){
            System.out.println("KOSONG");
        }
        else {
            while (current != null){
                current.show();
                current = current.next;
            }
            System.out.println();
        }
    }
}

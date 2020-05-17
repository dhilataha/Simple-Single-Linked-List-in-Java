public class SLLApp {
    public static void main (String[] args){
        LinkedList link = new LinkedList();
        link.addTail(1);
        link.print();
        link.addTail(3);
        link.print();
        link.addTail(2);
        link.print();
        link.addHead(7);
        link.print();
        link.addHead(8);
        link.print();
        link.count();
    }
}

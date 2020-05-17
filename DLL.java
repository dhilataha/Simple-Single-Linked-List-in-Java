package DoublyLinkedList;


public class DLL {
	Node head;
	Node tail;
	
	public DLL (){

	}
	
	public void addHead(int x){
		Node newnode = new Node(x);
		if (head == null){
			head = newnode;
			tail = newnode;
		}else{
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void addTail(int x){
		Node newnode = new Node(x);
		//tail = head;
		newnode.next=null;
		
		if(head == null){
			addHead(x);
			return;
		}
		
		tail.next=newnode;
		newnode.prev=tail;
		tail=newnode;
	}
	
	void print() {
		if (head == null) {
			System.out.println("Tidak ada data");
			return;
		}
		Node node = head;
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("null");
	}
	
	public void addMid(int data, int index){
		Node newnode = new Node(data);
		Node current = head;
		
		if (head==null){
			addHead(data);
			return;
		}
		
		for (int i=0; i < index-1; i++){
			current = current.next;
			if (current==null){
				System.out.println("index out of bounds");
				return;
			}
		}
		
		newnode.next = current.next;
		current.next.prev = newnode;
		newnode.prev = current;
		current.next = newnode;
	}
	public void searchF(int x) {
		Node current = head;
		int i = 1;
		while (current != null) {
			if(x == current.data) {
				System.out.println("Data berada di index " + i);
				return;
			}
			current = current.next;
			i++;
		}
		System.out.println("Data Tidak di Temukan");
		
	}
		
	public static void main(String []args){
		DLL cetak = new DLL();
		cetak.addHead(10);
		cetak.addHead(12);
		cetak.addTail(9);
		
		//System.out.println(cetak.head.data);
		System.out.println(cetak.tail.data);
		cetak.print();
		cetak.addMid(19,2);
		cetak.print();
		cetak.searchF(0);
	}
		
	
		
}


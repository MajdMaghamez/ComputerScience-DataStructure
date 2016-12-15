public class SLLLongIntList implements LongIntList<SLLNode>{
	
    	private SLLNode head;
	private SLLNode tail;
	private int ListLength = 0;
	
	public SLLLongIntList(){
		this.head = null;
		this.tail = null;
	}
	
	// insertFirst (int value) inserts an element at the beginning of the Singly Linked List
	public void insertFirst(int value) {
		this.ListLength++;
		
		if(isEmpty()){
			this.head = new SLLNode(value);
			this.head.setNext(this.tail);
		}
		else {
			SLLNode OldHead = this.head;
			this.head = new SLLNode(value);
			this.head.setNext(OldHead);
		}
	}

	// insertLast (int value) inserts an element at the end of the the Singly Linked List
	public void insertLast(int value) {
		this.ListLength++;
		
		if (isEmpty()){
			this.tail = new SLLNode(value);
			this.tail.setNext(null);
		}
		else{
			SLLNode OldTail = this.tail;
			this.tail = new SLLNode(value);
			OldTail.setNext(this.tail);
		}
	}

	// first () Returns the first element from the Singly Linked List
	// This method only works when inserting from first because when you insert from last
	// the head will be null and you'll get an error when you return first.
	public SLLNode first() {
		return this.head;
	}

	// last () Returns the last element from the Singly Linked List
	// this method only works when inserting from last because when you insert from first
	// the tail will be null and you'll get an error when you return last.
	public SLLNode last() {
		return this.tail;
	}

	// isFirst (SLLNode p) returns true when p is the first element in the list
	public boolean isFirst(SLLNode p) {
		if(isEmpty()){
			return false;
		}
		else {
			if(p == this.head)
				return true;
		}
		return false;
	}

	// isLast (SLLNode p) returns true when p is the last element in the list
	public boolean isLast(SLLNode p) {
		if(isEmpty()){
			return false;
		}
		else {
			if(p == this.tail)
				return true;
		}
		return false;
	}

	// before (SLLNode p) returns the element before p
	// This is mostly used in case of a future implemenation such as doubly linked list
	public SLLNode before(SLLNode p) {
		if(isEmpty()){
			return null;
		}
		else if(p == this.head){
				return null;
		}
		else {
			SLLNode StartNode = this.head;
			while(StartNode.getNext() != null){
				if(StartNode.getNext() != null)
					return StartNode;
				StartNode = StartNode.getNext();
			}
			return null;
		}
	}

	// after (SLLNode p) returns the element after p
	public SLLNode after(SLLNode p) {
		if(isEmpty()){
			return null;
		}
		else {
			if (this.head == null){
				if(p != this.tail)
					return p.getNext();
				return null;
			}
			else {
				if(p != null)
					return p.getNext();
				return null;
			}
		}
	}

	// isEmpty () returns true if the list is empty
	public boolean isEmpty() {
		if(this.head == null && this.tail == null)
			return true;
		return false;
	}

	// size () returns the size of the List
	public int size() {
		if (isEmpty())
			return 0;
		return this.ListLength;
	}
	
}

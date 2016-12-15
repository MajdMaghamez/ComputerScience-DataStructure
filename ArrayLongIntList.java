public class ArrayLongIntList implements LongIntList<ArrayEntry> {

    private int n;
    
    private ArrayEntry [] entries;
    
    public ArrayLongIntList() {
    	this.n = 0;
        this.entries = new ArrayEntry[1];
    }

    // insertFirst (int value) inserts a value at the beginning of the array list
    public void insertFirst(int value) {
    	if(isEmpty()){
    		this.entries[0] = new ArrayEntry(value, 0);
    		this.n++;
    	}
    	else{
    		int currentSize = this.n;
    		ArrayEntry [] Temp = this.entries.clone();
    		this.entries = new ArrayEntry[currentSize + 1];
    		this.entries[0] = new ArrayEntry(value, 0);
    		for(int i = 0; i < Temp.length; i++)
    			this.entries[i+1] = new ArrayEntry(Temp[i].getValue(), i+1);
    		this.n++;
    	}
    }
    
    // insertLast (int value) inserts a value at the end of the array list
    public void insertLast(int value) {
    	if(isEmpty()){
    		this.entries[0] = new ArrayEntry(value, 0);
    		this.n++;
    	}
    	else {
    		int currentSize = this.n;
    		ArrayEntry [] Temp = this.entries.clone();
    		this.entries = new ArrayEntry[currentSize + 1];
    		this.entries[currentSize] = new ArrayEntry(value, currentSize);
    		for (int i = currentSize - 1; i > -1; i--)
    			this.entries[i] = new ArrayEntry(Temp[i].getValue(), i);
    		this.n++;
    	}
    }
    
    // first () returns the first value of the array list
    public ArrayEntry first() {
    	if(isEmpty())
    		return null;
    	return this.entries[0];
    }

    // last () returns the last value of the array list
    public ArrayEntry last() {
        if(isEmpty())
        	return null;
        return this.entries[this.n -1];
    }

    // isFirst (ArrayEntry p) returns true if p is the first element in the array list
    public boolean isFirst(ArrayEntry p) {
    	if(isEmpty())
    		return false;
    	if(p.getIndex() == 0)
    		return true;
    	return false;
    }

    // isLast (ArrayEntry p) returns true if p is the last element in the array list
    public boolean isLast(ArrayEntry p) {
    	if(isEmpty())
    		return false;
        if(p.getIndex() == this.n -1)
        	return true;
        return false;
    }

    // before (ArrayEntry p) returns the element before p
    public ArrayEntry before(ArrayEntry p) {
    	if(isEmpty())
    		return null;
    	int FirstIndex = this.entries[0].getIndex();
    	if(p.getIndex() != FirstIndex)
    		return this.entries[p.getIndex() - 1];
    	return null;
    }

    // after (ArrayEntry p) returns the element after p
    public ArrayEntry after(ArrayEntry p) {
    	if(isEmpty())
    		return null;
    	int currentSize = this.n;
    	int LastIndex = this.entries[currentSize - 1].getIndex();
    	if (p.getIndex() != LastIndex)
    		return this.entries[p.getIndex() + 1];
    	return null;
    }

    // isEmtpry () return true if array list is empty
    public boolean isEmpty() {
    	if (this.n == 0)
    		return true;
    	return false;
    }

    // size () returns the size of the array list
    public int size() {
        return this.n;
    }  
}

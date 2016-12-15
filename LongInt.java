public class LongInt {

	private final LongIntList list = new SLLLongIntList();
	
	//private final LongIntList list = new ArrayLongIntList();
	
	private boolean isNegative;
	private int Size = 0;
		    
		public LongInt() {
			this.isNegative = false;
		}
	
	// Initializes the LongIntList 		
	    @SuppressWarnings("unchecked")
		public LongInt(String s) {
	    	String Token = "";
	    	int EndOfList = 0;
	    	
	    	if(s.charAt(0) == '-'){
	    		this.isNegative = true;
	    	}
	    	else {
	    		this.isNegative = false;
	    	}
	    	
	    	if(this.isNegative){
	    		this.Size = s.length()-1;
	    		EndOfList = 0;
	    	}
	    	else {
	    		this.Size = s.length();
	    		EndOfList = -1;
	    	}
	    	
	    	LongInt TempList = new LongInt();
	    	
	    	for (int i = s.length()-1; i > EndOfList; i--){
	    		Token = String.valueOf(s.charAt(i)) + Token;
	    		if(Token.length() == 8){
	    			TempList.list.insertFirst(Integer.valueOf(Token));
	    			Token = "";
	    		}
	    	}
	    	if (Token.length() > 0){
	    		TempList.list.insertFirst(Integer.valueOf(Token));
	    		Token = "";
	    	}
	    	
	    	for (Position P = TempList.list.first(); P != null; P = TempList.list.after(P))
	    		this.list.insertFirst(P.getValue());
	    } 
	    

	// outputs the LongIntList 
	    @SuppressWarnings({ "unchecked", "static-access" })
		public void output() {
	    	LongIntUtils utils = new LongIntUtils();
	    	@SuppressWarnings("rawtypes")
			LongIntList Temp = new SLLLongIntList();
	    	if (isNegative){
	    		System.out.print("-");
	    		Position current = this.list.first();
	    		while(current != null){
	    			Temp.insertFirst(current.getValue());
	    			current = this.list.after(current);
	    		}
	    	}
	    	else {
	    		Position current = this.list.first();
	    		while(current != null){
	    			Temp.insertFirst(current.getValue());
	    			current = this.list.after(current);
	    		}
	    	}
	    	Position P = Temp.first();
	    	while(P != null){
	    		String Zeros = "";
	    		int LeadingZeros = 0;
	    		if(utils.digits(P.getValue()) != 0){
	    			LeadingZeros = 8 - utils.digits(P.getValue());
	    		}
	    		else {
	    			LeadingZeros = 7;	    		
	    		}
	    		
	    		for (int i = 0; i < LeadingZeros; i++){
	    			Zeros = "0" + Zeros;
	    		}
	    		System.out.print(Zeros + P.getValue() + " ");
	    		P = Temp.after(P);
	    	}	
	    }

	// getSign () returns the true when the LongIntList sign is negative
	    public boolean getSign() {
	    	return this.isNegative;
	    }
	    
	// setSign () sets the LongIntList sign
	    public void setSign(boolean isNegative) {
	    	this.isNegative = isNegative;
	    }
	// getDigitCount () // returns the size of the LongIntList
	    public int getDigitCount() {
	    	return this.Size;
	    }
	   
	// equalTo (LongInt i) checks if this and i are equal
	    @SuppressWarnings("unchecked")
		public boolean equalTo(LongInt i) {
	    	
	    	if (this.list.size() == i.list.size()){
	    		if (this.getSign() == i.getSign()){
	    			for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null && P2 != null; P1 = this.list.after(P1), P2 = i.list.after(P2)){
	    				if(P1.getValue() != P2.getValue())
	    					return false;
	    			}
	    			return true;
	    		}
	    		else {
	    			return false;
	    		}
	    	}
	    	return false;
	    }
	   
	// lessThan (LongInt i) checks if this is less than i
	    @SuppressWarnings("unchecked")
		public boolean lessThan(LongInt i) {
	    	
	    	if (this.getSign()){ // this is negative
	    		if(i.getSign()){ // i is negative
	    			// both are negative
	    			if(this.list.size() == i.list.size()){ // both have same size
	    				// reverse the lists and check from last to first
	    				LongInt List1 = new LongInt();
	    				LongInt List2 = new LongInt();
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null && P2 != null; P1 = this.list.after(P1), P2 = i.list.after(P2)){
	    					List1.list.insertFirst(P1.getValue());
	    					List2.list.insertFirst(P2.getValue());
	    				}
	    				// now check from first to last using the new lists 
	    				for (Position L1 = List1.list.first(), L2 = List2.list.first(); L1 != null && L2 != null; L1 = List1.list.after(L1), L2 = List2.list.after(L2)){
	    					if (L1.getValue() > L2.getValue()){
	    						return true;
	    					}
	    					if (L1.getValue() < L2.getValue()){
	    						return false;
	    					}
	    				}
	    				return false; // that means they are equal
	    			}
	    			else { // their size isn't the same!
	    				if(this.list.size() > i.list.size())
	    					return true;
	    				return false;
	    			}
	    		}
	    		else { // this is negative and i is positive
	    			return true;
	    		}
	    	}
	    	else { // this is positive 
	    		if(i.getSign()){ // i is negative
	    			return false;
	    		}
	    		else { // this is positive and i is positive
	    			// both are positive
	    			if (this.list.size() == i.list.size()){ // both have the same size
	    				// reverse the list and check from last to first
	    				LongInt List1 = new LongInt();
	    				LongInt List2 = new LongInt();
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null && P2 != null; P1 = this.list.after(P1), P2 = i.list.after(P2)){
	    					List1.list.insertFirst(P1.getValue());
	    					List2.list.insertFirst(P2.getValue());
	    				}
	    				// now check from first to last using the new lists 
	    				for (Position L1 = List1.list.first(), L2 = List2.list.first(); L1 != null && L2 != null; L1 = List1.list.after(L1), L2 = List2.list.after(L2)){
	    					if (L1.getValue() < L2.getValue()){
	    						return true;
	    					}
	    					if (L1.getValue() > L2.getValue()){
	    						return false;
	    					}
	    				}
	    				return false; // that means they are equal
	    			}
	    			else { // their size isn't the same
	    				if(this.list.size() < i.list.size())
	    					return true;
	    				return false;
	    			}
	    		}
	    	}
	    }
	       
	// greaterThan (LongInt i) checks if this is greater than i
	    @SuppressWarnings("unchecked")
		public boolean greaterThan(LongInt i) {
	    	
	    	if (this.getSign()){ // this is negative
	    		if (i.getSign()){ // i is negative
	    			// both are negative
	    			if(this.list.size() == i.list.size()){ // they have same size
	    				// reverse the lists and check from last to first
	    				LongInt List1 = new LongInt();
	    				LongInt List2 = new LongInt();
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null && P2 != null; P1 = this.list.after(P1), P2 = i.list.after(P2)){
	    					List1.list.insertFirst(P1.getValue());
	    					List2.list.insertFirst(P2.getValue());
	    				}
	    				// now check from first to last using the new lists 
	    				for (Position L1 = List1.list.first(), L2 = List2.list.first(); L1 != null && L2 != null; L1 = List1.list.after(L1), L2 = List2.list.after(L2)){
	    					if (L1.getValue() < L2.getValue()){
	    						return true;
	    					}
	    					if (L1.getValue() > L2.getValue()){
	    						return false;
	    					}
	    				}
	    				return false; // that means they are equal
	    			}
	    			else { // their size isn't the same
	    				if(this.list.size() < i.list.size())
	    					return true;
	    				return false;
	    			}
	    		}
	    		else { // this is negative, i is positive
	    			return false;
	    		}
	    	}
	    	else { // this is positive
	    		if (i.getSign()){ // i is negative
	    			return true;
	    		}
	    		else { // i is positive
	    			// both are positive
	    			if(this.list.size() == i.list.size()){ // they have same size
	    				// reverse the lists and check from last to first
	    				LongInt List1 = new LongInt();
	    				LongInt List2 = new LongInt();
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null && P2 != null; P1 = this.list.after(P1), P2 = i.list.after(P2)){
	    					List1.list.insertFirst(P1.getValue());
	    					List2.list.insertFirst(P2.getValue());
	    				}
	    				// now check from first to last using the new lists 
	    				for (Position L1 = List1.list.first(), L2 = List2.list.first(); L1 != null && L2 != null; L1 = List1.list.after(L1), L2 = List2.list.after(L2)){
	    					if (L1.getValue() > L2.getValue()){
	    						return true;
	    					}
	    					if (L1.getValue() < L2.getValue()){
	    						return false;
	    					}
	    				}
	    				return false; // that means they are equal
	    			}
	    			else { // their size isn't the same
	    				if(this.list.size() > i.list.size())
	    					return true;
	    				return false;
	    			}
	    		}
	    	}
	    }
	    
	// add (LongInt i) adds this and i
	    @SuppressWarnings({ "static-access", "unchecked" })
		public LongInt add(LongInt i) {
	    	
	    	LongIntUtils utils = new LongIntUtils(); // using the utilities library
	    	LongInt TempList = new LongInt();
	    	boolean ThisSign = this.getSign();
	    	boolean ISign = i.getSign();
	    	int overflow = 0;
	    	int Subtractor = 0;
	    	
	    	if(this.list.isEmpty()){ // this is empty 
	    		if(i.list.isEmpty()){ // i is empty
	    			return new LongInt(); // return empty 
	    		}
	    		else{
	    			return i; // return i
	    		}
	    	}
	    	else{ // this is not empty
	    		if(i.list.isEmpty()){ // i is empty
	    			return this; // return this
	    		}
	    		else { // this is not empty and i is not empty do the calculation 
	    			if(getSign()) { // this isNegative
	    	        	if(i.getSign()) { // i is negative
	    	        		// - this + (- i) = - this - i
	    	        		TempList.setSign(true); // add both and set the sign to negative
	    	        		this.setSign(false);
	    	        		i.setSign(false);
	    	        		if(this.greaterThan(i)){
	    	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	    	        				if(P2 != null){
	    	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
	    		        				overflow = utils.overflow(Token);
	    		        				if (overflow > 0){
	    		        					TempList.list.insertFirst(utils.underflow(Token));
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    		        				else {
	    		        					TempList.list.insertFirst(Token);
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    		        				P2 = i.list.after(P2);
	    	        				}
	    	        				else {
	    	        					int Token = P1.getValue() + overflow;
	    	        					overflow = utils.overflow(Token);
	    	        					if (overflow > 0){
	    	        						TempList.list.insertFirst(utils.underflow(Token));
	    	        						TempList.Size = TempList.Size + utils.digits(Token);
	    	        					}
	    	        					else {
	    	        						
	    	        					}
	    	        					TempList.list.insertFirst(Token);
	    	        					TempList.Size = TempList.Size + utils.digits(Token);
	    	        					overflow = 0;
	    	        				}
	    	        			}
	    	        		}
	    	        		else {
	    	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	    	        				if(P1 != null){
	    	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
	    		        				overflow = utils.overflow(Token);
	    		        				if (overflow > 0){
	    		        					TempList.list.insertFirst(utils.underflow(Token));
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    		        				else {
	    		        					TempList.list.insertFirst(Token);
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    	        					P1 = this.list.after(P1);
	    	        				}
	    	        				else {
	    	        					int Token = P2.getValue() + overflow;
	    	        					overflow = utils.overflow(Token);
	    	        					if (overflow > 0){
	    	        						TempList.list.insertFirst(utils.underflow(Token));
	    	        						TempList.Size = TempList.Size + utils.digits(Token);
	    	        					}
	    	        					else {
	    	        						TempList.list.insertFirst(Token);
	    	        						TempList.Size = TempList.Size + utils.digits(Token);
	    	        						overflow = 0;
	    	        					}
	    	        				}
	    	        			}
	    	        		}
	    	        	}
	    	        	else { // this is negative i is positive
	    	        		// - this + (+ i) = - this + i
	    	        		this.setSign(false);
	    	        		i.setSign(false);
	    	        		if(this.greaterThan(i)){ // this is greater than i
	    	        			TempList.setSign(true); // set the sign to negative
	    	        			for(Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	    	        				if(P2 != null){
	    	    						int Token = P1.getValue() + Subtractor;
	    	    						int checkT= Token - P2.getValue();
	    	    						Subtractor = 0;
	    	    						if (checkT < 0) {
	    	    							Token = P1.getValue() + 100000000;
	    	    							int R = Token - P2.getValue();
	    	    							Subtractor = -1;
	    	    							TempList.list.insertFirst(R);
	    	    							TempList.Size = TempList.Size + utils.digits(R);
	    	    						}
	    	    						else {
	    	    							TempList.list.insertFirst(checkT);
	    	    							TempList.Size = TempList.Size + utils.digits(checkT);
	    	    						}
	    	    						P2 = i.list.after(P2);
	    	    					}
	    	    					else {
	    	    						int Token = P1.getValue() + Subtractor;
	    	    						TempList.list.insertFirst(Token);
	    	    						TempList.Size = TempList.Size + utils.digits(Token);
	    	    						Subtractor = 0;
	    	    					}
	    	        			}
	    	        		}
	    	    			else if(this.equals(i)){ // they are equal, Results = 0
	    	    				TempList.setSign(false);
	    	    				TempList.list.insertFirst(0);
	    	    		        this.setSign(ThisSign);
	    	    		        i.setSign(ISign);
	    	    				return TempList;
	    	    			}
	    	        		else { // i is greater than this
	    	        			TempList.setSign(false); // set the sign to positive
	    	        			for(Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	    	        				if(P1 != null){
	    	        					int Token = P2.getValue() + Subtractor;
	    	        					int checkT= Token - P1.getValue();
	    	        					Subtractor = 0;
	    	        					if(checkT < 0){
	    	        						Token = P2.getValue() + 100000000;
	    	        						int R = Token - P1.getValue();
	    	        						Subtractor = -1;
	    	        						TempList.list.insertFirst(R);
	    	        						TempList.Size = TempList.Size + utils.digits(R);
	    	        					}
	    	        					else {
	    	        						TempList.list.insertFirst(checkT);
	    	        						TempList.Size = TempList.Size + utils.digits(checkT);
	    	        					}
	    	        					P1 = this.list.after(P1);
	    	        				}
	    	        				else {
	    	        					int Token = P2.getValue() + Subtractor;
	    	        					TempList.list.insertFirst(Token);
	    	        					TempList.Size = TempList.Size + utils.digits(Token);
	    	        					Subtractor = 0;
	    	        				}
	    	        			}
	    	        		}
	    	        	}
	    	        }
	    	        else { // this is Positive
	    	        	if(i.getSign()) { // i is negative
	    	        		// + this + (- i) = + this - i
	    	        		this.setSign(false);
	    	        		i.setSign(false);
	    	        		if(this.greaterThan(i)){ // this is greater than i 
	    	        			TempList.setSign(false); // set the sign to positive
	    	        			for(Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	    	        				if(P2 != null){
	    	    						int Token = P1.getValue() + Subtractor;
	    	    						int checkT= Token - P2.getValue();
	    	    						Subtractor = 0;
	    	    						if (checkT < 0) {
	    	    							Token = P1.getValue() + 100000000;
	    	    							int R = Token - P2.getValue();
	    	    							Subtractor = -1;
	    	    							TempList.list.insertFirst(R);
	    	    							TempList.Size = TempList.Size + utils.digits(R);
	    	    						}
	    	    						else {
	    	    							TempList.list.insertFirst(checkT);
	    	    							TempList.Size = TempList.Size + utils.digits(checkT);
	    	    						}
	    	    						P2 = i.list.after(P2);
	    	    					}
	    	    					else {
	    	    						int Token = P1.getValue() + Subtractor;
	    	    						TempList.list.insertFirst(Token);
	    	    						TempList.Size = TempList.Size + utils.digits(Token);
	    	    						Subtractor = 0;
	    	    					}
	    	        			}
	    	        		}
	    	    			else if(this.equals(i)){ // they are equal, Results = 0
	    	    				TempList.setSign(false);
	    	    				TempList.list.insertFirst(0);
	    	    		        this.setSign(ThisSign);
	    	    		        i.setSign(ISign);
	    	    				return TempList;
	    	    			}
	    	        		else { // i is greater than this
	    	        			TempList.setSign(true); // set the sign to negative
	    	        			for(Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	    	        				if(P1 != null){
	    	        					int Token = P2.getValue() + Subtractor;
	    	        					int checkT= Token  - P1.getValue();
	    	        					Subtractor = 0;
	    	        					if(checkT < 0){
	    	        						Token = P2.getValue() + 100000000;
	    	        						int R = Token - P1.getValue();
	    	        						TempList.list.insertFirst(R);
	    	        						TempList.Size = TempList.Size + utils.digits(R);
	    	        						Subtractor = -1;
	    	        					}
	    	        					else {
	    	        						TempList.list.insertFirst(checkT);
	    	        						TempList.Size = TempList.Size + utils.digits(checkT);
	    	        					}
	    	        					P1 = this.list.after(P1);
	    	        				}
	    	        				else {
	    	        					int Token = P2.getValue() + Subtractor;
	    	        					TempList.list.insertFirst(Token);
	    	        					TempList.Size = TempList.Size + utils.digits(Token);
	    	        					Subtractor = 0;
	    	        				}
	    	        			}
	    	        		}
	    	        	}
	    	        	else { // this is positive and i is positive
	    	        		// + this + (+ i ) = + this + i
	    	        		TempList.setSign(false); // add both and set the sign to positive
	    	        		this.setSign(false);
	    	        		i.setSign(false);
	    	        		if(this.greaterThan(i)){ // this is greater than i 
	    	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	    	        				if(P2 != null){
	    	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
	    		        				overflow = utils.overflow(Token);
	    		        				if (overflow > 0){
	    		        					TempList.list.insertFirst(utils.underflow(Token));
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    		        				else {
	    		        					TempList.list.insertFirst(Token);
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    		        				P2 = i.list.after(P2);
	    	        				}
	    	        				else {
	    	        					int Token = P1.getValue() + overflow;
	    	        					overflow = utils.overflow(Token);
	    	        					if (overflow > 0){
	    	        						TempList.list.insertFirst(utils.underflow(Token));
	    	        						TempList.Size = TempList.Size + utils.digits(Token);
	    	        					}
	    	        					else {
	    	        						
	    	        					}
	    	        					TempList.list.insertFirst(Token);
	    	        					TempList.Size = TempList.Size + utils.digits(Token);
	    	        					overflow = 0;
	    	        				}
	    	        			}
	    	        		}
	    	        		else { // i is greater than or equal to this
	    	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	    	        				if(P1 != null){
	    	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
	    		        				overflow = utils.overflow(Token);
	    		        				if (overflow > 0){
	    		        					TempList.list.insertFirst(utils.underflow(Token));
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    		        				else {
	    		        					TempList.list.insertFirst(Token);
	    		        					TempList.Size = TempList.Size + utils.digits(Token);
	    		        				}
	    	        					P1 = this.list.after(P1);
	    	        				}
	    	        				else {
	    	        					int Token = P2.getValue() + overflow;
	    	        					overflow = utils.overflow(Token);
	    	        					if (overflow > 0){
	    	        						TempList.list.insertFirst(utils.underflow(Token));
	    	        						TempList.Size = TempList.Size + utils.digits(Token);
	    	        					}
	    	        					else {
	    	        						TempList.list.insertFirst(Token);
	    	        						TempList.Size = TempList.Size + utils.digits(Token);
	    	        						overflow = 0;
	    	        					}
	    	        				}
	    	        			}
	    	        		}
	    	        	}
	    	        }
	    	        LongInt Results = new LongInt();
	    	        if(overflow > 0){
	    	        	Results.list.insertFirst(overflow);
	    	        	Results.Size = Results.Size + utils.digits(overflow);
	    	        }
	    	        for (Position F1 = TempList.list.first(); F1 != null; F1 = TempList.list.after(F1)){
	    	        	Results.list.insertFirst(F1.getValue());
	    	        	Results.Size = Results.Size + utils.digits(F1.getValue());
	    	        }
	    	        Results.setSign(TempList.getSign());
	    	        TempList = null;
	    	        this.setSign(ThisSign);
	    	        i.setSign(ISign);
	    	        return Results;
	    		}
	    	}
	    }
	    
	// subtract (LongInt i) subtracts this from i 
	    @SuppressWarnings({"static-access", "unchecked" })
		public LongInt subtract(LongInt i) {
 
	    	LongIntUtils utils = new LongIntUtils();
	    	LongInt TempList = new LongInt();
	    	boolean ThisSign = this.getSign();
	    	boolean ISign = i.getSign();
	    	int overflow = 0;
	    	int Subtractor = 0;
	    	
	    	if (this.getSign()){ // this is negative 
	    		if(i.getSign()){ // i is negative
	    			// - this - (- i) = - this + i
	    			this.setSign(false);
	    			i.setSign(false);			    			
	    			if(this.greaterThan(i)){ // this is greater than i 
	    				TempList.setSign(true); // the sign is negative
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	    					if(P2 != null){
	    						int Token 	= P1.getValue() + Subtractor;
	    						int checkT	= Token - P2.getValue();
	    						Subtractor = 0;
	    						if (checkT < 0) {
	    							Token = Token + 100000000;
	    							int R = Token - P2.getValue();
	    							Subtractor = - 1;
	    							TempList.list.insertFirst(R);
	    							TempList.Size = TempList.Size + utils.digits(R);
	    						}
	    						else {
	    							TempList.list.insertFirst(checkT);
	    							TempList.Size = TempList.Size + utils.digits(checkT);
	    						}
	    						P2 = i.list.after(P2);
	    					}
	    					else {
	    						int Token = P1.getValue() - Subtractor;
	    						TempList.list.insertFirst(Token);
	    						TempList.Size = TempList.Size + utils.digits(Token);
	    						Subtractor = 0;
	    					}
	    				}
	    			}
	    			else if(this.equals(i)){ // they are equal, Results = 0
	    				TempList.setSign(false);
	    				TempList.list.insertFirst(0);
	    		        this.setSign(ThisSign);
	    		        i.setSign(ISign);
	    				return TempList;
	    			}
	    			else { // i is greater than this 
	    				TempList.setSign(false); // the sign is positive
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	    					if (P1 != null){
	    						int Token  = P2.getValue() + Subtractor;
	    						int checkT = Token - P1.getValue();
	    						Subtractor = 0;
	    						if (checkT < 0){
	    							Token = Token + 100000000;
	    							int R = Token - P1.getValue();
	    							Subtractor = -1;
	    							TempList.list.insertFirst(R);
	    							TempList.Size = TempList.Size + utils.digits(R);
	    						}
	    						else {
	    							TempList.list.insertFirst(checkT);
	    							TempList.Size = TempList.Size + utils.digits(checkT);
	    						}
	    						P1 = this.list.after(P1);
	    					}
	    					else {
	    						int Token = P2.getValue() - Subtractor;
	    						TempList.list.insertFirst(Token);
	    						TempList.Size = TempList.Size + utils.digits(Token);
	    						Subtractor = 0;
	    					}
	    				}
	    			}
	    		}
	    		else { // this is negative and i is positive
	    			// - this - (+ i) = - this - i 
	        		TempList.setSign(true); // add both and set the sign to negative
	        		this.setSign(false);
	        		i.setSign(false);
	        		if(this.greaterThan(i)){
	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	        				if(P2 != null){
	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
		        				overflow = utils.overflow(Token);
		        				if (overflow > 0){
		        					TempList.list.insertFirst(utils.underflow(Token));
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
		        				else {
		        					TempList.list.insertFirst(Token);
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
		        				P2 = i.list.after(P2);
	        				}
	        				else {
	        					int Token = P1.getValue() + overflow;
	        					overflow = utils.overflow(Token);
	        					if (overflow > 0){
	        						TempList.list.insertFirst(utils.underflow(Token));
	        						TempList.Size = TempList.Size + utils.digits(Token);
	        					}
	        					else {
	        						
	        					}
	        					TempList.list.insertFirst(Token);
	        					TempList.Size = TempList.Size + utils.digits(Token);
	        					overflow = 0;
	        				}
	        			}
	        		}
	        		else {
	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	        				if(P1 != null){
	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
		        				overflow = utils.overflow(Token);
		        				if (overflow > 0){
		        					TempList.list.insertFirst(utils.underflow(Token));
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
		        				else {
		        					TempList.list.insertFirst(Token);
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
	        					P1 = this.list.after(P1);
	        				}
	        				else {
	        					int Token = P2.getValue() + overflow;
	        					overflow = utils.overflow(Token);
	        					if (overflow > 0){
	        						TempList.list.insertFirst(utils.underflow(Token));
	        						TempList.Size = TempList.Size + utils.digits(Token);
	        					}
	        					else {
	        						TempList.list.insertFirst(Token);
	        						TempList.Size = TempList.Size + utils.digits(Token);
	        						overflow = 0;
	        					}
	        				}
	        			}
	        		}
	    		}
	    	}
	    	else { // this is positive 
	    		if(i.getSign()){ // i is negative
	    			// + this - (- i) = + this + i
	        		TempList.setSign(false); // Add both and set the sign to positive
	        		this.setSign(false);
	        		i.setSign(false);
	        		if(this.greaterThan(i)){
	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	        				if(P2 != null){
	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
		        				overflow = utils.overflow(Token);
		        				if (overflow > 0){
		        					TempList.list.insertFirst(utils.underflow(Token));
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
		        				else {
		        					TempList.list.insertFirst(Token);
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
		        				P2 = i.list.after(P2);
	        				}
	        				else {
	        					int Token = P1.getValue() + overflow;
	        					overflow = utils.overflow(Token);
	        					if (overflow > 0){
	        						TempList.list.insertFirst(utils.underflow(Token));
	        						TempList.Size = TempList.Size + utils.digits(Token);
	        					}
	        					else {
	        						
	        					}
	        					TempList.list.insertFirst(Token);
	        					TempList.Size = TempList.Size + utils.digits(Token);
	        					overflow = 0;
	        				}
	        			}
	        		}
	        		else {
	        			for (Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	        				if(P1 != null){
	        					int Token = (P1.getValue() + P2.getValue()) + overflow;
		        				overflow = utils.overflow(Token);
		        				if (overflow > 0){
		        					TempList.list.insertFirst(utils.underflow(Token));
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
		        				else {
		        					TempList.list.insertFirst(Token);
		        					TempList.Size = TempList.Size + utils.digits(Token);
		        				}
	        					P1 = this.list.after(P1);
	        				}
	        				else {
	        					int Token = P2.getValue() + overflow;
	        					overflow = utils.overflow(Token);
	        					if (overflow > 0){
	        						TempList.list.insertFirst(utils.underflow(Token));
	        						TempList.Size = TempList.Size + utils.digits(Token);
	        					}
	        					else {
	        						TempList.list.insertFirst(Token);
	        						TempList.Size = TempList.Size + utils.digits(Token);
	        						overflow = 0;
	        					}
	        				}
	        			}
	        		}
	    		}
	    		else { // this is positive and i is positive
	    			// + this - (+ i) = + this - i
	    			this.setSign(false);
	    			i.setSign(false);
	    			if(this.greaterThan(i)){ // this is greater than i
	    				TempList.setSign(false); // sign is positive
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P1 != null; P1 = this.list.after(P1)){
	    					if(P2 != null){
	    						int Token 	= P1.getValue() + Subtractor;
	    						int checkT	= Token - P2.getValue();
	    						Subtractor = 0;
	    						if (checkT < 0) {
	    							Token = Token + 100000000;
	    							int R = Token - P2.getValue();
	    							Subtractor = - 1;
	    							TempList.list.insertFirst(R);
	    							TempList.Size = TempList.Size + utils.digits(R);
	    						}
	    						else {
	    							TempList.list.insertFirst(checkT);
	    							TempList.Size = TempList.Size + utils.digits(checkT);
	    						}
	    						P2 = i.list.after(P2);
	    					}
	    					else {
	    						int Token = P1.getValue() - Subtractor;
	    						TempList.list.insertFirst(Token);
	    						TempList.Size = TempList.Size + utils.digits(Token);
	    						Subtractor = 0;
	    					}
	    				}
	    			}
	    			else if(this.equals(i)){ // they are equal, Results = 0
	    				TempList.setSign(false);
	    				TempList.list.insertFirst(0);
	    		        this.setSign(ThisSign);
	    		        i.setSign(ISign);
	    				return TempList;
	    			}
	    			else { // i is greater than this
	    				TempList.setSign(true); // sign is negative
	    				for (Position P1 = this.list.first(), P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	    					if (P1 != null){
	    						int Token  = P2.getValue() + Subtractor;
	    						int checkT = Token - P1.getValue();
	    						Subtractor = 0;
	    						if (checkT < 0){
	    							Token = Token + 100000000;
	    							int R = Token - P1.getValue();
	    							Subtractor = -1;
	    							TempList.list.insertFirst(R);
	    							TempList.Size = TempList.Size + utils.digits(R);
	    						}
	    						else {
	    							TempList.list.insertFirst(checkT);
	    							TempList.Size = TempList.Size + utils.digits(checkT);
	    						}
	    						P1 = this.list.after(P1);
	    					}
	    					else {
	    						int Token = P2.getValue() - Subtractor;
	    						TempList.list.insertFirst(Token);
	    						TempList.Size = TempList.Size + utils.digits(Token);
	    						Subtractor = 0;
	    					}
	    				}
	    			}
	    		}
	    	}
	    	
	        LongInt Results = new LongInt();
	        if(overflow > 0){
	        	Results.list.insertFirst(overflow);
	        	Results.Size = Results.Size + utils.digits(overflow);
	        }
	        for (Position F1 = TempList.list.first(); F1 != null; F1 = TempList.list.after(F1)){
	        	Results.list.insertFirst(F1.getValue());
	        	Results.Size = Results.Size + utils.digits(F1.getValue());
	        }
	        Results.setSign(TempList.getSign());
	        TempList = null;
	        this.setSign(ThisSign);
	        i.setSign(ISign);
	        return Results;
	    }
	    
	// multiply (LongInt i) multiply this with i
	    @SuppressWarnings("unchecked")
		public LongInt multiply(LongInt i) {
	    		LongInt Results = new LongInt();
	    		int TempZeros 	= 0;
	    		int ResultZeros = 0;
	    		
	    		for (Position P1 = this.list.first(); P1 != null; P1 = this.list.after(P1)){
	    			LongInt Temp 	= new LongInt();
	    			for (Position P2 = i.list.first(); P2 != null; P2 = i.list.after(P2)){
	    				LongInt	Temp1	= new LongInt();
	    				int [] Array = Karatsuba(P1, P2);
	    				Temp1.list.insertFirst(Array[0]);
	    				Temp1.list.insertFirst(Array[1]);
	    				for (int j = 0; j < TempZeros; j++){
	    					Temp1.list.insertFirst(0);
	    				}
	    				TempZeros++;
	    				Temp = Temp.add(Temp1);
	    			}
	    			TempZeros = 0;
	    			for (int k = 0; k < ResultZeros; k++){
	    				Temp.list.insertFirst(0);
	    			}
	    			ResultZeros++;
	    			Results = Results.add(Temp);
	    		}
	    		
	    		if (this.getSign()){ // this is negative
	    			if (i.getSign()){ // i is negative
	    				Results.setSign(false);
	    			}
	    			else { // i is positive
	    				Results.setSign(true);
	    			}
	    		}
	    		else { // this is positive
	    			if (i.getSign()){ // i is negative
	    				Results.setSign(true);
	    			}
	    			else { // i is positive
	    				Results.setSign(false);
	    			}
	    		}
	    	return Results;
	    }
	    
	// Karatsuba (Position P1, Position P2) 
	// This is the most efficient algorithm that is used to handle the multiply operation
	    @SuppressWarnings("static-access")
		public int [] Karatsuba (Position P1, Position P2){
			LongIntUtils utils = new LongIntUtils();
		    	int Z1 = utils.upperHalf(P1.getValue()) * utils.upperHalf(P2.getValue());
		    	int Z3 = utils.lowerHalf(P1.getValue()) * utils.lowerHalf(P2.getValue());
		    	int Z2 = (utils.upperHalf(P1.getValue()) + utils.lowerHalf(P1.getValue())) * (utils.upperHalf(P2.getValue()) + utils.lowerHalf(P2.getValue())) - Z1 - Z3;
		    	
		    	int V1 = Z1 + utils.upperHalf(Z2);
		    	int V2 = Z3 + utils.lowerHalf(Z2) * 10000;

		    	if (utils.overflow(V2) > 0){
		    		V1 = V1 + utils.overflow(V2);
		    		V2 = V2 - 100000000;
		    	}
		    	
		    	int [] Temp = {V1, V2};	
		    	return Temp;
		}
	    
	// power (int p) returns this to the power of p value
	    public LongInt power(int p) {
	    	
	    	LongInt Temp = new LongInt();
	    	
	    	if (p == 0)
	    		return new LongInt("1");
	    	
	    	if (p == 1)
	    		return this;
	    	
	    	if (p % 2 == 0) {
	    		Temp = this.multiply(this);
	    		return Temp.power(p/2);
	    	}
	    	Temp = this.multiply(this);
	    	return this.multiply(Temp.power((p-1)/2));
	    }   
	    
}

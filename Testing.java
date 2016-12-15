public class Testing {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	
		long StartTime = System.currentTimeMillis();
		LongInt A = new LongInt("2222");
		System.out.println("2222");
		A.output();
		System.out.print("\nSign: ( ");System.out.print(A.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + A.getDigitCount() + "\n");
		LongInt B = new LongInt("99999999");
		System.out.println("99999999");
		B.output();
		System.out.print("\nSign: ( ");System.out.print(B.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + B.getDigitCount() + "\n");
		LongInt C = new LongInt("-246813575732");
		System.out.println("-246813575732");
		C.output();
		System.out.print("\nSign: ( ");System.out.print(C.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + C.getDigitCount() + "\n");
		LongInt D = new LongInt("180270361023456789");
		System.out.println("180270361023456789");
		D.output();
		System.out.print("\nSign: ( ");System.out.print(D.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + D.getDigitCount() + "\n");
		LongInt E = new LongInt("1423550000000010056810000054593452907711568359");
		System.out.println("1423550000000010056810000054593452907711568359");
		E.output();
		System.out.print("\nSign: ( ");System.out.print(E.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + E.getDigitCount() + "\n");
		LongInt F = new LongInt("-350003274594847454317890");
		System.out.println("-350003274594847454317890");
		F.output();
		System.out.print("\nSign: ( ");System.out.print(F.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + F.getDigitCount() + "\n");
		LongInt G = new LongInt("29302390234702973402973420937420973420937420937234872349872934872893472893749287423847");
		System.out.println("29302390234702973402973420937420973420937420937234872349872934872893472893749287423847");
		G.output();
		System.out.print("\nSign: ( ");System.out.print(G.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + G.getDigitCount() + "\n");
		LongInt H = new LongInt("-98534342983742987342987339234098230498203894209928374662342342342356723423423");
		System.out.println("-98534342983742987342987339234098230498203894209928374662342342342356723423423");
		H.output();
		System.out.print("\nSign: ( ");System.out.print(H.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + H.getDigitCount() + "\n");
		LongInt I = new LongInt("8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612");
		System.out.println("8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612");
		I.output();
		System.out.print("\nSign: ( ");System.out.print(I.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + I.getDigitCount() + "\n");
		
		long EndTime = System.currentTimeMillis();
		
		long ElpasedTime = EndTime - StartTime;
		System.out.println("Time Elpased : " + ElpasedTime / 1000.0);
		
		int ValueA = 2222;
		int ValueB = 99999999;
		LongIntUtils utils = new LongIntUtils();
		System.out.println("A overflow = " + utils.overflow(ValueA));
		System.out.println("B overflow = " + utils.overflow(ValueB));
		System.out.println("A underflow = " + utils.underflow(ValueA));
		System.out.println("B underflow = " + utils.underflow(ValueB));
		System.out.println("A upperHalf = " + utils.upperHalf(ValueA));
		System.out.println("B upperHalf = " + utils.upperHalf(ValueB));
		System.out.println("A lowerHalf = " + utils.lowerHalf(ValueA));
		System.out.println("B lowerHalf = " + utils.lowerHalf(ValueB));
		System.out.println("A Digits = " + utils.digits(ValueA));
		System.out.println("B Digits = " + utils.digits(ValueB));
		
		System.out.println();
		
		System.out.println(A.equalTo(A) == true ? " A Equal A " : " A Not Equal A");
		System.out.println(A.equalTo(B) == true ? " A Equal B " : " A Not Equal B");
		System.out.println(A.equalTo(C) == true ? " A Equal C " : " A Not Equal C");
		System.out.println(A.equalTo(D) == true ? " A Equal D " : " A Not Equal D");
		System.out.println(A.equalTo(E) == true ? " A Equal E " : " A Not Equal E");
		System.out.println(A.equalTo(F) == true ? " A Equal F " : " A Not Equal F");
		System.out.println(A.equalTo(G) == true ? " A Equal G " : " A Not Equal G");
		System.out.println(A.equalTo(H) == true ? " A Equal H " : " A Not Equal H");
		System.out.println(A.equalTo(I) == true ? " A Equal I " : " A Not Equal I");
		
		System.out.println();
		
		System.out.println(B.equalTo(A) == true ? " B Equal A " : " B Not Equal A");
		System.out.println(B.equalTo(B) == true ? " B Equal B " : " B Not Equal B");
		System.out.println(B.equalTo(C) == true ? " B Equal C " : " B Not Equal C");
		System.out.println(B.equalTo(D) == true ? " B Equal D " : " B Not Equal D");
		System.out.println(B.equalTo(E) == true ? " B Equal E " : " B Not Equal E");
		System.out.println(B.equalTo(F) == true ? " B Equal F " : " B Not Equal F");
		System.out.println(B.equalTo(G) == true ? " B Equal G " : " B Not Equal G");
		System.out.println(B.equalTo(H) == true ? " B Equal H " : " B Not Equal H");
		System.out.println(B.equalTo(I) == true ? " B Equal I " : " B Not Equal I");

		System.out.println();
		
		System.out.println(C.equalTo(A) == true ? " C Equal A " : " C Not Equal A");
		System.out.println(C.equalTo(B) == true ? " C Equal B " : " C Not Equal B");
		System.out.println(C.equalTo(C) == true ? " C Equal C " : " C Not Equal C");
		System.out.println(C.equalTo(D) == true ? " C Equal D " : " C Not Equal D");
		System.out.println(C.equalTo(E) == true ? " C Equal E " : " C Not Equal E");
		System.out.println(C.equalTo(F) == true ? " C Equal F " : " C Not Equal F");
		System.out.println(C.equalTo(G) == true ? " C Equal G " : " C Not Equal G");
		System.out.println(C.equalTo(H) == true ? " C Equal H " : " C Not Equal H");
		System.out.println(C.equalTo(I) == true ? " C Equal I " : " C Not Equal I");
		
		System.out.println();
		
		System.out.println(D.equalTo(A) == true ? " D Equal A " : " D Not Equal A");
		System.out.println(D.equalTo(B) == true ? " D Equal B " : " D Not Equal B");
		System.out.println(D.equalTo(C) == true ? " D Equal C " : " D Not Equal C");
		System.out.println(D.equalTo(D) == true ? " D Equal D " : " D Not Equal D");
		System.out.println(D.equalTo(E) == true ? " D Equal E " : " D Not Equal E");
		System.out.println(D.equalTo(F) == true ? " D Equal F " : " D Not Equal F");
		System.out.println(D.equalTo(G) == true ? " D Equal G " : " D Not Equal G");
		System.out.println(D.equalTo(H) == true ? " D Equal H " : " D Not Equal H");
		System.out.println(D.equalTo(I) == true ? " D Equal I " : " D Not Equal I");

		System.out.println();
		
		System.out.println(E.equalTo(A) == true ? " E Equal A " : " E Not Equal A");
		System.out.println(E.equalTo(B) == true ? " E Equal B " : " E Not Equal B");
		System.out.println(E.equalTo(C) == true ? " E Equal C " : " E Not Equal C");
		System.out.println(E.equalTo(D) == true ? " E Equal D " : " E Not Equal D");
		System.out.println(E.equalTo(E) == true ? " E Equal E " : " E Not Equal E");
		System.out.println(E.equalTo(F) == true ? " E Equal F " : " E Not Equal F");
		System.out.println(E.equalTo(G) == true ? " E Equal G " : " E Not Equal G");
		System.out.println(E.equalTo(H) == true ? " E Equal H " : " E Not Equal H");
		System.out.println(E.equalTo(I) == true ? " E Equal I " : " E Not Equal I");		
		
		System.out.println();
		
		System.out.println(F.equalTo(A) == true ? " F Equal A " : " F Not Equal A");
		System.out.println(F.equalTo(B) == true ? " F Equal B " : " F Not Equal B");
		System.out.println(F.equalTo(C) == true ? " F Equal C " : " F Not Equal C");
		System.out.println(F.equalTo(D) == true ? " F Equal D " : " F Not Equal D");
		System.out.println(F.equalTo(E) == true ? " F Equal E " : " F Not Equal E");
		System.out.println(F.equalTo(F) == true ? " F Equal F " : " F Not Equal F");
		System.out.println(F.equalTo(G) == true ? " F Equal G " : " F Not Equal G");
		System.out.println(F.equalTo(H) == true ? " F Equal H " : " F Not Equal H");
		System.out.println(F.equalTo(I) == true ? " F Equal I " : " F Not Equal I");
		
		System.out.println();
		
		System.out.println(G.equalTo(A) == true ? " G Equal A " : " G Not Equal A");
		System.out.println(G.equalTo(B) == true ? " G Equal B " : " G Not Equal B");
		System.out.println(G.equalTo(C) == true ? " G Equal C " : " G Not Equal C");
		System.out.println(G.equalTo(D) == true ? " G Equal D " : " G Not Equal D");
		System.out.println(G.equalTo(E) == true ? " G Equal E " : " G Not Equal E");
		System.out.println(G.equalTo(F) == true ? " G Equal F " : " G Not Equal F");
		System.out.println(G.equalTo(G) == true ? " G Equal G " : " G Not Equal G");
		System.out.println(G.equalTo(H) == true ? " G Equal H " : " G Not Equal H");
		System.out.println(G.equalTo(I) == true ? " G Equal I " : " G Not Equal I");
		
		System.out.println();
		
		System.out.println(H.equalTo(A) == true ? " H Equal A " : " H Not Equal A");
		System.out.println(H.equalTo(B) == true ? " H Equal B " : " H Not Equal B");
		System.out.println(H.equalTo(C) == true ? " H Equal C " : " H Not Equal C");
		System.out.println(H.equalTo(D) == true ? " H Equal D " : " H Not Equal D");
		System.out.println(H.equalTo(E) == true ? " H Equal E " : " H Not Equal E");
		System.out.println(H.equalTo(F) == true ? " H Equal F " : " H Not Equal F");
		System.out.println(H.equalTo(G) == true ? " H Equal G " : " H Not Equal G");
		System.out.println(H.equalTo(H) == true ? " H Equal H " : " H Not Equal H");
		System.out.println(H.equalTo(I) == true ? " H Equal I " : " H Not Equal I");
		
		System.out.println();
		
		System.out.println(I.equalTo(A) == true ? " I Equal A " : " I Not Equal A");
		System.out.println(I.equalTo(B) == true ? " I Equal B " : " I Not Equal B");
		System.out.println(I.equalTo(C) == true ? " I Equal C " : " I Not Equal C");
		System.out.println(I.equalTo(D) == true ? " I Equal D " : " I Not Equal D");
		System.out.println(I.equalTo(E) == true ? " I Equal E " : " I Not Equal E");
		System.out.println(I.equalTo(F) == true ? " I Equal F " : " I Not Equal F");
		System.out.println(I.equalTo(G) == true ? " I Equal G " : " I Not Equal G");
		System.out.println(I.equalTo(H) == true ? " I Equal H " : " I Not Equal H");
		System.out.println(I.equalTo(I) == true ? " I Equal I " : " I Not Equal I");
		
		System.out.println();
		
		System.out.println(A.lessThan(A) == true ? " A Less than A" : " A Not Less than A");
		System.out.println(A.lessThan(B) == true ? " A Less than B" : " A Not Less than B");
		System.out.println(A.lessThan(C) == true ? " A Less than C" : " A Not Less than C");
		System.out.println(A.lessThan(D) == true ? " A Less than D" : " A Not Less than D");
		System.out.println(A.lessThan(E) == true ? " A Less than E" : " A Not Less than E");
		System.out.println(A.lessThan(F) == true ? " A Less than F" : " A Not Less than F");
		System.out.println(A.lessThan(G) == true ? " A Less than G" : " A Not Less than G");
		System.out.println(A.lessThan(H) == true ? " A Less than H" : " A Not Less than H");
		System.out.println(A.lessThan(I) == true ? " A Less than I" : " A Not Less than I");
		
		System.out.println();
		
		System.out.println(B.lessThan(A) == true ? " B Less than A" : " B Not Less than A");
		System.out.println(B.lessThan(B) == true ? " B Less than B" : " B Not Less than B");
		System.out.println(B.lessThan(C) == true ? " B Less than C" : " B Not Less than C");
		System.out.println(B.lessThan(D) == true ? " B Less than D" : " B Not Less than D");
		System.out.println(B.lessThan(E) == true ? " B Less than E" : " B Not Less than E");
		System.out.println(B.lessThan(F) == true ? " B Less than F" : " B Not Less than F");
		System.out.println(B.lessThan(G) == true ? " B Less than G" : " B Not Less than G");
		System.out.println(B.lessThan(H) == true ? " B Less than H" : " B Not Less than H");
		System.out.println(B.lessThan(I) == true ? " B Less than I" : " B Not Less than I");
		
		System.out.println();
		
		System.out.println(C.lessThan(A) == true ? " C Less than A" : " C Not Less than A");
		System.out.println(C.lessThan(B) == true ? " C Less than B" : " C Not Less than B");
		System.out.println(C.lessThan(C) == true ? " C Less than C" : " C Not Less than C");
		System.out.println(C.lessThan(D) == true ? " C Less than D" : " C Not Less than D");
		System.out.println(C.lessThan(E) == true ? " C Less than E" : " C Not Less than E");
		System.out.println(C.lessThan(F) == true ? " C Less than F" : " C Not Less than F");
		System.out.println(C.lessThan(G) == true ? " C Less than G" : " C Not Less than G");
		System.out.println(C.lessThan(H) == true ? " C Less than H" : " C Not Less than H");
		System.out.println(C.lessThan(I) == true ? " C Less than I" : " C Not Less than I");
		
		System.out.println();
		
		System.out.println(D.lessThan(A) == true ? " D Less than A" : " D Not Less than A");
		System.out.println(D.lessThan(B) == true ? " D Less than B" : " D Not Less than B");
		System.out.println(D.lessThan(C) == true ? " D Less than C" : " D Not Less than C");
		System.out.println(D.lessThan(D) == true ? " D Less than D" : " D Not Less than D");
		System.out.println(D.lessThan(E) == true ? " D Less than E" : " D Not Less than E");
		System.out.println(D.lessThan(F) == true ? " D Less than F" : " D Not Less than F");
		System.out.println(D.lessThan(G) == true ? " D Less than G" : " D Not Less than G");
		System.out.println(D.lessThan(H) == true ? " D Less than H" : " D Not Less than H");
		System.out.println(D.lessThan(I) == true ? " D Less than I" : " D Not Less than I");

		System.out.println();
		
		System.out.println(E.lessThan(A) == true ? " E Less than A" : " E Not Less than A");
		System.out.println(E.lessThan(B) == true ? " E Less than B" : " E Not Less than B");
		System.out.println(E.lessThan(C) == true ? " E Less than C" : " E Not Less than C");
		System.out.println(E.lessThan(D) == true ? " E Less than D" : " E Not Less than D");
		System.out.println(E.lessThan(E) == true ? " E Less than E" : " E Not Less than E");
		System.out.println(E.lessThan(F) == true ? " E Less than F" : " E Not Less than F");
		System.out.println(E.lessThan(G) == true ? " E Less than G" : " E Not Less than G");
		System.out.println(E.lessThan(H) == true ? " E Less than H" : " E Not Less than H");
		System.out.println(E.lessThan(I) == true ? " E Less than I" : " E Not Less than I");
		
		System.out.println();
		
		System.out.println(F.lessThan(A) == true ? " F Less than A" : " F Not Less than A");
		System.out.println(F.lessThan(B) == true ? " F Less than B" : " F Not Less than B");
		System.out.println(F.lessThan(C) == true ? " F Less than C" : " F Not Less than C");
		System.out.println(F.lessThan(D) == true ? " F Less than D" : " F Not Less than D");
		System.out.println(F.lessThan(E) == true ? " F Less than E" : " F Not Less than E");
		System.out.println(F.lessThan(F) == true ? " F Less than F" : " F Not Less than F");
		System.out.println(F.lessThan(G) == true ? " F Less than G" : " F Not Less than G");
		System.out.println(F.lessThan(H) == true ? " F Less than H" : " F Not Less than H");
		System.out.println(F.lessThan(I) == true ? " F Less than I" : " F Not Less than I");
		
		System.out.println();
		
		System.out.println(G.lessThan(A) == true ? " G Less than A" : " G Not Less than A");
		System.out.println(G.lessThan(B) == true ? " G Less than B" : " G Not Less than B");
		System.out.println(G.lessThan(C) == true ? " G Less than C" : " G Not Less than C");
		System.out.println(G.lessThan(D) == true ? " G Less than D" : " G Not Less than D");
		System.out.println(G.lessThan(E) == true ? " G Less than E" : " G Not Less than E");
		System.out.println(G.lessThan(F) == true ? " G Less than F" : " G Not Less than F");
		System.out.println(G.lessThan(G) == true ? " G Less than G" : " G Not Less than G");
		System.out.println(G.lessThan(H) == true ? " G Less than H" : " G Not Less than H");
		System.out.println(G.lessThan(I) == true ? " G Less than I" : " G Not Less than I");		
	
		System.out.println();
		
		System.out.println(H.lessThan(A) == true ? " H Less than A" : " H Not Less than A");
		System.out.println(H.lessThan(B) == true ? " H Less than B" : " H Not Less than B");
		System.out.println(H.lessThan(C) == true ? " H Less than C" : " H Not Less than C");
		System.out.println(H.lessThan(D) == true ? " H Less than D" : " H Not Less than D");
		System.out.println(H.lessThan(E) == true ? " H Less than E" : " H Not Less than E");
		System.out.println(H.lessThan(F) == true ? " H Less than F" : " H Not Less than F");
		System.out.println(H.lessThan(G) == true ? " H Less than G" : " H Not Less than G");
		System.out.println(H.lessThan(H) == true ? " H Less than H" : " H Not Less than H");
		System.out.println(H.lessThan(I) == true ? " H Less than I" : " H Not Less than I");		
		
		System.out.println();
		
		System.out.println(I.lessThan(A) == true ? " I Less than A" : " I Not Less than A");
		System.out.println(I.lessThan(B) == true ? " I Less than B" : " I Not Less than B");
		System.out.println(I.lessThan(C) == true ? " I Less than C" : " I Not Less than C");
		System.out.println(I.lessThan(D) == true ? " I Less than D" : " I Not Less than D");
		System.out.println(I.lessThan(E) == true ? " I Less than E" : " I Not Less than E");
		System.out.println(I.lessThan(F) == true ? " I Less than F" : " I Not Less than F");
		System.out.println(I.lessThan(G) == true ? " I Less than G" : " I Not Less than G");
		System.out.println(I.lessThan(H) == true ? " I Less than H" : " I Not Less than H");
		System.out.println(I.lessThan(I) == true ? " I Less than I" : " I Not Less than I");
		
		System.out.println();
		
		System.out.println(A.greaterThan(A) == true ? " A Greater Than A" : " A Not Greater than A");
		System.out.println(A.greaterThan(B) == true ? " A Greater Than B" : " A Not Greater than B");
		System.out.println(A.greaterThan(C) == true ? " A Greater Than C" : " A Not Greater than C");
		System.out.println(A.greaterThan(D) == true ? " A Greater Than D" : " A Not Greater than D");
		System.out.println(A.greaterThan(E) == true ? " A Greater Than E" : " A Not Greater than E");
		System.out.println(A.greaterThan(F) == true ? " A Greater Than F" : " A Not Greater than F");
		System.out.println(A.greaterThan(G) == true ? " A Greater Than G" : " A Not Greater than G");
		System.out.println(A.greaterThan(H) == true ? " A Greater Than H" : " A Not Greater than H");
		System.out.println(A.greaterThan(I) == true ? " A Greater Than I" : " A Not Greater than I");
		
		System.out.println();
		
		System.out.println(B.greaterThan(A) == true ? " B Greater Than A" : " B Not Greater than A");
		System.out.println(B.greaterThan(B) == true ? " B Greater Than B" : " B Not Greater than B");
		System.out.println(B.greaterThan(C) == true ? " B Greater Than C" : " B Not Greater than C");
		System.out.println(B.greaterThan(D) == true ? " B Greater Than D" : " B Not Greater than D");
		System.out.println(B.greaterThan(E) == true ? " B Greater Than E" : " B Not Greater than E");
		System.out.println(B.greaterThan(F) == true ? " B Greater Than F" : " B Not Greater than F");
		System.out.println(B.greaterThan(G) == true ? " B Greater Than G" : " B Not Greater than G");
		System.out.println(B.greaterThan(H) == true ? " B Greater Than H" : " B Not Greater than H");
		System.out.println(B.greaterThan(I) == true ? " B Greater Than I" : " B Not Greater than I");
		
		System.out.println();
		
		System.out.println(C.greaterThan(A) == true ? " C Greater Than A" : " C Not Greater than A");
		System.out.println(C.greaterThan(B) == true ? " C Greater Than B" : " C Not Greater than B");
		System.out.println(C.greaterThan(C) == true ? " C Greater Than C" : " C Not Greater than C");
		System.out.println(C.greaterThan(D) == true ? " C Greater Than D" : " C Not Greater than D");
		System.out.println(C.greaterThan(E) == true ? " C Greater Than E" : " C Not Greater than E");
		System.out.println(C.greaterThan(F) == true ? " C Greater Than F" : " C Not Greater than F");
		System.out.println(C.greaterThan(G) == true ? " C Greater Than G" : " C Not Greater than G");
		System.out.println(C.greaterThan(H) == true ? " C Greater Than H" : " C Not Greater than H");
		System.out.println(C.greaterThan(I) == true ? " C Greater Than I" : " C Not Greater than I");
		
		System.out.println();
		
		System.out.println(D.greaterThan(A) == true ? " D Greater Than A" : " D Not Greater than A");
		System.out.println(D.greaterThan(B) == true ? " D Greater Than B" : " D Not Greater than B");
		System.out.println(D.greaterThan(C) == true ? " D Greater Than C" : " D Not Greater than C");
		System.out.println(D.greaterThan(D) == true ? " D Greater Than D" : " D Not Greater than D");
		System.out.println(D.greaterThan(E) == true ? " D Greater Than E" : " D Not Greater than E");
		System.out.println(D.greaterThan(F) == true ? " D Greater Than F" : " D Not Greater than F");
		System.out.println(D.greaterThan(G) == true ? " D Greater Than G" : " D Not Greater than G");
		System.out.println(D.greaterThan(H) == true ? " D Greater Than H" : " D Not Greater than H");
		System.out.println(D.greaterThan(I) == true ? " D Greater Than I" : " D Not Greater than I");
		
		System.out.println();
		
		System.out.println(E.greaterThan(A) == true ? " E Greater Than A" : " E Not Greater than A");
		System.out.println(E.greaterThan(B) == true ? " E Greater Than B" : " E Not Greater than B");
		System.out.println(E.greaterThan(C) == true ? " E Greater Than C" : " E Not Greater than C");
		System.out.println(E.greaterThan(D) == true ? " E Greater Than D" : " E Not Greater than D");
		System.out.println(E.greaterThan(E) == true ? " E Greater Than E" : " E Not Greater than E");
		System.out.println(E.greaterThan(F) == true ? " E Greater Than F" : " E Not Greater than F");
		System.out.println(E.greaterThan(G) == true ? " E Greater Than G" : " E Not Greater than G");
		System.out.println(E.greaterThan(H) == true ? " E Greater Than H" : " E Not Greater than H");
		System.out.println(E.greaterThan(I) == true ? " E Greater Than I" : " E Not Greater than I");
		
		System.out.println();
		
		System.out.println(F.greaterThan(A) == true ? " F Greater Than A" : " F Not Greater than A");
		System.out.println(F.greaterThan(B) == true ? " F Greater Than B" : " F Not Greater than B");
		System.out.println(F.greaterThan(C) == true ? " F Greater Than C" : " F Not Greater than C");
		System.out.println(F.greaterThan(D) == true ? " F Greater Than D" : " F Not Greater than D");
		System.out.println(F.greaterThan(E) == true ? " F Greater Than E" : " F Not Greater than E");
		System.out.println(F.greaterThan(F) == true ? " F Greater Than F" : " F Not Greater than F");
		System.out.println(F.greaterThan(G) == true ? " F Greater Than G" : " F Not Greater than G");
		System.out.println(F.greaterThan(H) == true ? " F Greater Than H" : " F Not Greater than H");
		System.out.println(F.greaterThan(I) == true ? " F Greater Than I" : " F Not Greater than I");
		
		System.out.println();
		
		System.out.println(G.greaterThan(A) == true ? " G Greater Than A" : " G Not Greater than A");
		System.out.println(G.greaterThan(B) == true ? " G Greater Than B" : " G Not Greater than B");
		System.out.println(G.greaterThan(C) == true ? " G Greater Than C" : " G Not Greater than C");
		System.out.println(G.greaterThan(D) == true ? " G Greater Than D" : " G Not Greater than D");
		System.out.println(G.greaterThan(E) == true ? " G Greater Than E" : " G Not Greater than E");
		System.out.println(G.greaterThan(F) == true ? " G Greater Than F" : " G Not Greater than F");
		System.out.println(G.greaterThan(G) == true ? " G Greater Than G" : " G Not Greater than G");
		System.out.println(G.greaterThan(H) == true ? " G Greater Than H" : " G Not Greater than H");
		System.out.println(G.greaterThan(I) == true ? " G Greater Than I" : " G Not Greater than I");
		
		System.out.println();
		
		System.out.println(H.greaterThan(A) == true ? " H Greater Than A" : " H Not Greater than A");
		System.out.println(H.greaterThan(B) == true ? " H Greater Than B" : " H Not Greater than B");
		System.out.println(H.greaterThan(C) == true ? " H Greater Than C" : " H Not Greater than C");
		System.out.println(H.greaterThan(D) == true ? " H Greater Than D" : " H Not Greater than D");
		System.out.println(H.greaterThan(E) == true ? " H Greater Than E" : " H Not Greater than E");
		System.out.println(H.greaterThan(F) == true ? " H Greater Than F" : " H Not Greater than F");
		System.out.println(H.greaterThan(G) == true ? " H Greater Than G" : " H Not Greater than G");
		System.out.println(H.greaterThan(H) == true ? " H Greater Than H" : " H Not Greater than H");
		System.out.println(H.greaterThan(I) == true ? " H Greater Than I" : " H Not Greater than I");
		
		System.out.println();
		
		System.out.println(I.greaterThan(A) == true ? " I Greater Than A" : " I Not Greater than A");
		System.out.println(I.greaterThan(B) == true ? " I Greater Than B" : " I Not Greater than B");
		System.out.println(I.greaterThan(C) == true ? " I Greater Than C" : " I Not Greater than C");
		System.out.println(I.greaterThan(D) == true ? " I Greater Than D" : " I Not Greater than D");
		System.out.println(I.greaterThan(E) == true ? " I Greater Than E" : " I Not Greater than E");
		System.out.println(I.greaterThan(F) == true ? " I Greater Than F" : " I Not Greater than F");
		System.out.println(I.greaterThan(G) == true ? " I Greater Than G" : " I Not Greater than G");
		System.out.println(I.greaterThan(H) == true ? " I Greater Than H" : " I Not Greater than H");
		System.out.println(I.greaterThan(I) == true ? " I Greater Than I" : " I Not Greater than I");

		System.out.println();
			
		LongInt Add1 = A.add(A);
		System.out.println("A + A =");
		Add1.output();
		System.out.print("\nSign: ( ");System.out.print(Add1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add2 = A.add(B);
		System.out.println("A + B =");
		Add2.output();
		System.out.print("\nSign: ( ");System.out.print(Add2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add3 = A.add(C);
		System.out.println("A + C =");
		Add3.output();
		System.out.print("\nSign: ( ");System.out.print(Add3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add4 = A.add(D);
		System.out.println("A + D =");
		Add4.output();
		System.out.print("\nSign: ( ");System.out.print(Add4.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add5 = A.add(E);
		System.out.println("A + E =");
		Add5.output();
		System.out.print("\nSign: ( ");System.out.print(Add5.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add6 = A.add(F);
		System.out.println("A + F =");
		Add6.output();
		System.out.print("\nSign: ( ");System.out.print(Add6.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add7 = A.add(G);
		System.out.println("A + G =");
		Add7.output();
		System.out.print("\nSign: ( ");System.out.print(Add7.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add8 = A.add(H);
		System.out.println("A + H =");
		Add8.output();
		System.out.print("\nSign: ( ");System.out.print(Add8.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add9 = A.add(I);
		System.out.println("A + I =");
		Add9.output();
		System.out.print("\nSign: ( ");System.out.print(Add9.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add10 = B.add(A);
		System.out.println("B + A =");
		Add10.output();
		System.out.print("\nSign: ( ");System.out.print(Add10.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add11 = B.add(B);
		System.out.println("B + B =");
		Add11.output();
		System.out.print("\nSign: ( ");System.out.print(Add11.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add12 = B.add(C);
		System.out.println("B + C =");
		Add12.output();
		System.out.print("\nSign: ( ");System.out.print(Add12.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add13 = B.add(D);
		System.out.println("B + D =");
		Add13.output();
		System.out.print("\nSign: ( ");System.out.print(Add13.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add14 = B.add(E);
		System.out.println("B + E =");
		Add14.output();
		System.out.print("\nSign: ( ");System.out.print(Add14.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add15 = B.add(F);
		System.out.println("B + F =");
		Add15.output();
		System.out.print("\nSign: ( ");System.out.print(Add15.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add16 = B.add(G);
		System.out.println("B + G =");
		Add16.output();
		System.out.print("\nSign: ( ");System.out.print(Add16.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add17 = B.add(H);
		System.out.println("B + H =");
		Add17.output();
		System.out.print("\nSign: ( ");System.out.print(Add17.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add18 = B.add(I);
		System.out.println("B + I =");
		Add18.output();
		System.out.print("\nSign: ( ");System.out.print(Add18.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add19 = C.add(A);
		System.out.println("C + A =");
		Add19.output();
		System.out.print("\nSign: ( ");System.out.print(Add19.getSign() == false ? "+" : "-");System.out.println(" )\n");

		LongInt Add20 = C.add(B);
		System.out.println("C + B =");
		Add20.output();
		System.out.print("\nSign: ( ");System.out.print(Add20.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add21 = C.add(C);
		System.out.println("C + C =");
		Add21.output();
		System.out.print("\nSign: ( ");System.out.print(Add21.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add22 = C.add(D);
		System.out.println("C + D =");
		Add22.output();
		System.out.print("\nSign: ( ");System.out.print(Add22.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add23 = C.add(E);
		System.out.println("C + E =");
		Add23.output();
		System.out.print("\nSign: ( ");System.out.print(Add23.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add24 = C.add(F);
		System.out.println("C + F =");
		Add24.output();
		System.out.print("\nSign: ( ");System.out.print(Add24.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add25 = C.add(G);
		System.out.println("C + G =");
		Add25.output();
		System.out.print("\nSign: ( ");System.out.print(Add25.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add26 = C.add(H);
		System.out.println("C + H =");
		Add26.output();
		System.out.print("\nSign: ( ");System.out.print(Add26.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add27 = C.add(I);
		System.out.println("C + I =");
		Add27.output();
		System.out.print("\nSign: ( ");System.out.print(Add27.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add28 = D.add(A);
		System.out.println("D + A =");
		Add28.output();
		System.out.print("\nSign: ( ");System.out.print(Add28.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add29 = D.add(B);
		System.out.println("D + B =");
		Add29.output();
		System.out.print("\nSign: ( ");System.out.print(Add29.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add30 = D.add(C);
		System.out.println("D + C =");
		Add30.output();
		System.out.print("\nSign: ( ");System.out.print(Add30.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add31 = D.add(D);
		System.out.println("D + D =");
		Add31.output();
		System.out.print("\nSign: ( ");System.out.print(Add31.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add32 = D.add(E);
		System.out.println("D + E =");
		Add32.output();
		System.out.print("\nSign: ( ");System.out.print(Add32.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add33 = D.add(F);
		System.out.println("D + F =");
		Add33.output();
		System.out.print("\nSign: ( ");System.out.print(Add33.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add34 = D.add(G);
		System.out.println("D + G =");
		Add34.output();
		System.out.print("\nSign: ( ");System.out.print(Add34.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add35 = D.add(H);
		System.out.println("D + H =");
		Add35.output();
		System.out.print("\nSign: ( ");System.out.print(Add35.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add36 = D.add(I);
		System.out.println("D + I =");
		Add36.output();
		System.out.print("\nSign: ( ");System.out.print(Add36.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add37 = E.add(A);
		System.out.println("E + A =");
		Add37.output();
		System.out.print("\nSign: ( ");System.out.print(Add37.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add38 = E.add(B);
		System.out.println("E + B =");
		Add38.output();
		System.out.print("\nSign: ( ");System.out.print(Add38.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add39 = E.add(C);
		System.out.println("E + C =");
		Add39.output();
		System.out.print("\nSign: ( ");System.out.print(Add39.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add40 = E.add(D);
		System.out.println("E + D =");
		Add40.output();
		System.out.print("\nSign: ( ");System.out.print(Add40.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add41 = E.add(E);
		System.out.println("E + E =");
		Add41.output();
		System.out.print("\nSign: ( ");System.out.print(Add41.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add42 = E.add(F);
		System.out.println("E + F =");
		Add42.output();
		System.out.print("\nSign: ( ");System.out.print(Add42.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add43 = E.add(G);
		System.out.println("E + G =");
		Add43.output();
		System.out.print("\nSign: ( ");System.out.print(Add43.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add44 = E.add(H);
		System.out.println("E + H =");
		Add44.output();
		System.out.print("\nSign: ( ");System.out.print(Add44.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add45 = E.add(I);
		System.out.println("E + I =");
		Add45.output();
		System.out.print("\nSign: ( ");System.out.print(Add45.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add46 = F.add(A);
		System.out.println("F + A =");
		Add46.output();
		System.out.print("\nSign: ( ");System.out.print(Add46.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add47 = F.add(B);
		System.out.println("F + B =");
		Add47.output();
		System.out.print("\nSign: ( ");System.out.print(Add47.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add48 = F.add(C);
		System.out.println("F + C =");
		Add48.output();
		System.out.print("\nSign: ( ");System.out.print(Add48.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add49 = F.add(D);
		System.out.println("F + D =");
		Add49.output();
		System.out.print("\nSign: ( ");System.out.print(Add49.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add50 = F.add(E);
		System.out.println("F + E =");
		Add50.output();
		System.out.print("\nSign: ( ");System.out.print(Add50.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add51 = F.add(F);
		System.out.println("F + F =");
		Add51.output();
		System.out.print("\nSign: ( ");System.out.print(Add51.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add52 = F.add(G);
		System.out.println("F + G =");
		Add52.output();
		System.out.print("\nSign: ( ");System.out.print(Add52.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add53 = F.add(H);
		System.out.println("F + H =");
		Add53.output();
		System.out.print("\nSign: ( ");System.out.print(Add53.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add54 = F.add(I);
		System.out.println("F + I =");
		Add54.output();
		System.out.print("\nSign: ( ");System.out.print(Add54.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add55 = G.add(A);
		System.out.println("G + A =");
		Add55.output();
		System.out.print("\nSign: ( ");System.out.print(Add55.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add56 = G.add(B);
		System.out.println("G + B =");
		Add56.output();
		System.out.print("\nSign: ( ");System.out.print(Add56.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add57 = G.add(C);
		System.out.println("G + C =");
		Add57.output();
		System.out.print("\nSign: ( ");System.out.print(Add57.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add58 = G.add(D);
		System.out.println("G + D =");
		Add58.output();
		System.out.print("\nSign: ( ");System.out.print(Add58.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add59 = G.add(E);
		System.out.println("G + E =");
		Add59.output();
		System.out.print("\nSign: ( ");System.out.print(Add59.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add60 = G.add(F);
		System.out.println("G + F =");
		Add60.output();
		System.out.print("\nSign: ( ");System.out.print(Add60.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add61 = G.add(G);
		System.out.println("G + G =");
		Add61.output();
		System.out.print("\nSign: ( ");System.out.print(Add61.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add62 = G.add(H);
		System.out.println("G + H =");
		Add62.output();
		System.out.print("\nSign: ( ");System.out.print(Add62.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add63 = G.add(I);
		System.out.println("G + I =");
		Add63.output();
		System.out.print("\nSign: ( ");System.out.print(Add63.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add64 = H.add(A);
		System.out.println("H + A =");
		Add64.output();
		System.out.print("\nSign: ( ");System.out.print(Add64.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add65 = H.add(B);
		System.out.println("H + B =");
		Add65.output();
		System.out.print("\nSign: ( ");System.out.print(Add65.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add66 = H.add(C);
		System.out.println("H + C =");
		Add66.output();
		System.out.print("\nSign: ( ");System.out.print(Add66.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add67 = H.add(D);
		System.out.println("H + D =");
		Add67.output();
		System.out.print("\nSign: ( ");System.out.print(Add67.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add68 = H.add(E);
		System.out.println("H + E =");
		Add68.output();
		System.out.print("\nSign: ( ");System.out.print(Add68.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add69 = H.add(F);
		System.out.println("H + F =");
		Add69.output();
		System.out.print("\nSign: ( ");System.out.print(Add69.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add70 = H.add(G);
		System.out.println("H + G =");
		Add70.output();
		System.out.print("\nSign: ( ");System.out.print(Add70.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add71 = H.add(H);
		System.out.println("H + H =");
		Add71.output();
		System.out.print("\nSign: ( ");System.out.print(Add71.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add72 = H.add(I);
		System.out.println("H + I =");
		Add72.output();
		System.out.print("\nSign: ( ");System.out.print(Add72.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add73 = I.add(A);
		System.out.println("I + A =");
		Add73.output();
		System.out.print("\nSign: ( ");System.out.print(Add73.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add74 = I.add(B);
		System.out.println("I + B =");
		Add74.output();
		System.out.print("\nSign: ( ");System.out.print(Add74.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add75 = I.add(C);
		System.out.println("I + C =");
		Add75.output();
		System.out.print("\nSign: ( ");System.out.print(Add75.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add76 = I.add(D);
		System.out.println("I + D =");
		Add76.output();
		System.out.print("\nSign: ( ");System.out.print(Add76.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add77 = I.add(E);
		System.out.println("I + E =");
		Add77.output();
		System.out.print("\nSign: ( ");System.out.print(Add77.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add78 = I.add(F);
		System.out.println("I + F =");
		Add78.output();
		System.out.print("\nSign: ( ");System.out.print(Add78.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add79 = I.add(G);
		System.out.println("I + G =");
		Add79.output();
		System.out.print("\nSign: ( ");System.out.print(Add79.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add80 = I.add(H);
		System.out.println("I + H =");
		Add80.output();
		System.out.print("\nSign: ( ");System.out.print(Add80.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Add81 = I.add(I);
		System.out.println("I + I =");
		Add81.output();
		System.out.print("\nSign: ( ");System.out.print(Add81.getSign() == false ? "+" : "-");System.out.println(" )\n");
				
		LongInt Subtract1 = A.subtract(A);
		System.out.println("A - A =");
		Subtract1.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract2 = A.subtract(B);
		System.out.println("A - B =");
		Subtract2.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract3 = A.subtract(C);
		System.out.println("A - C =");
		Subtract3.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract4 = A.subtract(D);
		System.out.println("A - D =");
		Subtract4.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract4.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract5 = A.subtract(E);
		System.out.println("A - E =");
		Subtract5.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract5.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract6 = A.subtract(F);
		System.out.println("A - F =");
		Subtract6.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract6.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract7 = A.subtract(G);
		System.out.println("A - G =");
		Subtract7.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract7.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract8 = A.subtract(H);
		System.out.println("A - H =");
		Subtract8.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract8.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract9 = A.subtract(I);
		System.out.println("A - I =");
		Subtract9.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract9.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract10 = B.subtract(A);
		System.out.println("B - A =");
		Subtract10.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract10.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract11 = B.subtract(B);
		System.out.println("B - B =");
		Subtract11.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract11.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract12 = B.subtract(C);
		System.out.println("B - C =");
		Subtract12.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract12.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract13 = B.subtract(D);
		System.out.println("B - D =");
		Subtract13.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract13.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract14 = B.subtract(E);
		System.out.println("B - E =");
		Subtract14.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract14.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract15 = B.subtract(F);
		System.out.println("B - F =");
		Subtract15.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract15.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract16 = B.subtract(G);
		System.out.println("B - G =");
		Subtract16.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract16.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract17 = B.subtract(H);
		System.out.println("B - H =");
		Subtract17.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract17.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract18 = B.subtract(I);
		System.out.println("B - I =");
		Subtract18.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract18.getSign() == false ? "+" : "-");System.out.println(" )\n");
	
		LongInt Subtract19 = C.subtract(A);
		System.out.println("C - A =");
		Subtract19.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract19.getSign() == false ? "+" : "-");System.out.println(" )\n");

		LongInt Subtract20 = C.subtract(B);
		System.out.println("C - B =");
		Subtract20.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract20.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract21 = C.subtract(C);
		System.out.println("C - C =");
		Subtract21.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract21.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract22 = C.subtract(D);
		System.out.println("C - D =");
		Subtract22.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract22.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract23 = C.subtract(E);
		System.out.println("C - E =");
		Subtract23.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract23.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract24 = C.subtract(F);
		System.out.println("C - F =");
		Subtract24.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract24.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract25 = C.subtract(G);
		System.out.println("C - G =");
		Subtract25.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract25.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract26 = C.subtract(H);
		System.out.println("C - H =");
		Subtract26.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract26.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract27 = C.subtract(I);
		System.out.println("C - I =");
		Subtract27.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract27.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract28 = D.subtract(A);
		System.out.println("D - A =");
		Subtract28.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract28.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract29 = D.subtract(B);
		System.out.println("D - B =");
		Subtract29.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract29.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract30 = D.subtract(C);
		System.out.println("D - C =");
		Subtract30.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract30.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract31 = D.subtract(D);
		System.out.println("D - D =");
		Subtract31.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract31.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract32 = D.subtract(E);
		System.out.println("D - E =");
		Subtract32.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract32.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract33 = D.subtract(F);
		System.out.println("D - F =");
		Subtract33.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract33.getSign() == false ? "+" : "-");System.out.println(" )\n");
			
		LongInt Subtract34 = D.subtract(G);
		System.out.println("D - G =");
		Subtract34.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract34.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract35 = D.subtract(H);
		System.out.println("D - H =");
		Subtract35.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract35.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract36 = D.subtract(I);
		System.out.println("D - I =");
		Subtract36.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract36.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract37 = E.subtract(A);
		System.out.println("E - A =");
		Subtract37.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract37.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract38 = E.subtract(B);
		System.out.println("E - B =");
		Subtract38.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract38.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract39 = E.subtract(C);
		System.out.println("E - C =");
		Subtract39.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract39.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract40 = E.subtract(D);
		System.out.println("E - D =");
		Subtract40.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract40.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract41 = E.subtract(E);
		System.out.println("E - E =");
		Subtract41.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract41.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract42 = E.subtract(F);
		System.out.println("E - F =");
		Subtract42.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract42.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract43 = E.subtract(G);
		System.out.println("E - G =");
		Subtract43.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract43.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract44 = E.subtract(H);
		System.out.println("E - H =");
		Subtract44.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract44.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract45 = E.subtract(I);
		System.out.println("E - I =");
		Subtract45.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract45.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract46 = F.subtract(A);
		System.out.println("F - A =");
		Subtract46.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract46.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract47 = F.subtract(B);
		System.out.println("F - B =");
		Subtract47.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract47.getSign() == false ? "+" : "-");System.out.println(" )\n");
	
		LongInt Subtract48 = F.subtract(C);
		System.out.println("F - C =");
		Subtract48.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract48.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract49 = F.subtract(D);
		System.out.println("F - D =");
		Subtract49.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract49.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract50 = F.subtract(E);
		System.out.println("F - E =");
		Subtract50.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract50.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract51 = F.subtract(F);
		System.out.println("F - F =");
		Subtract51.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract51.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract52 = F.subtract(G);
		System.out.println("F - G =");
		Subtract52.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract52.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract53 = F.subtract(H);
		System.out.println("F - H =");
		Subtract53.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract53.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract54 = F.subtract(I);
		System.out.println("F - I =");
		Subtract54.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract54.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract55 = G.subtract(A);
		System.out.println("G - A =");
		Subtract55.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract55.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract56 = G.subtract(B);
		System.out.println("G - B =");
		Subtract56.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract56.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract57 = G.subtract(C);
		System.out.println("G - C =");
		Subtract57.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract57.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract58 = G.subtract(D);
		System.out.println("G - D =");
		Subtract58.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract58.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract59 = G.subtract(E);
		System.out.println("G - E =");
		Subtract59.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract59.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract60 = G.subtract(F);
		System.out.println("G - F =");
		Subtract60.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract60.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract61 = G.subtract(G);
		System.out.println("G - G =");
		Subtract61.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract61.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract62 = G.subtract(H);
		System.out.println("G - H =");
		Subtract62.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract62.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract63 = G.subtract(I);
		System.out.println("G - I =");
		Subtract63.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract63.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract64 = H.subtract(A);
		System.out.println("H - A =");
		Subtract64.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract64.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract65 = H.subtract(B);
		System.out.println("H - B =");
		Subtract65.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract65.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract66 = H.subtract(C);
		System.out.println("H - C =");
		Subtract66.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract66.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract67 = H.subtract(D);
		System.out.println("H - D =");
		Subtract67.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract67.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract68 = H.subtract(E);
		System.out.println("H - E =");
		Subtract68.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract68.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract69 = H.subtract(F);
		System.out.println("H - F =");
		Subtract69.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract69.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract70 = H.subtract(G);
		System.out.println("H - G =");
		Subtract70.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract70.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract71 = H.subtract(H);
		System.out.println("H - H =");
		Subtract71.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract71.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract72 = H.subtract(I);
		System.out.println("H - I =");
		Subtract72.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract72.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract73 = I.subtract(A);
		System.out.println("I - A =");
		Subtract73.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract73.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract74 = I.subtract(B);
		System.out.println("I - B =");
		Subtract74.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract74.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract75 = I.subtract(C);
		System.out.println("I - C =");
		Subtract75.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract75.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract76 = I.subtract(D);
		System.out.println("I - D =");
		Subtract76.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract76.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract77 = I.subtract(E);
		System.out.println("I - E =");
		Subtract77.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract77.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract78 = I.subtract(F);
		System.out.println("I - F =");
		Subtract78.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract78.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract79 = I.subtract(G);
		System.out.println("I - G =");
		Subtract79.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract79.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract80 = I.subtract(H);
		System.out.println("I - H =");
		Subtract80.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract80.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Subtract81 = I.subtract(I);
		System.out.println("I - I =");
		Subtract81.output();
		System.out.print("\nSign: ( ");System.out.print(Subtract81.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply1 = A.multiply(A);
		System.out.println("A * A =");
		Multiply1.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply2 = A.multiply(B);
		System.out.println("A * B =");
		Multiply2.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply3 = A.multiply(C);
		System.out.println("A * C =");
		Multiply3.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply4 = A.multiply(D);
		System.out.println("A * D =");
		Multiply4.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply4.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply5 = A.multiply(E);
		System.out.println("A * E =");
		Multiply5.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply5.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply6 = A.multiply(F);
		System.out.println("A * F =");
		Multiply6.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply6.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply7 = A.multiply(G);
		System.out.println("A * G =");
		Multiply7.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply7.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply8 = A.multiply(H);
		System.out.println("A * H =");
		Multiply8.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply8.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply9 = A.multiply(I);
		System.out.println("A * I =");
		Multiply9.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply9.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply10 = B.multiply(A);
		System.out.println("B * A =");
		Multiply10.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply10.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply11 = B.multiply(B);
		System.out.println("B * B =");
		Multiply11.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply11.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply12 = B.multiply(C);
		System.out.println("B * C =");
		Multiply12.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply12.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply13 = B.multiply(D);
		System.out.println("B * D =");
		Multiply13.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply13.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply14 = B.multiply(E);
		System.out.println("B * E =");
		Multiply14.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply14.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply15 = B.multiply(F);
		System.out.println("B * F =");
		Multiply15.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply15.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply16 = B.multiply(G);
		System.out.println("B * G =");
		Multiply16.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply16.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply17 = B.multiply(H);
		System.out.println("B * H =");
		Multiply17.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply17.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply18 = B.multiply(I);
		System.out.println("B * I =");
		Multiply18.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply18.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply19 = C.multiply(A);
		System.out.println("C * A =");
		Multiply19.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply19.getSign() == false ? "+" : "-");System.out.println(" )\n");

		LongInt Multiply20 = C.multiply(B);
		System.out.println("C * B =");
		Multiply20.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply20.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply21 = C.multiply(C);
		System.out.println("C * C =");
		Multiply21.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply21.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply22 = C.multiply(D);
		System.out.println("C * D =");
		Multiply22.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply22.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply23 = C.multiply(E);
		System.out.println("C * E =");
		Multiply23.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply23.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply24 = C.multiply(F);
		System.out.println("C * F =");
		Multiply24.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply24.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply25 = C.multiply(G);
		System.out.println("C * G =");
		Multiply25.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply25.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply26 = C.multiply(H);
		System.out.println("C * H =");
		Multiply26.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply26.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply27 = C.multiply(I);
		System.out.println("C * I =");
		Multiply27.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply27.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply28 = D.multiply(A);
		System.out.println("D * A =");
		Multiply28.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply28.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply29 = D.multiply(B);
		System.out.println("D * B =");
		Multiply29.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply29.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply30 = D.multiply(C);
		System.out.println("D * C =");
		Multiply30.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply30.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply31 = D.multiply(D);
		System.out.println("D * D =");
		Multiply31.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply31.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply32 = D.multiply(E);
		System.out.println("D * E =");
		Multiply32.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply32.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply33 = D.multiply(F);
		System.out.println("D * F =");
		Multiply33.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply33.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply34 = D.multiply(G);
		System.out.println("D * G =");
		Multiply34.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply34.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply35 = D.multiply(H);
		System.out.println("D * H =");
		Multiply35.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply35.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply36 = D.multiply(I);
		System.out.println("D * I =");
		Multiply36.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply36.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply37 = E.multiply(A);
		System.out.println("E * A =");
		Multiply37.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply37.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply38 = E.multiply(B);
		System.out.println("E * B =");
		Multiply38.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply38.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply39 = E.multiply(C);
		System.out.println("E * C =");
		Multiply39.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply39.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply40 = E.multiply(D);
		System.out.println("E * D =");
		Multiply40.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply40.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply41 = E.multiply(E);
		System.out.println("E * E =");
		Multiply41.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply41.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply42 = E.multiply(F);
		System.out.println("E * F =");
		Multiply42.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply42.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply43 = E.multiply(G);
		System.out.println("E * G =");
		Multiply43.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply43.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply44 = E.multiply(H);
		System.out.println("E * H =");
		Multiply44.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply44.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply45 = E.multiply(I);
		System.out.println("E * I =");
		Multiply45.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply45.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply46 = F.multiply(A);
		System.out.println("F * A =");
		Multiply46.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply46.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply47 = F.multiply(B);
		System.out.println("F * B =");
		Multiply47.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply47.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply48 = F.multiply(C);
		System.out.println("F * C =");
		Multiply48.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply48.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply49 = F.multiply(D);
		System.out.println("F * D =");
		Multiply49.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply49.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply50 = F.multiply(E);
		System.out.println("F * E =");
		Multiply50.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply50.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply51 = F.multiply(F);
		System.out.println("F * F =");
		Multiply51.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply51.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply52 = F.multiply(G);
		System.out.println("F * G =");
		Multiply52.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply52.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply53 = F.multiply(H);
		System.out.println("F * H =");
		Multiply53.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply53.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply54 = F.multiply(I);
		System.out.println("F * I =");
		Multiply54.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply54.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply55 = G.multiply(A);
		System.out.println("G * A =");
		Multiply55.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply55.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply56 = G.multiply(B);
		System.out.println("G * B =");
		Multiply56.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply56.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply57 = G.multiply(C);
		System.out.println("G * C =");
		Multiply57.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply57.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply58 = G.multiply(D);
		System.out.println("G * D =");
		Multiply58.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply58.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply59 = G.multiply(E);
		System.out.println("G * E =");
		Multiply59.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply59.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply60 = G.multiply(F);
		System.out.println("G * F =");
		Multiply60.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply60.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply61 = G.multiply(G);
		System.out.println("G * G =");
		Multiply61.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply61.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply62 = G.multiply(H);
		System.out.println("G * H =");
		Multiply62.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply62.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply63 = G.multiply(I);
		System.out.println("G * I =");
		Multiply63.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply63.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply64 = H.multiply(A);
		System.out.println("H * A =");
		Multiply64.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply64.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply65 = H.multiply(B);
		System.out.println("H * B =");
		Multiply65.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply65.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply66 = H.multiply(C);
		System.out.println("H * C =");
		Multiply66.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply66.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply67 = H.multiply(D);
		System.out.println("H * D =");
		Multiply67.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply67.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply68 = H.multiply(E);
		System.out.println("H * E =");
		Multiply68.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply68.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply69 = H.multiply(F);
		System.out.println("H * F =");
		Multiply69.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply69.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply70 = H.multiply(G);
		System.out.println("H * G =");
		Multiply70.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply70.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply71 = H.multiply(H);
		System.out.println("H * H =");
		Multiply71.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply71.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply72 = H.multiply(I);
		System.out.println("H * I =");
		Multiply72.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply72.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply73 = I.multiply(A);
		System.out.println("I * A =");
		Multiply73.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply73.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply74 = I.multiply(B);
		System.out.println("I * B =");
		Multiply74.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply74.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply75 = I.multiply(C);
		System.out.println("I * C =");
		Multiply75.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply75.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply76 = I.multiply(D);
		System.out.println("I * D =");
		Multiply76.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply76.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply77 = I.multiply(E);
		System.out.println("I * E =");
		Multiply77.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply77.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply78 = I.multiply(F);
		System.out.println("I * F =");
		Multiply78.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply78.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply79 = I.multiply(G);
		System.out.println("I * G =");
		Multiply79.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply79.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply80 = I.multiply(H);
		System.out.println("I * H =");
		Multiply80.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply80.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt Multiply81 = I.multiply(I);
		System.out.println("I * I =");
		Multiply81.output();
		System.out.print("\nSign: ( ");System.out.print(Multiply81.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerA1 = A.power(5);
		System.out.println("A ^ 5 =");
		PowerA1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerA1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerA2 = A.power(10);
		System.out.println("A ^ 10 =");
		PowerA2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerA2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerA3 = A.power(20);
		System.out.println("A ^ 20 =");
		PowerA3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerA3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerB1 = B.power(5);
		System.out.println("B ^ 5 =");
		PowerB1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerB1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerB2 = B.power(10);
		System.out.println("B ^ 10 =");
		PowerB2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerB2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerB3 = B.power(20);
		System.out.println("B ^ 20 =");
		PowerB3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerB3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerC1 = C.power(5);
		System.out.println("C ^ 5 =");
		PowerC1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerC1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerC2 = C.power(10);
		System.out.println("C ^ 10 =");
		PowerC2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerC2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerC3 = C.power(20);
		System.out.println("C ^ 20 =");
		PowerC3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerC3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerD1 = D.power(5);
		System.out.println("D ^ 5 =");
		PowerD1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerD1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerD2 = D.power(10);
		System.out.println("D ^ 10 =");
		PowerD2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerD2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerD3 = D.power(20);
		System.out.println("D ^ 20 =");
		PowerD3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerD3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerE1 = E.power(5);
		System.out.println("E ^ 5 =");
		PowerE1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerE1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerE2 = E.power(10);
		System.out.println("E ^ 10 =");
		PowerE2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerE2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerE3 = E.power(20);
		System.out.println("F ^ 20 =");
		PowerE3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerE3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerF1 = F.power(5);
		System.out.println("F ^ 5 =");
		PowerA1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerF1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerF2 = F.power(10);
		System.out.println("F ^ 10 =");
		PowerF2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerF2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerF3 = F.power(20);
		System.out.println("F ^ 20 =");
		PowerF3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerF3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerG1 = G.power(5);
		System.out.println("G ^ 5 =");
		PowerG1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerG1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerG2 = G.power(10);
		System.out.println("G ^ 10 =");
		PowerG2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerG2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerG3 = G.power(20);
		System.out.println("G ^ 20 =");
		PowerG3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerG3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerH1 = H.power(5);
		System.out.println("H ^ 5 =");
		PowerH1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerH1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerH2 = H.power(10);
		System.out.println("H ^ 10 =");
		PowerH2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerH2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerH3 = H.power(20);
		System.out.println("H ^ 20 =");
		PowerH3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerH3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerI1 = I.power(5);
		System.out.println("I ^ 5 =");
		PowerI1.output();
		System.out.print("\nSign: ( ");System.out.print(PowerI1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerI2 = I.power(10);
		System.out.println("I ^ 10 =");
		PowerI2.output();
		System.out.print("\nSign: ( ");System.out.print(PowerI2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt PowerI3 = I.power(20);
		System.out.println("I ^ 20 =");
		PowerI3.output();
		System.out.print("\nSign: ( ");System.out.print(PowerI3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		
		LongInt J = B.add (C);
		System.out.println("J = B + C =");
		J.output();
		System.out.print("\nSign: ( ");System.out.print(J.getSign() == false ? "+" : "-");System.out.println(" )\n");
	
        LongInt K = C.add (D);
        System.out.println("K = C + D =");
        K.output();
        System.out.print("\nSign: ( ");System.out.print(K.getSign() == false ? "+" : "-");System.out.println(" )\n");
            
        LongInt L = I.add (I);
        System.out.println("L = I + I =");
        L.output();
        System.out.print("\nSign: ( ");System.out.print(L.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt M = A.add (I);
        System.out.println("M = A + I =");
        M.output();
        System.out.print("\nSign: ( ");System.out.print(M.getSign() == false ? "+" : "-");System.out.println(" )\n");
      
        LongInt N = B.add (K);
        System.out.println("N = B + K =");
        N.output();
        System.out.print("\nSign: ( ");System.out.print(N.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt O = A.subtract (D);
        System.out.println("O = A - D =");
        O.output();
        System.out.print("\nSign: ( ");System.out.print(O.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt P = C.subtract(D);
        System.out.println("P = C - D =");
        P.output();
        System.out.print("\nSign: ( ");System.out.print(P.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt Q = D.subtract(C);
        System.out.println("Q = D - C =");
        Q.output();
        System.out.print("\nSign: ( ");System.out.print(Q.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt R = L.subtract(L);
        System.out.println("R = L - L =");
        R.output();
        System.out.print("\nSign: ( ");System.out.print(R.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt S = P.subtract(D);
        System.out.println("S = P - D =");
        S.output();
        System.out.print("\nSign: ( ");System.out.print(S.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt T = N.subtract(Q);
        System.out.println("T = N - Q =");
        T.output();
        System.out.print("\nSign: ( ");System.out.print(T.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt U = A.multiply(D);
        System.out.println("U = A * D =");
        U.output();
        System.out.print("\nSign: ( ");System.out.print(U.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt V = B.multiply(C);
        System.out.println("V = B * C =");
        V.output();
        System.out.print("\nSign: ( ");System.out.print(V.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt W = D.multiply(D);
        System.out.println("W = D * D =");
        W.output();
        System.out.print("\nSign: ( ");System.out.print(W.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt X = O.multiply(I);
        System.out.println("X = O * I =");
        X.output();
        System.out.print("\nSign: ( ");System.out.print(X.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt Y = J.multiply(P);
        System.out.println("Y = J * P =");
        Y.output();
        System.out.print("\nSign: ( ");System.out.print(Y.getSign() == false ? "+" : "-");System.out.println(" )\n");
        
        LongInt Z = M.multiply(N);
        System.out.println("Z = M * N =");
        Z.output();
        System.out.print("\nSign: ( ");System.out.print(Z.getSign() == false ? "+" : "-");System.out.println(" )\n");

	}
}

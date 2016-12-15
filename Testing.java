import java.io.IOException;
import java.io.PrintWriter;

public class Testing {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		
		PrintWriter writer = new PrintWriter ("output.txt");
		
		long LongAStart = System.nanoTime();
		LongInt A = new LongInt("2222");
		long LongAEnd = System.nanoTime();
		System.out.println("2222");
		long LongAoutputStart = System.nanoTime();
		A.output();
		long LongAoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(A.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + A.getDigitCount() + "\n");
		writer.println("It took : " + (LongAEnd - LongAStart) + " \tto initialize A and : " + (LongAoutputEnd - LongAoutputStart) + "\tto output LongInt A, (Time in Nano Seconds)\n");
		
		long LongBStart = System.nanoTime();
		LongInt B = new LongInt("99999999");
		long LongBEnd = System.nanoTime();
		System.out.println("99999999");
		long LongBoutputStart = System.nanoTime();
		B.output();
		long LongBoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(B.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + B.getDigitCount() + "\n");
		writer.println("It took : " + (LongBEnd - LongBStart) + " \tto initialize B and : " + (LongBoutputEnd - LongBoutputStart) + "\tto output LongInt B, (Time in Nano Seconds)\n");
		
		long LongCStart = System.nanoTime();
		LongInt C = new LongInt("-246813575732");
		long LongCEnd = System.nanoTime();
		System.out.println("-246813575732");
		long LongCoutputStart = System.nanoTime();
		C.output();
		long LongCoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(C.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + C.getDigitCount() + "\n");
		writer.println("It took : " + (LongCEnd - LongCStart) + " \tto initialize C and : " + (LongCoutputEnd - LongCoutputStart) + " \tto output LongInt C, (Time in Nano Seconds)\n");
		
		long LongDStart = System.nanoTime();
		LongInt D = new LongInt("180270361023456789");
		long LongDEnd = System.nanoTime();
		System.out.println("180270361023456789");
		long LongDoutputStart = System.nanoTime();
		D.output();
		long LongDoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(D.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + D.getDigitCount() + "\n");
		writer.println("It took : " + (LongDEnd - LongDStart) + " \tto initialize D and : " + (LongDoutputEnd - LongDoutputStart) + "\tto output LongInt D, (Time in Nano Seconds)\n");
		
		long LongEStart = System.nanoTime();		
		LongInt E = new LongInt("1423550000000010056810000054593452907711568359");
		long LongEEnd = System.nanoTime();
		System.out.println("1423550000000010056810000054593452907711568359");
		long LongEoutputStart = System.nanoTime();
		E.output();
		long LongEOutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(E.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + E.getDigitCount() + "\n");
		writer.println("It took : " + (LongEEnd - LongEStart) + " \tto initialize E and : " + (LongEOutputEnd - LongEoutputStart) + "\tto output LongInt E, (Time in Nano Seconds)\n");
		
		long LongFStart = System.nanoTime();
		LongInt F = new LongInt("-350003274594847454317890");
		long LongFEnd = System.nanoTime();
		System.out.println("-350003274594847454317890");
		long LongFoutputStart = System.nanoTime();
		F.output();
		long LongFoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(F.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + F.getDigitCount() + "\n");
		writer.println("It took : " + (LongFEnd - LongFStart) + " \tto initialize F and : " + (LongFoutputEnd - LongFoutputStart) + "\tto output LongInt F, (Time in Nano Seconds)\n");
		
		long LongGStart = System.nanoTime();
		LongInt G = new LongInt("29302390234702973402973420937420973420937420937234872349872934872893472893749287423847");
		long LongGEnd = System.nanoTime();
		System.out.println("29302390234702973402973420937420973420937420937234872349872934872893472893749287423847");
		long LongGoutputStart = System.nanoTime();
		G.output();
		long LongGoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(G.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + G.getDigitCount() + "\n");
		writer.println("It took : " + (LongGEnd - LongGStart) + " \tto initialize G and : " + (LongGoutputEnd - LongGoutputStart) + "\tto output LongInt G, (Time in Nano Seconds)\n");
		
		long LongHStart = System.nanoTime();
		LongInt H = new LongInt("-98534342983742987342987339234098230498203894209928374662342342342356723423423");
		long LongHend = System.nanoTime();
		System.out.println("-98534342983742987342987339234098230498203894209928374662342342342356723423423");
		long LongHoutputStart = System.nanoTime();
		H.output();
		long LongHoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(H.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + H.getDigitCount() + "\n");
		writer.println("It took : " + (LongHend - LongHStart) + " \tto initialize H and : " + (LongHoutputEnd - LongHoutputStart) + "\tto output LongInt H, (Time in Nano Seconds)\n");
		
		long LongIStart = System.nanoTime();
		LongInt I = new LongInt("8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612");
		long LongIEnd = System.nanoTime();
		System.out.println("8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612");
		long LongIoutputStart = System.nanoTime();
		I.output();
		long LongIoutputEnd = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(I.getSign() == false ? "+" : "-");System.out.println(" ) Digit Count = " + I.getDigitCount() + "\n");
		writer.println("It took : " + (LongIEnd - LongIStart) + " \tto initialize I and : " + (LongIoutputEnd - LongIoutputStart) + "\tto output LongInt I, (Time in Nano Seconds)\n");

		writer.println();
		
		int ValueA = 2222;
		int ValueB = 99999999;
		LongIntUtils utils = new LongIntUtils();
		long U1S = System.nanoTime();
		System.out.println("A overflow = " + utils.overflow(ValueA));
		long U1E = System.nanoTime();
		writer.println("A overflow = " + (U1E - U1S) + " ns.");
		long U2S = System.nanoTime();
		System.out.println("B overflow = " + utils.overflow(ValueB));
		long U2E = System.nanoTime();
		writer.println("B overflow = " + (U2E - U2S) + " ns.");
		long U3S = System.nanoTime();
		System.out.println("A underflow = " + utils.underflow(ValueA));
		long U3E = System.nanoTime();
		writer.println("A underflow = " + (U3E - U3S) + " ns.");
		long U4S = System.nanoTime();
		System.out.println("B underflow = " + utils.underflow(ValueB));
		long U4E = System.nanoTime();
		writer.println("B underflow = " + (U4E - U4S) + " ns.");
		long U5S = System.nanoTime();
		System.out.println("A upperHalf = " + utils.upperHalf(ValueA));
		long U5E = System.nanoTime();
		writer.println("A upperHalf = " + (U5E - U5S) + " ns.");
		long U6S = System.nanoTime();
		System.out.println("B upperHalf = " + utils.upperHalf(ValueB));
		long U6E = System.nanoTime();
		writer.println("B upperHalf = " + (U6E - U6S) + " ns.");
		long U7S = System.nanoTime();
		System.out.println("A lowerHalf = " + utils.lowerHalf(ValueA));
		long U7E = System.nanoTime();
		writer.println("A lowerHalf = " + (U7E - U7S) + " ns.");
		long U8S = System.nanoTime();
		System.out.println("B lowerHalf = " + utils.lowerHalf(ValueB));
		long U8E = System.nanoTime();
		writer.println("B lowerHalf = " + (U8E - U8S) + " ns.");
		long U9S = System.nanoTime();
		System.out.println("A Digits = " + utils.digits(ValueA));
		Long U9E = System.nanoTime();
		writer.println("A Digits = " + (U9E - U9S) + " ns.");
		long U0S = System.nanoTime();
		System.out.println("B Digits = " + utils.digits(ValueB));
		long U0E = System.nanoTime();
		writer.println("B Digits = " + (U0E - U0S) + " ns.");
		
		writer.println();
		System.out.println();
		
		long A1EqualS = System.nanoTime();
		System.out.println(A.equalTo(A) == true ? " A Equal A " : " A Not Equal A");
		long A1EqualE = System.nanoTime();
		writer.println(" A Equal A  " + (A1EqualE - A1EqualS) + "\tnano seconds\n");
		
		long A2EqualS = System.nanoTime();
		System.out.println(A.equalTo(B) == true ? " A Equal B " : " A Not Equal B");
		long A2EqualE = System.nanoTime();
		writer.println(" A Equal B  " + (A2EqualE - A2EqualS) + "\tnano seconds\n");
		
		long A3EqualS = System.nanoTime();
		System.out.println(A.equalTo(C) == true ? " A Equal C " : " A Not Equal C");
		long A3EqualE = System.nanoTime();
		writer.println(" A Equal C  " + (A3EqualE - A3EqualS) + "\tnano seconds\n");
		
		long A4EqualS = System.nanoTime();
		System.out.println(A.equalTo(D) == true ? " A Equal D " : " A Not Equal D");
		long A4EqualE = System.nanoTime();
		writer.println(" A Equal D  " + (A4EqualE - A4EqualS) + "\tnano seconds\n");
		
		long A5EqualS = System.nanoTime();
		System.out.println(A.equalTo(E) == true ? " A Equal E " : " A Not Equal E");
		long A5EqualE = System.nanoTime();
		writer.println(" A Equal E  " + (A5EqualE - A5EqualS) + "\tnano seconds\n");
		
		long A6EqualS = System.nanoTime();
		System.out.println(A.equalTo(F) == true ? " A Equal F " : " A Not Equal F");
		long A6EqualE = System.nanoTime();
		writer.println(" A Equal F  " + (A6EqualE - A6EqualS) + "\tnano seconds\n");
		
		long A7EqualS = System.nanoTime();
		System.out.println(A.equalTo(G) == true ? " A Equal G " : " A Not Equal G");
		long A7EqualE = System.nanoTime();
		writer.println(" A Equal G  " + (A7EqualE - A7EqualS) + "\tnano seconds\n");
		
		long A8EqualS = System.nanoTime();
		System.out.println(A.equalTo(H) == true ? " A Equal H " : " A Not Equal H");
		long A8EqualE = System.nanoTime();
		writer.println(" A Equal H  " + (A8EqualE - A8EqualS) + "\tnano seconds\n");
		
		long A9EqualS = System.nanoTime();
		System.out.println(A.equalTo(I) == true ? " A Equal I " : " A Not Equal I");
		long A9EqualE = System.nanoTime();
		writer.println(" A Equal I  " + (A9EqualE - A9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long B1EqualS = System.nanoTime();
		System.out.println(B.equalTo(A) == true ? " B Equal A " : " B Not Equal A");
		long B1EqualE = System.nanoTime();
		writer.println(" B Equal A  " + (B1EqualE - B1EqualS) + "\tnano seconds\n");
		
		long B2EqualS = System.nanoTime();
		System.out.println(B.equalTo(B) == true ? " B Equal B " : " B Not Equal B");
		long B2EqualE = System.nanoTime();
		writer.println(" B Equal B  " + (B2EqualE - B2EqualS) + "\tnano seconds\n");
		
		long B3EqualS = System.nanoTime();
		System.out.println(B.equalTo(C) == true ? " B Equal C " : " B Not Equal C");
		long B3EqualE = System.nanoTime();
		writer.println(" B Equal C  " + (B3EqualE - B3EqualS) + "\tnano seconds\n");
		
		long B4EqualS = System.nanoTime();
		System.out.println(B.equalTo(D) == true ? " B Equal D " : " B Not Equal D");
		long B4EqualE = System.nanoTime();
		writer.println(" B Equal D  " + (B4EqualE - B4EqualS) + "\tnano seconds\n");
		
		long B5EqualS = System.nanoTime();
		System.out.println(B.equalTo(E) == true ? " B Equal E " : " B Not Equal E");
		long B5EqualE = System.nanoTime();
		writer.println(" B Equal E  " + (B5EqualE - B5EqualS) + "\tnano seconds\n");
		
		long B6EqualS = System.nanoTime();
		System.out.println(B.equalTo(F) == true ? " B Equal F " : " B Not Equal F");
		long B6EqualE = System.nanoTime();
		writer.println(" B Equal F  " + (B6EqualE - B6EqualS) + "\tnano seconds\n");
		
		long B7EqualS = System.nanoTime();
		System.out.println(B.equalTo(G) == true ? " B Equal G " : " B Not Equal G");
		long B7EqualE = System.nanoTime();
		writer.println(" B Equal G  " + (B7EqualE - B7EqualS) + "\tnano seconds\n");
		
		long B8EqualS = System.nanoTime();
		System.out.println(B.equalTo(H) == true ? " B Equal H " : " B Not Equal H");
		long B8EqualE = System.nanoTime();
		writer.println(" B Equal H  " + (B8EqualE - B8EqualS) + "\tnano seconds\n");
		
		long B9EqualS = System.nanoTime();
		System.out.println(B.equalTo(I) == true ? " B Equal I " : " B Not Equal I");
		long B9EqualE = System.nanoTime();
		writer.println(" B Equal I  " + (B9EqualE - B9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long C1EqualS = System.nanoTime();
		System.out.println(C.equalTo(A) == true ? " C Equal A " : " C Not Equal A");
		long C1EqualE = System.nanoTime();
		writer.println(" C Equal A  " + (C1EqualE - C1EqualS) + "\tnano seconds\n");
		
		long C2EqualS = System.nanoTime();
		System.out.println(C.equalTo(B) == true ? " C Equal B " : " C Not Equal B");
		long C2EqualE = System.nanoTime();
		writer.println(" C Equal B  " + (C2EqualE - C2EqualS) + "\tnano seconds\n");
		
		long C3EqualS = System.nanoTime();
		System.out.println(C.equalTo(C) == true ? " C Equal C " : " C Not Equal C");
		long C3EqualE = System.nanoTime();
		writer.println(" C Equal C  " + (C3EqualE - C3EqualS) + "\tnano seconds\n");
		
		long C4EqualS = System.nanoTime();
		System.out.println(C.equalTo(D) == true ? " C Equal D " : " C Not Equal D");
		long C4EqualE = System.nanoTime();
		writer.println(" C Equal D  " + (C4EqualE - C4EqualS) + "\tnano seconds\n");
		
		long C5EqualS = System.nanoTime();
		System.out.println(C.equalTo(E) == true ? " C Equal E " : " C Not Equal E");
		long C5EqualE = System.nanoTime();
		writer.println(" C Equal E  " + (C5EqualE - C5EqualS) + "\tnano seconds\n");
		
		long C6EqualS = System.nanoTime();
		System.out.println(C.equalTo(F) == true ? " C Equal F " : " C Not Equal F");
		long C6EqualE = System.nanoTime();
		writer.println(" C Equal F  " + (C6EqualE - C6EqualS) + "\tnano seconds\n");
		
		long C7EqualS = System.nanoTime();
		System.out.println(C.equalTo(G) == true ? " C Equal G " : " C Not Equal G");
		long C7EqualE = System.nanoTime();
		writer.println(" C Equal G  " + (C7EqualE - C7EqualS) + "\tnano seconds\n");
		
		long C8EqualS = System.nanoTime();
		System.out.println(C.equalTo(H) == true ? " C Equal H " : " C Not Equal H");
		long C8EqualE = System.nanoTime();
		writer.println(" C Equal H  " + (C8EqualE - C8EqualS) + "\tnano seconds\n");
		
		long C9EqualS = System.nanoTime();
		System.out.println(C.equalTo(I) == true ? " C Equal I " : " C Not Equal I");
		long C9EqualE = System.nanoTime();
		writer.println(" C Equal I  " + (C9EqualE - C9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long D1EqualS = System.nanoTime();
		System.out.println(D.equalTo(A) == true ? " D Equal A " : " D Not Equal A");
		long D1EqualE = System.nanoTime();
		writer.println(" D Equal A  " + (D1EqualE - D1EqualS) + "\tnano seconds\n");
		
		long D2EqualS = System.nanoTime();
		System.out.println(D.equalTo(B) == true ? " D Equal B " : " D Not Equal B");
		long D2EqualE = System.nanoTime();
		writer.println(" D Equal B  " + (D2EqualE - D2EqualS) + "\tnano seconds\n");
		
		long D3EqualS = System.nanoTime();
		System.out.println(D.equalTo(C) == true ? " D Equal C " : " D Not Equal C");
		long D3EqualE = System.nanoTime();
		writer.println(" D Equal C  " + (D3EqualE - D3EqualS) + "\tnano seconds\n");
		
		long D4EqualS = System.nanoTime();
		System.out.println(D.equalTo(D) == true ? " D Equal D " : " D Not Equal D");
		long D4EqualE = System.nanoTime();
		writer.println(" D Equal D  " + (D4EqualE - D4EqualS) + "\tnano seconds\n");
		
		long D5EqualS = System.nanoTime();
		System.out.println(D.equalTo(E) == true ? " D Equal E " : " D Not Equal E");
		long D5EqualE = System.nanoTime();
		writer.println(" D Equal E  " + (D5EqualE - D5EqualS) + "\tnano seconds\n");
		
		long D6EqualS = System.nanoTime();
		System.out.println(D.equalTo(F) == true ? " D Equal F " : " D Not Equal F");
		long D6EqualE = System.nanoTime();
		writer.println(" D Equal F  " + (D6EqualE - D6EqualS) + "\tnano seconds\n");
		
		long D7EqualS = System.nanoTime();
		System.out.println(D.equalTo(G) == true ? " D Equal G " : " D Not Equal G");
		long D7EqualE = System.nanoTime();
		writer.println(" D Equal G  " + (D7EqualE - D7EqualS) + "\tnano seconds\n");
		
		long D8EqualS = System.nanoTime();
		System.out.println(D.equalTo(H) == true ? " D Equal H " : " D Not Equal H");
		long D8EqualE = System.nanoTime();
		writer.println(" D Equal H  " + (D8EqualE - D8EqualS) + "\tnano seconds\n");
		
		long D9EqualS = System.nanoTime();
		System.out.println(D.equalTo(I) == true ? " D Equal I " : " D Not Equal I");
		long D9EqualE = System.nanoTime();
		writer.println(" D Equal I  " + (D9EqualE - D9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long E1EqualS = System.nanoTime();
		System.out.println(E.equalTo(A) == true ? " E Equal A " : " E Not Equal A");
		long E1EqualE = System.nanoTime();
		writer.println(" E Equal A  " + (E1EqualE - E1EqualS) + "\tnano seconds\n");
		
		long E2EqualS = System.nanoTime();
		System.out.println(E.equalTo(B) == true ? " E Equal B " : " E Not Equal B");
		long E2EqualE = System.nanoTime();
		writer.println(" E Equal B  " + (E2EqualE - E2EqualS) + "\tnano seconds\n");
		
		long E3EqualS = System.nanoTime();
		System.out.println(E.equalTo(C) == true ? " E Equal C " : " E Not Equal C");
		long E3EqualE = System.nanoTime();
		writer.println(" E Equal C  " + (E3EqualE - E3EqualS) + "\tnano seconds\n");
		
		long E4EqualS = System.nanoTime();
		System.out.println(E.equalTo(D) == true ? " E Equal D " : " E Not Equal D");
		long E4EqualE = System.nanoTime();
		writer.println(" E Equal D  " + (E4EqualE - E4EqualS) + "\tnano seconds\n");
		
		long E5EqualS = System.nanoTime();
		System.out.println(E.equalTo(E) == true ? " E Equal E " : " E Not Equal E");
		long E5EqualE = System.nanoTime();
		writer.println(" E Equal E  " + (E5EqualE - E5EqualS) + "\tnano seconds\n");
		
		long E6EqualS = System.nanoTime();
		System.out.println(E.equalTo(F) == true ? " E Equal F " : " E Not Equal F");
		long E6EqualE = System.nanoTime();
		writer.println(" E Equal F  " + (E6EqualE - E6EqualS) + "\tnano seconds\n");
		
		long E7EqualS = System.nanoTime();
		System.out.println(E.equalTo(G) == true ? " E Equal G " : " E Not Equal G");
		long E7EqualE = System.nanoTime();
		writer.println(" E Equal G  " + (E7EqualE - E7EqualS) + "\tnano seconds\n");
		
		long E8EqualS = System.nanoTime();
		System.out.println(E.equalTo(H) == true ? " E Equal H " : " E Not Equal H");
		long E8EqualE = System.nanoTime();
		writer.println(" E Equal H  " + (E8EqualE - E8EqualS) + "\tnano seconds\n");
		
		long E9EqualS = System.nanoTime();
		System.out.println(E.equalTo(I) == true ? " E Equal I " : " E Not Equal I");		
		long E9EqualE = System.nanoTime();
		writer.println(" E Equal I  " + (E9EqualE - E9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long F1EqualS = System.nanoTime();
		System.out.println(F.equalTo(A) == true ? " F Equal A " : " F Not Equal A");
		long F1EqualE = System.nanoTime();
		writer.println(" F Equal A  " + (F1EqualE - F1EqualS) + "\tnano seconds\n");
		
		long F2EqualS = System.nanoTime();
		System.out.println(F.equalTo(B) == true ? " F Equal B " : " F Not Equal B");
		long F2EqualE = System.nanoTime();
		writer.println(" F Equal B  " + (F2EqualE - F2EqualS) + "\tnano seconds\n");
		
		long F3EqualS = System.nanoTime();
		System.out.println(F.equalTo(C) == true ? " F Equal C " : " F Not Equal C");
		long F3EqualE = System.nanoTime();
		writer.println(" F Equal C  " + (F3EqualE - F3EqualS) + "\tnano seconds\n");
		
		long F4EqualS = System.nanoTime();
		System.out.println(F.equalTo(D) == true ? " F Equal D " : " F Not Equal D");
		long F4EqualE = System.nanoTime();
		writer.println(" F Equal D  " + (F4EqualE - F4EqualS) + "\tnano seconds\n");
		
		long F5EqualS = System.nanoTime();
		System.out.println(F.equalTo(E) == true ? " F Equal E " : " F Not Equal E");
		long F5EqualE = System.nanoTime();
		writer.println(" F Equal E  " + (F5EqualE - F5EqualS) + "\tnano seconds\n");
		
		long F6EqualS = System.nanoTime();
		System.out.println(F.equalTo(F) == true ? " F Equal F " : " F Not Equal F");
		long F6EqualE = System.nanoTime();
		writer.println(" F Equal F  " + (F6EqualE - F6EqualS) + "\tnano seconds\n");
		
		long F7EqualS = System.nanoTime();
		System.out.println(F.equalTo(G) == true ? " F Equal G " : " F Not Equal G");
		long F7EqualE = System.nanoTime();
		writer.println(" F Equal G  " + (F7EqualE - F7EqualS) + "\tnano seconds\n");
		
		long F8EqualS = System.nanoTime();
		System.out.println(F.equalTo(H) == true ? " F Equal H " : " F Not Equal H");
		long F8EqualE = System.nanoTime();
		writer.println(" F Equal H  " + (F8EqualE - F8EqualS) + "\tnano seconds\n");
		
		long F9EqualS = System.nanoTime();
		System.out.println(F.equalTo(I) == true ? " F Equal I " : " F Not Equal I");
		long F9EqualE = System.nanoTime();
		writer.println(" F Equal I  " + (F9EqualE - F9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long G1EqualS = System.nanoTime();
		System.out.println(G.equalTo(A) == true ? " G Equal A " : " G Not Equal A");
		long G1EqualE = System.nanoTime();
		writer.println(" G Equal A  " + (G1EqualE - G1EqualS) + "\tnano seconds\n");
				
		long G2EqualS = System.nanoTime();
		System.out.println(G.equalTo(B) == true ? " G Equal B " : " G Not Equal B");
		long G2EqualE = System.nanoTime();
		writer.println(" G Equal B  " + (G2EqualE - G2EqualS) + "\tnano seconds\n");
		
		long G3EqualS = System.nanoTime();
		System.out.println(G.equalTo(C) == true ? " G Equal C " : " G Not Equal C");
		long G3EqualE = System.nanoTime();
		writer.println(" G Equal C  " + (G3EqualE - G3EqualS) + "\tnano seconds\n");
		
		long G4EqualS = System.nanoTime();
		System.out.println(G.equalTo(D) == true ? " G Equal D " : " G Not Equal D");
		long G4EqualE = System.nanoTime();
		writer.println(" G Equal D  " + (G4EqualE - G4EqualS) + "\tnano seconds\n");
		
		long G5EqualS = System.nanoTime();
		System.out.println(G.equalTo(E) == true ? " G Equal E " : " G Not Equal E");
		long G5EqualE = System.nanoTime();
		writer.println(" G Equal E  " + (G5EqualE - G5EqualS) + "\tnano seconds\n");
		
		long G6EqualS = System.nanoTime();
		System.out.println(G.equalTo(F) == true ? " G Equal F " : " G Not Equal F");
		long G6EqualE = System.nanoTime();
		writer.println(" G Equal F  " + (G6EqualE - G6EqualS) + "\tnano seconds\n");
		
		long G7EqualS = System.nanoTime();
		System.out.println(G.equalTo(G) == true ? " G Equal G " : " G Not Equal G");
		long G7EqualE = System.nanoTime();
		writer.println(" G Equal G  " + (G7EqualE - G7EqualS) + "\tnano seconds\n");
		
		long G8EqualS = System.nanoTime();
		System.out.println(G.equalTo(H) == true ? " G Equal H " : " G Not Equal H");
		long G8EqualE = System.nanoTime();
		writer.println(" G Equal H  " + (G8EqualE - G8EqualS) + "\tnano seconds\n");
		
		long G9EqualS = System.nanoTime();
		System.out.println(G.equalTo(I) == true ? " G Equal I " : " G Not Equal I");
		long G9EqualE = System.nanoTime();
		writer.println(" G Equal I  " + (G9EqualE - G9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long H1EqualS = System.nanoTime();
		System.out.println(H.equalTo(A) == true ? " H Equal A " : " H Not Equal A");
		long H1EqualE = System.nanoTime();
		writer.println(" H Equal A  " + (H1EqualE - H1EqualS) + "\tnano seconds\n");
		
		long H2EqualS = System.nanoTime();
		System.out.println(H.equalTo(B) == true ? " H Equal B " : " H Not Equal B");
		long H2EqualE = System.nanoTime();
		writer.println(" H Equal B  " + (H2EqualE - H2EqualS) + "\tnano seconds\n");
		
		long H3EqualS = System.nanoTime();
		System.out.println(H.equalTo(C) == true ? " H Equal C " : " H Not Equal C");
		long H3EqualE = System.nanoTime();
		writer.println(" H Equal C  " + (H3EqualE - H3EqualS) + "\tnano seconds\n");
		
		long H4EqualS = System.nanoTime();
		System.out.println(H.equalTo(D) == true ? " H Equal D " : " H Not Equal D");
		long H4EqualE = System.nanoTime();
		writer.println(" H Equal D  " + (H4EqualE - H4EqualS) + "\tnano seconds\n");
		
		long H5EqualS = System.nanoTime();
		System.out.println(H.equalTo(E) == true ? " H Equal E " : " H Not Equal E");
		long H5EqualE = System.nanoTime();
		writer.println(" H Equal E  " + (H5EqualE - H5EqualS) + "\tnano seconds\n");
		
		long H6EqualS = System.nanoTime();
		System.out.println(H.equalTo(F) == true ? " H Equal F " : " H Not Equal F");
		long H6EqualE = System.nanoTime();
		writer.println(" H Equal F  " + (H6EqualE - H6EqualS) + "\tnano seconds\n");
		
		long H7EqualS = System.nanoTime();
		System.out.println(H.equalTo(G) == true ? " H Equal G " : " H Not Equal G");
		long H7EqualE = System.nanoTime();
		writer.println(" H Equal G  " + (H7EqualE - H7EqualS) + "\tnano seconds\n");
		
		long H8EqualS = System.nanoTime();
		System.out.println(H.equalTo(H) == true ? " H Equal H " : " H Not Equal H");
		long H8EqualE = System.nanoTime();
		writer.println(" H Equal H  " + (H8EqualE - H8EqualS) + "\tnano seconds\n");
		
		long H9EqualS = System.nanoTime();
		System.out.println(H.equalTo(I) == true ? " H Equal I " : " H Not Equal I");
		long H9EqualE = System.nanoTime();
		writer.println(" H Equal I  " + (H9EqualE - H9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long I1EqualS = System.nanoTime();
		System.out.println(I.equalTo(A) == true ? " I Equal A " : " I Not Equal A");
		long I1EqualE = System.nanoTime();
		writer.println(" I Equal A  " + (I1EqualE - I1EqualS) + "\tnano seconds\n");
		
		long I2EqualS = System.nanoTime();
		System.out.println(I.equalTo(B) == true ? " I Equal B " : " I Not Equal B");
		long I2EqualE = System.nanoTime();
		writer.println(" I Equal B  " + (I2EqualE - I2EqualS) + "\tnano seconds\n");
		
		long I3EqualS = System.nanoTime();
		System.out.println(I.equalTo(C) == true ? " I Equal C " : " I Not Equal C");
		long I3EqualE = System.nanoTime();
		writer.println(" I Equal C  " + (I3EqualE - I3EqualS) + "\tnano seconds\n");
		
		long I4EqualS = System.nanoTime();
		System.out.println(I.equalTo(D) == true ? " I Equal D " : " I Not Equal D");
		long I4EqualE = System.nanoTime();
		writer.println(" I Equal D  " + (I4EqualE - I4EqualS) + "\tnano seconds\n");
		
		long I5EqualS = System.nanoTime();
		System.out.println(I.equalTo(E) == true ? " I Equal E " : " I Not Equal E");
		long I5EqualE = System.nanoTime();
		writer.println(" I Equal E  " + (I5EqualE - I5EqualS) + "\tnano seconds\n");
		
		long I6EqualS = System.nanoTime();
		System.out.println(I.equalTo(F) == true ? " I Equal F " : " I Not Equal F");
		long I6EqualE = System.nanoTime();
		writer.println(" I Equal F  " + (I6EqualE - I6EqualS) + "\tnano seconds\n");
		
		long I7EqualS = System.nanoTime();
		System.out.println(I.equalTo(G) == true ? " I Equal G " : " I Not Equal G");
		long I7EqualE = System.nanoTime();
		writer.println(" I Equal G  " + (I7EqualE - I7EqualS) + "\tnano seconds\n");
		
		long I8EqualS = System.nanoTime();
		System.out.println(I.equalTo(H) == true ? " I Equal H " : " I Not Equal H");
		long I8EqualE = System.nanoTime();
		writer.println(" I Equal H  " + (I8EqualE - I8EqualS) + "\tnano seconds\n");
		
		long I9EqualS = System.nanoTime();
		System.out.println(I.equalTo(I) == true ? " I Equal I " : " I Not Equal I");
		long I9EqualE = System.nanoTime();
		writer.println(" I Equal I  " + (I9EqualE - I9EqualS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long A1LessThanS = System.nanoTime();
		System.out.println(A.lessThan(A) == true ? " A Less than A" : " A Not Less than A");
		long A1LessThanE = System.nanoTime();
		writer.println(" A Less Than A  " + (A1LessThanE - A1LessThanS) + "\tnano seconds\n");
		
		long A2LessThanS = System.nanoTime();
		System.out.println(A.lessThan(B) == true ? " A Less than B" : " A Not Less than B");
		long A2LessThanE = System.nanoTime();
		writer.println(" A Less Than B  " + (A2LessThanE - A2LessThanS) + "\tnano seconds\n");
				
		long A3LessThanS = System.nanoTime();
		System.out.println(A.lessThan(C) == true ? " A Less than C" : " A Not Less than C");
		long A3LessThanE = System.nanoTime();
		writer.println(" A Less Than C  " + (A3LessThanE - A3LessThanS) + "\tnano seconds\n");
				
		long A4LessThanS = System.nanoTime();
		System.out.println(A.lessThan(D) == true ? " A Less than D" : " A Not Less than D");
		long A4LessThanE = System.nanoTime();
		writer.println(" A Less Than D  " + (A4LessThanE - A4LessThanS) + "\tnano seconds\n");
				
		long A5LessThanS = System.nanoTime();
		System.out.println(A.lessThan(E) == true ? " A Less than E" : " A Not Less than E");
		long A5LessThanE = System.nanoTime();
		writer.println(" A Less Than E  " + (A5LessThanE - A5LessThanS) + "\tnano seconds\n");
				
		long A6LessThanS = System.nanoTime();
		System.out.println(A.lessThan(F) == true ? " A Less than F" : " A Not Less than F");
		long A6LessThanE = System.nanoTime();
		writer.println(" A Less Than F  " + (A6LessThanE - A6LessThanS) + "\tnano seconds\n");
				
		long A7LessThanS = System.nanoTime();
		System.out.println(A.lessThan(G) == true ? " A Less than G" : " A Not Less than G");
		long A7LessThanE = System.nanoTime();
		writer.println(" A Less Than G  " + (A7LessThanE - A7LessThanS) + "\tnano seconds\n");
				
		long A8LessThanS = System.nanoTime();
		System.out.println(A.lessThan(H) == true ? " A Less than H" : " A Not Less than H");
		long A8LessThanE = System.nanoTime();
		writer.println(" A Less Than H  " + (A8LessThanE - A8LessThanS) + "\tnano seconds\n");
				
		long A9LessThanS = System.nanoTime();
		System.out.println(A.lessThan(I) == true ? " A Less than I" : " A Not Less than I");
		long A9LessThanE = System.nanoTime();
		writer.println(" A Less Than I  " + (A9LessThanE - A9LessThanS) + "\tnano seconds\n");
		writer.println();		
		System.out.println();
		
		long B1LessThanS = System.nanoTime();
		System.out.println(B.lessThan(A) == true ? " B Less than A" : " B Not Less than A");
		long B1LessThanE = System.nanoTime();
		writer.println(" B Less Than A  " + (B1LessThanE - B1LessThanS) + "\tnano seconds\n");
		
		long B2LessThanS = System.nanoTime();
		System.out.println(B.lessThan(B) == true ? " B Less than B" : " B Not Less than B");
		long B2LessThanE = System.nanoTime();
		writer.println(" B Less Than B  " + (B2LessThanE - B2LessThanS) + "\tnano seconds\n");
		
		long B3LessThanS = System.nanoTime();
		System.out.println(B.lessThan(C) == true ? " B Less than C" : " B Not Less than C");
		long B3LessThanE = System.nanoTime();
		writer.println(" B Less Than C  " + (B3LessThanE - B3LessThanS) + "\tnano seconds\n");
		
		long B4LessThanS = System.nanoTime();
		System.out.println(B.lessThan(D) == true ? " B Less than D" : " B Not Less than D");
		long B4LessThanE = System.nanoTime();
		writer.println(" B Less Than D  " + (B4LessThanE - B4LessThanS) + "\tnano seconds\n");
		
		long B5LessThanS = System.nanoTime();
		System.out.println(B.lessThan(E) == true ? " B Less than E" : " B Not Less than E");
		long B5LessThanE = System.nanoTime();
		writer.println(" B Less Than E  " + (B5LessThanE - B5LessThanS) + "\tnano seconds\n");
		
		long B6LessThanS = System.nanoTime();
		System.out.println(B.lessThan(F) == true ? " B Less than F" : " B Not Less than F");
		long B6LessThanE = System.nanoTime();
		writer.println(" B Less Than F  " + (B6LessThanE - B6LessThanS) + "\tnano seconds\n");
		
		long B7LessThanS = System.nanoTime();
		System.out.println(B.lessThan(G) == true ? " B Less than G" : " B Not Less than G");
		long B7LessThanE = System.nanoTime();
		writer.println(" B Less Than G  " + (B7LessThanE - B7LessThanS) + "\tnano seconds\n");
		
		long B8LessThanS = System.nanoTime();
		System.out.println(B.lessThan(H) == true ? " B Less than H" : " B Not Less than H");
		long B8LessThanE = System.nanoTime();
		writer.println(" B Less Than H  " + (B8LessThanE - B8LessThanS) + "\tnano seconds\n");
		
		long B9LessThanS = System.nanoTime();
		System.out.println(B.lessThan(I) == true ? " B Less than I" : " B Not Less than I");
		long B9LessThanE = System.nanoTime();
		writer.println(" B Less Than I  " + (B9LessThanE - B9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long C1LessThanS = System.nanoTime();
		System.out.println(C.lessThan(A) == true ? " C Less than A" : " C Not Less than A");
		long C1LessThanE = System.nanoTime();
		writer.println(" C Less Than A  " + (C1LessThanE - C1LessThanS) + "\tnano seconds\n");
		
		long C2LessThanS = System.nanoTime();
		System.out.println(C.lessThan(B) == true ? " C Less than B" : " C Not Less than B");
		long C2LessThanE = System.nanoTime();
		writer.println(" C Less Than B  " + (C2LessThanE - C2LessThanS) + "\tnano seconds\n");
		
		long C3LessThanS = System.nanoTime();
		System.out.println(C.lessThan(C) == true ? " C Less than C" : " C Not Less than C");
		long C3LessThanE = System.nanoTime();
		writer.println(" C Less Than C  " + (C3LessThanE - C3LessThanS) + "\tnano seconds\n");
		
		long C4LessThanS = System.nanoTime();
		System.out.println(C.lessThan(D) == true ? " C Less than D" : " C Not Less than D");
		long C4LessThanE = System.nanoTime();
		writer.println(" C Less Than D  " + (C4LessThanE - C4LessThanS) + "\tnano seconds\n");
		
		long C5LessThanS = System.nanoTime();
		System.out.println(C.lessThan(E) == true ? " C Less than E" : " C Not Less than E");
		long C5LessThanE = System.nanoTime();
		writer.println(" C Less Than E  " + (C5LessThanE - C5LessThanS) + "\tnano seconds\n");
		
		long C6LessThanS = System.nanoTime();
		System.out.println(C.lessThan(F) == true ? " C Less than F" : " C Not Less than F");
		long C6LessThanE = System.nanoTime();
		writer.println(" C Less Than F  " + (C6LessThanE - C6LessThanS) + "\tnano seconds\n");
		
		long C7LessThanS = System.nanoTime();
		System.out.println(C.lessThan(G) == true ? " C Less than G" : " C Not Less than G");
		long C7LessThanE = System.nanoTime();
		writer.println(" C Less Than G  " + (C7LessThanE - C7LessThanS) + "\tnano seconds\n");
		
		long C8LessThanS = System.nanoTime();
		System.out.println(C.lessThan(H) == true ? " C Less than H" : " C Not Less than H");
		long C8LessThanE = System.nanoTime();
		writer.println(" C Less Than H  " + (C8LessThanE - C8LessThanS) + "\tnano seconds\n");
		
		long C9LessThanS = System.nanoTime();
		System.out.println(C.lessThan(I) == true ? " C Less than I" : " C Not Less than I");
		long C9LessThanE = System.nanoTime();
		writer.println(" C Less Than I  " + (C9LessThanE - C9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long D1LessThanS = System.nanoTime();
		System.out.println(D.lessThan(A) == true ? " D Less than A" : " D Not Less than A");
		long D1LessThanE = System.nanoTime();
		writer.println(" D Less Than A  " + (D1LessThanE - D1LessThanS) + "\tnano seconds\n");
		
		long D2LessThanS = System.nanoTime();
		System.out.println(D.lessThan(B) == true ? " D Less than B" : " D Not Less than B");
		long D2LessThanE = System.nanoTime();
		writer.println(" D Less Than B  " + (D2LessThanE - D2LessThanS) + "\tnano seconds\n");
		
		long D3LessThanS = System.nanoTime();
		System.out.println(D.lessThan(C) == true ? " D Less than C" : " D Not Less than C");
		long D3LessThanE = System.nanoTime();
		writer.println(" D Less Than C  " + (D3LessThanE - D3LessThanS) + "\tnano seconds\n");
		
		long D4LessThanS = System.nanoTime();
		System.out.println(D.lessThan(D) == true ? " D Less than D" : " D Not Less than D");
		long D4LessThanE = System.nanoTime();
		writer.println(" D Less Than D  " + (D4LessThanE - D4LessThanS) + "\tnano seconds\n");
		
		long D5LessThanS = System.nanoTime();
		System.out.println(D.lessThan(E) == true ? " D Less than E" : " D Not Less than E");
		long D5LessThanE = System.nanoTime();
		writer.println(" D Less Than E  " + (D5LessThanE - D5LessThanS) + "\tnano seconds\n");
		
		long D6LessThanS = System.nanoTime();
		System.out.println(D.lessThan(F) == true ? " D Less than F" : " D Not Less than F");
		long D6LessThanE = System.nanoTime();
		writer.println(" D Less Than F  " + (D6LessThanE - D6LessThanS) + "\tnano seconds\n");
		
		long D7LessThanS = System.nanoTime();
		System.out.println(D.lessThan(G) == true ? " D Less than G" : " D Not Less than G");
		long D7LessThanE = System.nanoTime();
		writer.println(" D Less Than G  " + (D7LessThanE - D7LessThanS) + "\tnano seconds\n");
		
		long D8LessThanS = System.nanoTime();
		System.out.println(D.lessThan(H) == true ? " D Less than H" : " D Not Less than H");
		long D8LessThanE = System.nanoTime();
		writer.println(" D Less Than H  " + (D8LessThanE - D8LessThanS) + "\tnano seconds\n");
		
		long D9LessThanS = System.nanoTime();
		System.out.println(D.lessThan(I) == true ? " D Less than I" : " D Not Less than I");
		long D9LessThanE = System.nanoTime();
		writer.println(" D Less Than I  " + (D9LessThanE - D9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long E1LessThanS = System.nanoTime();
		System.out.println(E.lessThan(A) == true ? " E Less than A" : " E Not Less than A");
		long E1LessThanE = System.nanoTime();
		writer.println(" E Less Than A  " + (E1LessThanE - E1LessThanS) + "\tnano seconds\n");
		
		long E2LessThanS = System.nanoTime();
		System.out.println(E.lessThan(B) == true ? " E Less than B" : " E Not Less than B");
		long E2LessThanE = System.nanoTime();
		writer.println(" E Less Than B  " + (E2LessThanE - E2LessThanS) + "\tnano seconds\n");
		
		long E3LessThanS = System.nanoTime();
		System.out.println(E.lessThan(C) == true ? " E Less than C" : " E Not Less than C");
		long E3LessThanE = System.nanoTime();
		writer.println(" E Less Than C  " + (E3LessThanE - E3LessThanS) + "\tnano seconds\n");
		
		long E4LessThanS = System.nanoTime();
		System.out.println(E.lessThan(D) == true ? " E Less than D" : " E Not Less than D");
		long E4LessThanE = System.nanoTime();
		writer.println(" E Less Than D  " + (E4LessThanE - E4LessThanS) + "\tnano seconds\n");
		
		long E5LessThanS = System.nanoTime();
		System.out.println(E.lessThan(E) == true ? " E Less than E" : " E Not Less than E");
		long E5LessThanE = System.nanoTime();
		writer.println(" E Less Than E  " + (E5LessThanE - E5LessThanS) + "\tnano seconds\n");
		
		long E6LessThanS = System.nanoTime();
		System.out.println(E.lessThan(F) == true ? " E Less than F" : " E Not Less than F");
		long E6LessThanE = System.nanoTime();
		writer.println(" E Less Than F  " + (E6LessThanE - E6LessThanS) + "\tnano seconds\n");
		
		long E7LessThanS = System.nanoTime();
		System.out.println(E.lessThan(G) == true ? " E Less than G" : " E Not Less than G");
		long E7LessThanE = System.nanoTime();
		writer.println(" E Less Than G  " + (E7LessThanE - E7LessThanS) + "\tnano seconds\n");
		
		long E8LessThanS = System.nanoTime();
		System.out.println(E.lessThan(H) == true ? " E Less than H" : " E Not Less than H");
		long E8LessThanE = System.nanoTime();
		writer.println(" E Less Than H  " + (E8LessThanE - E8LessThanS) + "\tnano seconds\n");
		
		long E9LessThanS = System.nanoTime();
		System.out.println(E.lessThan(I) == true ? " E Less than I" : " E Not Less than I");
		long E9LessThanE = System.nanoTime();
		writer.println(" E Less Than I  " + (E9LessThanE - E9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long F1LessThanS = System.nanoTime();
		System.out.println(F.lessThan(A) == true ? " F Less than A" : " F Not Less than A");
		long F1LessThanE = System.nanoTime();
		writer.println(" F Less Than A  " + (F1LessThanE - F1LessThanS) + "\tnano seconds\n");
		
		long F2LessThanS = System.nanoTime();
		System.out.println(F.lessThan(B) == true ? " F Less than B" : " F Not Less than B");
		long F2LessThanE = System.nanoTime();
		writer.println(" F Less Than B  " + (F2LessThanE - F2LessThanS) + "\tnano seconds\n");
		
		long F3LessThanS = System.nanoTime();
		System.out.println(F.lessThan(C) == true ? " F Less than C" : " F Not Less than C");
		long F3LessThanE = System.nanoTime();
		writer.println(" F Less Than C  " + (F3LessThanE - F3LessThanS) + "\tnano seconds\n");
		
		long F4LessThanS = System.nanoTime();
		System.out.println(F.lessThan(D) == true ? " F Less than D" : " F Not Less than D");
		long F4LessThanE = System.nanoTime();
		writer.println(" F Less Than D  " + (F4LessThanE - F4LessThanS) + "\tnano seconds\n");
		
		long F5LessThanS = System.nanoTime();
		System.out.println(F.lessThan(E) == true ? " F Less than E" : " F Not Less than E");
		long F5LessThanE = System.nanoTime();
		writer.println(" F Less Than E  " + (F5LessThanE - F5LessThanS) + "\tnano seconds\n");
		
		long F6LessThanS = System.nanoTime();
		System.out.println(F.lessThan(F) == true ? " F Less than F" : " F Not Less than F");
		long F6LessThanE = System.nanoTime();
		writer.println(" F Less Than F  " + (F6LessThanE - F6LessThanS) + "\tnano seconds\n");
		
		long F7LessThanS = System.nanoTime();
		System.out.println(F.lessThan(G) == true ? " F Less than G" : " F Not Less than G");
		long F7LessThanE = System.nanoTime();
		writer.println(" F Less Than G  " + (F7LessThanE - F7LessThanS) + "\tnano seconds\n");
		
		long F8LessThanS = System.nanoTime();
		System.out.println(F.lessThan(H) == true ? " F Less than H" : " F Not Less than H");
		long F8LessThanE = System.nanoTime();
		writer.println(" F Less Than H  " + (F8LessThanE - F8LessThanS) + "\tnano seconds\n");
		
		long F9LessThanS = System.nanoTime();
		System.out.println(F.lessThan(I) == true ? " F Less than I" : " F Not Less than I");
		long F9LessThanE = System.nanoTime();
		writer.println(" F Less Than I  " + (F9LessThanE - F9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long G1LessThanS = System.nanoTime();
		System.out.println(G.lessThan(A) == true ? " G Less than A" : " G Not Less than A");
		long G1LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G1LessThanE - G1LessThanS) + "\tnano seconds\n");
		
		long G2LessThanS = System.nanoTime();
		System.out.println(G.lessThan(B) == true ? " G Less than B" : " G Not Less than B");
		long G2LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G2LessThanE - G2LessThanS) + "\tnano seconds\n");
		
		long G3LessThanS = System.nanoTime();
		System.out.println(G.lessThan(C) == true ? " G Less than C" : " G Not Less than C");
		long G3LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G3LessThanE - G3LessThanS) + "\tnano seconds\n");
		
		long G4LessThanS = System.nanoTime();
		System.out.println(G.lessThan(D) == true ? " G Less than D" : " G Not Less than D");
		long G4LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G4LessThanE - G4LessThanS) + "\tnano seconds\n");
		
		long G5LessThanS = System.nanoTime();
		System.out.println(G.lessThan(E) == true ? " G Less than E" : " G Not Less than E");
		long G5LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G5LessThanE - G5LessThanS) + "\tnano seconds\n");
		
		long G6LessThanS = System.nanoTime();
		System.out.println(G.lessThan(F) == true ? " G Less than F" : " G Not Less than F");
		long G6LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G6LessThanE - G6LessThanS) + "\tnano seconds\n");
		
		long G7LessThanS = System.nanoTime();
		System.out.println(G.lessThan(G) == true ? " G Less than G" : " G Not Less than G");
		long G7LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G7LessThanE - G7LessThanS) + "\tnano seconds\n");
		
		long G8LessThanS = System.nanoTime();
		System.out.println(G.lessThan(H) == true ? " G Less than H" : " G Not Less than H");
		long G8LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G8LessThanE - G8LessThanS) + "\tnano seconds\n");
		
		long G9LessThanS = System.nanoTime();
		System.out.println(G.lessThan(I) == true ? " G Less than I" : " G Not Less than I");		
		long G9LessThanE = System.nanoTime();
		writer.println(" G Less Than A  " + (G9LessThanE - G9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long H1LessThanS = System.nanoTime();
		System.out.println(H.lessThan(A) == true ? " H Less than A" : " H Not Less than A");
		long H1LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H1LessThanE - H1LessThanS) + "\tnano seconds\n");
		
		long H2LessThanS = System.nanoTime();
		System.out.println(H.lessThan(B) == true ? " H Less than B" : " H Not Less than B");
		long H2LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H2LessThanE - H2LessThanS) + "\tnano seconds\n");
		
		long H3LessThanS = System.nanoTime();
		System.out.println(H.lessThan(C) == true ? " H Less than C" : " H Not Less than C");
		long H3LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H3LessThanE - H3LessThanS) + "\tnano seconds\n");
		
		long H4LessThanS = System.nanoTime();
		System.out.println(H.lessThan(D) == true ? " H Less than D" : " H Not Less than D");
		long H4LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H4LessThanE - H4LessThanS) + "\tnano seconds\n");
		
		long H5LessThanS = System.nanoTime();
		System.out.println(H.lessThan(E) == true ? " H Less than E" : " H Not Less than E");
		long H5LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H5LessThanE - H5LessThanS) + "\tnano seconds\n");
		
		long H6LessThanS = System.nanoTime();
		System.out.println(H.lessThan(F) == true ? " H Less than F" : " H Not Less than F");
		long H6LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H6LessThanE - H6LessThanS) + "\tnano seconds\n");
		
		long H7LessThanS = System.nanoTime();
		System.out.println(H.lessThan(G) == true ? " H Less than G" : " H Not Less than G");
		long H7LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H7LessThanE - H7LessThanS) + "\tnano seconds\n");
		
		long H8LessThanS = System.nanoTime();
		System.out.println(H.lessThan(H) == true ? " H Less than H" : " H Not Less than H");
		long H8LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H8LessThanE - H8LessThanS) + "\tnano seconds\n");
		
		long H9LessThanS = System.nanoTime();
		System.out.println(H.lessThan(I) == true ? " H Less than I" : " H Not Less than I");		
		long H9LessThanE = System.nanoTime();
		writer.println(" H Less Than A  " + (H9LessThanE - H9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long I1LessThanS = System.nanoTime();
		System.out.println(I.lessThan(A) == true ? " I Less than A" : " I Not Less than A");
		long I1LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I1LessThanE - I1LessThanS) + "\tnano seconds\n");
		
		long I2LessThanS = System.nanoTime();
		System.out.println(I.lessThan(B) == true ? " I Less than B" : " I Not Less than B");
		long I2LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I2LessThanE - I2LessThanS) + "\tnano seconds\n");
		
		long I3LessThanS = System.nanoTime();
		System.out.println(I.lessThan(C) == true ? " I Less than C" : " I Not Less than C");
		long I3LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I3LessThanE - I3LessThanS) + "\tnano seconds\n");
		
		long I4LessThanS = System.nanoTime();
		System.out.println(I.lessThan(D) == true ? " I Less than D" : " I Not Less than D");
		long I4LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I4LessThanE - I4LessThanS) + "\tnano seconds\n");
		
		long I5LessThanS = System.nanoTime();
		System.out.println(I.lessThan(E) == true ? " I Less than E" : " I Not Less than E");
		long I5LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I5LessThanE - I5LessThanS) + "\tnano seconds\n");
		
		long I6LessThanS = System.nanoTime();
		System.out.println(I.lessThan(F) == true ? " I Less than F" : " I Not Less than F");
		long I6LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I6LessThanE - I6LessThanS) + "\tnano seconds\n");
		
		long I7LessThanS = System.nanoTime();
		System.out.println(I.lessThan(G) == true ? " I Less than G" : " I Not Less than G");
		long I7LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I7LessThanE - I7LessThanS) + "\tnano seconds\n");
		
		long I8LessThanS = System.nanoTime();
		System.out.println(I.lessThan(H) == true ? " I Less than H" : " I Not Less than H");
		long I8LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I8LessThanE - I8LessThanS) + "\tnano seconds\n");
		
		long I9LessThanS = System.nanoTime();
		System.out.println(I.lessThan(I) == true ? " I Less than I" : " I Not Less than I");
		long I9LessThanE = System.nanoTime();
		writer.println(" I Less Than A  " + (I9LessThanE - I9LessThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long A1GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(A) == true ? " A Greater Than A" : " A Not Greater than A");
		long A1GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than A  " + (A1GreaterThanE - A1GreaterThanS) + "\tnano seconds\n");
		
		long A2GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(B) == true ? " A Greater Than B" : " A Not Greater than B");
		long A2GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than B  " + (A2GreaterThanE - A2GreaterThanS) + "\tnano seconds\n");
		
		long A3GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(C) == true ? " A Greater Than C" : " A Not Greater than C");
		long A3GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than C  " + (A3GreaterThanE - A3GreaterThanS) + "\tnano seconds\n");
		
		long A4GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(D) == true ? " A Greater Than D" : " A Not Greater than D");
		long A4GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than D  " + (A4GreaterThanE - A4GreaterThanS) + "\tnano seconds\n");
		
		long A5GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(E) == true ? " A Greater Than E" : " A Not Greater than E");
		long A5GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than E  " + (A5GreaterThanE - A5GreaterThanS) + "\tnano seconds\n");
		
		long A6GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(F) == true ? " A Greater Than F" : " A Not Greater than F");
		long A6GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than F  " + (A6GreaterThanE - A6GreaterThanS) + "\tnano seconds\n");
		
		long A7GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(G) == true ? " A Greater Than G" : " A Not Greater than G");
		long A7GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than G  " + (A7GreaterThanE - A7GreaterThanS) + "\tnano seconds\n");
		
		long A8GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(H) == true ? " A Greater Than H" : " A Not Greater than H");
		long A8GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than H  " + (A8GreaterThanE - A8GreaterThanS) + "\tnano seconds\n");
		
		long A9GreaterThanS = System.nanoTime();
		System.out.println(A.greaterThan(I) == true ? " A Greater Than I" : " A Not Greater than I");
		long A9GreaterThanE = System.nanoTime();
		writer.println(" A Greater Than I  " + (A9GreaterThanE - A9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long B1GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(A) == true ? " B Greater Than A" : " B Not Greater than A");
		long B1GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than A  " + (B1GreaterThanE - B1GreaterThanS) + "\tnano seconds\n");
		
		long B2GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(B) == true ? " B Greater Than B" : " B Not Greater than B");
		long B2GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than B  " + (B2GreaterThanE - B2GreaterThanS) + "\tnano seconds\n");
		
		long B3GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(C) == true ? " B Greater Than C" : " B Not Greater than C");
		long B3GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than C  " + (B3GreaterThanE - B3GreaterThanS) + "\tnano seconds\n");
		
		long B4GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(D) == true ? " B Greater Than D" : " B Not Greater than D");
		long B4GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than D  " + (B4GreaterThanE - B4GreaterThanS) + "\tnano seconds\n");
		
		long B5GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(E) == true ? " B Greater Than E" : " B Not Greater than E");
		long B5GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than E  " + (B5GreaterThanE - B5GreaterThanS) + "\tnano seconds\n");
		
		long B6GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(F) == true ? " B Greater Than F" : " B Not Greater than F");
		long B6GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than F  " + (B6GreaterThanE - B6GreaterThanS) + "\tnano seconds\n");
		
		long B7GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(G) == true ? " B Greater Than G" : " B Not Greater than G");
		long B7GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than G  " + (B7GreaterThanE - B7GreaterThanS) + "\tnano seconds\n");
		
		long B8GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(H) == true ? " B Greater Than H" : " B Not Greater than H");
		long B8GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than H  " + (B8GreaterThanE - B8GreaterThanS) + "\tnano seconds\n");
		
		long B9GreaterThanS = System.nanoTime();
		System.out.println(B.greaterThan(I) == true ? " B Greater Than I" : " B Not Greater than I");
		long B9GreaterThanE = System.nanoTime();
		writer.println(" B Greater Than I  " + (B9GreaterThanE - B9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long C1GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(A) == true ? " C Greater Than A" : " C Not Greater than A");
		long C1GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than A  " + (C1GreaterThanE - C1GreaterThanS) + "\tnano seconds\n");
		
		long C2GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(B) == true ? " C Greater Than B" : " C Not Greater than B");
		long C2GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than B  " + (C2GreaterThanE - C2GreaterThanS) + "\tnano seconds\n");
		
		long C3GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(C) == true ? " C Greater Than C" : " C Not Greater than C");
		long C3GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than C  " + (C3GreaterThanE - C3GreaterThanS) + "\tnano seconds\n");
		
		long C4GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(D) == true ? " C Greater Than D" : " C Not Greater than D");
		long C4GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than D  " + (C4GreaterThanE - C4GreaterThanS) + "\tnano seconds\n");
		
		long C5GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(E) == true ? " C Greater Than D" : " C Not Greater than E");
		long C5GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than E  " + (C5GreaterThanE - C5GreaterThanS) + "\tnano seconds\n");
		
		long C6GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(F) == true ? " C Greater Than F" : " C Not Greater than F");
		long C6GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than F  " + (C6GreaterThanE - C6GreaterThanS) + "\tnano seconds\n");
		
		long C7GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(G) == true ? " C Greater Than G" : " C Not Greater than G");
		long C7GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than G  " + (C7GreaterThanE - C7GreaterThanS) + "\tnano seconds\n");
		
		long C8GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(H) == true ? " C Greater Than H" : " C Not Greater than H");
		long C8GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than H  " + (C8GreaterThanE - C8GreaterThanS) + "\tnano seconds\n");
		
		long C9GreaterThanS = System.nanoTime();
		System.out.println(C.greaterThan(I) == true ? " C Greater Than I" : " C Not Greater than I");
		long C9GreaterThanE = System.nanoTime();
		writer.println(" C Greater Than I  " + (C9GreaterThanE - C9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long D1GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(A) == true ? " D Greater Than A" : " D Not Greater than A");
		long D1GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than A  " + (D1GreaterThanE - D1GreaterThanS) + "\tnano seconds\n");
		
		long D2GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(B) == true ? " D Greater Than B" : " D Not Greater than B");
		long D2GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than B  " + (D2GreaterThanE - D2GreaterThanS) + "\tnano seconds\n");
		
		long D3GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(C) == true ? " D Greater Than C" : " D Not Greater than C");
		long D3GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than C  " + (D3GreaterThanE - D3GreaterThanS) + "\tnano seconds\n");
		
		long D4GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(D) == true ? " D Greater Than D" : " D Not Greater than D");
		long D4GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than D  " + (D4GreaterThanE - D4GreaterThanS) + "\tnano seconds\n");
		
		long D5GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(E) == true ? " D Greater Than E" : " D Not Greater than E");
		long D5GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than E  " + (D5GreaterThanE - D5GreaterThanS) + "\tnano seconds\n");
		
		long D6GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(F) == true ? " D Greater Than F" : " D Not Greater than F");
		long D6GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than F  " + (D6GreaterThanE - D6GreaterThanS) + "\tnano seconds\n");
		
		long D7GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(G) == true ? " D Greater Than G" : " D Not Greater than G");
		long D7GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than G  " + (D7GreaterThanE - D7GreaterThanS) + "\tnano seconds\n");
		
		long D8GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(H) == true ? " D Greater Than H" : " D Not Greater than H");
		long D8GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than H  " + (D8GreaterThanE - D8GreaterThanS) + "\tnano seconds\n");
		
		long D9GreaterThanS = System.nanoTime();
		System.out.println(D.greaterThan(I) == true ? " D Greater Than I" : " D Not Greater than I");
		long D9GreaterThanE = System.nanoTime();
		writer.println(" D Greater Than I  " + (D9GreaterThanE - D9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long E1GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(A) == true ? " E Greater Than A" : " E Not Greater than A");
		long E1GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than A  " + (E1GreaterThanE - E1GreaterThanS) + "\tnano seconds\n");
		
		long E2GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(B) == true ? " E Greater Than B" : " E Not Greater than B");
		long E2GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than B  " + (E2GreaterThanE - E2GreaterThanS) + "\tnano seconds\n");
		
		long E3GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(C) == true ? " E Greater Than C" : " E Not Greater than C");
		long E3GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than C  " + (E3GreaterThanE - E3GreaterThanS) + "\tnano seconds\n");
		
		long E4GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(D) == true ? " E Greater Than D" : " E Not Greater than D");
		long E4GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than D  " + (E4GreaterThanE - E4GreaterThanS) + "\tnano seconds\n");
		
		long E5GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(E) == true ? " E Greater Than E" : " E Not Greater than E");
		long E5GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than E  " + (E5GreaterThanE - E5GreaterThanS) + "\tnano seconds\n");
		
		long E6GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(F) == true ? " E Greater Than F" : " E Not Greater than F");
		long E6GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than F  " + (E6GreaterThanE - E6GreaterThanS) + "\tnano seconds\n");
		
		long E7GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(G) == true ? " E Greater Than G" : " E Not Greater than G");
		long E7GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than G  " + (E7GreaterThanE - E7GreaterThanS) + "\tnano seconds\n");
		
		long E8GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(H) == true ? " E Greater Than H" : " E Not Greater than H");
		long E8GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than H  " + (E8GreaterThanE - E8GreaterThanS) + "\tnano seconds\n");
		
		long E9GreaterThanS = System.nanoTime();
		System.out.println(E.greaterThan(I) == true ? " E Greater Than I" : " E Not Greater than I");
		long E9GreaterThanE = System.nanoTime();
		writer.println(" E Greater Than I  " + (E9GreaterThanE - E9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long F1GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(A) == true ? " F Greater Than A" : " F Not Greater than A");
		long F1GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than A  " + (F1GreaterThanE - F1GreaterThanS) + "\tnano seconds\n");
		
		long F2GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(B) == true ? " F Greater Than B" : " F Not Greater than B");
		long F2GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than B  " + (F2GreaterThanE - F2GreaterThanS) + "\tnano seconds\n");
		
		long F3GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(C) == true ? " F Greater Than C" : " F Not Greater than C");
		long F3GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than C  " + (F3GreaterThanE - F3GreaterThanS) + "\tnano seconds\n");
		
		long F4GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(D) == true ? " F Greater Than D" : " F Not Greater than D");
		long F4GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than D  " + (F4GreaterThanE - F4GreaterThanS) + "\tnano seconds\n");
		
		long F5GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(E) == true ? " F Greater Than E" : " F Not Greater than E");
		long F5GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than E  " + (F5GreaterThanE - F5GreaterThanS) + "\tnano seconds\n");
		
		long F6GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(F) == true ? " F Greater Than F" : " F Not Greater than F");
		long F6GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than F  " + (F6GreaterThanE - F6GreaterThanS) + "\tnano seconds\n");
		
		long F7GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(G) == true ? " F Greater Than G" : " F Not Greater than G");
		long F7GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than G  " + (F7GreaterThanE - F7GreaterThanS) + "\tnano seconds\n");
		
		long F8GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(H) == true ? " F Greater Than H" : " F Not Greater than H");
		long F8GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than H  " + (F8GreaterThanE - F8GreaterThanS) + "\tnano seconds\n");
		
		long F9GreaterThanS = System.nanoTime();
		System.out.println(F.greaterThan(I) == true ? " F Greater Than I" : " F Not Greater than I");
		long F9GreaterThanE = System.nanoTime();
		writer.println(" F Greater Than I  " + (F9GreaterThanE - F9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long G1GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(A) == true ? " G Greater Than A" : " G Not Greater than A");
		long G1GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than A  " + (G1GreaterThanE - G1GreaterThanS) + "\tnano seconds\n");
		
		long G2GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(B) == true ? " G Greater Than B" : " G Not Greater than B");
		long G2GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than B  " + (G2GreaterThanE - G2GreaterThanS) + "\tnano seconds\n");
		
		long G3GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(C) == true ? " G Greater Than C" : " G Not Greater than C");
		long G3GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than C  " + (G3GreaterThanE - G3GreaterThanS) + "\tnano seconds\n");
		
		long G4GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(D) == true ? " G Greater Than D" : " G Not Greater than D");
		long G4GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than D  " + (G4GreaterThanE - G4GreaterThanS) + "\tnano seconds\n");
		
		long G5GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(E) == true ? " G Greater Than E" : " G Not Greater than E");
		long G5GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than E  " + (G5GreaterThanE - G5GreaterThanS) + "\tnano seconds\n");
		
		long G6GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(F) == true ? " G Greater Than F" : " G Not Greater than F");
		long G6GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than F  " + (G6GreaterThanE - G6GreaterThanS) + "\tnano seconds\n");
		
		long G7GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(G) == true ? " G Greater Than G" : " G Not Greater than G");
		long G7GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than G  " + (G7GreaterThanE - G7GreaterThanS) + "\tnano seconds\n");
		
		long G8GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(H) == true ? " G Greater Than H" : " G Not Greater than H");
		long G8GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than H  " + (G8GreaterThanE - G8GreaterThanS) + "\tnano seconds\n");
		
		long G9GreaterThanS = System.nanoTime();
		System.out.println(G.greaterThan(I) == true ? " G Greater Than I" : " G Not Greater than I");
		long G9GreaterThanE = System.nanoTime();
		writer.println(" G Greater Than I  " + (G9GreaterThanE - G9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long H1GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(A) == true ? " H Greater Than A" : " H Not Greater than A");
		long H1GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than A  " + (H1GreaterThanE - H1GreaterThanS) + "\tnano seconds\n");
		
		long H2GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(B) == true ? " H Greater Than B" : " H Not Greater than B");
		long H2GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than B  " + (H2GreaterThanE - H2GreaterThanS) + "\tnano seconds\n");
		
		long H3GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(C) == true ? " H Greater Than C" : " H Not Greater than C");
		long H3GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than C  " + (H3GreaterThanE - H3GreaterThanS) + "\tnano seconds\n");
		
		long H4GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(D) == true ? " H Greater Than D" : " H Not Greater than D");
		long H4GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than D  " + (H4GreaterThanE - H4GreaterThanS) + "\tnano seconds\n");
		
		long H5GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(E) == true ? " H Greater Than E" : " H Not Greater than E");
		long H5GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than E  " + (H5GreaterThanE - H5GreaterThanS) + "\tnano seconds\n");
		
		long H6GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(F) == true ? " H Greater Than F" : " H Not Greater than F");
		long H6GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than F  " + (H6GreaterThanE - H6GreaterThanS) + "\tnano seconds\n");
		
		long H7GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(G) == true ? " H Greater Than G" : " H Not Greater than G");
		long H7GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than G  " + (H7GreaterThanE - H7GreaterThanS) + "\tnano seconds\n");
		
		long H8GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(H) == true ? " H Greater Than H" : " H Not Greater than H");
		long H8GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than H  " + (H8GreaterThanE - H8GreaterThanS) + "\tnano seconds\n");
		
		long H9GreaterThanS = System.nanoTime();
		System.out.println(H.greaterThan(I) == true ? " H Greater Than I" : " H Not Greater than I");
		long H9GreaterThanE = System.nanoTime();
		writer.println(" H Greater Than I  " + (H9GreaterThanE - H9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long I1GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(A) == true ? " I Greater Than A" : " I Not Greater than A");
		long I1GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than A  " + (I1GreaterThanE - I1GreaterThanS) + "\tnano seconds\n");
		
		long I2GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(B) == true ? " I Greater Than B" : " I Not Greater than B");
		long I2GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than B  " + (I2GreaterThanE - I2GreaterThanS) + "\tnano seconds\n");
		
		long I3GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(C) == true ? " I Greater Than C" : " I Not Greater than C");
		long I3GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than C  " + (I3GreaterThanE - I3GreaterThanS) + "\tnano seconds\n");
		
		long I4GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(D) == true ? " I Greater Than D" : " I Not Greater than D");
		long I4GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than D  " + (I4GreaterThanE - I4GreaterThanS) + "\tnano seconds\n");
		
		long I5GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(E) == true ? " I Greater Than E" : " I Not Greater than E");
		long I5GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than E  " + (I5GreaterThanE - I5GreaterThanS) + "\tnano seconds\n");
		
		long I6GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(F) == true ? " I Greater Than F" : " I Not Greater than F");
		long I6GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than F  " + (I6GreaterThanE - I6GreaterThanS) + "\tnano seconds\n");
		
		long I7GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(G) == true ? " I Greater Than G" : " I Not Greater than G");
		long I7GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than G  " + (I7GreaterThanE - I7GreaterThanS) + "\tnano seconds\n");
		
		long I8GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(H) == true ? " I Greater Than H" : " I Not Greater than H");
		long I8GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than H  " + (I8GreaterThanE - I8GreaterThanS) + "\tnano seconds\n");
		
		long I9GreaterThanS = System.nanoTime();
		System.out.println(I.greaterThan(I) == true ? " I Greater Than I" : " I Not Greater than I");
		long I9GreaterThanE = System.nanoTime();
		writer.println(" I Greater Than I  " + (I9GreaterThanE - I9GreaterThanS) + "\tnano seconds\n");
		writer.println();
		System.out.println();
		
		long AddA1S = System.nanoTime(); 
		LongInt Add1 = A.add(A);
		long AddA1E = System.nanoTime();
		System.out.println("A + A =");
		long AOutputA1S = System.nanoTime();
		Add1.output();
		long AOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + A = " + (AddA1E - AddA1S) + " ns, and " + (AOutputA1E - AOutputA1S) + " ns for output");
		
		long AddA2S = System.nanoTime(); 
		LongInt Add2 = A.add(B);
		long AddA2E = System.nanoTime();
		System.out.println("A + B =");
		long AOutputA2S = System.nanoTime();
		Add2.output();
		long AOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + B = " + (AddA2E - AddA2S) + " ns, and " + (AOutputA2E - AOutputA2S) + " ns for output");
				
		long AddA3S = System.nanoTime(); 
		LongInt Add3 = A.add(C);
		long AddA3E = System.nanoTime();
		System.out.println("A + C =");
		long AOutputA3S = System.nanoTime();
		Add3.output();
		long AOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + C = " + (AddA3E - AddA3S) + " ns, and " + (AOutputA3E - AOutputA3S) + " ns for output");
				
		long AddA4S = System.nanoTime(); 
		LongInt Add4 = A.add(D);
		long AddA4E = System.nanoTime();
		System.out.println("A + D =");
		long AOutputA4S = System.nanoTime();
		Add4.output();
		long AOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add4.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + D = " + (AddA4E - AddA4S) + " ns, and " + (AOutputA4E - AOutputA4S) + " ns for output");
		
		long AddA5S = System.nanoTime(); 
		LongInt Add5 = A.add(E);
		long AddA5E = System.nanoTime();
		System.out.println("A + E =");
		long AOutputA5S = System.nanoTime();
		Add5.output();
		long AOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add5.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + E = " + (AddA5E - AddA5S) + " ns, and " + (AOutputA5E - AOutputA5S) + " ns for output");
				
		long AddA6S = System.nanoTime(); 
		LongInt Add6 = A.add(F);
		long AddA6E = System.nanoTime();
		System.out.println("A + F =");
		long AOutputA6S = System.nanoTime();
		Add6.output();
		long AOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add6.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + F = " + (AddA6E - AddA6S) + " ns, and " + (AOutputA6E - AOutputA6S) + " ns for output");
		
		long AddA7S = System.nanoTime(); 
		LongInt Add7 = A.add(G);
		long AddA7E = System.nanoTime();
		System.out.println("A + G =");
		long AOutputA7S = System.nanoTime();
		Add7.output();
		long AOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add7.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + G = " + (AddA7E - AddA7S) + " ns, and " + (AOutputA7E - AOutputA7S) + " ns for output");
				
		long AddA8S = System.nanoTime(); 
		LongInt Add8 = A.add(H);
		long AddA8E = System.nanoTime();
		System.out.println("A + H =");
		long AOutputA8S = System.nanoTime();
		Add8.output();
		long AOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add8.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + H = " + (AddA8E - AddA8S) + " ns, and " + (AOutputA8E - AOutputA8S) + " ns for output");

		long AddA9S = System.nanoTime(); 
		LongInt Add9 = A.add(I);
		long AddA9E = System.nanoTime();
		System.out.println("A + I =");
		long AOutputA9S = System.nanoTime();
		Add9.output();
		long AOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add9.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A + I = " + (AddA9E - AddA9S) + " ns, and " + (AOutputA9E - AOutputA9S) + " ns for output");
		
		writer.println();
		
		long AddB1S = System.nanoTime(); 
		LongInt Add10 = B.add(A);
		long AddB1E = System.nanoTime();
		System.out.println("B + A =");
		long BOutputA1S = System.nanoTime();
		Add10.output();
		long BOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add10.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + A = " + (AddB1E - AddB1S) + " ns, and " + (BOutputA1E - BOutputA1S) + " ns for output");
		
		long AddB2S = System.nanoTime(); 
		LongInt Add11 = B.add(B);
		long AddB2E = System.nanoTime();
		System.out.println("B + B =");
		long BOutputA2S = System.nanoTime();
		Add11.output();
		long BOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add11.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + B = " + (AddB2E - AddB2S) + " ns, and " + (BOutputA2E - BOutputA2S) + " ns for output");
		
		long AddB3S = System.nanoTime(); 
		LongInt Add12 = B.add(C);
		long AddB3E = System.nanoTime();
		System.out.println("B + C =");
		long BOutputA3S = System.nanoTime();
		Add12.output();
		long BOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add12.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + C = " + (AddB3E - AddB3S) + " ns, and " + (BOutputA3E - BOutputA3S) + " ns for output");
		
		long AddB4S = System.nanoTime(); 
		LongInt Add13 = B.add(D);
		long AddB4E = System.nanoTime();
		System.out.println("B + D =");
		long BOutputA4S = System.nanoTime();
		Add13.output();
		long BOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add13.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + D = " + (AddB4E - AddB4S) + " ns, and " + (BOutputA4E - BOutputA4S) + " ns for output");
	
		long AddB5S = System.nanoTime(); 
		LongInt Add14 = B.add(E);
		long AddB5E = System.nanoTime();
		System.out.println("B + E =");
		long BOutputA5S = System.nanoTime();
		Add14.output();
		long BOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add14.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + E = " + (AddB5E - AddB5S) + " ns, and " + (BOutputA5E - BOutputA5S) + " ns for output");
		
		long AddB6S = System.nanoTime(); 
		LongInt Add15 = B.add(F);
		long AddB6E = System.nanoTime();
		System.out.println("B + F =");
		long BOutputA6S = System.nanoTime();
		Add15.output();
		long BOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add15.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + F = " + (AddB6E - AddB6S) + " ns, and " + (BOutputA6E - BOutputA6S) + " ns for output");
		
		long AddB7S = System.nanoTime(); 
		LongInt Add16 = B.add(G);
		long AddB7E = System.nanoTime();
		System.out.println("B + G =");
		long BOutputA7S = System.nanoTime();
		Add16.output();
		long BOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add16.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + G = " + (AddB7E - AddB7S) + " ns, and " + (BOutputA7E - BOutputA7S) + " ns for output");
		
		long AddB8S = System.nanoTime(); 
		LongInt Add17 = B.add(H);
		long AddB8E = System.nanoTime();
		System.out.println("B + H =");
		long BOutputA8S = System.nanoTime();
		Add17.output();
		long BOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add17.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + H = " + (AddB8E - AddB8S) + " ns, and " + (BOutputA8E - BOutputA8S) + " ns for output");

		long AddB9S = System.nanoTime(); 
		LongInt Add18 = B.add(I);
		long AddB9E = System.nanoTime();
		System.out.println("B + I =");
		long BOutputA9S = System.nanoTime();
		Add18.output();
		long BOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add18.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B + I = " + (AddB9E - AddB9S) + " ns, and " + (BOutputA9E - BOutputA9S) + " ns for output");
		
		writer.println();
		
		long AddC1S = System.nanoTime(); 
		LongInt Add19 = C.add(A);
		long AddC1E = System.nanoTime();
		System.out.println("C + A =");
		long COutputA1S = System.nanoTime();
		Add19.output();
		long COutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add19.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + A = " + (AddC1E - AddC1S) + " ns, and " + (COutputA1E - COutputA1S) + " ns for output");
		
		long AddC2S = System.nanoTime(); 
		LongInt Add20 = C.add(B);
		long AddC2E = System.nanoTime();
		System.out.println("C + B =");
		long COutputA2S = System.nanoTime();
		Add20.output();
		long COutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add20.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + B = " + (AddC2E - AddC2S) + " ns, and " + (COutputA2E - COutputA2S) + " ns for output");

		long AddC3S = System.nanoTime(); 
		LongInt Add21 = C.add(C);
		long AddC3E = System.nanoTime();
		System.out.println("C + C =");
		long COutputA3S = System.nanoTime();
		Add21.output();
		long COutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add21.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + C = " + (AddC3E - AddC3S) + " ns, and " + (COutputA3E - COutputA3S) + " ns for output");
		
		long AddC4S = System.nanoTime(); 
		LongInt Add22 = C.add(D);
		long AddC4E = System.nanoTime();
		System.out.println("C + D =");
		long COutputA4S = System.nanoTime();
		Add22.output();
		long COutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add22.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + D = " + (AddC4E - AddC4S) + " ns, and " + (COutputA4E - COutputA4S) + " ns for output");
		
		long AddC5S = System.nanoTime(); 
		LongInt Add23 = C.add(E);
		long AddC5E = System.nanoTime();
		System.out.println("C + E =");
		long COutputA5S = System.nanoTime();
		Add23.output();
		long COutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add23.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + E = " + (AddC5E - AddC5S) + " ns, and " + (COutputA5E - COutputA5S) + " ns for output");
		
		long AddC6S = System.nanoTime(); 
		LongInt Add24 = C.add(F);
		long AddC6E = System.nanoTime();
		System.out.println("C + F =");
		long COutputA6S = System.nanoTime();
		Add24.output();
		long COutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add24.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + F = " + (AddC6E - AddC6S) + " ns, and " + (COutputA6E - COutputA6S) + " ns for output");
		
		long AddC7S = System.nanoTime(); 
		LongInt Add25 = C.add(G);
		long AddC7E = System.nanoTime();
		System.out.println("C + G =");
		long COutputA7S = System.nanoTime();
		Add25.output();
		long COutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add25.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + G = " + (AddC7E - AddC7S) + " ns, and " + (COutputA7E - COutputA7S) + " ns for output");
		
		long AddC8S = System.nanoTime(); 
		LongInt Add26 = C.add(H);
		long AddC8E = System.nanoTime();
		System.out.println("C + H =");
		long COutputA8S = System.nanoTime();
		Add26.output();
		long COutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add26.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C + H = " + (AddC8E - AddC8S) + " ns, and " + (COutputA8E - COutputA8S) + " ns for output");
		
		long AddC9S = System.nanoTime(); 
		LongInt Add27 = C.add(I);
		long AddC9E = System.nanoTime();
		System.out.println("C + I =");
		long COutputA9S = System.nanoTime();
		Add27.output();
		long COutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add27.getSign() == false ? "+" : "-");System.out.println(" )\n");	
		writer.println("C + I = " + (AddC9E - AddC9S) + " ns, and " + (COutputA9E - COutputA9S) + " ns for output");
		
		writer.println();
		
		long AddD1S = System.nanoTime(); 
		LongInt Add28 = D.add(A);
		long AddD1E = System.nanoTime();
		System.out.println("D + A =");
		long DOutputA1S = System.nanoTime();
		Add28.output();
		long DOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add28.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + A = " + (AddD1E - AddD1S) + " ns, and " + (DOutputA1E - DOutputA1S) + " ns for output");
	
		long AddD2S = System.nanoTime(); 
		LongInt Add29 = D.add(B);
		long AddD2E = System.nanoTime();
		System.out.println("D + B =");
		long DOutputA2S = System.nanoTime();
		Add29.output();
		long DOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add29.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + B = " + (AddD2E - AddD2S) + " ns, and " + (DOutputA2E - DOutputA2S) + " ns for output");

		long AddD3S = System.nanoTime(); 
		LongInt Add30 = D.add(C);
		long AddD3E = System.nanoTime();
		System.out.println("D + C =");
		long DOutputA3S = System.nanoTime();
		Add30.output();
		long DOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add30.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + C = " + (AddD3E - AddD3S) + " ns, and " + (DOutputA3E - DOutputA3S) + " ns for output");

		long AddD4S = System.nanoTime(); 
		LongInt Add31 = D.add(D);
		long AddD4E = System.nanoTime();
		System.out.println("D + D =");
		long DOutputA4S = System.nanoTime();
		Add31.output();
		long DOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add31.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + D = " + (AddD4E - AddD4S) + " ns, and " + (DOutputA4E - DOutputA4S) + " ns for output");
		
		long AddD5S = System.nanoTime(); 
		LongInt Add32 = D.add(E);
		long AddD5E = System.nanoTime();
		System.out.println("D + E =");
		long DOutputA5S = System.nanoTime();
		Add32.output();
		long DOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add32.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + E = " + (AddD5E - AddD5S) + " ns, and " + (DOutputA5E - DOutputA5S) + " ns for output");

		long AddD6S = System.nanoTime(); 
		LongInt Add33 = D.add(F);
		long AddD6E = System.nanoTime();
		System.out.println("D + F =");
		long DOutputA6S = System.nanoTime();
		Add33.output();
		long DOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add33.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + F = " + (AddD6E - AddD6S) + " ns, and " + (DOutputA6E - DOutputA6S) + " ns for output");

		long AddD7S = System.nanoTime(); 
		LongInt Add34 = D.add(G);
		long AddD7E = System.nanoTime();
		System.out.println("D + G =");
		long DOutputA7S = System.nanoTime();
		Add34.output();
		long DOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add34.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + G = " + (AddD7E - AddD7S) + " ns, and " + (DOutputA7E - DOutputA7S) + " ns for output");

		long AddD8S = System.nanoTime(); 
		LongInt Add35 = D.add(H);
		long AddD8E = System.nanoTime();
		System.out.println("D + H =");
		long DOutputA8S = System.nanoTime();
		Add35.output();
		long DOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add35.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + H = " + (AddD8E - AddD8S) + " ns, and " + (DOutputA8E - DOutputA8S) + " ns for output");

		long AddD9S = System.nanoTime(); 
		LongInt Add36 = D.add(I);
		long AddD9E = System.nanoTime();
		System.out.println("D + I =");
		long DOutputA9S = System.nanoTime();
		Add36.output();
		long DOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add36.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D + I = " + (AddD9E - AddD9S) + " ns, and " + (DOutputA9E - DOutputA9S) + " ns for output");
		
		writer.println();
		
		long AddE1S = System.nanoTime(); 
		LongInt Add37 = E.add(A);
		long AddE1E = System.nanoTime();
		System.out.println("E + A =");
		long EOutputA1S = System.nanoTime();
		Add37.output();
		long EOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add37.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + A = " + (AddE1E - AddE1S) + " ns, and " + (EOutputA1E - EOutputA1S) + " ns for output");
		
		long AddE2S = System.nanoTime(); 
		LongInt Add38 = E.add(B);
		long AddE2E = System.nanoTime();
		System.out.println("E + B =");
		long EOutputA2S = System.nanoTime();
		Add38.output();
		long EOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add38.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + B = " + (AddE2E - AddE2S) + " ns, and " + (EOutputA2E - EOutputA2S) + " ns for output");

		long AddE3S = System.nanoTime(); 
		LongInt Add39 = E.add(C);
		long AddE3E = System.nanoTime();
		System.out.println("E + C =");
		long EOutputA3S = System.nanoTime();
		Add39.output();
		long EOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add39.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + C = " + (AddE3E - AddE3S) + " ns, and " + (EOutputA3E - EOutputA3S) + " ns for output");

		long AddE4S = System.nanoTime(); 
		LongInt Add40 = E.add(D);
		long AddE4E = System.nanoTime();
		System.out.println("E + D =");
		long EOutputA4S = System.nanoTime();
		Add40.output();
		long EOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add40.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + D = " + (AddE4E - AddE4S) + " ns, and " + (EOutputA4E - EOutputA4S) + " ns for output");
		
		long AddE5S = System.nanoTime(); 
		LongInt Add41 = E.add(E);
		long AddE5E = System.nanoTime();
		System.out.println("E + E =");
		long EOutputA5S = System.nanoTime();
		Add41.output();
		long EOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add41.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + E = " + (AddE5E - AddE5S) + " ns, and " + (EOutputA5E - EOutputA5S) + " ns for output");
		
		long AddE6S = System.nanoTime(); 
		LongInt Add42 = E.add(F);
		long AddE6E = System.nanoTime();
		System.out.println("E + F =");
		long EOutputA6S = System.nanoTime();
		Add42.output();
		long EOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add42.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + F = " + (AddE6E - AddE6S) + " ns, and " + (EOutputA6E - EOutputA6S) + " ns for output");

		long AddE7S = System.nanoTime(); 
		LongInt Add43 = E.add(G);
		long AddE7E = System.nanoTime();
		System.out.println("E + G =");
		long EOutputA7S = System.nanoTime();
		Add43.output();
		long EOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add43.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + G = " + (AddE7E - AddE7S) + " ns, and " + (EOutputA7E - EOutputA7S) + " ns for output");

		long AddE8S = System.nanoTime(); 
		LongInt Add44 = E.add(H);
		long AddE8E = System.nanoTime();
		System.out.println("E + H =");
		long EOutputA8S = System.nanoTime();
		Add44.output();
		long EOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add44.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + H = " + (AddE8E - AddE8S) + " ns, and " + (EOutputA8E - EOutputA8S) + " ns for output");

		long AddE9S = System.nanoTime(); 
		LongInt Add45 = E.add(I);
		long AddE9E = System.nanoTime();
		System.out.println("E + I =");
		long EOutputA9S = System.nanoTime();
		Add45.output();
		long EOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add45.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E + I = " + (AddE9E - AddE9S) + " ns, and " + (EOutputA9E - EOutputA9S) + " ns for output");
		
		writer.println();
		
		long AddF1S = System.nanoTime(); 
		LongInt Add46 = F.add(A);
		long AddF1E = System.nanoTime();
		System.out.println("F + A =");
		long FOutputA1S = System.nanoTime();
		Add46.output();
		long FOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add46.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + A = " + (AddF1E - AddF1S) + " ns, and " + (FOutputA1E - FOutputA1S) + " ns for output");

		long AddF2S = System.nanoTime(); 
		LongInt Add47 = F.add(B);
		long AddF2E = System.nanoTime();
		System.out.println("F + B =");
		long FOutputA2S = System.nanoTime();
		Add47.output();
		long FOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add47.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + B = " + (AddF2E - AddF2S) + " ns, and " + (FOutputA2E - FOutputA2S) + " ns for output");

		long AddF3S = System.nanoTime(); 
		LongInt Add48 = F.add(C);
		long AddF3E = System.nanoTime();
		System.out.println("F + C =");
		long FOutputA3S = System.nanoTime();
		Add48.output();
		long FOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add48.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + C = " + (AddF3E - AddF3S) + " ns, and " + (FOutputA3E - FOutputA3S) + " ns for output");

		long AddF4S = System.nanoTime(); 
		LongInt Add49 = F.add(D);
		long AddF4E = System.nanoTime();
		System.out.println("F + D =");
		long FOutputA4S = System.nanoTime();
		Add49.output();
		long FOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add49.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + D = " + (AddF4E - AddF4S) + " ns, and " + (FOutputA4E - FOutputA4S) + " ns for output");
		
		long AddF5S = System.nanoTime(); 
		LongInt Add50 = F.add(E);
		long AddF5E = System.nanoTime();
		System.out.println("F + E =");
		long FOutputA5S = System.nanoTime();
		Add50.output();
		long FOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add50.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + E = " + (AddF5E - AddF5S) + " ns, and " + (FOutputA5E - FOutputA5S) + " ns for output");

		long AddF6S = System.nanoTime(); 
		LongInt Add51 = F.add(F);
		long AddF6E = System.nanoTime();
		System.out.println("F + F =");
		long FOutputA6S = System.nanoTime();
		Add51.output();
		long FOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add51.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + F = " + (AddF6E - AddF6S) + " ns, and " + (FOutputA6E - FOutputA6S) + " ns for output");
		
		long AddF7S = System.nanoTime(); 
		LongInt Add52 = F.add(G);
		long AddF7E = System.nanoTime();
		System.out.println("F + G =");
		long FOutputA7S = System.nanoTime();
		Add52.output();
		long FOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add52.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + G = " + (AddF7E - AddF7S) + " ns, and " + (FOutputA7E - FOutputA7S) + " ns for output");
		
		long AddF8S = System.nanoTime(); 
		LongInt Add53 = F.add(H);
		long AddF8E = System.nanoTime();
		System.out.println("F + H =");
		long FOutputA8S = System.nanoTime();
		Add53.output();
		long FOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add53.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + H = " + (AddF8E - AddF8S) + " ns, and " + (FOutputA8E - FOutputA8S) + " ns for output");

		long AddF9S = System.nanoTime(); 
		LongInt Add54 = F.add(I);
		long AddF9E = System.nanoTime();
		System.out.println("F + I =");
		long FOutputA9S = System.nanoTime();
		Add54.output();
		long FOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add54.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F + I = " + (AddF9E - AddF9S) + " ns, and " + (FOutputA9E - FOutputA9S) + " ns for output");
		
		writer.println();
		
		long AddG1S = System.nanoTime(); 
		LongInt Add55 = G.add(A);
		long AddG1E = System.nanoTime();
		System.out.println("G + A =");
		long GOutputA1S = System.nanoTime();
		Add55.output();
		long GOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add55.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + A = " + (AddG1E - AddG1S) + " ns, and " + (GOutputA1E - GOutputA1S) + " ns for output");
		
		long AddG2S = System.nanoTime(); 
		LongInt Add56 = G.add(B);
		long AddG2E = System.nanoTime();
		System.out.println("G + B =");
		long GOutputA2S = System.nanoTime();
		Add56.output();
		long GOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add56.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + B = " + (AddG2E - AddG2S) + " ns, and " + (GOutputA2E - GOutputA2S) + " ns for output");

		long AddG3S = System.nanoTime(); 
		LongInt Add57 = G.add(C);
		long AddG3E = System.nanoTime();
		System.out.println("G + C =");
		long GOutputA3S = System.nanoTime();
		Add57.output();
		long GOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add57.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + C = " + (AddG3E - AddG3S) + " ns, and " + (GOutputA3E - GOutputA3S) + " ns for output");
		
		long AddG4S = System.nanoTime(); 
		LongInt Add58 = G.add(D);
		long AddG4E = System.nanoTime();
		System.out.println("G + D =");
		long GOutputA4S = System.nanoTime();
		Add58.output();
		long GOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add58.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + D = " + (AddG4E - AddG4S) + " ns, and " + (GOutputA4E - GOutputA4S) + " ns for output");

		long AddG5S = System.nanoTime(); 
		LongInt Add59 = G.add(E);
		long AddG5E = System.nanoTime();
		System.out.println("G + E =");
		long GOutputA5S = System.nanoTime();
		Add59.output();
		long GOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add59.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + E = " + (AddG5E - AddG5S) + " ns, and " + (GOutputA5E - GOutputA5S) + " ns for output");
		
		long AddG6S = System.nanoTime(); 
		LongInt Add60 = G.add(F);
		long AddG6E = System.nanoTime();
		System.out.println("G + F =");
		long GOutputA6S = System.nanoTime();
		Add60.output();
		long GOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add60.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + F = " + (AddG6E - AddG6S) + " ns, and " + (GOutputA6E - GOutputA6S) + " ns for output");
		
		long AddG7S = System.nanoTime(); 
		LongInt Add61 = G.add(G);
		long AddG7E = System.nanoTime();
		System.out.println("G + G =");
		long GOutputA7S = System.nanoTime();
		Add61.output();
		long GOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add61.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + G = " + (AddG7E - AddG7S) + " ns, and " + (GOutputA7E - GOutputA7S) + " ns for output");
		
		long AddG8S = System.nanoTime(); 
		LongInt Add62 = G.add(H);
		long AddG8E = System.nanoTime();
		System.out.println("G + H =");
		long GOutputA8S = System.nanoTime();
		Add62.output();
		long GOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add62.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + H = " + (AddG8E - AddG8S) + " ns, and " + (GOutputA8E - GOutputA8S) + " ns for output");
		
		long AddG9S = System.nanoTime(); 
		LongInt Add63 = G.add(I);
		long AddG9E = System.nanoTime();
		System.out.println("G + I =");
		long GOutputA9S = System.nanoTime();
		Add63.output();
		long GOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add63.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G + I = " + (AddG9E - AddG9S) + " ns, and " + (GOutputA9E - GOutputA9S) + " ns for output");
		
		writer.println();
		
		long AddH1S = System.nanoTime(); 
		LongInt Add64 = H.add(A);
		long AddH1E = System.nanoTime();
		System.out.println("H + A =");
		long HOutputA1S = System.nanoTime();
		Add64.output();
		long HOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add64.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + A = " + (AddH1E - AddH1S) + " ns, and " + (HOutputA1E - HOutputA1S) + " ns for output");	
		
		long AddH2S = System.nanoTime(); 
		LongInt Add65 = H.add(B);
		long AddH2E = System.nanoTime();
		System.out.println("H + B =");
		long HOutputA2S = System.nanoTime();
		Add65.output();
		long HOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add65.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + B = " + (AddH2E - AddH2S) + " ns, and " + (HOutputA2E - HOutputA2S) + " ns for output");

		long AddH3S = System.nanoTime(); 
		LongInt Add66 = H.add(C);
		long AddH3E = System.nanoTime();
		System.out.println("H + C =");
		long HOutputA3S = System.nanoTime();
		Add66.output();
		long HOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add66.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + C = " + (AddH3E - AddH3S) + " ns, and " + (HOutputA3E - HOutputA3S) + " ns for output");
		
		long AddH4S = System.nanoTime(); 
		LongInt Add67 = H.add(D);
		long AddH4E = System.nanoTime();
		System.out.println("H + D =");
		long HOutputA4S = System.nanoTime();
		Add67.output();
		long HOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add67.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + D = " + (AddH4E - AddH4S) + " ns, and " + (HOutputA4E - HOutputA4S) + " ns for output");

		long AddH5S = System.nanoTime(); 
		LongInt Add68 = H.add(E);
		long AddH5E = System.nanoTime();
		System.out.println("H + E =");
		long HOutputA5S = System.nanoTime();
		Add68.output();
		long HOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add68.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + E = " + (AddH5E - AddH5S) + " ns, and " + (HOutputA5E - HOutputA5S) + " ns for output");
		
		long AddH6S = System.nanoTime(); 
		LongInt Add69 = H.add(F);
		long AddH6E = System.nanoTime();
		System.out.println("H + F =");
		long HOutputA6S = System.nanoTime();
		Add69.output();
		long HOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add69.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + F = " + (AddH6E - AddH6S) + " ns, and " + (HOutputA6E - HOutputA6S) + " ns for output");
		
		long AddH7S = System.nanoTime(); 
		LongInt Add70 = H.add(G);
		long AddH7E = System.nanoTime();
		System.out.println("H + G =");
		long HOutputA7S = System.nanoTime();
		Add70.output();
		long HOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add70.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + G = " + (AddH7E - AddH7S) + " ns, and " + (HOutputA7E - HOutputA7S) + " ns for output");
		
		long AddH8S = System.nanoTime(); 
		LongInt Add71 = H.add(H);
		long AddH8E = System.nanoTime();
		System.out.println("H + H =");
		long HOutputA8S = System.nanoTime();
		Add71.output();
		long HOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add71.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + H = " + (AddH8E - AddH8S) + " ns, and " + (HOutputA8E - HOutputA8S) + " ns for output");

		long AddH9S = System.nanoTime(); 
		LongInt Add72 = H.add(I);
		long AddH9E = System.nanoTime();
		System.out.println("H + I =");
		long HOutputA9S = System.nanoTime();
		Add72.output();
		long HOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add72.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H + I = " + (AddH9E - AddH9S) + " ns, and " + (HOutputA9E - HOutputA9S) + " ns for output");
		
		writer.println();
		
		long AddI1S = System.nanoTime(); 
		LongInt Add73 = I.add(A);
		long AddI1E = System.nanoTime();
		System.out.println("I + A =");
		long IOutputA1S = System.nanoTime();
		Add73.output();
		long IOutputA1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add73.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + A = " + (AddI1E - AddI1S) + " ns, and " + (IOutputA1E - IOutputA1S) + " ns for output");
		
		long AddI2S = System.nanoTime(); 
		LongInt Add74 = I.add(B);
		long AddI2E = System.nanoTime();
		System.out.println("I + B =");
		long IOutputA2S = System.nanoTime();
		Add74.output();
		long IOutputA2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add74.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + B = " + (AddI2E - AddI2S) + " ns, and " + (IOutputA2E - IOutputA2S) + " ns for output");

		long AddI3S = System.nanoTime(); 
		LongInt Add75 = I.add(C);
		long AddI3E = System.nanoTime();
		System.out.println("I + C =");
		long IOutputA3S = System.nanoTime();
		Add75.output();
		long IOutputA3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add75.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + C = " + (AddI3E - AddI3S) + " ns, and " + (IOutputA3E - IOutputA3S) + " ns for output");
		
		long AddI4S = System.nanoTime(); 
		LongInt Add76 = I.add(D);
		long AddI4E = System.nanoTime();
		System.out.println("I + D =");
		long IOutputA4S = System.nanoTime();
		Add76.output();
		long IOutputA4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add76.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + D = " + (AddI4E - AddI4S) + " ns, and " + (IOutputA4E - IOutputA4S) + " ns for output");

		long AddI5S = System.nanoTime(); 
		LongInt Add77 = I.add(E);
		long AddI5E = System.nanoTime();
		System.out.println("I + E =");
		long IOutputA5S = System.nanoTime();
		Add77.output();
		long IOutputA5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add77.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + E = " + (AddI5E - AddI5S) + " ns, and " + (IOutputA5E - IOutputA5S) + " ns for output");
		
		long AddI6S = System.nanoTime(); 
		LongInt Add78 = I.add(F);
		long AddI6E = System.nanoTime();
		System.out.println("I + F =");
		long IOutputA6S = System.nanoTime();
		Add78.output();
		long IOutputA6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add78.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + F = " + (AddI6E - AddI6S) + " ns, and " + (IOutputA6E - IOutputA6S) + " ns for output");
		
		long AddI7S = System.nanoTime(); 
		LongInt Add79 = I.add(G);
		long AddI7E = System.nanoTime();
		System.out.println("I + G =");
		long IOutputA7S = System.nanoTime();
		Add79.output();
		long IOutputA7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add79.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + G = " + (AddI7E - AddI7S) + " ns, and " + (IOutputA7E - IOutputA7S) + " ns for output");

		long AddI8S = System.nanoTime(); 
		LongInt Add80 = I.add(H);
		long AddI8E = System.nanoTime();
		System.out.println("I + H =");
		long IOutputA8S = System.nanoTime();
		Add80.output();
		long IOutputA8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add80.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + H = " + (AddI8E - AddI8S) + " ns, and " + (IOutputA8E - IOutputA8S) + " ns for output");
		
		long AddI9S = System.nanoTime(); 
		LongInt Add81 = I.add(I);
		long AddI9E = System.nanoTime();
		System.out.println("I + I =");
		long IOutputA9S = System.nanoTime();
		Add81.output();
		long IOutputA9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Add81.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I + I = " + (AddI9E - AddI9S) + " ns, and " + (IOutputA9E - IOutputA9S) + " ns for output");
		
		writer.println();
		
		long SubtractA1S = System.nanoTime(); 
		LongInt Subtract1 = A.subtract(A);
		long SubtractA1E = System.nanoTime();
		System.out.println("A - A =");
		long AOutputS1S = System.nanoTime();
		Subtract1.output();
		long AOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - A = " + (SubtractA1E - SubtractA1S) + " ns, and " + (AOutputS1E - AOutputS1S) + " ns for output");

		long SubtractA2S = System.nanoTime(); 
		LongInt Subtract2 = A.subtract(B);
		long SubtractA2E = System.nanoTime();
		System.out.println("A - B =");
		long AOutputS2S = System.nanoTime();
		Subtract2.output();
		long AOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - B = " + (SubtractA2E - SubtractA2S) + " ns, and " + (AOutputS2E - AOutputS2S) + " ns for output");
				
		long SubtractA3S = System.nanoTime(); 
		LongInt Subtract3 = A.subtract(C);
		long SubtractA3E = System.nanoTime();
		System.out.println("A - C =");
		long AOutputS3S = System.nanoTime();
		Subtract3.output();
		long AOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - C = " + (SubtractA3E - SubtractA3S) + " ns, and " + (AOutputS3E - AOutputS3S) + " ns for output");

		long SubtractA4S = System.nanoTime(); 
		LongInt Subtract4 = A.subtract(D);
		long SubtractA4E = System.nanoTime();
		System.out.println("A - D =");
		long AOutputS4S = System.nanoTime();
		Subtract4.output();
		long AOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract4.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - D = " + (SubtractA4E - SubtractA4S) + " ns, and " + (AOutputS4E - AOutputS4S) + " ns for output");
		
		long SubtractA5S = System.nanoTime(); 
		LongInt Subtract5 = A.subtract(E);
		long SubtractA5E = System.nanoTime();
		System.out.println("A - E =");
		long AOutputS5S = System.nanoTime();
		Subtract5.output();
		long AOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract5.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - E = " + (SubtractA5E - SubtractA5S) + " ns, and " + (AOutputS5E - AOutputS5S) + " ns for output");

		long SubtractA6S = System.nanoTime(); 
		LongInt Subtract6 = A.subtract(F);
		long SubtractA6E = System.nanoTime();
		System.out.println("A - F =");
		long AOutputS6S = System.nanoTime();
		Subtract6.output();
		long AOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract6.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - F = " + (SubtractA6E - SubtractA6S) + " ns, and " + (AOutputS6E - AOutputS6S) + " ns for output");
	
		long SubtractA7S = System.nanoTime(); 
		LongInt Subtract7 = A.subtract(G);
		long SubtractA7E = System.nanoTime();
		System.out.println("A - G =");
		long AOutputS7S = System.nanoTime();
		Subtract7.output();
		long AOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract7.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - G = " + (SubtractA7E - SubtractA7S) + " ns, and " + (AOutputS7E - AOutputS7S) + " ns for output");
		
		long SubtractA8S = System.nanoTime(); 
		LongInt Subtract8 = A.subtract(H);
		long SubtractA8E = System.nanoTime();
		System.out.println("A - H =");
		long AOutputS8S = System.nanoTime();
		Subtract8.output();
		long AOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract8.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - H = " + (SubtractA8E - SubtractA8S) + " ns, and " + (AOutputS8E - AOutputS8S) + " ns for output");
				
		long SubtractA9S = System.nanoTime(); 
		LongInt Subtract9 = A.subtract(I);
		long SubtractA9E = System.nanoTime();
		System.out.println("A - I =");
		long AOutputS9S = System.nanoTime();
		Subtract9.output();
		long AOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract9.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A - I = " + (SubtractA9E - SubtractA9S) + " ns, and " + (AOutputS9E - AOutputS9S) + " ns for output");

		writer.println();
		
		long SubtractB1S = System.nanoTime(); 
		LongInt Subtract10 = B.subtract(A);
		long SubtractB1E = System.nanoTime();
		System.out.println("B - A =");
		long BOutputS1S = System.nanoTime();
		Subtract10.output();
		long BOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract10.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - A = " + (SubtractB1E - SubtractB1S) + " ns, and " + (BOutputS1E - BOutputS1S) + " ns for output");

		long SubtractB2S = System.nanoTime(); 
		LongInt Subtract11 = B.subtract(B);
		long SubtractB2E = System.nanoTime();
		System.out.println("B - B =");
		long BOutputS2S = System.nanoTime();
		Subtract11.output();
		long BOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract11.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - B = " + (SubtractB2E - SubtractB2S) + " ns, and " + (BOutputS2E - BOutputS2S) + " ns for output");
		
		long SubtractB3S = System.nanoTime(); 
		LongInt Subtract12 = B.subtract(C);
		long SubtractB3E = System.nanoTime();
		System.out.println("B - C =");
		long BOutputS3S = System.nanoTime();
		Subtract12.output();
		long BOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract12.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - C = " + (SubtractB3E - SubtractB3S) + " ns, and " + (BOutputS3E - BOutputS3S) + " ns for output");

		long SubtractB4S = System.nanoTime(); 
		LongInt Subtract13 = B.subtract(D);
		long SubtractB4E = System.nanoTime();
		System.out.println("B - D =");
		long BOutputS4S = System.nanoTime();
		Subtract13.output();
		long BOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract13.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - D = " + (SubtractB4E - SubtractB4S) + " ns, and " + (BOutputS4E - BOutputS4S) + " ns for output");

		long SubtractB5S = System.nanoTime(); 
		LongInt Subtract14 = B.subtract(E);
		long SubtractB5E = System.nanoTime();
		System.out.println("B - E =");
		long BOutputS5S = System.nanoTime();
		Subtract14.output();
		long BOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract14.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - E = " + (SubtractB5E - SubtractB5S) + " ns, and " + (BOutputS5E - BOutputS5S) + " ns for output");

		long SubtractB6S = System.nanoTime(); 
		LongInt Subtract15 = B.subtract(F);
		long SubtractB6E = System.nanoTime();
		System.out.println("B - F =");
		long BOutputS6S = System.nanoTime();
		Subtract15.output();
		long BOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract15.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - F = " + (SubtractB6E - SubtractB6S) + " ns, and " + (BOutputS6E - BOutputS6S) + " ns for output");
	
		long SubtractB7S = System.nanoTime(); 
		LongInt Subtract16 = B.subtract(G);
		long SubtractB7E = System.nanoTime();
		System.out.println("B - G =");
		long BOutputS7S = System.nanoTime();
		Subtract16.output();
		long BOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract16.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - G = " + (SubtractB7E - SubtractB7S) + " ns, and " + (BOutputS7E - BOutputS7S) + " ns for output");
	
		long SubtractB8S = System.nanoTime(); 
		LongInt Subtract17 = B.subtract(H);
		long SubtractB8E = System.nanoTime();
		System.out.println("B - H =");
		long BOutputS8S = System.nanoTime();
		Subtract17.output();
		long BOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract17.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - H = " + (SubtractB8E - SubtractB8S) + " ns, and " + (BOutputS8E - BOutputS8S) + " ns for output");

		long SubtractB9S = System.nanoTime(); 
		LongInt Subtract18 = B.subtract(I);
		long SubtractB9E = System.nanoTime();
		System.out.println("B - I =");
		long BOutputS9S = System.nanoTime();
		Subtract18.output();
		long BOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract18.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B - I = " + (SubtractB9E - SubtractB9S) + " ns, and " + (BOutputS9E - BOutputS9S) + " ns for output");

		writer.println();
		
		long SubtractC1S = System.nanoTime(); 
		LongInt Subtract19 = C.subtract(A);
		long SubtractC1E = System.nanoTime();
		System.out.println("C - A =");
		long COutputS1S = System.nanoTime();
		Subtract19.output();
		long COutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract19.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - A = " + (SubtractC1E - SubtractC1S) + " ns, and " + (COutputS1E - COutputS1S) + " ns for output");

		long SubtractC2S = System.nanoTime(); 
		LongInt Subtract20 = C.subtract(B);
		long SubtractC2E = System.nanoTime();
		System.out.println("C - B =");
		long COutputS2S = System.nanoTime();
		Subtract20.output();
		long COutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract20.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - B = " + (SubtractC2E - SubtractC2S) + " ns, and " + (COutputS2E - COutputS2S) + " ns for output");

		long SubtractC3S = System.nanoTime(); 
		LongInt Subtract21 = C.subtract(C);
		long SubtractC3E = System.nanoTime();
		System.out.println("C - C =");
		long COutputS3S = System.nanoTime();
		Subtract21.output();
		long COutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract21.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - C = " + (SubtractC3E - SubtractC3S) + " ns, and " + (COutputS3E - COutputS3S) + " ns for output");

		long SubtractC4S = System.nanoTime(); 
		LongInt Subtract22 = C.subtract(D);
		long SubtractC4E = System.nanoTime();
		System.out.println("C - D =");
		long COutputS4S = System.nanoTime();
		Subtract22.output();
		long COutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract22.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - D = " + (SubtractC4E - SubtractC4S) + " ns, and " + (COutputS4E - COutputS4S) + " ns for output");

		long SubtractC5S = System.nanoTime(); 
		LongInt Subtract23 = C.subtract(E);
		long SubtractC5E = System.nanoTime();
		System.out.println("C - E =");
		long COutputS5S = System.nanoTime();
		Subtract23.output();
		long COutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract23.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - E = " + (SubtractC5E - SubtractC5S) + " ns, and " + (COutputS5E - COutputS5S) + " ns for output");

		long SubtractC6S = System.nanoTime(); 
		LongInt Subtract24 = C.subtract(F);
		long SubtractC6E = System.nanoTime();
		System.out.println("C - F =");
		long COutputS6S = System.nanoTime();
		Subtract24.output();
		long COutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract24.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - F = " + (SubtractC6E - SubtractC6S) + " ns, and " + (COutputS6E - COutputS6S) + " ns for output");
			
		long SubtractC7S = System.nanoTime(); 
		LongInt Subtract25 = C.subtract(G);
		long SubtractC7E = System.nanoTime();
		System.out.println("C - G =");
		long COutputS7S = System.nanoTime();
		Subtract25.output();
		long COutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract25.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - G = " + (SubtractC7E - SubtractC7S) + " ns, and " + (COutputS7E - COutputS7S) + " ns for output");

		long SubtractC8S = System.nanoTime(); 
		LongInt Subtract26 = C.subtract(H);
		long SubtractC8E = System.nanoTime();
		System.out.println("C - H =");
		long COutputS8S = System.nanoTime();
		Subtract26.output();
		long COutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract26.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - H = " + (SubtractC8E - SubtractC8S) + " ns, and " + (COutputS8E - COutputS8S) + " ns for output");

		long SubtractC9S = System.nanoTime(); 
		LongInt Subtract27 = C.subtract(I);
		long SubtractC9E = System.nanoTime();
		System.out.println("C - I =");
		long COutputS9S = System.nanoTime();
		Subtract27.output();
		long COutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract27.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C - I = " + (SubtractC9E - SubtractC9S) + " ns, and " + (COutputS9E - COutputS9S) + " ns for output");
		
		writer.println();
		
		long SubtractD1S = System.nanoTime(); 
		LongInt Subtract28 = D.subtract(A);
		long SubtractD1E = System.nanoTime();
		System.out.println("D - A =");
		long DOutputS1S = System.nanoTime();
		Subtract28.output();
		long DOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract28.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - A = " + (SubtractD1E - SubtractD1S) + " ns, and " + (DOutputS1E - DOutputS1S) + " ns for output");

		long SubtractD2S = System.nanoTime(); 
		LongInt Subtract29 = D.subtract(B);
		long SubtractD2E = System.nanoTime();
		System.out.println("D - B =");
		long DOutputS2S = System.nanoTime();
		Subtract29.output();
		long DOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract29.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - B = " + (SubtractD2E - SubtractD2S) + " ns, and " + (DOutputS2E - DOutputS2S) + " ns for output");
		
		long SubtractD3S = System.nanoTime(); 
		LongInt Subtract30 = D.subtract(C);
		long SubtractD3E = System.nanoTime();
		System.out.println("D - C =");
		long DOutputS3S = System.nanoTime();
		Subtract30.output();
		long DOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract30.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - C = " + (SubtractD3E - SubtractD3S) + " ns, and " + (DOutputS3E - DOutputS3S) + " ns for output");

		long SubtractD4S = System.nanoTime(); 
		LongInt Subtract31 = D.subtract(D);
		long SubtractD4E = System.nanoTime();
		System.out.println("D - D =");
		long DOutputS4S = System.nanoTime();
		Subtract31.output();
		long DOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract31.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - D = " + (SubtractD4E - SubtractD4S) + " ns, and " + (DOutputS4E - DOutputS4S) + " ns for output");

		long SubtractD5S = System.nanoTime(); 
		LongInt Subtract32 = D.subtract(E);
		long SubtractD5E = System.nanoTime();
		System.out.println("D - E =");
		long DOutputS5S = System.nanoTime();
		Subtract32.output();
		long DOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract32.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - E = " + (SubtractD5E - SubtractD5S) + " ns, and " + (DOutputS5E - DOutputS5S) + " ns for output");
		
		long SubtractD6S = System.nanoTime(); 
		LongInt Subtract33 = D.subtract(F);
		long SubtractD6E = System.nanoTime();
		System.out.println("D - F =");
		long DOutputS6S = System.nanoTime();
		Subtract33.output();
		long DOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract33.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - F = " + (SubtractD6E - SubtractD6S) + " ns, and " + (DOutputS6E - DOutputS6S) + " ns for output");

		long SubtractD7S = System.nanoTime(); 
		LongInt Subtract34 = D.subtract(G);
		long SubtractD7E = System.nanoTime();
		System.out.println("D - G =");
		long DOutputS7S = System.nanoTime();
		Subtract34.output();
		long DOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract34.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - G = " + (SubtractD7E - SubtractD7S) + " ns, and " + (DOutputS7E - DOutputS7S) + " ns for output");
		
		long SubtractD8S = System.nanoTime(); 
		LongInt Subtract35 = D.subtract(H);
		long SubtractD8E = System.nanoTime();
		System.out.println("D - H =");
		long DOutputS8S = System.nanoTime();
		Subtract35.output();
		long DOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract35.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - H = " + (SubtractD8E - SubtractD8S) + " ns, and " + (DOutputS8E - DOutputS8S) + " ns for output");

		long SubtractD9S = System.nanoTime(); 
		LongInt Subtract36 = D.subtract(I);
		long SubtractD9E = System.nanoTime();
		System.out.println("D - I =");
		long DOutputS9S = System.nanoTime();
		Subtract36.output();
		long DOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract36.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D - I = " + (SubtractD9E - SubtractD9S) + " ns, and " + (DOutputS9E - DOutputS9S) + " ns for output");
	
		writer.println();
		
		long SubtractE1S = System.nanoTime(); 
		LongInt Subtract37 = E.subtract(A);
		long SubtractE1E = System.nanoTime();
		System.out.println("E - A =");
		long EOutputS1S = System.nanoTime();
		Subtract37.output();
		long EOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract37.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - A = " + (SubtractE1E - SubtractE1S) + " ns, and " + (EOutputS1E - EOutputS1S) + " ns for output");

		long SubtractE2S = System.nanoTime(); 
		LongInt Subtract38 = E.subtract(B);
		long SubtractE2E = System.nanoTime();
		System.out.println("E - B =");
		long EOutputS2S = System.nanoTime();
		Subtract38.output();
		long EOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract38.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - B = " + (SubtractE2E - SubtractE2S) + " ns, and " + (EOutputS2E - EOutputS2S) + " ns for output");
		
		long SubtractE3S = System.nanoTime(); 
		LongInt Subtract39 = E.subtract(C);
		long SubtractE3E = System.nanoTime();
		System.out.println("E - C =");
		long EOutputS3S = System.nanoTime();
		Subtract39.output();
		long EOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract39.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - C = " + (SubtractE3E - SubtractE3S) + " ns, and " + (EOutputS3E - EOutputS3S) + " ns for output");

		long SubtractE4S = System.nanoTime(); 
		LongInt Subtract40 = E.subtract(D);
		long SubtractE4E = System.nanoTime();
		System.out.println("E - D =");
		long EOutputS4S = System.nanoTime();
		Subtract40.output();
		long EOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract40.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - D = " + (SubtractE4E - SubtractE4S) + " ns, and " + (EOutputS4E - EOutputS4S) + " ns for output");
		
		long SubtractE5S = System.nanoTime(); 
		LongInt Subtract41 = E.subtract(E);
		long SubtractE5E = System.nanoTime();
		System.out.println("E - E =");
		long EOutputS5S = System.nanoTime();
		Subtract41.output();
		long EOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract41.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - E = " + (SubtractE5E - SubtractE5S) + " ns, and " + (EOutputS5E - EOutputS5S) + " ns for output");
	
		long SubtractE6S = System.nanoTime(); 
		LongInt Subtract42 = E.subtract(F);
		long SubtractE6E = System.nanoTime();
		System.out.println("E - F =");
		long EOutputS6S = System.nanoTime();
		Subtract42.output();
		long EOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract42.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - F = " + (SubtractE6E - SubtractE6S) + " ns, and " + (EOutputS6E - EOutputS6S) + " ns for output");

		long SubtractE7S = System.nanoTime(); 
		LongInt Subtract43 = E.subtract(G);
		long SubtractE7E = System.nanoTime();
		System.out.println("E - G =");
		long EOutputS7S = System.nanoTime();
		Subtract43.output();
		long EOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract43.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - G = " + (SubtractE7E - SubtractE7S) + " ns, and " + (EOutputS7E - EOutputS7S) + " ns for output");

		long SubtractE8S = System.nanoTime(); 
		LongInt Subtract44 = E.subtract(H);
		long SubtractE8E = System.nanoTime();
		System.out.println("E - H =");
		long EOutputS8S = System.nanoTime();
		Subtract44.output();
		long EOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract44.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - H = " + (SubtractE8E - SubtractE8S) + " ns, and " + (EOutputS8E - EOutputS8S) + " ns for output");

		long SubtractE9S = System.nanoTime(); 
		LongInt Subtract45 = E.subtract(I);
		long SubtractE9E = System.nanoTime();
		System.out.println("E - I =");
		long EOutputS9S = System.nanoTime();
		Subtract45.output();
		long EOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract45.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E - I = " + (SubtractE9E - SubtractE9S) + " ns, and " + (EOutputS9E - EOutputS9S) + " ns for output");

		writer.println();
		
		long SubtractF1S = System.nanoTime(); 
		LongInt Subtract46 = F.subtract(A);
		long SubtractF1E = System.nanoTime();
		System.out.println("F - A =");
		long FOutputS1S = System.nanoTime();
		Subtract46.output();
		long FOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract46.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - A = " + (SubtractF1E - SubtractF1S) + " ns, and " + (FOutputS1E - FOutputS1S) + " ns for output");

		long SubtractF2S = System.nanoTime(); 
		LongInt Subtract47 = F.subtract(B);
		long SubtractF2E = System.nanoTime();
		System.out.println("F - B =");
		long FOutputS2S = System.nanoTime();
		Subtract47.output();
		long FOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract47.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - B = " + (SubtractF2E - SubtractF2S) + " ns, and " + (FOutputS2E - FOutputS2S) + " ns for output");

		long SubtractF3S = System.nanoTime(); 
		LongInt Subtract48 = F.subtract(C);
		long SubtractF3E = System.nanoTime();
		System.out.println("F - C =");
		long FOutputS3S = System.nanoTime();
		Subtract48.output();
		long FOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract48.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - C = " + (SubtractF3E - SubtractF3S) + " ns, and " + (FOutputS3E - FOutputS3S) + " ns for output");
	
		long SubtractF4S = System.nanoTime(); 
		LongInt Subtract49 = F.subtract(D);
		long SubtractF4E = System.nanoTime();
		System.out.println("F - D =");
		long FOutputS4S = System.nanoTime();
		Subtract49.output();
		long FOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract49.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - D = " + (SubtractF4E - SubtractF4S) + " ns, and " + (FOutputS4E - FOutputS4S) + " ns for output");

		long SubtractF5S = System.nanoTime(); 
		LongInt Subtract50 = F.subtract(E);
		long SubtractF5E = System.nanoTime();
		System.out.println("F - E =");
		long FOutputS5S = System.nanoTime();
		Subtract50.output();
		long FOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract50.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - E = " + (SubtractF5E - SubtractF5S) + " ns, and " + (FOutputS5E - FOutputS5S) + " ns for output");

		long SubtractF6S = System.nanoTime(); 
		LongInt Subtract51 = F.subtract(F);
		long SubtractF6E = System.nanoTime();
		System.out.println("F - F =");
		long FOutputS6S = System.nanoTime();
		Subtract51.output();
		long FOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract51.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - F = " + (SubtractF6E - SubtractF6S) + " ns, and " + (FOutputS6E - FOutputS6S) + " ns for output");
	
		long SubtractF7S = System.nanoTime(); 
		LongInt Subtract52 = F.subtract(G);
		long SubtractF7E = System.nanoTime();
		System.out.println("F - G =");
		long FOutputS7S = System.nanoTime();
		Subtract52.output();
		long FOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract52.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - G = " + (SubtractF7E - SubtractF7S) + " ns, and " + (FOutputS7E - FOutputS7S) + " ns for output");
		
		long SubtractF8S = System.nanoTime(); 
		LongInt Subtract53 = F.subtract(H);
		long SubtractF8E = System.nanoTime();
		System.out.println("F - H =");
		long FOutputS8S = System.nanoTime();
		Subtract53.output();
		long FOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract53.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - H = " + (SubtractF8E - SubtractF8S) + " ns, and " + (FOutputS8E - FOutputS8S) + " ns for output");

		long SubtractF9S = System.nanoTime(); 
		LongInt Subtract54 = F.subtract(I);
		long SubtractF9E = System.nanoTime();
		System.out.println("F - I =");
		long FOutputS9S = System.nanoTime();
		Subtract54.output();
		long FOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract54.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F - I = " + (SubtractF9E - SubtractF9S) + " ns, and " + (FOutputS9E - FOutputS9S) + " ns for output");

		writer.println();
		
		long SubtractG1S = System.nanoTime(); 
		LongInt Subtract55 = G.subtract(A);
		long SubtractG1E = System.nanoTime();
		System.out.println("G - A =");
		long GOutputS1S = System.nanoTime();
		Subtract55.output();
		long GOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract55.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - A = " + (SubtractG1E - SubtractG1S) + " ns, and " + (GOutputS1E - GOutputS1S) + " ns for output");
	
		long SubtractG2S = System.nanoTime(); 
		LongInt Subtract56 = G.subtract(B);
		long SubtractG2E = System.nanoTime();
		System.out.println("G - B =");
		long GOutputS2S = System.nanoTime();
		Subtract56.output();
		long GOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract56.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - B = " + (SubtractG2E - SubtractG2S) + " ns, and " + (GOutputS2E - GOutputS2S) + " ns for output");
	
		long SubtractG3S = System.nanoTime(); 
		LongInt Subtract57 = G.subtract(C);
		long SubtractG3E = System.nanoTime();
		System.out.println("G - C =");
		long GOutputS3S = System.nanoTime();
		Subtract57.output();
		long GOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract57.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - C = " + (SubtractG3E - SubtractG3S) + " ns, and " + (GOutputS3E - GOutputS3S) + " ns for output");

		long SubtractG4S = System.nanoTime(); 
		LongInt Subtract58 = G.subtract(D);
		long SubtractG4E = System.nanoTime();
		System.out.println("G - D =");
		long GOutputS4S = System.nanoTime();
		Subtract58.output();
		long GOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract58.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - D = " + (SubtractG4E - SubtractG4S) + " ns, and " + (GOutputS4E - GOutputS4S) + " ns for output");
	
		long SubtractG5S = System.nanoTime(); 
		LongInt Subtract59 = G.subtract(E);
		long SubtractG5E = System.nanoTime();
		System.out.println("G - E =");
		long GOutputS5S = System.nanoTime();
		Subtract59.output();
		long GOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract59.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - E = " + (SubtractG5E - SubtractG5S) + " ns, and " + (GOutputS5E - GOutputS5S) + " ns for output");
				
		long SubtractG6S = System.nanoTime(); 
		LongInt Subtract60 = G.subtract(F);
		long SubtractG6E = System.nanoTime();
		System.out.println("G - F =");
		long GOutputS6S = System.nanoTime();
		Subtract60.output();
		long GOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract60.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - F = " + (SubtractG6E - SubtractG6S) + " ns, and " + (GOutputS6E - GOutputS6S) + " ns for output");

		long SubtractG7S = System.nanoTime(); 
		LongInt Subtract61 = G.subtract(G);
		long SubtractG7E = System.nanoTime();
		System.out.println("G - G =");
		long GOutputS7S = System.nanoTime();
		Subtract61.output();
		long GOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract61.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - G = " + (SubtractG7E - SubtractG7S) + " ns, and " + (GOutputS7E - GOutputS7S) + " ns for output");

		long SubtractG8S = System.nanoTime(); 
		LongInt Subtract62 = G.subtract(H);
		long SubtractG8E = System.nanoTime();
		System.out.println("G - H =");
		long GOutputS8S = System.nanoTime();
		Subtract62.output();
		long GOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract62.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - H = " + (SubtractG8E - SubtractG8S) + " ns, and " + (GOutputS8E - GOutputS8S) + " ns for output");

		long SubtractG9S = System.nanoTime(); 
		LongInt Subtract63 = G.subtract(I);
		long SubtractG9E = System.nanoTime();
		System.out.println("G - I =");
		long GOutputS9S = System.nanoTime();
		Subtract63.output();
		long GOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract63.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G - I = " + (SubtractG9E - SubtractG9S) + " ns, and " + (GOutputS9E - GOutputS9S) + " ns for output");

		writer.println();
		
		long SubtractH1S = System.nanoTime(); 
		LongInt Subtract64 = H.subtract(A);
		long SubtractH1E = System.nanoTime();
		System.out.println("H - A =");
		long HOutputS1S = System.nanoTime();
		Subtract64.output();
		long HOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract64.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - A = " + (SubtractH1E - SubtractH1S) + " ns, and " + (HOutputS1E - HOutputS1S) + " ns for output");

		long SubtractH2S = System.nanoTime(); 
		LongInt Subtract65 = H.subtract(B);
		long SubtractH2E = System.nanoTime();
		System.out.println("H - B =");
		long HOutputS2S = System.nanoTime();
		Subtract65.output();
		long HOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract65.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - B = " + (SubtractH2E - SubtractH2S) + " ns, and " + (HOutputS2E - HOutputS2S) + " ns for output");

		long SubtractH3S = System.nanoTime(); 
		LongInt Subtract66 = H.subtract(C);
		long SubtractH3E = System.nanoTime();
		System.out.println("H - C =");
		long HOutputS3S = System.nanoTime();
		Subtract66.output();
		long HOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract66.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - C = " + (SubtractH3E - SubtractH3S) + " ns, and " + (HOutputS3E - HOutputS3S) + " ns for output");
	
		long SubtractH4S = System.nanoTime(); 
		LongInt Subtract67 = H.subtract(D);
		long SubtractH4E = System.nanoTime();
		System.out.println("H - D =");
		long HOutputS4S = System.nanoTime();
		Subtract67.output();
		long HOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract67.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - D = " + (SubtractH4E - SubtractH4S) + " ns, and " + (HOutputS4E - HOutputS4S) + " ns for output");

		long SubtractH5S = System.nanoTime(); 
		LongInt Subtract68 = H.subtract(E);
		long SubtractH5E = System.nanoTime();
		System.out.println("H - E =");
		long HOutputS5S = System.nanoTime();
		Subtract68.output();
		long HOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract68.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - E = " + (SubtractH5E - SubtractH5S) + " ns, and " + (HOutputS5E - HOutputS5S) + " ns for output");

		long SubtractH6S = System.nanoTime(); 
		LongInt Subtract69 = H.subtract(F);
		long SubtractH6E = System.nanoTime();
		System.out.println("H - F =");
		long HOutputS6S = System.nanoTime();
		Subtract69.output();
		long HOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract69.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - F = " + (SubtractH6E - SubtractH6S) + " ns, and " + (HOutputS6E - HOutputS6S) + " ns for output");

		long SubtractH7S = System.nanoTime(); 
		LongInt Subtract70 = H.subtract(G);
		long SubtractH7E = System.nanoTime();
		System.out.println("H - G =");
		long HOutputS7S = System.nanoTime();
		Subtract70.output();
		long HOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract70.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - G = " + (SubtractH7E - SubtractH7S) + " ns, and " + (HOutputS7E - HOutputS7S) + " ns for output");

		long SubtractH8S = System.nanoTime(); 
		LongInt Subtract71 = H.subtract(H);
		long SubtractH8E = System.nanoTime();
		System.out.println("H - H =");
		long HOutputS8S = System.nanoTime();
		Subtract71.output();
		long HOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract71.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - H = " + (SubtractH8E - SubtractH8S) + " ns, and " + (HOutputS8E - HOutputS8S) + " ns for output");
		
		long SubtractH9S = System.nanoTime(); 
		LongInt Subtract72 = H.subtract(I);
		long SubtractH9E = System.nanoTime();
		System.out.println("H - I =");
		long HOutputS9S = System.nanoTime();
		Subtract72.output();
		long HOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract72.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H - I = " + (SubtractH9E - SubtractH9S) + " ns, and " + (HOutputS9E - HOutputS9S) + " ns for output");

		writer.println();
		
		long SubtractI1S = System.nanoTime(); 
		LongInt Subtract73 = I.subtract(A);
		long SubtractI1E = System.nanoTime();
		System.out.println("I - A =");
		long IOutputS1S = System.nanoTime();
		Subtract73.output();
		long IOutputS1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract73.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - A = " + (SubtractI1E - SubtractI1S) + " ns, and " + (IOutputS1E - IOutputS1S) + " ns for output");

		long SubtractI2S = System.nanoTime(); 
		LongInt Subtract74 = I.subtract(B);
		long SubtractI2E = System.nanoTime();
		System.out.println("I - B =");
		long IOutputS2S = System.nanoTime();
		Subtract74.output();
		long IOutputS2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract74.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - B = " + (SubtractI2E - SubtractI2S) + " ns, and " + (IOutputS2E - IOutputS2S) + " ns for output");

		long SubtractI3S = System.nanoTime(); 
		LongInt Subtract75 = I.subtract(C);
		long SubtractI3E = System.nanoTime();
		System.out.println("I - C =");
		long IOutputS3S = System.nanoTime();
		Subtract75.output();
		long IOutputS3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract75.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - C = " + (SubtractI3E - SubtractI3S) + " ns, and " + (IOutputS3E - IOutputS3S) + " ns for output");

		long SubtractI4S = System.nanoTime(); 
		LongInt Subtract76 = I.subtract(D);
		long SubtractI4E = System.nanoTime();
		System.out.println("I - D =");
		long IOutputS4S = System.nanoTime();
		Subtract76.output();
		long IOutputS4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract76.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - D = " + (SubtractI4E - SubtractI4S) + " ns, and " + (IOutputS4E - IOutputS4S) + " ns for output");

		long SubtractI5S = System.nanoTime(); 
		LongInt Subtract77 = I.subtract(E);
		long SubtractI5E = System.nanoTime();
		System.out.println("I - E =");
		long IOutputS5S = System.nanoTime();
		Subtract77.output();
		long IOutputS5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract77.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - E = " + (SubtractI5E - SubtractI5S) + " ns, and " + (IOutputS5E - IOutputS5S) + " ns for output");

		long SubtractI6S = System.nanoTime(); 
		LongInt Subtract78 = I.subtract(F);
		long SubtractI6E = System.nanoTime();
		System.out.println("I - F =");
		long IOutputS6S = System.nanoTime();
		Subtract78.output();
		long IOutputS6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract78.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - F = " + (SubtractI6E - SubtractI6S) + " ns, and " + (IOutputS6E - IOutputS6S) + " ns for output");

		long SubtractI7S = System.nanoTime(); 
		LongInt Subtract79 = I.subtract(G);
		long SubtractI7E = System.nanoTime();
		System.out.println("I - G =");
		long IOutputS7S = System.nanoTime();
		Subtract79.output();
		long IOutputS7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract79.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - G = " + (SubtractI7E - SubtractI7S) + " ns, and " + (IOutputS7E - IOutputS7S) + " ns for output");

		long SubtractI8S = System.nanoTime(); 
		LongInt Subtract80 = I.subtract(H);
		long SubtractI8E = System.nanoTime();
		System.out.println("I - H =");
		long IOutputS8S = System.nanoTime();
		Subtract80.output();
		long IOutputS8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract80.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - H = " + (SubtractI8E - SubtractI8S) + " ns, and " + (IOutputS8E - IOutputS8S) + " ns for output");
		
		long SubtractI9S = System.nanoTime(); 
		LongInt Subtract81 = I.subtract(I);
		long SubtractI9E = System.nanoTime();
		System.out.println("I - I =");
		long IOutputS9S = System.nanoTime();
		Subtract81.output();
		long IOutputS9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Subtract81.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I - I = " + (SubtractI9E - SubtractI9S) + " ns, and " + (IOutputS9E - IOutputS9S) + " ns for output");

		writer.println();
		
		long MultiplyA1S = System.nanoTime(); 
		LongInt Multiply1 = A.multiply(A);
		long MultiplyA1E = System.nanoTime();
		System.out.println("A * A =");
		long AOutputM1S = System.nanoTime();
		Multiply1.output();
		long AOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * A = " + (MultiplyA1E - MultiplyA1S) + " ns, and " + (AOutputM1E - AOutputM1S) + " ns for output");

		long MultiplyA2S = System.nanoTime(); 
		LongInt Multiply2 = A.multiply(B);
		long MultiplyA2E = System.nanoTime();
		System.out.println("A * B =");
		long AOutputM2S = System.nanoTime();
		Multiply2.output();
		long AOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * B = " + (MultiplyA2E - MultiplyA2S) + " ns, and " + (AOutputM2E - AOutputM2S) + " ns for output");
		
		long MultiplyA3S = System.nanoTime(); 
		LongInt Multiply3 = A.multiply(C);
		long MultiplyA3E = System.nanoTime();
		System.out.println("A * C =");
		long AOutputM3S = System.nanoTime();
		Multiply3.output();
		long AOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * C = " + (MultiplyA3E - MultiplyA3S) + " ns, and " + (AOutputM3E - AOutputM3S) + " ns for output");

		long MultiplyA4S = System.nanoTime(); 
		LongInt Multiply4 = A.multiply(D);
		long MultiplyA4E = System.nanoTime();
		System.out.println("A * D =");
		long AOutputM4S = System.nanoTime();
		Multiply4.output();
		long AOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply4.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * D = " + (MultiplyA4E - MultiplyA4S) + " ns, and " + (AOutputM4E - AOutputM4S) + " ns for output");

		long MultiplyA5S = System.nanoTime(); 
		LongInt Multiply5 = A.multiply(E);
		long MultiplyA5E = System.nanoTime();
		System.out.println("A * E =");
		long AOutputM5S = System.nanoTime();
		Multiply5.output();
		long AOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply5.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * E = " + (MultiplyA5E - MultiplyA5S) + " ns, and " + (AOutputM5E - AOutputM5S) + " ns for output");

		long MultiplyA6S = System.nanoTime(); 
		LongInt Multiply6 = A.multiply(F);
		long MultiplyA6E = System.nanoTime();
		System.out.println("A * F =");
		long AOutputM6S = System.nanoTime();
		Multiply6.output();
		long AOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply6.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * F = " + (MultiplyA6E - MultiplyA6S) + " ns, and " + (AOutputM6E - AOutputM6S) + " ns for output");

		long MultiplyA7S = System.nanoTime(); 
		LongInt Multiply7 = A.multiply(G);
		long MultiplyA7E = System.nanoTime();
		System.out.println("A * G =");
		long AOutputM7S = System.nanoTime();
		Multiply7.output();
		long AOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply7.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * G = " + (MultiplyA7E - MultiplyA7S) + " ns, and " + (AOutputM7E - AOutputM7S) + " ns for output");

		long MultiplyA8S = System.nanoTime(); 
		LongInt Multiply8 = A.multiply(H);
		long MultiplyA8E = System.nanoTime();
		System.out.println("A * H =");
		long AOutputM8S = System.nanoTime();
		Multiply8.output();
		long AOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply8.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * H = " + (MultiplyA8E - MultiplyA8S) + " ns, and " + (AOutputM8E - AOutputM8S) + " ns for output");

		long MultiplyA9S = System.nanoTime(); 
		LongInt Multiply9 = A.multiply(I);
		long MultiplyA9E = System.nanoTime();
		System.out.println("A * I =");
		long AOutputM9S = System.nanoTime();
		Multiply9.output();
		long AOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply9.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A * I = " + (MultiplyA9E - MultiplyA9S) + " ns, and " + (AOutputM9E - AOutputM9S) + " ns for output");

		writer.println();
		
		long MultiplyB1S = System.nanoTime(); 
		LongInt Multiply10 = B.multiply(A);
		long MultiplyB1E = System.nanoTime();
		System.out.println("B * A =");
		long BOutputM1S = System.nanoTime();
		Multiply10.output();
		long BOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply10.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * A = " + (MultiplyB1E - MultiplyB1S) + " ns, and " + (BOutputM1E - BOutputM1S) + " ns for output");

		long MultiplyB2S = System.nanoTime(); 
		LongInt Multiply11 = B.multiply(B);
		long MultiplyB2E = System.nanoTime();
		System.out.println("B * B =");
		long BOutputM2S = System.nanoTime();
		Multiply11.output();
		long BOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply11.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * B = " + (MultiplyB2E - MultiplyB2S) + " ns, and " + (BOutputM2E - BOutputM2S) + " ns for output");

		long MultiplyB3S = System.nanoTime(); 
		LongInt Multiply12 = B.multiply(C);
		long MultiplyB3E = System.nanoTime();
		System.out.println("B * C =");
		long BOutputM3S = System.nanoTime();
		Multiply12.output();
		long BOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply12.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * C = " + (MultiplyB3E - MultiplyB3S) + " ns, and " + (BOutputM3E - BOutputM3S) + " ns for output");

		long MultiplyB4S = System.nanoTime(); 
		LongInt Multiply13 = B.multiply(D);
		long MultiplyB4E = System.nanoTime();
		System.out.println("B * D =");
		long BOutputM4S = System.nanoTime();
		Multiply13.output();
		long BOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply13.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * D = " + (MultiplyB4E - MultiplyB4S) + " ns, and " + (BOutputM4E - BOutputM4S) + " ns for output");

		long MultiplyB5S = System.nanoTime(); 
		LongInt Multiply14 = B.multiply(E);
		long MultiplyB5E = System.nanoTime();
		System.out.println("B * E =");
		long BOutputM5S = System.nanoTime();
		Multiply14.output();
		long BOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply14.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * E = " + (MultiplyB5E - MultiplyB5S) + " ns, and " + (BOutputM5E - BOutputM5S) + " ns for output");
		
		long MultiplyB6S = System.nanoTime(); 
		LongInt Multiply15 = B.multiply(F);
		long MultiplyB6E = System.nanoTime();
		System.out.println("B * F =");
		long BOutputM6S = System.nanoTime();
		Multiply15.output();
		long BOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply15.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * F = " + (MultiplyB6E - MultiplyB6S) + " ns, and " + (BOutputM6E - BOutputM6S) + " ns for output");
		
		long MultiplyB7S = System.nanoTime(); 
		LongInt Multiply16 = B.multiply(G);
		long MultiplyB7E = System.nanoTime();
		System.out.println("B * G =");
		long BOutputM7S = System.nanoTime();
		Multiply16.output();
		long BOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply16.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * G = " + (MultiplyB7E - MultiplyB7S) + " ns, and " + (BOutputM7E - BOutputM7S) + " ns for output");
		
		long MultiplyB8S = System.nanoTime(); 
		LongInt Multiply17 = B.multiply(H);
		long MultiplyB8E = System.nanoTime();
		System.out.println("B * H =");
		long BOutputM8S = System.nanoTime();
		Multiply17.output();
		long BOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply17.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * H = " + (MultiplyB8E - MultiplyB8S) + " ns, and " + (BOutputM8E - BOutputM8S) + " ns for output");
				
		long MultiplyB9S = System.nanoTime(); 
		LongInt Multiply18 = B.multiply(I);
		long MultiplyB9E = System.nanoTime();
		System.out.println("B * I =");
		long BOutputM9S = System.nanoTime();
		Multiply18.output();
		long BOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply18.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B * I = " + (MultiplyB9E - MultiplyB9S) + " ns, and " + (BOutputM9E - BOutputM9S) + " ns for output");
	
		writer.println();
		
		long MultiplyC1S = System.nanoTime(); 
		LongInt Multiply19 = C.multiply(A);
		long MultiplyC1E = System.nanoTime();
		System.out.println("C * A =");
		long COutputM1S = System.nanoTime();
		Multiply19.output();
		long COutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply19.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * A = " + (MultiplyC1E - MultiplyC1S) + " ns, and " + (COutputM1E - COutputM1S) + " ns for output");

		long MultiplyC2S = System.nanoTime(); 
		LongInt Multiply20 = C.multiply(B);
		long MultiplyC2E = System.nanoTime();
		System.out.println("C * B =");
		long COutputM2S = System.nanoTime();
		Multiply20.output();
		long COutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply20.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * B = " + (MultiplyC2E - MultiplyC2S) + " ns, and " + (COutputM2E - COutputM2S) + " ns for output");

		long MultiplyC3S = System.nanoTime(); 
		LongInt Multiply21 = C.multiply(C);
		long MultiplyC3E = System.nanoTime();
		System.out.println("C * C =");
		long COutputM3S = System.nanoTime();
		Multiply21.output();
		long COutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply21.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * C = " + (MultiplyC3E - MultiplyC3S) + " ns, and " + (COutputM3E - COutputM3S) + " ns for output");
			
		long MultiplyC4S = System.nanoTime(); 
		LongInt Multiply22 = C.multiply(D);
		long MultiplyC4E = System.nanoTime();
		System.out.println("C * D =");
		long COutputM4S = System.nanoTime();
		Multiply22.output();
		long COutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply22.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * D = " + (MultiplyC4E - MultiplyC4S) + " ns, and " + (COutputM4E - COutputM4S) + " ns for output");

		long MultiplyC5S = System.nanoTime(); 
		LongInt Multiply23 = C.multiply(E);
		long MultiplyC5E = System.nanoTime();
		System.out.println("C * E =");
		long COutputM5S = System.nanoTime();
		Multiply23.output();
		long COutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply23.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * E = " + (MultiplyC5E - MultiplyC5S) + " ns, and " + (COutputM5E - COutputM5S) + " ns for output");
			
		long MultiplyC6S = System.nanoTime(); 
		LongInt Multiply24 = C.multiply(F);
		long MultiplyC6E = System.nanoTime();
		System.out.println("C * F =");
		long COutputM6S = System.nanoTime();
		Multiply24.output();
		long COutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply24.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * F = " + (MultiplyC6E - MultiplyC6S) + " ns, and " + (COutputM6E - COutputM6S) + " ns for output");

		long MultiplyC7S = System.nanoTime(); 
		LongInt Multiply25 = C.multiply(G);
		long MultiplyC7E = System.nanoTime();
		System.out.println("C * G =");
		long COutputM7S = System.nanoTime();
		Multiply25.output();
		long COutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply25.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * G = " + (MultiplyC7E - MultiplyC7S) + " ns, and " + (COutputM7E - COutputM7S) + " ns for output");

		long MultiplyC8S = System.nanoTime(); 
		LongInt Multiply26 = C.multiply(H);
		long MultiplyC8E = System.nanoTime();
		System.out.println("C * H =");
		long COutputM8S = System.nanoTime();
		Multiply26.output();
		long COutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply26.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * H = " + (MultiplyC8E - MultiplyC8S) + " ns, and " + (COutputM8E - COutputM8S) + " ns for output");
		
		long MultiplyC9S = System.nanoTime(); 
		LongInt Multiply27 = C.multiply(I);
		long MultiplyC9E = System.nanoTime();
		System.out.println("C * I =");
		long COutputM9S = System.nanoTime();
		Multiply27.output();
		long COutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply27.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C * I = " + (MultiplyC9E - MultiplyC9S) + " ns, and " + (COutputM9E - COutputM9S) + " ns for output");
		
		writer.println();

		long MultiplyD1S = System.nanoTime(); 
		LongInt Multiply28 = D.multiply(A);
		long MultiplyD1E = System.nanoTime();
		System.out.println("D * A =");
		long DOutputM1S = System.nanoTime();
		Multiply28.output();
		long DOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply28.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * A = " + (MultiplyD1E - MultiplyD1S) + " ns, and " + (DOutputM1E - DOutputM1S) + " ns for output");
	
		long MultiplyD2S = System.nanoTime(); 
		LongInt Multiply29 = D.multiply(B);
		long MultiplyD2E = System.nanoTime();
		System.out.println("D * B =");
		long DOutputM2S = System.nanoTime();
		Multiply29.output();
		long DOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply29.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * B = " + (MultiplyD2E - MultiplyD2S) + " ns, and " + (DOutputM2E - DOutputM2S) + " ns for output");
		
		long MultiplyD3S = System.nanoTime(); 
		LongInt Multiply30 = D.multiply(C);
		long MultiplyD3E = System.nanoTime();
		System.out.println("D * C =");
		long DOutputM3S = System.nanoTime();
		Multiply30.output();
		long DOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply30.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * C = " + (MultiplyD3E - MultiplyD3S) + " ns, and " + (DOutputM3E - DOutputM3S) + " ns for output");

		long MultiplyD4S = System.nanoTime(); 
		LongInt Multiply31 = D.multiply(D);
		long MultiplyD4E = System.nanoTime();
		System.out.println("D * D =");
		long DOutputM4S = System.nanoTime();
		Multiply31.output();
		long DOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply31.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * D = " + (MultiplyD4E - MultiplyD4S) + " ns, and " + (DOutputM4E - DOutputM4S) + " ns for output");

		long MultiplyD5S = System.nanoTime(); 
		LongInt Multiply32 = D.multiply(E);
		long MultiplyD5E = System.nanoTime();
		System.out.println("D * E =");
		long DOutputM5S = System.nanoTime();
		Multiply32.output();
		long DOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply32.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * E = " + (MultiplyD5E - MultiplyD5S) + " ns, and " + (DOutputM5E - DOutputM5S) + " ns for output");

		long MultiplyD6S = System.nanoTime(); 
		LongInt Multiply33 = D.multiply(F);
		long MultiplyD6E = System.nanoTime();
		System.out.println("D * F =");
		long DOutputM6S = System.nanoTime();
		Multiply33.output();
		long DOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply33.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * F = " + (MultiplyD6E - MultiplyD6S) + " ns, and " + (DOutputM6E - DOutputM6S) + " ns for output");
		
		long MultiplyD7S = System.nanoTime(); 
		LongInt Multiply34 = D.multiply(G);
		long MultiplyD7E = System.nanoTime();
		System.out.println("D * G =");
		long DOutputM7S = System.nanoTime();
		Multiply34.output();
		long DOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply34.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * G = " + (MultiplyD7E - MultiplyD7S) + " ns, and " + (DOutputM7E - DOutputM7S) + " ns for output");

		long MultiplyD8S = System.nanoTime(); 
		LongInt Multiply35 = D.multiply(H);
		long MultiplyD8E = System.nanoTime();
		System.out.println("D * H =");
		long DOutputM8S = System.nanoTime();
		Multiply35.output();
		long DOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply35.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * H = " + (MultiplyD8E - MultiplyD8S) + " ns, and " + (DOutputM8E - DOutputM8S) + " ns for output");
		
		long MultiplyD9S = System.nanoTime(); 
		LongInt Multiply36 = D.multiply(I);
		long MultiplyD9E = System.nanoTime();
		System.out.println("D * I =");
		long DOutputM9S = System.nanoTime();
		Multiply36.output();
		long DOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply36.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D * I = " + (MultiplyD9E - MultiplyD9S) + " ns, and " + (DOutputM9E - DOutputM9S) + " ns for output");	
		
		writer.println();
		
		long MultiplyE1S = System.nanoTime(); 
		LongInt Multiply37 = E.multiply(A);
		long MultiplyE1E = System.nanoTime();
		System.out.println("E * A =");
		long EOutputM1S = System.nanoTime();
		Multiply37.output();
		long EOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply37.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * A = " + (MultiplyE1E - MultiplyE1S) + " ns, and " + (EOutputM1E - EOutputM1S) + " ns for output");

		long MultiplyE2S = System.nanoTime(); 
		LongInt Multiply38 = E.multiply(B);
		long MultiplyE2E = System.nanoTime();
		System.out.println("E * B =");
		long EOutputM2S = System.nanoTime();
		Multiply38.output();
		long EOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply38.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * B = " + (MultiplyE2E - MultiplyE2S) + " ns, and " + (EOutputM2E - EOutputM2S) + " ns for output");

		long MultiplyE3S = System.nanoTime(); 
		LongInt Multiply39 = E.multiply(C);
		long MultiplyE3E = System.nanoTime();
		System.out.println("E * C =");
		long EOutputM3S = System.nanoTime();
		Multiply39.output();
		long EOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply39.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * C = " + (MultiplyE3E - MultiplyE3S) + " ns, and " + (EOutputM3E - EOutputM3S) + " ns for output");

		long MultiplyE4S = System.nanoTime(); 
		LongInt Multiply40 = E.multiply(D);
		long MultiplyE4E = System.nanoTime();
		System.out.println("E * D =");
		long EOutputM4S = System.nanoTime();
		Multiply40.output();
		long EOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply40.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * D = " + (MultiplyE4E - MultiplyE4S) + " ns, and " + (EOutputM4E - EOutputM4S) + " ns for output");
		
		long MultiplyE5S = System.nanoTime(); 
		LongInt Multiply41 = E.multiply(E);
		long MultiplyE5E = System.nanoTime();
		System.out.println("E * E =");
		long EOutputM5S = System.nanoTime();
		Multiply41.output();
		long EOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply41.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * E = " + (MultiplyE5E - MultiplyE5S) + " ns, and " + (EOutputM5E - EOutputM5S) + " ns for output");
		
		long MultiplyE6S = System.nanoTime(); 
		LongInt Multiply42 = E.multiply(F);
		long MultiplyE6E = System.nanoTime();
		System.out.println("E * F =");
		long EOutputM6S = System.nanoTime();
		Multiply42.output();
		long EOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply42.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * F = " + (MultiplyE6E - MultiplyE6S) + " ns, and " + (EOutputM6E - EOutputM6S) + " ns for output");

		long MultiplyE7S = System.nanoTime(); 
		LongInt Multiply43 = E.multiply(G);
		long MultiplyE7E = System.nanoTime();
		System.out.println("E * G =");
		long EOutputM7S = System.nanoTime();
		Multiply43.output();
		long EOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply43.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * G = " + (MultiplyE7E - MultiplyE7S) + " ns, and " + (EOutputM7E - EOutputM7S) + " ns for output");
		
		long MultiplyE8S = System.nanoTime(); 
		LongInt Multiply44 = E.multiply(H);
		long MultiplyE8E = System.nanoTime();
		System.out.println("E * H =");
		long EOutputM8S = System.nanoTime();
		Multiply44.output();
		long EOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply44.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * H = " + (MultiplyE8E - MultiplyE8S) + " ns, and " + (EOutputM8E - EOutputM8S) + " ns for output");
		
		long MultiplyE9S = System.nanoTime(); 
		LongInt Multiply45 = E.multiply(I);
		long MultiplyE9E = System.nanoTime();
		System.out.println("E * I =");
		long EOutputM9S = System.nanoTime();
		Multiply45.output();
		long EOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply45.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E * I = " + (MultiplyE9E - MultiplyE9S) + " ns, and " + (EOutputM9E - EOutputM9S) + " ns for output");
		
		writer.println();
		
		long MultiplyF1S = System.nanoTime(); 
		LongInt Multiply46 = F.multiply(A);
		long MultiplyF1E = System.nanoTime();
		System.out.println("F * A =");
		long FOutputM1S = System.nanoTime();
		Multiply46.output();
		long FOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply46.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * A = " + (MultiplyF1E - MultiplyF1S) + " ns, and " + (FOutputM1E - FOutputM1S) + " ns for output");
		
		long MultiplyF2S = System.nanoTime(); 
		LongInt Multiply47 = F.multiply(B);
		long MultiplyF2E = System.nanoTime();
		System.out.println("F * B =");
		long FOutputM2S = System.nanoTime();
		Multiply47.output();
		long FOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply47.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * B = " + (MultiplyF2E - MultiplyF2S) + " ns, and " + (FOutputM2E - FOutputM2S) + " ns for output");

		long MultiplyF3S = System.nanoTime(); 
		LongInt Multiply48 = F.multiply(C);
		long MultiplyF3E = System.nanoTime();
		System.out.println("F * C =");
		long FOutputM3S = System.nanoTime();
		Multiply48.output();
		long FOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply48.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * C = " + (MultiplyF3E - MultiplyF3S) + " ns, and " + (FOutputM3E - FOutputM3S) + " ns for output");

		long MultiplyF4S = System.nanoTime(); 
		LongInt Multiply49 = F.multiply(D);
		long MultiplyF4E = System.nanoTime();
		System.out.println("F * D =");
		long FOutputM4S = System.nanoTime();
		Multiply49.output();
		long FOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply49.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * D = " + (MultiplyF4E - MultiplyF4S) + " ns, and " + (FOutputM4E - FOutputM4S) + " ns for output");

		long MultiplyF5S = System.nanoTime(); 
		LongInt Multiply50 = F.multiply(E);
		long MultiplyF5E = System.nanoTime();
		System.out.println("F * E =");
		long FOutputM5S = System.nanoTime();
		Multiply50.output();
		long FOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply50.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * E = " + (MultiplyF5E - MultiplyF5S) + " ns, and " + (FOutputM5E - FOutputM5S) + " ns for output");

		long MultiplyF6S = System.nanoTime(); 
		LongInt Multiply51 = F.multiply(F);
		long MultiplyF6E = System.nanoTime();
		System.out.println("F * F =");
		long FOutputM6S = System.nanoTime();
		Multiply51.output();
		long FOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply51.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * F = " + (MultiplyF6E - MultiplyF6S) + " ns, and " + (FOutputM6E - FOutputM6S) + " ns for output");
		
		long MultiplyF7S = System.nanoTime(); 
		LongInt Multiply52 = F.multiply(G);
		long MultiplyF7E = System.nanoTime();
		System.out.println("F * G =");
		long FOutputM7S = System.nanoTime();
		Multiply52.output();
		long FOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply52.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * G = " + (MultiplyF7E - MultiplyF7S) + " ns, and " + (FOutputM7E - FOutputM7S) + " ns for output");

		long MultiplyF8S = System.nanoTime(); 
		LongInt Multiply53 = F.multiply(H);
		long MultiplyF8E = System.nanoTime();
		System.out.println("F * H =");
		long FOutputM8S = System.nanoTime();
		Multiply53.output();
		long FOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply53.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * H = " + (MultiplyF8E - MultiplyF8S) + " ns, and " + (FOutputM8E - FOutputM8S) + " ns for output");

		long MultiplyF9S = System.nanoTime(); 
		LongInt Multiply54 = F.multiply(I);
		long MultiplyF9E = System.nanoTime();
		System.out.println("F * I =");
		long FOutputM9S = System.nanoTime();
		Multiply54.output();
		long FOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply54.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F * I = " + (MultiplyF9E - MultiplyF9S) + " ns, and " + (FOutputM9E - FOutputM9S) + " ns for output");

		writer.println();
		
		long MultiplyG1S = System.nanoTime(); 
		LongInt Multiply55 = G.multiply(A);
		long MultiplyG1E = System.nanoTime();
		System.out.println("G * A =");
		long GOutputM1S = System.nanoTime();
		Multiply55.output();
		long GOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply55.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * A = " + (MultiplyG1E - MultiplyG1S) + " ns, and " + (GOutputM1E - GOutputM1S) + " ns for output");

		long MultiplyG2S = System.nanoTime(); 
		LongInt Multiply56 = G.multiply(B);
		long MultiplyG2E = System.nanoTime();
		System.out.println("G * B =");
		long GOutputM2S = System.nanoTime();
		Multiply56.output();
		long GOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply56.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * B = " + (MultiplyG2E - MultiplyG2S) + " ns, and " + (GOutputM2E - GOutputM2S) + " ns for output");

		long MultiplyG3S = System.nanoTime(); 
		LongInt Multiply57 = G.multiply(C);
		long MultiplyG3E = System.nanoTime();
		System.out.println("G * C =");
		long GOutputM3S = System.nanoTime();
		Multiply57.output();
		long GOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply57.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * C = " + (MultiplyG3E - MultiplyG3S) + " ns, and " + (GOutputM3E - GOutputM3S) + " ns for output");

		long MultiplyG4S = System.nanoTime(); 
		LongInt Multiply58 = G.multiply(D);
		long MultiplyG4E = System.nanoTime();
		System.out.println("G * D =");
		long GOutputM4S = System.nanoTime();
		Multiply58.output();
		long GOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply58.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * D = " + (MultiplyG4E - MultiplyG4S) + " ns, and " + (GOutputM4E - GOutputM4S) + " ns for output");
		
		long MultiplyG5S = System.nanoTime(); 
		LongInt Multiply59 = G.multiply(E);
		long MultiplyG5E = System.nanoTime();
		System.out.println("G * E =");
		long GOutputM5S = System.nanoTime();
		Multiply59.output();
		long GOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply59.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * E = " + (MultiplyG5E - MultiplyG5S) + " ns, and " + (GOutputM5E - GOutputM5S) + " ns for output");
		
		long MultiplyG6S = System.nanoTime(); 
		LongInt Multiply60 = G.multiply(F);
		long MultiplyG6E = System.nanoTime();
		System.out.println("G * F =");
		long GOutputM6S = System.nanoTime();
		Multiply60.output();
		long GOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply60.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * F = " + (MultiplyG6E - MultiplyG6S) + " ns, and " + (GOutputM6E - GOutputM6S) + " ns for output");

		long MultiplyG7S = System.nanoTime(); 
		LongInt Multiply61 = G.multiply(G);
		long MultiplyG7E = System.nanoTime();
		System.out.println("G * G =");
		long GOutputM7S = System.nanoTime();
		Multiply61.output();
		long GOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply61.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * G = " + (MultiplyG7E - MultiplyG7S) + " ns, and " + (GOutputM7E - GOutputM7S) + " ns for output");

		long MultiplyG8S = System.nanoTime(); 
		LongInt Multiply62 = G.multiply(H);
		long MultiplyG8E = System.nanoTime();
		System.out.println("G * H =");
		long GOutputM8S = System.nanoTime();
		Multiply62.output();
		long GOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply62.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * H = " + (MultiplyG8E - MultiplyG8S) + " ns, and " + (GOutputM8E - GOutputM8S) + " ns for output");

		long MultiplyG9S = System.nanoTime(); 
		LongInt Multiply63 = G.multiply(I);
		long MultiplyG9E = System.nanoTime();
		System.out.println("G * I =");
		long GOutputM9S = System.nanoTime();
		Multiply63.output();
		long GOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply63.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G * I = " + (MultiplyG9E - MultiplyG9S) + " ns, and " + (GOutputM9E - GOutputM9S) + " ns for output");

		writer.println();
		
		long MultiplyH1S = System.nanoTime(); 
		LongInt Multiply64 = H.multiply(A);
		long MultiplyH1E = System.nanoTime();
		System.out.println("H * A =");
		long HOutputM1S = System.nanoTime();
		Multiply64.output();
		long HOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply64.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * A = " + (MultiplyH1E - MultiplyH1S) + " ns, and " + (HOutputM1E - HOutputM1S) + " ns for output");

		long MultiplyH2S = System.nanoTime(); 
		LongInt Multiply65 = H.multiply(B);
		long MultiplyH2E = System.nanoTime();
		System.out.println("H * B =");
		long HOutputM2S = System.nanoTime();
		Multiply65.output();
		long HOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply65.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * B = " + (MultiplyH2E - MultiplyH2S) + " ns, and " + (HOutputM2E - HOutputM2S) + " ns for output");

		long MultiplyH3S = System.nanoTime(); 
		LongInt Multiply66 = H.multiply(C);
		long MultiplyH3E = System.nanoTime();
		System.out.println("H * C =");
		long HOutputM3S = System.nanoTime();
		Multiply66.output();
		long HOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply66.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * C = " + (MultiplyH3E - MultiplyH3S) + " ns, and " + (HOutputM3E - HOutputM3S) + " ns for output");

		long MultiplyH4S = System.nanoTime(); 
		LongInt Multiply67 = H.multiply(D);
		long MultiplyH4E = System.nanoTime();
		System.out.println("H * D =");
		long HOutputM4S = System.nanoTime();
		Multiply67.output();
		long HOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply67.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * D = " + (MultiplyH4E - MultiplyH4S) + " ns, and " + (HOutputM4E - HOutputM4S) + " ns for output");

		long MultiplyH5S = System.nanoTime(); 
		LongInt Multiply68 = H.multiply(E);
		long MultiplyH5E = System.nanoTime();
		System.out.println("H * E =");
		long HOutputM5S = System.nanoTime();
		Multiply68.output();
		long HOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply68.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * E = " + (MultiplyH5E - MultiplyH5S) + " ns, and " + (HOutputM5E - HOutputM5S) + " ns for output");

		long MultiplyH6S = System.nanoTime(); 
		LongInt Multiply69 = H.multiply(F);
		long MultiplyH6E = System.nanoTime();
		System.out.println("H * F =");
		long HOutputM6S = System.nanoTime();
		Multiply69.output();
		long HOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply69.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * F = " + (MultiplyH6E - MultiplyH6S) + " ns, and " + (HOutputM6E - HOutputM6S) + " ns for output");

		long MultiplyH7S = System.nanoTime(); 
		LongInt Multiply70 = H.multiply(G);
		long MultiplyH7E = System.nanoTime();
		System.out.println("H * G =");
		long HOutputM7S = System.nanoTime();
		Multiply70.output();
		long HOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply70.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * G = " + (MultiplyH7E - MultiplyH7S) + " ns, and " + (HOutputM7E - HOutputM7S) + " ns for output");

		long MultiplyH8S = System.nanoTime(); 
		LongInt Multiply71 = H.multiply(H);
		long MultiplyH8E = System.nanoTime();
		System.out.println("H * H =");
		long HOutputM8S = System.nanoTime();
		Multiply71.output();
		long HOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply71.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * H = " + (MultiplyH8E - MultiplyH8S) + " ns, and " + (HOutputM8E - HOutputM8S) + " ns for output");

		long MultiplyH9S = System.nanoTime(); 
		LongInt Multiply72 = H.multiply(I);
		long MultiplyH9E = System.nanoTime();
		System.out.println("H * I =");
		long HOutputM9S = System.nanoTime();
		Multiply72.output();
		long HOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply72.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H * I = " + (MultiplyH9E - MultiplyH9S) + " ns, and " + (HOutputM9E - HOutputM9S) + " ns for output");
		
		writer.println();

		long MultiplyI1S = System.nanoTime(); 
		LongInt Multiply73 = I.multiply(A);
		long MultiplyI1E = System.nanoTime();
		System.out.println("I * A =");
		long IOutputM1S = System.nanoTime();
		Multiply73.output();
		long IOutputM1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply73.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * A = " + (MultiplyI1E - MultiplyI1S) + " ns, and " + (IOutputM1E - IOutputM1S) + " ns for output");

		long MultiplyI2S = System.nanoTime(); 
		LongInt Multiply74 = I.multiply(B);
		long MultiplyI2E = System.nanoTime();
		System.out.println("I * B =");
		long IOutputM2S = System.nanoTime();
		Multiply74.output();
		long IOutputM2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply74.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * B = " + (MultiplyI2E - MultiplyI2S) + " ns, and " + (IOutputM2E - IOutputM2S) + " ns for output");

		long MultiplyI3S = System.nanoTime(); 
		LongInt Multiply75 = I.multiply(C);
		long MultiplyI3E = System.nanoTime();
		System.out.println("I * C =");
		long IOutputM3S = System.nanoTime();
		Multiply75.output();
		long IOutputM3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply75.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * C = " + (MultiplyI3E - MultiplyI3S) + " ns, and " + (IOutputM3E - IOutputM3S) + " ns for output");

		long MultiplyI4S = System.nanoTime(); 
		LongInt Multiply76 = I.multiply(D);
		long MultiplyI4E = System.nanoTime();
		System.out.println("I * D =");
		long IOutputM4S = System.nanoTime();
		Multiply76.output();
		long IOutputM4E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply76.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * D = " + (MultiplyI4E - MultiplyI4S) + " ns, and " + (IOutputM4E - IOutputM4S) + " ns for output");

		long MultiplyI5S = System.nanoTime(); 
		LongInt Multiply77 = I.multiply(E);
		long MultiplyI5E = System.nanoTime();
		System.out.println("I * E =");
		long IOutputM5S = System.nanoTime();
		Multiply77.output();
		long IOutputM5E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply77.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * E = " + (MultiplyI5E - MultiplyI5S) + " ns, and " + (IOutputM5E - IOutputM5S) + " ns for output");

		long MultiplyI6S = System.nanoTime(); 
		LongInt Multiply78 = I.multiply(F);
		long MultiplyI6E = System.nanoTime();
		System.out.println("I * F =");
		long IOutputM6S = System.nanoTime();
		Multiply78.output();
		long IOutputM6E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply78.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * F = " + (MultiplyI6E - MultiplyI6S) + " ns, and " + (IOutputM6E - IOutputM6S) + " ns for output");

		long MultiplyI7S = System.nanoTime(); 
		LongInt Multiply79 = I.multiply(G);
		long MultiplyI7E = System.nanoTime();
		System.out.println("I * G =");
		long IOutputM7S = System.nanoTime();
		Multiply79.output();
		long IOutputM7E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply79.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * G = " + (MultiplyI7E - MultiplyI7S) + " ns, and " + (IOutputM7E - IOutputM7S) + " ns for output");

		long MultiplyI8S = System.nanoTime(); 
		LongInt Multiply80 = I.multiply(H);
		long MultiplyI8E = System.nanoTime();
		System.out.println("I * H =");
		long IOutputM8S = System.nanoTime();
		Multiply80.output();
		long IOutputM8E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply80.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * H = " + (MultiplyI8E - MultiplyI8S) + " ns, and " + (IOutputM8E - IOutputM8S) + " ns for output");
				
		long MultiplyI9S = System.nanoTime(); 
		LongInt Multiply81 = I.multiply(I);
		long MultiplyI9E = System.nanoTime();
		System.out.println("I * I =");
		long IOutputM9S = System.nanoTime();
		Multiply81.output();
		long IOutputM9E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(Multiply81.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I * I = " + (MultiplyI9E - MultiplyI9S) + " ns, and " + (IOutputM9E - IOutputM9S) + " ns for output");
		
		writer.println();

		long PowerA1S = System.nanoTime(); 
		LongInt PowerA1 = A.power(5);
		long PowerA1E = System.nanoTime();
		System.out.println("A ^ 5 =");
		long AOutputP1S = System.nanoTime();
		PowerA1.output();
		long AOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerA1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A ^ 5 = " + (PowerA1E - PowerA1S) + " ns, and " + (AOutputP1E - AOutputP1S) + " ns for output");
		
		long PowerA2S = System.nanoTime(); 
		LongInt PowerA2 = A.power(10);
		long PowerA2E = System.nanoTime();
		System.out.println("A ^ 10 =");
		long AOutputP2S = System.nanoTime();
		PowerA2.output();
		long AOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerA2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A ^ 10 = " + (PowerA2E - PowerA2S) + " ns, and " + (AOutputP2E - AOutputP2S) + " ns for output");

		long PowerA3S = System.nanoTime(); 
		LongInt PowerA3 = A.power(20);
		long PowerA3E = System.nanoTime();
		System.out.println("A ^ 20 =");
		long AOutputP3S = System.nanoTime();
		PowerA3.output();
		long AOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerA3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("A ^ 20 = " + (PowerA3E - PowerA3S) + " ns, and " + (AOutputP3E - AOutputP3S) + " ns for output");
		
		writer.println();

		long PowerB1S = System.nanoTime(); 
		LongInt PowerB1 = B.power(5);
		long PowerB1E = System.nanoTime();
		System.out.println("B ^ 5 =");
		long BOutputP1S = System.nanoTime();
		PowerB1.output();
		long BOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerB1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B ^ 5 = " + (PowerB1E - PowerB1S) + " ns, and " + (BOutputP1E - BOutputP1S) + " ns for output");

		long PowerB2S = System.nanoTime(); 
		LongInt PowerB2 = B.power(10);
		long PowerB2E = System.nanoTime();
		System.out.println("B ^ 10 =");
		long BOutputP2S = System.nanoTime();
		PowerB2.output();
		long BOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerB2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B ^ 10 = " + (PowerB2E - PowerB2S) + " ns, and " + (BOutputP2E - BOutputP2S) + " ns for output");
		
		long PowerB3S = System.nanoTime(); 
		LongInt PowerB3 = B.power(20);
		long PowerB3E = System.nanoTime();
		System.out.println("B ^ 20 =");
		long BOutputP3S = System.nanoTime();
		PowerB3.output();
		long BOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerB3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("B ^ 20 = " + (PowerB3E - PowerB3S) + " ns, and " + (BOutputP3E - BOutputP3S) + " ns for output");
		
		writer.println();
		
		long PowerC1S = System.nanoTime(); 
		LongInt PowerC1 = C.power(5);
		long PowerC1E = System.nanoTime();
		System.out.println("C ^ 5 =");
		long COutputP1S = System.nanoTime();
		PowerC1.output();
		long COutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerC1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C ^ 5 = " + (PowerC1E - PowerC1S) + " ns, and " + (COutputP1E - COutputP1S) + " ns for output");
		
		long PowerC2S = System.nanoTime(); 
		LongInt PowerC2 = C.power(10);
		long PowerC2E = System.nanoTime();
		System.out.println("C ^ 10 =");
		long COutputP2S = System.nanoTime();
		PowerC2.output();
		long COutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerC2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C ^ 10 = " + (PowerC2E - PowerC2S) + " ns, and " + (COutputP2E - COutputP2S) + " ns for output");
		
		long PowerC3S = System.nanoTime(); 
		LongInt PowerC3 = C.power(20);
		long PowerC3E = System.nanoTime();
		System.out.println("C ^ 20 =");
		long COutputP3S = System.nanoTime();
		PowerC3.output();
		long COutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerC3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("C ^ 20 = " + (PowerC3E - PowerC3S) + " ns, and " + (COutputP3E - COutputP3S) + " ns for output");
		
		writer.println();
	
		long PowerD1S = System.nanoTime(); 
		LongInt PowerD1 = D.power(5);
		long PowerD1E = System.nanoTime();
		System.out.println("D ^ 5 =");
		long DOutputP1S = System.nanoTime();
		PowerD1.output();
		long DOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerD1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D ^ 5 = " + (PowerD1E - PowerD1S) + " ns, and " + (DOutputP1E - DOutputP1S) + " ns for output");
		
		long PowerD2S = System.nanoTime(); 
		LongInt PowerD2 = D.power(10);
		long PowerD2E = System.nanoTime();
		System.out.println("D ^ 10 =");
		long DOutputP2S = System.nanoTime();
		PowerD2.output();
		long DOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerD2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D ^ 10 = " + (PowerD2E - PowerD2S) + " ns, and " + (DOutputP2E - DOutputP2S) + " ns for output");
		
		long PowerD3S = System.nanoTime(); 
		LongInt PowerD3 = D.power(20);
		long PowerD3E = System.nanoTime();
		System.out.println("D ^ 20 =");
		long DOutputP3S = System.nanoTime();
		PowerD3.output();
		long DOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerD3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("D ^ 20 = " + (PowerD3E - PowerD3S) + " ns, and " + (DOutputP3E - DOutputP3S) + " ns for output");
		
		writer.println();
		
		long PowerE1S = System.nanoTime(); 
		LongInt PowerE1 = E.power(5);
		long PowerE1E = System.nanoTime();
		System.out.println("E ^ 5 =");
		long EOutputP1S = System.nanoTime();
		PowerE1.output();
		long EOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerE1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E ^ 5 = " + (PowerE1E - PowerE1S) + " ns, and " + (EOutputP1E - EOutputP1S) + " ns for output");
		
		long PowerE2S = System.nanoTime(); 
		LongInt PowerE2 = E.power(10);
		long PowerE2E = System.nanoTime();
		System.out.println("E ^ 10 =");
		long EOutputP2S = System.nanoTime();
		PowerE2.output();
		long EOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerE2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E ^ 10 = " + (PowerE2E - PowerE2S) + " ns, and " + (EOutputP2E - EOutputP2S) + " ns for output");
		
		long PowerE3S = System.nanoTime(); 
		LongInt PowerE3 = E.power(20);
		long PowerE3E = System.nanoTime();
		System.out.println("F ^ 20 =");
		long EOutputP3S = System.nanoTime();
		PowerE3.output();
		long EOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerE3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("E ^ 20 = " + (PowerE3E - PowerE3S) + " ns, and " + (EOutputP3E - EOutputP3S) + " ns for output");
		
		writer.println();
		
		long PowerF1S = System.nanoTime(); 
		LongInt PowerF1 = F.power(5);
		long PowerF1E = System.nanoTime();
		System.out.println("F ^ 5 =");
		long FOutputP1S = System.nanoTime();
		PowerA1.output();
		long FOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerF1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F ^ 5 = " + (PowerF1E - PowerF1S) + " ns, and " + (FOutputP1E - FOutputP1S) + " ns for output");
		
		long PowerF2S = System.nanoTime(); 
		LongInt PowerF2 = F.power(10);
		long PowerF2E = System.nanoTime();
		System.out.println("F ^ 10 =");
		long FOutputP2S = System.nanoTime();
		PowerF2.output();
		long FOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerF2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F ^ 10 = " + (PowerF2E - PowerF2S) + " ns, and " + (FOutputP2E - FOutputP2S) + " ns for output");
		
		long PowerF3S = System.nanoTime(); 
		LongInt PowerF3 = F.power(20);
		long PowerF3E = System.nanoTime();
		System.out.println("F ^ 20 =");
		long FOutputP3S = System.nanoTime();
		PowerF3.output();
		long FOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerF3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("F ^ 20 = " + (PowerF3E - PowerF3S) + " ns, and " + (FOutputP3E - FOutputP3S) + " ns for output");
		
		writer.println();
		
		long PowerG1S = System.nanoTime(); 
		LongInt PowerG1 = G.power(5);
		long PowerG1E = System.nanoTime();
		System.out.println("G ^ 5 =");
		long GOutputP1S = System.nanoTime();
		PowerG1.output();
		long GOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerG1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G ^ 5 = " + (PowerG1E - PowerG1S) + " ns, and " + (GOutputP1E - GOutputP1S) + " ns for output");
		
		long PowerG2S = System.nanoTime(); 
		LongInt PowerG2 = G.power(10);
		long PowerG2E = System.nanoTime();
		System.out.println("G ^ 10 =");
		long GOutputP2S = System.nanoTime();
		PowerG2.output();
		long GOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerG2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G ^ 10 = " + (PowerG2E - PowerG2S) + " ns, and " + (GOutputP2E - GOutputP2S) + " ns for output");
		
		long PowerG3S = System.nanoTime(); 
		LongInt PowerG3 = G.power(20);
		long PowerG3E = System.nanoTime();
		System.out.println("G ^ 20 =");
		long GOutputP3S = System.nanoTime();
		PowerG3.output();
		long GOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerG3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("G ^ 20 = " + (PowerG3E - PowerG3S) + " ns, and " + (GOutputP3E - GOutputP3S) + " ns for output");
		
		writer.println();
		
		long PowerH1S = System.nanoTime(); 
		LongInt PowerH1 = H.power(5);
		long PowerH1E = System.nanoTime();
		System.out.println("H ^ 5 =");
		long HOutputP1S = System.nanoTime();
		PowerH1.output();
		long HOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerH1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H ^ 5 = " + (PowerH1E - PowerH1S) + " ns, and " + (HOutputP1E - HOutputP1S) + " ns for output");
		
		long PowerH2S = System.nanoTime(); 
		LongInt PowerH2 = H.power(10);
		long PowerH2E = System.nanoTime();
		System.out.println("H ^ 10 =");
		long HOutputP2S = System.nanoTime();
		PowerH2.output();
		long HOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerH2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H ^ 10 = " + (PowerH2E - PowerH2S) + " ns, and " + (HOutputP2E - HOutputP2S) + " ns for output");
		
		long PowerH3S = System.nanoTime(); 
		LongInt PowerH3 = H.power(20);
		long PowerH3E = System.nanoTime();
		System.out.println("H ^ 20 =");
		long HOutputP3S = System.nanoTime();
		PowerH3.output();
		long HOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerH3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("H ^ 20 = " + (PowerH3E - PowerH3S) + " ns, and " + (HOutputP3E - HOutputP3S) + " ns for output");
		
		writer.println();

		long PowerI1S = System.nanoTime(); 
		LongInt PowerI1 = I.power(5);
		long PowerI1E = System.nanoTime();
		System.out.println("I ^ 5 =");
		long IOutputP1S = System.nanoTime();
		PowerI1.output();
		long IOutputP1E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerI1.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I ^ 5 = " + (PowerI1E - PowerI1S) + " ns, and " + (IOutputP1E - IOutputP1S) + " ns for output");
		
		long PowerI2S = System.nanoTime(); 
		LongInt PowerI2 = I.power(10);
		long PowerI2E = System.nanoTime();
		System.out.println("I ^ 10 =");
		long IOutputP2S = System.nanoTime();
		PowerI2.output();
		long IOutputP2E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerI2.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I ^ 10 = " + (PowerI2E - PowerI2S) + " ns, and " + (IOutputP2E - IOutputP2S) + " ns for output");
		
		long PowerI3S = System.nanoTime(); 
		LongInt PowerI3 = I.power(20);
		long PowerI3E = System.nanoTime();
		System.out.println("I ^ 20 =");
		long IOutputP3S = System.nanoTime();
		PowerI3.output();
		long IOutputP3E = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(PowerI3.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("I ^ 20 = " + (PowerI3E - PowerI3S) + " ns, and " + (IOutputP3E - IOutputP3S) + " ns for output");

		writer.println();
		
		long funcJS = System.nanoTime();
		LongInt J = B.add (C);
		long funcJE = System.nanoTime();
		System.out.println("J = B + C =");
		long JOutputS = System.nanoTime();
		J.output();
		long JOutputE = System.nanoTime();
		System.out.print("\nSign: ( ");System.out.print(J.getSign() == false ? "+" : "-");System.out.println(" )\n");
		writer.println("J = " + (funcJE - funcJS) + " ns, and " + (JOutputE - JOutputS) + " ns for output");
	
		long funcKS = System.nanoTime();
        LongInt K = C.add (D);
        long funcKE = System.nanoTime();
        System.out.println("K = C + D =");
        long KOutputS = System.nanoTime();
        K.output();
        long KOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(K.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("K = " + (funcKE - funcKS) + " ns, and " + (KOutputE - KOutputS) + " ns for output");
           
        long funcLS = System.nanoTime();
        LongInt L = I.add (I);
        long funcLE = System.nanoTime();
        System.out.println("L = I + I =");
        long LOutputS = System.nanoTime();
        L.output();
        long LOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(L.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("L = " + (funcLE - funcLS) + " ns, and " + (LOutputE - LOutputS) + " ns for output");
        
        long funcMS = System.nanoTime();
        LongInt M = A.add (I);
        long funcME = System.nanoTime();
        System.out.println("M = A + I =");
        long MOutputS = System.nanoTime();
        M.output();
        long MOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(M.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("M = " + (funcME - funcMS) + " ns, and " + (MOutputE - MOutputS) + " ns for output");
        
        long funcNS = System.nanoTime();
        LongInt N = B.add (K);
        long funcNE = System.nanoTime();
        System.out.println("N = B + K =");
        long NOutputS = System.nanoTime();
        N.output();
        long NOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(N.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("N = " + (funcNE - funcNS) + " ns, and " + (NOutputE - NOutputS) + " ns, for output");
        
        long funcOS = System.nanoTime();
        LongInt O = A.subtract (D);
        long funcOE = System.nanoTime();
        System.out.println("O = A - D =");
        long OOutputS = System.nanoTime();
        O.output();
        long OOutputE = System.nanoTime(); 
        System.out.print("\nSign: ( ");System.out.print(O.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("O = " + (funcOE - funcOS) + " ns, and " + (OOutputE - OOutputS) + " ns, for output");
        
        long funcPS = System.nanoTime();
        LongInt P = C.subtract(D);
        long funcPE = System.nanoTime();
        System.out.println("P = C - D =");
        long POutputS = System.nanoTime();
        P.output();
        long POutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(P.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("P = " + (funcPE - funcPS) + " ns, and " + (POutputE - POutputS) + " ns, for output");
        
        long funcQS = System.nanoTime();
        LongInt Q = D.subtract(C);
        long funcQE = System.nanoTime();
        System.out.println("Q = D - C =");
        long QOutputS = System.nanoTime();
        Q.output();
        long QOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(Q.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("Q = " + (funcQE - funcQS) + " ns, and " + (QOutputE - QOutputS) + " ns, for output");
        
        long funcRS = System.nanoTime();
        LongInt R = L.subtract(L);
        long funcRE = System.nanoTime();
        System.out.println("R = L - L =");
        long ROutputS = System.nanoTime();
        R.output();
        long ROutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(R.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("R = " + (funcRE - funcRS) + " ns, and " + (ROutputE - ROutputS) + " ns, for output");
        
        long funcSS = System.nanoTime();
        LongInt S = P.subtract(D);
        long funcSE = System.nanoTime();
        System.out.println("S = P - D =");
        long SOutputS = System.nanoTime();
        S.output();
        long SOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(S.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("P = " + (funcSE - funcSS) + " ns, and " + (SOutputE - SOutputS) + " ns, for output");
        
        long funcTS = System.nanoTime();
        LongInt T = N.subtract(Q);
        long funcTE = System.nanoTime();
        System.out.println("T = N - Q =");
        long TOutputS = System.nanoTime();
        T.output();
        long TOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(T.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("T = " + (funcTE - funcTS) + " ns, and " + (TOutputE - TOutputS) + " ns, for output");
        
        long funcUS = System.nanoTime();
        LongInt U = A.multiply(D);
        long funcUE = System.nanoTime();
        System.out.println("U = A * D =");
        long UOutputS = System.nanoTime();
        U.output();
        long UOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(U.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("U = " + (funcUE - funcUS) + " ns, and " + (UOutputE - UOutputS) + " ns, for output");
        
        long funcVS = System.nanoTime();
        LongInt V = B.multiply(C);
        long funcVE = System.nanoTime();
        System.out.println("V = B * C =");
        long VOutputS = System.nanoTime();
        V.output();
        long VOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(V.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("V = " + (funcVE - funcVS) + " ns, and " + (VOutputE - VOutputS) + " ns, for output");
        
        long funcWS = System.nanoTime();
        LongInt W = D.multiply(D);
        long funcWE = System.nanoTime();
        System.out.println("W = D * D =");
        long WOutputS = System.nanoTime();
        W.output();
        long WOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(W.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("W = " + (funcWE - funcWS) + " ns, and " + (WOutputE - WOutputS) + " ns, for output");
        
        long funcXS = System.nanoTime();
        LongInt X = O.multiply(I);
        long funcXE = System.nanoTime();
        System.out.println("X = O * I =");
        long XOutputS = System.nanoTime();
        X.output();
        long XOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(X.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("X = " + (funcXE - funcXS) + " ns, and " + (XOutputE - XOutputS) + " ns, for output");
        
        long funcYS = System.nanoTime();
        LongInt Y = J.multiply(P);
        long funcYE = System.nanoTime();
        System.out.println("Y = J * P =");
        long YOutputS = System.nanoTime();
        Y.output();
        long YOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(Y.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("Y = " + (funcYE - funcYS) + " ns, and " + (YOutputE - YOutputS) + " ns, for output");
        
        long funcZS = System.nanoTime();
        LongInt Z = M.multiply(N);
        long funcZE = System.nanoTime();
        System.out.println("Z = M * N =");
        long ZOutputS = System.nanoTime();
        Z.output();
        long ZOutputE = System.nanoTime();
        System.out.print("\nSign: ( ");System.out.print(Z.getSign() == false ? "+" : "-");System.out.println(" )\n");
        writer.println("Z = " + (funcZE - funcZS) + " ns, and " + (ZOutputE - ZOutputS) + " ns, for output");
        writer.close();
	}
}

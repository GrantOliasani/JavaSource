public class TermTester{
	public static void main (String [] args){
		Term term1= new Term(3,2);
		Term term2= new Term(4,3);
		Term term3;
		Term term4= new Term(3,4);
		Term term5= new Term(4,4);
		term3=term1.multiply(term2);
		System.out.println(term3.getCoeffecient());
		System.out.println(term3.getPower());

		System.out.println(term3.toString()+ term1.toString());

		term4.addIfSamePower(term5);
		System.out.println(term4.toString());

	}
}
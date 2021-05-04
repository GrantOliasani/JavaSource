
import java.util.LinkedList;
import java.util.ListIterator;
public class Polynomial{

	private LinkedList<Term> polynomialList = new LinkedList<Term>();  //Creates new empty Linked List of Terms type

	public Polynomial(Term t){ 		//Constructor that accepts a term and adds it to polynomial list
		
			polynomialList.add(t);
	}
	public Polynomial(){			//Empty constructor that allows us to create new polynomial objects

	}

	public void add(Polynomial p){
	 ListIterator <Term> iterator= p.polynomialList.listIterator();		//creates new iterator to iterate over the list
	  	while (iterator.hasNext()){										//iterator that accesses terms of p Polynomial list
	  		Term term1=iterator.next();									//assigns term 1 to the next term of p

	  	    ListIterator <Term> thisIterator= this.polynomialList.listIterator();	//creates new iterator to iterate over this Polynomial list

	  	while(thisIterator.hasNext()){							//iterates over this Polynomial List
	  		Term term2=thisIterator.next();						//assigns term 2 to the next term
	  		term1.addIfSamePower(term2);						//accesses the addIfSamePower method of Term class and executes
	  	}
	  		polynomialList.addLast(term1);						//if the terms do not match powers, the term is added to the end
		}
	}

	public Polynomial multiply(Polynomial p){
	  ListIterator <Term> iterator= p.polynomialList.listIterator();    //creates new iterator to iterate over the list
	  Polynomial result= new Polynomial();						//creates new polynomial object
	  	while (iterator.hasNext()){								//iterator that accesses terms of p Polynomial lis
	  		Term term1=iterator.next();					//assigns term 1 to next term

	  	    ListIterator <Term> thisIterator= this.polynomialList.listIterator(); //creates new iterator to iterate over this Polynomial list

	  	while(thisIterator.hasNext()){
	  		Term term2=thisIterator.next();										//assigns term 2 to the next term
	  		Polynomial resultPolynomial= new Polynomial(term1.multiply(term2));   //creates new Polynomial multiplying the terms
	  		result.add(resultPolynomial);										//adds the result to result Polynomial
	  	}

	  	}
	  	return result;							//returns the resulting poly
	}
	public void print(){				//Print method to print the terms nicely
		ListIterator <Term> iterator= polynomialList.listIterator();
		while (iterator.hasNext()){
		System.out.print(iterator.next()+"+");			
		}
	}
}

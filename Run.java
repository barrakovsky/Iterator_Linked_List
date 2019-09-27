import java.util.Iterator;
import java.util.Random;

public class Run {

	
	public static void main(String[] args) {
		
		TrackingSystem trackingSystem = new TrackingSystem();
		
		
		String[] authors1 = {"author2","author1","author1","author1","author1","author1","author1","author1","author1","author1"};
		String[] title = {"title0","title1","title2","title3","title4","title5","title6","title7","title8","title9"};
		Book[] books = new Book[10];
		
		
		//loop to create book objects, add the object into the tracking system and print the object
		for(int i=0; i< books.length; i++){
			books[i] = new Book(authors1[i],title[i], (new Random().nextInt(1000)) + 1);
			trackingSystem.add(books[i]);			
			System.out.println(books[i]);
		}

	
		//should throw an exception 
		trackingSystem.add(books[0]);
		
		//contains should return true
		System.out.println(trackingSystem.contains(books[0]));
		
		//contains should return false
		Book book1 = new Book("","",123456);
		System.out.println(trackingSystem.contains(book1));
		
		//contains should return true
		Book book2 = new Book("","",books[0].getIsbn());
		System.out.println(trackingSystem.contains(book2));	
		
		
		Iterator<Book> itrBook = trackingSystem.iterator();
		
		
		System.out.println("\nTraversing the queue:");
		//i set up the authors to be with the same author so you can see all the list, but if you change 
		//one of the authors to something else it will no longer show as part of the list 
		while(itrBook.hasNext()){
			
			System.out.println(itrBook.next());
			
		}
		
	
		

	}

}

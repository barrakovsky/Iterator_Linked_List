import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BookIterator implements Iterator<Book>{
	
	String author;
	Queue<BookRecord> queue = new LinkedList<BookRecord>();
	

	public BookIterator(BookRecord root, String author) {
		this.queue.add(root);
		
		this.author = author;
		
	}

	
	//for the regular assignment 
/*	@Override
	public boolean hasNext() {
		
		return !queue.isEmpty();
	}
*/	
	
	
	//for extra credit
	@Override
	public boolean hasNext() {
		
		if(queue.isEmpty()){
			return false;
		}	
		
		while(queue.peek().book.getAuthor() != author){
			
				
			
			if(queue.peek().hasLeft()){
				queue.add(queue.peek().left);
			}
			if(queue.peek().hasRight()){
				queue.add(queue.peek().right);
			}
		
			
			queue.remove();
			
			if(queue.isEmpty()){
				return false;
			}	
			
		}
		
			return true; 
	
	}

	
	//for the regular assignment 
/*	@Override
	public Book next() {
		
		BookRecord bookrecord = queue.remove();
		
		if(bookrecord.hasLeft()){
			queue.add(bookrecord.left);
		}
		if(bookrecord.hasRight()){
			queue.add(bookrecord.right);
		}
		
				
		return bookrecord.book;
	}
*/	
	
	//for extra credit
	@Override
	public Book next() {
		
		if(queue.peek().hasLeft()){
			queue.add(queue.peek().left);
		}
		if(queue.peek().hasRight()){
			queue.add(queue.peek().right);
		}
		
	
		return queue.remove().book;
		
		
	}


	

	

}

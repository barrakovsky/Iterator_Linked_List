import java.util.Iterator;

public class TrackingSystem implements Iterable<Book>{
	
	BookRecord head;
	

	public TrackingSystem() {
		
	}
	
	public void add(Book book) {
		
		if(head == null){
			head = new BookRecord(book);
			return;
		}
		
		BookRecord temp = head;
		
		try{
			
		while(true){
			
			if(temp.book.compareTo(book)== 1){
				
				if(temp.left == null){
					temp.left = new BookRecord(book);
					return;
				}
				
				temp = temp.left;
				
			}else if(temp.book.compareTo(book)== -1){
				
				if(temp.right == null){
					temp.right = new BookRecord(book);
					return;
				}
				
				temp = temp.right;
				
			}else if(temp.book.compareTo(book)== 0){
				throw new DuplicateException();
				
			}
		
		}
		}catch(DuplicateException ex){
			System.out.println(ex.getMessage());
		}
		
	}
	
	public boolean contains(Book book){
		
		if(head.book.compareTo(book) == 0){
			return true;
		}
		
		BookRecord temp = head;
		
		while(true){
			
			if(temp.book.compareTo(book)== -1){
				
				if(temp.left == null){
					return false;
				}
				
				temp = temp.left;
				
			}else if(temp.book.compareTo(book)== 1){
				
				if(temp.right == null){
					return false;
				}
				
				temp = temp.right;
				
			}else if(temp.book.compareTo(book)== 0){
				return true;
				
			}
			
			
		}
		
	}

	//Iterator method for regular project- no extra credit 
/*	@Override
	public Iterator<Book> iterator() {
		
		return new BookIterator(head,"");
	}
*/	
	
	
	//Iterator for extra credit
	@Override
	public Iterator<Book> iterator() {
		
		return new BookIterator(head,"author1");
	}
	

}

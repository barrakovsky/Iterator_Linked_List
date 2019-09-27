
public class BookRecord {
	
	Book book;
	BookRecord right;
	BookRecord left;

	public BookRecord(Book book) {
		this.book = book;
	}
	
	public boolean hasRight(){
		return this.right != null;
	}
	
	public boolean hasLeft(){
		return this.left != null;
	}
	
	public boolean isLeaf(){
		return this.right == null && this.left == null;
	}
	
	

}

import java.util.Objects;

public class Book implements Comparable<Book>{
	
	private String author;
	private String title; 
	private int isbn;

	public Book(String author, String title, int isbn) {
		this.setAuthor(author);
		this.setTitle(title);
		this.setIsbn(isbn);
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString(){
		return this.author + " " + this.title + " " + this.isbn;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}
		
		if(!(o instanceof Book)){
			return false;
		}
		
		Book other = (Book) o;
		
		if(!Objects.equals(author,other.getAuthor())){
			return false;
		}
		if(!Objects.equals(isbn,other.getIsbn())){
			return false;
		}
		if(!Objects.equals(title,other.getTitle())){
			return false;
		}
				
		return false; 
	}

	@Override
	public int compareTo(Book other) {
		if(this.isbn < other.isbn){
			return -1;
		}else if (this.isbn == other.isbn){
			return 0;
		}else{
			return 1;
		}
		
	}

}

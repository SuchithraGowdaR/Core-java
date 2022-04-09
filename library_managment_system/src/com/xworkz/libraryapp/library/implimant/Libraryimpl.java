package com.xworkz.libraryapp.library.implimant;
import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.dto.BookDTO;

public class Libraryimpl implements Library{
	
		
		 public BookDTO bookDTO[];
		 int index;
		 
		 public Libraryimpl(int size) {
			bookDTO= new BookDTO[size]; 
		 }
		 
		 
		 public boolean createLibraryDetails(BookDTO dto) {
				System.out.println("invoking createLibraryDetails()");
			 boolean bookAdded= false;
			 try {
			 if(dto !=null) {
				bookDTO[index++]=dto; 
				bookAdded= true;
			 }
			 else {
					System.out.println("no book added");
			 }
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
				System.out.println("end of createLibraryDetails()");
				return bookAdded;
		 }
		 
		 
		 public BookDTO getAllBookDetails() {
			 try {
				System.out.println("invoking getAllBookDetails()");
				for (int i = 0; i < bookDTO.length; i++) {
					System.out.println(bookDTO[i]);
				}
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
			 System.out.println("end of getAllBookDetails");
				return null;
		 }
		 
		 public BookDTO updateEditionByBookTitle(String adition,String title) {
			 try {
			 System.out.println("invoking updateAditionByBookName() ");
				System.out.println("1st arg: Adition: "+ adition);
				System.out.println("2nd arg: Book Title: "+ title);
				for (int i = 0; i < bookDTO.length; i++) {
					if(bookDTO[i] .getTitle().equals(title)) {
						bookDTO[i].setEdition(adition);
						System.out.println(adition);
						System.out.println("update succesfull");
					}
					else {
						System.out.println("Book not found with this title");
					}
				}
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 return null;
		 }
		 
		 public boolean deleteBookById(int bookId) {
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				 if(bookDTO[i].getBookId()==bookId) {
					 bookDTO[i]=null;
					 System.out.println("book deleted succesfull");
					 return true;
				 }
				 else {
					 System.out.println("book not found with this id");
				 }
			 }
			 }catch(Exception e) {
				e.printStackTrace(); 
			 }
			return false; 
		 }	
			
		 
		 public BookDTO getBookById(int id) {
			 System.out.println("invoking getBookId()");
			 try {
			 for (int i= 0; i < bookDTO.length; i++) {
				 if(bookDTO[i].getBookId()==id) {
					System.out.println(bookDTO[i]); 
				 }
				 else {
					 System.out.println("can not found the book with this id");
				 }
			 }
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			 
			return null; 
		 }
		 
		 public BookDTO getBookBytitle(String title) {
			 System.out.println("invoking getBookByName()");
			 try {
			 for (int i=0 ; i < bookDTO.length; i++){
				 if(bookDTO[i].getTitle().equals(title)) {
					System.out.println(bookDTO[i]); 
				 }
				 else {
					 System.out.println("can not found the book with this name");
				 }
			 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			return null; 
		 }
		 
		 public BookDTO getBookByAuther(String auther) {
			 System.out.println("invoking getBookByAuther()");
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getAuthor().equals(auther)) {
					System.out.println(bookDTO[i]);
				}
				else {
					System.out.println("can not found the book with this auther");
				}
			 }
			 } catch(Exception e) {
				 e.printStackTrace();
			 }
			 return null;
		 }
		 
		 public BookDTO getBookByEdition(String adition) {
			 System.out.println("invoking getBookByAuther()");
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getEdition().equals(adition)) {
					System.out.println(bookDTO[i]);
				}
				else {
					System.out.println("can not found the book with this adition");
				}
			 }
			 } catch(Exception e) {
				 e.printStackTrace();
			 }
			 return null;
		 }
		 
		 
		 public String getTitleById(int id) {
			 System.out.println("invoking getTitleById()");
			try{
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getBookId()==id) {
					System.out.println(bookDTO[i].getTitle());
				}
				else {
					System.out.println("can not found the book with this id");	
				}
			 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 return null;
		 }
		 
		 public int getBookIdByTitle(String title) {
			 System.out.println("invoking getBookIdByTitle()");
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getTitle().equals(title)) {
					System.out.println(bookDTO[i].getBookId());
				}
				else {
					System.out.println("can not found the book with this title");	
				}
			 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 return 0;
		 }
		 
		 public String getBookEditionById(int id) {
			 System.out.println("invoking getBookIdByAdition()");
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getBookId()==id) {
					System.out.println(bookDTO[i].getEdition());
				}
				else {
					System.out.println("can not found the book with this id");	
				}
			 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 return null;
		 }
		 

		 public float getPriceByTitle(String title) {
			 System.out.println("invoking getTitleByPrice()");
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getTitle().equals(title)) {
					System.out.println(bookDTO[i].getPrice());
				}
				else {
					System.out.println("can not found the book with this title");	
				}
			 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 return 0;
		 }
		 
		 public String[] getAllPublishersByTitle(String title) {
			 System.out.println("invoking getAllPublishersByTitle()");
			 String[] Publishers=null;
			 Publishers=new String[bookDTO.length];
			 try {
				
			 for (int i = 0; i < bookDTO.length; i++) {
				 if(bookDTO[i].getTitle().equals(title)) {
					 Publishers[i]=bookDTO[i].getPublisher();
					 System.out.println(bookDTO[i].getPublisher());
			 }
				 else {
					 System.out.println("not found  this title");
				 }
			 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 return Publishers;
		 }
		 
		 public String[] getAllAuthers() {
			 System.out.println("invoking getAllAuthers()"); 
			 String[] Auther=null;
			try {
			 for (int i = 0; i < bookDTO.length; i++) {
				 Auther =new String[bookDTO.length];
				 Auther[i]=bookDTO[i].getAuthor();
				 System.out.println(bookDTO[i].getAuthor());
			 }
			}catch(Exception e){
				e.printStackTrace();
			}
			 return Auther;
		 }
		 
		 public String[] getAllEdition() {
			 System.out.println("invoking getAllEdition()"); 
			 String[] Edition=null;
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				Edition=new String[bookDTO.length];
				Edition[i]=bookDTO[i].getEdition();
				System.out.println(bookDTO[i].getEdition());
			 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			return Edition; 
		 }
}	

/*getAllAuthers();
getAllEdition();
getPriceByBookName();
getAutherByPublisher();*/

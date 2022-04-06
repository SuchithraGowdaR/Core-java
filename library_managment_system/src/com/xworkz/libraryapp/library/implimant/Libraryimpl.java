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
		 
		 public BookDTO updateAditionByBookTitle(String adition,String title) {
			 try {
			 System.out.println("invoking updateAditionByBookName() ");
				System.out.println("1st arg: ContactNo: "+ adition);
				System.out.println("2nd arg: patientName: "+ title);
				for (int i = 0; i < bookDTO.length; i++) {
					if(bookDTO[i] .getTitle().equals(title)) {
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
		 
		 public BookDTO getBookByAdition(String adition) {
			 System.out.println("invoking getBookByAuther()");
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getAdition().equals(adition)) {
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
		 
		 public String getBookAditionById(int id) {
			 System.out.println("invoking getBookIdByAdition()");
			 try {
			 for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getBookId()==id) {
					System.out.println(bookDTO[i].getAdition());
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
}	



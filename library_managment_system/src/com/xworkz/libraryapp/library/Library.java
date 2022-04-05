package com.xworkz.libraryapp.library;
import com.xworkz.libraryapp.dto.BookDTO;

public class Library {
	
	 public BookDTO bookDTO[];
	 int index;
	 
	 public Library(int size) {
		bookDTO= new BookDTO[size]; 
	 }
	 public boolean createLibraryDetails(BookDTO dto) {
			System.out.println("invoking createLibraryDetails()");
		 boolean bookAdded= false;
		 if(dto !=null) {
			bookDTO[index++]=dto; 
			bookAdded= true;
		 }
		 else {
				System.out.println("no book added");
		 }
			System.out.println("end of createLibraryDetails()");
			return bookAdded;
	 }
	 
	 
	 public BookDTO getAllBookDetails() {
			System.out.println("invoking getAllBookDetails()");
			for (int i = 0; i < bookDTO.length; i++) {
				System.out.println(bookDTO[i]);
			}
			System.out.println("end of getAllBookDetails");
			return null;
	 }
	 
	 public BookDTO updateAditionByBookName(String adition,String title) {
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
		 return null;
	 }
	 public boolean deleteBookById(int bookId) {
		 for (int i = 0; i < bookDTO.length; i++) {
			 if(bookDTO[i].getBookId()==bookId) {
				 bookDTO[i]=null;
				 System.out.println("book details deleted succesfull");
				 return true;
			 }
			 else {
				 System.out.println("book noy found with this id");
			 }
		}
		return false; 
	 }
}

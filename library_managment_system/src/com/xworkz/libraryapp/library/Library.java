package com.xworkz.libraryapp.library;
import com.xworkz.libraryapp.dto.BookDTO;
import com.xworkz.libraryapp.LibraryTester;

public interface Library {
	
	 
	 public boolean createLibraryDetails(BookDTO dto) ;
	 public BookDTO getAllBookDetails(); 
	 public BookDTO updateAditionByBookTitle(String adition,String title); 
	 public boolean deleteBookById(int bookId); 
	 public BookDTO getBookById(int id);
	 public BookDTO getBookBytitle(String title); 
	 public BookDTO getBookByAuther(String auther);
	 public BookDTO getBookByAdition(String adition);
	 public String getTitleById(int id); 
	 public int getBookIdByTitle(String title); 
	 public String getBookAditionById(int id);
	 public float getPriceByTitle(String title);
}

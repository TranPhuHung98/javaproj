package model.bo;

import java.util.ArrayList;

import model.bean.BookBean;
import model.dao.BookDao;

public class BookBo {
	private BookDao bookDao = new BookDao();
	
	public ArrayList<BookBean> getBooks() throws Exception{
		return bookDao.getAllBooks();
	}
	
	public BookBean getBookByID(int id) throws Exception{
        ArrayList<BookBean> books = bookDao.getBooksByID(id);
        if (books.size() > 0) {
        	return books.get(0);
        } else {
        	return null;
        }
    }
	
	public ArrayList<BookBean> getBooksByCategory(int idCategory) throws Exception{
		return bookDao.getBooksByCategory(idCategory);
	}
	
	public int addBook(int iDBook, String name, int price, int iDCategory, String image, String author) throws Exception {
		return bookDao.addBook(iDBook, name, price, iDCategory, image, author);
	}
	
	public int updateBook(int iDBook, String name, int price, int iDCategory, String image, String author) throws Exception {
		return bookDao.updateBook(iDBook, name, price, iDCategory, image, author);
	}
	
	public int delelteBook(int idBook) throws Exception {
		return bookDao.delelteBook(idBook);
	}
}

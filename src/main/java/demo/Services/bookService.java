package demo.Services;

import demo.domain.Book;

import java.util.List;

public interface bookService {

    int save(Book book) ;

    int delete(Integer id);

    int update(Book book);

    List<Book> selectAll(Book book);

    Book getById(int id);
}


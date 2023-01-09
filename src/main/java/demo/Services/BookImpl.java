package demo.Services;

import com.baomidou.mybatisplus.core.injector.methods.SelectList;
import demo.Dao.BookDao;
import demo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookImpl implements bookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public int save(Book book) {
        return bookDao.insert(book);
    }

    public int delete(Integer id) {
        return bookDao.deleteById(id);
    }

    @Override
    public int update(Book book) {
        return bookDao.updateById(book);
    }

    @Override
    public List<Book> selectAll(Book book) {
        return bookDao.selectList(null);
    }

    @Override
    public Book getById(int id) {
        return bookDao.selectById(id);
    }
}


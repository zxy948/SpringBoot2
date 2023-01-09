package demo.Services.MP;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.Dao.BookDao;
import demo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 该MP开发的接口实现类继承的MPServiceImpl泛型应该明确为：
 *      1.实现类 BookDao
 *      2.对应的模型实体类： Book
 */
@Service
public class BookServiceIMPL extends ServiceImpl<BookDao, Book> implements IbookService{

    @Autowired
    private BookDao dao;

    @Override
    public boolean saveBook(Book book) {
        return dao.insert(book) > 0;
    }

    @Override
    public boolean modify(Book book) {
        return dao.updateById(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return dao.deleteById(id) > 0;
    }

    @Override
    public IPage<Book> getpage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        dao.selectPage(page,null);
        return page;
    }
}


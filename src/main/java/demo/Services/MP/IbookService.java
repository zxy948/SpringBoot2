package demo.Services.MP;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import demo.domain.Book;

/**
 * 使用MP 业务层开发
 */
public interface IbookService extends IService<Book> {
    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getpage(int currentPage,int pageSize);

}

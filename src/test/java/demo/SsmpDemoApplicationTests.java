package demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import demo.Dao.BookDao;
import demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsmpDemoApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    public void test1(){
        List list = bookDao.selectList(null);

    }

    @Test
    public void test2(){
        Book b1 = new Book();
        b1.setName("new 1");
        b1.setType("new 1");
        b1.setDescription("new 11");
        bookDao.insert(b1);
    }


    @Test
    public void test3(){
        IPage page=new Page(1,5);
        bookDao.selectPage(page,null);
    }

}


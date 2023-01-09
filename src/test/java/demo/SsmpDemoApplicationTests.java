package demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import demo.Dao.BookDao;
import demo.Services.MP.IbookService;
import demo.Services.bookService;
import demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsmpDemoApplicationTests {

    @Autowired
    private bookService bs;

    @Autowired
    private IbookService ibookService;

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
        //要想实现恩耶分页功能需要配置拦截器 卸载MP的配置类中
        IPage page=new Page(1,5);   //current：当前页码  size：页面显示内容数
        bookDao.selectPage(page,null);
    }


    @Test
    void testGetByid(){
        System.out.println(bs.getById(3));
    }

    @Test
    void testMPservice(){
        System.out.println(ibookService.getById(3));
    }

}


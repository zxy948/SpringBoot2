package demo.Ctrl;

import demo.Dao.BookDao;
import demo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/books")
@RestController
public class BookCtrl {
    @Autowired
    private BookDao bookDao;

    @GetMapping
    public void selectAll(){
        List books = bookDao.selectList(null);
        System.out.println(books);
    }
}


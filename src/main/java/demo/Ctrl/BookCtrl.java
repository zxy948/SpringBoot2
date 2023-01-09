package demo.Ctrl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import demo.Ctrl.utils.Result;
import demo.Dao.BookDao;
import demo.Services.MP.IbookService;
import demo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@RestController
public class BookCtrl { //表现层
    @Autowired
    private IbookService ibs;   //注入业务层接口，进行操作

    @GetMapping
    public Result selectAll(){
        return new Result(true,ibs.list());
    }

    @PostMapping
    public Result save(@RequestBody Book book){    //传送JSON数据，接受的是请求体参数，用@requestbody
        return new Result(ibs.saveBook(book));
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        return new Result(ibs.delete(id));
    }

    @PutMapping
    public Result update(@RequestBody Book book){
        return new Result(ibs.modify(book));
    }

    @GetMapping("{id}")
    public Result selectById(@PathVariable Integer id){
        return new Result(true,ibs.getById(id));
    }

    //分页功能
    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new Result(true,ibs.getpage(currentPage,pageSize));
    }

}


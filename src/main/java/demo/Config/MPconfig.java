package demo.Config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPconfig {
    //MP分页拦截器
    @Bean
    public MybatisPlusInterceptor mpi(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();  //添加拦截器的空壳

        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());  //向拦截器中添加分页的拦截功能

        return interceptor;
    }
}


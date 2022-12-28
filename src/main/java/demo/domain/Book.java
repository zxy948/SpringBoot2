package demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //为当前实体类在编译时生成对应的get、set、toString、hashCode、equals等方法
@NoArgsConstructor  //无参构造方法
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;
}


package demo.Ctrl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Result {
    private Boolean flag;
    private Object data;

    public Result() {
    }

    public Result(Boolean flag) {
        this.flag = flag;
    }

    public Result(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}


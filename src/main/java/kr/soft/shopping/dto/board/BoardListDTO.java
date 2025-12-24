package kr.soft.shopping.dto.board;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class BoardListDTO {
    private int boardIdx;
    private String userId;
    private String title;
    private LocalDateTime createAt;
}

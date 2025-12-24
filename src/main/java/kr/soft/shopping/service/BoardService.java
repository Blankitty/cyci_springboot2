package kr.soft.shopping.service;

import kr.soft.shopping.dto.board.BoardListDTO;
import kr.soft.shopping.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public List<BoardListDTO> list() {
        return boardMapper.list();
    }
}

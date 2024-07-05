package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.BoardEntity;
import com.example.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO -> Entity (Entity class)
// Entity -> DTO (DTO Class)

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}

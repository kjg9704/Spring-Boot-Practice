package com.example.demo.board.service;

import java.util.List;

import com.example.demo.board.dto.BoardDto;

public interface BoardService {
	
	List<BoardDto> selectBoardList() throws Exception;
	void insertBoard(BoardDto board) throws Exception;

}

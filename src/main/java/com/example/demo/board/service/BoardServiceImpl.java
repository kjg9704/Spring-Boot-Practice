package com.example.demo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}
	
	@Override
	public void insertBoard(BoardDto board) throws Exception{
		boardMapper.insertBoard(board);
	}
	
	public BoardDto selectBoardDetail(int boardIdx) throws Exception{
		boardMapper.updateHitCount(boardIdx);
		BoardDto board = boardMapper.selectBoardDetail(boardIdx);
		return board;
	}
}
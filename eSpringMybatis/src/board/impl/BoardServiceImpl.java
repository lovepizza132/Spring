package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.BoardService;
import board.BoardVO;


@Service("boardService")//원래boardServiceImpl로 변수명이 자동으로 지정 됨
public class BoardServiceImpl implements BoardService {
	
	@Autowired // setter도 없고 생성자도 없기 때문에
	private BoardDAOMybatis boardDAO;

	public void insertBoard(BoardVO vo) {

		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
}
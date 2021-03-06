package org.moviebollae.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.moviebollae.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();	// 게시글 전체 조회

	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
}

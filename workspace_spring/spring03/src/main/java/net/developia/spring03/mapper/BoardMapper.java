package net.developia.spring03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import net.developia.spring03.domain.BoardVO;

public interface BoardMapper {
//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
}

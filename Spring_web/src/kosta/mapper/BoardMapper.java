package kosta.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import kosta.model.Board;


public interface BoardMapper {
	int insertBoard(Board board);
	/*List<Board> listBoard(Search search,RowBounds row); //mybatis���� ó���ϴ� �� �̹Ƿ� xml���� �Ķ���ͷ� ���� �����ʾƵ� �ȴ�.
	Board detailBoard(int seq);
	int countBoard(Search search);
	void deleteBoard(int seq);
	int insertReply(Reply reply);
	List<Reply> listReply(int seq);
	int updateBoard(Board board);*/
}

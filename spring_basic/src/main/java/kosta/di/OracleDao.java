package kosta.di;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDao implements Dao{

	@Override
	public void insertBoard() {
		// TODO Auto-generated method stub
		System.out.println("oracleDao insertboard()호출");
	}

}

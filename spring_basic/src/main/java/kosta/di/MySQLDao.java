package kosta.di;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDao implements Dao{


	public void insertBoard(){
		System.out.println("mysqldao insertboard()호출");
	}
}

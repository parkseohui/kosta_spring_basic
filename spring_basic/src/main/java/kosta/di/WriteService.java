package kosta.di;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WriteService implements Service {
	@Inject
	private Dao dao;
	
	public WriteService() {}

	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}
	
	/*@Autowired
	@Qualifier("oracleDao")*/
	//data 타입을 보고 객체를 선언해준다
	public void setDao(Dao dao){
		this.dao=dao;
	}
	@Override
	public void insert() {
		System.out.println("writeservice insert()호출");
		dao.insertBoard();
	}

}

package kosta.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class Calculate {
	
	public int calc(){
		int result=0;
		for(int i=1;i<=10;i++){
			result+=i;
		}
		return result;
	}
		
}

package kosta.di;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {
	private Log log = LogFactory.getLog(getClass());

	// 공통관심메서드
	// advice=>around=>이전(공통)>핵심>이후(공통)
	public Object logging(ProceedingJoinPoint jointPoint) throws Throwable {
		log.info("로그시작");
		StopWatch stopWatch = new StopWatch();

		try {
			stopWatch.start();
			//핵심 관심 사항을 호출해준다: insert()호출이 되는 지점이 이 지점이다.
			Object obj=jointPoint.proceed();
			return obj;
		} catch (Exception e) {
			throw e;
		} finally {
			//시간이 얼마나 걸렸나 출력
			stopWatch.stop();
			log.info("로그아웃");
			log.info(jointPoint.getSignature().getName()+"메서드 실행시"
					+stopWatch.getTotalTimeMillis());
			
		}
	}

}

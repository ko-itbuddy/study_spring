package yuhan.spring.aop1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

//공통업무를 지원하는 클래스
//프록시 클래스
//공통 클래스 제작
@Aspect
public class LogAop {
	//
	public  Object loggerAop(ProceedingJoinPoint jointpoint) throws Throwable {


		String Signature = jointpoint.getSignature().toString();
		System.out.println(Signature + "is start");
		long st = System.currentTimeMillis();
		try {
			Object obj = jointpoint.proceed();
			return obj;
		}

		finally {
			long et = System.currentTimeMillis();

			System.out.println(Signature + "is finished");
			System.out.println(Signature + "경과시간"+(et - st));
		}


	}



}

package aop1_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {
	public void before(JoinPoint point)throws Throwable{ // around 말고 after, before, afterThrows 등 이 있다.
		String methodName = point.getSignature().getName();
		System.out.println("5252[사전작업]5252: "+ methodName);
	}
	
	public Object around(ProceedingJoinPoint point)throws Throwable{ // around 말고 after, before, afterThrows 등 이 있다.
		String methodName = point.getSignature().getName();
		System.out.println("[사전작업]: "+ methodName);
		Object obj = point.proceed(); // 다시 실행하던데로 실행하라
		System.out.println("(((사후작업))): "+ methodName);
		return obj;
	}
	
}

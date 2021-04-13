package SpringAOP;
import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* SpringAOP.q_1.getAllDetails(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("Logger activated : " + joinPoint.getSignature().getName());
        System.out.println("******"+ LocalDateTime.now());
    }
}
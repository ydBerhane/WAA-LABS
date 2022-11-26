package com.waa.lab4.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class ExecutionTimeAspect {
    @Pointcut("@annotation(com.waa.lab4.aspect.Annotation.ExecutionTime)")
    public void executionTimeAnnotation() {
    }

    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = joinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println(joinPoint.getSignature().getName() + " takes ns: " + (finish - start));
        return result;
    }
}

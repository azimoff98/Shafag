package az.shafag.testapp.aspect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import static az.shafag.testapp.logger.Log.info;



@Aspect
@Component
public class LoggerAspect {

    ObjectMapper objectMapper = new ObjectMapper();


    @Around("execution(* az.shafag.testapp.controller.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = buildMethodName(joinPoint);
        String requestData = buildRequestData(joinPoint);
        info("REQUEST: " + methodName.concat(" ").concat(requestData));

        Object returnValue = joinPoint.proceed();

        info("RESPONSE: " + methodName.concat(" ").concat(objectMapper.writeValueAsString(returnValue)));
        return returnValue;
    }

    private String buildMethodName(JoinPoint joinPoint){
        StringBuffer buffer = new StringBuffer();
        buffer.append(joinPoint.getTarget().getClass().getSimpleName());
        buffer.append(".");
        buffer.append(joinPoint.getSignature().getName() + " ");

        return buffer.toString();
    }

    private String buildRequestData(JoinPoint joinPoint) throws JsonProcessingException {
        StringBuffer buffer = new StringBuffer();
        Object[] args = joinPoint.getArgs();

        for (Object o : args){
            buffer.append(objectMapper.writeValueAsString(o));
        }
        if(args.length > 0){
            buffer.deleteCharAt(buffer.length() - 1);
        }
        return buffer.toString();
    }

}

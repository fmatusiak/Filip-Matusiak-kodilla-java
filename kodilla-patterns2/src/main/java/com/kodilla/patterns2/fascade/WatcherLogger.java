package com.kodilla.patterns2.fascade;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherLogger.class);

    @Before("execution(* com.kodilla.patterns2.fascade.api.OrderFacade.processOrder(..))")
    public void showCountExecuteMethodProcessOrder() {
        LOGGER.info("use method processOrder");
    }

    @After("execution(* com.kodilla.patterns2.fascade.api.OrderFacade.processOrder(..))")
    public void showfinishExecuteMethodProcessOrder() {
        LOGGER.info("finish execute method processOrder");
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.fascade.api.OrderFacade.processOrder(..))")
    public void showfinishExecuteMethodProcessOrderAfterThrowing() {
        LOGGER.error("Application throw exceptions");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.fascade.api.OrderFacade.processOrder(..))")
    public void showfinishExecuteMethodProcessOrderAfterReturning(){
        LOGGER.info("Successful");
    }

}

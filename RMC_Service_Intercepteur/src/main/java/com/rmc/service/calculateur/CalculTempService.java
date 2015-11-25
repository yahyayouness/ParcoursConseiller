package com.rmc.service.calculateur;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.log4j.Logger;

public class CalculTempService {
    
    private static final Logger logger = Logger.getLogger(CalculTempService.class);
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    private static CalculTempService instance;
    
    private ThreadLocal<Calendar> date;
    
    private CalculTempService() {
        this.date = new ThreadLocal<Calendar>();
        this.date.set(null);
    }
    
    public static CalculTempService getInstance() {
        if( instance == null ) instance = new CalculTempService();
        return instance;
    }
    
    public void start() {
        Calendar now = Calendar.getInstance();
        getInstance().date.set(now);
        logger.debug("Date début exec : " + sdf.format(now.getTime()) 
                + " [ threadId = " + Thread.currentThread().getId() + "]");
    }
    
    public static void getExecTime(String service, String operation) {
        Calendar now = Calendar.getInstance();
        logger.debug("Date fin exec : " +sdf.format(now.getTime())
                 + " [ threadId = " + Thread.currentThread().getId() + "]");
        logger.info(service + "." + operation + " : execution time = "
                + (now.getTimeInMillis() - getInstance().getDate().get().getTimeInMillis())
                + " ms");
        getInstance().getDate().set(null);
    }

    public ThreadLocal<Calendar> getDate() {
        return date;
    }

    public void setDate(ThreadLocal<Calendar> date) {
        this.date = date;
    }

}

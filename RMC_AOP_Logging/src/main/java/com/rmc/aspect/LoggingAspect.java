package com.rmc.aspect;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Classe définissant le contenu de l'aspect du logging.
 * 
 * @author yyahia
 * 
 */
@Aspect
public class LoggingAspect {

	/** The Constant LOG. */
	private static final Logger LOG = Logger.getLogger(LoggingAspect.class);

	/**
	 * Simple date format.
	 */
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

	/**
	 * FIXME check if it's not thread safe and use Thread Locale.
	 */
	private long start;

	@Before("@annotation(com.rmc.annotations.Loggable)")
	public void logAvantAppel(JoinPoint joinPoint) {

		final String nomMethode = joinPoint.getSignature().getName();
		final String args = Arrays.toString(joinPoint.getArgs());
		LOG.info("************************************************************************");
		LOG.info("Debut d'appel au service " + nomMethode + " at " + simpleDateFormat.format(new Date()));
		start = System.currentTimeMillis();
		LOG.info("With Arguments " + args);

	}

	@After("@annotation(com.rmc.annotations.Loggable)")
	public void logApresAppel(JoinPoint joinPoint) {
		final String nomMethode = joinPoint.getSignature().getName();
		LOG.info("Fin d'appel au service " + nomMethode + " at " + simpleDateFormat.format(new Date()));
		LOG.info("Temps de traitement du service = " + (System.currentTimeMillis() - start) + " ms");
		LOG.info("************************************************************************");

	}

	@AfterReturning(pointcut = "@annotation(com.rmc.annotations.Loggable)", returning = "result")
	public void logResultatAppel(JoinPoint joinPoint, Object result) {

		LOG.info("Reponse du service = " + (result != null ? result : "Ne retourne rien"));
	}

	@AfterThrowing(pointcut = "@annotation(com.rmc.annotations.Loggable)", throwing = "error")
	public void logException(JoinPoint joinPoint, Throwable error) {
		final String nomMethode = joinPoint.getSignature().getName();
		LOG.error("************************************************************************");
		LOG.error("Erreur lors de l'appel du service " + nomMethode + " at " + simpleDateFormat.format(new Date()));
		LOG.error("Détails de l'erreur : ", error);
		LOG.error("************************************************************************");
	}

	// @Around("execution(* *(..)) && @annotation(com.rmc.annotations.Loggable)")
	// public void logAround(ProceedingJoinPoint joinPoint) {
	//
	//
	// final String nomMethode = joinPoint.getSignature().getName();
	// final String args = Arrays.toString(joinPoint.getArgs());
	//
	// LOG.info("************************************************************************");
	// LOG.info("Debut d'appel au service " + nomMethode + " at " +
	// simpleDateFormat.format(new Date()));
	// LOG.info("Avec les arguments = " + args);
	//
	// long start = System.currentTimeMillis();
	//
	// Object result;
	// try {
	// result = joinPoint.proceed();
	// LOG.info("Reponse du service = " + (result != null ? result :
	// "Ne retourne rien") );
	// } catch (Throwable e) {
	// LOG.error("Détail de l'erreur :", e);
	// }
	//
	// LOG.info("Temps de traitement du service = "
	// + (System.currentTimeMillis() - start) + " ms");
	//
	// LOG.info("Fin d'appel au service " + nomMethode + " at " +
	// simpleDateFormat.format(new Date()));
	// LOG.info("************************************************************************");
	//
	// }

}
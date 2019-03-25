package com.kodilla.patterns2.fascade.api;

public class OrderProcessingException extends Exception {
    public static String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERYFICATION_ERROR = "Veryfication error";
    public static String ERR_SUBMITTING_ERROR = "cannot submit order";

    public OrderProcessingException(String message) {
        super(message);
    }
}

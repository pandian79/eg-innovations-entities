package org.grassfield.egcli.entity;

/**
 * POJO class for response status 
 * @author Logesh Chandiran
 * 
 */
public class Response {
    
    private String messageStatus;
    private String message;
    
    public String getMessageStatus() {
        return messageStatus;
    }
    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
}
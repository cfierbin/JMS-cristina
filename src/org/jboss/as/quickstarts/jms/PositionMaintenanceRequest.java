package org.jboss.as.quickstarts.jms;

import java.io.Serializable;
import java.util.Calendar;

public class PositionMaintenanceRequest implements Serializable{
    

    /**
     * 
     */
    private static final long serialVersionUID = -4814120466014315747L;
    public long getPositionRequestId() {
        return positionRequestId;
    }
    public void setPositionRequestId(long positionRequestId) {
        this.positionRequestId = positionRequestId;
    }
    public int getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }
    public int getAction() {
        return action;
    }
    public void setAction(int action) {
        this.action = action;
    }
    public Calendar getClearDate() {
        return clearDate;
    }
    public void setClearDate(Calendar clearDate) {
        this.clearDate = clearDate;
    }
    public Calendar getTransactionTime() {
        return transactionTime;
    }
    public void setTransactionTime(Calendar transactionTime) {
        this.transactionTime = transactionTime;
    }
    public String toString(){//String representation of this message
        String result = String.valueOf(positionRequestId);
        result += "\n";
        result += String.valueOf(transactionType);
        result += "\n";
        result += String.valueOf(action);
        result += "\n";
        result += "Transaction time = " + transactionTime.getTime();
        result += "\n";
        result += "Clear date = " + clearDate.getTime();
        return result;
    }
    private long positionRequestId;
    private int transactionType;
    private int action;
    private Calendar clearDate;
    private Calendar transactionTime;

}

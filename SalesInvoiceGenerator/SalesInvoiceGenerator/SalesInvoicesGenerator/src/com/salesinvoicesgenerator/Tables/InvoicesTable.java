package com.salesinvoicesgenerator.Tables;

// This Class defines the Invoices Table Objects.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class InvoicesTable {

    // Variables declaration.
    private int invNum;
    private String customerName;
    private Date invDate;
    private ArrayList<InvoicesItems> lines;
    private DateFormat dateFt = new SimpleDateFormat("dd-MM-yyyy");
    // End of variables declaration.

    public InvoicesTable (int invNum, String customerName, Date invDate) {
        this.invNum = invNum;
        this.customerName = customerName;
        this.invDate = invDate;
        this.lines = new ArrayList<>();
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    @Override
    public String toString() {
        return "InvoicesTable{" + "invNum=" + invNum + ", customerName=" + customerName + ", invDate=" + invDate + '}';
    }

    public ArrayList<InvoicesItems> getLines() {
        return lines;
    }

    public void setLines(ArrayList<InvoicesItems> lines) {
        if (lines == null)
            lines = new ArrayList<>();
        this.lines = lines;
    }

    public double getInvTotal() {
        double total = 0.0;
        for (InvoicesItems line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }


    public void addInvLine(InvoicesItems line) {
        getLines().add(line);

    }

    public String getFileAsExcel() {
        return "" + getInvNum() + "," + dateFt.format(getInvDate()) + "," + getCustomerName();
    }

}


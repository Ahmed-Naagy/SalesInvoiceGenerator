package com.salesinvoicesgenerator.Tables;

// This Class defines the Invoices Table Objects.

public class InvoicesItems {
    // Variables declaration.
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private InvoicesTable invTableHeader;
    // End of variables declaration.

    public InvoicesItems(String itemName, double itemPrice, int itemCount, InvoicesTable invTableHeader) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.invTableHeader = invTableHeader;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public InvoicesTable getInvoicesTableHeader() {
        return invTableHeader;
    }

    public void setInvoicesTableHeader(InvoicesTable header) {
        this.invTableHeader = header;
    }

    @Override
    public String toString() {
        return "InvoicesItems{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }

    public double getLineTotal() {
        return itemCount * itemPrice;

    }

    public String getFileAsExcel() {
        return "" + getInvoicesTableHeader().getInvNum() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
    }

}

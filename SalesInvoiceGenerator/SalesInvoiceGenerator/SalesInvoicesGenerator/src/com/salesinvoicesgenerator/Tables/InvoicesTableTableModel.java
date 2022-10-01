package com.salesinvoicesgenerator.Tables;

// This Class defines the Invoices Table - Table Model (Right-hand Table).

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class InvoicesTableTableModel extends AbstractTableModel {

    // Variables declaration.
    private List<InvoicesTable> invoicesTableArray;
    private DateFormat dateFt = new SimpleDateFormat("dd-MM-yyyy");
    // End of variables declaration.

    public InvoicesTableTableModel(List<InvoicesTable> invoicesArray) {
        this.invoicesTableArray = invoicesArray;
    }

    public List<InvoicesTable> getInvoicesTableArray() {
        return invoicesTableArray;
    }


    @Override
    public int getRowCount() {
        return invoicesTableArray.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Invoice Number";
            case 1:
                return "Customer Name";
            case 2:
                return "Invoice Date";
            case 3:
                return "Invoice Total";
            default: return "";
        }

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            default: return Object.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoicesTable row = invoicesTableArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getInvNum();
            case 1:
                return row.getCustomerName();
            case 2:
                return dateFt.format(row.getInvDate());
            case 3:
                return row.getInvTotal();
            default:
                return "";
        }
    }

}

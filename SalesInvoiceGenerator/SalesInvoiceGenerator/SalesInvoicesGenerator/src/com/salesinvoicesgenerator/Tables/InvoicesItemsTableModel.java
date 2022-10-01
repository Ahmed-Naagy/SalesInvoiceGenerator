
package com.salesinvoicesgenerator.Tables;

// This Class defines the Invoices Items Table Model (Right-hand Table).


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class InvoicesItemsTableModel extends AbstractTableModel {

    // Variables declaration.
    private List<InvoicesItems> invoicesItemsArray;
    private DateFormat dateFt = new SimpleDateFormat("dd-MM-yyyy");
    // End of variables declaration.

    public InvoicesItemsTableModel(List<InvoicesItems> invoicesItemsArray) {
        this.invoicesItemsArray = invoicesItemsArray;
    }

    public List<InvoicesItems> getInvoicesItemsArray() {
        return invoicesItemsArray;
    }


    @Override
    public int getRowCount() {
        return invoicesItemsArray.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Item Name";
            case 1:
                return "Item Price";
            case 2:
                return "Item Count";
            case 3:
                return "Items Total";
            default: return "";
        }

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Double.class;
            case 2:
                return Integer.class;
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
        InvoicesItems row = invoicesItemsArray.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getItemName();
            case 1:
                return row.getItemPrice();
            case 2:
                return row.getItemCount();
            case 3:
                return row.getLineTotal();
            default: return "";
        }
    }

}

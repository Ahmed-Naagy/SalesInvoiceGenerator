package com.salesinvoicesgenerator.Dialogs;


// This class represents the Invoices Table Dialog once pressed on Create New Invoice button.


import com.salesinvoicesgenerator.JFrame.SalesInvoicesFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvoicesTableDialog extends JDialog {
    // Variables Declaration.
    private JTextField customerNameField;
    private JTextField invoiceDateField;
    private JLabel customerNameJLabel;
    private JLabel invoiceDateJLabel;
    private JButton okBtn;
    private JButton cancelBtn;
    // End of Variables Declaration.

    // Constructor.
    public InvoicesTableDialog(SalesInvoicesFrame f) {
        customerNameJLabel = new JLabel("Customer Name:");
        customerNameField = new JTextField(20);
        invoiceDateJLabel = new JLabel("Invoice Date:");
        invoiceDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");

// OK & Cancel buttons action commands.
        okBtn.setActionCommand("confirmCreateInvoice");
        cancelBtn.setActionCommand("cancelCreateInvoice");
        okBtn.addActionListener(f);
        cancelBtn.addActionListener(f);

// Setting Layout.
        setLayout(new GridLayout(4, 2));

// Adding declared constructed variables to Layout.
        add(customerNameJLabel);
        add(customerNameField);
        add(invoiceDateJLabel);
        add(invoiceDateField);
        add(okBtn);
        add(cancelBtn);
        pack();
    }

    // Getter Method for Customer Name.
    public JTextField getCustomerNameField() {
        return customerNameField;
    }

    // Getter Method for Invoice Date.
    public JTextField getInvoiceDateField() {
        return invoiceDateField;
    }

}

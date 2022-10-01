package com.salesinvoicesgenerator.Dialogs;

import com.salesinvoicesgenerator.JFrame.SalesInvoicesFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

// This class represents the Invoices Items Dialog once pressed on Create New Line button.

public class InvoicesItemsDialog extends JDialog {
    // Variables declaration.
    private JTextField itemNameJTextField;
    private JTextField itemCountJTextField;
    private JTextField itemPriceJTextField;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    // End of variables declaration.

    // Invoice Items Dialog Constructor.
    public InvoicesItemsDialog(SalesInvoicesFrame f) {
        itemNameJTextField = new JTextField(20);
        itemNameLbl = new JLabel("Item Name:");
        itemCountJTextField = new JTextField(20);
        itemCountLbl = new JLabel("Item Count:");
        itemPriceJTextField = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price:");
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        okBtn.setActionCommand("confirmCreateLine");
        cancelBtn.setActionCommand("cancelCreateLine");
        okBtn.addActionListener(f);
        cancelBtn.addActionListener(f);
        setLayout(new GridLayout(4,2));
        add(itemNameLbl);
        add(itemNameJTextField);
        add(itemCountLbl);
        add(itemCountJTextField);
        add(itemPriceLbl);
        add(itemPriceJTextField);
        add(okBtn);
        add(cancelBtn);
        pack();
    }

    // Item Name Text Field Getter.
    public JTextField getItemNameJTextField() {
        return itemNameJTextField;
    }

    // Item Count Text Field Getter.
    public JTextField getItemCountJTextField() {
        return itemCountJTextField;
    }

    // Item Price Text Field Getter.
    public JTextField getItemPriceJTextField() {
        return itemPriceJTextField;
    }

}


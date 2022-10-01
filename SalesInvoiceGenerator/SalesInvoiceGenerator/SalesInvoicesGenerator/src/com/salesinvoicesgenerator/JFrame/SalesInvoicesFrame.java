package com.salesinvoicesgenerator.JFrame;

// This Class defines the main JFrame GUI including the JPanels, JButtons, JMenuBar & JMenuItems of the project.

import com.salesinvoicesgenerator.Dialogs.InvoicesItemsDialog;
import com.salesinvoicesgenerator.Dialogs.InvoicesTableDialog;
import com.salesinvoicesgenerator.Tables.InvoicesItems;
import com.salesinvoicesgenerator.Tables.InvoicesItemsTableModel;
import com.salesinvoicesgenerator.Tables.InvoicesTable;
import com.salesinvoicesgenerator.Tables.InvoicesTableTableModel;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SalesInvoicesFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {


    // Creates new form SalesInvoicesFrame.
    public SalesInvoicesFrame() {
        initComponents();
    }


    // Generated Code made through ** Netbeans ** JFrame Creator defines variables of JFrame Content.
    private void initComponents() {

        invoicesTableLbl = new javax.swing.JLabel();
        newInvoiceBtn = new javax.swing.JButton();
        newInvoiceBtn.addActionListener(this);
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(this);
        createNewLineBtn = new javax.swing.JButton();
        createNewLineBtn.addActionListener(this);
        deleteLineBtn = new javax.swing.JButton();
        deleteLineBtn.addActionListener(this);
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        invoiceItemsScrlpn = new javax.swing.JScrollPane();
        invoiceItemsTbl = new javax.swing.JTable();
        invoiceItemsLbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        invoicesTblScrlpn = new javax.swing.JScrollPane();
        invoicesTblTbl = new javax.swing.JTable();
        invoicesTblTbl.getSelectionModel().addListSelectionListener(this);
        jPanel3 = new javax.swing.JPanel();
        invoiceTotalLbl = new javax.swing.JLabel();
        customerNameLbl = new javax.swing.JLabel();
        invoiceDateLbl = new javax.swing.JLabel();
        invoiceNumberLbl = new javax.swing.JLabel();
        invoiceNumberLbl2 = new javax.swing.JLabel();
        InvoiceTotalLbl2 = new javax.swing.JLabel();
        invoiceDateTxtFld = new javax.swing.JTextField();
        customerNameTxtFld = new javax.swing.JTextField();
        JMenuBar = new javax.swing.JMenuBar();
        menuBar = new javax.swing.JMenu();
        loadFileMenu = new javax.swing.JMenuItem();
        loadFileMenu.addActionListener(this);
        saveFileMenu = new javax.swing.JMenuItem();
        saveFileMenu.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Invoices Generator");

        invoicesTableLbl.setText("Invoices Table");

        newInvoiceBtn.setText("Create New Invoice");
        newInvoiceBtn.setActionCommand("CreateNewInvoice");

        deleteInvoiceBtn.setText("Delete Invoice");
        deleteInvoiceBtn.setActionCommand("DeleteInvoice");

        createNewLineBtn.setText("Create New Line");
        createNewLineBtn.setActionCommand("CreateNewLine");

        deleteLineBtn.setText("Delete Line");
        deleteLineBtn.setActionCommand("DeleteLine");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        invoiceItemsTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        invoiceItemsTbl.setGridColor(new java.awt.Color(204, 204, 204));
        invoiceItemsTbl.setSelectionForeground(new java.awt.Color(204, 204, 204));
        invoiceItemsTbl.setShowGrid(true);
        invoiceItemsScrlpn.setViewportView(invoiceItemsTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(invoiceItemsScrlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(invoiceItemsScrlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 206, Short.MAX_VALUE))
        );

        invoiceItemsLbl.setText("Invoice Items");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(invoiceItemsLbl))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(invoiceItemsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        invoicesTblTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        invoicesTblTbl.setGridColor(new java.awt.Color(204, 204, 204));
        invoicesTblTbl.setSelectionForeground(new java.awt.Color(204, 204, 204));
        invoicesTblTbl.setShowGrid(true);
        invoicesTblScrlpn.setViewportView(invoicesTblTbl);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(invoicesTblScrlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(invoicesTblScrlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 405, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        invoiceTotalLbl.setText("Invoice Total");

        customerNameLbl.setText("Customer Name");

        invoiceDateLbl.setText("Invoice Date");

        invoiceNumberLbl.setText("Invoice Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(invoiceNumberLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(invoiceNumberLbl2))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(customerNameLbl)
                                                        .addComponent(invoiceTotalLbl)
                                                        .addComponent(invoiceDateLbl))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(InvoiceTotalLbl2)
                                                        .addComponent(invoiceDateTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(customerNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(9, 9, 9))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceNumberLbl)
                                        .addComponent(invoiceNumberLbl2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceDateLbl)
                                        .addComponent(invoiceDateTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(customerNameLbl)
                                                        .addComponent(customerNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(invoiceTotalLbl)
                                                        .addComponent(InvoiceTotalLbl2))))
                                .addGap(14, 14, 14))
        );

        menuBar.setText("File");
        menuBar.setActionCommand("menuBarCommand");

        loadFileMenu.setText("Load File");
        loadFileMenu.setActionCommand("loadFileMenuItem");
        menuBar.add(loadFileMenu);

        saveFileMenu.setActionCommand("SaveFileMenuItem");
        saveFileMenu.setText("Save File");
        menuBar.add(saveFileMenu);

        JMenuBar.add(menuBar);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(invoicesTableLbl)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addComponent(newInvoiceBtn)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(deleteInvoiceBtn))
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(664, 664, 664)
                                                .addComponent(createNewLineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(deleteLineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(invoicesTableLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(createNewLineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                                        .addComponent(deleteLineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(newInvoiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                                        .addComponent(deleteInvoiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }
    // End of Generated Code.

    // JFrame Variables declaration.
    private javax.swing.JLabel InvoiceTotalLbl2;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JButton createNewLineBtn;
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JTextField customerNameTxtFld;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JButton deleteLineBtn;
    private javax.swing.JLabel invoiceDateLbl;
    private javax.swing.JTextField invoiceDateTxtFld;
    private javax.swing.JLabel invoiceItemsLbl;
    private javax.swing.JScrollPane invoiceItemsScrlpn;
    private javax.swing.JTable invoiceItemsTbl;
    private javax.swing.JLabel invoiceNumberLbl;
    private javax.swing.JLabel invoiceNumberLbl2;
    private javax.swing.JLabel invoiceTotalLbl;
    private javax.swing.JLabel invoicesTableLbl;
    private javax.swing.JScrollPane invoicesTblScrlpn;
    private javax.swing.JTable invoicesTblTbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem loadFileMenu;
    private javax.swing.JMenu menuBar;
    private javax.swing.JButton newInvoiceBtn;
    private javax.swing.JMenuItem saveFileMenu;
    private DateFormat dateFt = new SimpleDateFormat("dd-MM-yyyy");
    private List<InvoicesTable> invoicesArray = new ArrayList<>();
    private InvoicesTableTableModel invoicesTableTableModel;
    private InvoicesItemsTableModel invoicesItemsTableModel;
    private InvoicesTableDialog invoicesTblDialog;
    private InvoicesItemsDialog invoicesItemsDialog;
    // End of JFrame variables declaration.


    // Actions Performed methods.
    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            // Load File Menu Item Actions.
            case "loadFileMenuItem":
                loadFile();
                break;
            // Save File Menu Item Actions.
            case "SaveFileMenuItem":
                saveFile();
                break;
            //Create New Invoice Button Actions.
            case "CreateNewInvoice":
                showCreateNewInvoiceDialog();
                break;
            // Delete Invoice Button Actions.
            case "DeleteInvoice":
                deleteInv();
                break;
            // Create New Line Button Actions.
            case "CreateNewLine":
                showCreateNewLineDialog();
                break;
            // Delete Line Button Actions.
            case "DeleteLine":
                deleteLine();
                break;

            // Invoices Table Dialog Actions.
            case "confirmCreateInvoice" :
                confirmCreateInvoice();
                break;
            case "cancelCreateInvoice" :
                cancelCreateInvoice();
                break;
            // End of Invoices Table Dialog Actions.

            // Invoices Items Dialog Actions.
            case "confirmCreateLine":
                confirmCreateLine();
                break;
            case "cancelCreateLine":
                cancelCreateLine();
                break;
            // End of Invoices Items Dialog Actions.
        }
    }

    // menuBar - Load File Menu Item Constructor.
    private void loadFile(){

        JOptionPane.showMessageDialog(this, "Please, Choose Invoices Table file path.", "Help - Selecting Tables", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser openFile = new JFileChooser();
        int result = openFile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File invoicesTableFile = openFile.getSelectedFile();
            try {
                BufferedReader invoicesTableBr = new BufferedReader(new FileReader (invoicesTableFile));
                String invoicesTableLines = null;
                while ((invoicesTableLines = invoicesTableBr.readLine()) != null) {
                    String [] invoicesTablesLinesSplit = invoicesTableLines.split(",");
                    String invoiceNumStr = invoicesTablesLinesSplit[0];
                    String invoiceDateStr = invoicesTablesLinesSplit[1];
                    String customerNameStr = invoicesTablesLinesSplit[2];
                    int invoiceNum = Integer.parseInt(invoiceNumStr);
                    Date invoiceDate = dateFt.parse(invoiceDateStr);
                    InvoicesTable invDetails = new InvoicesTable(invoiceNum, customerNameStr,invoiceDate);
                    invoicesArray.add(invDetails);
                }
                JOptionPane.showMessageDialog(this, "Please, Choose Invoices Items Table file path.", "Help - Selecting Tables", JOptionPane.INFORMATION_MESSAGE);
                result = openFile.showOpenDialog(this);
                if  (result == JFileChooser.APPROVE_OPTION) {
                    File invoicesItemsFile = openFile.getSelectedFile();
                    BufferedReader invoicesItemsBr = new BufferedReader(new FileReader(invoicesItemsFile));
                    String invoicesItemsLines = null;
                    while ((invoicesItemsLines = invoicesItemsBr.readLine()) != null) {
                        String [] invoicesItemsLinesSplit = invoicesItemsLines.split(",");
                        String invoiceNumStr = invoicesItemsLinesSplit[0];
                        String itemName = invoicesItemsLinesSplit[1];
                        String itemPriceStr = invoicesItemsLinesSplit[2];
                        String CountStr = invoicesItemsLinesSplit[3];
                        int invoiceNum = Integer.parseInt(invoiceNumStr);
                        int Count = Integer.parseInt(CountStr);
                        double itemPrice = Double.parseDouble(itemPriceStr);
                        InvoicesTable table = locateInvoiceByNum(invoiceNum);
                        InvoicesItems invItems = new InvoicesItems(itemName, itemPrice, Count, table);
                        table.getLines().add(invItems);
                    }
                    invoicesTableBr.close();
                    invoicesItemsBr.close();
                    invoicesTableTableModel = new InvoicesTableTableModel(invoicesArray);
                    invoicesTblTbl.setModel(invoicesTableTableModel);
                    invoicesTblTbl.validate();
                }
            } catch (Exception exlist) {
                JOptionPane.showMessageDialog(this, "Error:" + exlist.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    // menuBar - Save File Menu Item Constructor.
    private void saveFile(){
        String invoicesTableLines = "";
        String invoicesItemsLines = "";
        for (InvoicesTable table : invoicesArray) {
            invoicesTableLines += table.getFileAsExcel();
            invoicesTableLines += "\n";
            for (InvoicesItems item : table.getLines()) {
                invoicesItemsLines += item.getFileAsExcel();
                invoicesItemsLines += "\n";
            }
        }
        JOptionPane.showMessageDialog(this, "Please Select Your Invoices Table Save File Location!", "Help - Save File", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser saveJFileChooser = new JFileChooser();
        int saveFile = saveJFileChooser.showSaveDialog(this);
        if (saveFile == JFileChooser.APPROVE_OPTION) {
            File invoicesTableFile = saveJFileChooser.getSelectedFile();
            try {
                FileWriter invoicesTableFileWriter = new FileWriter(invoicesTableFile);
                invoicesTableFileWriter.write(invoicesTableLines);
                invoicesTableFileWriter.flush();
                invoicesTableFileWriter.close();
                JOptionPane.showMessageDialog(this, "Please Select Your Invoice Items Save File Location!", "Help - Save File", JOptionPane.INFORMATION_MESSAGE);
                saveFile = saveJFileChooser.showSaveDialog(this);
                if (saveFile == JFileChooser.APPROVE_OPTION) {
                    File invoicesItemsFile = saveJFileChooser.getSelectedFile();
                    FileWriter invoiceItemsFileWriter = new FileWriter(invoicesItemsFile);
                    invoiceItemsFileWriter.write(invoicesItemsLines);
                    invoiceItemsFileWriter.flush();
                    invoiceItemsFileWriter.close();
                    JOptionPane.showMessageDialog(this, "Your Data has been saved successfully!", "Data Saved", JOptionPane.INFORMATION_MESSAGE );
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }

    // Locating Invoice by Num.
    private InvoicesTable locateInvoiceByNum(int invNum){
        InvoicesTable table = null;
        for (InvoicesTable invoice : invoicesArray) {
            if (invNum == invoice.getInvNum()) {
                table = invoice;
                break;
            }
        }
        return table;
    }

    // Selecting Invoices Table Row.
    private void invoicesTableRowSelected() {
        int selectedRowIndex = invoicesTblTbl.getSelectedRow();
        if (selectedRowIndex >= 0) {
            InvoicesTable row = invoicesTableTableModel.getInvoicesTableArray().get(selectedRowIndex);
            customerNameTxtFld.setText(row.getCustomerName());
            invoiceDateTxtFld.setText(dateFt.format(row.getInvDate()));
            invoiceNumberLbl2.setText("" + row.getInvNum());
            InvoiceTotalLbl2.setText("" + row.getInvTotal());
            ArrayList<InvoicesItems> itemsLines = row.getLines();
            invoicesItemsTableModel = new InvoicesItemsTableModel(itemsLines);
            invoiceItemsTbl.setModel(invoicesItemsTableModel);
            invoicesItemsTableModel.fireTableDataChanged();
        }
    }

    // Printing "Selected" while choosing Invoices table line.
    @Override
    public void valueChanged(ListSelectionEvent e) {
        System.out.println("Selected");
        invoicesTableRowSelected();
    }

    // Shows Dialog once clicked on Create New Invoice Button.
    private void showCreateNewInvoiceDialog() {
        invoicesTblDialog = new InvoicesTableDialog(this);
        invoicesTblDialog.setVisible(true);
    }

    // Create New Invoice Dialog - (Ok Button) Constructor.
    private void confirmCreateInvoice() {
        String customerName = invoicesTblDialog.getCustomerNameField().getText();
        String invoiceDateStr = invoicesTblDialog.getInvoiceDateField().getText();
        invoicesTblDialog.setVisible(false);
        invoicesTblDialog.dispose();
        invoicesTblDialog = null;
        try {
            Date invoiceDate = dateFt.parse(invoiceDateStr);
            int invoiceNumber = getNextInvoiceNumber();
            InvoicesTable invoiceTable = new InvoicesTable(invoiceNumber, customerName, invoiceDate);
            invoicesArray.add(invoiceTable);
            invoicesTableTableModel.fireTableDataChanged();
        } catch (ParseException ex ) {
            ex.printStackTrace();
        }
    }

    // Invoice Table Dialog - Cancel create new Invoice Button Constructor.
    private void cancelCreateInvoice() {
        invoicesTblDialog.setVisible(false);
        invoicesTblDialog.dispose();
        invoicesTblDialog = null;
    }

    // Getter Method for getting next invoice Number for Invoices Table.
    private int getNextInvoiceNumber() {
        int maxinvoicesnumber = 0;
        for (InvoicesTable table : invoicesArray) {
            if (table.getInvNum() > maxinvoicesnumber) {
                maxinvoicesnumber = table.getInvNum();
            }
        }
        return maxinvoicesnumber + 1;
    }

    // JFrame - Delete Invoice Button Constructor.
    private void deleteInv() {
        int removeInv = invoicesTblTbl.getSelectedRow();
        InvoicesTable header = invoicesTableTableModel.getInvoicesTableArray().get(removeInv);
        invoicesTableTableModel.getInvoicesTableArray().remove(removeInv);
        invoicesTableTableModel.fireTableDataChanged();
        invoicesItemsTableModel = new InvoicesItemsTableModel(new ArrayList<InvoicesItems>());
        invoiceItemsTbl.setModel(invoicesItemsTableModel);
        invoicesItemsTableModel.fireTableDataChanged();
        customerNameTxtFld.setText("");
        invoiceDateTxtFld.setText("");
        invoiceNumberLbl2.setText("");
        InvoiceTotalLbl2.setText("");
    }

    // JFrame - Delete Line Button Constructor.
    private void deleteLine() {
        int removeLine = invoiceItemsTbl.getSelectedRow();
        InvoicesItems totalLine = invoicesItemsTableModel.getInvoicesItemsArray().get(removeLine);
        invoicesItemsTableModel.getInvoicesItemsArray().remove(removeLine);
        invoicesItemsTableModel.fireTableDataChanged();
        invoicesTableTableModel.fireTableDataChanged();
        InvoiceTotalLbl2.setText("" + totalLine.getInvoicesTableHeader().getInvTotal());
    }

    // Invoices Items Dialog - Visibility.
    private void showCreateNewLineDialog() {
        invoicesItemsDialog = new InvoicesItemsDialog(this);
        invoicesItemsDialog.setVisible(true);
    }

    //Invoices Items Table New Line Dialog - Ok Button Constructor.
    private void confirmCreateLine() {
        String itemName = invoicesItemsDialog.getItemNameJTextField().getText();
        String itemCountStr = invoicesItemsDialog.getItemCountJTextField().getText();
        String itemPriceStr = invoicesItemsDialog.getItemPriceJTextField().getText();
        invoicesItemsDialog.setVisible(false);
        invoicesItemsDialog.dispose();
        invoicesItemsDialog = null;
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        int tableIndex = invoicesTblTbl.getSelectedRow();
        InvoicesTable invoiceTable = invoicesTableTableModel.getInvoicesTableArray().get(tableIndex);
        InvoicesItems invoicesItems = new InvoicesItems(itemName, itemPrice, itemCount, invoiceTable);
        invoiceTable.addInvLine(invoicesItems);
        invoicesItemsTableModel.fireTableDataChanged();
        invoicesItemsTableModel.fireTableDataChanged();
        InvoiceTotalLbl2.setText("" + invoiceTable.getInvTotal());
    }

    // Invoices Items Table New Line Dialog - Cancel Button Constructor.
    private void cancelCreateLine() {
        invoicesItemsDialog.setVisible(false);
        invoicesItemsDialog.dispose();
        invoicesItemsDialog = null;
    }

}

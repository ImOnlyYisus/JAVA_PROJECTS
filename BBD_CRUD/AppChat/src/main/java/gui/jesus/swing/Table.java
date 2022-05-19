
package gui.jesus.swing;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value+"");
               
                return header;
            }
            
           
        });
        
        
    }
    
    public void addRow(Object[] row){
        DefaultTableModel model =(DefaultTableModel) getModel();
        model.addRow(row);
    }
    
    
}

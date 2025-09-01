import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Show {
	
	Show(ResultSet rs) {
		

        String[] columnNames = {"ID_NUM", "NAME", "DOB", "EMAIL", "PHONE", "DEPARTMENT", "SEX"};


        DefaultTableModel model = new DefaultTableModel(columnNames, 0);


        try {
        	boolean found = false;
			while (rs.next()) {
				
				found = true;
			    Object[] row = {
			        rs.getString("id_num"),
			        rs.getString("name"),
			        rs.getString("dob"),
			        rs.getString("email"),
			        rs.getString("phone"),
			        rs.getString("department"),
			        rs.getString("sex")
			    };
			    model.addRow(row);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}


        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);


        JFrame resultFrame = new JFrame("Search Result");
        resultFrame.setSize(800, 200);
        resultFrame.setLocationRelativeTo(null);
        resultFrame.add(scrollPane);
        
        
        resultFrame.setVisible(true);
		
	}

}

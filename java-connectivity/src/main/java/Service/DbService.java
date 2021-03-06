package Service;

import java.sql.*;

public class DbService {
    private final Connection connection;

    public DbService(Connection connection){
        this.connection = connection;
    }
    public int create(int empId,String empNm,dob,boolean isManager)throws SQLException {
        String sql = "insert into emp_info values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, empId);
        ps.setString(2, empNm);
        ps.setDate(3, dob);
        ps.setBoolean(4, isManager);

        int affected = ps.executeUpdate();
        return affected;
    }
    public int update() {
        return 0;
    }
    public int delete(){
    return 0;
    }
    public void find() throws SQLException{
        String sql ="select * from emp_info";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int id =rs.getInt("emp_id");
            String name =rs.getString("emp_name");
            Date dob =rs.getDate("dob");
            boolean isManager = rs.getBoolean("is_manager");

            System.out.println(id :+id + "name :"+ name +"dob :"+dob.toString() +"Manager : "+isManager);
            );

        }
    }
}





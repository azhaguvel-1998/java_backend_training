import Db.Connectivity;
import Service.DbService;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    try {
        Connectivity connectivity = new Connectivity();

        DbService service = new DbService(connectivity.getConnection());
//            int cnt = service.create(
//                    2,
//                    "pqr",
//                    7,
//                    "klm",
//                    Date.valueOf(LocalDate.now()),
//                    true
//            );
//            if(cnt > 0) {
//                System.out.println("Employee Created Successfully");
//            }

//            service.find();

        service.findEmployeeByName("abc");
//            service.findEmployeeByName("abc");

        service.txnDemo(60, "kol", Date.valueOf(LocalDate.now()), true, 100);

    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}

@@-18,7 +18,7 @@ public Connectivity() throws ClassNotFoundException, SQLException {
        "root",
        "password"
        );// it loads the driver into memory

        connection.setAutoCommit(false);
        System.out.println("---- Connected to MySQL Successfully ----");
        }
        }
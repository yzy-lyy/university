<%@ page import="java.sql.*" %>
<%
Connection conn = null;

        try {
            String userName = "root";
            String password = "admin";
            String url = "jdbc:mysql://localhost:3306/mysql";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "select * from user";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("record 1");
            }

            System.out.println("Database connection established");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Database connection terminated");
                } catch (Exception e) { /* ignore close errors */
                }
            }
        }
%>
<html>
test struts

<body>
test struts
</body>
</html>
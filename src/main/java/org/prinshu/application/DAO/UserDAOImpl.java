package org.prinshu.application.DAO;

import org.prinshu.application.Model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class UserDAOImpl implements UserDAO {

    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int create(String name, String password) {
        String query = "INSERT INTO users (user_name, password) VALUES (?,?)";
        int result = jdbcTemplate.update(query,name , password);
        return result;
    }

    @Override
    public int getUser(String userName) {
        String sql = "SELECT count(user_name) FROM users WHERE password='11'";
        int result = 0;
        return result;
    }

    @Override
    public List<AppUser> listAppUser() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id) {

    }

}

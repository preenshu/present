package org.prinshu.application.DAO;

import org.prinshu.application.Model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public interface UserDAO {

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */

    public void setDataSource(DataSource ds);

    public int create(String name, String password);

    public int getUser(String userName);

    public List<AppUser> listAppUser();

    public void delete(Integer id);

    public void update(Integer id);
}

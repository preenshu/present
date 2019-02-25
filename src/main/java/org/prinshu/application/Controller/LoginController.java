package org.prinshu.application.Controller;

import org.prinshu.application.DAO.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    public UserDAOImpl userDAO;

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping(value = "/present", method = RequestMethod.POST)
        public ModelAndView logIn(String userName, String password){

        ModelAndView modelAndView = new ModelAndView("homepage");
        try{
            if(userName != null && password != null && !userName.equals("") && !password.equals("")){
                int result = userDAO.create(userName,password);
                if(result>0){
                    System.out.println(userName);
                    return modelAndView;
                }
            }
        }catch (DataAccessException de){
            de.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return modelAndView;
    }

    public ModelAndView createNewUser(String userName, String password){
        return new ModelAndView();
    }
}

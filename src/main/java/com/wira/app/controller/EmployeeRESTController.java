package main.java.com.wira.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import main.java.com.wira.app.domain.*;

/**
 * Created by faisalw on 09/12/2015.
 */
@RestController
public class EmployeeRESTController {

    //@RequestMapping(value = "/employees")
    public EmployeeListVO getAllEmployees(){
        EmployeeListVO employees = new EmployeeListVO();

        EmployeeVO empOne = new EmployeeVO(1, "Amir", "Al-Tikriti", "amirti@sinhala.com");
        EmployeeVO empTwo = new EmployeeVO(1, "Sonos", "Al-Tikriti", "sonosti@sinhala.com");
        EmployeeVO empThree = new EmployeeVO(1, "Abu", "Al-Tikriti", "abuti@sinhala.com");

        employees.getEmployees().add(empOne);
        employees.getEmployees().add(empTwo);
        employees.getEmployees().add(empThree);

        return employees;
    }


    @RequestMapping(value = "/employees/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id)
    {
        if (id <= 3) {
            EmployeeVO employee = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/employees")
    public String getAllEmployeesJSON(Model model){
        model.addAttribute("employees", getAllEmployees());
        return "jsonTemplate";
    }

}

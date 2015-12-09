package main.java.com.wira.app.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by faisalw on 09/12/2015.
 */
@XmlRootElement(name="employees")
public class EmployeeListVO implements Serializable{

    private static final long serialVersionUID = 1L;

    private List<EmployeeVO> employees = new ArrayList<EmployeeVO>();

    public List<EmployeeVO> getEmployees(){
        return employees;
    }

    public void setEmployees(List<EmployeeVO> employees){
        this.employees = employees;
    }

}

package test;

import java.util.List;

import mx.com.softtek.academia.jpa.demo.dao.PruebasDAO;
import mx.com.softtek.academia.jpa.demo.model.Employee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/testApplicationContext.xml"})
public class EmployeeTest {

    @Autowired
    private PruebasDAO pruebasDAO;
    
    @Test
    public void obtieneEmpleados(){
        List<Employee> empleados = pruebasDAO.obtenerEmpleados();
        System.out.println("**********************INICIA******************************");
        for(Employee empleado: empleados){
            System.out.println("nombre: "+empleado.getFirstName()+" "+empleado.getLastName()+" empleo:"+empleado.getJob().getJobTitle());
        }
        System.out.println("**********************TERMINA******************************");
    
    }


}
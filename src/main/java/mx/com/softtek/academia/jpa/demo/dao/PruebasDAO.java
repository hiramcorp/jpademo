package mx.com.softtek.academia.jpa.demo.dao;
 
import java.util.List;
 
import org.springframework.dao.DataAccessException;

import mx.com.softtek.academia.jpa.demo.model.Employee;
  
public interface PruebasDAO {
    
    public List<Employee> obtenerEmpleados();
    
}

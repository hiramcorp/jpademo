package mx.com.softtek.academia.jpa.demo.dao;
 
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import mx.com.softtek.academia.jpa.demo.model.Employee;
 
 
@Repository
public class PruebasDAOImpl implements PruebasDAO {
     
    protected EntityManager entityManager;
     
    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public List<Employee> obtenerEmpleados(){
        Query query = getEntityManager().createQuery("select e from Employee e");
        List<Employee> resultList = query.getResultList();
        return resultList;
    }
 
    //@Transactional
    

}
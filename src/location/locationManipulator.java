package location;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class locationManipulator {
	
	EntityManagerFactory bridge;
	EntityManager operator;
	
	public locationManipulator() {
		bridge = Persistence.createEntityManagerFactory("persistence_unity");  //nome da unidade de persistencia 
		operator = bridge.createEntityManager();
		 }
	

	
	
	public void save(coordinates _coordinates) {
    operator.getTransaction().begin();
    operator.merge(_coordinates);
    operator.getTransaction().commit();
    bridge.close();
	}
	
	
	
	public void remove(coordinates  _coordinates) {
		operator.getTransaction().begin();
	    Query q = (Query) operator.createNamedQuery("delete coordinates from coordinates where nome =" + _coordinates);
	    operator.getTransaction().commit();
	    bridge.close();
	}
	
	   
}

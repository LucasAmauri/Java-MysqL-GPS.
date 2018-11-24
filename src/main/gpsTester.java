package main;

import location.coordinates;
import location.locationManipulator;

public class gpsTester {

	public static void main(String[] args) {
		
    coordinates local1;
    local1 = new coordinates();
    
    local1.setNomeLocal("Járagua do sul Park Shopping");
    local1.setLatitude(-26.479335);
    local1.setLongitude(-26.479335);
    
    locationManipulator operator;
    operator = new locationManipulator();
    
    operator.save(local1);
    
    
    
    //manutenção, apenas create e remove, tentarei implementar
    //distancia entre duas ordenadas.
   
	

	}

}

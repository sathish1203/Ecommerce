package portal.daos.modelDaos;

import org.hibernate.SessionFactory;

import com.portal.daos.daoClass;
import com.portal.models.Client;
import com.portal.models.Client;

import java.util.ArrayList;
import java.util.List;

public class userAccess extends daoClass{
   
	public userAccess(SessionFactory mySessionFactory) {
		super(mySessionFactory,Client.class);
		
		// TODO Auto-generated constructor stub
	}


	public List<Client> getUsers(){
		 List<Client> model = new ArrayList();
		 // Type cast the object to the model class
		for (Object start:getData()){
			model.add((Client)start);
		}
		return model;
	}
	
	public boolean addAnotherUser(Client u){
		return addUser(u);
		}
	
}

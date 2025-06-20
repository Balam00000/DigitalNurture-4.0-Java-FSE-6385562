package repository;

public class CustomerRepositoryImpl implements CustomerRepository{

    @Override
    public String findCustomerById(int id){
        if(id==1){
            return "Customer: JOHN";
        }
        else{
            return "Customer Not Found";
        }
    }
    
}

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    @Query("{ 'firstName' : ?#{?0} }")
    public Customer findName(String firstName);

    @Query("{ 'lastName' : ?0 }")
    public List<Customer> findLastName(String lastName);

}

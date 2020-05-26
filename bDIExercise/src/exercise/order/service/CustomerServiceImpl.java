package exercise.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import exercise.order.domain.Customer;
import exercise.order.repository.CustomerRepository;
import exercise.order.repository.CustomerRepositoryImpl;

//@Component("service")
@Service("service")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;
	// DI(autowrired)에 의해서 setter, 생성자 없이도 객체 생성


	@Override
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}


	@Override
	public void deleteCustomer(long id) {
		repository.delete(id);
	}
}

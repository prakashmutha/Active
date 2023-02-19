package placement;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class College_Service_Controller
{
	@Autowired(required=true)
	private College_Service service;
	@GetMapping("/collegeservice")
	public java.util.List<College> list()
	{
	return service.listAll();
	}
	@GetMapping("/collegeservice/{st_id}")
	public ResponseEntity<College> get(@PathVariable Integer clg_id)
	{
	try
	{
	College clg=service.get(clg_id);
	return new ResponseEntity<College>(clg,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
	return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
	}
	}
	@PostMapping("/collegeservice")
	public void add(@RequestBody College clg)
	{
	service.save(clg);
	}
	@PutMapping("/collegeservice/{clg_id}")
	public ResponseEntity<?> update(@RequestBody College clg, @PathVariable Integer clg_id)
	{
	College existstud=service.get(clg_id);
	service.save(existstud);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/collegeservice/{st_id}")
	public void delete(@PathVariable Integer clg_id)
	{
	service.delete(clg_id);
	}
}

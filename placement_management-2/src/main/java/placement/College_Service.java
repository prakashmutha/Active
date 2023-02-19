package placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class College_Service
{
	@Autowired
	private College_Service_Repository repo;
	public List<College> listAll()
	{
	return repo.findAll();
	}
	public void save(College clg)
	{
	repo.save(clg);
	}
	public College get(Integer clg_id)
	{
	return repo.findById(clg_id).get();
	}
	public void delete(Integer clg_id)
	{
	repo.deleteById(clg_id);
	}

}

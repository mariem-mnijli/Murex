package tn.stage.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.stage.spring.Iservice.IFIAdmin;
import tn.stage.spring.entity.FIAdmin;
import tn.stage.spring.repository.FIAdminRepository;

@Service 
@Slf4j
public class FIAdminService implements IFIAdmin{
	@Autowired
	FIAdminRepository fIAdminRepository;

	@Override
	public List<FIAdmin> retrieveAllFIAdmin() {
		return (List<FIAdmin>) fIAdminRepository.findAll();
	}

	@Override
	public FIAdmin addFIAdmin(FIAdmin f) {
		log.info("In method addFIAdmin");
		return fIAdminRepository.save(f);
	}

	@Override
	public void deleteFIAdmin(int id) {
		log.info("In method deleteFIAdmin");
		fIAdminRepository.deleteById(id);
		
	}

	@Override
	public FIAdmin updateFIAdmin(FIAdmin f) {
		log.info("In method updateFIAdmin");
		return fIAdminRepository.save(f);
	}

	@Override
	public FIAdmin retrieveFIAdmin(int id) {
		FIAdmin fIAdmin = fIAdminRepository.findById(id).orElse(null);
		return fIAdmin;
	}

}

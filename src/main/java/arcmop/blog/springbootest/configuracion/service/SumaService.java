package arcmop.blog.springbootest.configuracion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arcmop.blog.springbootest.configuracion.model.Suma;
import arcmop.blog.springbootest.configuracion.repository.SumaRepository;

@Service
public class SumaService {
	
	@Autowired
	private SumaRepository sumaRepo;

	public Suma save(Suma suma) {
		return sumaRepo.save(suma);
	}

}

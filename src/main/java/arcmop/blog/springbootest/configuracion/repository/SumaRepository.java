package arcmop.blog.springbootest.configuracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import arcmop.blog.springbootest.configuracion.model.Suma;

@Repository
public interface SumaRepository extends JpaRepository<Suma, Long> {

}

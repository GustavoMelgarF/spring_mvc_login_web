package gustavo.spring.practica3.login.repository;

import gustavo.spring.practica3.login.model.Role;
import gustavo.spring.practica3.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByRole(String role);

}
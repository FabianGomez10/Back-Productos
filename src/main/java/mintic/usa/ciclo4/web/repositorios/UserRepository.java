
package mintic.usa.ciclo4.web.repositorios;

import java.util.List;
import java.util.Optional;
import mintic.usa.ciclo4.web.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mintic.usa.ciclo4.web.repositorios.crud.UserCrudRepository;

/**
 *
 * @author grupo 5
 */
@Repository
public class UserRepository {
    /**
     * Instancia de la interfas UserCrudRepository
     */
    @Autowired
    private UserCrudRepository crud;
    
    /**
     * Metodo para buscar los usuarios
     * @return 
     */
    public List<User> getAll(){
        return (List<User>) crud.findAll();
    }
    
    /**
     * Metodo para buscar un usuario por id
     * @param idUser
     * @return 
     */
    public Optional<User> getUser(int idUser){
        return crud.findById(idUser);
    }
    
    /**
     * Metodo para guardar
     * @param user
     * @return 
     */
    public User save(User user){
        return crud.save(user);
    }
    
    /**
     * Metodo para buscar por email
     * @param email
     * @return 
     */
    public Optional<User> existe(String email){
        return crud.findByEmail(email);
    }
    
    /**
     * Metodo para buscar por email y password
     * @param email
     * @param password
     * @return 
     */
    public Optional<User> existeUser(String email, String password){
        return crud.findByEmailAndPassword(email, password);
    }
    
    /**
     * Metodo para buscar por nombre o email
     * @param name
     * @param email
     * @return 
     */
    public List<User> getUsersByNameOrEmail(String name, String email){
        return crud.findByNameOrEmail(name, email);
    }
    
    /**
     * Metodo para eliminar
     * @param idUser 
     */
    public void delete (Integer idUser){
        crud.deleteById(idUser);
    }
    
    /**
     * Metodo para filtrar por mes de cumpleaños
     * @param monthBirthtDay
     * @return 
     */
    public List<User> getUsersByMonthBirthtDay(String monthBirthtDay) {
        return crud.findByMonthBirthtDay(monthBirthtDay);
    }
}

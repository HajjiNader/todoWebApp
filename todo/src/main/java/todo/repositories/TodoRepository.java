package todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.model.Todo;

import java.util.List;


@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {


    @Override
    List<Todo> findAll();
}

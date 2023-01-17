package sp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sp.models.Author;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}

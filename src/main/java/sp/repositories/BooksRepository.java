package sp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sp.models.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}

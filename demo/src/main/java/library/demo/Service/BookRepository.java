package library.demo.Service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import library.demo.Entity.Book;

@Repository("BookRepository")
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {
    List<Book> findByBookName(@Param("name") String bookName);
}

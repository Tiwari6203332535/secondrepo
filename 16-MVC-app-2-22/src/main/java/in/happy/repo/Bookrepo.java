package in.happy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.happy.entity.Book;

public interface Bookrepo extends JpaRepository<Book, Integer> {

}

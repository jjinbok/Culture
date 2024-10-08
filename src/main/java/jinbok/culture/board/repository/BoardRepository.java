package jinbok.culture.board.repository;

import jinbok.culture.board.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}

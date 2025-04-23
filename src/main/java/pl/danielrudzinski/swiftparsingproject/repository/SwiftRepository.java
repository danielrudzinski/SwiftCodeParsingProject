package pl.danielrudzinski.swiftparsingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.danielrudzinski.swiftparsingproject.model.Swift;

public interface SwiftRepository extends JpaRepository<Swift, Integer> {
}

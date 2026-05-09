package com.elhackarz.fehu2026.repositories;

import com.elhackarz.fehu2026.models.Exams;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExamsRepo extends JpaRepository<Exams, Long> {
    List<Exams> findBySubjectId(Long subjectId);
}

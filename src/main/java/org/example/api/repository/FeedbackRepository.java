package org.example.api.repository;

import org.example.api.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}

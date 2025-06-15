package com.example.devmail_ai.Repositries;

import com.example.devmail_ai.Entities.CommitSummaryRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummaryRequestRepository extends JpaRepository<CommitSummaryRequest , Long> {
}

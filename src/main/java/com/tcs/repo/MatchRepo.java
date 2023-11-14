package com.tcs.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.domain.Match;

public interface MatchRepo  extends JpaRepository<Match, Integer>{
    Optional<Match> findByTeamHeading(String teamHeading);
}

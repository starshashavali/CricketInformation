package com.tcs.service;

import java.util.List;

import com.tcs.domain.Match;

public interface ICricketService {
	// get live maches
	List<Match> getLiveMatchScores();

	// world cup matches
	List<List<String>> getCWC2023PointTable();

//getAll matches
	List<Match> getAllMatches();
}

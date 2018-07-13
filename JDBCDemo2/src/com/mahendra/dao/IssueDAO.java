package com.mahendra.dao;

import java.util.List;

import com.mahendra.models.Issue;

public interface IssueDAO {
	void save(Issue issue);
	Issue findById(int issueId);
	List<Issue> getAll();
}

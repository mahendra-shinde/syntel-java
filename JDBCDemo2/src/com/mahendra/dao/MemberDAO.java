package com.mahendra.dao;

import java.util.List;

import com.mahendra.models.Member;

public interface MemberDAO {
	void save(Member member);
	Member findById(int memberId);
	List<Member> getAll();
}

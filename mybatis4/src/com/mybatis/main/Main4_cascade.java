package com.mybatis.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.PostMapper;
import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.AuthorMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.Post;
import com.mybatis.po.Author;
import com.mybatis.util.SqlSessionFactoryUtil;

public class Main4_cascade {
	static UserMapper userMapper;
	static RoleMapper roleMapper;
	static AuthorMapper authorMapper;
	static PostMapper postMapper;
	
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.openSqlSession();
		userMapper = session.getMapper(UserMapper.class);
		roleMapper = session.getMapper(RoleMapper.class);
		authorMapper = session.getMapper(AuthorMapper.class);
		postMapper = session.getMapper(PostMapper.class);
		
//		testFindAuthorById(2);
//		testFindPostById(2);  // һ��һ������ѯ 
//		testFindPostlistByAuthorId(2);
		testFindAuthorById(2);
		session.commit(); // ǧ��Ҫ�����ύ sql ִ��.
		System.out.println("bingo.");
	}
	static void testFindAuthorById(int authorId) { // һ�Զ༶����ѯ (collection)
		Author author = authorMapper.findAuthorById(authorId);
		System.out.println(authorId);
	}
	static void testFindPostlistByAuthorId(int authorId) {
		List<Post> list = postMapper.findPostlistByAuthorId(authorId);
		for(Post p: list)
			System.out.println(p);
	}
	static void testFindPostById(int id) { // һ��һ ������ѯ(association)
		Post post = postMapper.findPostById(id);
		System.out.println(post);
	}
}

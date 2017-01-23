package com.mybatis.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.mapper.PostMapper;
import com.mybatis.mapper.RoleMapper;
import com.mybatis.mapper.AuthorMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.po.Post;
import com.mybatis.util.SqlSessionFactoryUtil;
import com.mybatis.vo.AuthorVO;
import com.mybatis.vo.PostVO;

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
		
//		testFindPostlistByAuthorId(2); // bingo.
//		testFindAuthorVOByAuthorId(2); // bingo.
		testFindPostVOByPostId(3);  // bingo.
		session.commit(); // ǧ��Ҫ�����ύ sql ִ��.
		System.out.println("bingo.");
	}
	// ͨ�� authorId ��ѯ AuthorVO��������ѯ�����Ӧ��Post��
	static void testFindAuthorVOByAuthorId(int authorId) { // һ�Զ༶����ѯ (collection)
		AuthorVO authorVO = authorMapper.findAuthorVOById(authorId);
		System.out.println(authorVO);
	}
	// ͨ�� authorId ��ѯ ���ڸ�authorId ��post list
	static void testFindPostlistByAuthorId(int authorId) { // ͨ��authorId ���� post �б�
		List<Post> list = postMapper.findPostlistByAuthorId(authorId);
		for(Post p: list)
			System.out.println(p);
	}
	// 
	static void testFindPostVOByPostId(int id) { // һ��һ ������ѯ(association)
		PostVO postVO = postMapper.findPostVOByPostId(id);
		System.out.println(postVO);
	}
}

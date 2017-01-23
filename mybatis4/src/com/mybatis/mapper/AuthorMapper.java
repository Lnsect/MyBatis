package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.mybatis.po.Author;
import com.mybatis.vo.AuthorVO;

public interface AuthorMapper {
	AuthorVO findAuthorVOById(@Param("authorId")int authorId); // һ�Զ�� colletion ���� query
	Author findAuthorById(@Param("authorId")int authorId); // ������ѯ��Author��Ϣ  ��������ѯ post
}

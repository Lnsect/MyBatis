package com.mybatis.vo;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.mybatis.po.Author;

//PostVO �� Post��Ӧ�� view object ���󣨱��ֲ����)
@Alias("PostVO") // �Զ������
public class PostVO implements Serializable {
	private static final long serialVersionUID = 2501941095335053627L;
	private int id;
	private String name;
	private String content;
	private Author author;
	
	// �����ṩһ���޲����Ĺ��캯�� �� Author �� getter �� setter ����
	// ��ʵ�ּ�����ѯ.
	public PostVO() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", content=" + content + ", author=" + author + "]";
	}
}

package com.mybatis.po;

import org.apache.ibatis.type.Alias;

@Alias("Post") // �Զ������
public class Post {
	private int id;
	private String name;
	private String content;
	private Author author;
	
	// �����ṩһ���޲����Ĺ��캯�� �� Author �� getter �� setter ����
	// ��ʵ�ּ�����ѯ.
	public Post() {}
	
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

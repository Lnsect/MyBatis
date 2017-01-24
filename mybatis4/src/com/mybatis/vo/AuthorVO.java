package com.mybatis.vo;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import com.mybatis.po.Post;

// AuthorVO �� Author ��Ӧ�� view object ���󣨱��ֲ����
@Alias("AuthorVO") // �Զ������
public class AuthorVO implements Serializable {
	private static final long serialVersionUID = 4437442994703181274L;
	private int id;
	private String name;
	private List<Post> postlist;
	
	// �����ṩһ���޲����Ĺ��캯��
	public AuthorVO() {}
	
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

	public List<Post> getPostlist() {
		return postlist;
	}

	public void setPostlist(List<Post> postlist) {
		this.postlist = postlist;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", postlist=" + postlist + "]";
	}
}

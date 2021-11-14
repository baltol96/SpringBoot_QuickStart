package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Entity
@Table(name = "BOARD")
public class Board{
	@Id
	@GeneratedValue
	private Long seq;
	private String title;
	private String write;
	private String content;
	private Date createDate;
	private Long cng;
	
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getCng() {
		return cng;
	}
	public void setCng(Long cng) {
		this.cng = cng;
	}
	
	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", write=" + write + ", content=" + content + ", createDate="
				+ createDate + ", cng=" + cng + "]";
	}
	
}

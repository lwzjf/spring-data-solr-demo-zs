package com.spring.data.solr.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import com.spring.data.solr.common.field.SearchableArticleDefinition;

@SolrDocument(solrCoreName = "article")
public class ArticleDocument implements SearchableArticleDefinition{
	
	private @Id @Indexed String articleId;
	
	private @Indexed(TITLE_FIELD_NAME) String title;
	
	private @Indexed(SUMMARY_FIELD_NAME) String summary;
	
	private @Indexed(CREATETIME_FIELD_NAME) String createTime;
	
	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}

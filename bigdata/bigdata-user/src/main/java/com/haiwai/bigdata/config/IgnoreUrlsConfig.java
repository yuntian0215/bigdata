package com.haiwai.bigdata.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>用于配置不需要保护的资源路径</p>
 * 2020年4月28日下午2:34:55
 * @author lvjie
 */
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {
	private List<String> urls = new ArrayList<>();

	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}
	
}

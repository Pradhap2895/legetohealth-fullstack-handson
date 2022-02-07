package com.legatohealth.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatSourceBean {

//	@Value("${datasource_uri}")
//	private String uri;

	@Value("${spring.datasource.username}")
	private String username;

//	public String getUri() {
//		return uri;
//	}

	public String getUsername() {
		return username;
	}

	/*
	 * @Bean public DataSource datasource() { return (DataSource)
	 * DataSourceBuilder.create().driverClassName("com.mysql.cj.jdbc.Driver")
	 * .url("mysql://localhost:3306/legato_db").username("root").password("root").
	 * build(); }
	 */
}

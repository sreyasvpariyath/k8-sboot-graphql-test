package com.sreyasvpariyath.graphql;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
@RefreshScope
public class Query implements GraphQLQueryResolver {

	@Value("${graphql.test}")
	private String graphql_test;

	public String info() {
		return graphql_test;
	}

}

package com.hist.js.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author quaint
 * @ClassName cn.saytime.Swgger2
 * @Description swagger2 配置类
 * @date 2017-07-10 22:12:31
 */
@Configuration
public class Swagger2 {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.hist.js.spi"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("springboot利用swagger构建api文档")//大标题
				.description("BookStore Platform's REST API, all the applications could access the Object model data via JSON.")//详细描述
				.version("1.0")//版本
				.contact(new Contact("quaint", "/user?id=1", "857776215@qq.com"))//作者 中间填写这个接口实现的界面 这里暂时用/user代替
//				.license("The Apache License, Version 1.0")//许可证信息
//				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")//许可证地址
				.build();
	}
}
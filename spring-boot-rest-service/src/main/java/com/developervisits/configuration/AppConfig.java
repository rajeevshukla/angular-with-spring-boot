package com.developervisits.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.List;
import java.util.Locale;

@Configuration
public class AppConfig implements WebMvcConfigurer {


  //to configure content negotiation
  @Override
  public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		 super.configureContentNegotiation(configurer);
  }

  // to add xml related support. You will have to provide 3rd party marshaler unmarshaller..
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		super.configureMessageConverters(converters);
  }


  /**
   * Be careful about the method name it should not be getter or setting just localResolver
   * */
  @Bean
  public LocaleResolver localResolver() {
    /*SessionLocaleResolver localeResolver = new SessionLocaleResolver();*/
    AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
    localeResolver.setDefaultLocale(Locale.US);
    return localeResolver;
  }


  /*Be careful about the method name it should be messageSource incase you want to load
  local message.properties*/
  @Bean
  public ResourceBundleMessageSource messageSource() {
    ResourceBundleMessageSource source = new ResourceBundleMessageSource();
    source.setBasename("message");
    return source;
  }




}

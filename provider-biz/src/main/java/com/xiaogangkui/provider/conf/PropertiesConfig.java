package com.xiaogangkui.provider.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Created by luchunyu
 */
@Configuration
@PropertySource(value ={"classpath:dubbo.properties","classpath:kafka.properties"})
@ImportResource("classpath:dubbo/*.xml")
public class PropertiesConfig {

}

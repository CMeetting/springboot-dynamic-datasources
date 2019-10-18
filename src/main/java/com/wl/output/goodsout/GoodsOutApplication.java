package com.wl.output.goodsout;

import com.wl.output.goodsout.config.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@Import(DynamicDataSourceRegister.class)
@EnableTransactionManagement(order = 2)
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class GoodsOutApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsOutApplication.class, args);
    }
}

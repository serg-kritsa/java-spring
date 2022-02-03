package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.context.annotation.*;

@Configuration
public class DemoConfig {

    @Bean
    // FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
    //                               @Value("${guru.password}") String password,
    //                               @Value("${guru.jdbcurl}") String jdbcurl){
    // no @Value in bean constructor for binding
    // no @Value in bean constructor for binding
    // no @Value in bean constructor for binding
    FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfiguration.getUsername());
        fakeDataSource.setPassword(sfgConfiguration.getPassword());
        fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
        return fakeDataSource;
    }

}

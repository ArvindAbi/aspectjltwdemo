package com.example.aspectjlib;

import com.example.TestModel1;
import com.example.TestModel2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
@EnableLoadTimeWeaving
public class AspectjlibApplication {

  public static void main(String[] args) {
    try (ConfigurableApplicationContext context = SpringApplication.run(AspectjlibApplication.class, args)) {
      TestModel1 tm1 = new TestModel1();
      tm1.setField1("one");
      tm1.setField2(2);
      tm1.setField3(true);
      tm1.setField4(4.44D);

      TestModel2 tm2 = new TestModel2();
      tm2.setField1("one");
      tm2.setField2(2);
      tm2.setField3(true);
      tm2.setField4(4.44D);
    }
  }

}

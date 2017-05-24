package com.liuchao.springboot.yamltest;

import java.io.InputStream;
import java.util.Map;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

public class YamlTest {

    @Test
    public void testOne() {
        // 初始化Yaml解析器
        Yaml yaml = new Yaml();
        // InputStream is =
        // YamlTest.class.getClassLoader().getResourceAsStream("yaml/test1.yaml");
        // InputStream is =
        // ClassLoader.getSystemResourceAsStream("yaml/test1.yaml");
        // InputStream is =
        // YamlTest.class.getResourceAsStream("../../../../yaml/test1.yaml");
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("yaml/test1.yaml");
        Object result = yaml.load(is);
        System.out.println(result.getClass());
        System.out.println(result);
    }

    @Test
    public void testTwo() {
        Yaml yaml = new Yaml();
        InputStream is = ClassLoader.getSystemResourceAsStream("yaml/test2.yaml");
        Iterable<Object> result = yaml.loadAll(is);
        for (Object obj : result) {
            System.out.println(obj.getClass());
            System.out.println(obj);
        }
    }

    @Test
    public void testThree() {
        Yaml yaml = new Yaml();
        InputStream is = ClassLoader.getSystemResourceAsStream("yaml/test3.yaml");
        Map result = (Map) yaml.load(is);
        System.out.println(result);
        System.out.println(result.get("pojo").getClass());
        System.out.println(result.get("pojo-other"));
    }

    @Test
    public void testFour() {
        Yaml yaml = new Yaml();
        Pojo p = new Pojo();
        p.setName("world");
        System.out.println(yaml.dump(p));
    }
    
    @Test
    public void testParseMeYaml() {
        System.out.println("================================");
        Yaml yaml = new Yaml();
        Me me = yaml.loadAs(ClassLoader.getSystemResourceAsStream("yaml/test4.yaml"), Me.class);
        System.out.println(me);
    }
}

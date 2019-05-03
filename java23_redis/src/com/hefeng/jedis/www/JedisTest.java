package com.hefeng.www;

import com.hefeng.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
* jedis测试类
* */
public class JedisTest {

        /*
        * 快速入门
        * */
        @Test
        public void test1() {
            // 1. 获取连接
            //Jedis jedis = new Jedis();  //  默认值为host: localhost, port: 6379
            Jedis jedis = new Jedis("localhost", 6379);
            // 2. 操作
            jedis.set("username", "zhangsan");

            //  获取
            String username = jedis.get("username");
            System.out.println(username);

            // 可以使用setex() 方法存储可以指定过期时间的  key value
            jedis.setex("activecode", 20, "hehe"); // 将activecode: hehe键值对存入redis,并在20s后删除该键值对
            // 3. 关闭连接
            jedis.close();
        }

        /*
        * hash的操作
        * */
    @Test
    public void test2() {
        // 1. 获取连接
        //Jedis jedis = new Jedis();  //  默认值为host: localhost, port: 6379
        Jedis jedis = new Jedis("localhost", 6379);
        // 2. 操作
        // 存储hash
        jedis.hset("user", "name", "lisi");
        jedis.hset("user", "age", "23");
        jedis.hset("user","gender","male");


        // 获取hash

        String name = jedis.hget("user", "name");
        System.out.println(name);


        // 获取hash的所有map中的数据

        Map<String, String> user = jedis.hgetAll("user");

        // keyset
        Set<String> keySet = user.keySet();
        for (String key: keySet) {
            // 获取value
            String value = user.get(key);

            System.out.println(key + ":" + value);
        }

        // 3. 关闭连接
        jedis.close();
    }


    @Test
    public void test3() {
        // 1. 获取连接
        Jedis jedis = new Jedis();  //  默认值为host: localhost, port: 6379

        // 2. 操作
        // list 存储

        // c b a a b c
        jedis.lpush("mylist", "a", "b", "c");  // 左边存
        jedis.rpush("mylist", "a", "b", "c");  // 右边存

        // list 获取范围
        List<String> mylist = jedis.lrange("mylist", 0, -1);

        System.out.println(mylist);

        // list 弹出
        String element1 = jedis.lpop("mylist");
        System.out.println(element1);

        String element2 = jedis.rpop("mylist");
        System.out.println(element2);

        List<String> mylist2 = jedis.lrange("mylist", 0, -1);

        System.out.println(mylist2);
        // 3. 关闭连接
        jedis.close();
    }

    @Test
    public void test4() {
        // 1. 获取连接
        Jedis jedis = new Jedis();  //  默认值为host: localhost, port: 6379

        // set 存储
        jedis.sadd("myset", "java", "php", "C++");


        // set 获取
        Set<String> myset = jedis.smembers("myset");

        System.out.println(myset);
        // 3. 关闭连接
        jedis.close();
    }

/*
* sortedset
* */
    @Test
    public void test5() {
        // 1. 获取连接
        Jedis jedis = new Jedis();  //  默认值为host: localhost, port: 6379

        // 2. 操作
        // sortedset  // 存储
        jedis.zadd("mysortedset", 3, "亚瑟");
        jedis.zadd("mysortedset", 30, "后羿");
        jedis.zadd("mysortedset", 25, "孙悟空");


        // sortedset 获取
        Set<String> mysortedset =  jedis.zrange("mysortedset", 0, -1); // -1 获取所有

        System.out.println(mysortedset);  // 按分数从小到大排序
        // 3. 关闭连接
        jedis.close();
    }

    /*
    * jedis 连接池使用
    * */
    @Test
    public void test7() {

        // 0. 创建一个配置对象
       JedisPoolConfig config = new JedisPoolConfig();
       config.setMaxTotal(50);
       config.setMaxIdle(10);
        // 1.创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);

        // 2.获取连接
        Jedis jedis = jedisPool.getResource();
        // 3. 使用
        jedis.set("hehe", "heihei");
        // 4. 关闭 归还到连接池中
        jedis.close();
    }

    /*
    * jedis连接池工具类的使用
    * */
    @Test
    public void test8() {

        // 通过连接池工具类获取
        Jedis jedis = JedisPoolUtils.getJedis();
        // 3. 使用
        jedis.set("hello", "world");
        // 4. 关闭 归还到连接池中
        jedis.close();
    }
}

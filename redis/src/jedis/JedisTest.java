package jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {

    @Test
    public void test1(){
        Jedis jedis = new Jedis("localhost",6379);
        System.out.println(jedis.ping());
        /*jedis.set("age","18");
        System.out.println(jedis.get("name"));*/
        jedis.close();
    }
}









package MyQueue;

import java.io.IOException;
import java.net.UnknownHostException;

public class ConsumeClient {
        public static void main(String[] args) throws UnknownHostException, IOException {
        	Fans fans1 = new Fans("小明");
        	fans1.subscribe("丽影");
            MqClient mq=new MqClient();
            String mes=mq.consume(fans1.getName());
            System.out.println("获取的消息为："+mes);
        }
}
package MyQueue;

import java.io.IOException;

public class ProduceClient {
        public static void main(String[] args) throws IOException {
        	 Fans fans1 = new Fans("小明");
             Fans fans2 = new Fans("小话");
             Fans fans3 = new Fans("小张");
             Fans fans4 = new Fans("小里");
             Star star1 = new Star("丽影");
             Star star2 = new Star("幂幂");
             fans1.subscribe("丽影");
             fans3.subscribe("幂幂");
             fans4.subscribe("幂幂");
             star1.movelUp("乘风破浪");
             star2.movelUp("孤岛惊魂");
             System.out.println("----------------------------");
             fans2.subscribe("丽影");
             star1.movelUp("女儿国");
            MqClient client=new MqClient();
            client.produce("乘风破浪",star1);
        }
}
# SpringBoot 集成 Redisson 实现延迟队列

## 使用场景
1、下单成功，30分钟未支付。支付超时，自动取消订单

2、订单签收，签收后7天未进行评价。订单超时未评价，系统默认好评

3、下单成功，商家5分钟未接单，订单取消

4、配送超时，推送短信提醒

......

对于延时比较长的场景、实时性不高的场景，我们可以采用任务调度的方式定时轮询处理。如：xxl-job

此次方案是采用一种比较简单、轻量级的方式，使用 Redis 的延迟队列来进行处理。当然有更好的解决方案，可根据公司的技术选型和业务体系选择最优方案。如：使用消息中间件Kafka、RabbitMQ 的延迟队列

## 毫秒级消费
单机消息量十万、甚至百万级，只要消费能力足够，不产生消息堆积，几乎是零延迟、毫秒级消费

## 模拟测试结果

![image-20240113140147272](C:\Users\石头\AppData\Roaming\Typora\typora-user-images\image-20240113140147272.png)

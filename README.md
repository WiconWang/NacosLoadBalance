# NacosLoadBalanceDemo
Nacos做生产者负载均衡的基础代码演示， 此Demo只做演示使用，未考虑完整，请用于生产环境时合理调整。

## 各模块

1. common : FeignClient 提供的接口，这个接口提供给消费者订阅，注意与生产者结构一致。
2. user-consumer: 消费者，用户真实访问的位置。
3. user-provider：生产者，做负载的区域

## provider 模块和负载

1. 此provider可以有多个，内容完全一致，这里使用 user-provider 和 user-provider-copy ，他两个唯一的区别是端口不一样。
2. 同一个provider，向Nacos注册时，name需要相同
3. 此Demo为了看得更清楚，这里复制成了user-provider-copy，并用了不同端口，并且在显示的文案上做了点修改。
4. 当然你也可以用一个模块，生成jar包后，在不同IP中启动，效果是一样的。

## 演示。

访问   user-consumer 包所在的地址：`http://localhost:8081/user/list`
并不断刷新，可以看到结果在 `user-provider-copy`和 `user-provider` 中轮换。

 
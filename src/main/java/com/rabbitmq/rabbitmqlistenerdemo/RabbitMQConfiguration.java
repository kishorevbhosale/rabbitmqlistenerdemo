package com.rabbitmq.rabbitmqlistenerdemo;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

    @Bean
    Queue exmapleQueue(){
        return new Queue("ExampleQueue", false);
    }

    @Bean
    Queue example2Queue(){
        return QueueBuilder.durable("Example2Queue")
                .autoDelete()
                .exclusive()
                .build();
    }
}


package com.utunan.redis.sharedPool;

import redis.clients.jedis.JedisCommands;


public interface ShardedPoolSource<T extends JedisCommands> {
    T getRedisClient();

    void returnResource(T shardedJedis, boolean broken);
}

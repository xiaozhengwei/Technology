

```
nohup sh bin/mqnamesrv >namesrv.out &
tail -f ~/logs/rocketmqlogs/namesrv.log
```

```
nohup sh ./bin/mqbroker -c ./conf/broker.conf >broker.out &
tail -f ~/logs/rocketmqlogs/broker.log 
```


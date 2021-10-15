

```
nohup sh bin/mqnamesrv >mqnamesrv.out &
tail -f mqnamesrv.out
```

```
nohup sh ./bin/mqbroker -c ./conf/broker.conf >mqbroker.out &
tail -f mqbroker.out
```


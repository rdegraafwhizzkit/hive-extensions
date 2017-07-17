# Hive UDF Examples

## Compile

```
mvn compile -DproxySet=true -DsocksProxyHost=localhost -DsocksProxyPort=6666
```

## Test

```
mvn test -DproxySet=true -DsocksProxyHost=localhost -DsocksProxyPort=6666
```

## Build
```
mvn clean package -DproxySet=true -DsocksProxyHost=localhost -DsocksProxyPort=6666
```

## Run

```
%> hive
hive> add jar /Users/rutger/Code/hive-extensions/target/nl.whizzkit.hive-extensions-1.0.jar;
Added [/Users/rutger/Code/hive-extensions/target/nl.whizzkit.hive-extensions-1.0.jar] to class path
Added resources: [/Users/rutger/Code/hive-extensions/target/nl.whizzkit.hive-extensions-1.0.jar]
hive> create temporary function md5 as 'nl.whizzkit.hive.extensions.MD5';
OK
Time taken: 1.05 seconds
hive> select md5('WhizzkIT');
OK
5e1f64088b0eec5c30ef1cf9e741b8e7
Time taken: 0.732 seconds, Fetched: 1 row(s)

```

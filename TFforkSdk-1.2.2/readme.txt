配置

导入Config地址
import com.emodfork.core.Config;

 // 配置SDK,填写RPC信息
Config.setUsername("test");
Config.setPassword("test");
Config.setIp("127.0.0.1");
Config.setPort(16001);


注意！！！！！
将文件 StartServer.bat 放入钱包文件夹的根目录，以管理员权限执行！！
更多详情请进入demo工程


在 StartServer.bat 中可设置端口号与RPC服务的账户与密码
对应
-------------------------------------------------------
|    bat文件中的设置  |    程序中的设置                    |
-------------------------------------------------------
| rpcuser           |  Config.setUsername("test");    |
| rpcpassword       |  Config.setPassword("test");    |
| rpcport           |   Config.setPort(16001);        |
-------------------------------------------------------

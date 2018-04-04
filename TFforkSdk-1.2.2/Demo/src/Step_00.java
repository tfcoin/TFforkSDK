import com.emodfork.api.WalletPacking;
import com.emodfork.core.Client;
import com.emodfork.core.Config;

import java.util.ArrayList;
import java.util.List;

public class Step_00 {

    /**
     * 此处做一些准备工作，非常重要！！！！
     * @param args
     */
    public static void main(String[] args) {

        // 此处的配置信息是连接TFC进程的RPC参数
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);


        /**
         * 想要执行后续操作，需要先建立钱包，此处使用独立的TFC进程，所以此处的钱包与图形客户端的钱包是分离的
         * 反回的数据为现有钱包的列表
         */
        // 创建钱包 （输入钱包名，密码）
        // 一般创建一次钱包，不需要多次创建
        String walletList= WalletPacking.createWallet("emodtfc","qwertyuiop");
        System.out.println(walletList);


        /**
         * 钱包与账户的关系为
         *
         * 钱包 1：
         *      账户1：(账户名)(账户转账的哈希地址等等)
         *      账户2：(账户名)(账户转账的哈希地址等等)
         *      账户3：(账户名)(账户转账的哈希地址等等)
         *      。。。
         * 钱包 2：
         *      账户1：(账户名)(账户转账的哈希地址等等)
         *      账户2：(账户名)(账户转账的哈希地址等等)
         *      账户3：(账户名)(账户转账的哈希地址等等)
         *      。。。
         *
         * 全网中（这个区块链网络中）账户名是不会重复的
         * 钱包中每个账户都有自己的私钥
         *
         */
    }
}

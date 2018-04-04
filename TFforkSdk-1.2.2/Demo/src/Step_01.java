import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;

public class Step_01 {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        // 在指定钱包中的创建账户
        // 输入钱包名，钱包密码，与要创建的账户名
        // 这里创建5个账户，后续做演示使用
        // 创建账户返回的结果为账户的公钥
        WalletPacking.createAccount("emodtfc","qwertyuiop","account-demo-1");
        WalletPacking.createAccount("emodtfc","qwertyuiop","account-demo-2");
        WalletPacking.createAccount("emodtfc","qwertyuiop","account-demo-3");
        WalletPacking.createAccount("emodtfc","qwertyuiop","account-demo-4");
        WalletPacking.createAccount("emodtfc","qwertyuiop","account-demo-6");
        String publicKey = WalletPacking.createAccount("emodtfc","qwertyuiop","account-demo-7");
        System.out.println(publicKey);



    }
}

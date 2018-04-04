import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;

public class Step_03 {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        // 查询指定地址的余额信息
        String info = WalletPacking.selectBalancesByAddress("0xea95f584c2469d4eab43319cf5c82a82f79c8df7");
        System.out.println(info);

    }
}

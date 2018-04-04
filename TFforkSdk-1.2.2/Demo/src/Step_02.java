import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;

public class Step_02 {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);
        
        // 查询指定账户的地址
        // 此处账户"account-demo-1" 可查得地址为   0xea95f584c2469d4eab43319cf5c82a82f79c8df7  通过该地址可做后续转账等操作使用
        String address= WalletPacking.getAccountPublicAddress("emodtfc", "account-demo-1");
        System.out.println(address);

    }
}

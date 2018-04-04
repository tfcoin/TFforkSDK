import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;

public class Step_06 {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        // 查询指定块中的交易信息
        String blockTransList = WalletPacking.getBlockTransactionsListInfo("246874");
        System.out.println(blockTransList);
    }
}

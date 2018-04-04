import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;
import com.emodfork.entity.TblBcTransaction;
import com.emodfork.tools.WalletInfoParseUtil;

import java.util.List;

public class Util_Address_Validity {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        /**
         * 检验地址是否合法可用
         *
         */
        boolean isRight = WalletPacking.checkAddressValidity("0xddbd2b932c763ba5b1b7ae3b362eac3e8d40121a");
        System.out.println("原始信息 ：" + isRight);
    }
}

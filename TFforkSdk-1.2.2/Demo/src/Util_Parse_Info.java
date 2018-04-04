import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;
import com.emodfork.entity.TblBcTransaction;
import com.emodfork.tools.WalletInfoParseUtil;

import java.util.List;

public class Util_Parse_Info {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        /**
         * 转换工具将原始的数据 转换为简单的数据
         * ！！！可能会没有原始返回信息中的数据
         */
        String info = WalletPacking.getTransactionsInfo("7b870eafb6e2437d5b7b66d2bfbc81e5bce808f0");
        System.out.println("原始信息 ："+info);

        // 转换为JSON形式的信息
        String res = WalletInfoParseUtil.ParseInfoToJson(info);
        System.out.println("转换为JSON : "+res);

        // 转换为TblBcTransaction对象的信息
        List<TblBcTransaction> infoList = WalletInfoParseUtil.ParseInfoToObj(info);
        System.out.println("转换为JAVA对象："+ infoList.toString());


    }
}

import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;

public class Step_05 {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        /**
         * 通过查询返回的处理过的信息
         * 通过块高可判断交易是否成功，块高为 0 交易失败，块高为一个 大于0  的数字，则交易成功
         */
        // 输入交易的 Record_id ，Record_id 通过 Step_04 步骤得来
        // 通过该接口返回的数据，可得知交易金额，与双方地址
        String moreInfo = "";
        try {
            moreInfo = WalletPacking.getTransactionsMoreInfo("7b870eafb6e2437d5b7b66d2bfbc81e5bce808f0");
            System.out.println(moreInfo);
        } catch (Exception e) {
            // 查询交易不存在或未上链时发生异常
            e.printStackTrace();
        }










        /**
         * 通过查询返回的原始交易数据
         */
//        // 输入交易的 Record_id ，Record_id 通过 Step_04 步骤得来
//        //通过该接口返回的JSON格式数据中包含的  block_num  字段的数值不为 0 可以判断该笔交易已成功
//        String info = WalletPacking.getTransactionsInfo("7b870eafb6e2437d5b7b66d2bfbc81e5bce808f0");
//        System.out.println(info);

    }
}

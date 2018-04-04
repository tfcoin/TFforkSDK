import com.alibaba.fastjson.JSONObject;
import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;
import com.emodfork.sdkExceptions.NullTransactionException;

public class Step_05_txIsSuccess {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        // 交易ID
        String Record_id = "7b870eafb6e2437d5b7b66d2bfbc81e5bce808f0";

        /**
         * 判断交易是否成功
         */
        try {
            // 获取交易信息
            String moreInfo = WalletPacking.getTransactionsMoreInfo(Record_id);
            // 解析块高
            JSONObject info = JSONObject.parseObject(moreInfo);
            int infoNumber = Integer.parseInt(info.getString("blockNum"));
            // 块高大于0 ，交易成功
            if (infoNumber > 0) {
                System.out.println("交易成功，交易所在块高 : " + infoNumber);
            }
        }catch (NullTransactionException e){
            // 交易未记录，或交易不存在
            // 需要过段时间再来查询
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}

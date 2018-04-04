import com.alibaba.fastjson.JSONObject;
import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;
import com.emodfork.sdkExceptions.NullTransactionException;

public class Transfer_flow {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);

        /**
         * 完整转账流程演示
         */
        // 转账
        String info = WalletPacking.transferToAddress("emodtfc", "qwertyuiop", "1", "TFC", "account_demo_1", "0xe3283975022e998997264c4276c720da1fc6bbe9");
        System.out.println("已发送交易，交易信息 ：" + info);
        // 解析交易信息，获取 record_id
        JSONObject returnObject = JSONObject.parseObject(info);
        String result = returnObject.getString("result");
        if (result != null) {
            String record_id = JSONObject.parseObject(result).getString("record_id");

            // 通过获取到的 record_id 做确认工作
            // 此处应使用单独的线程，来做确认工作
            for (; ; ) {
                try {
                    String moreInfo = WalletPacking.getTransactionsMoreInfo(record_id);
                    System.out.println(moreInfo);
                    JSONObject tempinfo = JSONObject.parseObject(moreInfo);
                    int infoNumber = Integer.parseInt(tempinfo.getString("blockNum"));
                    if (infoNumber > 0) {
                        System.out.println("交易成功，交易所在块高 : " + infoNumber);
                        return;
                    }

                    Thread.sleep(500);
                } catch (NullTransactionException e) {
                    // e.printStackTrace();
                    // 交易不存在或未上链
                } catch (Exception e) {

                }
            }
        }

    }
}

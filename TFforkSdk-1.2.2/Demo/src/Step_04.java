import com.alibaba.fastjson.JSONObject;
import com.emodfork.api.WalletNative;
import com.emodfork.api.WalletPacking;
import com.emodfork.core.Config;
import com.emodfork.entity.TblBcTransaction;
import com.emodfork.sdkExceptions.NullTransactionException;
import com.emodfork.tools.StringUtil;

public class Step_04 {
    public static void main(String[] args) {
        Config.setUsername("test");
        Config.setPassword("test");
        Config.setIp("127.0.0.1");
        Config.setPort(16001);


        // 转账
        // 输入钱包名，钱包密码，转账的数量，资产类型，要转出的账户名，要转入的目标地址（此处的地址为 Step_03 步骤查询"account_demo_2"账户得到的地址）
        // 返回的结果中是一个包含有 Record_id 等信息的JSON格式的字符串，通过 Record_id 可以查询该笔交易的相关信息
        String info = WalletPacking.transferToAddress("emodtfc", "qwertyuiop", "1", "TFC", "account_demo_1", "0xe3283975022e998997264c4276c720da1fc6bbe9");

        // 解析解析交易成功返回的数据，获取 record_id
        JSONObject returnObject = JSONObject.parseObject(info);
        String result = returnObject.getString("result");
        String record_id = "";
        if (result != null) {
            record_id = JSONObject.parseObject(result).getString("record_id");
        }
        System.out.println(record_id);


    }
}

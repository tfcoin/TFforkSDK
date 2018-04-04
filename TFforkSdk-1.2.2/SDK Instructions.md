Java SDK Use Instructions
===============================
#### Prerequisites 

* 将文件 ** StartServer.bat ** 放入钱包文件夹的根目录
* 编辑配置 ** StartServer.bat ** 中有关RPC调用相关参数信息
  ```
  --rpcuser       rpc用户名，对应SDK Config.setUsername("test") 方法参数
  --rpcpassword   rpc用户密码，对应SDK Config.setPassword("test") 方法参数
  --rpcport       rpc服务端口号，对应SDK Config.setPort(16001) 方法参数
  ```

* 以管理员权限执行 ** StartServer.bat **

#### Use Steps ####

1. 调用 ** WalletPacking.createWallet ** 方法创建钱包，参考 Demo 源码目录下 [Step_00]() 步骤和详细注释说明

2. 调用 ** WalletPacking.createAccount ** 方法创建账户，参考 Demo 源码目录下 [Step_01]() 步骤和详细注释说明

3. 调用 ** WalletPacking.getAccountPublicAddress ** 方法查询获取指定账户地址，参考 Demo 源码目录下 [Step_02]() 步骤和详细注释说明

4. 调用 ** WalletPacking.selectBalancesByAddress ** 方法查询指定账户地址的余额，参考 Demo 源码目录下 [Step_03]() 步骤和详细注释说明

5. 调用 ** WalletPacking.transferToAddress ** 方法执行转账操作，参考 Demo 源码目录下 [Step_04]() 步骤和详细注释说明

6. 调用 ** WalletPacking.getTransactionsInfo ** 方法查询指定交易ID的相关信息，参考 Demo 源码目录下 [Step_05]() 步骤和详细注释说明
  

    通过此方法，可以获得交易的发送者，接收者，交易时间，交易数量等信息

7. 调用 ** WalletPacking.getTransactionsMoreInfo ** 方法查询指定交易ID的相关信息，参考 Demo 源码目录下 [Step_05]() 步骤和详细注释说明
  `补充：可通过此方法查询块高度信息，详见演示类 step_05.java`
  `补充2：可通过此方法确认交易是否成功，详见演示类 Step_05_txIsSuccess.java`

8. 调用 ** WalletPacking.getBlockTransactionsListInfo ** 方法查询指定区块的所有交易记录信息，参考 Demo 源码目录下 [Step_06]() 步骤和详细注释说明，
   返回Json格式数据传格式如下：
   
   ```
   [/* result就是返回的交易记录信息，后面每一组{}内就是一笔交易的信息 */
    {
        "amount": 100000000,                                           /* 转入金额 */
        "balanceId": "0x19f66637f0444d00c30405837e8d45431738f434",
        "fee": 50000,
        "fromAccount": "0x42e0eb847d47c67bcb71fd3af716682f1960f663",   /* 转出地址 */
        "isDeposit": true,
        "memo": "",
        "toAccount": "0x630c9fd6e672fb6c64a774d45b39663a490e0da9",     /* 转入地址 */
        "trxId": "aba1d61f2ad18f272c554fc4c471a700d755b0bb",           /* 交易记录ID */
        "trxTime": 1519794766000,
        "trxTimes": "2018-02-28 21:12:46"                              /* 交易确认时间 UTC时间*/
    }
]
  
   ```
   
9. 调用 ** WalletPacking.checkAddressValidity ** 方法查询地址合法性，使用参考 Demo目录下 Util_Address_Validity.java 步骤和详细注释说明

10. 完整的交易以及确认交易成功的流程，参考 Demo目录下 Transfer_flow.java




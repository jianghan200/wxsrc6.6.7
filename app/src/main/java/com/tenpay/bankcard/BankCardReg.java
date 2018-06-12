package com.tenpay.bankcard;

import com.tencent.bankcardrecog.BankCardInfo;
import com.tencent.bankcardrecog.BankCardRecog;
import com.tenpay.ndk.Encrypt;

public class BankCardReg
{
  private static final String TAG = "MyTag";
  
  public static String getBankCardSegmentNumber(String paramString, int paramInt, int[] paramArrayOfInt)
  {
    LogUtil.d("MyTag", new Object[] { "getBankCardSegmentNumber" });
    LogUtil.d("MyTag", new Object[] { "cardNum=" + paramString });
    Encrypt localEncrypt = new Encrypt();
    paramString = localEncrypt.desedeDecode(paramString, localEncrypt.getRandomKey());
    LogUtil.d("MyTag", new Object[] { "cardNum=" + paramString });
    paramString = BankCardRecog.getBankCardSegmentNumber(paramString, paramInt, paramArrayOfInt);
    LogUtil.d("MyTag", new Object[] { paramString });
    return localEncrypt.desedeEncode(paramString, localEncrypt.getRandomKey());
  }
  
  public static int recognizeBankCardGetVersion()
  {
    return BankCardRecog.recognizeBankCardGetVersion();
  }
  
  public static int recognizeBankCardInit(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return BankCardRecog.recognizeBankCardInit(paramInt1, paramInt2, paramBoolean);
  }
  
  public static int recognizeBankCardProcess(byte[] paramArrayOfByte, BankCardInfo paramBankCardInfo, boolean[] paramArrayOfBoolean)
  {
    return BankCardRecog.recognizeBankCardProcess(paramArrayOfByte, paramBankCardInfo, paramArrayOfBoolean);
  }
  
  public static int recognizeBankCardRelease()
  {
    return BankCardRecog.recognizeBankCardRelease();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tenpay/bankcard/BankCardReg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
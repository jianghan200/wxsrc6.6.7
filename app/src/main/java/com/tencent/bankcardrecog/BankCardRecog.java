package com.tencent.bankcardrecog;

public class BankCardRecog
{
  public static native String getBankCardSegmentNumber(String paramString, int paramInt, int[] paramArrayOfInt);
  
  public static native int recognizeBankCardGetVersion();
  
  public static native int recognizeBankCardInit(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static native int recognizeBankCardProcess(byte[] paramArrayOfByte, BankCardInfo paramBankCardInfo, boolean[] paramArrayOfBoolean);
  
  public static native int recognizeBankCardRelease();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/bankcardrecog/BankCardRecog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
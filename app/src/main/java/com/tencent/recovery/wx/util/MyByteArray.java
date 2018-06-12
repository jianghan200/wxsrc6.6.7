package com.tencent.recovery.wx.util;

class MyByteArray
{
  public byte[] bwd;
  public int bwe = 0;
  
  public MyByteArray()
  {
    this.bwd = new byte['Ā'];
  }
  
  public MyByteArray(byte paramByte)
  {
    this.bwd = new byte[] { paramByte };
  }
  
  public MyByteArray(byte[] paramArrayOfByte)
  {
    this.bwd = paramArrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/wx/util/MyByteArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
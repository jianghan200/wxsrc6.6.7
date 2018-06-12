package com.tencent.mm.plugin.licence.model;

public class BankCardInfo
{
  private static final String TAG = "BankCardInfo";
  public byte[] bitmapData;
  public int bitmapLen = 0;
  private String cardNum = "";
  private int cardNumLen = 0;
  public int height = 0;
  private int[] rectX = new int[20];
  private int[] rectY = new int[20];
  public int width = 0;
  
  public BankCardInfo(int paramInt1, int paramInt2)
  {
    this.bitmapData = new byte[(int)(0.8D * paramInt1) * (int)(0.52D * paramInt1) * 3 + 54];
  }
  
  public String getCardNum()
  {
    return this.cardNum;
  }
  
  public int getCardNumLen()
  {
    return this.cardNumLen;
  }
  
  public int[] getRectX()
  {
    return this.rectX;
  }
  
  public int[] getRectY()
  {
    return this.rectY;
  }
  
  public void setCardNum(String paramString)
  {
    this.cardNum = paramString;
  }
  
  public void setCardNumLen(int paramInt)
  {
    this.cardNumLen = paramInt;
  }
  
  public void setRectX(int[] paramArrayOfInt)
  {
    this.rectX = paramArrayOfInt;
  }
  
  public void setRectY(int[] paramArrayOfInt)
  {
    this.rectY = paramArrayOfInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/licence/model/BankCardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.licence.model;

public class CardInfo
{
  public byte[] bitmapData;
  public int bitmapLen = 0;
  public int height = 0;
  public int width = 0;
  
  public CardInfo(int paramInt1, int paramInt2)
  {
    this.bitmapData = new byte[(int)(0.8D * paramInt1) * (int)(0.52D * paramInt1) * 3 + 54];
  }
  
  public byte[] getData()
  {
    return this.bitmapData;
  }
  
  public int getHeight()
  {
    return this.height;
  }
  
  public int getSize()
  {
    return this.bitmapLen;
  }
  
  public int getWidth()
  {
    return this.width;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/licence/model/CardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.rtmp;

public class TXBitrateItem
  implements Comparable<TXBitrateItem>
{
  public int bitrate;
  public int height;
  public int index;
  public int width;
  
  public int compareTo(TXBitrateItem paramTXBitrateItem)
  {
    return this.bitrate - paramTXBitrateItem.bitrate;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/rtmp/TXBitrateItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
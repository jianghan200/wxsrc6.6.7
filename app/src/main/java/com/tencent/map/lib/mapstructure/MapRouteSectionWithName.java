package com.tencent.map.lib.mapstructure;

import com.tencent.tencentmap.mapsdk.a.jm;

public class MapRouteSectionWithName
{
  public static final int kMaxRoadNameLength = 128;
  public int color;
  public int endNum;
  public String roadName;
  public int startNum;
  
  public static int byteLength()
  {
    return 140;
  }
  
  public byte[] toBytes()
  {
    byte[] arrayOfByte1 = new byte[byteLength()];
    System.arraycopy(jm.a(this.startNum), 0, arrayOfByte1, 0, 4);
    System.arraycopy(jm.a(this.endNum), 0, arrayOfByte1, 4, 4);
    System.arraycopy(jm.a(this.color), 0, arrayOfByte1, 8, 4);
    byte[] arrayOfByte2 = jm.a(this.roadName);
    if (arrayOfByte2.length < 128)
    {
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 12, arrayOfByte2.length);
      return arrayOfByte1;
    }
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 12, 128);
    return arrayOfByte1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/map/lib/mapstructure/MapRouteSectionWithName.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
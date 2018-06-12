package com.tencent.map.lib.mapstructure;

import com.tencent.tencentmap.mapsdk.a.jm;

public class LineInfo
{
  private static final int ROAD_NAME_BYTE_LEN = 64;
  public int color;
  public int endNum;
  public String roadName;
  public int speed;
  public int startNum;
  
  public byte[] fromBytes()
  {
    byte[] arrayOfByte1 = new byte[80];
    System.arraycopy(jm.a(this.startNum), 0, arrayOfByte1, 0, 4);
    System.arraycopy(jm.a(this.endNum), 0, arrayOfByte1, 4, 4);
    System.arraycopy(jm.a(this.color), 0, arrayOfByte1, 8, 4);
    System.arraycopy(jm.a(this.speed), 0, arrayOfByte1, 12, 4);
    byte[] arrayOfByte2 = jm.a(this.roadName);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 16, arrayOfByte2.length);
    return arrayOfByte1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/map/lib/mapstructure/LineInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
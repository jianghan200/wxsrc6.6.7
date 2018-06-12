package com.tencent.map.lib.mapstructure;

import com.tencent.tencentmap.mapsdk.a.jm;

public class TappedElement
{
  public static final int TYPE_ANNO = 1;
  public static final int TYPE_BLOCKROUTE_ANNO = 7;
  public static final int TYPE_COMPASS = 3;
  public static final int TYPE_INDOORMAP_ANNO = 8;
  public static final int TYPE_LINE = 5;
  public static final int TYPE_LOCATION_MARKER = 6;
  public static final int TYPE_NONE = 0;
  public String name;
  public int nameLen;
  public long param1;
  public int param2;
  public int pixelX;
  public int pixelY;
  public int type;
  
  public static TappedElement fromBytes(byte[] paramArrayOfByte)
  {
    int i = 20;
    TappedElement localTappedElement = new TappedElement();
    byte[] arrayOfByte1 = new byte[4];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, 4);
    localTappedElement.type = jm.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 4, arrayOfByte1, 0, 4);
    localTappedElement.pixelX = jm.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 8, arrayOfByte1, 0, 4);
    localTappedElement.pixelY = jm.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 12, arrayOfByte1, 0, 4);
    localTappedElement.param2 = jm.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 16, arrayOfByte1, 0, 4);
    localTappedElement.nameLen = jm.a(arrayOfByte1);
    byte[] arrayOfByte2;
    if (localTappedElement.type != 7)
    {
      arrayOfByte2 = new byte[64];
      System.arraycopy(paramArrayOfByte, 20, arrayOfByte2, 0, 64);
      i = 84;
      if (localTappedElement.type == 8) {
        break label199;
      }
    }
    label199:
    for (localTappedElement.name = jm.d(arrayOfByte2);; localTappedElement.name = jm.a(arrayOfByte2, "UTF8"))
    {
      System.arraycopy(paramArrayOfByte, i, arrayOfByte1, 0, 4);
      int j = jm.a(arrayOfByte1);
      System.arraycopy(paramArrayOfByte, i + 4, arrayOfByte1, 0, 4);
      localTappedElement.param1 = (jm.a(arrayOfByte1) + (j << 32));
      return localTappedElement;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/map/lib/mapstructure/TappedElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
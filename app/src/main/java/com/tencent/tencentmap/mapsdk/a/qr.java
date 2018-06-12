package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;

public final class qr
{
  public static qq a()
  {
    return a("marker.png");
  }
  
  public static qq a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    return new qq(paramBitmap);
  }
  
  public static qq a(String paramString)
  {
    try
    {
      paramString = qr.class.getResourceAsStream("/assets/" + paramString);
      Bitmap localBitmap = BitmapFactory.decodeStream(paramString);
      paramString.close();
      paramString = a(localBitmap);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
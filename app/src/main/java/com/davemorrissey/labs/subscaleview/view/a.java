package com.davemorrissey.labs.subscaleview.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class a
{
  final Integer YT;
  public boolean YU;
  public int YV;
  public int YW;
  public Rect YX;
  boolean YY;
  public final Bitmap bitmap;
  public final Uri uri;
  
  a(int paramInt)
  {
    this.bitmap = null;
    this.uri = null;
    this.YT = Integer.valueOf(paramInt);
    this.YU = true;
  }
  
  public a(Bitmap paramBitmap)
  {
    this.bitmap = paramBitmap;
    this.uri = null;
    this.YT = null;
    this.YU = false;
    this.YV = paramBitmap.getWidth();
    this.YW = paramBitmap.getHeight();
    this.YY = true;
  }
  
  private a(Uri paramUri)
  {
    String str = paramUri.toString();
    Uri localUri1 = paramUri;
    if (str.startsWith("file:///"))
    {
      localUri1 = paramUri;
      if (new File(str.substring(7)).exists()) {}
    }
    try
    {
      localUri1 = Uri.parse(URLDecoder.decode(str, "UTF-8"));
      this.bitmap = null;
      this.uri = localUri1;
      this.YT = null;
      this.YU = true;
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        Uri localUri2 = paramUri;
      }
    }
  }
  
  public static a S(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("Uri must not be null");
    }
    String str = paramString;
    if (!paramString.contains("://"))
    {
      str = paramString;
      if (paramString.startsWith("/")) {
        str = paramString.substring(1);
      }
      str = "file:///" + str;
    }
    return new a(Uri.parse(str));
  }
  
  public final a hB()
  {
    this.YU = true;
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/davemorrissey/labs/subscaleview/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
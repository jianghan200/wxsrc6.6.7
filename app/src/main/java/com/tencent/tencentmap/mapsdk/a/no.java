package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;

public class no
{
  private final String a = "marker_default.png";
  private int b = -1;
  private int c = -1;
  private String d = "";
  private String e = "";
  private String f = "";
  private float g = -1.0F;
  private Bitmap h = null;
  private String i = null;
  
  public no(int paramInt)
  {
    this.b = paramInt;
  }
  
  private String a(float paramFloat)
  {
    String str = null;
    if (paramFloat < 30.0F) {
      str = "RED.png";
    }
    do
    {
      return str;
      if ((paramFloat >= 30.0F) && (paramFloat < 60.0F)) {
        return "ORANGE.png";
      }
      if ((paramFloat >= 60.0F) && (paramFloat < 120.0F)) {
        return "YELLOW.png";
      }
      if ((paramFloat >= 120.0F) && (paramFloat < 180.0F)) {
        return "GREEN.png";
      }
      if ((paramFloat >= 180.0F) && (paramFloat < 210.0F)) {
        return "CYAN.png";
      }
      if ((paramFloat >= 210.0F) && (paramFloat < 240.0F)) {
        return "AZURE.png";
      }
      if ((paramFloat >= 240.0F) && (paramFloat < 270.0F)) {
        return "BLUE.png";
      }
      if ((paramFloat >= 270.0F) && (paramFloat < 300.0F)) {
        return "VIOLET.png";
      }
      if ((paramFloat >= 300.0F) && (paramFloat < 330.0F)) {
        return "MAGENTAV.png";
      }
    } while (paramFloat < 330.0F);
    return "ROSE.png";
  }
  
  private String b(Bitmap paramBitmap)
  {
    String str2 = paramBitmap.toString();
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    str1 = str1.replace("android.graphics.Bitmap", "");
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    str1 = str1 + "@" + paramBitmap.hashCode() + "@" + j + "@" + k + "@" + paramBitmap.getRowBytes();
    return str1 + "@" + paramBitmap.getPixel(j / 2, k / 2);
  }
  
  public Bitmap a(Context paramContext)
  {
    if (this.h != null)
    {
      this.i = b(this.h);
      return this.h;
    }
    if (paramContext == null) {
      return null;
    }
    switch (this.b)
    {
    }
    for (;;)
    {
      return this.h;
      this.i = ("res_" + this.c);
      if (kh.u != null) {
        this.h = kh.u.a(this.i);
      }
      if (this.h == null)
      {
        this.h = kh.a(paramContext, this.c);
        if ((kh.u != null) && (this.h != null))
        {
          kh.u.a(this.i, this.h);
          continue;
          this.i = ("asset_" + this.d);
          if (kh.u != null) {
            this.h = kh.u.a(this.i);
          }
          if (this.h == null)
          {
            this.h = kh.c(paramContext, this.d);
            if (this.h == null)
            {
              this.h = kh.b(paramContext, this.d);
              if (this.h != null) {
                this.h = kh.b(this.h);
              }
            }
            if ((kh.u != null) && (this.h != null))
            {
              kh.u.a(this.i, this.h);
              continue;
              this.i = ("file_" + this.e);
              if (kh.u != null) {
                this.h = kh.u.a(this.i);
              }
              if (this.h == null)
              {
                this.h = kh.a(paramContext, this.e);
                continue;
                this.i = ("path_" + this.f);
                if (kh.u != null) {
                  this.h = kh.u.a(this.i);
                }
                if (this.h == null)
                {
                  this.h = kh.b(this.f);
                  if ((kh.u != null) && (this.h != null))
                  {
                    kh.u.a(this.i, this.h);
                    continue;
                    this.i = "asset_marker_default.png";
                    if (kh.u != null) {
                      this.h = kh.u.a(this.i);
                    }
                    if (this.h == null)
                    {
                      this.h = kh.b(paramContext, "marker_default.png");
                      if ((kh.u != null) && (this.h != null))
                      {
                        kh.u.a(this.i, this.h);
                        continue;
                        String str = a(this.g);
                        if (str != null)
                        {
                          this.i = ("asset_" + str);
                          if (kh.u != null) {
                            this.h = kh.u.a(this.i);
                          }
                          if (this.h == null)
                          {
                            this.h = kh.b(paramContext, str);
                            if ((kh.u != null) && (this.h != null)) {
                              kh.u.a(this.i, this.h);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public String a()
  {
    return this.i;
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.h = paramBitmap;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
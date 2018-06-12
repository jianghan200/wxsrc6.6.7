package com.tencent.mm.ak.a.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;

public final class a
{
  public static Bitmap a(com.tencent.mm.ak.a.c paramc, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 <= 0) || (paramInt3 <= 0))
    {
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0)) {
        return com.tencent.mm.sdk.platformtools.c.aj(paramInt1, paramc.width, paramc.height);
      }
      return com.tencent.mm.sdk.platformtools.c.CV(paramInt1);
    }
    return com.tencent.mm.sdk.platformtools.c.aj(paramInt1, paramInt2, paramInt3);
  }
  
  public static Bitmap a(com.tencent.mm.ak.a.c paramc, InputStream paramInputStream, int paramInt1, int paramInt2, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0)) {
        paramc = com.tencent.mm.sdk.platformtools.c.a(paramInputStream, 0.0F, paramc.width, paramc.height);
      }
    }
    for (;;)
    {
      paramInputStream = paramc;
      if (paramBoolean1) {
        paramInputStream = com.tencent.mm.sdk.platformtools.c.a(paramc, paramInt1, paramInt2, false, true);
      }
      paramc = paramInputStream;
      if (paramFloat > 0.0F) {
        paramc = com.tencent.mm.sdk.platformtools.c.c(paramInputStream, paramFloat);
      }
      paramInputStream = paramc;
      if (paramBoolean2) {
        paramInputStream = com.tencent.mm.sdk.platformtools.c.S(paramc);
      }
      return paramInputStream;
      paramc = com.tencent.mm.sdk.platformtools.c.decodeStream(paramInputStream);
      continue;
      paramc = com.tencent.mm.sdk.platformtools.c.a(paramInputStream, 0.0F, paramInt1, paramInt2);
    }
  }
  
  public static Bitmap a(com.tencent.mm.ak.a.c paramc, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0)) {
        return com.tencent.mm.sdk.platformtools.c.aj(paramString, paramc.width, paramc.height);
      }
      return com.tencent.mm.sdk.platformtools.c.Wb(paramString);
    }
    return com.tencent.mm.sdk.platformtools.c.e(paramString, paramInt2, paramInt1, false);
  }
  
  public static Bitmap a(com.tencent.mm.ak.a.c paramc, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0)) {
        paramc = com.tencent.mm.sdk.platformtools.c.decodeByteArray(paramArrayOfByte, paramc.width, paramc.height);
      }
    }
    for (;;)
    {
      if (paramBoolean1) {
        paramc = com.tencent.mm.sdk.platformtools.c.a(com.tencent.mm.sdk.platformtools.c.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2), paramInt1, paramInt2, false, true);
      }
      paramArrayOfByte = paramc;
      if (paramFloat > 0.0F) {
        paramArrayOfByte = com.tencent.mm.sdk.platformtools.c.c(paramc, paramFloat);
      }
      paramc = paramArrayOfByte;
      if (paramBoolean2) {
        paramc = com.tencent.mm.sdk.platformtools.c.S(paramArrayOfByte);
      }
      return paramc;
      paramc = com.tencent.mm.sdk.platformtools.c.bs(paramArrayOfByte);
      continue;
      paramc = com.tencent.mm.sdk.platformtools.c.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public static Bitmap b(com.tencent.mm.ak.a.c paramc, String paramString, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.c.VZ(paramString);
    if ((localOptions != null) && ((localOptions.outWidth >= localOptions.outHeight * 2) || (localOptions.outWidth * 2 <= localOptions.outHeight)))
    {
      if ((paramInt1 <= 0) || (paramInt2 <= 0))
      {
        if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0)) {
          return com.tencent.mm.sdk.platformtools.c.e(paramString, paramc.height, paramc.width, true);
        }
        if ((paramc != null) && (paramc.getImageView() != null))
        {
          paramInt2 = paramc.getImageView().getMeasuredWidth();
          paramInt1 = paramc.getImageView().getMeasuredHeight();
        }
        for (;;)
        {
          return com.tencent.mm.sdk.platformtools.c.e(paramString, paramInt1, paramInt2, true);
          x.w("MicroMsg.imageloader.ImageLoaderUtils", "crop bitmap cant not un set width or height");
          paramInt1 = 0;
          paramInt2 = 0;
        }
      }
      return com.tencent.mm.sdk.platformtools.c.e(paramString, paramInt2, paramInt1, true);
    }
    return com.tencent.mm.sdk.platformtools.c.e(paramString, paramInt2, paramInt1, false);
  }
  
  public static Bitmap c(com.tencent.mm.ak.a.c paramc, String paramString, int paramInt1, int paramInt2)
  {
    if (((paramInt1 > 0) && (paramInt2 > 0)) || (paramc != null)) {}
    try
    {
      if ((paramc.width > 0) && (paramc.width > 0)) {
        return com.tencent.mm.sdk.platformtools.c.ak(paramString, paramc.width, paramc.height);
      }
      return com.tencent.mm.sdk.platformtools.c.ak(paramString, 0, 0);
    }
    catch (IOException paramc)
    {
      x.e("MicroMsg.imageloader.ImageLoaderUtils", "get bitmap from assert failed. :%s", new Object[] { paramc.toString() });
    }
    paramc = com.tencent.mm.sdk.platformtools.c.ak(paramString, paramInt1, paramInt2);
    return paramc;
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ak/a/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
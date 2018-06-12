package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;

public final class n
{
  public static int a(Bitmap paramBitmap, int paramInt, String paramString)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      return -1;
    }
    return MMJpegOptim.compressByQualityOptim(paramBitmap, paramInt, false, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
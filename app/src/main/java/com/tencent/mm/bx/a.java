package com.tencent.mm.bx;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class a
{
  public static int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int k = paramOptions.outHeight;
    int m = paramOptions.outWidth;
    int i = 1;
    int j;
    for (;;)
    {
      j = i;
      if (m / i <= paramInt1) {
        break;
      }
      i += 1;
    }
    while (k / j > paramInt2) {
      j += 1;
    }
    return j;
  }
  
  public static int aH(float paramFloat)
  {
    return (int)(ad.getContext().getResources().getDisplayMetrics().density * paramFloat + 0.5F);
  }
  
  public static void abD(String paramString)
  {
    int i = 0;
    x.i("MicroMsg.MMPhotoEditUtil", "[deleteDirAllFile] dir:%s", new Object[] { paramString });
    paramString = new File(paramString);
    if (paramString.exists())
    {
      paramString = paramString.listFiles();
      if (paramString != null)
      {
        int j = paramString.length;
        while (i < j)
        {
          Object localObject = paramString[i];
          if ((((File)localObject).isFile()) && (!bi.oW(((File)localObject).getName())) && (((File)localObject).getName().startsWith("wx_photo_edit_"))) {
            ((File)localObject).delete();
          }
          i += 1;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/bx/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
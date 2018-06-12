package com.tencent.mm.plugin.gif;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  public final int[] khG = new int[6];
  
  public e(String paramString)
  {
    try
    {
      MMGIFJNI.recycle(MMGIFJNI.openByFilePath(paramString, this.khG));
      x.i("MMGIFInfo", "width:%d height:%d", new Object[] { Integer.valueOf(this.khG[0]), Integer.valueOf(this.khG[1]) });
      return;
    }
    catch (MMGIFException paramString)
    {
      x.e("MMGIFInfo", bi.i(paramString));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/gif/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
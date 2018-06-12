package com.tencent.mm.plugin.h.a.b.a;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.h.a.b.h;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(18)
public class f
  extends a
{
  static final String TAG = f.class.getName();
  public static String hin = h.hgQ;
  public static String hio = h.hgR;
  public int hip = -1;
  public int hiq = -1;
  public int hir = -1;
  public long his = 0L;
  public long hit = 0L;
  
  public f()
  {
    this.hhi = null;
    this.hhj = 8;
    this.hgC = 1L;
  }
  
  public final byte[] atV()
  {
    if (this.hip < 0)
    {
      x.e(TAG, "stepCount is invalid");
      return null;
    }
    if (this.hiq >= 0) {}
    for (int i = 7;; i = 4)
    {
      int j = i;
      if (this.hir >= 0) {
        j = i + 3;
      }
      byte[] arrayOfByte = new byte[j];
      arrayOfByte[0] = 1;
      j = 0;
      i = 1;
      while (j < 3)
      {
        arrayOfByte[i] = ((byte)(this.hip >> j * 8 & 0xFF));
        i += 1;
        j += 1;
      }
      j = i;
      int k;
      if (this.hiq >= 0)
      {
        arrayOfByte[0] = ((byte)(arrayOfByte[0] | 0x2));
        k = 0;
        for (;;)
        {
          j = i;
          if (k >= 3) {
            break;
          }
          arrayOfByte[i] = ((byte)(this.hiq >> k * 8 & 0xFF));
          i += 1;
          k += 1;
        }
      }
      if (this.hir >= 0)
      {
        arrayOfByte[0] = 4;
        k = 0;
        i = j;
        j = k;
        while (j < 3)
        {
          arrayOfByte[i] = ((byte)(this.hir >> j * 8 & 0xFF));
          j += 1;
          i += 1;
        }
      }
      return arrayOfByte;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/h/a/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
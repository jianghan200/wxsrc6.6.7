package com.tencent.mm.plugin.mmsight.model.a;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ad;

public final class j
  extends a<byte[]>
{
  private static int iNj = 0;
  public static final j lin = new j();
  
  public final void F(byte[] paramArrayOfByte)
  {
    try
    {
      super.aQ(paramArrayOfByte);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  protected final long Fk()
  {
    if (iNj <= 0) {
      iNj = ((ActivityManager)ad.getContext().getSystemService("activity")).getLargeMemoryClass();
    }
    if (iNj >= 512) {
      return 41943040L;
    }
    return 20971520L;
  }
  
  protected final long Fl()
  {
    return 10485760L;
  }
  
  public final void Fm()
  {
    super.Fm();
  }
  
  public final byte[] i(Integer paramInteger)
  {
    try
    {
      byte[] arrayOfByte2 = (byte[])super.c(paramInteger);
      byte[] arrayOfByte1 = arrayOfByte2;
      if (arrayOfByte2 == null) {
        arrayOfByte1 = new byte[paramInteger.intValue()];
      }
      return arrayOfByte1;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
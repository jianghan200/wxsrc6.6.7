package com.tencent.mm.plugin.clean.c;

import android.os.StatFs;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.j.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;

public final class j
  implements ar
{
  private static j hRq;
  public long hQC;
  public long hQD;
  public long hQE;
  public HashSet<String> hRd;
  public HashMap<String, Long> hRp;
  
  public static long aBa()
  {
    try
    {
      StatFs localStatFs = new StatFs(e.bnC);
      l1 = localStatFs.getBlockCount();
      int i = localStatFs.getBlockSize();
      l1 = i * l1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        long l2;
        long l1 = 0L;
      }
    }
    l2 = l1;
    if (l1 <= 0L) {
      l2 = 1L;
    }
    return l2;
  }
  
  public static long aBb()
  {
    try
    {
      StatFs localStatFs = new StatFs(e.bnC);
      l1 = localStatFs.getAvailableBlocks();
      int i = localStatFs.getBlockSize();
      l1 = i * l1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        long l2;
        long l1 = 0L;
      }
    }
    l2 = l1;
    if (l1 <= 0L) {
      l2 = 1L;
    }
    return l2;
  }
  
  public static j aBt()
  {
    if (hRq == null) {
      hRq = new j();
    }
    return hRq;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreClean", "summerclean onAccountPostReset updated[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    b.avr().onAccountInitialized(null);
  }
  
  public final void bo(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreClean", "summerclean onSdcardMount mounted[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.i("MicroMsg.SubCoreClean", "summerclean onAccountRelease");
    this.hQC = 0L;
    this.hQD = 0L;
    this.hQE = 0L;
    if (this.hRp != null) {
      this.hRp.clear();
    }
    if (this.hRd != null) {
      this.hRd.clear();
    }
    d.aBn();
    b.avr().onAccountRelease();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/clean/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.wear.model.c;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.protocal.c.cec;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class a
{
  public static final void ee(int paramInt1, int paramInt2)
  {
    cec localcec = com.tencent.mm.plugin.wear.model.a.bSl().pIM.pJd.pJT;
    if (localcec != null)
    {
      x.v("MicroMsg.Wear.ReportKVUtil", "report kv operation=%d scene=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      h.mEJ.h(11632, new Object[] { Integer.valueOf(paramInt1), localcec.hbQ, localcec.sze, Integer.valueOf(paramInt2) });
    }
  }
  
  public static final void jO(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(249);
    localIDKey.SetKey(12);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(249);
      localIDKey.SetKey(13);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    h.mEJ.b(localArrayList, false);
  }
  
  public static final void zC(int paramInt)
  {
    h.mEJ.a(249L, paramInt, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wear/model/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
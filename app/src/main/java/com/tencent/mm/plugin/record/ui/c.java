package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.g.a.fw.a;
import com.tencent.mm.g.a.fw.b;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements h.a
{
  public c(Context paramContext)
  {
    fw localfw = new fw();
    localfw.bOx.opType = 3;
    localfw.bOx.context = paramContext;
    a.sFg.m(localfw);
  }
  
  public final Bitmap a(h.a.b paramb)
  {
    fw localfw = new fw();
    localfw.bOx.opType = 2;
    localfw.bOx.bOE = false;
    if (paramb.bOC)
    {
      localfw.bOx.bOz = paramb.bOz;
      localfw.bOx.bOC = paramb.bOC;
    }
    for (;;)
    {
      a.sFg.m(localfw);
      x.d("MicroMsg.FavImageServiceProxy", "getSuitableBigImg favLocalId %s, dataId %s, retBmp %s, fromCache", new Object[] { Long.valueOf(paramb.msT), paramb.bOz.jdM, localfw.bOy.bOF, Boolean.valueOf(localfw.bOx.bOC) });
      return localfw.bOy.bOF;
      localfw.bOx.bOz = paramb.bOz;
      localfw.bOx.bJA = paramb.msT;
      localfw.bOx.maxWidth = paramb.maxWidth;
      localfw.bOx.bOD = paramb.bOD;
    }
  }
  
  public final Bitmap a(h.a.c paramc)
  {
    fw localfw = new fw();
    localfw.bOx.opType = 0;
    localfw.bOx.bOz = paramc.bOz;
    localfw.bOx.bJA = paramc.msT;
    a.sFg.m(localfw);
    x.d("MicroMsg.FavImageServiceProxy", "getThumb favLocalId %s, retBmp %s", new Object[] { Long.valueOf(paramc.msT), localfw.bOy.bOF });
    return localfw.bOy.bOF;
  }
  
  public final void a(h.a.a parama)
  {
    x.d("MicroMsg.FavImageServiceProxy", "attachThumb favLocalId %s", new Object[] { Long.valueOf(parama.msT) });
    fw localfw = new fw();
    localfw.bOx.opType = 1;
    localfw.bOx.bOA = parama.bOA;
    localfw.bOx.bOz = parama.bOz;
    localfw.bOx.bJA = parama.msT;
    localfw.bOx.bOB = parama.bOB;
    localfw.bOx.width = parama.width;
    localfw.bOx.height = parama.height;
    a.sFg.m(localfw);
  }
  
  public final void bqy()
  {
    fw localfw = new fw();
    localfw.bOx.opType = 4;
    a.sFg.m(localfw);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/record/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
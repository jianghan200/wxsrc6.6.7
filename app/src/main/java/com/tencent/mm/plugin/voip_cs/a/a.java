package com.tencent.mm.plugin.voip_cs.a;

import com.tencent.mm.g.a.ss;
import com.tencent.mm.g.a.ss.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip_cs.b.b;
import com.tencent.mm.plugin.voip_cs.b.d;
import com.tencent.mm.protocal.c.bzj;
import com.tencent.mm.protocal.c.bzq;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class a
  extends c<ss>
{
  public a()
  {
    this.sFo = ss.class.getName().hashCode();
  }
  
  private static boolean a(ss paramss)
  {
    if ((!(paramss instanceof ss)) || (!au.HX())) {}
    d locald;
    do
    {
      return false;
      locald = b.bMw();
      localObject = paramss.cdx.cdy;
    } while ((localObject == null) || (localObject.length == 0));
    paramss = new byte[localObject.length - 1];
    System.arraycopy(localObject, 1, paramss, 0, paramss.length);
    Object localObject = new bzj();
    try
    {
      ((bzj)localObject).aG(paramss);
      x.i("MicroMsg.voipcs.VoipCSService", "notify status = " + ((bzj)localObject).svE + ",notifySeq = " + locald.oXm);
      paramss = new bzq();
      paramss.svs = ((bzj)localObject).svs;
      paramss.rxH = ((bzj)localObject).rxH;
      paramss.svC = ((bzj)localObject).svC;
      paramss.svE = ((bzj)localObject).svE;
      paramss.svF = ((bzj)localObject).svF;
      paramss.svG = ((bzj)localObject).svG;
      paramss.svD = ((bzj)localObject).svD;
      locald.a(paramss);
      return false;
    }
    catch (IOException paramss)
    {
      x.e("MicroMsg.voipcs.VoipCSService", "csNotify.parseFrom content error!", new Object[] { paramss });
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
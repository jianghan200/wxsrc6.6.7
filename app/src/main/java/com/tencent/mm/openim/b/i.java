package com.tencent.mm.openim.b;

import com.tencent.mm.aa.e;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.c.axq;
import com.tencent.mm.protocal.c.axr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class i
{
  public static ab a(axq paramaxq)
  {
    Object localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramaxq.eup);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new ab();
    }
    ((ab)localObject1).setUsername(paramaxq.eup);
    ((ab)localObject1).dx(paramaxq.nickname);
    ((ab)localObject1).setType(paramaxq.type);
    ((ab)localObject1).dv(paramaxq.fky);
    ((ab)localObject1).setSource(paramaxq.source);
    ((ab)localObject1).dy(paramaxq.saN);
    ((ab)localObject1).dz(paramaxq.saO);
    ((ab)localObject1).dC(paramaxq.saP);
    ((ab)localObject1).dB(paramaxq.saQ);
    if (paramaxq.saR == null)
    {
      localObject2 = "";
      ((ab)localObject1).eb((String)localObject2);
      if (paramaxq.saR != null) {
        break label191;
      }
    }
    label191:
    for (int i = 0;; i = paramaxq.saR.saT)
    {
      ((ab)localObject1).eT(i);
      ((ab)localObject1).ea(paramaxq.rcw);
      ((ab)localObject1).dG(paramaxq.hva);
      ((ab)localObject1).eJ(paramaxq.sex);
      ((ab)localObject1).dF(paramaxq.saS);
      ((ab)localObject1).eQ((int)bi.VE());
      return (ab)localObject1;
      localObject2 = paramaxq.saR.jQf;
      break;
    }
  }
  
  public static void b(axq paramaxq)
  {
    int j = 1;
    String str2 = "";
    String str1 = "";
    j localj = q.KH().kc(paramaxq.eup);
    if (localj != null)
    {
      str2 = localj.Kx();
      str1 = localj.Ky();
    }
    localj = new j();
    localj.bWA = -1;
    localj.username = paramaxq.eup;
    localj.dHQ = paramaxq.saM;
    localj.dHR = paramaxq.saL;
    x.i("MicroMsg.OpenIMContactLogic", "dealwithAvatarFromModContact contact %s b[%s] s[%s]", new Object[] { localj.getUsername(), localj.Kx(), localj.Ky() });
    if (!localj.Kx().equals(str2))
    {
      q.Kp();
      f.B(paramaxq.eup, true);
    }
    for (int i = 1;; i = 0)
    {
      if (!localj.Ky().equals(str1))
      {
        q.Kp();
        f.B(paramaxq.eup, false);
        i = j;
      }
      for (;;)
      {
        if (i != 0)
        {
          q.KJ().jO(paramaxq.eup);
          q.KH().a(localj);
        }
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/openim/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
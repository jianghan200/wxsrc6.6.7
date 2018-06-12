package com.tencent.mm.model;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.bd;
import java.util.Map;
import junit.framework.Assert;

public final class bo
  implements d
{
  public final d.b b(d.a parama)
  {
    boolean bool2 = true;
    parama = parama.dIN;
    if (parama != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (parama.rcl == null) {
        break label95;
      }
    }
    label95:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      parama = (String)bl.z(ab.a(parama.rcl), "tips").get(".tips.tip.url");
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.SoftwareMsgExtension", "url:" + parama);
      au.HU();
      c.DT().set(12308, parama);
      return null;
      bool1 = false;
      break;
    }
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/model/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
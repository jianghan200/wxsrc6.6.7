package com.tencent.mm.plugin.wallet_ecard;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.cn;
import com.tencent.mm.g.a.cn.a;
import com.tencent.mm.g.a.le;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class a
  implements ar
{
  private c<cn> pBm = new c()
  {
    private boolean a(cn paramAnonymouscn)
    {
      cn.a locala = paramAnonymouscn.bJR;
      Object localObject1 = new HashMap();
      if (!bi.oW(locala.packageExt))
      {
        localObject2 = locala.packageExt.split("&");
        if ((localObject2 != null) && (localObject2.length > 0))
        {
          int i = 0;
          while (i < localObject2.length)
          {
            if (!bi.oW(localObject2[i]))
            {
              String[] arrayOfString = localObject2[i].split("=");
              if ((arrayOfString.length == 2) && (!bi.oW(arrayOfString[0]))) {
                ((HashMap)localObject1).put(arrayOfString[0], arrayOfString[1]);
              }
            }
            i += 1;
          }
        }
      }
      Object localObject2 = (String)((HashMap)localObject1).get("extradata");
      x.i("MicroMsg.SubCoreECard", "start openECard, extraData: %s, packageExt: %s", new Object[] { localObject2, localObject1 });
      localObject1 = new com.tencent.mm.plugin.wallet_core.c.a(locala.appId, locala.bJT, locala.nonceStr, locala.packageExt, locala.signType, locala.signature, locala.bJU, 15, "openECard", locala.bJY);
      g.Ek();
      g.Eh().dpP.a(580, new a.1.1(this, locala, paramAnonymouscn, (String)localObject2));
      g.Ek();
      g.Eh().dpP.a((l)localObject1, 0);
      return false;
    }
  };
  private c<le> pBn = new a.2(this);
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.pBm.cht();
    this.pBn.cht();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    this.pBm.dead();
    this.pBn.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
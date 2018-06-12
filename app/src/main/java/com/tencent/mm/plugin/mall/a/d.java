package com.tencent.mm.plugin.mall.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.ab.l;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class d
  implements com.tencent.mm.ab.e, ar
{
  ConcurrentHashMap<Integer, t> kYg = new ConcurrentHashMap();
  private boolean kYh = false;
  private bv.a kYi = new d.1(this);
  private bv.a kYj = new d.2(this);
  private ag mHandler = new ag(Looper.getMainLooper());
  
  public static d bbJ()
  {
    return (d)p.v(d.class);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt2 == 0) && (paramInt1 == 0) && (!this.kYh) && (q.GS()))
    {
      this.kYh = true;
      com.tencent.mm.plugin.wallet_core.model.mall.b.zn(com.tencent.mm.plugin.wallet_core.model.mall.b.prZ);
    }
  }
  
  public final void bn(boolean paramBoolean)
  {
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("mallactivity", this.kYi, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("paymsg", this.kYj, true);
    c.bPK().Wj();
    com.tencent.mm.plugin.wallet_core.model.mall.d.bPO().Wj();
    if ((q.GS()) && (q.GO())) {
      com.tencent.mm.plugin.wallet_core.model.mall.b.zn(com.tencent.mm.plugin.wallet_core.model.mall.b.prZ);
    }
    for (;;)
    {
      g.Ek();
      g.Eh().dpP.a(302, this);
      return;
      com.tencent.mm.plugin.wallet_core.model.mall.b.zn(com.tencent.mm.plugin.wallet_core.model.mall.b.prY);
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("mallactivity", this.kYi, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("paymsg", this.kYj, true);
    g.Ek();
    g.Eh().dpP.b(302, this);
  }
  
  public final t sq(int paramInt)
  {
    t localt = null;
    Object localObject1 = null;
    Object localObject2;
    if (!this.kYg.contains(Integer.valueOf(paramInt)))
    {
      localObject2 = com.tencent.mm.plugin.wallet_core.model.o.bPb();
      String str = "select * from WalletFunciontList where wallet_region = " + paramInt;
      localObject2 = ((com.tencent.mm.plugin.wallet_core.d.e)localObject2).diF.b(str, null, 2);
      x.i("MicroMsg.WalletFunctionListStg", "getWalletFunciontListInfo " + str);
      if (localObject2 != null) {
        break label132;
      }
    }
    for (;;)
    {
      if (localObject1 != null) {
        this.kYg.put(Integer.valueOf(paramInt), localObject1);
      }
      localt = (t)this.kYg.get(Integer.valueOf(paramInt));
      localObject1 = localt;
      if (localt == null) {
        localObject1 = new t();
      }
      return (t)localObject1;
      label132:
      localObject1 = localt;
      if (((Cursor)localObject2).moveToNext())
      {
        localObject1 = new t();
        ((t)localObject1).d((Cursor)localObject2);
      }
      ((Cursor)localObject2).close();
    }
  }
  
  public final ArrayList<MallFunction> sr(int paramInt)
  {
    return sq(paramInt).kXY;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mall/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
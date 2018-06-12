package com.tencent.mm.plugin.shake.b;

import android.content.Context;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class c
  extends l.b
  implements com.tencent.mm.ab.e
{
  float cXm = -85.0F;
  float cXn = -1000.0F;
  private a.a cXs = new a.a()
  {
    public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
    {
      com.tencent.mm.modelstat.e locale = com.tencent.mm.modelstat.e.RW();
      boolean bool1;
      if (paramAnonymousInt == 0)
      {
        bool1 = false;
        if (c.this.dMm != null) {
          break label100;
        }
      }
      label100:
      for (boolean bool2 = false;; bool2 = c.this.dMm.dSc)
      {
        locale.a(2002, bool1, bool2, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
        x.i("MicroMsg.ShakeFriendService", "getlocaion lat %f lng %f hasGetLbsInfo " + c.this.mLB, new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        if (paramAnonymousBoolean) {
          break label115;
        }
        return true;
        bool1 = true;
        break;
      }
      label115:
      if ((c.this.mWC) && (c.this.cXm == -85.0F) && (c.this.cXn == -1000.0F))
      {
        c.this.mWC = false;
        c.this.cXm = paramAnonymousFloat2;
        c.this.cXn = paramAnonymousFloat1;
        c.this.mLy = ((int)paramAnonymousDouble2);
        c.this.mLx = paramAnonymousInt;
        c.this.mLB = true;
      }
      return false;
    }
  };
  private Context context;
  com.tencent.mm.modelgeo.c dMm;
  boolean mLB = false;
  int mLx = 1;
  int mLy = 64536;
  boolean mWC = true;
  b mWD;
  a mWE;
  private int mWF = 0;
  ag mWG = new ag();
  Runnable mWH = new c.1(this);
  
  public c(Context paramContext, l.a parama)
  {
    super(parama);
    this.context = paramContext;
  }
  
  private void buo()
  {
    this.dMm = com.tencent.mm.modelgeo.c.OB();
    this.mWC = true;
    this.dMm.a(this.cXs, true);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    switch (paraml.getType())
    {
    }
    do
    {
      do
      {
        return;
        paramString = (b)paraml;
        if ((paramString.bun() == 3) || (paramString.bun() == 4))
        {
          x.v("MicroMsg.ShakeFriendService", "onSceneEnd ignore location report response");
          return;
        }
        if ((paramInt2 != 0) || (paramInt1 != 0) || (paramString.ret != 0))
        {
          x.e("MicroMsg.ShakeFriendService", "onSceneEnd reprot failed");
          this.mWQ.d(null, 3L);
          return;
        }
        this.mWG.postDelayed(this.mWH, 3000L);
        return;
        paramString = (a)paraml;
        if ((paramInt2 != 0) || (paramInt1 != 0) || (paramString.ret != 0))
        {
          this.mWQ.d(null, 3L);
          return;
        }
        paramString = paramString.mWA;
        if (paramString.size() == 0)
        {
          x.i("MicroMsg.ShakeFriendService", "empty shake get list");
          this.mWQ.d(null, 3L);
          return;
        }
        this.mWQ.d(paramString, 1L);
        return;
        paramString = (com.tencent.mm.plugin.shake.c.a.b)paraml;
        if ((paramInt2 == 0) && (paramInt1 == 0)) {
          break;
        }
      } while (this.mWQ == null);
      this.mWQ.a(1251, null, 2L);
      return;
    } while (this.mWQ == null);
    this.mWQ.a(1251, paramString.mXj, 1L);
  }
  
  public final void bup()
  {
    super.bup();
    au.DF().b(161, this);
    au.DF().b(162, this);
    au.DF().b(1251, this);
    if (this.dMm != null) {
      this.dMm.c(this.cXs);
    }
  }
  
  public final void init()
  {
    au.DF().a(161, this);
    au.DF().a(162, this);
    au.DF().a(1251, this);
    buo();
  }
  
  public final void pause()
  {
    if (this.dMm != null) {
      this.dMm.c(this.cXs);
    }
  }
  
  public final void reset()
  {
    if (this.mWD != null) {
      au.DF().c(this.mWD);
    }
    if (this.mWE != null) {
      au.DF().c(this.mWE);
    }
    if ((this.mWG != null) && (this.mWH != null)) {
      this.mWG.removeCallbacks(this.mWH);
    }
  }
  
  public final void resume()
  {
    if (this.dMm != null) {
      this.dMm.a(this.cXs, true);
    }
  }
  
  public final void start()
  {
    reset();
    init();
    this.mWD = new b(this.cXn, this.cXm, this.mLy, this.mLx, "", "");
    au.DF().a(this.mWD, 0);
    if (!this.mLB)
    {
      if (this.dMm == null) {
        buo();
      }
      this.dMm.b(this.cXs, true);
    }
    if (this.mWF <= 0) {}
    for (this.mWF += 1;; this.mWF = 0)
    {
      x.i("MicroMsg.ShakeFriendService", "do doGetLbsCard");
      com.tencent.mm.plugin.shake.c.a.b localb = new com.tencent.mm.plugin.shake.c.a.b(this.cXn, this.cXm);
      au.DF().a(localb, 0);
      return;
      if ((this.mWF > 0) && (this.mWF <= 10))
      {
        this.mWF += 1;
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
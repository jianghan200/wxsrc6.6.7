package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.c.c.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class g
  extends l.b
  implements com.tencent.mm.ab.e
{
  private static int mXk = 0;
  private float cXm = -85.0F;
  private float cXn = -1000.0F;
  private a.a cXs = new a.a()
  {
    public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
    {
      if (!paramAnonymousBoolean) {
        return true;
      }
      if ((g.a(g.this) == -85.0F) && (g.b(g.this) == -1000.0F))
      {
        g.a(g.this, paramAnonymousFloat2);
        g.b(g.this, paramAnonymousFloat1);
        m.buI().cXm = g.a(g.this);
        m.buI().cXn = g.b(g.this);
        if (g.c(g.this))
        {
          x.i("MicroMsg.ShakeCardService", "ShakeCardService do netscen from onGetLocation()");
          g.d(g.this);
        }
      }
      return false;
    }
  };
  private com.tencent.mm.modelgeo.c dMm;
  public String fHA = "";
  public int hop = 0;
  public int hwF;
  private boolean jOf = false;
  private ag mHandler = new ag();
  private c mXF;
  private e mXG = new e();
  private boolean mXH = false;
  private long mXl = 0L;
  
  public g(l.a parama)
  {
    super(parama);
  }
  
  private void avL()
  {
    if (this.dMm != null) {
      this.dMm.c(this.cXs);
    }
  }
  
  private void buM()
  {
    if (this.jOf)
    {
      x.i("MicroMsg.ShakeCardService", "ShakeCardService is doing doNetSceneShakeCard, return");
      return;
    }
    this.jOf = true;
    this.mXH = false;
    x.i("MicroMsg.ShakeCardService", "ShakeCardService do doNetSceneShakeCard");
    this.mXF = new c(this.cXn, this.cXm, this.hop, this.fHA);
    au.DF().a(this.mXF, 0);
  }
  
  private void buN()
  {
    long l2 = System.currentTimeMillis() / 1000L;
    if (a.vV(mXk)) {
      x.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is valid");
    }
    for (long l1 = a.vW(mXk);; l1 = a.vX(a.bva()))
    {
      x.i("MicroMsg.ShakeCardService", "ShakeCardService updateWaitingTime wait nextInterval is " + l1);
      this.mXl = (l1 + l2);
      return;
      x.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is not valid");
    }
  }
  
  private void buo()
  {
    this.dMm = com.tencent.mm.modelgeo.c.OB();
    this.dMm.a(this.cXs, true);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof c))
    {
      paraml = (c)paraml;
      paramString = this.mXG;
      paraml = paraml.mXj;
      paramString.hwF = paraml.hwF;
      paramString.huU = paraml.huU;
      paramString.cad = paraml.cad;
      paramString.title = paraml.title;
      paramString.huX = paraml.huX;
      paramString.huY = paraml.huY;
      paramString.hwh = paraml.hwh;
      paramString.huW = paraml.huW;
      paramString.dxh = paraml.dxh;
      paramString.mXk = paraml.mXk;
      paramString.mXn = paraml.mXn;
      paramString.mXo = paraml.mXo;
      paramString.mXp = paraml.mXp;
      paramString.mXq = paraml.mXq;
      paramString.mXr = paraml.mXr;
      paramString.end_time = paraml.end_time;
      paramString.mXs = paraml.mXs;
      paramString.mXt = paraml.mXt;
      this.hwF = this.mXG.hwF;
      x.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd()  action_type:" + this.hwF + "  frequency_level:" + mXk + " control_flag:" + this.mXG.mXn);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label330;
      }
      mXk = this.mXG.mXk;
      x.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd is OK ");
      if (this.mWQ != null) {
        this.mWQ.a(1250, this.mXG, 1L);
      }
      buN();
    }
    for (;;)
    {
      m.buI().mXk = mXk;
      m.buI().mXl = this.mXl;
      this.jOf = false;
      return;
      label330:
      if (((paramInt1 == 5) && (paramInt2 == -1)) || ((paramInt1 == 4) && (paramInt2 != 0)))
      {
        x.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.mWQ != null) {
          this.mWQ.a(1250, this.mXG, 2L);
        }
        long l1 = System.currentTimeMillis() / 1000L;
        long l2 = a.vX(a.bva());
        x.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd wait nextInterval is " + l2);
        this.mXl = (l1 + l2);
      }
      else
      {
        x.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.mWQ != null) {
          this.mWQ.a(1250, this.mXG, 2L);
        }
        buN();
      }
    }
  }
  
  public final void bup()
  {
    au.DF().b(1250, this);
    avL();
    super.bup();
  }
  
  public final void init()
  {
    mXk = m.buI().mXk;
    this.mXl = m.buI().mXl;
    this.cXm = m.buI().cXm;
    this.cXn = m.buI().cXn;
    au.DF().a(1250, this);
    buo();
  }
  
  public final void pause()
  {
    avL();
  }
  
  public final void reset()
  {
    if (this.mXF != null) {
      au.DF().c(this.mXF);
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
    init();
    reset();
    if (this.dMm == null) {
      buo();
    }
    this.dMm.b(this.cXs, true);
    Object localObject = m.buI();
    long l1;
    long l2;
    if ((!TextUtils.isEmpty("key_shake_card_item")) && (((d)localObject).htT.containsKey("key_shake_card_item")))
    {
      localObject = ((d)localObject).htT.get("key_shake_card_item");
      l1 = System.currentTimeMillis() / 1000L;
      l2 = this.mXl;
      if ((localObject == null) || (!(localObject instanceof e))) {
        break label150;
      }
      localObject = (e)localObject;
      this.mWQ.a(1250, (e)localObject, 1L);
      m.buI().putValue("key_shake_card_item", null);
      x.i("MicroMsg.ShakeCardService", "getlbscard return data is no empty, don't do doNetSceneShakeCard, return ok");
    }
    for (;;)
    {
      return;
      localObject = null;
      break;
      label150:
      int i;
      if (this.mXl == 0L) {
        i = 1;
      }
      while (i != 0)
      {
        if (!this.jOf) {
          break label250;
        }
        x.i("MicroMsg.ShakeCardService", "ShakeCardService is doing netscene, return");
        return;
        if (l1 - l2 >= 0L)
        {
          i = 1;
        }
        else
        {
          h.mEJ.h(11666, new Object[] { Integer.valueOf(this.hop) });
          this.mHandler.postDelayed(new Runnable()
          {
            public final void run()
            {
              g.e(g.this).hwF = 3;
              g.a(g.this, g.e(g.this).hwF);
              g.e(g.this).mXr = m.buI().mXm;
              if (g.f(g.this) != null) {
                g.g(g.this).a(1250, g.e(g.this), 2L);
              }
            }
          }, 3000L);
          x.i("MicroMsg.ShakeCardService", "ShakeCardService do not doNetSceneShakeCard, because time is not expire");
          i = 0;
        }
      }
    }
    label250:
    if ((this.cXm == -85.0F) || (this.cXn == -1000.0F))
    {
      this.mXH = true;
      x.i("MicroMsg.ShakeCardService", "ShakeCardService location is not geted, wait 4 second");
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          if (!g.h(g.this)) {
            g.d(g.this);
          }
        }
      }, 4000L);
      return;
    }
    buM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
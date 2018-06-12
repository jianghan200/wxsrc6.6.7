package com.tencent.mm.ab;

import android.os.Looper;
import com.tencent.mm.network.k;
import com.tencent.mm.network.l.a;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class r
  extends l.a
{
  private final l bKq;
  private final com.tencent.mm.network.e dIX;
  private final long dJL = 330000L;
  private q dJM;
  private k dJN;
  private boolean dJO = false;
  private boolean dJP = false;
  Runnable dJQ = new Runnable()
  {
    public final void run()
    {
      int k = 0;
      int j = 0;
      int i;
      if ((r.a(r.this)) || (r.b(r.this)))
      {
        if (r.c(r.this) == null)
        {
          i = 0;
          if (r.c(r.this) != null) {
            break label86;
          }
        }
        for (;;)
        {
          x.e("MicroMsg.RemoteOnGYNetEnd", "time exceed But removeCallbacks failed hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          return;
          i = r.c(r.this).hashCode();
          break;
          label86:
          j = r.c(r.this).getType();
        }
      }
      final boolean bool1 = r.a(r.this);
      final boolean bool2 = r.b(r.this);
      if (r.c(r.this) == null)
      {
        i = 0;
        if (r.c(r.this) != null) {
          break label232;
        }
      }
      label232:
      for (j = k;; j = r.c(r.this).getType())
      {
        x.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        r.d(r.this);
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            int j = 0;
            r.e(r.this).kh("push process's network haven't callback in 5.5min!!!! cancelStatus:" + bool1 + " hasCallbackStatus:" + bool2);
            int i;
            if (r.c(r.this) == null)
            {
              i = 0;
              if (r.c(r.this) != null) {
                break label119;
              }
            }
            for (;;)
            {
              x.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback . kill push fin. hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              return;
              i = r.c(r.this).hashCode();
              break;
              label119:
              j = r.c(r.this).getType();
            }
          }
        }, "RemoteOnGYNetEnd_killPush");
        r.g(r.this).a(-1, 3, -1, "time exceed, force to callback", r.f(r.this), null);
        return;
        i = r.c(r.this).hashCode();
        break;
      }
    }
  };
  private final e dJb;
  final ag handler;
  
  public r(q paramq, k paramk, l paraml, e parame, com.tencent.mm.network.e parame1)
  {
    this.dJM = paramq;
    this.dJN = paramk;
    this.bKq = paraml;
    this.dJb = parame;
    if (Looper.myLooper() == null) {}
    for (paramq = new ag(Looper.getMainLooper());; paramq = new ag())
    {
      this.handler = paramq;
      this.dIX = parame1;
      return;
    }
  }
  
  public final void a(final int paramInt1, final int paramInt2, final int paramInt3, final String paramString, com.tencent.mm.network.r paramr, final byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b, hash[%d,%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(this.dJO), Integer.valueOf(this.bKq.hashCode()), Integer.valueOf(this.dJM.hashCode()) });
    this.bKq.dIZ = -1;
    if (this.dJO) {}
    while (this.dJP) {
      return;
    }
    this.dJP = true;
    this.handler.removeCallbacks(this.dJQ);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        if (r.a(r.this)) {
          x.w("MicroMsg.RemoteOnGYNetEnd", "netId:%d has been canceled", new Object[] { Integer.valueOf(paramInt1) });
        }
        do
        {
          return;
          int k = paramInt2;
          int m = paramInt3;
          int i = k;
          int j = m;
          if (10016 == af.exm)
          {
            i = k;
            j = m;
            if (!bi.oW(af.exo))
            {
              x.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET : %s ", new Object[] { af.exo });
              String[] arrayOfString = af.exo.split(",");
              i = k;
              j = m;
              if (arrayOfString != null)
              {
                i = k;
                j = m;
                if (arrayOfString.length == 3)
                {
                  i = k;
                  j = m;
                  if (bi.getInt(arrayOfString[0], -1) == r.c(r.this).getType())
                  {
                    k = bi.getInt(arrayOfString[1], 0);
                    j = bi.getInt(arrayOfString[2], 0);
                    i = k;
                    if (k == 999)
                    {
                      x.w("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET syncservice : %s  NOT  CALLBACK !!!", new Object[] { af.exo });
                      return;
                    }
                  }
                }
              }
            }
          }
          x.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd after post to worker netId:%d, errType:%d, errCode:%d, isCancel:%b, hashcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(r.a(r.this)), Integer.valueOf(r.c(r.this).hashCode()) });
          r.g(r.this).a(paramInt1, i, j, paramString, r.f(r.this), paramArrayOfByte);
        } while ((!r.c(r.this).La()) || (r.c(r.this).dJc));
        x.e("MicroMsg.RemoteOnGYNetEnd", "the netscene hasn't call callback to onSceneEnd, type:%d", new Object[] { Integer.valueOf(r.c(r.this).getType()) });
        x.chR();
      }
    });
  }
  
  public final void cancel()
  {
    this.dJO = true;
    this.handler.removeCallbacks(this.dJQ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
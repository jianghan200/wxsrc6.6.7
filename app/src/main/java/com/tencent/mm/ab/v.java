package com.tencent.mm.ab;

import android.os.HandlerThread;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.e.a;

public final class v
{
  public static b dKi = null;
  
  public static boolean LO()
  {
    if (dKi == null)
    {
      x.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
      return false;
    }
    if (dKi.DG() == null)
    {
      x.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
      return false;
    }
    return true;
  }
  
  public static b a(b paramb)
  {
    a(paramb, null, false, null);
    return paramb;
  }
  
  public static b a(b paramb, a parama)
  {
    a(paramb, parama, false, null);
    return paramb;
  }
  
  public static l a(b paramb, a parama, boolean paramBoolean)
  {
    return a(paramb, parama, paramBoolean, null);
  }
  
  public static l a(b paramb, final a parama, final boolean paramBoolean, com.tencent.mm.vending.e.b paramb1)
  {
    c localc = new c(parama);
    if (parama == null) {}
    for (parama = null;; parama = localc)
    {
      if ((paramb1 != null) && (parama != null)) {
        paramb1.keep(parama);
      }
      if (dKi == null) {
        x.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
      }
      do
      {
        for (;;)
        {
          return null;
          if (dKi.DG() == null)
          {
            x.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
          }
          else
          {
            if (paramb != null) {
              break;
            }
            x.e("MicroMsg.RunCgi", "ERROR: Param CommReqResp is null");
          }
        }
        paramb = new l()
        {
          private k dIB = new k()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3, String paramAnonymous2String, q paramAnonymous2q, byte[] paramAnonymous2ArrayOfByte)
            {
              if (v.1.this.dKl != 2)
              {
                v.1.this.dKm.SO();
                v.1.this.dKl = 1;
                v.a(v.1.this.dKo, v.1.this.dKp, paramAnonymous2Int2, paramAnonymous2Int3, paramAnonymous2String, v.1.this.dKn, v.1.this.dKk);
              }
              for (;;)
              {
                v.1.this.dKj.a(paramAnonymous2Int2, paramAnonymous2Int3, paramAnonymous2String, v.1.this.dKk);
                x.i("MicroMsg.RunCgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", new Object[] { Integer.valueOf(v.1.this.dKk.hashCode()), Integer.valueOf(v.1.this.getType()), Long.valueOf(bi.VF() - v.1.this.startTime), Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(paramAnonymous2Int3), paramAnonymous2String });
                return;
                x.w("MicroMsg.RunCgi", "Has been callback by protect:%d func:%d time:%d [%d,%d,%s]", new Object[] { Integer.valueOf(v.1.this.dKk.hashCode()), Integer.valueOf(v.1.this.getType()), Long.valueOf(bi.VF() - v.1.this.startTime), Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(paramAnonymous2Int3), paramAnonymous2String });
              }
            }
          };
          e dKj = null;
          final l dKk = this;
          int dKl = 0;
          al dKm = new al(v.dKi.DG().dJt.lnJ.getLooper(), new al.a()
          {
            public final String toString()
            {
              return super.toString() + "|protectNotCallback";
            }
            
            public final boolean vD()
            {
              x.w("MicroMsg.RunCgi", "Warning: Never should go here. usr canceled:%b Or NetsceneQueue Not call onGYNetEnd! %d func:%d time:%d", new Object[] { Boolean.valueOf(v.1.this.dKk.aBS), Integer.valueOf(v.1.this.dKk.hashCode()), Integer.valueOf(v.1.this.getType()), Long.valueOf(bi.VF() - v.1.this.startTime) });
              if (v.1.this.dKk.aBS) {}
              while (v.1.this.dKl == 1) {
                return false;
              }
              v.1.this.dKl = 2;
              v.a(v.1.this.dKo, v.1.this.dKp, 3, -1, "", v.1.this.dKn, v.1.this.dKk);
              return false;
            }
          }, false);
          final long startTime = bi.VF();
          
          public final int a(com.tencent.mm.network.e paramAnonymouse, e paramAnonymouse1)
          {
            this.dKj = paramAnonymouse1;
            int i = a(paramAnonymouse, this.dKn, this.dIB);
            x.i("MicroMsg.RunCgi", "Start doScene:%d func:%d netid:%d time:%d", new Object[] { Integer.valueOf(this.dKk.hashCode()), Integer.valueOf(this.dKn.dIF), Integer.valueOf(i), Long.valueOf(bi.VF() - this.startTime) });
            if (parama != null)
            {
              if (i < 0) {
                v.a(paramBoolean, parama, 3, -1, "", this.dKn, this.dKk);
              }
            }
            else {
              return i;
            }
            this.dKm.J(60000L, 60000L);
            return i;
          }
          
          public final int getType()
          {
            return this.dKn.dIF;
          }
        };
      } while (!dKi.DG().a(paramb, 0));
      return paramb;
    }
  }
  
  public static abstract interface a
  {
    public abstract int a(int paramInt1, int paramInt2, String paramString, b paramb, l paraml);
  }
  
  public static abstract interface b
  {
    public abstract o DG();
  }
  
  private static final class c
    implements v.a, a
  {
    private v.a dKs;
    
    public c(v.a parama)
    {
      this.dKs = parama;
    }
    
    public final int a(int paramInt1, int paramInt2, String paramString, b paramb, l paraml)
    {
      if (this.dKs != null) {
        return this.dKs.a(paramInt1, paramInt2, paramString, paramb, paraml);
      }
      return -100000;
    }
    
    public final void dead()
    {
      this.dKs = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
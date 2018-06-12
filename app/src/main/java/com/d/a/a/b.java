package com.d.a.a;

import android.net.wifi.ScanResult;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.List;

abstract class b
  extends a
{
  private z bgC;
  
  b()
  {
    super(new d[] { ab.sZ(), r.sC(), u.sT(), k.sy() });
  }
  
  private void b(p paramp)
  {
    if (this.bgC != null) {}
    try
    {
      this.bgC.execute(new a(this, paramp, (byte)0));
      return;
    }
    catch (Exception paramp) {}
  }
  
  k.a a(d.a parama)
  {
    if (parama == null) {
      return null;
    }
    return new k.a(Math.max(parama.bgK, 10000L));
  }
  
  abstract void a(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, long paramLong1, long paramLong2);
  
  abstract void a(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, float paramFloat4, float paramFloat5, long paramLong);
  
  abstract void a(int paramInt, String paramString, long paramLong1, long paramLong2);
  
  void a(Handler paramHandler, d.a parama)
  {
    if (paramHandler == null) {
      try
      {
        throw new Exception("CoreAssembly: master thread handler must be specified and cannot be null");
      }
      finally {}
    }
    this.bgC = z.a(paramHandler);
    super.a(paramHandler, parama);
  }
  
  final void a(Handler paramHandler, Handler[] paramArrayOfHandler)
  {
    paramArrayOfHandler[0] = paramHandler;
    paramArrayOfHandler[1] = null;
    paramArrayOfHandler[2] = paramHandler;
    paramArrayOfHandler[3] = paramHandler;
  }
  
  final void a(d.a parama, d.a[] paramArrayOfa)
  {
    paramArrayOfa[0] = parama;
    paramArrayOfa[1] = null;
    paramArrayOfa[2] = null;
    paramArrayOfa[3] = a(parama);
  }
  
  public void a(p paramp)
  {
    switch (paramp.what)
    {
    default: 
      return;
    case 101: 
      a(((ab.a)paramp).bng, paramp.bjx, paramp.bjy);
      return;
    case 201: 
      b(paramp);
      return;
    case 202: 
      b(paramp);
      return;
    case 301: 
      paramp = (u.e)paramp;
      a(paramp.x, paramp.y, paramp.blZ, paramp.blX, paramp.blY, paramp.aex, paramp.bjy);
      return;
    }
    paramp = (k.b)paramp;
    a(paramp.lat, paramp.lng, Double.valueOf(paramp.biE).intValue(), Math.round(paramp.biF), Math.round(paramp.aex), paramp.biH, paramp.biI, paramp.biG, paramp.biJ, paramp.bjy);
  }
  
  abstract void a(x paramx, long paramLong1, long paramLong2);
  
  abstract void a(List<ScanResult> paramList, long paramLong1, long paramLong2);
  
  private static final class a
    implements Runnable
  {
    private final WeakReference<b> bgD;
    private final p bgE;
    
    private a(b paramb, p paramp)
    {
      if ((paramb == null) || (paramp == null)) {
        throw new Exception("CoreAssembly: HandleMsgTask: null arg");
      }
      this.bgD = new WeakReference(paramb);
      this.bgE = paramp;
    }
    
    public final void run()
    {
      b localb = (b)this.bgD.get();
      if (localb != null) {}
      switch (this.bgE.what)
      {
      default: 
        return;
      }
      r.f localf = (r.f)this.bgE;
      if (localf.bjW == 1)
      {
        localb.a(localf.bjX, localf.bjx, localf.bjy);
        return;
      }
      localb.a(localf.bjW, localf.message, localf.bjx, localf.bjy);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/d/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
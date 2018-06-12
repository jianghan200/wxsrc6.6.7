package com.tencent.mm.modelgeo;

import android.content.Context;
import android.location.LocationManager;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  implements a
{
  public static c dMm;
  List<WeakReference<a.a>> avD = new ArrayList();
  double bhF = 0.0D;
  public boolean dSc = false;
  g dSd;
  long dSe = 0L;
  public long dSf = 0L;
  boolean dSg = false;
  public boolean dSh = false;
  double dSi = 23.0D;
  double dSj = 100.0D;
  int dSk = 0;
  double dSl = 0.0D;
  double dSm = 0.0D;
  String dSn;
  String dSo;
  int dSp;
  private boolean dSq = false;
  private boolean dSr = false;
  private e dSs = new c.1(this);
  private f dSt = new c.2(this);
  private ag dvh = new ag(Looper.getMainLooper());
  private Context mContext;
  
  private c(Context paramContext)
  {
    this.mContext = paramContext;
    this.dSd = g.bM(paramContext);
  }
  
  public static c OB()
  {
    if (dMm == null) {
      dMm = new c(ad.getContext());
    }
    return dMm;
  }
  
  public static boolean OC()
  {
    try
    {
      boolean bool = ((LocationManager)ad.getContext().getSystemService("location")).isProviderEnabled("gps");
      return bool;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.LocationGeo", "exception:%s", new Object[] { bi.i(localException) });
    }
    return false;
  }
  
  public static boolean OD()
  {
    try
    {
      boolean bool = ((LocationManager)ad.getContext().getSystemService("location")).isProviderEnabled("network");
      return bool;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.LocationGeo", "exception:%s", new Object[] { bi.i(localException) });
    }
    return false;
  }
  
  public final void a(a.a parama)
  {
    b(parama, true);
  }
  
  public final void a(a.a parama, boolean paramBoolean)
  {
    x.i("MicroMsg.LocationGeo", "startWgs84 %s userCache %s delay %d", new Object[] { parama, Boolean.valueOf(paramBoolean), Integer.valueOf(0) });
    if ((this.dSc) && (this.avD.size() > 0)) {}
    try
    {
      this.dSe = System.currentTimeMillis();
      this.dSq = false;
      this.dSr = false;
      g.OF();
      g.a(this.dSt, 0, Looper.getMainLooper());
      this.dSc = false;
      Iterator localIterator = this.avD.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localWeakReference = (WeakReference)localIterator.next();
      } while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((a.a)localWeakReference.get()).equals(parama)));
      i = 0;
      if (i != 0) {
        this.avD.add(new WeakReference(parama));
      }
      x.i("MicroMsg.LocationGeo", "add listeners size %d", new Object[] { Integer.valueOf(this.avD.size()) });
      if ((this.avD.size() != 1) || (i == 0)) {}
    }
    catch (g.a locala)
    {
      for (;;)
      {
        try
        {
          this.dSe = System.currentTimeMillis();
          this.dSq = false;
          this.dSr = false;
          g.a(this.dSt, 0, Looper.getMainLooper());
          if ((paramBoolean) && (this.dSh) && (System.currentTimeMillis() - this.dSf < 60000L)) {
            this.dSt.a(true, this.dSi, this.dSj, this.dSk, this.dSl, this.dSm, this.bhF, this.dSn, this.dSo, this.dSp);
          }
          return;
          locala = locala;
          x.d("MicroMsg.LocationGeo", locala.toString());
        }
        catch (g.a parama)
        {
          x.d("MicroMsg.LocationGeo", parama.toString());
          continue;
        }
        int i = 1;
      }
    }
  }
  
  public final void b(a.a parama)
  {
    a(parama, true);
  }
  
  public final void b(a.a parama, boolean paramBoolean)
  {
    if ((!this.dSc) && (this.avD.size() > 0)) {}
    try
    {
      this.dSe = System.currentTimeMillis();
      this.dSq = false;
      this.dSr = false;
      g.OF();
      g.a(this.dSs, 1, Looper.getMainLooper());
      this.dSc = true;
      Iterator localIterator = this.avD.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localWeakReference = (WeakReference)localIterator.next();
      } while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((a.a)localWeakReference.get()).equals(parama)));
      i = 0;
      if (i != 0) {
        this.avD.add(new WeakReference(parama));
      }
      x.i("MicroMsg.LocationGeo", "add listeners size %d", new Object[] { Integer.valueOf(this.avD.size()) });
      if ((this.avD.size() != 1) || (i == 0)) {}
    }
    catch (g.a locala)
    {
      for (;;)
      {
        try
        {
          this.dSe = System.currentTimeMillis();
          this.dSq = false;
          this.dSr = false;
          g.a(this.dSs, 1, Looper.getMainLooper());
          if ((paramBoolean) && (this.dSg) && (System.currentTimeMillis() - this.dSf < 60000L)) {
            this.dSs.a(true, this.dSi, this.dSj, this.dSk, this.dSl, this.dSm, this.bhF, this.dSn, this.dSo, this.dSp);
          }
          return;
          locala = locala;
          x.d("MicroMsg.LocationGeo", locala.toString());
        }
        catch (g.a parama)
        {
          x.d("MicroMsg.LocationGeo", parama.toString());
          continue;
        }
        int i = 1;
      }
    }
  }
  
  public final void c(a.a parama)
  {
    new ag().post(new c.3(this, parama));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelgeo/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
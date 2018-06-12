package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

final class n
{
  static final a FF = new a((byte)0);
  private final LocationManager FG;
  final Context mContext;
  
  n(Context paramContext)
  {
    this.mContext = paramContext;
    this.FG = ((LocationManager)paramContext.getSystemService("location"));
  }
  
  static boolean a(a parama)
  {
    return (parama != null) && (parama.FM > System.currentTimeMillis());
  }
  
  static void d(Location paramLocation)
  {
    a locala = FF;
    long l1 = System.currentTimeMillis();
    if (m.FC == null) {
      m.FC = new m();
    }
    m localm = m.FC;
    localm.a(l1 - 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l2 = localm.FD;
    localm.a(l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    if (localm.state == 1) {}
    long l3;
    long l4;
    long l5;
    for (boolean bool = true;; bool = false)
    {
      l3 = localm.FE;
      l4 = localm.FD;
      localm.a(86400000L + l1, paramLocation.getLatitude(), paramLocation.getLongitude());
      l5 = localm.FE;
      if ((l3 != -1L) && (l4 != -1L)) {
        break;
      }
      l1 = 43200000L + l1;
      locala.FH = bool;
      locala.FI = l2;
      locala.FJ = l3;
      locala.FK = l4;
      locala.FL = l5;
      locala.FM = l1;
      return;
    }
    if (l1 > l4) {
      l1 = 0L + l5;
    }
    for (;;)
    {
      l1 += 60000L;
      break;
      if (l1 > l3) {
        l1 = 0L + l4;
      } else {
        l1 = 0L + l3;
      }
    }
  }
  
  final Location M(String paramString)
  {
    if (this.FG != null) {
      try
      {
        if (this.FG.isProviderEnabled(paramString))
        {
          paramString = this.FG.getLastKnownLocation(paramString);
          return paramString;
        }
      }
      catch (Exception paramString) {}
    }
    return null;
  }
  
  private static final class a
  {
    boolean FH;
    long FI;
    long FJ;
    long FK;
    long FL;
    long FM;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
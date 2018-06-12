package c.t.m.g;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dt
  extends ds
{
  public static final dt a = new dt(Collections.emptyList(), 0L);
  public final List<ScanResult> b;
  public final long c;
  
  public dt(List<ScanResult> paramList, long paramLong)
  {
    this.c = paramLong;
    this.b = new ArrayList(paramList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/c/t/m/g/dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
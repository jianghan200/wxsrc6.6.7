package c.t.m.g;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public final class am
  extends as
{
  public final boolean a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean, Object paramObject, as.a parama)
  {
    long l = SystemClock.elapsedRealtime();
    this.b = parama;
    this.a = paramObject;
    parama = new HashMap();
    parama.put("B-Length", String.valueOf(paramInt));
    if (paramBoolean) {}
    for (paramObject = "realtime_speed";; paramObject = "hllog")
    {
      parama.put("HLReportCmd", paramObject);
      paramArrayOfByte = ag.a("https://up-hl.3g.qq.com/upreport", parama, paramArrayOfByte, 20000, ci.d(), null);
      paramArrayOfByte.o = "event";
      paramArrayOfByte = new an(this, paramArrayOfByte, l);
      try
      {
        y.a.a().a.execute(paramArrayOfByte);
        return true;
      }
      catch (Throwable paramArrayOfByte)
      {
        this.b.a(false, this.a);
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/c/t/m/g/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
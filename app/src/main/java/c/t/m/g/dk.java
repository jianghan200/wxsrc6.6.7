package c.t.m.g;

import android.os.Handler;
import android.os.SystemClock;
import com.tencent.map.geolocation.internal.TencentLogImpl;
import com.tencent.tencentmap.lbssdk.service.e;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public final class dk
{
  final LinkedBlockingQueue<a> a;
  final ct b;
  long c;
  long d;
  long e;
  long f;
  volatile boolean g;
  boolean h;
  volatile Handler i;
  
  dk(ct paramct)
  {
    this.b = paramct;
    this.a = new LinkedBlockingQueue(3);
  }
  
  private static String a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((!TencentLogImpl.isDebugEnabled()) && (paramArrayOfByte != null)) {}
    try
    {
      if (e.o(paramArrayOfByte, 1) < 0) {
        return dd.a(paramInt, 0);
      }
      paramArrayOfByte = dd.a(paramInt, 1);
      return paramArrayOfByte;
    }
    catch (UnsatisfiedLinkError paramArrayOfByte) {}
    return null;
  }
  
  public final void a(String paramString, dr paramdr, int paramInt)
  {
    try
    {
      byte[] arrayOfByte = j.a(paramString.getBytes("GBK"));
      paramdr = new a(1, arrayOfByte, a(arrayOfByte, paramInt), paramdr);
      paramdr.b = paramString;
      a(paramdr);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  final boolean a(a parama)
  {
    SystemClock.elapsedRealtime();
    if (a.a(parama) != null) {}
    for (boolean bool = this.a.offer(parama);; bool = false)
    {
      String str;
      if (!bool)
      {
        this.a.clear();
        this.a.offer(parama);
        str = "Location";
        if (a.b(parama) != 2) {
          break label75;
        }
        str = "List";
      }
      for (;;)
      {
        new StringBuilder("post").append(str).append("Request: failed to add request,because the queue has full,so we delete the first");
        return bool;
        label75:
        if (a.b(parama) == 3) {
          str = "Wifis";
        } else if (a.b(parama) == 4) {
          str = "EventTrack";
        }
      }
    }
  }
  
  final void b(a parama)
  {
    a.d(parama);
    Iterator localIterator = this.a.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (a.b((a)localIterator.next()) != a.b(parama));
    for (int j = 1;; j = 0)
    {
      if ((a.e(parama) > 0) && (j == 0))
      {
        new StringBuilder("retryIfNeed: times=").append(a.e(parama));
        this.a.offer(parama);
      }
      return;
    }
  }
  
  static final class a
  {
    public static final a d = new a();
    final Object a;
    public String b;
    public long c;
    private final int e;
    private final byte[] f;
    private final String g;
    private int h = 1;
    
    private a()
    {
      this.e = 0;
      this.f = null;
      this.g = null;
      this.a = null;
    }
    
    a(int paramInt, byte[] paramArrayOfByte, String paramString, Object paramObject)
    {
      this.e = paramInt;
      this.f = paramArrayOfByte;
      this.g = paramString;
      this.a = paramObject;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package c.t.m.g;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class i
  implements e
{
  public String a;
  public byte[] b;
  public Map<String, String> c;
  public boolean d = true;
  public int e = -1;
  public String f = "";
  public volatile boolean g = false;
  public int h = 0;
  public boolean i = true;
  CountDownLatch j = new CountDownLatch(1);
  public volatile boolean k = false;
  public long l;
  private aj m;
  
  public i(String paramString, byte[] paramArrayOfByte)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
    this.f = ci.d();
  }
  
  public final String a()
  {
    return this.f;
  }
  
  public final void a(aj paramaj)
  {
    try
    {
      this.m = paramaj;
      return;
    }
    finally
    {
      paramaj = finally;
      throw paramaj;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (this.c == null) {
      this.c = new HashMap();
    }
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      this.c.put(paramString1, paramString2);
    }
  }
  
  public final void b()
  {
    this.h = 15000;
  }
  
  public final boolean c()
  {
    try
    {
      boolean bool = this.j.await(this.h, TimeUnit.MILLISECONDS);
      return bool;
    }
    catch (InterruptedException localInterruptedException) {}
    return true;
  }
  
  public final aj d()
  {
    try
    {
      aj localaj = this.m;
      return localaj;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("url:" + this.a);
    localStringBuilder.append(",body:" + ci.b(this.b));
    localStringBuilder.append(",isGet:false");
    localStringBuilder.append(",timeout:" + this.e);
    localStringBuilder.append(",tag:" + null);
    localStringBuilder.append(",httpCallback:" + null);
    localStringBuilder.append(",testMode:0");
    localStringBuilder.append(",httpCallback:" + null);
    localStringBuilder.append(",testMode:0");
    localStringBuilder.append(",followRedirects:" + this.d);
    localStringBuilder.append(",isAbort:" + this.g);
    localStringBuilder.append(",headers:" + this.c);
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
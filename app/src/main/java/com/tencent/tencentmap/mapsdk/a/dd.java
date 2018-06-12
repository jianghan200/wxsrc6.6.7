package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class dd
{
  private static dd a = null;
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private String f = "";
  private String g = "";
  
  private dd(Context paramContext)
  {
    if (paramContext == null) {
      ct.d(" DetailUserInfo context == null? pls check!", new Object[0]);
    }
    ct.b(" start to create DetailUserInfo", new Object[0]);
    long l = System.currentTimeMillis();
    e.a(paramContext);
    this.b = e.b(paramContext);
    ct.b(" imei:" + this.b, new Object[0]);
    if (!"".equals(this.b)) {}
    try
    {
      if ("".equals(a.b(paramContext, "IMEI_DENGTA", ""))) {
        a.a(paramContext, "IMEI_DENGTA", this.b);
      }
      this.e = e.d(paramContext);
      this.f = a.b(paramContext, "QIMEI_DENGTA", "");
      StringBuilder localStringBuilder;
      if ("".equals(this.f))
      {
        if (this.b.equals(""))
        {
          str = this.e;
          this.f = str;
        }
      }
      else
      {
        if (da.a == null) {
          da.a = new HashMap();
        }
        da.a.put("A3", this.f);
        this.c = e.e(paramContext);
        if ("".equals(this.c))
        {
          localStringBuilder = new StringBuilder();
          str = e.e("/sys/class/net/eth0/address");
          if ((!str.trim().equals("")) && (str.length() >= 17)) {
            break label458;
          }
        }
      }
      label458:
      for (String str = "";; str = str.toLowerCase().substring(0, 17))
      {
        this.c = str;
        this.d = e.c(paramContext);
        new StringBuilder().append(e.d());
        new StringBuilder().append(e.e()).append("m");
        this.g = e.f();
        ct.b(" detail create cost: %d  values:\n %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), toString() });
        return;
        str = this.b;
        break;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static dd a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new dd(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public final String a()
  {
    try
    {
      String str = this.b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String b()
  {
    try
    {
      String str = this.c;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String c()
  {
    try
    {
      String str = this.d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String d()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String e()
  {
    try
    {
      String str = this.f;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String f()
  {
    return this.g;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
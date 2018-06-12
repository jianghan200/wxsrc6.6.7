package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import java.util.Vector;

public class f
{
  private String a = "";
  private String b = "";
  private int c = 0;
  private String d = "";
  private Handler e;
  
  public f(Context paramContext)
  {
    if (paramContext != null) {
      this.e = new Handler(paramContext.getMainLooper());
    }
  }
  
  private String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      return paramString;
    }
    int i = paramString.indexOf("?");
    if (i != -1) {}
    for (String str = paramString.substring(0, i);; str = paramString)
    {
      if ((str == null) || (str.length() == 0)) {
        return null;
      }
      i = str.lastIndexOf("/");
      paramString = str;
      if (i != -1) {
        paramString = str.substring(i + 1);
      }
      if ((paramString == null) || (paramString.length() == 0)) {
        return null;
      }
      i = paramString.indexOf(".");
      str = paramString;
      if (i != -1) {
        str = paramString.substring(0, i);
      }
      if (str != null)
      {
        paramString = str;
        if (str.length() != 0) {
          break;
        }
      }
      return null;
    }
  }
  
  private String a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      paramString1 = null;
      return paramString1;
    }
    String str = paramString1.toLowerCase();
    paramString2 = paramString2.split("[?&]");
    int j = paramString2.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label112;
      }
      paramString1 = paramString2[i];
      if (paramString1.indexOf("=") != -1)
      {
        paramString1 = paramString1.split("[=]");
        if (paramString1.length == 2)
        {
          Object localObject = paramString1[0];
          paramString1 = paramString1[1];
          if ((localObject != null) && (((String)localObject).toLowerCase().equalsIgnoreCase(str))) {
            break;
          }
        }
      }
      i += 1;
    }
    label112:
    return null;
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, a parama)
  {
    new f.2(this, "getRTMPAccUrl", paramString2, paramString1, paramString3, paramString4, paramInt, parama).start();
  }
  
  public int a(String paramString, int paramInt, a parama)
  {
    this.a = "";
    this.b = "";
    this.c = 0;
    this.d = "";
    if ((paramString == null) || (paramString.isEmpty())) {
      return -1;
    }
    String str1 = a(paramString);
    if ((str1 == null) || (str1.isEmpty())) {
      return -2;
    }
    String str2 = a("bizid", paramString);
    String str3 = a("txSecret", paramString);
    paramString = a("txTime", paramString);
    if ((str2 == null) || (str2.isEmpty()) || (str3 == null) || (str3.isEmpty()) || (paramString == null) || (paramString.isEmpty())) {
      return -3;
    }
    a(str1, str2, str3, paramString, paramInt, new f.1(this, str1, str2, str3, paramString, parama));
    return 0;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, String paramString, Vector<d> paramVector);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/network/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
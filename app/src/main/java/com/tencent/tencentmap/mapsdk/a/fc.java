package com.tencent.tencentmap.mapsdk.a;

import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public final class fc
  implements ex
{
  public int a = 1;
  public Exception b = null;
  public String c = null;
  public String d = null;
  public byte[] e = null;
  public InputStream f = null;
  public int g = 0;
  public int h = 0;
  public int i = 0;
  public HttpResponse j;
  public int k = 0;
  public String l = "";
  public String m = "";
  
  public final int a()
  {
    return this.a;
  }
  
  public final String a(String paramString)
  {
    if (this.j != null)
    {
      paramString = this.j.getFirstHeader(paramString);
      if (paramString != null) {
        return paramString.getValue();
      }
    }
    return null;
  }
  
  public final Exception b()
  {
    return this.b;
  }
  
  public final byte[] c()
  {
    return this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Set;

public class dj
  extends ci
{
  protected HashMap<String, byte[]> e = null;
  md f = new md();
  private HashMap<String, Object> g = new HashMap();
  
  public <T> T a(String paramString, boolean paramBoolean, ClassLoader paramClassLoader)
  {
    if (this.e != null) {
      throw new RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy)");
    }
    return (T)super.a(paramString, paramBoolean, paramClassLoader);
  }
  
  public <T> void a(String paramString, T paramT)
  {
    if (this.e != null)
    {
      if (paramString == null) {
        throw new IllegalArgumentException("put key can not is null");
      }
      if (paramT == null) {
        throw new IllegalArgumentException("put value can not is null");
      }
      if ((paramT instanceof Set)) {
        throw new IllegalArgumentException("can not support Set");
      }
      me localme = new me();
      localme.a(this.c);
      localme.a(paramT, 0);
      paramT = mg.a(localme.a());
      this.e.put(paramString, paramT);
      return;
    }
    super.a(paramString, paramT);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    try
    {
      super.a(paramArrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      this.f.a(paramArrayOfByte);
      this.f.a(this.c);
      paramArrayOfByte = new HashMap(1);
      paramArrayOfByte.put("", new byte[0]);
      this.e = this.f.a(paramArrayOfByte, 0, false);
    }
  }
  
  public byte[] a()
  {
    if (this.e != null)
    {
      me localme = new me(0);
      localme.a(this.c);
      localme.a(this.e, 0);
      return mg.a(localme.a());
    }
    return super.a();
  }
  
  public <T> T b(String paramString)
  {
    return (T)a(paramString, true, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
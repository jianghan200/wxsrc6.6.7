package com.tencent.tencentmap.mapsdk.a;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class ek
  extends dj
{
  static HashMap<String, byte[]> h = null;
  static HashMap<String, HashMap<String, byte[]>> i = null;
  protected io g = new io();
  private int j = 0;
  private int k = 0;
  
  public ek()
  {
    this.g.a = 2;
  }
  
  private void b()
  {
    md localmd = new md(this.g.g);
    localmd.a(this.c);
    if (h == null)
    {
      HashMap localHashMap = new HashMap();
      h = localHashMap;
      localHashMap.put("", new byte[0]);
    }
    this.e = localmd.a(h, 0, false);
  }
  
  private void c()
  {
    md localmd = new md(this.g.g);
    localmd.a(this.c);
    if (i == null)
    {
      i = new HashMap();
      HashMap localHashMap = new HashMap();
      localHashMap.put("", new byte[0]);
      i.put("", localHashMap);
    }
    this.a = localmd.a(i, 0, false);
    this.b = new HashMap();
  }
  
  public void a(int paramInt)
  {
    this.g.d = paramInt;
  }
  
  public <T> void a(String paramString, T paramT)
  {
    if (paramString.startsWith(".")) {
      throw new IllegalArgumentException("put name can not startwith . , now is " + paramString);
    }
    super.a(paramString, paramT);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 4) {
      throw new IllegalArgumentException("decode package must include size head");
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, 4);
    localByteBuffer.put(arrayOfByte).flip();
    this.j = localByteBuffer.getInt();
    try
    {
      paramArrayOfByte = new md(paramArrayOfByte, 4);
      paramArrayOfByte.a(this.c);
      this.g.readFrom(paramArrayOfByte);
      if (this.g.a == 3)
      {
        b();
        return;
      }
      this.e = null;
      c();
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      throw new RuntimeException(paramArrayOfByte);
    }
  }
  
  public byte[] a()
  {
    if (this.g.a == 2)
    {
      if ((this.g.e == null) || (this.g.e.equals(""))) {
        throw new IllegalArgumentException("servantName can not is null");
      }
      if ((this.g.f == null) || (this.g.f.equals(""))) {
        throw new IllegalArgumentException("funcName can not is null");
      }
    }
    else
    {
      if (this.g.e == null) {
        this.g.e = "";
      }
      if (this.g.f == null) {
        this.g.f = "";
      }
    }
    Object localObject = new me(0);
    ((me)localObject).a(this.c);
    if ((this.g.a == 2) || (this.g.a == 1)) {
      ((me)localObject).a(this.a, 0);
    }
    for (;;)
    {
      this.g.g = mg.a(((me)localObject).a());
      localObject = new me(0);
      ((me)localObject).a(this.c);
      this.g.writeTo((me)localObject);
      localObject = mg.a(((me)localObject).a());
      int m = localObject.length;
      ByteBuffer localByteBuffer = ByteBuffer.allocate(m + 4);
      localByteBuffer.putInt(m + 4).put((byte[])localObject).flip();
      return localByteBuffer.array();
      ((me)localObject).a(this.e, 0);
    }
  }
  
  public void c(String paramString)
  {
    this.g.e = paramString;
  }
  
  public void d(String paramString)
  {
    this.g.f = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
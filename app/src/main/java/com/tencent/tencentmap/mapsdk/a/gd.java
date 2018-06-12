package com.tencent.tencentmap.mapsdk.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

public final class gd
{
  private static HashMap e = null;
  private HashMap a = new HashMap();
  private ga b = new ga();
  private String c = "GBK";
  private ge d = new ge();
  
  public final void a(int paramInt)
  {
    this.d.b = paramInt;
  }
  
  public final void a(String paramString)
  {
    this.d.d = paramString;
  }
  
  public final void a(String paramString, Object paramObject)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("put key can not is null");
    }
    if (paramObject == null) {
      throw new IllegalArgumentException("put value can not is null");
    }
    if ((paramObject instanceof Set)) {
      throw new IllegalArgumentException("can not support Set");
    }
    Object localObject = new gb();
    ((gb)localObject).a(this.c);
    ((gb)localObject).a(paramObject, 0);
    paramObject = ((gb)localObject).a();
    localObject = new byte[((ByteBuffer)paramObject).position()];
    System.arraycopy(((ByteBuffer)paramObject).array(), 0, localObject, 0, localObject.length);
    this.a.put(paramString, localObject);
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 4) {
      throw new IllegalArgumentException("decode package must include size head");
    }
    try
    {
      paramArrayOfByte = new ga(paramArrayOfByte, 4);
      paramArrayOfByte.a(this.c);
      this.d.a(paramArrayOfByte);
      paramArrayOfByte = new ga(this.d.e);
      paramArrayOfByte.a(this.c);
      if (e == null)
      {
        HashMap localHashMap = new HashMap();
        e = localHashMap;
        localHashMap.put("", new byte[0]);
      }
      this.a = paramArrayOfByte.a(e, 0, false);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      throw new RuntimeException(paramArrayOfByte);
    }
  }
  
  public final byte[] a()
  {
    Object localObject2 = new gb(0);
    ((gb)localObject2).a(this.c);
    ((gb)localObject2).a(this.a, 0);
    this.d.a = 3;
    Object localObject1 = this.d;
    localObject2 = ((gb)localObject2).a();
    byte[] arrayOfByte = new byte[((ByteBuffer)localObject2).position()];
    System.arraycopy(((ByteBuffer)localObject2).array(), 0, arrayOfByte, 0, arrayOfByte.length);
    ((ge)localObject1).e = arrayOfByte;
    localObject1 = new gb(0);
    ((gb)localObject1).a(this.c);
    this.d.a((gb)localObject1);
    localObject2 = ((gb)localObject1).a();
    localObject1 = new byte[((ByteBuffer)localObject2).position()];
    System.arraycopy(((ByteBuffer)localObject2).array(), 0, localObject1, 0, localObject1.length);
    int i = localObject1.length;
    localObject2 = ByteBuffer.allocate(i + 4);
    ((ByteBuffer)localObject2).putInt(i + 4).put((byte[])localObject1).flip();
    return ((ByteBuffer)localObject2).array();
  }
  
  public final Object b(String paramString, Object paramObject)
  {
    if (!this.a.containsKey(paramString)) {
      return null;
    }
    paramString = (byte[])this.a.get(paramString);
    try
    {
      this.b.a(paramString);
      this.b.a(this.c);
      paramString = this.b.a(paramObject, 0, true);
      return paramString;
    }
    catch (Exception paramString)
    {
      throw new Exception(paramString);
    }
  }
  
  public final void b(String paramString)
  {
    this.d.c = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
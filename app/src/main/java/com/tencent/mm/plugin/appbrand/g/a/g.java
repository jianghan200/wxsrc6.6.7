package com.tencent.mm.plugin.appbrand.g.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class g
  implements a
{
  private final AtomicInteger get = new AtomicInteger(0);
  private final HashMap<Integer, ByteBuffer> geu = new HashMap();
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    if ((paramByteBuffer == null) || (!paramByteBuffer.isDirect())) {}
    while (!this.geu.containsKey(Integer.valueOf(paramInt))) {
      return;
    }
    this.geu.put(Integer.valueOf(paramInt), paramByteBuffer);
  }
  
  public final int aky()
  {
    Integer localInteger = Integer.valueOf(this.get.addAndGet(1));
    this.geu.put(localInteger, null);
    return localInteger.intValue();
  }
  
  public final ByteBuffer jA(int paramInt)
  {
    if (!this.geu.containsKey(Integer.valueOf(paramInt))) {
      return null;
    }
    ByteBuffer localByteBuffer = (ByteBuffer)this.geu.get(Integer.valueOf(paramInt));
    this.geu.remove(Integer.valueOf(paramInt));
    return localByteBuffer;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
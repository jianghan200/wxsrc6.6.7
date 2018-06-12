package com.tencent.mm.plugin.appbrand.game;

import com.tencent.magicbrush.a.c.f;
import com.tencent.magicbrush.engine.JsEngine;
import com.tencent.magicbrush.engine.b;
import com.tencent.mm.plugin.appbrand.g.a;
import com.tencent.mm.plugin.appbrand.g.d;
import java.nio.ByteBuffer;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public enum j
  implements d, com.tencent.mm.plugin.appbrand.g.f
{
  volatile f fAg;
  final AtomicInteger fAh = new AtomicInteger(0);
  final TreeMap<Integer, a> fAi = new TreeMap();
  
  private j() {}
  
  public final a agg()
  {
    return this.fAg;
  }
  
  public final a agh()
  {
    int i = this.fAh.addAndGet(1);
    f localf = new f(false, new b(this.fAg.fzY.tb()), i);
    this.fAi.put(Integer.valueOf(i), localf);
    return localf;
  }
  
  public final boolean agi()
  {
    return true;
  }
  
  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    return this.fAg.fzY.getNativeBuffer(paramInt);
  }
  
  public final int getNativeBufferId()
  {
    f localf = this.fAg;
    return JsEngine.getNativeBufferId();
  }
  
  public final a kl(int paramInt)
  {
    return (a)this.fAi.get(Integer.valueOf(paramInt));
  }
  
  public final void km(int paramInt)
  {
    a locala = (a)this.fAi.get(Integer.valueOf(paramInt));
    if (locala != null) {
      locala.destroy();
    }
    this.fAi.remove(Integer.valueOf(paramInt));
  }
  
  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    Object localObject = this.fAg;
    if (paramByteBuffer == null)
    {
      c.f.d("JsVmContext", "JsVmContext setNativeBuffer failed. byteBuffer == null", new Object[0]);
      return;
    }
    localObject = paramByteBuffer;
    if (!paramByteBuffer.isDirect())
    {
      localObject = ByteBuffer.allocateDirect(paramByteBuffer.capacity());
      paramByteBuffer.rewind();
      ((ByteBuffer)localObject).put(paramByteBuffer);
    }
    JsEngine.setNativeBuffer(paramInt, (ByteBuffer)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
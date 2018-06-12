package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.f.b;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public abstract interface a
{
  public abstract int config(Surface paramSurface);
  
  public abstract void decode(b paramb);
  
  public abstract boolean isHevc();
  
  public abstract void setListener(d paramd);
  
  public abstract void setNotifyListener(WeakReference<com.tencent.liteav.basic.c.a> paramWeakReference);
  
  public abstract int start(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void stop();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/videodecoder/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
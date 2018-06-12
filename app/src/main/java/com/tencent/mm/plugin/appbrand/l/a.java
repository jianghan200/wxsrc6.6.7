package com.tencent.mm.plugin.appbrand.l;

import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class a
  extends InputStream
{
  public final ByteBuffer gqu;
  private int gqv;
  
  public a(ByteBuffer paramByteBuffer)
  {
    this.gqu = paramByteBuffer;
  }
  
  public static void j(ByteBuffer paramByteBuffer)
  {
    Object localObject;
    if (paramByteBuffer.getClass().getName().equals("java.nio.DirectByteBuffer")) {
      localObject = paramByteBuffer.getClass();
    }
    try
    {
      localObject = ((Class)localObject).getDeclaredMethod("free", new Class[0]);
      boolean bool = ((Method)localObject).isAccessible();
      ((Method)localObject).setAccessible(true);
      ((Method)localObject).invoke(paramByteBuffer, new Object[0]);
      ((Method)localObject).setAccessible(bool);
      System.gc();
      return;
    }
    catch (Exception paramByteBuffer)
    {
      for (;;)
      {
        x.d("MicroMsg.ByteBufferBackedInputStream", "free ByteBuffer, exp = %s", new Object[] { paramByteBuffer });
      }
    }
  }
  
  public final int available()
  {
    return this.gqu.remaining();
  }
  
  public final void close()
  {
    super.close();
    j(this.gqu);
  }
  
  public final void mark(int paramInt)
  {
    try
    {
      this.gqv = this.gqu.position();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean markSupported()
  {
    return true;
  }
  
  public final int read()
  {
    if (this.gqu.hasRemaining()) {
      return this.gqu.get() & 0xFF;
    }
    return -1;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.gqu.hasRemaining()) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, this.gqu.remaining());
    this.gqu.get(paramArrayOfByte, paramInt1, paramInt2);
    return paramInt2;
  }
  
  public final void reset()
  {
    try
    {
      this.gqu.position(this.gqv);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void seek(int paramInt)
  {
    try
    {
      this.gqu.position(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
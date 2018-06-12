package com.tencent.mm.plugin.appbrand.s.d;

import com.tencent.mm.plugin.appbrand.s.c.c;
import java.nio.ByteBuffer;

public final class b
  extends e
  implements a
{
  static final ByteBuffer gDG = ByteBuffer.allocate(0);
  private int code;
  private String gDH;
  
  public b()
  {
    super(d.a.gDN);
    dg(true);
  }
  
  public b(int paramInt, String paramString)
  {
    super(d.a.gDN);
    dg(true);
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 1015)
      {
        paramString = "";
        i = 1005;
      }
      if (i == 1005)
      {
        if (paramString.length() > 0) {
          throw new com.tencent.mm.plugin.appbrand.s.c.b("A close frame must have a closecode if it has a reason");
        }
      }
      else
      {
        paramString = com.tencent.mm.plugin.appbrand.s.f.b.wc(paramString);
        ByteBuffer localByteBuffer1 = ByteBuffer.allocate(4);
        localByteBuffer1.putInt(i);
        localByteBuffer1.position(2);
        ByteBuffer localByteBuffer2 = ByteBuffer.allocate(paramString.length + 2);
        localByteBuffer2.put(localByteBuffer1);
        localByteBuffer2.put(paramString);
        localByteBuffer2.rewind();
        v(localByteBuffer2);
      }
      return;
    }
  }
  
  public final int aoJ()
  {
    return this.code;
  }
  
  public final ByteBuffer aoK()
  {
    if (this.code == 1005) {
      return gDG;
    }
    return super.aoK();
  }
  
  public final String getMessage()
  {
    return this.gDH;
  }
  
  public final String toString()
  {
    return super.toString() + "code: " + this.code;
  }
  
  public final void v(ByteBuffer paramByteBuffer)
  {
    super.v(paramByteBuffer);
    this.code = 1005;
    paramByteBuffer = super.aoK();
    paramByteBuffer.mark();
    if (paramByteBuffer.remaining() >= 2)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.position(2);
      localByteBuffer.putShort(paramByteBuffer.getShort());
      localByteBuffer.position(0);
      this.code = localByteBuffer.getInt();
      if ((this.code == 1006) || (this.code == 1015) || (this.code == 1005) || (this.code > 4999) || (this.code < 1000) || (this.code == 1004)) {
        throw new c("closecode must not be sent over the wire: " + this.code);
      }
    }
    paramByteBuffer.reset();
    if (this.code == 1005)
    {
      this.gDH = com.tencent.mm.plugin.appbrand.s.f.b.w(super.aoK());
      return;
    }
    paramByteBuffer = super.aoK();
    int i = paramByteBuffer.position();
    try
    {
      paramByteBuffer.position(paramByteBuffer.position() + 2);
      this.gDH = com.tencent.mm.plugin.appbrand.s.f.b.w(paramByteBuffer);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new c(localIllegalArgumentException);
    }
    finally
    {
      paramByteBuffer.position(i);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
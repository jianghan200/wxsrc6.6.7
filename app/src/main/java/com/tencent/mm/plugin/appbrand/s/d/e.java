package com.tencent.mm.plugin.appbrand.s.d;

import com.tencent.mm.plugin.appbrand.s.f.b;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class e
  implements c
{
  protected static byte[] gDP = new byte[0];
  protected boolean gDQ;
  protected d.a gDR;
  private ByteBuffer gDS;
  protected boolean gDT;
  
  public e() {}
  
  public e(d.a parama)
  {
    this.gDR = parama;
    this.gDS = ByteBuffer.wrap(gDP);
  }
  
  public e(d paramd)
  {
    this.gDQ = paramd.aoL();
    this.gDR = paramd.aoN();
    this.gDS = paramd.aoK();
    this.gDT = paramd.aoM();
  }
  
  public final void a(d.a parama)
  {
    this.gDR = parama;
  }
  
  public ByteBuffer aoK()
  {
    return this.gDS;
  }
  
  public final boolean aoL()
  {
    return this.gDQ;
  }
  
  public final boolean aoM()
  {
    return this.gDT;
  }
  
  public final d.a aoN()
  {
    return this.gDR;
  }
  
  public final void dg(boolean paramBoolean)
  {
    this.gDQ = paramBoolean;
  }
  
  public final void dh(boolean paramBoolean)
  {
    this.gDT = paramBoolean;
  }
  
  public final void e(d paramd)
  {
    ByteBuffer localByteBuffer1 = paramd.aoK();
    if (this.gDS == null)
    {
      this.gDS = ByteBuffer.allocate(localByteBuffer1.remaining());
      localByteBuffer1.mark();
      this.gDS.put(localByteBuffer1);
      localByteBuffer1.reset();
      this.gDQ = paramd.aoL();
      return;
    }
    localByteBuffer1.mark();
    this.gDS.position(this.gDS.limit());
    this.gDS.limit(this.gDS.capacity());
    if (localByteBuffer1.remaining() > this.gDS.remaining())
    {
      ByteBuffer localByteBuffer2 = ByteBuffer.allocate(localByteBuffer1.remaining() + this.gDS.capacity());
      this.gDS.flip();
      localByteBuffer2.put(this.gDS);
      localByteBuffer2.put(localByteBuffer1);
      this.gDS = localByteBuffer2;
    }
    for (;;)
    {
      this.gDS.rewind();
      localByteBuffer1.reset();
      break;
      this.gDS.put(localByteBuffer1);
    }
  }
  
  public String toString()
  {
    return "Framedata{ optcode:" + this.gDR + ", fin:" + this.gDQ + ", payloadlength:[pos:" + this.gDS.position() + ", len:" + this.gDS.remaining() + "], payload:" + Arrays.toString(b.wc(new String(this.gDS.array()))) + "}";
  }
  
  public void v(ByteBuffer paramByteBuffer)
  {
    this.gDS = paramByteBuffer;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.magicbrush.engine;

import java.nio.ByteBuffer;

public class b
{
  protected long bnA;
  protected boolean bnB;
  protected a bnz;
  
  public b()
  {
    this.bnz = new a();
    this.bnB = true;
    this.bnA = JsEngine.createVMContext(this.bnz.bny);
  }
  
  public b(a parama)
  {
    this.bnz = parama;
    this.bnA = JsEngine.createVMContext(parama.bny);
  }
  
  public final boolean a(b paramb, String paramString)
  {
    return JsEngine.pushObject(this.bnA, paramb.bnA, paramString);
  }
  
  public final String bP(String paramString)
  {
    if (this.bnA == 0L) {
      return "";
    }
    return JsEngine.evaluateJavascript(this.bnA, paramString);
  }
  
  public final void d(Object paramObject, String paramString)
  {
    if (!JsClassUtils.hasJavascriptInterface(paramObject)) {
      return;
    }
    JsEngine.addJsInterface(this.bnA, paramObject, paramString);
  }
  
  public void dispose()
  {
    if (this.bnA == 0L) {}
    do
    {
      return;
      JsEngine.releaseVMContext(this.bnA);
      this.bnA = 0L;
    } while ((!this.bnB) || (this.bnz == null));
    this.bnz.dispose();
    this.bnz = null;
  }
  
  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    ByteBuffer localByteBuffer2 = JsEngine.getNativeBuffer(paramInt, this.bnz.bny);
    ByteBuffer localByteBuffer1 = localByteBuffer2;
    if (localByteBuffer2 == null) {
      localByteBuffer1 = ByteBuffer.allocate(0);
    }
    return localByteBuffer1;
  }
  
  public final String r(String paramString1, String paramString2)
  {
    if (this.bnA == 0L) {
      return "";
    }
    return JsEngine.evaluateJavascriptFile(this.bnA, paramString1, paramString2);
  }
  
  public final a tb()
  {
    return this.bnz;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/engine/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
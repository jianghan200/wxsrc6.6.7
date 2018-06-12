package com.tencent.mm.memory;

import com.tencent.mm.sdk.b;
import com.tencent.mm.sdk.f.e;
import java.nio.ByteBuffer;

public final class h
  extends b<ByteBuffer>
{
  public static h dvb = new h();
  
  static
  {
    e.post(new h.1(), "DecodeTempStorage_preload");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/memory/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
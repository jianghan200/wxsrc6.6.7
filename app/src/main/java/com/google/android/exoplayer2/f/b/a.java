package com.google.android.exoplayer2.f.b;

import com.google.android.exoplayer2.i.j;
import java.util.List;

public final class a
  extends com.google.android.exoplayer2.f.b
{
  private final b axz;
  
  public a(List<byte[]> paramList)
  {
    super("DvbDecoder");
    paramList = new j((byte[])paramList.get(0));
    this.axz = new b(paramList.readUnsignedShort(), paramList.readUnsignedShort());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/f/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
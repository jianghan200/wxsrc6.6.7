package com.tencent.mm.compatible.h;

import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public int bJL = -1;
  public String dfX = null;
  public long dfY = -1L;
  public int dfZ = -1;
  
  public final String zW()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.dfX);
    localStringBuffer.append(",");
    localStringBuffer.append(this.dfY);
    localStringBuffer.append(",");
    localStringBuffer.append(this.dfZ);
    localStringBuffer.append(",");
    localStringBuffer.append(this.bJL);
    x.d("MicroMsg.AudioRecorderInfo", " getStatInfo " + localStringBuffer.toString());
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
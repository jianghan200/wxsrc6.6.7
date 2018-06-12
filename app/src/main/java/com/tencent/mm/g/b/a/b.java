package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;

public final class b
  extends a
{
  public String cgb = "";
  public int cge = 0;
  public long cgf = 0L;
  public long cgg = 0L;
  public long cgh = 0L;
  private long cgj = 0L;
  public long cgk = 0L;
  public String cgl = "";
  
  public final b an(long paramLong)
  {
    this.cgj = paramLong;
    paramLong = this.cgj;
    if (paramLong <= 0L) {
      super.eo("StayTimeMs", String.valueOf(paramLong));
    }
    while (paramLong < 3600000L) {
      return this;
    }
    super.eo("StayTimeMs", String.valueOf(paramLong));
    return this;
  }
  
  public final int getId()
  {
    return 15460;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cgb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cge);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgl);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ChatroomName:").append(this.cgb);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ChatroomMute:").append(this.cge);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("UnreadCount:").append(this.cgf);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DisRedDotCount:").append(this.cgg);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EnterCount:").append(this.cgh);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("StayTimeMs:").append(this.cgj);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("SendCount:").append(this.cgk);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("Score:").append(this.cgl);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
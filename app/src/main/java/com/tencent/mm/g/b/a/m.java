package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;

public final class m
  extends a
{
  private long chK = 0L;
  public long ciA = 0L;
  public long ciB = 0L;
  public long ciC = 0L;
  private long ciD = 0L;
  public String ciE = "";
  public String ciF = "";
  
  public final m ap(long paramLong)
  {
    this.chK = paramLong;
    super.ae("StartTimeStampSec", this.chK);
    return this;
  }
  
  public final m aq(long paramLong)
  {
    this.ciD = paramLong;
    super.ae("EndTimeStampSec", this.ciD);
    return this;
  }
  
  public final int getId()
  {
    return 15452;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ciA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciF);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ExptId:").append(this.ciA);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("GroupId:").append(this.ciB);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ExptSeq:").append(this.ciC);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("StartTimeStampSec:").append(this.chK);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EndTimeStampSec:").append(this.ciD);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ExptKey:").append(this.ciE);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ExptVal:").append(this.ciF);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/b/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
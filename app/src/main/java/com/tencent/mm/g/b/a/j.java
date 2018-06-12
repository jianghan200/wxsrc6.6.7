package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;

public final class j
  extends a
{
  public long cip = 0L;
  public long ciq = 0L;
  
  public final int getId()
  {
    return 15522;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cip);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciq);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ReportScene:").append(this.cip);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ResetScece:").append(this.ciq);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/b/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
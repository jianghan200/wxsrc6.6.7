package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;

public final class l
  extends a
{
  public long ciu = 0L;
  public long ciw = 0L;
  public String cix = "";
  public long ciy = 0L;
  public long ciz = 0L;
  
  public final int getId()
  {
    return 15402;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.ciw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cix);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciu);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("DeleteReason:").append(this.ciw);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("Appid:").append(this.cix);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DebugType:").append(this.ciy);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DeleteCount:").append(this.ciz);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("AbtestStatus:").append(this.ciu);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/b/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
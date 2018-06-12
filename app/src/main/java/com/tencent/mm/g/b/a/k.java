package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;

public final class k
  extends a
{
  public long cir = 0L;
  public long cis = 0L;
  public long cit = 0L;
  public long ciu = 0L;
  public long civ = 0L;
  
  public final int getId()
  {
    return 15401;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cir);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cis);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cit);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.ciu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.civ);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("AllPackageSize:").append(this.cir);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("AllPackageClientStoragePercent:").append(this.cis);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ClientStorageFreePercent:").append(this.cit);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("AbtestStatus:").append(this.ciu);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("WeappCountThatHasPackage:").append(this.civ);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/b/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
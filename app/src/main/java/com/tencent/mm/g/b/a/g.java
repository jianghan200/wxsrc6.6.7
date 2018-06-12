package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Arrays;

public final class g
  extends a
{
  public long chJ = 0L;
  public long chK = 0L;
  public String chL = "";
  public boolean chM;
  
  public g() {}
  
  public g(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 4) {
          break label118;
        }
        String[] arrayOfString = new String[4];
        Arrays.fill(arrayOfString, 0, 4, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label118:
    for (;;)
    {
      this.chJ = bi.getLong(paramString[0], 0L);
      ao(bi.getLong(paramString[1], 0L));
      this.chL = paramString[2];
      if (bi.getInt(paramString[3], 0) != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.chM = bool;
        return;
      }
    }
  }
  
  private g ao(long paramLong)
  {
    this.chK = paramLong;
    super.ae("StartTimeStampSec", this.chK);
    return this;
  }
  
  public final int getId()
  {
    return 0;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.chJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chL);
    ((StringBuffer)localObject).append(",");
    if (this.chM) {}
    for (int i = 1;; i = 0)
    {
      ((StringBuffer)localObject).append(i);
      localObject = ((StringBuffer)localObject).toString();
      KD((String)localObject);
      return (String)localObject;
    }
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ExptFlag:").append(this.chJ);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("StartTimeStampSec:").append(this.chK);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("Roomname:").append(this.chL);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("hardcodeExptBool:").append(this.chM);
    return localStringBuffer.toString();
  }
  
  public final g wG()
  {
    return ao(bi.VE());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/b/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
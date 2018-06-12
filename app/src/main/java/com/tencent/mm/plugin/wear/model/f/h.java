package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.protocal.c.cef;
import com.tencent.mm.protocal.c.ceg;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends b
{
  private long bJC;
  private long cfh;
  private String cfi;
  private List<String> cfj;
  
  public h(long paramLong1, long paramLong2, String paramString, List<String> paramList)
  {
    this.bJC = paramLong1;
    this.cfh = paramLong2;
    this.cfi = paramString;
    this.cfj = paramList;
  }
  
  public final String getName()
  {
    return "WearLuckyReceiveTask";
  }
  
  protected final void send()
  {
    cef localcef = new cef();
    localcef.szm = this.cfh;
    localcef.szl = this.bJC;
    localcef.szn = this.cfi;
    try
    {
      if (this.cfj != null)
      {
        Iterator localIterator = this.cfj.iterator();
        while (localIterator.hasNext())
        {
          String[] arrayOfString = ((String)localIterator.next()).split("=");
          ceg localceg = new ceg();
          localceg.szk = arrayOfString[0];
          localceg.hcS = arrayOfString[1];
          if (localceg.hcS.startsWith("wxid")) {
            localceg.hcS = com.tencent.mm.model.r.gT(localceg.hcS);
          }
          localceg.szm = Long.valueOf(arrayOfString[2]).longValue();
          localcef.szo.add(localceg);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      while (this.cfh > 0L)
      {
        com.tencent.mm.plugin.wear.model.c.a.jO(true);
        return;
        com.tencent.mm.plugin.wear.model.a.bSl();
        com.tencent.mm.plugin.wear.model.e.r.b(20015, localException.toByteArray(), true);
      }
      com.tencent.mm.plugin.wear.model.c.a.jO(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
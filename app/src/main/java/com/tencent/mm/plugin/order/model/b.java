package com.tencent.mm.plugin.order.model;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public HashSet<String> lNE = new HashSet();
  
  public b()
  {
    aMk();
  }
  
  private void aMk()
  {
    this.lNE.clear();
    g.Ek();
    Iterator localIterator = bi.F(((String)g.Ei().DT().get(204803, "")).split(";")).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!bi.oW(str)) && (!this.lNE.contains(str))) {
        this.lNE.add(str);
      }
    }
    g.Ek();
    g.Ei().DT().set(204817, Integer.valueOf(this.lNE.size()));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WalletOrdersManager", "notifyTrans.size() : " + this.lNE.size());
  }
  
  public final void bmr()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.lNE.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bi.oW(str)) {
        localStringBuffer.append(str + ";");
      }
    }
    g.Ek();
    g.Ei().DT().set(204803, localStringBuffer.toString());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/order/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
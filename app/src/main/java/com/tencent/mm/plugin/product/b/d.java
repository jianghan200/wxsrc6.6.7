package com.tencent.mm.plugin.product.b;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public List<String> lRd = new ArrayList();
  
  public d()
  {
    Wj();
  }
  
  private void Wj()
  {
    this.lRd.clear();
    g.Ek();
    Object localObject = (String)g.Ei().DT().get(270340, "");
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "data : " + (String)localObject);
    localObject = bi.F(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!bi.oW(str)) {
        this.lRd.add(str);
      }
    }
  }
  
  public final boolean bna()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + this.lRd.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.lRd.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!bi.oW(str)) && (!str.contains(";"))) {
        localStringBuffer.append(str);
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "save data  : " + localStringBuffer.toString());
    g.Ek();
    g.Ei().DT().set(270340, localStringBuffer.toString());
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/product/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
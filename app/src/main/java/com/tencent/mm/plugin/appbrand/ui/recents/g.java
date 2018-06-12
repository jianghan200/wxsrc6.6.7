package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;

final class g
{
  final boolean bKe;
  
  g(boolean paramBoolean)
  {
    this.bKe = paramBoolean;
  }
  
  final ArrayList<k> k(ArrayList<k> paramArrayList)
  {
    if ((!this.bKe) || (bi.cX(paramArrayList))) {
      return paramArrayList;
    }
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      k localk = (k)paramArrayList.next();
      if (!localk.fmd) {
        localArrayList.add(localk);
      }
    }
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
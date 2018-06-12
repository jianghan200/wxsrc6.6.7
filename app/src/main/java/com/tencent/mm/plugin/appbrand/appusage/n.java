package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.config.k.a;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.protocal.c.cgr;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

 enum n
{
  static void a(int paramInt, Bundle paramBundle, LinkedList<cgr> paramLinkedList)
  {
    HashSet localHashSet = new HashSet();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      cgr localcgr = (cgr)paramLinkedList.next();
      if (!bi.oW(localcgr.username)) {
        localHashSet.add(localcgr.username);
      }
    }
    paramLinkedList = new ArrayList(localHashSet.size());
    paramLinkedList.addAll(localHashSet);
    if (paramInt == 3) {
      if ((paramBundle != null) && (paramBundle.getInt("launcher_ui_enter_scene") == 13)) {
        paramBundle = k.a.frv;
      }
    }
    for (;;)
    {
      r.a(paramLinkedList, paramBundle);
      return;
      paramBundle = k.a.frt;
      continue;
      paramBundle = k.a.frs;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
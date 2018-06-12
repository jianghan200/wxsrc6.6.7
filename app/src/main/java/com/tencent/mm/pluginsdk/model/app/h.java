package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.ac.b;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public final class h
  implements e, ac.b, t
{
  Map<String, Integer> fxF = null;
  private List<String> mTQ = null;
  private List<String> qzB = null;
  private al qzC = new al(Looper.getMainLooper(), new h.1(this), false);
  private List<String> qzM = new Vector();
  private List<String> qzN = new ArrayList();
  private volatile boolean qzO = false;
  
  public h()
  {
    this.qzC.J(600000L, 600000L);
    com.tencent.mm.kernel.g.Eh().dpP.a(231, this);
    a.bmi().a(7, this);
  }
  
  private void ST(String paramString)
  {
    for (;;)
    {
      try
      {
        if ((!bi.oW(paramString)) && (!this.qzM.contains(paramString)))
        {
          if (!SV(paramString))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "this app has reach the max retry count, appid is %s", new Object[] { paramString });
            return;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoService", "add appid:[%s]", new Object[] { paramString });
          this.qzM.add(paramString);
          continue;
        }
      }
      finally {}
      tmp90_87[0] = paramString;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoService", "should not add this appid:[%s], it is already runing", tmp90_87);
    }
  }
  
  private boolean SV(String paramString)
  {
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "increaseCounter fail, appId is null");
      return false;
    }
    Integer localInteger = Integer.valueOf(bi.a((Integer)this.fxF.get(paramString), 0));
    if (localInteger.intValue() >= 5)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "increaseCounter fail, has reached the max try count");
      return false;
    }
    this.fxF.put(paramString, Integer.valueOf(localInteger.intValue() + 1));
    return true;
  }
  
  private void cbN()
  {
    int i = 20;
    if (this.qzO)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppInfoService", " batch get appinfo doing now");
      return;
    }
    if ((this.qzM == null) || (this.qzM.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppInfoService", "batchwaitinglist is empty, no need to doscene");
      return;
    }
    int j = this.qzM.size();
    if (j > 20) {}
    for (;;)
    {
      try
      {
        this.qzN.addAll(this.qzM.subList(0, i));
        if ((this.qzN == null) || (this.qzN.isEmpty())) {
          break;
        }
        this.qzO = true;
        y localy = new y(7, new ae(this.qzN));
        com.tencent.mm.kernel.g.Eh().dpP.a(localy, 0);
        return;
      }
      finally {}
      i = j;
    }
  }
  
  public final void SU(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "push fail, appId is null");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoService", "push appid : " + paramString);
    ST(paramString);
    cbN();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    paramInt1 = paraml.getType();
    switch (paramInt1)
    {
    default: 
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "error type: " + paramInt1);
    case 231: 
      do
      {
        return;
        paramString = ((ad)paraml).appId;
        if (this.qzB.contains(paramString)) {
          this.qzB.remove(paramString);
        }
      } while (this.mTQ.size() <= 0);
      paramString = (String)this.mTQ.remove(0);
      if ((paramString == null) || (paramString.length() == 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "startDownload fail, appId is null");
        paramInt1 = 0;
      }
      while (paramInt1 != 0)
      {
        this.qzB.add(paramString);
        return;
        if (!SV(paramString))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "increaseCounter fail");
          paramInt1 = 0;
        }
        else
        {
          paraml = new ad(paramString);
          com.tencent.mm.kernel.g.Eh().dpP.a(paraml, 0);
          paramInt1 = 1;
        }
      }
    }
    try
    {
      if ((this.qzN != null) && (!this.qzN.isEmpty()))
      {
        this.qzM.removeAll(this.qzN);
        this.qzN.clear();
      }
      this.qzO = false;
      cbN();
      return;
    }
    finally {}
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 7)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppInfoService", "not the getappinfolist scene, ignore");
      return;
    }
    try
    {
      if ((this.qzN != null) && (!this.qzN.isEmpty()))
      {
        this.qzM.removeAll(this.qzN);
        this.qzN.clear();
      }
      this.qzO = false;
      cbN();
      return;
    }
    finally {}
  }
  
  public final void ap(LinkedList<String> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoService", "batch push appinfo err: null or nil applist");
      return;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext()) {
      ST((String)paramLinkedList.next());
    }
    cbN();
  }
  
  public final String q(Context paramContext, String paramString)
  {
    return g.q(paramContext, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
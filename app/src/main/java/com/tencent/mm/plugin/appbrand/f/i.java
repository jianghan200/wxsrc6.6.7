package com.tencent.mm.plugin.appbrand.f;

import android.os.HandlerThread;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.appusage.p;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

 enum i
{
  private static final a fyR = new a();
  
  static List<k> afG()
  {
    LinkedList localLinkedList = new LinkedList();
    Object localObject;
    if (e.abg() != null)
    {
      localObject = e.abg().adf();
      if (!bi.cX((List)localObject)) {
        localLinkedList.addAll((Collection)localObject);
      }
    }
    if (com.tencent.mm.modelappbrand.a.JJ())
    {
      localObject = localLinkedList.iterator();
      while (((Iterator)localObject).hasNext()) {
        if (((k)((Iterator)localObject).next()).aaq()) {
          ((Iterator)localObject).remove();
        }
      }
    }
    return localLinkedList;
  }
  
  static void e(j.a parama)
  {
    if (e.abg() != null) {
      e.abg().c(parama);
    }
  }
  
  static void f(j.a parama)
  {
    if (e.abg() != null) {
      e.abg().d(parama);
    }
  }
  
  static void onCreate()
  {
    q.aei().a(fyR, c.Em().lnJ.getLooper());
  }
  
  static void onDestroy()
  {
    q.aei().d(fyR);
  }
  
  static k sK(String paramString)
  {
    if (e.abg() == null) {}
    do
    {
      return null;
      paramString = e.abg().rn(paramString);
    } while ((paramString == null) || ((paramString.aaq()) && (com.tencent.mm.modelappbrand.a.JJ())));
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
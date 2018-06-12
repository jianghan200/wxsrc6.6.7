package com.tencent.mm.plugin.appbrand.f;

import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appusage.p;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a
  implements j.a
{
  public final void a(String paramString, l paraml)
  {
    if (e.abg() == null) {
      x.w("MicroMsg.AppBrandSearchStorageChangeListener", "onNotifyChange by SysConfigStorage, but sLayoutStorage is null.");
    }
    LinkedList localLinkedList;
    label132:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            switch (paraml.fBN)
            {
            case 4: 
            default: 
              return;
            case 2: 
            case 3: 
              localLinkedList = new LinkedList();
              if (!"batch".equals(paramString)) {
                break label132;
              }
            }
          } while ((paraml.obj == null) || (!(paraml.obj instanceof List)));
          paramString = ((List)paraml.obj).iterator();
          while (paramString.hasNext())
          {
            paraml = (String)paramString.next();
            localLinkedList.addAll(e.abg().ro(paraml));
          }
          localLinkedList.addAll(e.abg().ro(paraml.obj.toString()));
        } while (localLinkedList.isEmpty());
        e.abg().b("batch", 3, localLinkedList);
        return;
        localLinkedList = new LinkedList();
        if (!"batch".equals(paramString)) {
          break;
        }
      } while ((paraml.obj == null) || (!(paraml.obj instanceof List)));
      paramString = ((List)paraml.obj).iterator();
      while (paramString.hasNext())
      {
        paraml = (String)paramString.next();
        localLinkedList.addAll(e.abg().ro(paraml));
      }
      localLinkedList.addAll(e.abg().ro(paraml.obj.toString()));
    } while (localLinkedList.isEmpty());
    e.abg().b("batch", 5, localLinkedList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
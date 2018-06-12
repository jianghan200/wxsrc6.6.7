package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.Closeable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class n
  implements Closeable
{
  private final WxaPkgWrappingInfo fgi;
  private final Map<String, ag> fgj = new HashMap();
  
  n(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    this.fgi = paramWxaPkgWrappingInfo;
    this.fgi.aco();
  }
  
  final void abJ()
  {
    synchronized (this.fgj)
    {
      qH("__APP__");
      Iterator localIterator = this.fgi.fil.iterator();
      if (localIterator.hasNext()) {
        qH(((WxaAttributes.e)localIterator.next()).name);
      }
    }
  }
  
  public final void close()
  {
    synchronized (this.fgj)
    {
      Collection localCollection = this.fgj.values();
      ??? = localCollection.iterator();
      if (((Iterator)???).hasNext()) {
        ((ag)((Iterator)???).next()).close();
      }
    }
  }
  
  final ag qG(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    paramString = a.qC(paramString);
    if (paramString.startsWith("__APP__"))
    {
      paramString = "__APP__";
      return qH(paramString);
    }
    Object localObject = this.fgi.fil.iterator();
    ModulePkgInfo localModulePkgInfo;
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      localModulePkgInfo = (ModulePkgInfo)((Iterator)localObject).next();
    } while (!paramString.startsWith(localModulePkgInfo.name));
    for (localObject = localModulePkgInfo.name;; localObject = null)
    {
      paramString = (String)localObject;
      if (!bi.oW((String)localObject)) {
        break;
      }
      paramString = "__APP__";
      break;
    }
  }
  
  final ag qH(String paramString)
  {
    for (;;)
    {
      synchronized (this.fgj)
      {
        ag localag = (ag)this.fgj.get(paramString);
        if (localag != null)
        {
          paramString = localag;
          if (paramString != null) {
            paramString.abW();
          }
          return paramString;
        }
        if ("__APP__".equals(paramString))
        {
          localObject = this.fgi.ffK;
          label60:
          if (!bi.oW((String)localObject)) {
            break label133;
          }
          paramString = localag;
        }
      }
      Object localObject = this.fgi.fil.iterator();
      for (;;)
      {
        if (((Iterator)localObject).hasNext())
        {
          ModulePkgInfo localModulePkgInfo = (ModulePkgInfo)((Iterator)localObject).next();
          if (paramString.equals(localModulePkgInfo.name))
          {
            localObject = localModulePkgInfo.ffK;
            break label60;
            label133:
            localObject = new ag((String)localObject);
            this.fgj.put(paramString, localObject);
            paramString = (String)localObject;
            break;
          }
        }
      }
      localObject = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
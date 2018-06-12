package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.a.o;
import com.tencent.mm.plugin.appbrand.appcache.aj;
import com.tencent.mm.plugin.appbrand.appstorage.FileStructStat;
import com.tencent.mm.plugin.appbrand.appstorage.e;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements l
{
  private final List<l> fPX = new LinkedList();
  private final l fPY = new com.tencent.mm.plugin.appbrand.appstorage.g();
  
  private a(com.tencent.mm.plugin.appbrand.g paramg)
  {
    l locall = aj.k(paramg);
    com.tencent.mm.plugin.appbrand.appstorage.a locala = new com.tencent.mm.plugin.appbrand.appstorage.a(paramg.mAppId);
    e locale = new e(new String[] { o.getString(paramg.fcu.uin), paramg.mAppId });
    if (paramg.fcu.fqZ > 0L) {}
    for (long l = paramg.fcu.fqZ;; l = 10L)
    {
      locale.fjZ = (l * 1048576L);
      this.fPX.add(locale);
      this.fPX.add(locala);
      this.fPX.add(locall);
      initialize();
      return;
    }
  }
  
  public static a s(com.tencent.mm.plugin.appbrand.g paramg)
  {
    return new a(paramg);
  }
  
  private l tx(String paramString)
  {
    if (bi.oW(paramString)) {
      return this.fPY;
    }
    Iterator localIterator = this.fPX.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (locall.bV(paramString)) {
        return locall;
      }
    }
    return this.fPY;
  }
  
  final <T extends l> T B(Class<T> paramClass)
  {
    Iterator localIterator = this.fPX.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (locall.getClass() == paramClass) {
        return locall;
      }
    }
    return null;
  }
  
  public final j a(String paramString, FileStructStat paramFileStructStat)
  {
    return tx(paramString).a(paramString, paramFileStructStat);
  }
  
  public final j a(String paramString, com.tencent.mm.plugin.appbrand.q.h<ByteBuffer> paramh)
  {
    return tx(paramString).a(paramString, paramh);
  }
  
  public final j a(String paramString, File paramFile, boolean paramBoolean)
  {
    return tx(paramString).a(paramString, paramFile, paramBoolean);
  }
  
  public final j a(String paramString, InputStream paramInputStream, boolean paramBoolean)
  {
    return tx(paramString).a(paramString, paramInputStream, paramBoolean);
  }
  
  public final j b(String paramString, com.tencent.mm.plugin.appbrand.q.h<List<com.tencent.mm.plugin.appbrand.appstorage.h>> paramh)
  {
    return tx(paramString).b(paramString, paramh);
  }
  
  public final boolean bV(String paramString)
  {
    return true;
  }
  
  public final void initialize()
  {
    Iterator localIterator = this.fPX.iterator();
    while (localIterator.hasNext()) {
      ((l)localIterator.next()).initialize();
    }
    this.fPY.initialize();
  }
  
  public final j ra(String paramString)
  {
    return tx(paramString).ra(paramString);
  }
  
  public final File rb(String paramString)
  {
    return tx(paramString).rb(paramString);
  }
  
  public final void release()
  {
    Iterator localIterator = this.fPX.iterator();
    while (localIterator.hasNext()) {
      ((l)localIterator.next()).release();
    }
    this.fPY.release();
  }
  
  public final j rf(String paramString)
  {
    return tx(paramString).rf(paramString);
  }
  
  public final j rg(String paramString)
  {
    return tx(paramString).rg(paramString);
  }
  
  public final j rh(String paramString)
  {
    return tx(paramString).rh(paramString);
  }
  
  public final j ri(String paramString)
  {
    return tx(paramString).ri(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
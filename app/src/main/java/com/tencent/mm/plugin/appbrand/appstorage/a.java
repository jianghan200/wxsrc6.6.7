package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends g
{
  private final String appId;
  
  public a(String paramString)
  {
    this.appId = paramString;
  }
  
  public final j a(String paramString, FileStructStat paramFileStructStat)
  {
    paramString = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, paramString);
    if ((paramString == null) || (!com.tencent.mm.a.e.cn(paramString.dDG))) {
      return j.fkO;
    }
    if (paramFileStructStat == null) {
      return j.fkJ;
    }
    if (FileStat.stat(paramString.dDG, paramFileStructStat) == 0) {
      return j.fkI;
    }
    return j.fkJ;
  }
  
  public final j a(String paramString, com.tencent.mm.plugin.appbrand.q.h<ByteBuffer> paramh)
  {
    paramString = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, paramString);
    if ((paramString == null) || (!com.tencent.mm.a.e.cn(paramString.dDG))) {
      return j.fkO;
    }
    paramh.value = k.x(new File(paramString.dDG));
    return j.fkI;
  }
  
  public final j b(String paramString, com.tencent.mm.plugin.appbrand.q.h<List<h>> paramh)
  {
    Object localObject = new LinkedList();
    com.tencent.mm.plugin.appbrand.q.e.d((List)localObject, AppBrandLocalMediaObjectManager.listStoredFiles(this.appId));
    com.tencent.mm.plugin.appbrand.q.e.d((List)localObject, AppBrandLocalMediaObjectManager.listTmpFiles(this.appId));
    paramString = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      AppBrandLocalMediaObject localAppBrandLocalMediaObject = (AppBrandLocalMediaObject)((Iterator)localObject).next();
      h localh = new h();
      localh.fileName = localAppBrandLocalMediaObject.bNH;
      paramString.add(localh);
    }
    paramh.value = paramString;
    return j.fkI;
  }
  
  public final boolean bV(String paramString)
  {
    return bi.oV(paramString).startsWith("wxfile://");
  }
  
  public final j ra(String paramString)
  {
    paramString = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, paramString);
    if ((paramString == null) || (!com.tencent.mm.a.e.cn(paramString.dDG))) {
      return j.fkO;
    }
    return j.fkI;
  }
  
  public final File rb(String paramString)
  {
    paramString = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, paramString);
    if (paramString == null) {
      return null;
    }
    return new File(paramString.dDG);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
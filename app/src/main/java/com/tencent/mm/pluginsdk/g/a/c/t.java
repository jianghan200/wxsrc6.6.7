package com.tencent.mm.pluginsdk.g.a.c;

import android.annotation.SuppressLint;
import com.tencent.mm.a.g;
import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class t
  extends i<s>
{
  private static final String[] diD = { i.a(s.dhO, "ResDownloaderRecordTable") };
  private static final String qDA = aa.duN + g.u(String.format("mm%d", new Object[] { Integer.valueOf(Integer.MIN_VALUE) }).getBytes()) + "/";
  @SuppressLint({"UseSparseArrays"})
  private static final HashMap<Integer, h.d> qDB;
  public final h dCZ;
  private final HashMap<String, Object> qDC = new HashMap();
  
  static
  {
    Object localObject = new HashMap();
    qDB = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("RES_DOWNLOADER_RECORD_TABLE".hashCode()), new t.1());
    localObject = r.ccI().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Iterator)localObject).next();
    }
  }
  
  private t(h paramh)
  {
    super(paramh, s.dhO, "ResDownloaderRecordTable", null);
    this.dCZ = paramh;
    paramh = r.ccI().iterator();
    while (paramh.hasNext()) {
      paramh.next();
    }
  }
  
  static t ccJ()
  {
    try
    {
      new File(qDA).mkdirs();
      Object localObject = new h();
      if (!((h)localObject).a(qDA + "ResDown.db", qDA + "EnResDown.db", -2147483648L, q.zy(), qDB))
      {
        x.f("MicroMsg.ResDownloaderStorage", "res downloader db init failed");
        return null;
      }
      localObject = new t((h)localObject);
      return (t)localObject;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ResDownloaderStorage", "new storage failed, exception = %s", new Object[] { localException });
    }
    return null;
  }
  
  public final s Tn(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.ResDownloaderStorage", "query with null or nil urlKey, return null");
    }
    s locals;
    do
    {
      return null;
      locals = new s();
      locals.field_urlKey_hashcode = paramString.hashCode();
    } while (!super.b(locals, new String[] { "urlKey_hashcode" }));
    return locals;
  }
  
  public final boolean h(s params)
  {
    if (bi.oW(params.field_urlKey)) {
      return false;
    }
    params.field_urlKey_hashcode = params.field_urlKey.hashCode();
    return super.c(params, new String[] { "urlKey_hashcode" });
  }
  
  public final boolean i(s params)
  {
    if (bi.oW(params.field_urlKey)) {
      return false;
    }
    params.field_urlKey_hashcode = params.field_urlKey.hashCode();
    return super.b(params);
  }
  
  public final boolean jy(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.ResDownloaderStorage", "delete with null or nil urlKey, return false");
      return false;
    }
    s locals = new s();
    locals.field_urlKey_hashcode = paramString.hashCode();
    return super.a(locals, new String[] { "urlKey_hashcode" });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
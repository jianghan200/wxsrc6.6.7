package com.tencent.mm.plugin.appbrand.appcache.a.d;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public class b
  extends i<a>
{
  public static final String[] dzV = { i.a(a.dzU, "PredownloadBlockCgiRequest") };
  private final e fgu;
  
  public b(e parame)
  {
    super(parame, a.dzU, "PredownloadBlockCgiRequest", a.ciG);
    this.fgu = parame;
  }
  
  private Pair<Boolean, Integer> c(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    int i = -1;
    long l = bi.VE();
    paramString1 = "select reportId from PredownloadBlockCgiRequest where " + paramString1 + "=? and startTime<" + l + " and " + l + "<endTime and cgiList like '%;" + paramInt1 + ";%' and sceneList like '%;" + paramInt2 + ";%'";
    paramString1 = this.fgu.rawQuery(paramString1, new String[] { paramString2 });
    if ((paramString1 == null) || (paramString1.isClosed())) {
      return Pair.create(Boolean.valueOf(false), Integer.valueOf(-1));
    }
    boolean bool = paramString1.moveToFirst();
    paramInt1 = i;
    if (bool) {
      paramInt1 = paramString1.getInt(0);
    }
    paramString1.close();
    return Pair.create(Boolean.valueOf(bool), Integer.valueOf(paramInt1));
  }
  
  public final Pair<Boolean, Integer> v(String paramString, int paramInt1, int paramInt2)
  {
    return c("username", paramString, paramInt1, paramInt2);
  }
  
  public final Pair<Boolean, Integer> w(String paramString, int paramInt1, int paramInt2)
  {
    return c("appId", paramString, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
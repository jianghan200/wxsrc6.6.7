package com.tencent.mm.plugin.appbrand.appcache.a.d;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends com.tencent.mm.plugin.appbrand.p.c<c>
{
  public static final String[] dzV = { i.a(c.dzU, "PredownloadCmdGetCodePersistentInfo") };
  private final e fgu;
  
  public d(e parame)
  {
    super(parame, c.dzU, "PredownloadCmdGetCodePersistentInfo", c.ciG);
    this.fgu = parame;
  }
  
  public final List<c> d(String paramString, String... paramVarArgs)
  {
    paramString = this.fgu.query("PredownloadCmdGetCodePersistentInfo", null, paramString, paramVarArgs, null, null, null);
    if ((paramString == null) || (paramString.isClosed())) {
      return Collections.emptyList();
    }
    paramVarArgs = new LinkedList();
    if (paramString.moveToFirst()) {
      do
      {
        c localc = new c();
        localc.d(paramString);
        paramVarArgs.add(localc);
      } while (paramString.moveToNext());
    }
    paramString.close();
    return paramVarArgs;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
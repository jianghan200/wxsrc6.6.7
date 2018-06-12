package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  extends i<t>
{
  public static final String frM = i.a(t.fgt, "LaunchWxaAppRespTable");
  
  public s(e parame)
  {
    super(parame, t.fgt, "LaunchWxaAppRespTable", t.ciG);
  }
  
  private boolean a(t paramt, boolean paramBoolean)
  {
    paramt.field_appIdHash = paramt.field_appId.hashCode();
    super.a(paramt, paramBoolean);
    paramBoolean = a(paramt, new String[] { "appId" });
    x.i("MicroMsg.LaunchWxaAppCacheStorage", "insertNotify appId %s ret %B", new Object[] { paramt.field_appId, Boolean.valueOf(paramBoolean) });
    return paramBoolean;
  }
  
  private boolean b(t paramt, boolean paramBoolean, String... paramVarArgs)
  {
    int i;
    if (!bi.G(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramt.field_appIdHash = paramt.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.b(paramt, paramBoolean, paramVarArgs);
        x.i("MicroMsg.LaunchWxaAppCacheStorage", "updateNotify appId %s, ret %B", new Object[] { paramt.field_appId, Boolean.valueOf(paramBoolean) });
        return paramBoolean;
      }
      i += 1;
    }
  }
  
  public final t a(String paramString, aql paramaql)
  {
    if ((bi.oW(paramString)) || (paramaql == null)) {
      return null;
    }
    t localt = new t();
    localt.a(paramaql);
    localt.field_appId = paramString;
    paramaql = new t();
    paramaql.field_appId = paramString;
    boolean bool1;
    boolean bool2;
    if (!a(paramaql, new String[] { "appId" }))
    {
      bool1 = true;
      if ((!bool1) && (paramaql.equals(localt))) {
        break label158;
      }
      bool2 = true;
      label82:
      x.i("MicroMsg.LaunchWxaAppCacheStorage", "flush resp, appId %s, apply %B, insert %B", new Object[] { paramString, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (bool2)
      {
        if (!bool1) {
          break label164;
        }
        a(localt, false);
      }
    }
    for (;;)
    {
      if (!bool2) {
        break label184;
      }
      if (!a(paramaql, new String[] { "appId" })) {
        break label184;
      }
      return paramaql;
      bool1 = false;
      break;
      label158:
      bool2 = false;
      break label82;
      label164:
      b(localt, false, new String[] { "appId" });
    }
    label184:
    return localt;
  }
  
  public final boolean a(t paramt, boolean paramBoolean, String... paramVarArgs)
  {
    int i;
    if (!bi.G(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramt.field_appIdHash = paramt.field_appId.hashCode();
        }
      }
      else {
        return super.a(paramt, paramBoolean, paramVarArgs);
      }
      i += 1;
    }
  }
  
  public final boolean a(t paramt, String... paramVarArgs)
  {
    int i;
    if (!bi.G(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramt.field_appIdHash = paramt.field_appId.hashCode();
        }
      }
      else {
        return super.b(paramt, paramVarArgs);
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
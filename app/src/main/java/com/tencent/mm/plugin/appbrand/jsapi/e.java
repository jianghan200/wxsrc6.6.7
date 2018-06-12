package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

public abstract class e
  extends b
{
  public String fEX;
  
  public static MMActivity c(com.tencent.mm.plugin.appbrand.l paraml)
  {
    paraml = paraml.fdO.fcz;
    if (paraml == null) {
      return null;
    }
    paraml = paraml.getContext();
    if (!(paraml instanceof MMActivity)) {
      return null;
    }
    return (MMActivity)paraml;
  }
  
  public static p d(com.tencent.mm.plugin.appbrand.l paraml)
  {
    paraml = paraml.fdO.fcz;
    if ((paraml != null) && (paraml.getCurrentPage() != null)) {
      return paraml.getCurrentPage().getCurrentPageView();
    }
    return null;
  }
  
  public final String a(com.tencent.mm.plugin.appbrand.l paraml, String paramString, Map<String, ? extends Object> paramMap)
  {
    if (!m.a(paraml, paramMap, this)) {
      return f(this.fEX, null);
    }
    return f(paramString, paramMap);
  }
  
  public final String f(String paramString, Map<String, ? extends Object> paramMap)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", getName() + ":" + paramString);
    if (paramMap != null)
    {
      if ((com.tencent.mm.sdk.a.b.chp()) && (paramMap.containsKey("errMsg"))) {
        Assert.assertTrue("api " + getName() + ": Cant put errMsg in res!!!", false);
      }
      localHashMap.putAll(paramMap);
    }
    c.m(localHashMap);
    return new JSONObject(localHashMap).toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
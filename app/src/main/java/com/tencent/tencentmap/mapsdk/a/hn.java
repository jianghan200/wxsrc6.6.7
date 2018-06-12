package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class hn
  extends aq
{
  protected String a = "GBK";
  
  public final int a(String paramString, ly paramly1, ly paramly2)
  {
    return a(paramString, paramly1, paramly2, a());
  }
  
  public final int a(String paramString, ly paramly1, ly paramly2, Map paramMap)
  {
    me localme = new me(0);
    localme.a(this.a);
    localme.a(paramString, 1);
    if (paramly1.a != null) {
      localme.a(paramly1.a, 2);
    }
    if (paramly2.a != null) {
      localme.a(paramly2.a, 3);
    }
    paramString = new md(taf_invoke("findObjectByIdInSameGroup", mg.a(localme.a()), paramMap, new HashMap()));
    paramString.a(this.a);
    int i = paramString.a(0, 0, true);
    paramly1.a = new ArrayList();
    paramMap = new fl();
    paramly1.a.add(paramMap);
    paramly1.a = ((ArrayList)paramString.a(paramly1.a, 2, true));
    paramly2.a = new ArrayList();
    paramly1 = new fl();
    paramly2.a.add(paramly1);
    paramly2.a = ((ArrayList)paramString.a(paramly2.a, 3, true));
    return i;
  }
  
  public final int a(String paramString1, String paramString2, ly paramly1, ly paramly2)
  {
    return a(paramString1, paramString2, paramly1, paramly2, a());
  }
  
  public final int a(String paramString1, String paramString2, ly paramly1, ly paramly2, Map paramMap)
  {
    me localme = new me(0);
    localme.a(this.a);
    localme.a(paramString1, 1);
    localme.a(paramString2, 2);
    if (paramly1.a != null) {
      localme.a(paramly1.a, 3);
    }
    if (paramly2.a != null) {
      localme.a(paramly2.a, 4);
    }
    paramString1 = new md(taf_invoke("findObjectByIdInSameSet", mg.a(localme.a()), paramMap, new HashMap()));
    paramString1.a(this.a);
    int i = paramString1.a(0, 0, true);
    paramly1.a = new ArrayList();
    paramString2 = new fl();
    paramly1.a.add(paramString2);
    paramly1.a = ((ArrayList)paramString1.a(paramly1.a, 3, true));
    paramly2.a = new ArrayList();
    paramString2 = new fl();
    paramly2.a.add(paramString2);
    paramly2.a = ((ArrayList)paramString1.a(paramly2.a, 4, true));
    return i;
  }
  
  public final hn a(int paramInt)
  {
    super.taf_hash(paramInt);
    return this;
  }
  
  public final Map a()
  {
    return new HashMap();
  }
  
  public final void a(gm paramgm, String paramString)
  {
    a(paramgm, paramString, a());
  }
  
  public final void a(gm paramgm, String paramString1, String paramString2)
  {
    a(paramgm, paramString1, paramString2, a());
  }
  
  public final void a(gm paramgm, String paramString1, String paramString2, Map paramMap)
  {
    me localme = new me(0);
    localme.a(this.a);
    localme.a(paramString1, 1);
    localme.a(paramString2, 2);
    a(paramgm, "findObjectByIdInSameSet", mg.a(localme.a()), paramMap, new HashMap());
  }
  
  public final void a(gm paramgm, String paramString, Map paramMap)
  {
    me localme = new me(0);
    localme.a(this.a);
    localme.a(paramString, 1);
    a(paramgm, "findObjectByIdInSameGroup", mg.a(localme.a()), paramMap, new HashMap());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/hn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
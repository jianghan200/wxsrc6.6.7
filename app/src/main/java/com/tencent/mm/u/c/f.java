package com.tencent.mm.u.c;

import com.tencent.mm.u.b.d;
import com.tencent.mm.u.d.a;
import java.util.HashMap;
import junit.framework.Assert;
import org.json.JSONObject;

public final class f
{
  public a doM;
  public d doX;
  public g dpa;
  
  public f(d paramd, g paramg, a parama)
  {
    Assert.assertNotNull(paramd);
    Assert.assertNotNull(paramg);
    Assert.assertNotNull(parama);
    this.doX = paramd;
    this.dpa = paramg;
    this.doM = parama;
  }
  
  public static String Db()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("nativeTime", Long.valueOf(System.currentTimeMillis()));
    return new JSONObject(localHashMap).toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/u/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
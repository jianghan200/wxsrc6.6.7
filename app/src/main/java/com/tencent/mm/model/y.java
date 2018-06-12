package com.tencent.mm.model;

import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.bl;
import com.tencent.mm.storage.bl.a;

public final class y
{
  public static x P(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0)) {
      return null;
    }
    bl localbl = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().Hg(paramString1);
    if (localbl != null) {
      if (localbl.tcs != 1) {
        break label56;
      }
    }
    label56:
    for (int i = 1; i == 0; i = 0) {
      return null;
    }
    String str2 = localbl.name;
    String str1 = localbl.tcr.Zk("");
    paramString1 = "";
    if (str1 != null) {
      paramString1 = "" + str1.replace("@", "");
    }
    str1 = paramString1;
    if (paramString2 != null) {
      str1 = paramString1 + paramString2;
    }
    return new x("@domain.android", str2, str1, localbl.tcr.Zk(""), localbl.isEnable(), true);
  }
  
  public static x jdMethod_if(String paramString)
  {
    return new x("@black.android", null, paramString, null, true, true);
  }
  
  public static x ig(String paramString)
  {
    bl localbl = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().Hg("@t.qq.com");
    if (localbl == null) {
      return null;
    }
    return new x("@t.qq.com", null, paramString, null, localbl.isEnable(), localbl.cmV());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.a.e;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class aq
{
  public static String D(ate paramate)
  {
    if (paramate == null) {
      return null;
    }
    paramate = an.s(af.getAccSnsPath(), paramate.ksA) + i.j(paramate);
    x.i("MicroMsg.SnsVideoLogic", "get sns video path %s", new Object[] { paramate });
    return paramate;
  }
  
  public static String Mr(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    int i = paramString.indexOf("SNS_");
    if (i < 0) {
      return "";
    }
    try
    {
      paramString = paramString.substring(i + 4);
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public static String Ms(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    String str = an.s(af.getAccSnsPath(), paramString);
    x.i("MicroMsg.SnsVideoLogic", "get sns video dir %s mediaId %s", new Object[] { str, paramString });
    return str;
  }
  
  public static r Mt(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return t.nW(nJ(paramString));
  }
  
  public static String a(String paramString, ate paramate)
  {
    if (paramate == null) {
      localObject = null;
    }
    while (e.cn((String)localObject))
    {
      x.i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", new Object[] { paramString, localObject });
      return (String)localObject;
      localObject = an.s(af.getAccSnsPath(), paramate.ksA) + i.p(paramate);
      x.i("MicroMsg.SnsVideoLogic", "get sns video tmp path %s", new Object[] { localObject });
    }
    paramate = D(paramate);
    boolean bool = e.cn(paramate);
    Object localObject = Mt(paramString);
    if (localObject == null)
    {
      if (bool)
      {
        x.i("MicroMsg.SnsVideoLogic", "it old version already download video[%s]. path :%s", new Object[] { paramString, paramate });
        return paramate;
      }
      x.i("MicroMsg.SnsVideoLogic", "video info is null and file is no exists, return null.[%s]", new Object[] { paramString });
      return null;
    }
    if ((bool) && (((r)localObject).Tp()))
    {
      x.i("MicroMsg.SnsVideoLogic", "it had download sns video[%s] finish. %s", new Object[] { paramString, paramate });
      return paramate;
    }
    x.i("MicroMsg.SnsVideoLogic", "it don't download video[%s] finish. file[%b] status[%d], return null.", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(((r)localObject).status) });
    return null;
  }
  
  public static String aG(int paramInt, String paramString)
  {
    String str = d.a("snsvideo", paramInt, "sns", paramString);
    paramString = str;
    if (bi.oW(str)) {
      paramString = null;
    }
    return paramString;
  }
  
  public static boolean c(r paramr, int paramInt)
  {
    paramr.status = 130;
    paramr.dQo = paramInt;
    paramr.bWA = 268435712;
    boolean bool = o.Ta().b(paramr);
    x.i("MicroMsg.SnsVideoLogic", "update sns Record filename %s, update %b", new Object[] { paramr.getFileName(), Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean cf(String paramString, int paramInt)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
      return false;
    }
    paramString = nJ(paramString);
    r localr = new r();
    localr.fileName = paramString;
    localr.createTime = bi.VE();
    localr.status = 130;
    localr.dQo = paramInt;
    boolean bool = o.Ta().a(localr);
    x.i("MicroMsg.SnsVideoLogic", "init sns Record filename %s, insert %b", new Object[] { paramString, Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean eA(String paramString1, String paramString2)
  {
    r localr = Mt(paramString1);
    if (localr == null)
    {
      localr = new r();
      localr.fileName = nJ(paramString1);
    }
    for (int i = 1;; i = 0)
    {
      localr.createTime = bi.VE();
      localr.cas = paramString2;
      localr.status = 199;
      if (i != 0) {}
      for (boolean bool = o.Ta().a(localr);; bool = o.Ta().b(localr))
      {
        x.i("MicroMsg.SnsVideoLogic", "post sns video snsLocalId %s, md5 %s ret %b", new Object[] { paramString1, paramString2, Boolean.valueOf(bool) });
        return bool;
        localr.bWA = 33555200;
      }
    }
  }
  
  public static String nJ(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    String str = "SNS_" + paramString;
    x.d("MicroMsg.SnsVideoLogic", "gen sns[%s] video file name [%s]", new Object[] { paramString, str });
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
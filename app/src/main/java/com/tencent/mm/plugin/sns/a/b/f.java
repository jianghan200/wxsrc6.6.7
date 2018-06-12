package com.tencent.mm.plugin.sns.a.b;

import android.util.Base64;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class f
{
  private static String Lu(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    paramString = Base64.decode(paramString, 0);
    bqw localbqw = new bqw();
    try
    {
      localbqw.aG(paramString);
      paramString = p.a(localbqw.soW);
      return paramString;
    }
    catch (IOException paramString)
    {
      x.e("SnsAdExtUtil", "", new Object[] { paramString });
    }
    return "";
  }
  
  public static String a(long paramLong, Object... paramVarArgs)
  {
    af.byi();
    paramVarArgs = new StringBuilder(i.n(paramVarArgs));
    a(paramLong, paramVarArgs);
    return paramVarArgs.toString();
  }
  
  public static String a(bsu parambsu)
  {
    if (parambsu != null) {
      return Lu(parambsu.nNV);
    }
    x.v("SnsAdExtUtil", "getSnsStatExt timeLineObject null");
    return null;
  }
  
  public static void a(long paramLong, StringBuilder paramStringBuilder)
  {
    Object localObject = af.byr().eZ(paramLong);
    if (localObject != null)
    {
      localObject = ((e)localObject).bAJ();
      if (localObject != null)
      {
        localObject = p.nn(((bsu)localObject).nNV);
        StringBuilder localStringBuilder = paramStringBuilder.append(",");
        if (localObject == null) {}
        for (int i = -1;; i = ((bqx)localObject).source)
        {
          localStringBuilder.append(i);
          paramStringBuilder.append(",").append(p.a((bqx)localObject));
          return;
        }
      }
      x.v("SnsAdExtUtil", "l timeLineObject null, snsId %d", new Object[] { Long.valueOf(paramLong) });
      paramStringBuilder.append(",,");
      return;
    }
    x.v("SnsAdExtUtil", "l snsInfo null, snsId %d", new Object[] { Long.valueOf(paramLong) });
    paramStringBuilder.append(",,");
  }
  
  public static void a(String paramString, d paramd)
  {
    Object localObject = af.byo().Nk(paramString);
    if (localObject != null)
    {
      localObject = ((n)localObject).bAJ();
      if (localObject != null)
      {
        p.a(((bsu)localObject).nNV, paramd);
        return;
      }
      x.v("SnsAdExtUtil", "timeLineObject null, snsId %s", new Object[] { paramString });
      return;
    }
    x.v("SnsAdExtUtil", "snsInfo null, snsId %s", new Object[] { paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Context;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.cbd;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class m
{
  private static int ftB = -1;
  
  public static void a(a parama, int paramInt)
  {
    int i = (int)(System.currentTimeMillis() - parama.fsv);
    h.mEJ.h(15190, new Object[] { Integer.valueOf(i), Integer.valueOf(parama.size), Integer.valueOf(paramInt), Integer.valueOf(1), "", bi.oV(parama.bHA), Integer.valueOf(aeG()), Integer.valueOf(aeH()) });
  }
  
  public static void a(cbd paramcbd, g paramg)
  {
    if (paramg != null)
    {
      int i = (int)(System.currentTimeMillis() - paramg.fsv);
      h.mEJ.h(15190, new Object[] { Integer.valueOf(i), Integer.valueOf(paramg.size), Integer.valueOf(paramcbd.boi()), Integer.valueOf(0), "", "", Integer.valueOf(aeG()), Integer.valueOf(aeH()) });
    }
  }
  
  public static void a(String paramString, LinkedList<String> paramLinkedList, long paramLong, int paramInt1, int paramInt2)
  {
    String str2 = "";
    String str1;
    if (!paramString.equals("invokeHandler"))
    {
      str1 = str2;
      if (!paramString.equals("publishHandler")) {}
    }
    else
    {
      str1 = str2;
      if (paramLinkedList.size() > 0) {
        str1 = (String)paramLinkedList.get(0);
      }
    }
    int i = (int)(System.currentTimeMillis() - paramLong);
    h.mEJ.h(15190, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(2), paramString, str1, Integer.valueOf(aeG()), Integer.valueOf(aeH()) });
  }
  
  private static int aeG()
  {
    if (ftB >= 0) {
      return ftB;
    }
    int i = ao.getISPCode(ad.getContext());
    ftB = i;
    return i;
  }
  
  public static int aeH()
  {
    Context localContext = ad.getContext();
    int i = 5;
    if (!ao.isConnected(localContext)) {
      i = 0;
    }
    do
    {
      return i;
      if (ao.is2G(localContext)) {
        return 1;
      }
      if (ao.is3G(localContext)) {
        return 2;
      }
      if (ao.is4G(localContext)) {
        return 3;
      }
    } while (!ao.isWifi(localContext));
    return 4;
  }
  
  public static String so(String paramString)
  {
    paramString = Pattern.compile("subscribeHandler\\(\"(.*)\" , ").matcher(paramString);
    if (paramString.find()) {
      return paramString.group(1);
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
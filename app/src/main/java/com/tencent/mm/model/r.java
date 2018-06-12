package com.tencent.mm.model;

import android.content.res.Resources;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.messenger.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class r
{
  private static Set<String> dAL = new HashSet();
  
  public static String a(ab paramab, String paramString)
  {
    return s.a(paramab, paramString);
  }
  
  public static String a(ab paramab, String paramString, boolean paramBoolean)
  {
    if (paramab == null) {}
    do
    {
      return paramString;
      if ((paramBoolean) && (bi.oW(paramab.field_nickname))) {
        return ((b)g.l(b.class)).Ga().gT(paramString);
      }
      if ((paramab.BL() != null) && (paramab.BL().length() > 0)) {
        return paramab.BL();
      }
    } while ((!bi.oW(paramab.field_nickname)) || (!s.hN(paramString)));
    return a.fv(paramString);
  }
  
  public static String c(ab paramab)
  {
    Object localObject = gT(paramab.field_username);
    if ((!s.fq(paramab.field_username)) || (!((String)localObject).equals(paramab.field_username))) {
      return (String)localObject;
    }
    localObject = ((b)g.l(b.class)).Ga().il(paramab.field_username);
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      paramab = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramab.add(gT((String)((Iterator)localObject).next()));
      }
      return "(" + bi.c(paramab, ", ") + ")";
    }
    return ad.getResources().getString(b.a.address_chatroom_contact_nick);
  }
  
  public static void d(Set<String> paramSet)
  {
    dAL = paramSet;
  }
  
  public static String gR(String paramString)
  {
    ab localab = ((i)g.l(i.class)).FR().Yg(paramString);
    if (localab == null) {}
    while (bi.oW(localab.field_nickname)) {
      return paramString;
    }
    return localab.field_nickname;
  }
  
  public static String gS(String paramString)
  {
    String str;
    if ((paramString == null) || (paramString.length() <= 0)) {
      str = "";
    }
    ab localab;
    do
    {
      do
      {
        do
        {
          return str;
          localab = ((i)g.l(i.class)).FR().Yg(paramString);
          x.d("MicroMsg.ContactCommDisplay", "username: %s", new Object[] { paramString });
          str = paramString;
        } while (localab == null);
        if ((paramString.toLowerCase().endsWith("@chatroom")) && (bi.oW(localab.field_nickname)))
        {
          str = ((b)g.l(b.class)).Ga().gT(paramString);
          if (!bi.oW(str)) {
            return str;
          }
        }
        str = paramString;
      } while (localab.BK() == null);
      str = paramString;
    } while (localab.BK().length() <= 0);
    return localab.BK();
  }
  
  public static String gT(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return "";
    }
    return s.a(((i)g.l(i.class)).FR().Yg(paramString), paramString);
  }
  
  public static String gU(String paramString)
  {
    paramString = ((i)g.l(i.class)).FR().Yg(paramString);
    if (paramString == null) {
      return "";
    }
    if (!bi.oW(paramString.field_conRemark)) {
      return paramString.field_conRemark;
    }
    return "";
  }
  
  public static String gV(String paramString)
  {
    String str = paramString;
    if (dAL.contains(paramString)) {
      str = "";
    }
    return str;
  }
  
  public static String getDisplayName(String paramString1, String paramString2)
  {
    Object localObject;
    if (bi.oW(paramString2)) {
      localObject = gT(paramString1);
    }
    do
    {
      String str;
      do
      {
        return (String)localObject;
        str = gU(paramString1);
        localObject = str;
      } while (!bi.oW(str));
      paramString2 = m.L(paramString1, paramString2);
      localObject = paramString2;
    } while (!bi.oW(paramString2));
    return gT(paramString1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
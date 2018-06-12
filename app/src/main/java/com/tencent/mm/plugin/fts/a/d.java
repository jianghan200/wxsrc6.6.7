package com.tencent.mm.plugin.fts.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.os.Bundle;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.af;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.emoji.b.a;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static final HashMap<String, String> jqH = new HashMap();
  private static String[] jqI = { "wxid_", "wx_", "gh_" };
  
  public static String Bc(String paramString)
  {
    ab localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramString);
    String str = paramString;
    if (localab != null)
    {
      if (bi.oW(localab.field_conRemark)) {
        break label43;
      }
      str = localab.field_conRemark;
    }
    label43:
    do
    {
      return str;
      if (!bi.oW(localab.field_nickname)) {
        return localab.field_nickname;
      }
      if (!s.fq(localab.field_username)) {
        break;
      }
      paramString = ((b)com.tencent.mm.kernel.g.l(b.class)).Ga().gT(paramString);
      str = paramString;
    } while (!bi.oW(paramString));
    return localab.field_username;
  }
  
  public static String Ct(String paramString)
  {
    if (s.fq(paramString)) {}
    ab localab;
    do
    {
      do
      {
        return paramString;
        localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramString);
      } while (localab == null);
      if (!bi.oW(localab.field_conRemarkPYFull)) {
        return localab.field_conRemarkPYFull;
      }
      if (!bi.oW(localab.wQ())) {
        return localab.wQ();
      }
    } while (bi.oW(localab.wM()));
    return localab.wM();
  }
  
  public static final String Cu(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.trim();
    return g.Cz(((a)com.tencent.mm.kernel.g.l(a.class)).cp(paramString, " "));
  }
  
  public static final String Cv(String paramString)
  {
    return g.Cz(paramString.toLowerCase());
  }
  
  public static final String Cw(String paramString)
  {
    if (paramString != null) {
      return paramString.replace('*', ' ').trim();
    }
    return null;
  }
  
  public static boolean Cx(String paramString)
  {
    if (paramString == null) {}
    while ((paramString.length() >= 20) || (!paramString.matches("^[0-9]+$"))) {
      return false;
    }
    return true;
  }
  
  public static boolean Cy(String paramString)
  {
    if (paramString == null) {}
    while ((paramString.length() >= 20) || (!paramString.matches("^[A-Za-z0-9\\-_]+$"))) {
      return false;
    }
    return true;
  }
  
  public static int a(Map<Integer, Integer> paramMap, int paramInt1, int paramInt2)
  {
    int i = Integer.MAX_VALUE;
    if (paramInt1 == paramInt2) {
      return 0;
    }
    Integer localInteger = (Integer)paramMap.get(Integer.valueOf(paramInt1));
    if (localInteger == null)
    {
      paramInt1 = Integer.MAX_VALUE;
      paramMap = (Integer)paramMap.get(Integer.valueOf(paramInt2));
      if (paramMap != null) {
        break label66;
      }
    }
    label66:
    for (paramInt2 = i;; paramInt2 = paramMap.intValue())
    {
      return paramInt1 - paramInt2;
      paramInt1 = localInteger.intValue();
      break;
    }
  }
  
  public static List<l> a(List<l> paramList, Map<Integer, Integer> paramMap)
  {
    paramMap = new d.1(paramMap);
    l locall = new l();
    locall.type = 131073;
    int j = Collections.binarySearch(paramList, locall, paramMap);
    locall.type = 131074;
    int k = Collections.binarySearch(paramList, locall, paramMap);
    int i = j;
    if (j < 0)
    {
      j = -j - 1;
      if (k >= 0) {
        break label113;
      }
      i = -k - 1;
    }
    for (;;)
    {
      return paramList.subList(j, i);
      do
      {
        i -= 1;
      } while ((i >= 0) && (((l)paramList.get(i)).type == 131073));
      j = i + 1;
      break;
      label113:
      int m = paramList.size();
      i = k + 1;
      while ((i < m) && (((l)paramList.get(i)).type == 131074)) {
        i += 1;
      }
    }
  }
  
  public static final HashMap<String, String> aPY()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = jqH.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(localEntry.getKey(), localEntry.getValue());
    }
    return localHashMap;
  }
  
  public static String av(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    String str = Cu(paramString).toLowerCase();
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    int j = 0;
    if (i < str.length())
    {
      char c = str.charAt(i);
      if (g.i(c))
      {
        String[] arrayOfString = (String[])g.jrm.get(String.valueOf(c));
        if ((arrayOfString != null) && (arrayOfString.length > 0) && (arrayOfString[0].length() > 1))
        {
          ArrayList localArrayList2 = new ArrayList();
          j = 0;
          if (j < arrayOfString.length)
          {
            if (paramBoolean) {}
            for (paramString = arrayOfString[j].substring(0, 1);; paramString = arrayOfString[j])
            {
              if (!localArrayList2.contains(paramString)) {
                localArrayList2.add(paramString);
              }
              j += 1;
              break;
            }
          }
          localArrayList1.add(bi.c(localArrayList2, "‏"));
          j = 1;
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList1.add(" ");
        continue;
        localArrayList1.add(" ");
      }
    }
    if (j != 0) {
      return bi.c(localArrayList1, "‍");
    }
    return null;
  }
  
  public static void b(Context paramContext, String paramString, Intent paramIntent)
  {
    try
    {
      String str2 = ad.chX() + ".plugin.fts";
      String str1 = paramString;
      if (paramString.startsWith(".")) {
        str1 = str2 + paramString;
      }
      paramIntent.setClassName(ad.getPackageName(), str1);
      Class.forName(str1, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(paramIntent);
        return;
      }
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
      return;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
    }
  }
  
  public static void b(Context paramContext, String paramString, Intent paramIntent, Bundle paramBundle)
  {
    Intent localIntent = paramIntent;
    if (paramIntent == null) {}
    try
    {
      localIntent = new Intent();
      String str = ad.chX() + ".plugin.fts";
      paramIntent = paramString;
      if (paramString.startsWith(".")) {
        paramIntent = str + paramString;
      }
      localIntent.setClassName(ad.getPackageName(), paramIntent);
      Class.forName(paramIntent, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(localIntent, paramBundle);
        return;
      }
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent, paramBundle);
      return;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
    }
  }
  
  public static boolean b(int paramInt, int[] paramArrayOfInt)
  {
    boolean bool2 = false;
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramInt == paramArrayOfInt[i]) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static final void bj(List<l> paramList)
  {
    jqH.clear();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      l locall = (l)paramList.next();
      if ((locall.userData instanceof String)) {
        jqH.put(locall.jrv, (String)locall.userData);
      } else {
        jqH.put(locall.jrv, "");
      }
    }
  }
  
  public static int c(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = Integer.MAX_VALUE;
    if (paramInt1 == paramInt2) {
      return 0;
    }
    if (paramInt1 >= paramArrayOfInt.length)
    {
      paramInt1 = Integer.MAX_VALUE;
      if (paramInt2 < paramArrayOfInt.length) {
        break label38;
      }
    }
    label38:
    for (paramInt2 = i;; paramInt2 = paramArrayOfInt[paramInt2])
    {
      return paramInt1 - paramInt2;
      paramInt1 = paramArrayOfInt[paramInt1];
      break;
    }
  }
  
  public static String cS(String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (paramString2.length() > 0)) {
      return paramString2;
    }
    paramString2 = jqI;
    int j = paramString2.length;
    int i = 0;
    while (i < j)
    {
      if (paramString1.startsWith(paramString2[i])) {
        return null;
      }
      i += 1;
    }
    if (paramString1.indexOf('@') >= 0) {
      return null;
    }
    return paramString1;
  }
  
  public static boolean f(int[] paramArrayOfInt, int paramInt)
  {
    return Arrays.binarySearch(paramArrayOfInt, paramInt) >= 0;
  }
  
  public static String l(int[] paramArrayOfInt)
  {
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append('(');
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(paramArrayOfInt[i]).append(',');
      i += 1;
    }
    localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
    return localStringBuilder.toString();
  }
  
  public static final String u(String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder(32);
    int k = paramArrayOfString.length;
    int j = 0;
    if (j < k)
    {
      String str = paramArrayOfString[j];
      localStringBuilder.append("\"");
      localStringBuilder.append(str);
      int i = str.charAt(str.length() - 1);
      if ((i >= 48) && (i <= 57))
      {
        i = 1;
        label70:
        if (i == 0) {
          break label129;
        }
        localStringBuilder.append("\"* ");
      }
      for (;;)
      {
        j += 1;
        break;
        if ((i >= 65) && (i <= 90))
        {
          i = 1;
          break label70;
        }
        if ((i >= 97) && (i <= 122))
        {
          i = 1;
          break label70;
        }
        i = 0;
        break label70;
        label129:
        localStringBuilder.append("\" ");
      }
    }
    return localStringBuilder.toString().trim();
  }
  
  public static boolean u(long paramLong1, long paramLong2)
  {
    boolean bool = false;
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    paramLong1 = localCalendar.getTimeInMillis();
    localCalendar.setTimeInMillis(paramLong2);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    if (paramLong1 == localCalendar.getTimeInMillis()) {
      bool = true;
    }
    return bool;
  }
  
  public static String v(String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append('(');
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfString[i];
      localStringBuilder.append(DatabaseUtils.sqlEscapeString(str) + ',');
      i += 1;
    }
    localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
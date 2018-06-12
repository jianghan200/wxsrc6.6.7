package com.tencent.mm.plugin.freewifi.f;

import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.xm;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  private static volatile boolean jlI = true;
  static Pattern jlJ = Pattern.compile("\"result\":(-?[0-9]+)");
  static Pattern jlK = Pattern.compile("\"stageName\":\"(.+?)\"");
  
  static String M(LinkedList<xm> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramLinkedList = (xm)localIterator.next();
      localStringBuilder.append("|id=").append(m.BR(paramLinkedList.id)).append("|");
      String[] arrayOfString = m.BR(paramLinkedList.rDq).split("\\},");
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        Matcher localMatcher = jlK.matcher(str);
        paramLinkedList = "";
        if (localMatcher.find()) {
          paramLinkedList = localMatcher.group(1);
        }
        localMatcher = jlJ.matcher(str);
        str = "0";
        if (localMatcher.find()) {
          str = localMatcher.group(1);
        }
        localStringBuilder.append(k.BP(paramLinkedList) + "=" + str).append("|");
        i += 1;
      }
    }
    return localStringBuilder.toString();
  }
  
  public static void kB(int paramInt)
  {
    j.aOO().aOv().post(new b.1(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
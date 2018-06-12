package com.tencent.pb.common.c;

import com.tencent.pb.common.b.a.a.c;
import com.tencent.pb.common.b.a.a.w;
import com.tencent.pb.common.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class f
{
  private static Object qs = new Object();
  private static HashMap<String, String> vgj = new HashMap();
  
  public static void acV()
  {
    synchronized (qs)
    {
      vgj.clear();
      return;
    }
  }
  
  private static void aj(ArrayList<a.w> paramArrayList)
  {
    for (;;)
    {
      StringBuffer localStringBuffer;
      Object localObject3;
      String str1;
      String str2;
      synchronized (qs)
      {
        Object localObject2 = vgj.keySet();
        if ((localObject2 == null) || (((Set)localObject2).size() <= 0)) {
          return;
        }
        localStringBuffer = new StringBuffer();
        localObject2 = ((Set)localObject2).iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject3 = (String)((Iterator)localObject2).next();
        ??? = ((String)localObject3).split("---");
        if (???.length < 2) {
          continue;
        }
        str1 = ???[0];
        str2 = ???[1];
      }
      synchronized (qs)
      {
        localObject3 = (String)vgj.get(localObject3);
        if ((localObject3 != null) && (((String)localObject3).length() != 0))
        {
          localObject3 = ((String)localObject3).split("---");
          if ((localObject3 != null) && (localObject3.length != 0))
          {
            int j = localObject3.length;
            int i = 0;
            while (i < j)
            {
              ??? = localObject3[i];
              if ((??? != null) && (((String)???).length() != 0))
              {
                Object localObject4 = ((String)???).split("%");
                if (localObject4.length == 2) {
                  ??? = localObject4[1];
                }
                localObject4 = new a.w();
                ((a.w)localObject4).vdY = str1;
                localStringBuffer.setLength(0);
                localStringBuffer.append(str2);
                localStringBuffer.append("%");
                localStringBuffer.append((String)???);
                ((a.w)localObject4).vdZ = localStringBuffer.toString();
                paramArrayList.add(localObject4);
              }
              i += 1;
            }
            paramArrayList = finally;
            throw paramArrayList;
          }
        }
      }
    }
  }
  
  public static void cEF()
  {
    if (!h.isNetworkConnected())
    {
      c.x("StatisticsUtil", new Object[] { "reportStatisticsData network is false" });
      return;
    }
    ArrayList localArrayList = new ArrayList();
    aj(localArrayList);
    a.c localc;
    if (localArrayList.size() > 0)
    {
      localc = new a.c();
      a.w[] arrayOfw = new a.w[localArrayList.size()];
      localArrayList.toArray(arrayOfw);
      localc.vcJ = arrayOfw;
    }
    while (localc == null)
    {
      c.x("StatisticsUtil", new Object[] { "reportStatisticsData CSClientReportReq is null" });
      return;
      localc = null;
    }
    c.x("yunying", new Object[] { "reportStatisticsData" });
    c.d("StatisticsUtil", new Object[] { "reportStatisticsData start ret: ", Integer.valueOf(com.tencent.pb.common.b.f.cEq().a(new f.1(), "CsCmd.Cmd_CSClientReportReq", localc)) });
  }
  
  public static void u(int paramInt1, int paramInt2, String paramString)
  {
    if (paramString == null)
    {
      c.x("gyz", new Object[] { "addEmergencyRecord value is null" });
      return;
    }
    try
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(paramInt1);
      localStringBuffer.append("---");
      localStringBuffer.append(paramInt2);
      synchronized (qs)
      {
        String str = (String)vgj.get(localStringBuffer.toString());
        Object localObject1 = paramString;
        if (str != null)
        {
          localObject1 = paramString;
          if (str.length() > 0)
          {
            localObject1 = new StringBuffer(str);
            ((StringBuffer)localObject1).append("---");
            ((StringBuffer)localObject1).append(paramString);
            localObject1 = ((StringBuffer)localObject1).toString();
          }
        }
        vgj.put(localStringBuffer.toString(), localObject1);
        return;
      }
      return;
    }
    catch (Throwable paramString)
    {
      c.x("gyz", new Object[] { paramString });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/pb/common/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
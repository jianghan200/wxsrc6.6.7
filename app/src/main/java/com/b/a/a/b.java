package com.b.a.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

public class b
{
  private static volatile Integer ach;
  
  public static int V(Context paramContext)
  {
    int k = 2011;
    int j = -1;
    if (ach == null) {}
    for (;;)
    {
      long l;
      try
      {
        ArrayList localArrayList;
        if (ach == null)
        {
          l = a.U(paramContext);
          if (l != -1L) {
            continue;
          }
          localArrayList = new ArrayList();
          i = a.in();
          if (i <= 0)
          {
            i = -1;
            c(localArrayList, i);
            l = a.io();
            if (l != -1L) {
              continue;
            }
            i = -1;
            c(localArrayList, i);
            l = a.U(paramContext);
            if (l > 0L) {
              continue;
            }
            i = -1;
            c(localArrayList, i);
            if (!localArrayList.isEmpty()) {
              continue;
            }
            i = j;
            ach = Integer.valueOf(i);
          }
        }
        else
        {
          return ach.intValue();
        }
        if (i == 1)
        {
          i = 2008;
          continue;
        }
        if (i <= 3)
        {
          i = 2011;
          continue;
        }
        i = 2012;
        continue;
        if (l <= 528000L)
        {
          i = 2008;
          continue;
        }
        if (l <= 620000L)
        {
          i = 2009;
          continue;
        }
        if (l <= 1020000L)
        {
          i = 2010;
          continue;
        }
        if (l <= 1220000L)
        {
          i = 2011;
          continue;
        }
        if (l <= 1520000L)
        {
          i = 2012;
          continue;
        }
        if (l <= 2020000L)
        {
          i = 2013;
          continue;
        }
        i = 2014;
        continue;
        if (l <= 201326592L)
        {
          i = 2008;
          continue;
        }
        if (l <= 304087040L)
        {
          i = 2009;
          continue;
        }
        if (l <= 536870912L)
        {
          i = 2010;
          continue;
        }
        i = k;
        if (l <= 1073741824L) {
          continue;
        }
        if (l <= 1610612736L)
        {
          i = 2012;
          continue;
        }
        if (l <= 2147483648L)
        {
          i = 2013;
          continue;
        }
        i = 2014;
        continue;
        Collections.sort(localArrayList);
        if ((localArrayList.size() & 0x1) == 1)
        {
          i = ((Integer)localArrayList.get(localArrayList.size() / 2)).intValue();
          continue;
        }
        i = localArrayList.size() / 2 - 1;
        j = ((Integer)localArrayList.get(i)).intValue();
        i = (((Integer)localArrayList.get(i + 1)).intValue() - ((Integer)localArrayList.get(i)).intValue()) / 2 + j;
        continue;
        if (l <= 805306368L)
        {
          if (a.in() <= 1) {
            i = 2009;
          }
        }
        else
        {
          if (l <= 1073741824L)
          {
            if (a.io() >= 1300000) {
              break label544;
            }
            i = 2011;
            continue;
          }
          if (l > 1610612736L) {
            break label558;
          }
          if (a.io() >= 1800000) {
            break label551;
          }
          i = 2012;
          continue;
        }
        i = 2010;
      }
      finally {}
      continue;
      label544:
      int i = 2012;
      continue;
      label551:
      i = 2013;
      continue;
      label558:
      if (l <= 2147483648L) {
        i = 2013;
      } else if (l <= 3221225472L) {
        i = 2014;
      } else {
        i = 2015;
      }
    }
  }
  
  private static void c(ArrayList<Integer> paramArrayList, int paramInt)
  {
    if (paramInt != -1) {
      paramArrayList.add(Integer.valueOf(paramInt));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/b/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.fts.a.a;

import android.database.Cursor;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class m
  extends l
{
  private void a(Pattern paramPattern)
  {
    this.jsF = paramPattern.split(this.content);
    this.jsG = new int[this.jsF.length];
    int j = 0;
    int k;
    for (int i = 0; j < this.jsG.length; i = k + 1 + i)
    {
      this.jsG[j] = i;
      k = this.jsF[j].length();
      j += 1;
    }
  }
  
  private void aQd()
  {
    switch (this.jru)
    {
    default: 
      return;
    }
    ArrayList localArrayList = new ArrayList();
    a(c.a.jqA);
    String[] arrayOfString = c.a.jqz.split(this.jsC);
    byte[] arrayOfByte = this.content.getBytes();
    int i = 0;
    int n;
    int j;
    Object localObject;
    String str;
    if (i < arrayOfString.length)
    {
      n = Integer.valueOf(arrayOfString[i]).intValue();
      int m = new String(arrayOfByte, 0, Integer.valueOf(arrayOfString[(i + 1)]).intValue()).length();
      k = Arrays.binarySearch(this.jsG, m);
      j = k;
      if (k < 0) {
        j = -k - 2;
      }
      localObject = this.jsF[j];
      str = null;
      localObject = c.a.jqB.split((CharSequence)localObject);
      m -= this.jsG[j];
      k = 0;
      label165:
      if (k >= localObject.length) {
        break label257;
      }
      m = m - localObject[k].length() - 1;
      if (m < 0) {
        str = localObject[k];
      }
    }
    label257:
    for (int k = com.tencent.mm.plugin.fts.a.c.jqs[k];; k = -1)
    {
      if (k > 0) {
        localArrayList.add(new f(j, n, k, str, localObject[(localObject.length - 1)]));
      }
      i += 2;
      break;
      k += 1;
      break label165;
      this.jsH = localArrayList;
      return;
    }
  }
  
  public final void a(g paramg)
  {
    if (paramg.jrX.length > 1) {
      this.jsJ = 1;
    }
    for (;;)
    {
      if (this.type == 131075) {
        if (System.currentTimeMillis() - this.timestamp < 1209600000L)
        {
          this.jrT += 50;
          String str = q.GF();
          if (this.jru == 38)
          {
            HashSet localHashSet = new HashSet();
            if (this.jsH != null)
            {
              Iterator localIterator = this.jsH.iterator();
              for (;;)
              {
                if (localIterator.hasNext())
                {
                  f localf = (f)localIterator.next();
                  if (!str.equals(localf.cCR))
                  {
                    localHashSet.add(Integer.valueOf(localf.jrP));
                    continue;
                    this.jsJ = 0;
                    break;
                  }
                }
              }
            }
            if (localHashSet.size() >= this.jsA - 1L)
            {
              this.jrT += 20;
              this.jsK = true;
            }
            if ((paramg.jrX.length > 1) && (this.content.contains(paramg.jrV)))
            {
              this.jsJ = 2;
              this.jrT += 5;
            }
            if (this.jsA <= 15L) {
              this.jsM = 1;
            }
          }
          if (((this.jru == 5) || (this.jru == 1)) && (this.content.contains(paramg.jrV)))
          {
            if (paramg.jrX.length > 1) {
              this.jsJ = 2;
            }
            this.jrT += 10;
          }
        }
      }
    }
    do
    {
      do
      {
        return;
      } while (this.type != 131072);
      if (System.currentTimeMillis() - this.timestamp < 1105032704L) {
        this.jrT += 50;
      }
    } while (((this.jru != 5) && (this.jru != 1)) || (!this.content.contains(paramg.jrV)));
    if (paramg.jrX.length > 1) {
      this.jsJ = 2;
    }
    this.jrT += 10;
  }
  
  public final void aQc()
  {
    if (bi.oW(this.jsC)) {
      return;
    }
    switch (this.type)
    {
    default: 
      return;
    case 131072: 
    case 131073: 
    case 131074: 
    case 131076: 
    case 131081: 
    case 262144: 
    case 327680: 
      int i;
      switch (this.jru)
      {
      default: 
        try
        {
          i = Integer.valueOf(c.a.jqz.split(this.jsC)[1]).intValue();
          this.jsD = new String(this.content.getBytes(), 0, i).length();
          this.jsE = this.content;
          return;
        }
        catch (Exception localException1)
        {
          this.jsD = Integer.MAX_VALUE;
          this.jsE = "";
          return;
        }
      case 11: 
      case 51: 
        this.jsD = Integer.MAX_VALUE;
        this.jsE = "";
        return;
      }
      try
      {
        String[] arrayOfString = c.a.jqz.split(this.jsC);
        a(c.a.jqD);
        i = Integer.valueOf(arrayOfString[1]).intValue();
        i = new String(this.content.getBytes(), 0, i).length();
        this.jsD = Arrays.binarySearch(this.jsG, i);
        if (this.jsD < 0) {
          this.jsD = (-this.jsD - 2);
        }
        this.jsE = this.jsF[this.jsD];
        return;
      }
      catch (Exception localException2)
      {
        this.jsD = Integer.MAX_VALUE;
        this.jsE = "";
        return;
      }
    }
    aQd();
  }
  
  public final m i(Cursor paramCursor)
  {
    this.jsy = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.jru = paramCursor.getInt(2);
    this.jsA = paramCursor.getLong(3);
    this.jrv = paramCursor.getString(4);
    this.timestamp = paramCursor.getLong(5);
    this.talker = paramCursor.getString(6);
    return this;
  }
  
  public final m j(Cursor paramCursor)
  {
    this.jsy = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.jru = paramCursor.getInt(2);
    this.jsA = paramCursor.getLong(3);
    this.jrv = paramCursor.getString(4);
    this.timestamp = paramCursor.getLong(5);
    this.content = paramCursor.getString(6);
    this.jsC = paramCursor.getString(7);
    this.jsI = paramCursor.getLong(8);
    return this;
  }
  
  public final m k(Cursor paramCursor)
  {
    this.jsy = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.jru = paramCursor.getInt(2);
    this.jsA = paramCursor.getLong(3);
    this.jrv = paramCursor.getString(4);
    this.timestamp = paramCursor.getLong(5);
    if (paramCursor.getColumnCount() >= 7) {
      this.content = paramCursor.getString(6);
    }
    if (paramCursor.getColumnCount() >= 8) {
      this.jsC = paramCursor.getString(7);
    }
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fts/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
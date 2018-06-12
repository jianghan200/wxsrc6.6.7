package com.tencent.mm.plugin.clean.c;

import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Calendar;

public final class a
{
  public long bIZ;
  public String bOX;
  public long enK;
  public String filePath;
  public long size;
  public int type;
  private String userName;
  
  public a(String paramString1, String paramString2, int paramInt, String paramString3, long paramLong1, long paramLong2)
  {
    this.size = e.cm(paramString2);
    x.v("MicroMsg.AnalyseItem", "add mst %d %d %s %s %d", new Object[] { Long.valueOf(this.size), Integer.valueOf(paramInt), bi.gc(this.size), paramString3, Long.valueOf(paramLong1) });
    this.bOX = paramString1;
    this.type = paramInt;
    this.filePath = paramString2;
    this.userName = paramString3;
    this.bIZ = paramLong1;
    this.enK = paramLong2;
  }
  
  public final long aAX()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.enK);
    int i = localCalendar.get(1);
    return localCalendar.get(2) + i * 100;
  }
  
  public final String toString()
  {
    switch (this.type)
    {
    default: 
      return "";
    case 1: 
      return String.format("%-8s    %-10s  %s\r\n", new Object[] { "IMG", bi.gc(this.size), this.filePath });
    case 3: 
      return String.format("%-8s    %-10s  %s\r\n", new Object[] { "VIDEO", bi.gc(this.size), this.filePath });
    case 2: 
      return String.format("%-8s    %-10s  %s\r\n", new Object[] { "VOICE", bi.gc(this.size), this.filePath });
    }
    return String.format("%-8s    %-10s  %s\r\n", new Object[] { "ATTACH", bi.gc(this.size), this.filePath });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/clean/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
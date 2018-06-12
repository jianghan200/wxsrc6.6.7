package com.tencent.mm.plugin.clean.c;

import com.tencent.mm.plugin.j.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public final class i
{
  public long bIZ;
  public String bOX;
  public long enK;
  public String filePath;
  public List<a> hRo = new ArrayList();
  public long size;
  public int type;
  public String userName;
  
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/clean/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
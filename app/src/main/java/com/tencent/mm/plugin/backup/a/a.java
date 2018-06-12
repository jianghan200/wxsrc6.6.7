package com.tencent.mm.plugin.backup.a;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class a
{
  private static String TAG = "MicroMsg.BackupBaseModel";
  private static LinkedList<a> gRj = new LinkedList();
  
  public static void a(a parama)
  {
    gRj.add(parama);
  }
  
  public static void aqJ()
  {
    Iterator localIterator = gRj.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).aqK();
    }
    gRj.clear();
  }
  
  public abstract void aqK();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/backup/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
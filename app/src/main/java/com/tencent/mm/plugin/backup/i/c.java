package com.tencent.mm.plugin.backup.i;

import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;

public final class c
{
  private static String TAG = "MicroMsg.BackupModelFactory";
  
  public static d mV(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      return null;
    case 1: 
      return com.tencent.mm.plugin.backup.backuppcmodel.b.arV();
    case 2: 
      return com.tencent.mm.plugin.backup.c.b.arv();
    }
    return a.asN();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/backup/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
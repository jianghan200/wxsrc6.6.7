package com.tencent.mm.plugin.backup.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public abstract class d
  extends a
{
  private static String TAG = "MicroMsg.BackupModel";
  private static boolean dpm = false;
  private static SharedPreferences gRB;
  private static int gRy = 0;
  private static byte[] gRz = "key".getBytes();
  public byte[] gRA;
  public String gRu = "id";
  public String gRv = "hello";
  public String gRw = "ok";
  public e gRx;
  
  public static void X(byte[] paramArrayOfByte)
  {
    gRz = paramArrayOfByte;
  }
  
  public static int aqS()
  {
    return gRy;
  }
  
  public static byte[] aqT()
  {
    return gRz;
  }
  
  public static SharedPreferences aqU()
  {
    if (gRB == null) {
      gRB = ad.getContext().getSharedPreferences("BACKUP_CONFIG", 4);
    }
    return gRB;
  }
  
  public static void aqV()
  {
    x.i(TAG, "holdReset");
    dpm = true;
  }
  
  public static boolean aqW()
  {
    return dpm;
  }
  
  public static void aqX()
  {
    gRz = "key".getBytes();
    gRy = 0;
    gRB = null;
    dpm = false;
  }
  
  public static void mx(int paramInt)
  {
    gRy = paramInt;
  }
  
  public final e aqP()
  {
    if (this.gRx == null) {
      this.gRx = new e();
    }
    return this.gRx;
  }
  
  public abstract void aqQ();
  
  public abstract void aqR();
  
  public abstract void l(Object... paramVarArgs);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
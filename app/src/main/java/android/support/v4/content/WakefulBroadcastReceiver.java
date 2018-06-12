package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver
  extends BroadcastReceiver
{
  private static final SparseArray<PowerManager.WakeLock> rl = new SparseArray();
  private static int rm = 1;
  
  public static ComponentName b(Context paramContext, Intent paramIntent)
  {
    synchronized (rl)
    {
      int i = rm;
      int j = rm + 1;
      rm = j;
      if (j <= 0) {
        rm = 1;
      }
      paramIntent.putExtra("android.support.content.wakelockid", i);
      paramIntent = paramContext.startService(paramIntent);
      if (paramIntent == null) {
        return null;
      }
      paramContext = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "wake:" + paramIntent.flattenToShortString());
      paramContext.setReferenceCounted(false);
      paramContext.acquire(60000L);
      rl.put(i, paramContext);
      return paramIntent;
    }
  }
  
  public static boolean b(Intent arg0)
  {
    int i = ???.getIntExtra("android.support.content.wakelockid", 0);
    if (i == 0) {
      return false;
    }
    synchronized (rl)
    {
      PowerManager.WakeLock localWakeLock = (PowerManager.WakeLock)rl.get(i);
      if (localWakeLock != null)
      {
        localWakeLock.release();
        rl.remove(i);
        return true;
      }
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/v4/content/WakefulBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
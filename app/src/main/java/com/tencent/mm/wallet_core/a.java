package com.tencent.mm.wallet_core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Toast;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static Map<String, Class<?>> uWQ = new HashMap();
  private static SparseArray<c> uWR = new SparseArray();
  
  public static void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle)
  {
    a(paramActivity, paramClass, paramBundle, null);
  }
  
  public static void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle, c.a parama)
  {
    x.i("MicroMsg.ProcessManager", "startProcess to1 context:%s proc name: %s bundle %s", new Object[] { paramActivity, paramClass.getSimpleName(), al(paramBundle) });
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {}
    try
    {
      localBundle = new Bundle();
      if (localBundle.getLong("key_SessionId", 0L) == 0L) {
        localBundle.putLong("key_SessionId", System.currentTimeMillis());
      }
      paramBundle = (c)paramClass.newInstance();
      paramBundle.am(localBundle);
      paramBundle.a(parama);
      paramBundle.a(paramActivity, localBundle);
      uWR.put(paramClass.hashCode(), paramBundle);
      return;
    }
    catch (Exception paramActivity)
    {
      x.printErrStackTrace("MicroMsg.ProcessManager", paramActivity, "", new Object[0]);
    }
  }
  
  public static void a(Activity paramActivity, String paramString, Bundle paramBundle, c.a parama)
  {
    try
    {
      x.i("MicroMsg.ProcessManager", "startProcess to2 context:%s proc name: %s bundle %s", new Object[] { paramActivity, paramString, al(paramBundle) });
      Class localClass = (Class)uWQ.get(paramString);
      if (localClass == null)
      {
        paramString = String.format("start process=%s fail, process not register or plugin no import", new Object[] { paramString });
        x.e("MicroMsg.ProcessManager", paramString);
        s.makeText(paramActivity, paramString, 1).show();
        return;
      }
      a(paramActivity, localClass, paramBundle, parama);
      return;
    }
    catch (Exception paramActivity)
    {
      x.e("MicroMsg.ProcessManager", "plugin load failed : " + paramActivity.toString());
      x.printErrStackTrace("MicroMsg.ProcessManager", paramActivity, "", new Object[0]);
    }
  }
  
  public static void ac(Activity paramActivity)
  {
    c localc = af(paramActivity);
    if (localc == null) {}
    for (String str = "";; str = localc.aNK())
    {
      x.i("MicroMsg.ProcessManager", "backProcess to1 context: %s procname %s", new Object[] { paramActivity, str });
      if (localc != null) {
        localc.c(paramActivity, 0);
      }
      return;
    }
  }
  
  public static boolean ad(Activity paramActivity)
  {
    return af(paramActivity) != null;
  }
  
  public static Bundle ae(Activity paramActivity)
  {
    paramActivity = af(paramActivity);
    if (paramActivity != null) {
      return paramActivity.jfZ;
    }
    return new Bundle();
  }
  
  public static c af(Activity paramActivity)
  {
    if (paramActivity == null)
    {
      x.w("MicroMsg.ProcessManager", "hy: ac is null");
      return null;
    }
    if (paramActivity.getIntent() == null)
    {
      x.w("MicroMsg.ProcessManager", "hy: get intent is null");
      return null;
    }
    return (c)uWR.get(paramActivity.getIntent().getIntExtra("process_id", 0));
  }
  
  private static String al(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return "";
    }
    return paramBundle.toString();
  }
  
  public static void b(Activity paramActivity, String paramString, Bundle paramBundle)
  {
    a(paramActivity, paramString, paramBundle, null);
  }
  
  public static void c(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    x.i("MicroMsg.ProcessManager", "endProcess with errCode : " + paramInt);
    if (paramActivity == null) {
      x.w("MicroMsg.ProcessManager", "hy: end context is null");
    }
    c localc = af(paramActivity);
    String str2 = al(paramBundle);
    String str1;
    if (localc == null)
    {
      str1 = "";
      x.i("MicroMsg.ProcessManager", "endProcess to1 context: %s bundle: %s procName %s", new Object[] { paramActivity, str2, str1 });
      if (localc == null) {
        break label98;
      }
      localc.b(paramActivity, paramBundle);
    }
    label98:
    while (paramActivity.isFinishing())
    {
      return;
      str1 = localc.aNK();
      break;
    }
    paramActivity.finish();
  }
  
  public static void i(String paramString, Class<?> paramClass)
  {
    if (uWQ.containsKey(paramString)) {
      throw new IllegalArgumentException("register process fail, exist process=" + paramString);
    }
    uWQ.put(paramString, paramClass);
  }
  
  public static void j(Activity paramActivity, Bundle paramBundle)
  {
    c localc = af(paramActivity);
    String str2 = al(paramBundle);
    if (localc == null) {}
    for (String str1 = "";; str1 = localc.aNK())
    {
      x.i("MicroMsg.ProcessManager", "forwardProcess to1 context: %s bundle: %s procName %s", new Object[] { paramActivity, str2, str1 });
      if (localc != null) {
        localc.a(paramActivity, 0, paramBundle);
      }
      return;
    }
  }
  
  public static boolean k(Activity paramActivity, Bundle paramBundle)
  {
    paramActivity = af(paramActivity);
    if (paramActivity != null)
    {
      paramActivity.am(paramBundle);
      return true;
    }
    return false;
  }
  
  public static void m(Activity paramActivity, int paramInt)
  {
    if (paramActivity == null) {
      x.w("MicroMsg.ProcessManager", "hy: back context is null");
    }
    c localc = af(paramActivity);
    String str;
    if (localc == null)
    {
      str = "";
      x.i("MicroMsg.ProcessManager", "backProcess to1 context: %s errCode %s procname %s ", new Object[] { paramActivity, Integer.valueOf(paramInt), str });
      if (localc == null) {
        break label68;
      }
      localc.c(paramActivity, paramInt);
    }
    label68:
    while (paramActivity.isFinishing())
    {
      return;
      str = localc.aNK();
      break;
    }
    paramActivity.finish();
  }
  
  public static void remove(int paramInt)
  {
    uWR.remove(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
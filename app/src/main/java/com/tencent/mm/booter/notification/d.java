package com.tencent.mm.booter.notification;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.queue.NotificationQueue;
import com.tencent.mm.booter.notification.queue.NotificationQueue.ParcelNotificationQueue;
import com.tencent.mm.k.f;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.LauncherUI;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  private static boolean cYA = true;
  private static boolean cYB = true;
  private static boolean cYC = false;
  private static int cYD = -1;
  private static int cYE = -1;
  private static boolean cYF = true;
  private static String cYG = "samsung";
  public static boolean cYH = true;
  public static boolean cYI = false;
  private static int cYJ = -1;
  private static boolean cYK = true;
  private static Uri cYL = Uri.parse("content://com.android.badge/badge");
  
  public static int a(Notification paramNotification, g paramg)
  {
    if ((paramNotification == null) || (!cYA)) {
      return 0;
    }
    int i;
    if (paramg == null) {
      i = 0;
    }
    try
    {
      paramg = Class.forName("android.app.MiuiNotification").newInstance();
      Field localField = paramg.getClass().getDeclaredField("messageCount");
      localField.setAccessible(true);
      localField.set(paramg, Integer.valueOf(i));
      paramNotification.getClass().getField("extraNotification").set(paramNotification, paramg);
      x.i("MicroMsg.BusinessNotification", "miuiNotification: %d", new Object[] { Integer.valueOf(i) });
      return i;
    }
    catch (NoSuchFieldException paramNotification)
    {
      for (;;)
      {
        cYA = false;
        return i;
        int j = paramg.cZz;
        paramg = com.tencent.mm.booter.notification.queue.b.yb().cZa;
        if (paramg.cYZ == null) {
          paramg.restore();
        }
        paramg = paramg.cYZ.iterator();
        for (i = 0; paramg.hasNext(); i = ((NotificationItem)paramg.next()).cYT + i) {}
        i = j - i;
      }
    }
    catch (IllegalArgumentException paramNotification)
    {
      cYA = false;
      return i;
    }
    catch (IllegalAccessException paramNotification)
    {
      cYA = false;
      return i;
    }
    catch (ClassNotFoundException paramNotification)
    {
      cYA = false;
      return i;
    }
    catch (InstantiationException paramNotification)
    {
      cYA = false;
      return i;
    }
    catch (Exception paramNotification)
    {
      cYA = false;
    }
    return i;
  }
  
  public static void aT(boolean paramBoolean)
  {
    if (!cYK) {}
    for (;;)
    {
      return;
      Object localObject1 = ad.getContext();
      if (localObject1 != null)
      {
        localObject1 = ((Context)localObject1).getContentResolver();
        if (localObject1 != null)
        {
          try
          {
            x.i("MicroMsg.BusinessNotification", "sync all user badge");
            localObject1 = ((ContentResolver)localObject1).call(cYL, "getShortcutList", null, null);
            if (localObject1 == null)
            {
              x.i("MicroMsg.BusinessNotification", "getShortcutList return null");
              return;
            }
          }
          catch (Exception localException)
          {
            x.printErrStackTrace("MicroMsg.BusinessNotification", localException, "sync all user badge: no support getShortcutList", new Object[0]);
            return;
          }
          Object localObject2 = localException.getString("shortcut_list");
          if (localObject2 != null)
          {
            localObject2 = new JSONArray((String)localObject2);
            int i = 0;
            while (i < ((JSONArray)localObject2).length())
            {
              String str = ((JSONObject)((JSONArray)localObject2).get(i)).getString("app_shortcut_custom_id");
              if ((str != null) && (!str.equalsIgnoreCase("null")))
              {
                str = com.tencent.mm.plugin.base.model.b.wL(str);
                if (paramBoolean) {}
                for (int j = 0;; j = f.fo(str))
                {
                  w(str, j);
                  break;
                }
              }
              i += 1;
            }
          }
        }
      }
    }
  }
  
  private static boolean c(Context paramContext, String paramString, int paramInt)
  {
    boolean bool = true;
    if (!cYK) {
      return false;
    }
    for (;;)
    {
      try
      {
        Bundle localBundle = new Bundle();
        if (paramString != null)
        {
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(paramString);
          localBundle.putStringArrayList("app_shortcut_custom_id", localArrayList);
          localBundle.putInt("app_badge_count", paramInt);
          localBundle.putString("app_shortcut_class_name", ad.chX() + ".ui.LauncherUI");
          paramContext = paramContext.getContentResolver();
          if ((paramContext != null) && (paramContext.call(cYL, "setAppBadgeCount", null, localBundle) != null))
          {
            x.i("MicroMsg.BusinessNotification", "shortcutId: %s, normalNotification badge count: %d, result: %b", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(bool) });
            return bool;
          }
        }
        else
        {
          localBundle.putStringArrayList("app_shortcut_custom_id", null);
          continue;
        }
        bool = false;
      }
      catch (Exception paramContext)
      {
        cYK = false;
        x.i("MicroMsg.BusinessNotification", "no support normal badge");
        x.e("MicroMsg.BusinessNotification", "alvin: no support normal badge");
        return false;
      }
    }
  }
  
  public static void ft(int paramInt)
  {
    Object localObject;
    int i;
    if ((ad.getContext() != null) && (xZ()))
    {
      localObject = ad.getContext();
      if (paramInt != -1) {
        break label242;
      }
      i = f.AQ();
    }
    for (;;)
    {
      if ((localObject != null) && (xZ()) && (cYJ != i))
      {
        cYJ = i;
        Intent localIntent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        localIntent.putExtra("badge_count", i);
        localIntent.putExtra("badge_count_package_name", ad.getPackageName());
        localIntent.putExtra("badge_count_class_name", LauncherUI.class.getName());
        x.i("MicroMsg.BusinessNotification", "samsungNotification: %d, %s", new Object[] { Integer.valueOf(i), Build.BRAND });
        ((Context)localObject).sendBroadcast(localIntent);
      }
      label144:
      boolean bool;
      if (cYF)
      {
        if (Build.VERSION.SDK_INT < 11) {
          cYF = false;
        }
      }
      else
      {
        if (!cYC) {
          break label399;
        }
        bool = cYB;
        label154:
        if ((!bool) || (cYD == paramInt)) {}
      }
      try
      {
        localObject = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        ((Intent)localObject).putExtra("packageName", ad.getPackageName());
        ((Intent)localObject).putExtra("className", LauncherUI.class.getName());
        ((Intent)localObject).putExtra("notificationNum", paramInt);
        ad.getContext().sendBroadcast((Intent)localObject);
        x.i("MicroMsg.BusinessNotification", "vivo badge: %d", new Object[] { Integer.valueOf(paramInt) });
        x(null, paramInt);
        return;
        label242:
        i = paramInt;
        continue;
        if (cYE == paramInt) {
          break label144;
        }
        for (;;)
        {
          try
          {
            localObject = new Bundle();
            ((Bundle)localObject).putString("package", ad.getPackageName());
            ((Bundle)localObject).putString("class", LauncherUI.class.getName());
            ((Bundle)localObject).putInt("badgenumber", paramInt);
            if (ad.getContext().getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, (Bundle)localObject) == null) {
              break label394;
            }
            bool = true;
            cYF = bool;
            x.i("MicroMsg.BusinessNotification", "huawei badge: %d, %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(cYF) });
          }
          catch (Exception localException1)
          {
            x.i("MicroMsg.BusinessNotification", "no huawei badge");
            x.e("MicroMsg.BusinessNotification", "alvin: no badge" + localException1.toString());
            cYF = false;
          }
          break;
          label394:
          bool = false;
        }
        label399:
        cYC = true;
        if (!Build.BRAND.equals("vivo"))
        {
          cYB = false;
          bool = false;
          break label154;
        }
        cYB = true;
        bool = true;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          cYB = false;
          x.printErrStackTrace("MicroMsg.BusinessNotification", localException2, "", new Object[0]);
        }
      }
    }
  }
  
  public static void w(String paramString, int paramInt)
  {
    if (ai.oW(paramString)) {
      x.printErrStackTrace("MicroMsg.BusinessNotification", null, "syncUserBadge username is null", new Object[0]);
    }
    do
    {
      return;
      paramString = com.tencent.mm.plugin.base.model.b.wM(paramString);
    } while (ai.oW(paramString));
    x(paramString, paramInt);
  }
  
  private static void x(String paramString, int paramInt)
  {
    if (ad.getContext() == null)
    {
      x.printErrStackTrace("MicroMsg.BusinessNotification", null, "normal badge context is null", new Object[0]);
      return;
    }
    Context localContext = ad.getContext();
    int i = paramInt;
    if (paramInt < 0) {
      i = f.AQ();
    }
    c(localContext, paramString, i);
  }
  
  private static boolean xZ()
  {
    if (cYI) {
      return cYH;
    }
    cYI = true;
    if (!Build.BRAND.equals(cYG))
    {
      cYH = false;
      return false;
    }
    cYH = true;
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/notification/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
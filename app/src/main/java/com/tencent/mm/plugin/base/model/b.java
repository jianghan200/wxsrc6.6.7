package com.tencent.mm.plugin.base.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Process;
import android.util.DisplayMetrics;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.t;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  public static final String hdt = ;
  private static String hdu = "";
  private static char[] hdv = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static boolean U(Context paramContext, String paramString)
  {
    hdu = q.GF();
    paramString = a(paramContext, paramString, true, hdu);
    Intent localIntent = (Intent)paramString.getParcelableExtra("android.intent.extra.shortcut.INTENT");
    if (localIntent == null) {
      return false;
    }
    a(paramContext, paramString, localIntent.getStringExtra("app_shortcut_custom_id"), true);
    return true;
  }
  
  public static boolean V(Context paramContext, String paramString)
  {
    hdu = q.GF();
    p(paramContext, a(paramContext, paramString, false, hdu));
    return true;
  }
  
  private static Intent a(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    if ((paramString1 == null) || (paramContext == null))
    {
      x.e("MicroMsg.ShortcutManager", "getIntent, wrong parameters");
      return null;
    }
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * 48.0F);
    Object localObject2 = com.tencent.mm.aa.c.a(paramString1, false, -1);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      x.e("MicroMsg.ShortcutManager", "getScaledBitmap fail, bmp is null");
      localObject1 = com.tencent.mm.sdk.platformtools.c.CV(a.d.default_avatar);
    }
    if (localObject1 == null) {
      x.e("MicroMsg.ShortcutManager", "use default avatar, bmp is null");
    }
    for (localObject1 = null; localObject1 == null; localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject1, i, i, false))
    {
      x.e("MicroMsg.ShortcutManager", "no bmp");
      return null;
    }
    localObject2 = ((i)g.l(i.class)).FR().Yg(paramString1);
    if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).dhP <= 0))
    {
      x.e("MicroMsg.ShortcutManager", "no such user");
      return null;
    }
    String str = wM(paramString1);
    x.i("MicroMsg.ShortcutManager", "alvinluo encryptShortcutUser: %s", new Object[] { str });
    if (bi.oW(str)) {
      return null;
    }
    Intent localIntent = new Intent("com.tencent.mm.action.BIZSHORTCUT");
    localIntent.putExtra("LauncherUI.Shortcut.Username", str);
    localIntent.putExtra("LauncherUI.From.Biz.Shortcut", true);
    localIntent.putExtra("app_shortcut_custom_id", str);
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.addFlags(67108864);
    if (paramBoolean) {}
    for (paramContext = "com.android.launcher.action.INSTALL_SHORTCUT";; paramContext = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      paramContext = new Intent(paramContext);
      paramContext.putExtra("android.intent.extra.shortcut.NAME", s.a((ab)localObject2, paramString1));
      paramContext.putExtra("duplicate", false);
      paramContext.putExtra("android.intent.extra.shortcut.INTENT", localIntent);
      paramContext.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)localObject1);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_SOURCE_KEY", hdt);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_OWNER_ID", wM(paramString2));
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_UNIQUE_ID", str);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_TYPE", z((ab)localObject2));
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_CONTAINER", 0);
      return paramContext;
    }
  }
  
  public static void a(Context paramContext, Intent paramIntent, String paramString, boolean paramBoolean)
  {
    if (paramContext == null)
    {
      x.e("MicroMsg.ShortcutManager", "context is null");
      return;
    }
    if (paramIntent == null)
    {
      x.e("MicroMsg.ShortcutManager", "intent is null");
      return;
    }
    if (Build.VERSION.SDK_INT < 26)
    {
      paramContext.sendBroadcast(paramIntent);
      d(paramContext, true, true);
      i = 1;
    }
    label46:
    ShortcutManager localShortcutManager;
    Intent localIntent;
    String str1;
    while ((i == 0) && (paramBoolean))
    {
      d(paramContext, false, paramBoolean);
      return;
      localShortcutManager = (ShortcutManager)paramContext.getSystemService(ShortcutManager.class);
      if (localShortcutManager == null)
      {
        x.e("MicroMsg.ShortcutManager", "shortcut manager is null");
        i = 0;
      }
      else if (!localShortcutManager.isRequestPinShortcutSupported())
      {
        x.e("MicroMsg.ShortcutManager", "alvinluo not support pin shortcuts");
        i = 0;
      }
      else if (paramIntent.getBooleanExtra("is_main_shortcut", false))
      {
        x.i("MicroMsg.ShortcutManager", "alvinluo main icon, do not create shortcut");
        i = 0;
      }
      else
      {
        localIntent = (Intent)paramIntent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
        if (localIntent == null)
        {
          x.e("MicroMsg.ShortcutManager", "alvinluo shortcut intent is null");
          i = 0;
        }
        else
        {
          str1 = paramString;
          if (bi.oW(paramString)) {
            str1 = localIntent.getStringExtra("app_shortcut_custom_id");
          }
          if (!bi.oW(str1)) {
            break label732;
          }
          x.i("MicroMsg.ShortcutManager", "alvinluo shortcutId is null, then use short name as shortcutId");
          str1 = paramIntent.getStringExtra("android.intent.extra.shortcut.NAME");
        }
      }
    }
    label496:
    label505:
    label664:
    label732:
    for (int i = 1;; i = 0)
    {
      x.i("MicroMsg.ShortcutManager", "alvinluo shortcutId: %s", new Object[] { str1 });
      String str2 = paramIntent.getStringExtra("android.intent.extra.shortcut.NAME");
      paramString = (Intent.ShortcutIconResource)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
      if (paramString != null) {
        x.i("MicroMsg.ShortcutManager", "alvinluo icon resource name: %s, %s", new Object[] { paramString.resourceName, paramString.packageName });
      }
      Object localObject = (Bitmap)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON");
      paramString = (String)localObject;
      if (localObject == null)
      {
        x.i("MicroMsg.ShortcutManager", "extra_shortcut_icon is null, use icon resource id");
        j = paramIntent.getIntExtra("shortcut_icon_resource_id", -1);
        if (j == -1)
        {
          x.e("MicroMsg.ShortcutManager", "icon resource id is null");
          i = 0;
          break label46;
        }
        paramString = BitmapFactory.decodeResource(paramContext.getResources(), j);
      }
      if (paramString == null)
      {
        x.e("MicroMsg.ShortcutManager", "icon bitmap is null");
        i = 0;
        break label46;
        break;
      }
      boolean bool = paramIntent.getBooleanExtra("shortcut_is_adaptive_icon", false);
      localObject = new ShortcutInfo.Builder(paramContext, str1).setShortLabel(paramIntent.getStringExtra("android.intent.extra.shortcut.NAME")).setLongLabel(paramIntent.getStringExtra("android.intent.extra.shortcut.NAME")).setIntent(localIntent);
      if (bool) {
        ((ShortcutInfo.Builder)localObject).setIcon(Icon.createWithBitmap(paramString));
      }
      for (;;)
      {
        paramString = ((ShortcutInfo.Builder)localObject).build();
        bool = paramIntent.getBooleanExtra("duplicate", false);
        x.i("MicroMsg.ShortcutManager", "alvinluo add shortcut above android o, duplicate: %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          break label496;
        }
        localShortcutManager.requestPinShortcut(paramString, null);
        d(paramContext, true, true);
        break;
        ((ShortcutInfo.Builder)localObject).setIcon(Icon.createWithAdaptiveBitmap(paramString));
      }
      paramIntent = localShortcutManager.getPinnedShortcuts();
      int j = 0;
      if (j < paramIntent.size())
      {
        localObject = (ShortcutInfo)paramIntent.get(j);
        if (i != 0)
        {
          if ((localObject == null) || (((ShortcutInfo)localObject).getShortLabel() == null) || (!((ShortcutInfo)localObject).getShortLabel().equals(str2))) {
            break label664;
          }
          bool = true;
        }
      }
      for (;;)
      {
        x.i("MicroMsg.ShortcutManager", "alvinluo shortcut exist: %b, shortcutName: %s", new Object[] { Boolean.valueOf(bool), str2 });
        if (bool)
        {
          paramIntent = new ArrayList();
          paramIntent.add(paramString);
          x.i("MicroMsg.ShortcutManager", "alvinluo update shortcuts result: %b", new Object[] { Boolean.valueOf(localShortcutManager.updateShortcuts(paramIntent)) });
          d(paramContext, true, true);
          break;
          if ((localObject != null) && (((ShortcutInfo)localObject).getId().equals(str1)))
          {
            bool = true;
            continue;
          }
          j += 1;
          break label505;
        }
        if (paramBoolean)
        {
          paramIntent = localShortcutManager.createShortcutResultIntent(paramString);
          paramIntent.setClass(paramContext, ShortcutBroadCastReceiver.class);
          localShortcutManager.requestPinShortcut(paramString, PendingIntent.getBroadcast(paramContext, 0, paramIntent, 134217728).getIntentSender());
          break;
        }
        localShortcutManager.requestPinShortcut(paramString, null);
        break;
        bool = false;
      }
    }
  }
  
  public static String aa(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      localStringBuilder.append(hdv[((paramArrayOfByte[i] & 0xF0) >>> 4)]);
      localStringBuilder.append(hdv[(paramArrayOfByte[i] & 0xF)]);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static String bT(String paramString1, String paramString2)
  {
    int[] arrayOfInt;
    byte[] arrayOfByte;
    int i;
    for (;;)
    {
      try
      {
        arrayOfInt = new int['Ā'];
        arrayOfByte = new byte['Ā'];
        i = 0;
      }
      catch (Exception paramString1)
      {
        x.e("MicroMsg.ShortcutManager", "Exception in rc4, %s", new Object[] { paramString1.getMessage() });
        x.printErrStackTrace("MicroMsg.ShortcutManager", paramString1, "", new Object[0]);
        return null;
      }
      if (i >= 256) {
        break label231;
      }
      arrayOfByte[i] = ((byte)paramString2.charAt(i % paramString2.length()));
      i = (short)(i + 1);
    }
    for (;;)
    {
      paramString1 = paramString1.toCharArray();
      paramString2 = new char[paramString1.length];
      i = 0;
      int k = 0;
      int j = 0;
      while (i < paramString1.length)
      {
        k = (k + 1) % 256;
        j = (j + arrayOfInt[k]) % 256;
        int m = arrayOfInt[k];
        arrayOfInt[k] = arrayOfInt[j];
        arrayOfInt[j] = m;
        m = arrayOfInt[((arrayOfInt[k] + arrayOfInt[j] % 256) % 256)];
        int n = paramString1[i];
        paramString2[i] = ((char)((char)m ^ n));
        i = (short)(i + 1);
      }
      paramString1 = new String(paramString2);
      return paramString1;
      while (i < 256)
      {
        arrayOfInt[i] = i;
        i += 1;
      }
      i = 0;
      break;
      label231:
      i = 0;
      j = 0;
      while (i < 255)
      {
        j = (j + arrayOfInt[i] + arrayOfByte[i]) % 256;
        k = arrayOfInt[i];
        arrayOfInt[i] = arrayOfInt[j];
        arrayOfInt[j] = k;
        i += 1;
      }
    }
  }
  
  private static void d(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      if (!paramBoolean1) {
        break label23;
      }
    }
    label23:
    for (String str = paramContext.getString(a.h.app_added);; str = paramContext.getString(a.h.app_add_failed))
    {
      h.bA(paramContext, str);
      return;
    }
  }
  
  public static void n(Context paramContext, Intent paramIntent)
  {
    a(paramContext, paramIntent, null, true);
  }
  
  public static void o(Context paramContext, Intent paramIntent)
  {
    a(paramContext, paramIntent, null, false);
  }
  
  public static boolean p(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null)
    {
      x.e("MicroMsg.ShortcutManager", "context is null");
      return false;
    }
    if (paramIntent == null)
    {
      x.e("MicroMsg.ShortcutManager", "intent is null");
      return false;
    }
    if (Build.VERSION.SDK_INT < 26)
    {
      paramContext.sendBroadcast(paramIntent);
      return true;
    }
    return true;
  }
  
  public static String wL(String paramString)
  {
    String str1;
    if ((paramString == null) || (paramString.length() <= 0)) {
      str1 = null;
    }
    for (;;)
    {
      return str1;
      str1 = bi.an(ad.getContext(), Process.myPid());
      String str2 = ad.getPackageName();
      x.i("MicroMsg.ShortcutManager", "process name: %s", new Object[] { str1 });
      try
      {
        if (str2.equals(str1))
        {
          if (!g.Eg().Dx()) {
            return null;
          }
          g.Eg();
        }
        for (int i = com.tencent.mm.kernel.a.Df();; i = aa.UZ().esl.Df())
        {
          str1 = paramString;
          if (!paramString.startsWith("shortcut_")) {
            break;
          }
          return bT(new String(wN(paramString.substring(9))), String.valueOf(i));
        }
        return null;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.ShortcutManager", null, "exception: %s", new Object[] { paramString.getMessage() });
      }
    }
  }
  
  public static String wM(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    Object localObject = bi.an(ad.getContext(), Process.myPid());
    String str = ad.getPackageName();
    if ((str.equals(localObject)) && (!g.Eg().Dx())) {
      return null;
    }
    x.i("MicroMsg.ShortcutManager", "process name: %s", new Object[] { localObject });
    try
    {
      if (str.equals(localObject))
      {
        localObject = new StringBuilder();
        g.Eg();
      }
      for (paramString = bT(paramString, com.tencent.mm.kernel.a.Df()); bi.oW(paramString); paramString = bT(paramString, aa.UZ().esl.Df())) {
        return null;
      }
      return "shortcut_" + aa(paramString.getBytes());
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.ShortcutManager", null, "exception: %s", new Object[] { paramString.getMessage() });
      return null;
    }
  }
  
  public static final byte[] wN(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i = 0;
    while (i < arrayOfByte.length)
    {
      arrayOfByte[i] = ((byte)Integer.parseInt(paramString.substring(i * 2, i * 2 + 2), 16));
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static int z(ab paramab)
  {
    if (paramab.ckW()) {
      return 2;
    }
    if (!s.hP(paramab.field_username)) {
      return 1;
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/base/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
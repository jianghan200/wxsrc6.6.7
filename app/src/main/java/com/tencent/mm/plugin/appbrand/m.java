package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.bs;
import com.tencent.mm.g.a.bs.a;
import com.tencent.mm.g.a.bs.b;
import com.tencent.mm.plugin.base.model.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class m
{
  public static Intent a(Context paramContext, bs parambs, int paramInt, Bitmap paramBitmap, boolean paramBoolean)
  {
    if ((paramContext == null) || (parambs.bJc.username == null))
    {
      x.e("MicroMsg.AppBrandShortcutManager", "buildIntent, wrong parameters");
      return null;
    }
    if ((paramBitmap == null) && (paramBoolean))
    {
      x.e("MicroMsg.AppBrandShortcutManager", "no bmp");
      return null;
    }
    Object localObject2 = parambs.bJc.username;
    if (TextUtils.isEmpty(parambs.bJd.nickname)) {}
    String str;
    for (Object localObject1 = localObject2;; localObject1 = parambs.bJd.nickname)
    {
      str = parambs.bJd.appId;
      localObject3 = c.wP((String)localObject2);
      if (!bi.oW((String)localObject3)) {
        break;
      }
      return null;
    }
    if (paramBoolean) {}
    StringBuilder localStringBuilder;
    for (localObject2 = "com.android.launcher.action.INSTALL_SHORTCUT";; localObject2 = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      localStringBuilder = new StringBuilder();
      parambs = parambs.bJd.bJe;
      int j = parambs.length;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(parambs[i]);
        i += 1;
      }
    }
    parambs = com.tencent.mm.a.g.u(((String)localObject1 + localStringBuilder.toString()).getBytes());
    localObject2 = new Intent((String)localObject2);
    ((Intent)localObject2).putExtra("android.intent.extra.shortcut.NAME", (String)localObject1);
    ((Intent)localObject2).putExtra("duplicate", false);
    localObject1 = new Intent("com.tencent.mm.action.WX_SHORTCUT");
    ((Intent)localObject1).putExtra("type", 1);
    ((Intent)localObject1).putExtra("id", (String)localObject3);
    ((Intent)localObject1).putExtra("ext_info", c.wP(str));
    Object localObject3 = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    ((Intent)localObject1).putExtra("token", c.bU(str, com.tencent.mm.kernel.a.Df()));
    ((Intent)localObject1).putExtra("digest", parambs);
    ((Intent)localObject1).putExtra("ext_info_1", paramInt);
    ((Intent)localObject1).setPackage(paramContext.getPackageName());
    ((Intent)localObject1).addFlags(67108864);
    ((Intent)localObject2).putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)localObject1);
    ((Intent)localObject2).putExtra("android.intent.extra.shortcut.ICON", paramBitmap);
    ((Intent)localObject2).putExtra("shortcut_is_adaptive_icon", true);
    return (Intent)localObject2;
  }
  
  public static Bitmap a(Context paramContext, Bitmap paramBitmap, int paramInt)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject1 = localObject3;
    if (paramContext != null)
    {
      localObject1 = localObject3;
      if (paramBitmap != null)
      {
        if (!paramBitmap.isRecycled()) {
          break label36;
        }
        localObject1 = localObject3;
      }
    }
    label36:
    do
    {
      return (Bitmap)localObject1;
      int i = (int)(com.tencent.mm.bp.a.getDensity(paramContext) * 48.0F);
      localObject1 = Bitmap.createScaledBitmap(paramBitmap, i, i, false);
      paramBitmap = (Bitmap)localObject2;
      if (localObject1 != null)
      {
        paramBitmap = ((Bitmap)localObject1).copy(Bitmap.Config.ARGB_8888, true);
        ((Bitmap)localObject1).recycle();
      }
      if (paramInt == 2)
      {
        a(paramContext, paramBitmap, com.tencent.mm.bp.a.af(paramContext, s.j.app_brand_shortcut_tag_beta));
        return paramBitmap;
      }
      localObject1 = paramBitmap;
    } while (paramInt != 1);
    a(paramContext, paramBitmap, com.tencent.mm.bp.a.af(paramContext, s.j.app_brand_shortcut_tag_dev));
    return paramBitmap;
  }
  
  public static Bitmap a(bs parambs)
  {
    String[] arrayOfString = parambs.bJd.bJe;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      parambs = arrayOfString[i];
      if (!bi.oW(parambs))
      {
        Bitmap localBitmap = com.tencent.mm.modelappbrand.b.b.Ka().a(parambs, null);
        if (localBitmap != null)
        {
          parambs = localBitmap;
          if (!localBitmap.isRecycled()) {
            return parambs;
          }
        }
      }
      i += 1;
    }
    parambs = null;
    return parambs;
  }
  
  private static void a(Context paramContext, Bitmap paramBitmap, String paramString)
  {
    if ((paramContext == null) || (paramBitmap == null) || (paramBitmap.isRecycled())) {}
    while (bi.oW(paramString)) {
      return;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f3 = com.tencent.mm.bp.a.getDensity(paramContext);
    float f1 = f3 * 4.0F;
    float f2 = f3 * 2.0F;
    Paint localPaint = new Paint();
    localPaint.setTextSize(f3 * 6.0F);
    localPaint.setFakeBoldText(true);
    localPaint.setAntiAlias(true);
    f3 = localPaint.measureText(paramString);
    Paint.FontMetrics localFontMetrics = localPaint.getFontMetrics();
    float f4 = localFontMetrics.bottom - localFontMetrics.top;
    localPaint.setColor(Color.parseColor("#459AE9"));
    paramBitmap = new Canvas(paramBitmap);
    if (Build.VERSION.SDK_INT < 26) {}
    for (paramContext = new RectF(i - f3 - f1 * 2.0F, j - f4 - f2 * 2.0F, i, j);; paramContext = new RectF(0.0F, j - f4 - f2 * 2.0F, f3 + f1 * 2.0F, j))
    {
      paramBitmap.drawRoundRect(paramContext, 4.0F, 4.0F, localPaint);
      localPaint.setColor(-1);
      paramBitmap.drawText(paramString, paramContext.left + f1, paramContext.top + f2 - localFontMetrics.ascent, localPaint);
      return;
    }
  }
  
  public static boolean f(Context paramContext, String paramString, int paramInt)
  {
    if ((paramContext == null) || (paramString == null))
    {
      x.e("MicroMsg.AppBrandShortcutManager", "add fail, invalid argument");
      return false;
    }
    Object localObject1 = new bs();
    ((bs)localObject1).bJc.username = paramString;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    if (((bs)localObject1).bJd.bJe == null)
    {
      x.e("MicroMsg.AppBrandShortcutManager", "no such user");
      return false;
    }
    Object localObject2 = a((bs)localObject1);
    if (localObject2 == null)
    {
      x.i("MicroMsg.AppBrandShortcutManager", "bitmap do not exist, delay get.");
      return true;
    }
    localObject2 = a(paramContext, (bs)localObject1, paramInt, a(paramContext, (Bitmap)localObject2, paramInt), true);
    if (localObject2 == null)
    {
      x.e("MicroMsg.AppBrandShortcutManager", "add fail, intent is null");
      return false;
    }
    if ((Intent)((Intent)localObject2).getParcelableExtra("android.intent.extra.shortcut.INTENT") != null)
    {
      String str = ((bs)localObject1).bJd.appId;
      localObject1 = com.tencent.mm.plugin.base.model.b.bT(str + String.valueOf(paramInt), q.zy());
      if (localObject1 != null)
      {
        localObject1 = com.tencent.mm.plugin.base.model.b.aa(((String)localObject1).getBytes());
        x.i("MicroMsg.AppBrandShortcutManager", "alvinluo appId: %s, shortcutId: %s", new Object[] { str, localObject1 });
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.base.model.b.a(paramContext, (Intent)localObject2, (String)localObject1, true);
      x.i("MicroMsg.AppBrandShortcutManager", "add shortcut %s", new Object[] { paramString });
      return true;
      localObject1 = null;
      break;
      localObject1 = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
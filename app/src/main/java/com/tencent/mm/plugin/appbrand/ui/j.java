package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.s;
import java.lang.reflect.Method;

public enum j
{
  private static Boolean dgC;
  private static final Method gwQ;
  
  static
  {
    Method localMethod;
    if (Build.VERSION.SDK_INT < 24) {
      localMethod = null;
    }
    for (;;)
    {
      gwQ = localMethod;
      dgC = null;
      return;
      try
      {
        localMethod = Activity.class.getMethod("isInMultiWindowMode", new Class[0]);
      }
      catch (Exception localException)
      {
        Object localObject = null;
      }
    }
  }
  
  public static boolean Ae()
  {
    return h.Ae();
  }
  
  /* Error */
  private static boolean Af()
  {
    // Byte code:
    //   0: getstatic 29	com/tencent/mm/plugin/appbrand/ui/j:dgC	Ljava/lang/Boolean;
    //   3: ifnonnull +65 -> 68
    //   6: new 49	java/io/FileInputStream
    //   9: dup
    //   10: new 51	java/io/File
    //   13: dup
    //   14: invokestatic 57	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   17: ldc 59
    //   19: invokespecial 63	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: invokespecial 66	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   25: astore_1
    //   26: aload_1
    //   27: astore_0
    //   28: new 68	java/util/Properties
    //   31: dup
    //   32: invokespecial 70	java/util/Properties:<init>	()V
    //   35: astore_2
    //   36: aload_1
    //   37: astore_0
    //   38: aload_2
    //   39: aload_1
    //   40: invokevirtual 74	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   43: aload_1
    //   44: astore_0
    //   45: aload_2
    //   46: ldc 76
    //   48: ldc 78
    //   50: invokevirtual 82	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: ldc 84
    //   55: invokevirtual 90	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   58: invokestatic 96	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   61: putstatic 29	com/tencent/mm/plugin/appbrand/ui/j:dgC	Ljava/lang/Boolean;
    //   64: aload_1
    //   65: invokevirtual 99	java/io/FileInputStream:close	()V
    //   68: getstatic 29	com/tencent/mm/plugin/appbrand/ui/j:dgC	Ljava/lang/Boolean;
    //   71: invokevirtual 102	java/lang/Boolean:booleanValue	()Z
    //   74: ireturn
    //   75: astore_2
    //   76: aconst_null
    //   77: astore_1
    //   78: aload_1
    //   79: astore_0
    //   80: ldc 104
    //   82: aload_2
    //   83: ldc 106
    //   85: iconst_0
    //   86: anewarray 108	java/lang/Object
    //   89: invokestatic 114	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_1
    //   93: astore_0
    //   94: iconst_0
    //   95: invokestatic 96	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   98: putstatic 29	com/tencent/mm/plugin/appbrand/ui/j:dgC	Ljava/lang/Boolean;
    //   101: aload_1
    //   102: ifnull -34 -> 68
    //   105: aload_1
    //   106: invokevirtual 99	java/io/FileInputStream:close	()V
    //   109: goto -41 -> 68
    //   112: astore_0
    //   113: goto -45 -> 68
    //   116: astore_1
    //   117: aconst_null
    //   118: astore_0
    //   119: aload_0
    //   120: ifnull +7 -> 127
    //   123: aload_0
    //   124: invokevirtual 99	java/io/FileInputStream:close	()V
    //   127: aload_1
    //   128: athrow
    //   129: astore_0
    //   130: goto -62 -> 68
    //   133: astore_0
    //   134: goto -7 -> 127
    //   137: astore_1
    //   138: goto -19 -> 119
    //   141: astore_2
    //   142: goto -64 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   27	67	0	localFileInputStream1	java.io.FileInputStream
    //   112	1	0	localException1	Exception
    //   118	6	0	localObject1	Object
    //   129	1	0	localException2	Exception
    //   133	1	0	localException3	Exception
    //   25	81	1	localFileInputStream2	java.io.FileInputStream
    //   116	12	1	localObject2	Object
    //   137	1	1	localObject3	Object
    //   35	11	2	localProperties	java.util.Properties
    //   75	8	2	localException4	Exception
    //   141	1	2	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   6	26	75	java/lang/Exception
    //   105	109	112	java/lang/Exception
    //   6	26	116	finally
    //   64	68	129	java/lang/Exception
    //   123	127	133	java/lang/Exception
    //   28	36	137	finally
    //   38	43	137	finally
    //   45	64	137	finally
    //   80	92	137	finally
    //   94	101	137	finally
    //   28	36	141	java/lang/Exception
    //   38	43	141	java/lang/Exception
    //   45	64	141	java/lang/Exception
  }
  
  public static void a(Window paramWindow)
  {
    if (paramWindow == null) {}
    while ((Build.VERSION.SDK_INT < 21) || (((paramWindow.getAttributes().flags & 0x80000000) != 0) && (paramWindow.getStatusBarColor() == 0))) {
      return;
    }
    paramWindow.addFlags(Integer.MIN_VALUE);
    paramWindow.setStatusBarColor(0);
  }
  
  public static boolean a(Window paramWindow, boolean paramBoolean)
  {
    if ((paramWindow == null) || (paramWindow.getDecorView() == null)) {}
    while ((Build.VERSION.SDK_INT < 23) || ((h.Ae()) && (Af()))) {
      return false;
    }
    paramWindow = paramWindow.getDecorView();
    int i = paramWindow.getSystemUiVisibility();
    if (paramBoolean) {
      i |= 0x2000;
    }
    for (;;)
    {
      paramWindow.setSystemUiVisibility(i);
      return true;
      i &= 0xDFFF;
    }
  }
  
  public static int aO(String paramString, int paramInt)
  {
    return (int)w(paramString, Long.valueOf(paramInt).longValue());
  }
  
  public static int[] anG()
  {
    Display localDisplay = ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay();
    return new int[] { localDisplay.getWidth(), localDisplay.getHeight() };
  }
  
  public static int any()
  {
    return s.ap(ad.getContext(), com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 25));
  }
  
  private static int b(Window paramWindow, boolean paramBoolean)
  {
    int i = paramWindow.getDecorView().getSystemUiVisibility();
    int j;
    if (paramBoolean)
    {
      j = i | 0x400 | 0x100;
      i = j;
      if (Build.VERSION.SDK_INT >= 20) {
        i = j | 0x200 | 0x2;
      }
      j = i | 0x4;
      i = j;
      if (Build.VERSION.SDK_INT >= 19) {
        i = j | 0x1000;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.AppBrandUIUtil", "hy: setting ui visibility: %d", new Object[] { Integer.valueOf(i) });
      return i;
      j = i & 0xFBFF & 0xFEFF;
      i = j;
      if (Build.VERSION.SDK_INT >= 20) {
        i = j & 0xFDFF & 0xFFFFFFFD;
      }
      j = i & 0xFFFFFFFB;
      i = j;
      if (Build.VERSION.SDK_INT >= 19) {
        i = j & 0xEFFF;
      }
    }
  }
  
  public static boolean b(Window paramWindow)
  {
    return a(paramWindow, true);
  }
  
  public static boolean bM(View paramView)
  {
    if (Build.VERSION.SDK_INT < 24) {
      return false;
    }
    if (paramView == null) {
      return false;
    }
    Context localContext = paramView.getContext();
    paramView = localContext;
    if ((localContext instanceof ContextWrapper))
    {
      paramView = localContext;
      if (!(localContext instanceof Activity)) {
        paramView = ((ContextWrapper)localContext).getBaseContext();
      }
    }
    return ((paramView instanceof Activity)) && (l((Activity)paramView));
  }
  
  public static void c(Window paramWindow, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      i = b(paramWindow, true);
      paramWindow.getDecorView().setSystemUiVisibility(i);
      paramWindow.getDecorView().setOnSystemUiVisibilityChangeListener(new j.2(paramWindow));
      paramWindow.addFlags(1024);
      return;
    }
    int i = b(paramWindow, false);
    paramWindow.getDecorView().setSystemUiVisibility(i);
    paramWindow.getDecorView().setOnSystemUiVisibilityChangeListener(null);
    paramWindow.clearFlags(1024);
  }
  
  public static boolean c(Window paramWindow)
  {
    if ((paramWindow == null) || (paramWindow.getDecorView() == null)) {}
    while ((Build.VERSION.SDK_INT < 23) || ((paramWindow.getDecorView().getSystemUiVisibility() & 0x2000) == 0)) {
      return false;
    }
    return true;
  }
  
  public static i cI(Context paramContext)
  {
    View localView = View.inflate(paramContext, s.h.appbrand_loading_dialog_layout, null);
    final i locali = new i(paramContext, s.k.AppBrandLoadingDialogStyle);
    locali.setContentView(localView);
    locali.setCancelable(true);
    locali.setCanceledOnTouchOutside(false);
    locali.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        if ((this.val$context instanceof MMActivity)) {
          ((MMActivity)this.val$context).finish();
        }
        locali.setOnCancelListener(null);
      }
    });
    return locali;
  }
  
  public static Activity cJ(Context paramContext)
  {
    if ((paramContext != null) && ((paramContext instanceof ContextWrapper)) && (!(paramContext instanceof Activity))) {
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    }
    for (;;)
    {
      if ((paramContext instanceof Activity)) {
        return (Activity)paramContext;
      }
      return null;
    }
  }
  
  public static Drawable d(Context paramContext, int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = com.tencent.mm.compatible.g.a.decodeResource(paramContext.getResources(), paramInt1);
    if (localBitmap != null)
    {
      paramContext = new BitmapDrawable(paramContext.getResources(), localBitmap);
      paramContext.setColorFilter(paramInt2, PorterDuff.Mode.SRC_ATOP);
      return paramContext;
    }
    return null;
  }
  
  public static boolean l(Activity paramActivity)
  {
    try
    {
      Method localMethod = gwQ;
      if (localMethod != null)
      {
        localMethod.setAccessible(true);
        return ((Boolean)localMethod.invoke(paramActivity, new Object[0])).booleanValue();
      }
      x.d("MicroMsg.AppBrandUIUtil", "isInMultiWindowMode method null");
    }
    catch (Exception paramActivity)
    {
      for (;;)
      {
        x.d("MicroMsg.AppBrandUIUtil", "isInMultiWindowMode, exp %s", new Object[] { paramActivity });
      }
    }
    return false;
  }
  
  public static void s(View paramView, int paramInt)
  {
    if ((paramView != null) && (paramView.getVisibility() != paramInt)) {
      paramView.setVisibility(paramInt);
    }
  }
  
  public static long vF(String paramString)
  {
    return w(paramString, -1L);
  }
  
  private static long w(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {
      return paramLong;
    }
    Object localObject = paramString;
    if (paramString.startsWith("#"))
    {
      localObject = paramString;
      if (paramString.length() == 4)
      {
        localObject = new StringBuilder(paramString);
        ((StringBuilder)localObject).insert(2, paramString.charAt(1));
        ((StringBuilder)localObject).insert(4, paramString.charAt(2));
        ((StringBuilder)localObject).insert(6, paramString.charAt(3));
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    try
    {
      int i = Color.parseColor((String)localObject);
      return 0xFFFFFFFF & i;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.AppBrandUIUtil", "Failed to parse color: %s", new Object[] { localObject });
    }
    return paramLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
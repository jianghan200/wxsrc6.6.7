package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class ak
{
  private static Rect tqL = new Rect(0, 0, 0, 0);
  
  public static int AD(int paramInt)
  {
    return ((int)((paramInt >> 24 & 0xFF) * 0.78F + 56.100006F) & 0xFF) << 24 | ((int)((paramInt >> 16 & 0xFF) * 0.78F + 0.0F) & 0xFF) << 16 | ((int)((paramInt >> 8 & 0xFF) * 0.78F + 0.0F) & 0xFF) << 8 | ((int)((paramInt & 0xFF) * 0.78F + 0.0F) & 0xFF) << 0;
  }
  
  @TargetApi(21)
  public static ViewGroup a(Window paramWindow, View paramView)
  {
    View localView = null;
    if (paramWindow == null) {
      return null;
    }
    Object localObject = f(paramWindow);
    if (localObject != null) {
      return (ViewGroup)localObject;
    }
    if (paramView != null) {
      for (paramView = paramView.getParent(); (paramView != paramWindow.getDecorView()) && (paramView != null); paramView = (View)localObject)
      {
        localObject = paramView.getParent();
        localView = paramView;
      }
    }
    for (paramView = localView;; paramView = null)
    {
      if (paramView == null)
      {
        localView = ((ViewGroup)paramWindow.getDecorView()).getChildAt(0);
        if ((localView instanceof ViewGroup)) {
          return (ViewGroup)localView;
        }
        if (Build.VERSION.SDK_INT >= 21) {
          paramWindow.clearFlags(Integer.MIN_VALUE);
        }
      }
      return (ViewGroup)paramView;
    }
  }
  
  public static void a(Window paramWindow)
  {
    if (paramWindow == null) {}
    while (Build.VERSION.SDK_INT < 21) {
      return;
    }
    paramWindow.addFlags(Integer.MIN_VALUE);
    paramWindow.setStatusBarColor(0);
  }
  
  public static Rect cqU()
  {
    return tqL;
  }
  
  @TargetApi(20)
  public static boolean d(View paramView1, final View paramView2)
  {
    if (!d.fR(21)) {
      return true;
    }
    if ((paramView1 != null) && ((paramView1 instanceof ViewGroup)) && (paramView2 != null) && ((paramView1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      paramView1.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        public final WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
        {
          paramAnonymousView = (ViewGroup.MarginLayoutParams)this.tqM.getLayoutParams();
          ak.z(paramAnonymousView.leftMargin, paramAnonymousView.topMargin, paramAnonymousView.rightMargin, paramAnonymousView.bottomMargin);
          paramView2.setPadding(paramView2.getPaddingLeft(), paramView2.getPaddingTop(), paramAnonymousView.rightMargin, paramAnonymousView.bottomMargin);
          return this.tqM.onApplyWindowInsets(paramAnonymousWindowInsets);
        }
      });
      return true;
    }
    return false;
  }
  
  public static int eL(Context paramContext)
  {
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int i = bi.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      i = paramContext.getResources().getDimensionPixelSize(i);
      return i;
    }
    catch (Exception paramContext) {}
    return 0;
  }
  
  private static ViewGroup f(Window paramWindow)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramWindow = new c(paramWindow, "mContentRoot", null);
      if (!paramWindow.zR()) {}
    }
    try
    {
      paramWindow = (ViewGroup)paramWindow.get();
      return paramWindow;
    }
    catch (NoSuchFieldException paramWindow)
    {
      x.printErrStackTrace("MicroMsg.UIUtils", paramWindow, "", new Object[0]);
      return null;
    }
    catch (IllegalAccessException paramWindow)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException paramWindow)
    {
      for (;;) {}
    }
  }
  
  public static void g(Window paramWindow)
  {
    if ((paramWindow == null) || (paramWindow.getDecorView() == null)) {}
    while (Build.VERSION.SDK_INT < 23) {
      return;
    }
    paramWindow = paramWindow.getDecorView();
    paramWindow.setSystemUiVisibility(paramWindow.getSystemUiVisibility() | 0x2000);
  }
  
  public static int gs(Context paramContext)
  {
    if (gt(paramContext))
    {
      int i = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
      if (i > 0) {
        return Resources.getSystem().getDimensionPixelSize(i);
      }
    }
    return 0;
  }
  
  @TargetApi(17)
  public static boolean gt(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    localDisplay.getSize(localPoint);
    paramContext = gu(paramContext);
    int i = Math.max(localPoint.y, localPoint.x);
    return Math.max(paramContext.y, paramContext.x) > i;
  }
  
  public static Point gu(Context paramContext)
  {
    Point localPoint = new Point();
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17)
    {
      paramContext.getRealSize(localPoint);
      return localPoint;
    }
    if (Build.VERSION.SDK_INT >= 14) {
      try
      {
        Method localMethod = Display.class.getMethod("getRawHeight", new Class[0]);
        localPoint.x = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(paramContext, new Object[0])).intValue();
        localPoint.y = ((Integer)localMethod.invoke(paramContext, new Object[0])).intValue();
        return localPoint;
      }
      catch (Exception localException) {}
    }
    paramContext.getSize(localPoint);
    return localPoint;
  }
  
  public static int gv(Context paramContext)
  {
    return eL(paramContext);
  }
  
  public static boolean gw(Context paramContext)
  {
    boolean bool2 = false;
    if (!gx(paramContext))
    {
      if (paramContext != null) {
        break label40;
      }
      bool1 = false;
      if ((!bool1) && (!gy(paramContext))) {
        if (paramContext != null) {
          break label54;
        }
      }
    }
    label40:
    label54:
    for (boolean bool1 = false;; bool1 = paramContext.getPackageManager().hasSystemFeature("android.hardware.notch_support"))
    {
      if (bool1) {
        bool2 = true;
      }
      return bool2;
      bool1 = paramContext.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
      break;
    }
  }
  
  /* Error */
  private static boolean gx(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_0
    //   7: invokevirtual 295	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   10: ldc_w 297
    //   13: invokevirtual 302	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   16: astore_0
    //   17: aload_0
    //   18: ldc_w 304
    //   21: iconst_1
    //   22: anewarray 104	java/lang/Class
    //   25: dup
    //   26: iconst_0
    //   27: getstatic 308	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   30: aastore
    //   31: invokevirtual 248	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   34: aload_0
    //   35: iconst_1
    //   36: anewarray 4	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: bipush 32
    //   43: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: invokevirtual 256	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   50: checkcast 314	java/lang/Boolean
    //   53: invokevirtual 317	java/lang/Boolean:booleanValue	()Z
    //   56: istore_1
    //   57: ldc -90
    //   59: ldc_w 319
    //   62: iconst_1
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: iload_1
    //   69: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   72: aastore
    //   73: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   76: iload_1
    //   77: ireturn
    //   78: astore_0
    //   79: ldc -90
    //   81: aload_0
    //   82: ldc_w 327
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: ldc -90
    //   94: ldc_w 319
    //   97: iconst_1
    //   98: anewarray 4	java/lang/Object
    //   101: dup
    //   102: iconst_0
    //   103: iconst_0
    //   104: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   107: aastore
    //   108: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: iconst_0
    //   112: ireturn
    //   113: astore_0
    //   114: ldc -90
    //   116: aload_0
    //   117: ldc_w 329
    //   120: iconst_0
    //   121: anewarray 4	java/lang/Object
    //   124: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: ldc -90
    //   129: ldc_w 319
    //   132: iconst_1
    //   133: anewarray 4	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: iconst_0
    //   139: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   142: aastore
    //   143: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: iconst_0
    //   147: ireturn
    //   148: astore_0
    //   149: ldc -90
    //   151: aload_0
    //   152: ldc_w 331
    //   155: iconst_0
    //   156: anewarray 4	java/lang/Object
    //   159: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: ldc -90
    //   164: ldc_w 319
    //   167: iconst_1
    //   168: anewarray 4	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: iconst_0
    //   174: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   177: aastore
    //   178: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: iconst_0
    //   182: ireturn
    //   183: astore_0
    //   184: ldc -90
    //   186: aload_0
    //   187: ldc_w 333
    //   190: iconst_0
    //   191: anewarray 4	java/lang/Object
    //   194: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: ldc -90
    //   199: ldc_w 319
    //   202: iconst_1
    //   203: anewarray 4	java/lang/Object
    //   206: dup
    //   207: iconst_0
    //   208: iconst_0
    //   209: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   212: aastore
    //   213: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: iconst_0
    //   217: ireturn
    //   218: astore_0
    //   219: ldc -90
    //   221: ldc_w 319
    //   224: iconst_1
    //   225: anewarray 4	java/lang/Object
    //   228: dup
    //   229: iconst_0
    //   230: iconst_0
    //   231: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   234: aastore
    //   235: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: iconst_0
    //   239: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	paramContext	Context
    //   56	21	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	57	78	java/lang/ClassNotFoundException
    //   6	57	113	java/lang/NoSuchMethodException
    //   6	57	148	java/lang/IllegalAccessException
    //   6	57	183	java/lang/reflect/InvocationTargetException
    //   6	57	218	finally
    //   79	92	218	finally
    //   114	127	218	finally
    //   149	162	218	finally
    //   184	197	218	finally
  }
  
  /* Error */
  private static boolean gy(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_0
    //   7: invokevirtual 295	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   10: ldc_w 335
    //   13: invokevirtual 302	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   16: astore_0
    //   17: aload_0
    //   18: ldc_w 337
    //   21: iconst_0
    //   22: anewarray 104	java/lang/Class
    //   25: invokevirtual 248	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   28: aload_0
    //   29: iconst_0
    //   30: anewarray 4	java/lang/Object
    //   33: invokevirtual 256	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast 314	java/lang/Boolean
    //   39: invokevirtual 317	java/lang/Boolean:booleanValue	()Z
    //   42: istore_1
    //   43: ldc -90
    //   45: ldc_w 339
    //   48: iconst_1
    //   49: anewarray 4	java/lang/Object
    //   52: dup
    //   53: iconst_0
    //   54: iload_1
    //   55: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   58: aastore
    //   59: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: iload_1
    //   63: ireturn
    //   64: astore_0
    //   65: ldc -90
    //   67: aload_0
    //   68: ldc_w 327
    //   71: iconst_0
    //   72: anewarray 4	java/lang/Object
    //   75: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: ldc -90
    //   80: ldc_w 339
    //   83: iconst_1
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: iconst_0
    //   90: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   93: aastore
    //   94: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: iconst_0
    //   98: ireturn
    //   99: astore_0
    //   100: ldc -90
    //   102: aload_0
    //   103: ldc_w 329
    //   106: iconst_0
    //   107: anewarray 4	java/lang/Object
    //   110: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: ldc -90
    //   115: ldc_w 339
    //   118: iconst_1
    //   119: anewarray 4	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: iconst_0
    //   125: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   128: aastore
    //   129: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: iconst_0
    //   133: ireturn
    //   134: astore_0
    //   135: ldc -90
    //   137: aload_0
    //   138: ldc_w 331
    //   141: iconst_0
    //   142: anewarray 4	java/lang/Object
    //   145: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: ldc -90
    //   150: ldc_w 339
    //   153: iconst_1
    //   154: anewarray 4	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: iconst_0
    //   160: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   163: aastore
    //   164: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: iconst_0
    //   168: ireturn
    //   169: astore_0
    //   170: ldc -90
    //   172: aload_0
    //   173: ldc_w 333
    //   176: iconst_0
    //   177: anewarray 4	java/lang/Object
    //   180: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: ldc -90
    //   185: ldc_w 339
    //   188: iconst_1
    //   189: anewarray 4	java/lang/Object
    //   192: dup
    //   193: iconst_0
    //   194: iconst_0
    //   195: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   198: aastore
    //   199: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: iconst_0
    //   203: ireturn
    //   204: astore_0
    //   205: ldc -90
    //   207: ldc_w 339
    //   210: iconst_1
    //   211: anewarray 4	java/lang/Object
    //   214: dup
    //   215: iconst_0
    //   216: iconst_0
    //   217: invokestatic 322	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   220: aastore
    //   221: invokestatic 325	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: iconst_0
    //   225: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	paramContext	Context
    //   42	21	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	43	64	java/lang/ClassNotFoundException
    //   6	43	99	java/lang/NoSuchMethodException
    //   6	43	134	java/lang/IllegalAccessException
    //   6	43	169	java/lang/reflect/InvocationTargetException
    //   6	43	204	finally
    //   65	78	204	finally
    //   100	113	204	finally
    //   135	148	204	finally
    //   170	183	204	finally
  }
  
  public static void z(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    tqL.set(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
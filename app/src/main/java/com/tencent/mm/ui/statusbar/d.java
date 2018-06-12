package com.tencent.mm.ui.statusbar;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.ui.ak;
import java.lang.reflect.Method;

public final class d
{
  private static Boolean dgC = null;
  
  public static int AD(int paramInt)
  {
    return ak.AD(paramInt);
  }
  
  /* Error */
  public static boolean Af()
  {
    // Byte code:
    //   0: getstatic 10	com/tencent/mm/ui/statusbar/d:dgC	Ljava/lang/Boolean;
    //   3: ifnonnull +72 -> 75
    //   6: new 23	java/io/FileInputStream
    //   9: dup
    //   10: new 25	java/io/File
    //   13: dup
    //   14: invokestatic 31	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   17: ldc 33
    //   19: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: invokespecial 40	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   25: astore_1
    //   26: aload_1
    //   27: astore_0
    //   28: new 42	java/util/Properties
    //   31: dup
    //   32: invokespecial 44	java/util/Properties:<init>	()V
    //   35: astore_2
    //   36: aload_1
    //   37: astore_0
    //   38: aload_2
    //   39: aload_1
    //   40: invokevirtual 48	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   43: aload_1
    //   44: astore_0
    //   45: aload_2
    //   46: ldc 50
    //   48: ldc 52
    //   50: invokevirtual 56	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: ldc 58
    //   55: invokevirtual 64	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   58: invokestatic 70	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   61: putstatic 10	com/tencent/mm/ui/statusbar/d:dgC	Ljava/lang/Boolean;
    //   64: aload_1
    //   65: astore_0
    //   66: aload_2
    //   67: aload_1
    //   68: invokevirtual 48	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   71: aload_1
    //   72: invokevirtual 73	java/io/FileInputStream:close	()V
    //   75: getstatic 10	com/tencent/mm/ui/statusbar/d:dgC	Ljava/lang/Boolean;
    //   78: invokevirtual 76	java/lang/Boolean:booleanValue	()Z
    //   81: ireturn
    //   82: astore_2
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: astore_0
    //   87: ldc 78
    //   89: aload_2
    //   90: ldc 80
    //   92: iconst_0
    //   93: anewarray 4	java/lang/Object
    //   96: invokestatic 86	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: aload_1
    //   100: astore_0
    //   101: iconst_0
    //   102: invokestatic 70	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   105: putstatic 10	com/tencent/mm/ui/statusbar/d:dgC	Ljava/lang/Boolean;
    //   108: aload_1
    //   109: ifnull -34 -> 75
    //   112: aload_1
    //   113: invokevirtual 73	java/io/FileInputStream:close	()V
    //   116: goto -41 -> 75
    //   119: astore_0
    //   120: goto -45 -> 75
    //   123: astore_1
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_0
    //   127: ifnull +7 -> 134
    //   130: aload_0
    //   131: invokevirtual 73	java/io/FileInputStream:close	()V
    //   134: aload_1
    //   135: athrow
    //   136: astore_0
    //   137: goto -62 -> 75
    //   140: astore_0
    //   141: goto -7 -> 134
    //   144: astore_1
    //   145: goto -19 -> 126
    //   148: astore_2
    //   149: goto -64 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   27	74	0	localFileInputStream1	java.io.FileInputStream
    //   119	1	0	localException1	Exception
    //   125	6	0	localObject1	Object
    //   136	1	0	localException2	Exception
    //   140	1	0	localException3	Exception
    //   25	88	1	localFileInputStream2	java.io.FileInputStream
    //   123	12	1	localObject2	Object
    //   144	1	1	localObject3	Object
    //   35	32	2	localProperties	java.util.Properties
    //   82	8	2	localException4	Exception
    //   148	1	2	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   6	26	82	java/lang/Exception
    //   112	116	119	java/lang/Exception
    //   6	26	123	finally
    //   71	75	136	java/lang/Exception
    //   130	134	140	java/lang/Exception
    //   28	36	144	finally
    //   38	43	144	finally
    //   45	64	144	finally
    //   66	71	144	finally
    //   87	99	144	finally
    //   101	108	144	finally
    //   28	36	148	java/lang/Exception
    //   38	43	148	java/lang/Exception
    //   45	64	148	java/lang/Exception
    //   66	71	148	java/lang/Exception
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
    while ((Build.VERSION.SDK_INT < 23) || (Af())) {
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
  
  public static boolean apT()
  {
    try
    {
      boolean bool = ((Boolean)Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke(null, new Object[0])).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      if (Build.DEVICE.equals("mx2")) {
        return true;
      }
      if ((Build.DEVICE.equals("mx")) || (Build.DEVICE.equals("m9"))) {
        return false;
      }
    }
    return false;
  }
  
  public static boolean c(Window paramWindow)
  {
    if ((paramWindow == null) || (paramWindow.getDecorView() == null)) {}
    while ((Build.VERSION.SDK_INT < 23) || ((paramWindow.getDecorView().getSystemUiVisibility() & 0x2000) == 0)) {
      return false;
    }
    return true;
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
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/statusbar/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
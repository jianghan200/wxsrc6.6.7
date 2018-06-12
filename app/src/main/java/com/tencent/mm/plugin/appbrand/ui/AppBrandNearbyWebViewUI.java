package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.appbrand.p;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.ui.ak;

public final class AppBrandNearbyWebViewUI
  extends WebViewUI
{
  private static Boolean dgC = null;
  
  /* Error */
  public static boolean Af()
  {
    // Byte code:
    //   0: getstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:dgC	Ljava/lang/Boolean;
    //   3: ifnonnull +65 -> 68
    //   6: new 20	java/io/FileInputStream
    //   9: dup
    //   10: new 22	java/io/File
    //   13: dup
    //   14: invokestatic 28	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   17: ldc 30
    //   19: invokespecial 33	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: invokespecial 36	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   25: astore_1
    //   26: aload_1
    //   27: astore_0
    //   28: new 38	java/util/Properties
    //   31: dup
    //   32: invokespecial 39	java/util/Properties:<init>	()V
    //   35: astore_2
    //   36: aload_1
    //   37: astore_0
    //   38: aload_2
    //   39: aload_1
    //   40: invokevirtual 43	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   43: aload_1
    //   44: astore_0
    //   45: aload_2
    //   46: ldc 45
    //   48: ldc 47
    //   50: invokevirtual 51	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: ldc 53
    //   55: invokevirtual 59	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   58: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   61: putstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:dgC	Ljava/lang/Boolean;
    //   64: aload_1
    //   65: invokevirtual 68	java/io/FileInputStream:close	()V
    //   68: getstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:dgC	Ljava/lang/Boolean;
    //   71: invokevirtual 71	java/lang/Boolean:booleanValue	()Z
    //   74: ireturn
    //   75: astore_0
    //   76: aconst_null
    //   77: astore_1
    //   78: aload_1
    //   79: astore_0
    //   80: iconst_0
    //   81: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   84: putstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:dgC	Ljava/lang/Boolean;
    //   87: aload_1
    //   88: ifnull -20 -> 68
    //   91: aload_1
    //   92: invokevirtual 68	java/io/FileInputStream:close	()V
    //   95: goto -27 -> 68
    //   98: astore_0
    //   99: goto -31 -> 68
    //   102: astore_0
    //   103: aconst_null
    //   104: astore_1
    //   105: aload_1
    //   106: ifnull +7 -> 113
    //   109: aload_1
    //   110: invokevirtual 68	java/io/FileInputStream:close	()V
    //   113: aload_0
    //   114: athrow
    //   115: astore_0
    //   116: goto -48 -> 68
    //   119: astore_1
    //   120: goto -7 -> 113
    //   123: astore_1
    //   124: aload_0
    //   125: astore_2
    //   126: aload_1
    //   127: astore_0
    //   128: aload_2
    //   129: astore_1
    //   130: goto -25 -> 105
    //   133: astore_0
    //   134: goto -56 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   27	18	0	localFileInputStream1	java.io.FileInputStream
    //   75	1	0	localException1	Exception
    //   79	1	0	localFileInputStream2	java.io.FileInputStream
    //   98	1	0	localException2	Exception
    //   102	12	0	localObject1	Object
    //   115	10	0	localException3	Exception
    //   127	1	0	localObject2	Object
    //   133	1	0	localException4	Exception
    //   25	85	1	localFileInputStream3	java.io.FileInputStream
    //   119	1	1	localException5	Exception
    //   123	4	1	localObject3	Object
    //   129	1	1	localObject4	Object
    //   35	94	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	26	75	java/lang/Exception
    //   91	95	98	java/lang/Exception
    //   6	26	102	finally
    //   64	68	115	java/lang/Exception
    //   109	113	119	java/lang/Exception
    //   28	36	123	finally
    //   38	43	123	finally
    //   45	64	123	finally
    //   80	87	123	finally
    //   28	36	133	java/lang/Exception
    //   38	43	133	java/lang/Exception
    //   45	64	133	java/lang/Exception
  }
  
  protected final void ant()
  {
    super.ant();
    lF(-855310);
  }
  
  protected final int anu()
  {
    if ((Build.VERSION.SDK_INT >= 23) && ((!h.Ae()) || (!Af())))
    {
      ak.g(getWindow());
      return -855310;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      return p.feh;
    }
    return super.anu();
  }
  
  protected final boolean anv()
  {
    return true;
  }
  
  protected final void initView()
  {
    super.initView();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    if (getIntent() != null)
    {
      getIntent().putExtra("forceHideShare", true);
      getIntent().putExtra("disable_bounce_scroll", true);
      getIntent().putExtra("show_long_click_popup_menu", false);
      getIntent().putExtra("key_load_js_without_delay", true);
    }
    super.onCreate(paramBundle);
    setResult(-1);
  }
  
  public final void setMMTitle(String paramString)
  {
    super.setMMTitle(paramString);
    nS(-16777216);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
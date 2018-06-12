package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.base.h;
import java.lang.ref.WeakReference;

public final class m
  extends b
  implements View.OnClickListener
{
  private static int czf()
  {
    if (Build.VERSION.SDK_INT < 23) {
      return 1;
    }
    PowerManager localPowerManager = (PowerManager)ad.getContext().getSystemService("power");
    try
    {
      boolean bool = localPowerManager.isIgnoringBatteryOptimizations(ad.getContext().getPackageName());
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]app is ignore:" + bool);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]is device idle mode:" + localPowerManager.isDeviceIdleMode());
      if (!bool) {
        return 2;
      }
      return 3;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgDelayTipsBanner", "[oneliang]ignoring battery optimizations check failure.use another way.");
    }
    return 3;
  }
  
  public static void gW(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    switch (czf())
    {
    default: 
      return;
    case 1: 
    case 3: 
      localObject = Build.BRAND;
      int i;
      if (localObject != null) {
        if (((String)localObject).toLowerCase().startsWith("samsung")) {
          i = R.l.msg_delay_wording_samsung;
        }
      }
      while (i > 0)
      {
        h.a(paramContext, paramContext.getString(i), "", new m.1());
        return;
        if (((String)localObject).toLowerCase().equalsIgnoreCase("huawei"))
        {
          if ((Build.VERSION.SDK_INT == 21) || (Build.VERSION.SDK_INT == 22) || (Build.VERSION.SDK_INT == 23))
          {
            i = R.l.msg_delay_wording_huawei_lm;
            continue;
          }
          if (Build.VERSION.SDK_INT == 24) {
            i = R.l.msg_delay_wording_huawei_n;
          }
        }
        else
        {
          i = R.l.msg_delay_wording_other;
          continue;
        }
        i = R.l.msg_delay_wording_other;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgDelayTipsBanner", "[oneliang]impossible......");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to add ignore");
    Object localObject = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS").setData(Uri.parse("package:" + ad.getContext().getPackageName()));
    ((Intent)localObject).setFlags(268435456);
    paramContext.startActivity((Intent)localObject);
  }
  
  /* Error */
  public static void gX(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: getstatic 168	com/tencent/mm/R$l:app_tip	I
    //   4: invokevirtual 104	android/content/Context:getString	(I)Ljava/lang/String;
    //   7: pop
    //   8: aload_0
    //   9: aload_0
    //   10: getstatic 171	com/tencent/mm/R$l:app_waiting	I
    //   13: invokevirtual 104	android/content/Context:getString	(I)Ljava/lang/String;
    //   16: iconst_1
    //   17: new 173	com/tencent/mm/ui/conversation/a/m$2
    //   20: dup
    //   21: invokespecial 174	com/tencent/mm/ui/conversation/a/m$2:<init>	()V
    //   24: invokestatic 177	com/tencent/mm/ui/base/h:a	(Landroid/content/Context;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)Lcom/tencent/mm/ui/base/p;
    //   27: astore 4
    //   29: invokestatic 183	com/tencent/mm/af/a:Oa	()Ljava/util/List;
    //   32: astore 5
    //   34: new 44	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 184	java/lang/StringBuilder:<init>	()V
    //   41: astore_3
    //   42: aload 5
    //   44: ifnull +57 -> 101
    //   47: aload 5
    //   49: invokeinterface 190 1 0
    //   54: astore 5
    //   56: aload 5
    //   58: invokeinterface 195 1 0
    //   63: ifeq +38 -> 101
    //   66: aload 5
    //   68: invokeinterface 199 1 0
    //   73: checkcast 201	com/tencent/mm/af/a$a
    //   76: astore 6
    //   78: aload_3
    //   79: aload 6
    //   81: invokevirtual 202	com/tencent/mm/af/a$a:toString	()Ljava/lang/String;
    //   84: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: ldc 42
    //   90: aload 6
    //   92: invokevirtual 202	com/tencent/mm/af/a$a:toString	()Ljava/lang/String;
    //   95: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   98: goto -42 -> 56
    //   101: aload 4
    //   103: ifnull +8 -> 111
    //   106: aload 4
    //   108: invokevirtual 207	android/app/Dialog:dismiss	()V
    //   111: new 44	java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial 184	java/lang/StringBuilder:<init>	()V
    //   118: astore 4
    //   120: invokestatic 213	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   123: pop
    //   124: aload 4
    //   126: invokestatic 218	com/tencent/mm/model/c:FL	()Ljava/lang/String;
    //   129: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: ldc -36
    //   134: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: astore 4
    //   142: iconst_1
    //   143: anewarray 87	java/lang/String
    //   146: dup
    //   147: iconst_0
    //   148: aload 4
    //   150: aastore
    //   151: invokestatic 226	com/tencent/mm/a/e:d	([Ljava/lang/String;)V
    //   154: new 228	java/io/File
    //   157: dup
    //   158: aload 4
    //   160: ldc -26
    //   162: invokespecial 232	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   165: astore 6
    //   167: aload_3
    //   168: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: astore 5
    //   173: aload 6
    //   175: invokevirtual 235	java/io/File:exists	()Z
    //   178: ifne +9 -> 187
    //   181: aload 6
    //   183: invokevirtual 238	java/io/File:createNewFile	()Z
    //   186: pop
    //   187: new 240	java/io/FileOutputStream
    //   190: dup
    //   191: aload 6
    //   193: iconst_0
    //   194: invokespecial 243	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   197: astore 4
    //   199: aload 4
    //   201: astore_3
    //   202: aload 4
    //   204: new 44	java/lang/StringBuilder
    //   207: dup
    //   208: invokespecial 184	java/lang/StringBuilder:<init>	()V
    //   211: aload 5
    //   213: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: ldc -11
    //   218: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: ldc -9
    //   226: invokevirtual 251	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   229: invokevirtual 257	java/io/OutputStream:write	([B)V
    //   232: aload 4
    //   234: astore_3
    //   235: aload 4
    //   237: invokevirtual 260	java/io/OutputStream:flush	()V
    //   240: aload 4
    //   242: invokevirtual 263	java/io/OutputStream:close	()V
    //   245: aload_0
    //   246: aload 6
    //   248: invokevirtual 266	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   251: iconst_1
    //   252: invokestatic 272	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   255: invokevirtual 275	android/widget/Toast:show	()V
    //   258: aload 6
    //   260: invokevirtual 266	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   263: astore_0
    //   264: new 277	com/tencent/mm/storage/bd
    //   267: dup
    //   268: invokespecial 278	com/tencent/mm/storage/bd:<init>	()V
    //   271: astore_3
    //   272: aload_3
    //   273: ldc_w 280
    //   276: invokevirtual 283	com/tencent/mm/storage/bd:ep	(Ljava/lang/String;)V
    //   279: aload_3
    //   280: aload_0
    //   281: invokevirtual 286	com/tencent/mm/storage/bd:setContent	(Ljava/lang/String;)V
    //   284: aload_3
    //   285: iconst_1
    //   286: invokevirtual 290	com/tencent/mm/storage/bd:setType	(I)V
    //   289: aload_3
    //   290: iconst_0
    //   291: invokevirtual 293	com/tencent/mm/storage/bd:eX	(I)V
    //   294: aload_3
    //   295: getfield 298	com/tencent/mm/g/c/cm:field_isSend	I
    //   298: iconst_1
    //   299: if_icmpne +220 -> 519
    //   302: aload_3
    //   303: iconst_4
    //   304: invokevirtual 301	com/tencent/mm/storage/bd:setStatus	(I)V
    //   307: invokestatic 307	java/lang/System:currentTimeMillis	()J
    //   310: lstore_1
    //   311: aload_3
    //   312: lload_1
    //   313: invokevirtual 311	com/tencent/mm/storage/bd:ax	(J)V
    //   316: aload_3
    //   317: lload_1
    //   318: invokevirtual 314	com/tencent/mm/storage/bd:ay	(J)V
    //   321: ldc_w 316
    //   324: invokestatic 322	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   327: checkcast 316	com/tencent/mm/plugin/messenger/foundation/a/i
    //   330: invokeinterface 326 1 0
    //   335: aload_3
    //   336: invokeinterface 332 2 0
    //   341: pop2
    //   342: return
    //   343: astore_3
    //   344: ldc 42
    //   346: new 44	java/lang/StringBuilder
    //   349: dup
    //   350: ldc_w 334
    //   353: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   356: aload_3
    //   357: invokevirtual 337	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   360: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   369: goto -182 -> 187
    //   372: astore_3
    //   373: ldc 42
    //   375: new 44	java/lang/StringBuilder
    //   378: dup
    //   379: ldc_w 339
    //   382: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   385: aload_3
    //   386: invokevirtual 337	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   389: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: goto -153 -> 245
    //   401: astore 5
    //   403: aconst_null
    //   404: astore 4
    //   406: aload 4
    //   408: astore_3
    //   409: ldc 42
    //   411: new 44	java/lang/StringBuilder
    //   414: dup
    //   415: ldc_w 341
    //   418: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   421: aload 5
    //   423: invokevirtual 337	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   426: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   432: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   435: aload 4
    //   437: ifnull -192 -> 245
    //   440: aload 4
    //   442: invokevirtual 263	java/io/OutputStream:close	()V
    //   445: goto -200 -> 245
    //   448: astore_3
    //   449: ldc 42
    //   451: new 44	java/lang/StringBuilder
    //   454: dup
    //   455: ldc_w 339
    //   458: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   461: aload_3
    //   462: invokevirtual 337	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   465: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   471: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   474: goto -229 -> 245
    //   477: astore_0
    //   478: aconst_null
    //   479: astore_3
    //   480: aload_3
    //   481: ifnull +7 -> 488
    //   484: aload_3
    //   485: invokevirtual 263	java/io/OutputStream:close	()V
    //   488: aload_0
    //   489: athrow
    //   490: astore_3
    //   491: ldc 42
    //   493: new 44	java/lang/StringBuilder
    //   496: dup
    //   497: ldc_w 339
    //   500: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   503: aload_3
    //   504: invokevirtual 337	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   507: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   510: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   513: invokestatic 63	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   516: goto -28 -> 488
    //   519: aload_3
    //   520: iconst_3
    //   521: invokevirtual 301	com/tencent/mm/storage/bd:setStatus	(I)V
    //   524: goto -217 -> 307
    //   527: astore_0
    //   528: goto -48 -> 480
    //   531: astore 5
    //   533: goto -127 -> 406
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	536	0	paramContext	Context
    //   310	8	1	l	long
    //   41	295	3	localObject1	Object
    //   343	14	3	localException1	Exception
    //   372	14	3	localException2	Exception
    //   408	1	3	localObject2	Object
    //   448	14	3	localException3	Exception
    //   479	6	3	localObject3	Object
    //   490	30	3	localException4	Exception
    //   27	414	4	localObject4	Object
    //   32	180	5	localObject5	Object
    //   401	21	5	localException5	Exception
    //   531	1	5	localException6	Exception
    //   76	183	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   181	187	343	java/lang/Exception
    //   240	245	372	java/lang/Exception
    //   187	199	401	java/lang/Exception
    //   440	445	448	java/lang/Exception
    //   187	199	477	finally
    //   484	488	490	java/lang/Exception
    //   202	232	527	finally
    //   235	240	527	finally
    //   409	435	527	finally
    //   202	232	531	java/lang/Exception
    //   235	240	531	java/lang/Exception
  }
  
  public final boolean anR()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgDelayTipsBanner", "refresh banner.");
    g.Ek();
    boolean bool = g.Ei().DT().getBoolean(aa.a.sYX, false);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to show banner:%s", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      if (this.view != null) {
        this.view.setVisibility(0);
      }
    }
    for (;;)
    {
      return super.anR();
      if (this.view != null) {
        this.view.setVisibility(8);
      }
    }
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return R.i.mainframe_banner_header_view;
  }
  
  public final void onClick(View paramView)
  {
    gW((Context)this.qJS.get());
    g.Ek();
    g.Ei().DT().a(aa.a.sYX, Boolean.valueOf(false));
    if (this.view != null) {
      this.view.setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/conversation/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
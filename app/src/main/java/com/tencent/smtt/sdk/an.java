package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.j;
import com.tencent.smtt.utils.v;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class an
{
  public static ThreadLocal<Integer> a;
  static boolean b = false;
  static final FileFilter c = new ap();
  private static an d = null;
  private static final ReentrantLock i = new ReentrantLock();
  private static final Lock j = new ReentrantLock();
  private static FileLock l = null;
  private static Handler m;
  private static final Long[][] n;
  private static int o = 0;
  private static boolean p = false;
  private int e = 0;
  private FileLock f;
  private FileOutputStream g;
  private boolean h = false;
  private boolean k = false;
  
  static
  {
    a = new ao();
    m = null;
    n = new Long[][] { { Long.valueOf(44006L), Long.valueOf(39094008L) }, { Long.valueOf(44005L), Long.valueOf(39094008L) }, { Long.valueOf(43910L), Long.valueOf(38917816L) }, { Long.valueOf(44027L), Long.valueOf(39094008L) }, { Long.valueOf(44028L), Long.valueOf(39094008L) }, { Long.valueOf(44029L), Long.valueOf(39094008L) }, { Long.valueOf(44030L), Long.valueOf(39094008L) }, { Long.valueOf(44032L), Long.valueOf(39094008L) }, { Long.valueOf(43909L), Long.valueOf(38917816L) } };
  }
  
  private an()
  {
    if (m == null) {
      m = new aq(this, al.a().getLooper());
    }
  }
  
  private void A(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip");
    if (!z(paramContext))
    {
      TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
      return;
    }
    for (;;)
    {
      try
      {
        C(paramContext);
        D(paramContext);
        if (!TbsShareManager.isThirdPartyApp(paramContext)) {
          TbsShareManager.a(paramContext);
        }
        ai.a(paramContext).a(0);
        ai.a(paramContext).b(0);
        ai.a(paramContext).d(0);
        ai.a(paramContext).a("incrupdate_retry_num", 0);
        ai.a(paramContext).b(0, 3);
        ai.a(paramContext).a("");
        ai.a(paramContext).c(-1);
        if (!TbsShareManager.isThirdPartyApp(paramContext))
        {
          i1 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_decouplecoreversion", 0);
          if ((i1 <= 0) || (i1 == a().h(paramContext)) || (i1 != a().i(paramContext))) {
            continue;
          }
          n(paramContext);
        }
        if (TbsShareManager.isThirdPartyApp(paramContext)) {
          TbsShareManager.writeCoreInfoForThirdPartyApp(paramContext, m(paramContext), true);
        }
        a.set(Integer.valueOf(0));
        o = 0;
      }
      catch (Throwable localThrowable)
      {
        int i1;
        TbsLogReport.a(paramContext).a(219, "exception when renameing from unzip:" + localThrowable.toString());
        TbsLog.e("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip Exception", true);
        continue;
      }
      y(paramContext);
      return;
      TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip #1 deCoupleCoreVersion is " + i1 + " getTbsCoreShareDecoupleCoreVersion is " + a().h(paramContext) + " getTbsCoreInstalledVerInNolock is " + a().i(paramContext));
    }
  }
  
  private void B(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy");
    if (!z(paramContext))
    {
      TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
      return;
    }
    for (;;)
    {
      try
      {
        C(paramContext);
        E(paramContext);
        TbsShareManager.a(paramContext);
        ai.a(paramContext).a(0, 3);
        if (!TbsShareManager.isThirdPartyApp(paramContext))
        {
          i1 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_decouplecoreversion", 0);
          if ((i1 <= 0) || (i1 == a().h(paramContext)) || (i1 != a().i(paramContext))) {
            continue;
          }
          n(paramContext);
        }
        a.set(Integer.valueOf(0));
      }
      catch (Exception localException)
      {
        int i1;
        TbsLogReport.a(paramContext).a(219, "exception when renameing from copy:" + localException.toString());
        continue;
      }
      y(paramContext);
      return;
      TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy #1 deCoupleCoreVersion is " + i1 + " getTbsCoreShareDecoupleCoreVersion is " + a().h(paramContext) + " getTbsCoreInstalledVerInNolock is " + a().i(paramContext));
    }
  }
  
  private void C(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--deleteOldCore");
    j.a(q(paramContext), false);
  }
  
  private void D(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--renameShareDir");
    File localFile1 = t(paramContext);
    File localFile2 = q(paramContext);
    if ((localFile1 == null) || (localFile2 == null)) {
      return;
    }
    localFile1.renameTo(localFile2);
    f(paramContext, false);
  }
  
  private void E(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--renameTbsCoreCopyDir");
    File localFile1 = v(paramContext);
    File localFile2 = q(paramContext);
    if ((localFile1 == null) || (localFile2 == null)) {
      return;
    }
    localFile1.renameTo(localFile2);
    f(paramContext, false);
  }
  
  private void F(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--clearNewTbsCore");
    File localFile = t(paramContext);
    if (localFile != null) {
      j.a(localFile, false);
    }
    ai.a(paramContext).b(0, 5);
    ai.a(paramContext).c(-1);
    QbSdk.a(paramContext, "TbsInstaller::clearNewTbsCore forceSysWebViewInner!");
  }
  
  /* Error */
  static an a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 36	com/tencent/smtt/sdk/an:d	Lcom/tencent/smtt/sdk/an;
    //   6: ifnonnull +25 -> 31
    //   9: ldc 2
    //   11: monitorenter
    //   12: getstatic 36	com/tencent/smtt/sdk/an:d	Lcom/tencent/smtt/sdk/an;
    //   15: ifnonnull +13 -> 28
    //   18: new 2	com/tencent/smtt/sdk/an
    //   21: dup
    //   22: invokespecial 319	com/tencent/smtt/sdk/an:<init>	()V
    //   25: putstatic 36	com/tencent/smtt/sdk/an:d	Lcom/tencent/smtt/sdk/an;
    //   28: ldc 2
    //   30: monitorexit
    //   31: getstatic 36	com/tencent/smtt/sdk/an:d	Lcom/tencent/smtt/sdk/an;
    //   34: astore_0
    //   35: ldc 2
    //   37: monitorexit
    //   38: aload_0
    //   39: areturn
    //   40: astore_0
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: athrow
    //   46: astore_0
    //   47: ldc 2
    //   49: monitorexit
    //   50: aload_0
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   34	5	0	localan	an
    //   40	5	0	localObject1	Object
    //   46	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   12	28	40	finally
    //   28	31	40	finally
    //   41	44	40	finally
    //   3	12	46	finally
    //   31	35	46	finally
    //   44	46	46	finally
  }
  
  /* Error */
  private void a(int paramInt, String paramString, Context paramContext)
  {
    // Byte code:
    //   0: new 296	java/io/File
    //   3: dup
    //   4: aload_2
    //   5: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: invokevirtual 327	java/io/File:delete	()Z
    //   11: pop
    //   12: ldc 125
    //   14: new 228	java/lang/StringBuilder
    //   17: dup
    //   18: ldc_w 329
    //   21: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc_w 331
    //   31: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: iconst_1
    //   38: invokestatic 333	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   41: new 296	java/io/File
    //   44: dup
    //   45: aload_3
    //   46: ldc_w 335
    //   49: iconst_0
    //   50: invokevirtual 341	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   53: ldc_w 343
    //   56: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   59: astore_2
    //   60: aload_2
    //   61: invokevirtual 349	java/io/File:canRead	()Z
    //   64: ifeq +98 -> 162
    //   67: new 296	java/io/File
    //   70: dup
    //   71: aload_2
    //   72: ldc_w 351
    //   75: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   78: astore_2
    //   79: new 353	java/util/Properties
    //   82: dup
    //   83: invokespecial 354	java/util/Properties:<init>	()V
    //   86: astore 4
    //   88: new 356	java/io/BufferedInputStream
    //   91: dup
    //   92: new 358	java/io/FileInputStream
    //   95: dup
    //   96: aload_2
    //   97: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   100: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   103: astore_3
    //   104: aload 4
    //   106: aload_3
    //   107: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   110: new 369	java/io/BufferedOutputStream
    //   113: dup
    //   114: new 371	java/io/FileOutputStream
    //   117: dup
    //   118: aload_2
    //   119: invokespecial 372	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   122: invokespecial 375	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   125: astore_2
    //   126: aload 4
    //   128: ldc_w 377
    //   131: ldc_w 379
    //   134: invokevirtual 383	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   137: pop
    //   138: aload 4
    //   140: aload_2
    //   141: aconst_null
    //   142: invokevirtual 387	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   145: ldc 125
    //   147: ldc_w 389
    //   150: iconst_1
    //   151: invokestatic 333	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   154: aload_2
    //   155: invokevirtual 392	java/io/BufferedOutputStream:close	()V
    //   158: aload_3
    //   159: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   162: return
    //   163: astore_2
    //   164: aconst_null
    //   165: astore_2
    //   166: aconst_null
    //   167: astore_3
    //   168: aload_2
    //   169: ifnull +7 -> 176
    //   172: aload_2
    //   173: invokevirtual 392	java/io/BufferedOutputStream:close	()V
    //   176: aload_3
    //   177: ifnull -15 -> 162
    //   180: aload_3
    //   181: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   184: return
    //   185: astore_2
    //   186: return
    //   187: astore_2
    //   188: aconst_null
    //   189: astore_3
    //   190: aconst_null
    //   191: astore 4
    //   193: aload_3
    //   194: ifnull +7 -> 201
    //   197: aload_3
    //   198: invokevirtual 392	java/io/BufferedOutputStream:close	()V
    //   201: aload 4
    //   203: ifnull +8 -> 211
    //   206: aload 4
    //   208: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   211: aload_2
    //   212: athrow
    //   213: astore_2
    //   214: goto -56 -> 158
    //   217: astore_2
    //   218: return
    //   219: astore_2
    //   220: goto -44 -> 176
    //   223: astore_3
    //   224: goto -23 -> 201
    //   227: astore_3
    //   228: goto -17 -> 211
    //   231: astore_2
    //   232: aconst_null
    //   233: astore 5
    //   235: aload_3
    //   236: astore 4
    //   238: aload 5
    //   240: astore_3
    //   241: goto -48 -> 193
    //   244: astore 5
    //   246: aload_2
    //   247: astore 6
    //   249: aload_3
    //   250: astore 4
    //   252: aload 5
    //   254: astore_2
    //   255: aload 6
    //   257: astore_3
    //   258: goto -65 -> 193
    //   261: astore_2
    //   262: aconst_null
    //   263: astore_2
    //   264: goto -96 -> 168
    //   267: astore 4
    //   269: goto -101 -> 168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	an
    //   0	272	1	paramInt	int
    //   0	272	2	paramString	String
    //   0	272	3	paramContext	Context
    //   86	165	4	localObject1	Object
    //   267	1	4	localThrowable	Throwable
    //   233	6	5	localObject2	Object
    //   244	9	5	localObject3	Object
    //   247	9	6	str	String
    // Exception table:
    //   from	to	target	type
    //   88	104	163	java/lang/Throwable
    //   180	184	185	java/io/IOException
    //   88	104	187	finally
    //   154	158	213	java/io/IOException
    //   158	162	217	java/io/IOException
    //   172	176	219	java/io/IOException
    //   197	201	223	java/io/IOException
    //   206	211	227	java/io/IOException
    //   104	126	231	finally
    //   126	154	244	finally
    //   104	126	261	java/lang/Throwable
    //   126	154	267	java/lang/Throwable
  }
  
  public static void a(Context paramContext)
  {
    if (!x(paramContext))
    {
      if (!d(paramContext, "core_unzip_tmp")) {
        break label46;
      }
      TbsCoreLoadStat.getInstance().a(paramContext, 417, new Throwable("TMP_TBS_UNZIP_FOLDER_NAME"));
      TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_UNZIP_FOLDER_NAME");
    }
    label46:
    do
    {
      return;
      if (d(paramContext, "core_share_backup_tmp"))
      {
        TbsCoreLoadStat.getInstance().a(paramContext, 417, new Throwable("TMP_BACKUP_TBSCORE_FOLDER_NAME"));
        TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_BACKUP_TBSCORE_FOLDER_NAME");
        return;
      }
    } while (!d(paramContext, "core_copy_tmp"));
    TbsCoreLoadStat.getInstance().a(paramContext, 417, new Throwable("TMP_TBS_COPY_FOLDER_NAME"));
    TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_COPY_FOLDER_NAME");
  }
  
  /* Error */
  @TargetApi(11)
  private void a(Context paramContext1, Context paramContext2, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 9
    //   3: aload_1
    //   4: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   7: sipush 65012
    //   10: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual 435	com/tencent/smtt/sdk/an:c	(Landroid/content/Context;)Z
    //   18: ifeq +4 -> 22
    //   21: return
    //   22: ldc 125
    //   24: new 228	java/lang/StringBuilder
    //   27: dup
    //   28: ldc_w 437
    //   31: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: iload_3
    //   35: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   38: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: getstatic 442	android/os/Build$VERSION:SDK_INT	I
    //   47: bipush 11
    //   49: if_icmplt +67 -> 116
    //   52: aload_2
    //   53: ldc_w 444
    //   56: iconst_4
    //   57: invokevirtual 448	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   60: astore 14
    //   62: aload 14
    //   64: ldc_w 450
    //   67: iconst_m1
    //   68: invokeinterface 196 3 0
    //   73: iload_3
    //   74: if_icmpne +55 -> 129
    //   77: ldc 125
    //   79: new 228	java/lang/StringBuilder
    //   82: dup
    //   83: ldc_w 452
    //   86: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: iload_3
    //   90: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   93: ldc_w 454
    //   96: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: aload_1
    //   106: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   109: sipush 65011
    //   112: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   115: return
    //   116: aload_2
    //   117: ldc_w 444
    //   120: iconst_0
    //   121: invokevirtual 448	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   124: astore 14
    //   126: goto -64 -> 62
    //   129: aload_0
    //   130: aload_2
    //   131: invokevirtual 457	com/tencent/smtt/sdk/an:w	(Landroid/content/Context;)Z
    //   134: ifne +14 -> 148
    //   137: aload_1
    //   138: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   141: sipush 65010
    //   144: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   147: return
    //   148: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   151: invokeinterface 462 1 0
    //   156: istore 8
    //   158: ldc 125
    //   160: new 228	java/lang/StringBuilder
    //   163: dup
    //   164: ldc_w 464
    //   167: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   170: iload 8
    //   172: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   175: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: iload 8
    //   183: ifeq +1707 -> 1890
    //   186: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   189: invokevirtual 470	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   192: aconst_null
    //   193: astore 15
    //   195: aload_2
    //   196: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   199: ldc_w 472
    //   202: invokevirtual 475	com/tencent/smtt/sdk/ai:c	(Ljava/lang/String;)I
    //   205: istore 4
    //   207: aload_2
    //   208: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   211: ldc_w 477
    //   214: invokevirtual 479	com/tencent/smtt/sdk/ai:b	(Ljava/lang/String;)I
    //   217: istore 5
    //   219: iload 4
    //   221: iload_3
    //   222: if_icmpne +43 -> 265
    //   225: getstatic 482	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   228: sipush 220
    //   231: invokeinterface 487 2 0
    //   236: aload_1
    //   237: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   240: sipush 65008
    //   243: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   246: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   249: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   252: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   255: invokeinterface 491 1 0
    //   260: aload_0
    //   261: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   264: return
    //   265: aload_0
    //   266: aload_2
    //   267: invokevirtual 204	com/tencent/smtt/sdk/an:i	(Landroid/content/Context;)I
    //   270: istore 6
    //   272: ldc 125
    //   274: new 228	java/lang/StringBuilder
    //   277: dup
    //   278: ldc_w 495
    //   281: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   284: iload 6
    //   286: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   289: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   292: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   295: iload 6
    //   297: iload_3
    //   298: if_icmpne +64 -> 362
    //   301: getstatic 482	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   304: sipush 220
    //   307: invokeinterface 487 2 0
    //   312: aload_1
    //   313: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   316: sipush 65008
    //   319: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   322: ldc 125
    //   324: new 228	java/lang/StringBuilder
    //   327: dup
    //   328: ldc_w 497
    //   331: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: iload 6
    //   336: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   339: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   345: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   348: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   351: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   354: invokeinterface 491 1 0
    //   359: goto -99 -> 260
    //   362: aload_2
    //   363: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   366: invokevirtual 500	com/tencent/smtt/sdk/ai:b	()I
    //   369: istore 7
    //   371: iload 7
    //   373: ifle +1595 -> 1968
    //   376: iload_3
    //   377: iload 7
    //   379: if_icmpgt +6 -> 385
    //   382: goto +1586 -> 1968
    //   385: aload_0
    //   386: aload_2
    //   387: invokevirtual 502	com/tencent/smtt/sdk/an:o	(Landroid/content/Context;)V
    //   390: goto +1592 -> 1982
    //   393: aload_0
    //   394: aload_2
    //   395: invokevirtual 502	com/tencent/smtt/sdk/an:o	(Landroid/content/Context;)V
    //   398: ldc 125
    //   400: ldc_w 504
    //   403: iconst_1
    //   404: invokestatic 333	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   407: iconst_m1
    //   408: istore 4
    //   410: aload_2
    //   411: invokestatic 506	com/tencent/smtt/utils/j:b	(Landroid/content/Context;)Z
    //   414: ifne +83 -> 497
    //   417: invokestatic 511	com/tencent/smtt/utils/v:a	()J
    //   420: lstore 10
    //   422: aload_2
    //   423: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   426: invokevirtual 514	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadMinFreeSpace	()J
    //   429: lstore 12
    //   431: aload_1
    //   432: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   435: sipush 65007
    //   438: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   441: aload_2
    //   442: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   445: sipush 210
    //   448: new 228	java/lang/StringBuilder
    //   451: dup
    //   452: ldc_w 516
    //   455: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   458: lload 10
    //   460: invokevirtual 519	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   463: ldc_w 521
    //   466: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: lload 12
    //   471: invokevirtual 519	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   474: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   477: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   480: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   483: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   486: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   489: invokeinterface 491 1 0
    //   494: goto -234 -> 260
    //   497: iload 4
    //   499: ifle +82 -> 581
    //   502: aload_2
    //   503: invokestatic 149	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   506: ifne +32 -> 538
    //   509: aload_2
    //   510: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   513: getfield 188	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   516: ldc_w 523
    //   519: iconst_0
    //   520: invokeinterface 196 3 0
    //   525: iconst_1
    //   526: if_icmpne +12 -> 538
    //   529: iload_3
    //   530: aload_0
    //   531: aload_2
    //   532: invokevirtual 202	com/tencent/smtt/sdk/an:h	(Landroid/content/Context;)I
    //   535: if_icmpne +46 -> 581
    //   538: ldc 125
    //   540: new 228	java/lang/StringBuilder
    //   543: dup
    //   544: ldc_w 525
    //   547: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   550: aload_0
    //   551: aload_2
    //   552: invokevirtual 202	com/tencent/smtt/sdk/an:h	(Landroid/content/Context;)I
    //   555: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   558: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   561: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   564: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   567: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   570: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   573: invokeinterface 491 1 0
    //   578: goto -318 -> 260
    //   581: iload 4
    //   583: ifne +75 -> 658
    //   586: aload_2
    //   587: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   590: ldc_w 527
    //   593: invokevirtual 475	com/tencent/smtt/sdk/ai:c	(Ljava/lang/String;)I
    //   596: istore 4
    //   598: iload 4
    //   600: iconst_2
    //   601: if_icmple +43 -> 644
    //   604: aload_2
    //   605: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   608: sipush 211
    //   611: ldc_w 529
    //   614: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   617: aload_1
    //   618: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   621: sipush 65006
    //   624: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   627: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   630: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   633: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   636: invokeinterface 491 1 0
    //   641: goto -381 -> 260
    //   644: aload_2
    //   645: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   648: ldc_w 527
    //   651: iload 4
    //   653: iconst_1
    //   654: iadd
    //   655: invokevirtual 168	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   658: aload_0
    //   659: aload_1
    //   660: invokevirtual 284	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   663: astore 16
    //   665: aload_2
    //   666: invokestatic 149	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   669: ifne +227 -> 896
    //   672: aload_2
    //   673: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   676: getfield 188	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   679: ldc_w 523
    //   682: iconst_0
    //   683: invokeinterface 196 3 0
    //   688: iconst_1
    //   689: if_icmpne +197 -> 886
    //   692: aload_0
    //   693: aload_2
    //   694: invokevirtual 531	com/tencent/smtt/sdk/an:p	(Landroid/content/Context;)Ljava/io/File;
    //   697: astore 14
    //   699: aload 16
    //   701: ifnull +1088 -> 1789
    //   704: aload 14
    //   706: ifnull +1083 -> 1789
    //   709: aload_2
    //   710: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   713: iload_3
    //   714: iconst_0
    //   715: invokevirtual 273	com/tencent/smtt/sdk/ai:a	(II)V
    //   718: new 533	com/tencent/smtt/utils/u
    //   721: dup
    //   722: invokespecial 534	com/tencent/smtt/utils/u:<init>	()V
    //   725: astore 15
    //   727: aload 15
    //   729: aload 16
    //   731: invokevirtual 536	com/tencent/smtt/utils/u:a	(Ljava/io/File;)V
    //   734: invokestatic 541	java/lang/System:currentTimeMillis	()J
    //   737: lstore 10
    //   739: aload_1
    //   740: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   743: sipush 64985
    //   746: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   749: aload 16
    //   751: aload 14
    //   753: getstatic 93	com/tencent/smtt/sdk/an:c	Ljava/io/FileFilter;
    //   756: invokestatic 544	com/tencent/smtt/utils/j:a	(Ljava/io/File;Ljava/io/File;Ljava/io/FileFilter;)Z
    //   759: istore 8
    //   761: aload_2
    //   762: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   765: getfield 188	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   768: ldc_w 523
    //   771: iconst_0
    //   772: invokeinterface 196 3 0
    //   777: iconst_1
    //   778: if_icmpne +7 -> 785
    //   781: aload_2
    //   782: invokestatic 546	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;)V
    //   785: ldc 125
    //   787: new 228	java/lang/StringBuilder
    //   790: dup
    //   791: ldc_w 548
    //   794: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   797: invokestatic 541	java/lang/System:currentTimeMillis	()J
    //   800: lload 10
    //   802: lsub
    //   803: invokevirtual 519	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   806: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   809: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   812: iload 8
    //   814: ifeq +926 -> 1740
    //   817: aload 15
    //   819: aload 16
    //   821: invokevirtual 550	com/tencent/smtt/utils/u:b	(Ljava/io/File;)V
    //   824: aload 15
    //   826: invokevirtual 552	com/tencent/smtt/utils/u:a	()Z
    //   829: ifne +77 -> 906
    //   832: ldc 125
    //   834: ldc_w 554
    //   837: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   840: aload 14
    //   842: iconst_1
    //   843: invokestatic 289	com/tencent/smtt/utils/j:a	(Ljava/io/File;Z)V
    //   846: aload_2
    //   847: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   850: sipush 213
    //   853: ldc_w 556
    //   856: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   859: aload_1
    //   860: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   863: sipush 65005
    //   866: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   869: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   872: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   875: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   878: invokeinterface 491 1 0
    //   883: goto -623 -> 260
    //   886: aload_0
    //   887: aload_2
    //   888: invokevirtual 308	com/tencent/smtt/sdk/an:v	(Landroid/content/Context;)Ljava/io/File;
    //   891: astore 14
    //   893: goto -194 -> 699
    //   896: aload_0
    //   897: aload_2
    //   898: invokevirtual 308	com/tencent/smtt/sdk/an:v	(Landroid/content/Context;)Ljava/io/File;
    //   901: astore 14
    //   903: goto -204 -> 699
    //   906: aconst_null
    //   907: astore 18
    //   909: aconst_null
    //   910: astore 17
    //   912: new 296	java/io/File
    //   915: dup
    //   916: aload 14
    //   918: ldc_w 558
    //   921: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   924: astore 15
    //   926: new 353	java/util/Properties
    //   929: dup
    //   930: invokespecial 354	java/util/Properties:<init>	()V
    //   933: astore 16
    //   935: aload 15
    //   937: invokevirtual 561	java/io/File:exists	()Z
    //   940: ifeq +239 -> 1179
    //   943: new 356	java/io/BufferedInputStream
    //   946: dup
    //   947: new 358	java/io/FileInputStream
    //   950: dup
    //   951: aload 15
    //   953: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   956: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   959: astore 15
    //   961: aload 16
    //   963: aload 15
    //   965: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   968: iconst_1
    //   969: istore 4
    //   971: aload 15
    //   973: ifnull +8 -> 981
    //   976: aload 15
    //   978: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   981: aload 16
    //   983: astore 15
    //   985: iload 9
    //   987: istore 8
    //   989: iload 4
    //   991: ifeq +359 -> 1350
    //   994: aload 14
    //   996: invokevirtual 565	java/io/File:listFiles	()[Ljava/io/File;
    //   999: astore 16
    //   1001: aload_1
    //   1002: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1005: sipush 64984
    //   1008: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1011: iconst_0
    //   1012: istore 5
    //   1014: iload 9
    //   1016: istore 8
    //   1018: iload 5
    //   1020: aload 16
    //   1022: arraylength
    //   1023: if_icmpge +327 -> 1350
    //   1026: aload 16
    //   1028: iload 5
    //   1030: aaload
    //   1031: astore 17
    //   1033: ldc_w 558
    //   1036: aload 17
    //   1038: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   1041: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1044: ifne +126 -> 1170
    //   1047: aload 17
    //   1049: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   1052: ldc_w 576
    //   1055: invokevirtual 580	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1058: ifne +112 -> 1170
    //   1061: ldc_w 351
    //   1064: aload 17
    //   1066: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   1069: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1072: ifne +98 -> 1170
    //   1075: aload 17
    //   1077: invokevirtual 583	java/io/File:isDirectory	()Z
    //   1080: ifne +90 -> 1170
    //   1083: aload 17
    //   1085: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   1088: ldc_w 585
    //   1091: invokevirtual 580	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1094: ifne +76 -> 1170
    //   1097: aload 17
    //   1099: invokestatic 590	com/tencent/smtt/utils/a:a	(Ljava/io/File;)Ljava/lang/String;
    //   1102: astore 18
    //   1104: aload 15
    //   1106: aload 17
    //   1108: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   1111: ldc -83
    //   1113: invokevirtual 594	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1116: astore 19
    //   1118: aload 19
    //   1120: ldc -83
    //   1122: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1125: ifne +174 -> 1299
    //   1128: aload 18
    //   1130: aload 19
    //   1132: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1135: ifeq +164 -> 1299
    //   1138: ldc 125
    //   1140: new 228	java/lang/StringBuilder
    //   1143: dup
    //   1144: ldc_w 596
    //   1147: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1150: aload 17
    //   1152: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   1155: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1158: ldc_w 598
    //   1161: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1164: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1167: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1170: iload 5
    //   1172: iconst_1
    //   1173: iadd
    //   1174: istore 5
    //   1176: goto -162 -> 1014
    //   1179: aconst_null
    //   1180: astore 15
    //   1182: iconst_0
    //   1183: istore 4
    //   1185: goto -214 -> 971
    //   1188: astore 15
    //   1190: aconst_null
    //   1191: astore 15
    //   1193: aload 17
    //   1195: astore 16
    //   1197: aload 16
    //   1199: ifnull +8 -> 1207
    //   1202: aload 16
    //   1204: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   1207: iconst_1
    //   1208: istore 4
    //   1210: goto -225 -> 985
    //   1213: astore 15
    //   1215: aload 18
    //   1217: astore 16
    //   1219: aload 16
    //   1221: ifnull +8 -> 1229
    //   1224: aload 16
    //   1226: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   1229: aload 15
    //   1231: athrow
    //   1232: astore 16
    //   1234: aload 14
    //   1236: astore 15
    //   1238: aload 16
    //   1240: astore 14
    //   1242: aload_2
    //   1243: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1246: sipush 215
    //   1249: aload 14
    //   1251: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   1254: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1257: aload_1
    //   1258: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1261: sipush 64999
    //   1264: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1267: aload 15
    //   1269: iconst_0
    //   1270: invokestatic 289	com/tencent/smtt/utils/j:a	(Ljava/io/File;Z)V
    //   1273: aload_2
    //   1274: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1277: iconst_0
    //   1278: iconst_m1
    //   1279: invokevirtual 273	com/tencent/smtt/sdk/ai:a	(II)V
    //   1282: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1285: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1288: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1291: invokeinterface 491 1 0
    //   1296: goto -1036 -> 260
    //   1299: ldc 125
    //   1301: new 228	java/lang/StringBuilder
    //   1304: dup
    //   1305: ldc_w 600
    //   1308: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1311: aload 17
    //   1313: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   1316: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1319: ldc_w 602
    //   1322: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1325: aload 19
    //   1327: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1330: ldc_w 604
    //   1333: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1336: aload 18
    //   1338: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1341: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1344: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1347: iconst_0
    //   1348: istore 8
    //   1350: ldc 125
    //   1352: new 228	java/lang/StringBuilder
    //   1355: dup
    //   1356: ldc_w 606
    //   1359: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1362: iload 8
    //   1364: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1367: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1370: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1373: iload 4
    //   1375: ifeq +62 -> 1437
    //   1378: iload 8
    //   1380: ifne +57 -> 1437
    //   1383: ldc 125
    //   1385: ldc_w 608
    //   1388: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1391: aload 14
    //   1393: iconst_1
    //   1394: invokestatic 289	com/tencent/smtt/utils/j:a	(Ljava/io/File;Z)V
    //   1397: aload_2
    //   1398: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1401: sipush 213
    //   1404: ldc_w 610
    //   1407: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1410: aload_1
    //   1411: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1414: sipush 65004
    //   1417: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1420: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1423: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1426: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1429: invokeinterface 491 1 0
    //   1434: goto -1174 -> 260
    //   1437: ldc 125
    //   1439: ldc_w 612
    //   1442: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1445: aload_0
    //   1446: aload_2
    //   1447: iconst_1
    //   1448: invokespecial 303	com/tencent/smtt/sdk/an:f	(Landroid/content/Context;Z)V
    //   1451: aload_1
    //   1452: invokestatic 616	com/tencent/smtt/sdk/ag:b	(Landroid/content/Context;)Ljava/io/File;
    //   1455: astore 16
    //   1457: aload 16
    //   1459: ifnull +38 -> 1497
    //   1462: aload 16
    //   1464: invokevirtual 561	java/io/File:exists	()Z
    //   1467: ifeq +30 -> 1497
    //   1470: aload_2
    //   1471: invokestatic 621	com/tencent/smtt/sdk/TbsDownloader:getOverSea	(Landroid/content/Context;)Z
    //   1474: ifeq +177 -> 1651
    //   1477: ldc_w 623
    //   1480: astore 15
    //   1482: new 296	java/io/File
    //   1485: dup
    //   1486: aload 16
    //   1488: aload 15
    //   1490: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1493: aload_2
    //   1494: invokestatic 626	com/tencent/smtt/sdk/ag:a	(Ljava/io/File;Landroid/content/Context;)V
    //   1497: aload_2
    //   1498: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1501: iload_3
    //   1502: iconst_1
    //   1503: invokevirtual 273	com/tencent/smtt/sdk/ai:a	(II)V
    //   1506: aload_0
    //   1507: getfield 105	com/tencent/smtt/sdk/an:k	Z
    //   1510: ifeq +149 -> 1659
    //   1513: aload_2
    //   1514: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1517: sipush 220
    //   1520: ldc_w 628
    //   1523: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1526: aload_1
    //   1527: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1530: sipush 65003
    //   1533: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1536: ldc 125
    //   1538: new 228	java/lang/StringBuilder
    //   1541: dup
    //   1542: ldc_w 630
    //   1545: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1548: iload_3
    //   1549: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1552: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1555: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1558: getstatic 442	android/os/Build$VERSION:SDK_INT	I
    //   1561: bipush 11
    //   1563: if_icmplt +133 -> 1696
    //   1566: aload_2
    //   1567: ldc_w 444
    //   1570: iconst_4
    //   1571: invokevirtual 448	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1574: astore 15
    //   1576: aload 15
    //   1578: invokeinterface 634 1 0
    //   1583: astore 15
    //   1585: aload 15
    //   1587: ldc_w 636
    //   1590: iconst_0
    //   1591: invokeinterface 642 3 0
    //   1596: pop
    //   1597: aload 15
    //   1599: ldc_w 644
    //   1602: iconst_0
    //   1603: invokeinterface 642 3 0
    //   1608: pop
    //   1609: aload 15
    //   1611: ldc_w 646
    //   1614: iload_3
    //   1615: invokeinterface 642 3 0
    //   1620: pop
    //   1621: aload 15
    //   1623: invokeinterface 649 1 0
    //   1628: pop
    //   1629: aload_2
    //   1630: invokestatic 651	com/tencent/smtt/utils/v:a	(Landroid/content/Context;)Z
    //   1633: pop
    //   1634: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1637: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1640: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1643: invokeinterface 491 1 0
    //   1648: goto -1388 -> 260
    //   1651: ldc_w 653
    //   1654: astore 15
    //   1656: goto -174 -> 1482
    //   1659: aload_2
    //   1660: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1663: sipush 220
    //   1666: ldc_w 655
    //   1669: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1672: goto -146 -> 1526
    //   1675: astore_1
    //   1676: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1679: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1682: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1685: invokeinterface 491 1 0
    //   1690: aload_0
    //   1691: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   1694: aload_1
    //   1695: athrow
    //   1696: aload_2
    //   1697: ldc_w 444
    //   1700: iconst_0
    //   1701: invokevirtual 448	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1704: astore 15
    //   1706: goto -130 -> 1576
    //   1709: astore 15
    //   1711: ldc 125
    //   1713: new 228	java/lang/StringBuilder
    //   1716: dup
    //   1717: ldc_w 657
    //   1720: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1723: aload 15
    //   1725: invokestatic 663	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1728: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1731: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1734: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1737: goto -108 -> 1629
    //   1740: ldc 125
    //   1742: ldc_w 665
    //   1745: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1748: aload_2
    //   1749: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1752: iload_3
    //   1753: iconst_2
    //   1754: invokevirtual 273	com/tencent/smtt/sdk/ai:a	(II)V
    //   1757: aload 14
    //   1759: iconst_0
    //   1760: invokestatic 289	com/tencent/smtt/utils/j:a	(Ljava/io/File;Z)V
    //   1763: aload_1
    //   1764: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1767: sipush 65002
    //   1770: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1773: aload_2
    //   1774: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1777: sipush 212
    //   1780: ldc_w 667
    //   1783: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1786: goto -152 -> 1634
    //   1789: aload 16
    //   1791: ifnonnull +26 -> 1817
    //   1794: aload_2
    //   1795: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1798: sipush 213
    //   1801: ldc_w 669
    //   1804: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1807: aload_1
    //   1808: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1811: sipush 65001
    //   1814: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1817: aload 14
    //   1819: ifnonnull -185 -> 1634
    //   1822: aload_2
    //   1823: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1826: sipush 214
    //   1829: ldc_w 671
    //   1832: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1835: aload_1
    //   1836: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1839: sipush 65000
    //   1842: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1845: goto -211 -> 1634
    //   1848: astore_1
    //   1849: ldc 125
    //   1851: new 228	java/lang/StringBuilder
    //   1854: dup
    //   1855: ldc_w 673
    //   1858: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1861: aload_1
    //   1862: invokevirtual 676	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1865: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1868: ldc_w 678
    //   1871: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1874: aload_1
    //   1875: invokevirtual 682	java/lang/Exception:getCause	()Ljava/lang/Throwable;
    //   1878: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1881: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1884: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1887: goto -605 -> 1282
    //   1890: aload_0
    //   1891: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   1894: aload_1
    //   1895: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1898: sipush 64998
    //   1901: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1904: return
    //   1905: astore 16
    //   1907: goto -700 -> 1207
    //   1910: astore 16
    //   1912: goto -683 -> 1229
    //   1915: astore 15
    //   1917: goto -936 -> 981
    //   1920: astore 14
    //   1922: goto -680 -> 1242
    //   1925: astore 17
    //   1927: aload 15
    //   1929: astore 16
    //   1931: aload 17
    //   1933: astore 15
    //   1935: goto -716 -> 1219
    //   1938: astore 15
    //   1940: aload 16
    //   1942: astore 15
    //   1944: aload 17
    //   1946: astore 16
    //   1948: goto -751 -> 1197
    //   1951: astore 17
    //   1953: aload 15
    //   1955: astore 17
    //   1957: aload 16
    //   1959: astore 15
    //   1961: aload 17
    //   1963: astore 16
    //   1965: goto -768 -> 1197
    //   1968: iload 4
    //   1970: ifle +12 -> 1982
    //   1973: iload_3
    //   1974: iload 4
    //   1976: if_icmple +6 -> 1982
    //   1979: goto -1594 -> 385
    //   1982: iload 5
    //   1984: istore 4
    //   1986: iload 5
    //   1988: iconst_3
    //   1989: if_icmpne -1579 -> 410
    //   1992: iload 5
    //   1994: istore 4
    //   1996: iload 6
    //   1998: ifle -1588 -> 410
    //   2001: iload_3
    //   2002: iload 6
    //   2004: if_icmpgt -1611 -> 393
    //   2007: iload 5
    //   2009: istore 4
    //   2011: iload_3
    //   2012: ldc_w 686
    //   2015: if_icmpne -1605 -> 410
    //   2018: goto -1625 -> 393
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2021	0	this	an
    //   0	2021	1	paramContext1	Context
    //   0	2021	2	paramContext2	Context
    //   0	2021	3	paramInt	int
    //   205	1805	4	i1	int
    //   217	1791	5	i2	int
    //   270	1735	6	i3	int
    //   369	11	7	i4	int
    //   156	1223	8	bool1	boolean
    //   1	1014	9	bool2	boolean
    //   420	381	10	l1	long
    //   429	41	12	l2	long
    //   60	1758	14	localObject1	Object
    //   1920	1	14	localException1	Exception
    //   193	988	15	localObject2	Object
    //   1188	1	15	localException2	Exception
    //   1191	1	15	localObject3	Object
    //   1213	17	15	localObject4	Object
    //   1236	469	15	localObject5	Object
    //   1709	15	15	localThrowable	Throwable
    //   1915	13	15	localIOException1	java.io.IOException
    //   1933	1	15	localObject6	Object
    //   1938	1	15	localException3	Exception
    //   1942	18	15	localObject7	Object
    //   663	562	16	localObject8	Object
    //   1232	7	16	localException4	Exception
    //   1455	335	16	localFile1	File
    //   1905	1	16	localIOException2	java.io.IOException
    //   1910	1	16	localIOException3	java.io.IOException
    //   1929	35	16	localObject9	Object
    //   910	402	17	localFile2	File
    //   1925	20	17	localObject10	Object
    //   1951	1	17	localException5	Exception
    //   1955	7	17	localObject11	Object
    //   907	430	18	str1	String
    //   1116	210	19	str2	String
    // Exception table:
    //   from	to	target	type
    //   912	935	1188	java/lang/Exception
    //   912	935	1213	finally
    //   935	961	1213	finally
    //   709	785	1232	java/lang/Exception
    //   785	812	1232	java/lang/Exception
    //   817	869	1232	java/lang/Exception
    //   976	981	1232	java/lang/Exception
    //   994	1011	1232	java/lang/Exception
    //   1018	1026	1232	java/lang/Exception
    //   1033	1170	1232	java/lang/Exception
    //   1202	1207	1232	java/lang/Exception
    //   1224	1229	1232	java/lang/Exception
    //   1229	1232	1232	java/lang/Exception
    //   1299	1347	1232	java/lang/Exception
    //   1350	1373	1232	java/lang/Exception
    //   1383	1420	1232	java/lang/Exception
    //   1437	1457	1232	java/lang/Exception
    //   1462	1477	1232	java/lang/Exception
    //   1482	1497	1232	java/lang/Exception
    //   1497	1526	1232	java/lang/Exception
    //   1526	1576	1232	java/lang/Exception
    //   1576	1629	1232	java/lang/Exception
    //   1629	1634	1232	java/lang/Exception
    //   1659	1672	1232	java/lang/Exception
    //   1696	1706	1232	java/lang/Exception
    //   1711	1737	1232	java/lang/Exception
    //   1740	1786	1232	java/lang/Exception
    //   1794	1817	1232	java/lang/Exception
    //   1822	1845	1232	java/lang/Exception
    //   195	219	1675	finally
    //   225	246	1675	finally
    //   265	295	1675	finally
    //   301	345	1675	finally
    //   362	371	1675	finally
    //   385	390	1675	finally
    //   393	407	1675	finally
    //   410	480	1675	finally
    //   502	538	1675	finally
    //   538	564	1675	finally
    //   586	598	1675	finally
    //   604	627	1675	finally
    //   644	658	1675	finally
    //   658	699	1675	finally
    //   709	785	1675	finally
    //   785	812	1675	finally
    //   817	869	1675	finally
    //   886	893	1675	finally
    //   896	903	1675	finally
    //   976	981	1675	finally
    //   994	1011	1675	finally
    //   1018	1026	1675	finally
    //   1033	1170	1675	finally
    //   1202	1207	1675	finally
    //   1224	1229	1675	finally
    //   1229	1232	1675	finally
    //   1242	1267	1675	finally
    //   1267	1282	1675	finally
    //   1299	1347	1675	finally
    //   1350	1373	1675	finally
    //   1383	1420	1675	finally
    //   1437	1457	1675	finally
    //   1462	1477	1675	finally
    //   1482	1497	1675	finally
    //   1497	1526	1675	finally
    //   1526	1576	1675	finally
    //   1576	1629	1675	finally
    //   1629	1634	1675	finally
    //   1659	1672	1675	finally
    //   1696	1706	1675	finally
    //   1711	1737	1675	finally
    //   1740	1786	1675	finally
    //   1794	1817	1675	finally
    //   1822	1845	1675	finally
    //   1849	1887	1675	finally
    //   1576	1629	1709	java/lang/Throwable
    //   1267	1282	1848	java/lang/Exception
    //   1202	1207	1905	java/io/IOException
    //   1224	1229	1910	java/io/IOException
    //   976	981	1915	java/io/IOException
    //   195	219	1920	java/lang/Exception
    //   225	246	1920	java/lang/Exception
    //   265	295	1920	java/lang/Exception
    //   301	345	1920	java/lang/Exception
    //   362	371	1920	java/lang/Exception
    //   385	390	1920	java/lang/Exception
    //   393	407	1920	java/lang/Exception
    //   410	480	1920	java/lang/Exception
    //   502	538	1920	java/lang/Exception
    //   538	564	1920	java/lang/Exception
    //   586	598	1920	java/lang/Exception
    //   604	627	1920	java/lang/Exception
    //   644	658	1920	java/lang/Exception
    //   658	699	1920	java/lang/Exception
    //   886	893	1920	java/lang/Exception
    //   896	903	1920	java/lang/Exception
    //   961	968	1925	finally
    //   935	961	1938	java/lang/Exception
    //   961	968	1951	java/lang/Exception
  }
  
  private boolean a(Context paramContext, File paramFile)
  {
    return a(paramContext, paramFile, false);
  }
  
  /* Error */
  private boolean a(Context paramContext, File paramFile, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: ldc 125
    //   5: ldc_w 700
    //   8: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   11: aload_2
    //   12: invokestatic 702	com/tencent/smtt/utils/j:c	(Ljava/io/File;)Z
    //   15: ifne +28 -> 43
    //   18: aload_1
    //   19: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   22: sipush 204
    //   25: ldc_w 704
    //   28: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   31: aload_1
    //   32: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   35: sipush 65016
    //   38: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   41: iconst_0
    //   42: ireturn
    //   43: aload_1
    //   44: ldc_w 335
    //   47: iconst_0
    //   48: invokevirtual 341	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   51: astore 8
    //   53: iload_3
    //   54: ifeq +91 -> 145
    //   57: new 296	java/io/File
    //   60: dup
    //   61: aload 8
    //   63: ldc_w 706
    //   66: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   69: astore 8
    //   71: aload 8
    //   73: invokevirtual 561	java/io/File:exists	()Z
    //   76: ifeq +28 -> 104
    //   79: aload_1
    //   80: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   83: getfield 188	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   86: ldc_w 523
    //   89: iconst_0
    //   90: invokeinterface 196 3 0
    //   95: iconst_1
    //   96: if_icmpeq +8 -> 104
    //   99: aload 8
    //   101: invokestatic 707	com/tencent/smtt/utils/j:b	(Ljava/io/File;)V
    //   104: iload_3
    //   105: ifeq +88 -> 193
    //   108: aload_0
    //   109: aload_1
    //   110: invokevirtual 710	com/tencent/smtt/sdk/an:u	(Landroid/content/Context;)Ljava/io/File;
    //   113: astore 8
    //   115: aload 8
    //   117: ifnonnull +86 -> 203
    //   120: aload_1
    //   121: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   124: sipush 205
    //   127: ldc_w 712
    //   130: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   133: aload_1
    //   134: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   137: sipush 65015
    //   140: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   143: iconst_0
    //   144: ireturn
    //   145: new 296	java/io/File
    //   148: dup
    //   149: aload 8
    //   151: ldc_w 343
    //   154: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   157: astore 8
    //   159: goto -88 -> 71
    //   162: astore 8
    //   164: ldc 125
    //   166: new 228	java/lang/StringBuilder
    //   169: dup
    //   170: ldc_w 714
    //   173: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   176: aload 8
    //   178: invokestatic 663	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   181: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: goto -86 -> 104
    //   193: aload_0
    //   194: aload_1
    //   195: invokevirtual 294	com/tencent/smtt/sdk/an:t	(Landroid/content/Context;)Ljava/io/File;
    //   198: astore 8
    //   200: goto -85 -> 115
    //   203: aload 8
    //   205: invokestatic 716	com/tencent/smtt/utils/j:a	(Ljava/io/File;)Z
    //   208: pop
    //   209: iload_3
    //   210: ifeq +9 -> 219
    //   213: aload 8
    //   215: iconst_1
    //   216: invokestatic 289	com/tencent/smtt/utils/j:a	(Ljava/io/File;Z)V
    //   219: aload_2
    //   220: aload 8
    //   222: invokestatic 719	com/tencent/smtt/utils/j:a	(Ljava/io/File;Ljava/io/File;)Z
    //   225: istore 7
    //   227: iload 7
    //   229: istore 6
    //   231: iload 7
    //   233: ifeq +12 -> 245
    //   236: aload_0
    //   237: aload 8
    //   239: aload_1
    //   240: invokespecial 722	com/tencent/smtt/sdk/an:a	(Ljava/io/File;Landroid/content/Context;)Z
    //   243: istore 6
    //   245: iload_3
    //   246: ifeq +81 -> 327
    //   249: aload 8
    //   251: invokevirtual 726	java/io/File:list	()[Ljava/lang/String;
    //   254: astore_2
    //   255: iconst_0
    //   256: istore 4
    //   258: iload 4
    //   260: aload_2
    //   261: arraylength
    //   262: if_icmpge +47 -> 309
    //   265: new 296	java/io/File
    //   268: dup
    //   269: aload 8
    //   271: aload_2
    //   272: iload 4
    //   274: aaload
    //   275: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   278: astore 9
    //   280: aload 9
    //   282: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   285: ldc_w 576
    //   288: invokevirtual 580	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   291: ifeq +9 -> 300
    //   294: aload 9
    //   296: invokevirtual 327	java/io/File:delete	()Z
    //   299: pop
    //   300: iload 4
    //   302: iconst_1
    //   303: iadd
    //   304: istore 4
    //   306: goto -48 -> 258
    //   309: new 296	java/io/File
    //   312: dup
    //   313: aload_1
    //   314: invokestatic 729	com/tencent/smtt/sdk/an:s	(Landroid/content/Context;)Ljava/io/File;
    //   317: ldc_w 731
    //   320: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   323: invokevirtual 327	java/io/File:delete	()Z
    //   326: pop
    //   327: iload 6
    //   329: ifne +55 -> 384
    //   332: aload 8
    //   334: invokestatic 707	com/tencent/smtt/utils/j:b	(Ljava/io/File;)V
    //   337: aload_1
    //   338: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   341: sipush 65014
    //   344: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   347: ldc 125
    //   349: new 228	java/lang/StringBuilder
    //   352: dup
    //   353: ldc_w 733
    //   356: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   359: aload 8
    //   361: invokevirtual 561	java/io/File:exists	()Z
    //   364: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   367: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: ldc 125
    //   375: ldc_w 735
    //   378: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   381: iload 6
    //   383: ireturn
    //   384: aload_0
    //   385: aload_1
    //   386: iconst_1
    //   387: invokespecial 303	com/tencent/smtt/sdk/an:f	(Landroid/content/Context;Z)V
    //   390: iload_3
    //   391: ifeq -18 -> 373
    //   394: aload_0
    //   395: aload_1
    //   396: invokevirtual 531	com/tencent/smtt/sdk/an:p	(Landroid/content/Context;)Ljava/io/File;
    //   399: astore_2
    //   400: aload_2
    //   401: iconst_1
    //   402: invokestatic 289	com/tencent/smtt/utils/j:a	(Ljava/io/File;Z)V
    //   405: aload 8
    //   407: aload_2
    //   408: invokevirtual 300	java/io/File:renameTo	(Ljava/io/File;)Z
    //   411: pop
    //   412: aload_1
    //   413: invokestatic 546	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;)V
    //   416: goto -43 -> 373
    //   419: astore_2
    //   420: aload_1
    //   421: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   424: sipush 65013
    //   427: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   430: aload_1
    //   431: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   434: sipush 206
    //   437: aload_2
    //   438: invokevirtual 738	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/Throwable;)V
    //   441: aload 8
    //   443: ifnull +231 -> 674
    //   446: aload 8
    //   448: invokevirtual 561	java/io/File:exists	()Z
    //   451: istore_3
    //   452: iload_3
    //   453: ifeq +221 -> 674
    //   456: iconst_1
    //   457: istore 4
    //   459: iload 4
    //   461: ifeq +39 -> 500
    //   464: aload 8
    //   466: ifnull +34 -> 500
    //   469: aload 8
    //   471: invokestatic 707	com/tencent/smtt/utils/j:b	(Ljava/io/File;)V
    //   474: ldc 125
    //   476: new 228	java/lang/StringBuilder
    //   479: dup
    //   480: ldc_w 740
    //   483: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   486: aload 8
    //   488: invokevirtual 561	java/io/File:exists	()Z
    //   491: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   494: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   497: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   500: ldc 125
    //   502: ldc_w 735
    //   505: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   508: iconst_0
    //   509: ireturn
    //   510: astore_2
    //   511: aload_1
    //   512: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   515: sipush 65013
    //   518: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   521: aload_1
    //   522: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   525: sipush 207
    //   528: aload_2
    //   529: invokevirtual 738	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/Throwable;)V
    //   532: aload 8
    //   534: ifnull +134 -> 668
    //   537: aload 8
    //   539: invokevirtual 561	java/io/File:exists	()Z
    //   542: istore_3
    //   543: iload_3
    //   544: ifeq +124 -> 668
    //   547: iload 5
    //   549: istore 4
    //   551: iload 4
    //   553: ifeq +39 -> 592
    //   556: aload 8
    //   558: ifnull +34 -> 592
    //   561: aload 8
    //   563: invokestatic 707	com/tencent/smtt/utils/j:b	(Ljava/io/File;)V
    //   566: ldc 125
    //   568: new 228	java/lang/StringBuilder
    //   571: dup
    //   572: ldc_w 740
    //   575: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   578: aload 8
    //   580: invokevirtual 561	java/io/File:exists	()Z
    //   583: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   586: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   589: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   592: goto -92 -> 500
    //   595: astore_1
    //   596: ldc 125
    //   598: ldc_w 735
    //   601: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   604: aload_1
    //   605: athrow
    //   606: astore_1
    //   607: ldc 125
    //   609: new 228	java/lang/StringBuilder
    //   612: dup
    //   613: ldc_w 742
    //   616: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   619: aload_1
    //   620: invokestatic 663	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   623: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   626: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   629: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   632: goto -132 -> 500
    //   635: astore_1
    //   636: ldc 125
    //   638: new 228	java/lang/StringBuilder
    //   641: dup
    //   642: ldc_w 742
    //   645: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   648: aload_1
    //   649: invokestatic 663	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   652: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   658: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   661: goto -69 -> 592
    //   664: astore_2
    //   665: goto -338 -> 327
    //   668: iconst_0
    //   669: istore 4
    //   671: goto -120 -> 551
    //   674: iconst_0
    //   675: istore 4
    //   677: goto -218 -> 459
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	680	0	this	an
    //   0	680	1	paramContext	Context
    //   0	680	2	paramFile	File
    //   0	680	3	paramBoolean	boolean
    //   256	420	4	i1	int
    //   1	547	5	i2	int
    //   229	153	6	bool1	boolean
    //   225	7	7	bool2	boolean
    //   51	107	8	localFile1	File
    //   162	15	8	localThrowable	Throwable
    //   198	381	8	localFile2	File
    //   278	17	9	localFile3	File
    // Exception table:
    //   from	to	target	type
    //   43	53	162	java/lang/Throwable
    //   57	71	162	java/lang/Throwable
    //   71	104	162	java/lang/Throwable
    //   145	159	162	java/lang/Throwable
    //   203	209	419	java/io/IOException
    //   213	219	419	java/io/IOException
    //   219	227	419	java/io/IOException
    //   236	245	419	java/io/IOException
    //   249	255	419	java/io/IOException
    //   258	300	419	java/io/IOException
    //   309	327	419	java/io/IOException
    //   332	373	419	java/io/IOException
    //   384	390	419	java/io/IOException
    //   394	416	419	java/io/IOException
    //   203	209	510	java/lang/Exception
    //   213	219	510	java/lang/Exception
    //   219	227	510	java/lang/Exception
    //   236	245	510	java/lang/Exception
    //   249	255	510	java/lang/Exception
    //   258	300	510	java/lang/Exception
    //   332	373	510	java/lang/Exception
    //   384	390	510	java/lang/Exception
    //   394	416	510	java/lang/Exception
    //   203	209	595	finally
    //   213	219	595	finally
    //   219	227	595	finally
    //   236	245	595	finally
    //   249	255	595	finally
    //   258	300	595	finally
    //   309	327	595	finally
    //   332	373	595	finally
    //   384	390	595	finally
    //   394	416	595	finally
    //   420	441	595	finally
    //   446	452	595	finally
    //   511	532	595	finally
    //   537	543	595	finally
    //   469	500	606	java/lang/Throwable
    //   561	592	635	java/lang/Throwable
    //   309	327	664	java/lang/Exception
  }
  
  /* Error */
  private boolean a(File paramFile, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc 125
    //   5: new 228	java/lang/StringBuilder
    //   8: dup
    //   9: ldc_w 744
    //   12: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   19: ldc_w 746
    //   22: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_2
    //   26: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: new 296	java/io/File
    //   38: dup
    //   39: aload_1
    //   40: ldc_w 558
    //   43: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   46: astore_2
    //   47: new 353	java/util/Properties
    //   50: dup
    //   51: invokespecial 354	java/util/Properties:<init>	()V
    //   54: astore 6
    //   56: aload_2
    //   57: invokevirtual 561	java/io/File:exists	()Z
    //   60: ifeq +244 -> 304
    //   63: new 356	java/io/BufferedInputStream
    //   66: dup
    //   67: new 358	java/io/FileInputStream
    //   70: dup
    //   71: aload_2
    //   72: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   75: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   78: astore_2
    //   79: aload 6
    //   81: aload_2
    //   82: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   85: iconst_1
    //   86: istore 4
    //   88: aload_2
    //   89: astore 7
    //   91: aload 6
    //   93: astore_2
    //   94: iload 4
    //   96: istore 5
    //   98: aload 7
    //   100: ifnull +15 -> 115
    //   103: aload 7
    //   105: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   108: iload 4
    //   110: istore 5
    //   112: aload 6
    //   114: astore_2
    //   115: ldc 125
    //   117: new 228	java/lang/StringBuilder
    //   120: dup
    //   121: ldc_w 748
    //   124: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: iload 5
    //   129: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   132: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: iload 5
    //   140: ifeq +366 -> 506
    //   143: aload_1
    //   144: invokevirtual 565	java/io/File:listFiles	()[Ljava/io/File;
    //   147: astore_1
    //   148: iconst_0
    //   149: istore_3
    //   150: iload_3
    //   151: aload_1
    //   152: arraylength
    //   153: if_icmpge +353 -> 506
    //   156: aload_1
    //   157: iload_3
    //   158: aaload
    //   159: astore 6
    //   161: ldc_w 558
    //   164: aload 6
    //   166: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   169: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   172: ifne +125 -> 297
    //   175: aload 6
    //   177: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   180: ldc_w 576
    //   183: invokevirtual 580	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   186: ifne +111 -> 297
    //   189: ldc_w 351
    //   192: aload 6
    //   194: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   197: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   200: ifne +97 -> 297
    //   203: aload 6
    //   205: invokevirtual 583	java/io/File:isDirectory	()Z
    //   208: ifne +89 -> 297
    //   211: aload 6
    //   213: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   216: ldc_w 585
    //   219: invokevirtual 580	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   222: ifne +75 -> 297
    //   225: aload 6
    //   227: invokestatic 590	com/tencent/smtt/utils/a:a	(Ljava/io/File;)Ljava/lang/String;
    //   230: astore 7
    //   232: aload_2
    //   233: aload 6
    //   235: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   238: ldc -83
    //   240: invokevirtual 594	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   243: astore 8
    //   245: aload 8
    //   247: ldc -83
    //   249: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   252: ifne +97 -> 349
    //   255: aload 8
    //   257: aload 7
    //   259: invokevirtual 574	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   262: ifeq +87 -> 349
    //   265: ldc 125
    //   267: new 228	java/lang/StringBuilder
    //   270: dup
    //   271: ldc_w 596
    //   274: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   277: aload 6
    //   279: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   282: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: ldc_w 598
    //   288: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   297: iload_3
    //   298: iconst_1
    //   299: iadd
    //   300: istore_3
    //   301: goto -151 -> 150
    //   304: aconst_null
    //   305: astore 7
    //   307: iconst_0
    //   308: istore 4
    //   310: goto -219 -> 91
    //   313: astore_2
    //   314: aconst_null
    //   315: astore_2
    //   316: aconst_null
    //   317: astore 6
    //   319: aload 6
    //   321: ifnull +8 -> 329
    //   324: aload 6
    //   326: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   329: iconst_1
    //   330: istore 5
    //   332: goto -217 -> 115
    //   335: astore_1
    //   336: aload 7
    //   338: astore_2
    //   339: aload_2
    //   340: ifnull +7 -> 347
    //   343: aload_2
    //   344: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   347: aload_1
    //   348: athrow
    //   349: ldc 125
    //   351: new 228	java/lang/StringBuilder
    //   354: dup
    //   355: ldc_w 600
    //   358: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   361: aload 6
    //   363: invokevirtual 568	java/io/File:getName	()Ljava/lang/String;
    //   366: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: ldc_w 602
    //   372: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: aload 8
    //   377: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: ldc_w 604
    //   383: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: aload 7
    //   388: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   394: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   397: iconst_0
    //   398: istore 4
    //   400: ldc 125
    //   402: new 228	java/lang/StringBuilder
    //   405: dup
    //   406: ldc_w 750
    //   409: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   412: iload 4
    //   414: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   417: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   420: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   423: iload 5
    //   425: ifeq +18 -> 443
    //   428: iload 4
    //   430: ifne +13 -> 443
    //   433: ldc 125
    //   435: ldc_w 752
    //   438: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   441: iconst_0
    //   442: ireturn
    //   443: ldc 125
    //   445: ldc_w 754
    //   448: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   451: iconst_1
    //   452: ireturn
    //   453: astore 6
    //   455: goto -126 -> 329
    //   458: astore_2
    //   459: goto -112 -> 347
    //   462: astore_2
    //   463: aload 6
    //   465: astore_2
    //   466: iload 4
    //   468: istore 5
    //   470: goto -355 -> 115
    //   473: astore_1
    //   474: goto -135 -> 339
    //   477: astore_2
    //   478: aconst_null
    //   479: astore 7
    //   481: aload 6
    //   483: astore_2
    //   484: aload 7
    //   486: astore 6
    //   488: goto -169 -> 319
    //   491: astore 7
    //   493: aload_2
    //   494: astore 7
    //   496: aload 6
    //   498: astore_2
    //   499: aload 7
    //   501: astore 6
    //   503: goto -184 -> 319
    //   506: iconst_1
    //   507: istore 4
    //   509: goto -109 -> 400
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	512	0	this	an
    //   0	512	1	paramFile	File
    //   0	512	2	paramContext	Context
    //   149	152	3	i1	int
    //   86	422	4	bool1	boolean
    //   96	373	5	bool2	boolean
    //   54	308	6	localProperties	java.util.Properties
    //   453	29	6	localIOException	java.io.IOException
    //   486	16	6	localObject1	Object
    //   1	484	7	localObject2	Object
    //   491	1	7	localException	Exception
    //   494	6	7	localContext	Context
    //   243	133	8	str	String
    // Exception table:
    //   from	to	target	type
    //   35	56	313	java/lang/Exception
    //   35	56	335	finally
    //   56	79	335	finally
    //   324	329	453	java/io/IOException
    //   343	347	458	java/io/IOException
    //   103	108	462	java/io/IOException
    //   79	85	473	finally
    //   56	79	477	java/lang/Exception
    //   79	85	491	java/lang/Exception
  }
  
  @TargetApi(11)
  private void b(Context paramContext, String paramString, int paramInt)
  {
    int i4 = 200;
    int i5 = 0;
    TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65035);
    if (c(paramContext))
    {
      TbsLog.i("TbsInstaller", "isTbsLocalInstalled --> no installation!", true);
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65034);
      return;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsApkPath=" + paramString);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreTargetVer=" + paramInt);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread currentThreadName=" + Thread.currentThread().getName());
    if (Build.VERSION.SDK_INT >= 11) {}
    for (Object localObject = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4); ((SharedPreferences)localObject).getInt("tbs_precheck_disable_version", -1) == paramInt; localObject = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 0))
    {
      TbsLog.e("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- version:" + paramInt + " is disabled by preload_x5_check!");
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65033);
      return;
    }
    if (!j.b(paramContext))
    {
      long l1 = v.a();
      long l2 = TbsDownloadConfig.getInstance(paramContext).getDownloadMinFreeSpace();
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65032);
      TbsLogReport.a(paramContext).a(210, "rom is not enough when installing tbs core! curAvailROM=" + l1 + ",minReqRom=" + l2);
      return;
    }
    if (!w(paramContext))
    {
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65031);
      return;
    }
    boolean bool = j.tryLock();
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread locked =" + bool);
    int i1;
    int i2;
    label506:
    int i3;
    if (bool)
    {
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65029);
      i.lock();
      label599:
      String str;
      int i6;
      for (;;)
      {
        try
        {
          i1 = ai.a(paramContext).c("copy_core_ver");
          i2 = ai.a(paramContext).b();
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreCopyVer =" + i1);
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreInstallVer =" + i2);
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreTargetVer =" + paramInt);
          if ((i2 <= 0) || (paramInt <= i2)) {
            break label2194;
          }
          o(paramContext);
          i2 = ai.a(paramContext).c();
          i3 = i(paramContext);
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread installStatus1=" + i2);
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreInstalledVer=" + i3);
          if ((i2 >= 0) && (i2 < 2))
          {
            TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- retry.....", true);
            i1 = 1;
            i3 = i2;
            i2 = i1;
            TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65028);
            TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread installStatus2=" + i3);
            if (i3 > 0) {
              break label1697;
            }
            TbsLog.i("TbsInstaller", "STEP 2/2 begin installation.....", true);
            TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65027);
            if (i2 == 0) {
              continue;
            }
            i1 = ai.a(paramContext).c("unzip_retry_num");
            if (i1 > 10)
            {
              TbsLogReport.a(paramContext).a(201, "exceed unzip retry num!");
              F(paramContext);
              TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65026);
            }
          }
          else
          {
            i1 = i2;
            if (i2 != 3) {
              break label2208;
            }
            i1 = i2;
            if (i3 <= 0) {
              break label2208;
            }
            if (paramInt <= i3)
            {
              i1 = i2;
              if (paramInt != 88888888) {
                break label2208;
              }
            }
            i1 = -1;
            o(paramContext);
            TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- update TBS.....", true);
            break label2208;
          }
          ai.a(paramContext).b(i1 + 1);
          if (paramString == null)
          {
            str = ai.a(paramContext).d("install_apk_path");
            localObject = str;
            if (str == null)
            {
              TbsLogReport.a(paramContext).a(202, "apk path is null!");
              TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65025);
            }
          }
          else
          {
            localObject = paramString;
          }
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread apkPath =" + (String)localObject);
          i6 = b(paramContext, (String)localObject);
          if (i6 == 0)
          {
            TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65024);
            TbsLogReport.a(paramContext).a(203, "apk version is 0!");
            return;
          }
          ai.a(paramContext).a("install_apk_path", (String)localObject);
          ai.a(paramContext).b(i6, 0);
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(64988);
          if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
          {
            if (!a(paramContext, new File((String)localObject), true)) {
              TbsLogReport.a(paramContext).a(207, "unzipTbsApk failed", TbsLogReport.EventType.TYPE_INSTALL_DECOUPLE);
            }
          }
          else if (!a(paramContext, new File((String)localObject)))
          {
            TbsLogReport.a(paramContext).a(207, "unzipTbsApk failed");
            return;
          }
          if (i2 != 0)
          {
            i1 = ai.a(paramContext).b("unlzma_status");
            if (i1 > 5)
            {
              TbsLogReport.a(paramContext).a(223, "exceed unlzma retry num!");
              TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(64983);
              F(paramContext);
              ag.c(paramContext);
              TbsDownloadConfig.getInstance(paramContext).a.put("tbs_needdownload", Boolean.valueOf(true));
              TbsDownloadConfig.getInstance(paramContext).a.put("request_full_package", Boolean.valueOf(true));
              TbsDownloadConfig.getInstance(paramContext).commit();
              return;
            }
            ai.a(paramContext).d(i1 + 1);
          }
          TbsLog.i("TbsInstaller", "unlzma begin");
          i1 = TbsDownloadConfig.getInstance().mPreferences.getInt("tbs_responsecode", 0);
          if (i(paramContext) == 0) {
            break;
          }
          localObject = QbSdk.a(paramContext, "can_unlzma", null);
          if ((localObject == null) || (!(localObject instanceof Boolean))) {
            break label2188;
          }
          bool = ((Boolean)localObject).booleanValue();
          label1295:
          if (!bool) {
            break;
          }
          localObject = new Bundle();
          ((Bundle)localObject).putInt("responseCode", i1);
          if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
          {
            ((Bundle)localObject).putString("unzip_temp_path", p(paramContext).getAbsolutePath());
            localObject = QbSdk.a(paramContext, "unlzma", (Bundle)localObject);
            if (localObject == null)
            {
              TbsLog.i("TbsInstaller", "unlzma return null");
              TbsLogReport.a(paramContext).a(222, "unlzma is null");
              i1 = i5;
              if (i1 != 0) {
                break;
              }
            }
          }
          else
          {
            ((Bundle)localObject).putString("unzip_temp_path", t(paramContext).getAbsolutePath());
            continue;
          }
          if (!(localObject instanceof Boolean)) {
            break label1521;
          }
        }
        finally
        {
          i.unlock();
          j.unlock();
          b();
        }
        if (((Boolean)localObject).booleanValue())
        {
          TbsLog.i("TbsInstaller", "unlzma success");
          i1 = 1;
        }
        else
        {
          TbsLog.i("TbsInstaller", "unlzma return false");
          TbsLogReport.a(paramContext).a(222, "unlzma return false");
          i1 = i5;
          continue;
          label1521:
          if ((localObject instanceof Bundle))
          {
            i1 = 1;
          }
          else
          {
            i1 = i5;
            if ((localObject instanceof Throwable))
            {
              TbsLog.i("TbsInstaller", "unlzma failure because Throwable" + Log.getStackTraceString((Throwable)localObject));
              TbsLogReport.a(paramContext).a(222, (Throwable)localObject);
              i1 = i5;
            }
          }
        }
      }
      TbsLog.i("TbsInstaller", "unlzma finished");
      ai.a(paramContext).b(i6, 1);
      i1 = i6;
      label1620:
      if (i3 < 2)
      {
        if (i2 != 0)
        {
          i2 = ai.a(paramContext).c("dexopt_retry_num");
          if (i2 > 10)
          {
            TbsLogReport.a(paramContext).a(208, "exceed dexopt retry num!");
            TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65022);
            F(paramContext);
            i.unlock();
            j.unlock();
            b();
            return;
            label1697:
            if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) != 1) {
              break label2218;
            }
            if (paramString == null)
            {
              str = ai.a(paramContext).d("install_apk_path");
              localObject = str;
              if (str == null)
              {
                TbsLogReport.a(paramContext).a(202, "apk path is null!");
                TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65025);
                i.unlock();
                j.unlock();
                b();
              }
            }
            else
            {
              localObject = paramString;
            }
            a(paramContext, new File((String)localObject), true);
            break label2218;
          }
          ai.a(paramContext).a(i2 + 1);
        }
        TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(64987);
        if (!d(paramContext, 0))
        {
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65021);
          i.unlock();
          j.unlock();
          b();
          return;
        }
        ai.a(paramContext).b(i1, 2);
        TbsLog.i("TbsInstaller", "STEP 2/2 installation completed! you can restart!", true);
        TbsLog.i("TbsInstaller", "STEP 2/2 installation completed! you can restart! version:" + paramInt);
        TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65020);
        if (Build.VERSION.SDK_INT >= 11) {
          localObject = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4);
        }
        try
        {
          for (;;)
          {
            localObject = ((SharedPreferences)localObject).edit();
            ((SharedPreferences.Editor)localObject).putInt("tbs_preload_x5_counter", 0);
            ((SharedPreferences.Editor)localObject).putInt("tbs_preload_x5_recorder", 0);
            ((SharedPreferences.Editor)localObject).putInt("tbs_preload_x5_version", paramInt);
            ((SharedPreferences.Editor)localObject).commit();
            TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65019);
            if (paramInt == 88888888) {
              a(paramInt, paramString, paramContext);
            }
            if (!this.k) {
              break;
            }
            paramString = TbsLogReport.a(paramContext);
            paramInt = i4;
            if (ai.a(paramContext).d() == 1) {
              paramInt = 221;
            }
            paramString.a(paramInt, "continueInstallWithout core success");
            label2049:
            i.unlock();
            j.unlock();
            b();
            return;
            localObject = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 0);
          }
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            TbsLog.e("TbsInstaller", "Init tbs_preload_x5_counter#1 exception:" + Log.getStackTraceString(localThrowable));
            TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65018);
          }
          paramString = TbsLogReport.a(paramContext);
          if (ai.a(paramContext).d() != 1) {}
        }
      }
    }
    for (paramInt = 221;; paramInt = 200)
    {
      paramString.a(paramInt, "success");
      break label2049;
      if (i3 != 2) {
        break label2049;
      }
      QbSdk.m.onInstallFinish(200);
      break label2049;
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(65017);
      b();
      return;
      label2188:
      bool = false;
      break label1295;
      label2194:
      if ((i1 <= 0) || (paramInt <= i1)) {
        break label506;
      }
      break;
      label2208:
      i2 = 0;
      i3 = i1;
      break label599;
      label2218:
      i1 = 0;
      break label1620;
    }
  }
  
  /* Error */
  private boolean b(Context paramContext, File paramFile)
  {
    // Byte code:
    //   0: aload_2
    //   1: new 938	com/tencent/smtt/sdk/av
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 941	com/tencent/smtt/sdk/av:<init>	(Lcom/tencent/smtt/sdk/an;)V
    //   9: invokevirtual 944	java/io/File:listFiles	(Ljava/io/FileFilter;)[Ljava/io/File;
    //   12: astore 6
    //   14: aload 6
    //   16: arraylength
    //   17: istore 4
    //   19: getstatic 442	android/os/Build$VERSION:SDK_INT	I
    //   22: bipush 16
    //   24: if_icmpge +33 -> 57
    //   27: aload_1
    //   28: invokevirtual 947	android/content/Context:getPackageName	()Ljava/lang/String;
    //   31: ifnull +26 -> 57
    //   34: aload_1
    //   35: invokevirtual 947	android/content/Context:getPackageName	()Ljava/lang/String;
    //   38: ldc_w 949
    //   41: invokevirtual 952	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   44: istore 5
    //   46: iload 5
    //   48: ifeq +9 -> 57
    //   51: ldc2_w 953
    //   54: invokestatic 958	java/lang/Thread:sleep	(J)V
    //   57: aload_1
    //   58: invokevirtual 962	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   61: astore 7
    //   63: iconst_0
    //   64: istore_3
    //   65: iload_3
    //   66: iload 4
    //   68: if_icmpge +60 -> 128
    //   71: ldc 125
    //   73: new 228	java/lang/StringBuilder
    //   76: dup
    //   77: ldc_w 964
    //   80: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   83: aload 6
    //   85: iload_3
    //   86: aaload
    //   87: invokevirtual 902	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   90: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: new 966	dalvik/system/DexClassLoader
    //   102: dup
    //   103: aload 6
    //   105: iload_3
    //   106: aaload
    //   107: invokevirtual 902	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   110: aload_2
    //   111: invokevirtual 902	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   114: aconst_null
    //   115: aload 7
    //   117: invokespecial 969	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   120: pop
    //   121: iload_3
    //   122: iconst_1
    //   123: iadd
    //   124: istore_3
    //   125: goto -60 -> 65
    //   128: iconst_1
    //   129: ireturn
    //   130: astore_2
    //   131: aload_1
    //   132: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   135: sipush 209
    //   138: aload_2
    //   139: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   142: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   145: ldc 125
    //   147: ldc_w 971
    //   150: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: iconst_0
    //   154: ireturn
    //   155: astore 7
    //   157: goto -100 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	an
    //   0	160	1	paramContext	Context
    //   0	160	2	paramFile	File
    //   64	61	3	i1	int
    //   17	52	4	i2	int
    //   44	3	5	bool	boolean
    //   12	92	6	arrayOfFile	File[]
    //   61	55	7	localClassLoader	ClassLoader
    //   155	1	7	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	46	130	java/lang/Exception
    //   57	63	130	java/lang/Exception
    //   71	121	130	java/lang/Exception
    //   51	57	155	java/lang/Exception
  }
  
  private boolean c(Context paramContext, File paramFile)
  {
    try
    {
      Object localObject1 = new File(paramFile, "tbs_sdk_extension_dex.jar");
      Object localObject2 = new File(paramFile, "tbs_sdk_extension_dex.dex");
      Object localObject3 = paramContext.getClassLoader();
      new DexClassLoader(((File)localObject1).getAbsolutePath(), paramFile.getAbsolutePath(), null, (ClassLoader)localObject3);
      localObject1 = g.a(paramContext, ((File)localObject2).getAbsolutePath());
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        TbsLogReport.a(paramContext).a(226, "can not find oat command");
        return false;
      }
      paramFile = paramFile.listFiles(new aw(this));
      int i2 = paramFile.length;
      int i1 = 0;
      while (i1 < i2)
      {
        localObject2 = paramFile[i1];
        localObject2 = ((File)localObject2).getName().substring(0, ((File)localObject2).getName().length() - 4);
        localObject3 = ((String)localObject1).replaceAll("tbs_sdk_extension_dex", (String)localObject2);
        localObject2 = "/system/bin/dex2oat " + (String)localObject3 + " --dex-location=" + a().q(paramContext) + File.separator + (String)localObject2 + ".jar";
        Runtime.getRuntime().exec((String)localObject2).waitFor();
        i1 += 1;
      }
      return true;
    }
    catch (Exception paramFile)
    {
      TbsLogReport.a(paramContext).a(226, paramFile);
    }
    return false;
  }
  
  /* Error */
  private boolean c(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: iconst_0
    //   4: istore 5
    //   6: iconst_0
    //   7: istore 8
    //   9: iconst_0
    //   10: istore 9
    //   12: aload_0
    //   13: monitorenter
    //   14: ldc 125
    //   16: ldc_w 1030
    //   19: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: iload 8
    //   24: istore 6
    //   26: aload_0
    //   27: aload_1
    //   28: invokevirtual 457	com/tencent/smtt/sdk/an:w	(Landroid/content/Context;)Z
    //   31: istore 10
    //   33: iload 10
    //   35: ifne +12 -> 47
    //   38: iload 9
    //   40: istore 5
    //   42: aload_0
    //   43: monitorexit
    //   44: iload 5
    //   46: ireturn
    //   47: iload 8
    //   49: istore 6
    //   51: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   54: invokevirtual 1031	java/util/concurrent/locks/ReentrantLock:tryLock	()Z
    //   57: istore 9
    //   59: iload 8
    //   61: istore 6
    //   63: ldc 125
    //   65: new 228	java/lang/StringBuilder
    //   68: dup
    //   69: ldc_w 1033
    //   72: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: iload 9
    //   77: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   80: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: iload 9
    //   88: ifeq +108 -> 196
    //   91: aload_1
    //   92: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   95: ldc_w 477
    //   98: invokevirtual 479	com/tencent/smtt/sdk/ai:b	(Ljava/lang/String;)I
    //   101: istore_3
    //   102: aload_0
    //   103: iconst_0
    //   104: aload_1
    //   105: invokevirtual 1036	com/tencent/smtt/sdk/an:a	(ZLandroid/content/Context;)I
    //   108: istore 4
    //   110: ldc 125
    //   112: new 228	java/lang/StringBuilder
    //   115: dup
    //   116: ldc_w 1038
    //   119: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: iload_3
    //   123: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   126: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   132: ldc 125
    //   134: new 228	java/lang/StringBuilder
    //   137: dup
    //   138: ldc_w 1040
    //   141: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   144: iload 4
    //   146: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   149: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: iload 7
    //   157: istore 5
    //   159: iload_3
    //   160: iconst_1
    //   161: if_icmpne +25 -> 186
    //   164: iload 4
    //   166: ifne +98 -> 264
    //   169: ldc 125
    //   171: ldc_w 1042
    //   174: iconst_1
    //   175: invokestatic 333	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   178: aload_0
    //   179: aload_1
    //   180: invokespecial 1044	com/tencent/smtt/sdk/an:B	(Landroid/content/Context;)V
    //   183: iconst_1
    //   184: istore 5
    //   186: iload 5
    //   188: istore 6
    //   190: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   193: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   196: iload 5
    //   198: istore 6
    //   200: aload_0
    //   201: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   204: goto -162 -> 42
    //   207: astore 11
    //   209: aload_1
    //   210: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   213: sipush 215
    //   216: aload 11
    //   218: invokevirtual 255	java/lang/Throwable:toString	()Ljava/lang/String;
    //   221: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   224: aload_1
    //   225: new 228	java/lang/StringBuilder
    //   228: dup
    //   229: ldc_w 1046
    //   232: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   235: aload 11
    //   237: invokestatic 663	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   240: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   246: invokestatic 318	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   249: iload 6
    //   251: istore 5
    //   253: goto -211 -> 42
    //   256: astore_1
    //   257: aload_1
    //   258: athrow
    //   259: astore_1
    //   260: aload_0
    //   261: monitorexit
    //   262: aload_1
    //   263: athrow
    //   264: iload 7
    //   266: istore 5
    //   268: iload_2
    //   269: ifeq -83 -> 186
    //   272: ldc 125
    //   274: ldc_w 1048
    //   277: iconst_1
    //   278: invokestatic 333	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   281: aload_0
    //   282: aload_1
    //   283: invokespecial 1044	com/tencent/smtt/sdk/an:B	(Landroid/content/Context;)V
    //   286: iconst_1
    //   287: istore 5
    //   289: goto -103 -> 186
    //   292: astore 11
    //   294: iload 8
    //   296: istore 6
    //   298: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   301: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   304: iload 8
    //   306: istore 6
    //   308: aload 11
    //   310: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	311	0	this	an
    //   0	311	1	paramContext	Context
    //   0	311	2	paramBoolean	boolean
    //   101	61	3	i1	int
    //   108	57	4	i2	int
    //   4	284	5	bool1	boolean
    //   24	283	6	bool2	boolean
    //   1	264	7	bool3	boolean
    //   7	298	8	bool4	boolean
    //   10	77	9	bool5	boolean
    //   31	3	10	bool6	boolean
    //   207	29	11	localThrowable	Throwable
    //   292	17	11	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   26	33	207	java/lang/Throwable
    //   51	59	207	java/lang/Throwable
    //   63	86	207	java/lang/Throwable
    //   190	196	207	java/lang/Throwable
    //   200	204	207	java/lang/Throwable
    //   298	304	207	java/lang/Throwable
    //   308	311	207	java/lang/Throwable
    //   26	33	256	finally
    //   51	59	256	finally
    //   63	86	256	finally
    //   190	196	256	finally
    //   200	204	256	finally
    //   209	249	256	finally
    //   298	304	256	finally
    //   308	311	256	finally
    //   14	22	259	finally
    //   257	259	259	finally
    //   91	155	292	finally
    //   169	183	292	finally
    //   272	286	292	finally
  }
  
  private boolean d(Context paramContext, int paramInt)
  {
    boolean bool = true;
    int i3 = 0;
    TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt start - dirMode: " + paramInt);
    switch (paramInt)
    {
    default: 
    case 0: 
      try
      {
        TbsLog.e("TbsInstaller", "doDexoptOrDexoat mode error: " + paramInt);
        return false;
      }
      catch (Exception localException)
      {
        File localFile1;
        String str;
        TbsLogReport.a(paramContext).a(209, localException.toString());
        TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
        return true;
      }
      if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1) {
        break label316;
      }
      localFile1 = t(paramContext);
    }
    try
    {
      str = System.getProperty("java.vm.version");
      if (str == null) {
        break label319;
      }
      bool = str.startsWith("2");
      if (!bool) {
        break label319;
      }
      paramInt = 1;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        label137:
        TbsLogReport.a(paramContext).a(226, localThrowable);
        paramInt = 0;
        continue;
        if (paramInt == 0) {
          break;
        }
        TbsLog.i("TbsInstaller", "doTbsDexOpt -- is ART mode, skip!");
      }
      TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoptForDavlikVM");
      bool = b(paramContext, localFile2);
    }
    if (Build.VERSION.SDK_INT == 23) {}
    for (int i1 = 1;; i1 = 0)
    {
      bool = TbsDownloadConfig.getInstance(paramContext).mPreferences.getBoolean("tbs_stop_preoat", false);
      int i2 = i3;
      if (paramInt != 0)
      {
        i2 = i3;
        if (i1 != 0)
        {
          i2 = i3;
          if (!bool) {
            i2 = 1;
          }
        }
      }
      File localFile2;
      if ((i2 != 0) && (c(paramContext, localFile1)))
      {
        TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoatForArtVm");
        return true;
        localFile2 = v(paramContext);
        break;
        localFile2 = q(paramContext);
        break;
      }
      label316:
      return bool;
      label319:
      paramInt = 0;
      break label137;
    }
  }
  
  private static boolean d(Context paramContext, String paramString)
  {
    paramContext = new File(paramContext.getDir("tbs", 0), paramString);
    if (!paramContext.exists())
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-isPrepareTbsCore, #1");
      return false;
    }
    if (!new File(paramContext, "tbs.conf").exists())
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-isPrepareTbsCore, #2");
      return false;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-isPrepareTbsCore, #3");
    return true;
  }
  
  /* Error */
  private boolean d(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: iconst_0
    //   4: istore 5
    //   6: iconst_0
    //   7: istore 8
    //   9: iconst_0
    //   10: istore 9
    //   12: aload_0
    //   13: monitorenter
    //   14: ldc 125
    //   16: new 228	java/lang/StringBuilder
    //   19: dup
    //   20: ldc_w 1085
    //   23: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: iload_2
    //   27: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   30: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: iload 8
    //   38: istore 6
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 457	com/tencent/smtt/sdk/an:w	(Landroid/content/Context;)Z
    //   45: istore 10
    //   47: iload 10
    //   49: ifne +12 -> 61
    //   52: iload 9
    //   54: istore 5
    //   56: aload_0
    //   57: monitorexit
    //   58: iload 5
    //   60: ireturn
    //   61: iload 8
    //   63: istore 6
    //   65: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   68: invokevirtual 1031	java/util/concurrent/locks/ReentrantLock:tryLock	()Z
    //   71: istore 9
    //   73: iload 8
    //   75: istore 6
    //   77: ldc 125
    //   79: new 228	java/lang/StringBuilder
    //   82: dup
    //   83: ldc_w 1087
    //   86: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: iload 9
    //   91: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   94: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: iload 9
    //   102: ifeq +82 -> 184
    //   105: aload_1
    //   106: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   109: invokevirtual 802	com/tencent/smtt/sdk/ai:c	()I
    //   112: istore_3
    //   113: ldc 125
    //   115: new 228	java/lang/StringBuilder
    //   118: dup
    //   119: ldc_w 1089
    //   122: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   125: iload_3
    //   126: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   129: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: aload_0
    //   136: iconst_0
    //   137: aload_1
    //   138: invokevirtual 1036	com/tencent/smtt/sdk/an:a	(ZLandroid/content/Context;)I
    //   141: istore 4
    //   143: iload 7
    //   145: istore 5
    //   147: iload_3
    //   148: iconst_2
    //   149: if_icmpne +25 -> 174
    //   152: iload 4
    //   154: ifne +77 -> 231
    //   157: ldc 125
    //   159: ldc_w 1091
    //   162: iconst_0
    //   163: invokestatic 333	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   166: aload_0
    //   167: aload_1
    //   168: invokespecial 1093	com/tencent/smtt/sdk/an:A	(Landroid/content/Context;)V
    //   171: iconst_1
    //   172: istore 5
    //   174: iload 5
    //   176: istore 6
    //   178: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   181: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   184: iload 5
    //   186: istore 6
    //   188: aload_0
    //   189: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   192: goto -136 -> 56
    //   195: astore 11
    //   197: aload_1
    //   198: new 228	java/lang/StringBuilder
    //   201: dup
    //   202: ldc_w 1095
    //   205: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   208: aload 11
    //   210: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   213: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: invokestatic 318	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   219: iload 6
    //   221: istore 5
    //   223: goto -167 -> 56
    //   226: astore_1
    //   227: aload_0
    //   228: monitorexit
    //   229: aload_1
    //   230: athrow
    //   231: iload 7
    //   233: istore 5
    //   235: iload_2
    //   236: ifeq -62 -> 174
    //   239: ldc 125
    //   241: ldc_w 1097
    //   244: iconst_0
    //   245: invokestatic 333	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   248: aload_0
    //   249: aload_1
    //   250: invokespecial 1093	com/tencent/smtt/sdk/an:A	(Landroid/content/Context;)V
    //   253: iconst_1
    //   254: istore 5
    //   256: goto -82 -> 174
    //   259: astore 11
    //   261: iload 8
    //   263: istore 6
    //   265: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   268: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   271: iload 8
    //   273: istore 6
    //   275: aload 11
    //   277: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	an
    //   0	278	1	paramContext	Context
    //   0	278	2	paramBoolean	boolean
    //   112	38	3	i1	int
    //   141	12	4	i2	int
    //   4	251	5	bool1	boolean
    //   38	236	6	bool2	boolean
    //   1	231	7	bool3	boolean
    //   7	265	8	bool4	boolean
    //   10	91	9	bool5	boolean
    //   45	3	10	bool6	boolean
    //   195	14	11	localException	Exception
    //   259	17	11	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   40	47	195	java/lang/Exception
    //   65	73	195	java/lang/Exception
    //   77	100	195	java/lang/Exception
    //   178	184	195	java/lang/Exception
    //   188	192	195	java/lang/Exception
    //   265	271	195	java/lang/Exception
    //   275	278	195	java/lang/Exception
    //   14	36	226	finally
    //   40	47	226	finally
    //   65	73	226	finally
    //   77	100	226	finally
    //   178	184	226	finally
    //   188	192	226	finally
    //   197	219	226	finally
    //   265	271	226	finally
    //   275	278	226	finally
    //   105	143	259	finally
    //   157	171	259	finally
    //   239	253	259	finally
  }
  
  private Context e(Context paramContext, int paramInt)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreHostContext tbsCoreTargetVer=" + paramInt);
    if (paramInt <= 0) {
      return null;
    }
    String[] arrayOfString = TbsShareManager.getCoreProviderAppList();
    int i1 = 0;
    if (i1 < arrayOfString.length)
    {
      Context localContext;
      if ((!paramContext.getPackageName().equalsIgnoreCase(arrayOfString[i1])) && (e(paramContext, arrayOfString[i1])))
      {
        localContext = a(paramContext, arrayOfString[i1]);
        if (localContext != null)
        {
          if (f(localContext)) {
            break label131;
          }
          TbsLog.e("TbsInstaller", "TbsInstaller--getTbsCoreHostContext " + arrayOfString[i1] + " illegal signature go on next");
        }
      }
      label131:
      int i2;
      do
      {
        i1 += 1;
        break;
        i2 = i(localContext);
        TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext hostTbsCoreVer=" + i2);
      } while ((i2 == 0) || (i2 != paramInt));
      TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext targetApp=" + arrayOfString[i1]);
      return localContext;
    }
    return null;
  }
  
  private boolean e(Context paramContext, String paramString)
  {
    boolean bool = false;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      if (paramContext != null) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = null;
      }
    }
  }
  
  private boolean e(Context paramContext, boolean paramBoolean)
  {
    return false;
  }
  
  private void f(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null) {
      TbsLogReport.a(paramContext).a(225, "setTmpFolderCoreToRead context is null");
    }
    for (;;)
    {
      return;
      try
      {
        File localFile = new File(paramContext.getDir("tbs", 0), "tmp_folder_core_to_read.conf");
        if (paramBoolean)
        {
          if (localFile.exists()) {
            continue;
          }
          localFile.createNewFile();
        }
      }
      catch (Exception localException)
      {
        TbsLogReport.a(paramContext).a(225, "setTmpFolderCoreToRead Exception message is " + localException.getMessage() + " Exception cause is " + localException.getCause());
        return;
      }
    }
    j.b(localException);
  }
  
  static File s(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_private");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  private static boolean x(Context paramContext)
  {
    if (paramContext == null)
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #1");
      return true;
    }
    try
    {
      if (new File(paramContext.getDir("tbs", 0), "tmp_folder_core_to_read.conf").exists())
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #2");
        return true;
      }
    }
    catch (Exception paramContext)
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #4");
      return true;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #3");
    return false;
  }
  
  private void y(Context paramContext)
  {
    int i1 = 1;
    try
    {
      boolean bool = TbsDownloadConfig.getInstance().getTbsCoreLoadRenameFileLockEnable();
      i1 = bool;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
    if ((i1 != 0) && (l != null)) {
      j.a(paramContext, l);
    }
  }
  
  private boolean z(Context paramContext)
  {
    boolean bool2 = true;
    try
    {
      bool1 = TbsDownloadConfig.getInstance().getTbsCoreLoadRenameFileLockEnable();
      if (!bool1)
      {
        l = bv.a().a(paramContext);
        bool1 = bool2;
        if (l == null) {
          bool1 = false;
        }
        return bool1;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        boolean bool1 = true;
        continue;
        l = j.f(paramContext);
      }
    }
  }
  
  /* Error */
  int a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aload_1
    //   5: ifnonnull +5 -> 10
    //   8: iload_3
    //   9: ireturn
    //   10: aconst_null
    //   11: astore 6
    //   13: new 296	java/io/File
    //   16: dup
    //   17: new 296	java/io/File
    //   20: dup
    //   21: aload_1
    //   22: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: ldc_w 351
    //   28: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   31: astore_1
    //   32: aload_1
    //   33: invokevirtual 561	java/io/File:exists	()Z
    //   36: istore 5
    //   38: iload 5
    //   40: ifne +20 -> 60
    //   43: iconst_0
    //   44: ifeq -36 -> 8
    //   47: iload_2
    //   48: istore_3
    //   49: new 1172	java/lang/NullPointerException
    //   52: dup
    //   53: invokespecial 1173	java/lang/NullPointerException:<init>	()V
    //   56: athrow
    //   57: astore_1
    //   58: iload_3
    //   59: ireturn
    //   60: new 353	java/util/Properties
    //   63: dup
    //   64: invokespecial 354	java/util/Properties:<init>	()V
    //   67: astore 7
    //   69: new 356	java/io/BufferedInputStream
    //   72: dup
    //   73: new 358	java/io/FileInputStream
    //   76: dup
    //   77: aload_1
    //   78: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   81: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   84: astore_1
    //   85: aload 7
    //   87: aload_1
    //   88: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   91: aload_1
    //   92: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   95: aload 7
    //   97: ldc_w 1175
    //   100: invokevirtual 1176	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   103: astore 6
    //   105: aload 6
    //   107: ifnonnull +15 -> 122
    //   110: aload_1
    //   111: ifnull -103 -> 8
    //   114: iload_2
    //   115: istore_3
    //   116: aload_1
    //   117: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   120: iconst_0
    //   121: ireturn
    //   122: aload 6
    //   124: invokestatic 1179	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   127: istore 4
    //   129: iload 4
    //   131: istore_2
    //   132: iload_2
    //   133: istore_3
    //   134: aload_1
    //   135: ifnull -127 -> 8
    //   138: iload_2
    //   139: istore_3
    //   140: aload_1
    //   141: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   144: iload_2
    //   145: ireturn
    //   146: astore_1
    //   147: aload 6
    //   149: ifnull +8 -> 157
    //   152: aload 6
    //   154: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   157: aload_1
    //   158: athrow
    //   159: astore_1
    //   160: aconst_null
    //   161: astore_1
    //   162: aload_1
    //   163: ifnull -155 -> 8
    //   166: iload_2
    //   167: istore_3
    //   168: aload_1
    //   169: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   172: iconst_0
    //   173: ireturn
    //   174: astore 6
    //   176: goto -19 -> 157
    //   179: astore 7
    //   181: aload_1
    //   182: astore 6
    //   184: aload 7
    //   186: astore_1
    //   187: goto -40 -> 147
    //   190: astore 6
    //   192: goto -30 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	this	an
    //   0	195	1	paramString	String
    //   1	166	2	i1	int
    //   3	165	3	i2	int
    //   127	3	4	i3	int
    //   36	3	5	bool	boolean
    //   11	142	6	str1	String
    //   174	1	6	localIOException	java.io.IOException
    //   182	1	6	str2	String
    //   190	1	6	localException	Exception
    //   67	29	7	localProperties	java.util.Properties
    //   179	6	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   49	57	57	java/io/IOException
    //   116	120	57	java/io/IOException
    //   140	144	57	java/io/IOException
    //   168	172	57	java/io/IOException
    //   13	38	146	finally
    //   60	85	146	finally
    //   13	38	159	java/lang/Exception
    //   60	85	159	java/lang/Exception
    //   152	157	174	java/io/IOException
    //   85	105	179	finally
    //   122	129	179	finally
    //   85	105	190	java/lang/Exception
    //   122	129	190	java/lang/Exception
  }
  
  public int a(boolean paramBoolean, Context paramContext)
  {
    if ((paramBoolean) || (((Integer)a.get()).intValue() <= 0)) {
      a.set(Integer.valueOf(i(paramContext)));
    }
    return ((Integer)a.get()).intValue();
  }
  
  Context a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.createPackageContext(paramString, 2);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  void a(Context paramContext, Bundle paramBundle)
  {
    if ((paramBundle == null) || (paramContext == null)) {
      return;
    }
    Message localMessage = new Message();
    localMessage.what = 3;
    localMessage.obj = new Object[] { paramContext, paramBundle };
    m.sendMessage(localMessage);
  }
  
  void a(Context paramContext, String paramString, int paramInt)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsApkPath=" + paramString);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsCoreTargetVer=" + paramInt);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentThreadName=" + Thread.currentThread().getName());
    Message localMessage = new Message();
    localMessage.what = 1;
    localMessage.obj = new Object[] { paramContext, paramString, Integer.valueOf(paramInt) };
    m.sendMessage(localMessage);
  }
  
  void a(Context paramContext, boolean paramBoolean)
  {
    int i5 = 0;
    if (paramBoolean) {
      this.k = true;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentThreadName=" + Thread.currentThread().getName());
    if (!w(paramContext)) {
      return;
    }
    String str = null;
    if (i.tryLock()) {}
    for (;;)
    {
      try
      {
        i4 = ai.a(paramContext).c();
        i3 = ai.a(paramContext).b();
        str = ai.a(paramContext).d("install_apk_path");
        i1 = ai.a(paramContext).c("copy_core_ver");
        i2 = ai.a(paramContext).b("copy_status");
        i.unlock();
        b();
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore installStatus=" + i4);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreInstallVer=" + i3);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsApkPath=" + str);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreCopyVer=" + i1);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore copyStatus=" + i2);
        if (TbsShareManager.isThirdPartyApp(paramContext))
        {
          b(paramContext, TbsShareManager.a(paramContext, false));
          return;
        }
      }
      finally
      {
        i.unlock();
      }
      int i6 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_responsecode", 0);
      if ((i6 == 1) || (i6 == 2) || (i6 == 4)) {
        i5 = 1;
      }
      if ((i5 == 0) && (i6 != 0))
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("operation", 10001);
        a(paramContext, localBundle);
      }
      if ((i4 >= 0) && (i4 < 2)) {
        a(paramContext, str, i3);
      }
      if (i2 != 0) {
        break;
      }
      a(paramContext, i1);
      return;
      int i1 = 0;
      int i2 = -1;
      int i3 = 0;
      int i4 = -1;
    }
  }
  
  boolean a(Context paramContext, int paramInt)
  {
    if (TbsDownloader.getOverSea(paramContext)) {
      return false;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore targetTbsCoreVer=" + paramInt);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentThreadName=" + Thread.currentThread().getName());
    Context localContext = e(paramContext, paramInt);
    if (localContext != null)
    {
      Message localMessage = new Message();
      localMessage.what = 2;
      localMessage.obj = new Object[] { localContext, paramContext, Integer.valueOf(paramInt) };
      m.sendMessage(localMessage);
      return true;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller--installLocalTbsCore copy from null");
    return false;
  }
  
  /* Error */
  public boolean a(Context paramContext1, Context paramContext2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 125
    //   4: ldc_w 1256
    //   7: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   10: getstatic 97	com/tencent/smtt/sdk/an:p	Z
    //   13: istore_3
    //   14: iload_3
    //   15: iconst_1
    //   16: if_icmpne +7 -> 23
    //   19: aload_0
    //   20: monitorexit
    //   21: iconst_1
    //   22: ireturn
    //   23: iconst_1
    //   24: putstatic 97	com/tencent/smtt/sdk/an:p	Z
    //   27: new 1258	com/tencent/smtt/sdk/ar
    //   30: dup
    //   31: aload_0
    //   32: aload_2
    //   33: aload_1
    //   34: invokespecial 1261	com/tencent/smtt/sdk/ar:<init>	(Lcom/tencent/smtt/sdk/an;Landroid/content/Context;Landroid/content/Context;)V
    //   37: invokevirtual 1264	com/tencent/smtt/sdk/ar:start	()V
    //   40: goto -21 -> 19
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	an
    //   0	48	1	paramContext1	Context
    //   0	48	2	paramContext2	Context
    //   13	4	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	14	43	finally
    //   23	40	43	finally
  }
  
  int b(Context paramContext, String paramString)
  {
    int i1 = 0;
    paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramString, 0);
    if (paramContext != null) {
      i1 = paramContext.versionCode;
    }
    return i1;
  }
  
  File b(Context paramContext1, Context paramContext2)
  {
    File localFile = new File(paramContext2.getDir("tbs", 0), "core_share");
    paramContext2 = localFile;
    if (!localFile.isDirectory()) {
      if (paramContext1 != null)
      {
        paramContext2 = localFile;
        if (TbsShareManager.isThirdPartyApp(paramContext1)) {}
      }
      else
      {
        paramContext2 = localFile;
        if (!localFile.mkdir()) {
          paramContext2 = null;
        }
      }
    }
    return paramContext2;
  }
  
  /* Error */
  void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 101	com/tencent/smtt/sdk/an:e	I
    //   6: istore_1
    //   7: aload_0
    //   8: iload_1
    //   9: iconst_1
    //   10: isub
    //   11: putfield 101	com/tencent/smtt/sdk/an:e	I
    //   14: iload_1
    //   15: iconst_1
    //   16: if_icmpgt +10 -> 26
    //   19: aload_0
    //   20: getfield 103	com/tencent/smtt/sdk/an:h	Z
    //   23: ifne +14 -> 37
    //   26: ldc 125
    //   28: ldc_w 1277
    //   31: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: ldc 125
    //   39: ldc_w 1279
    //   42: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: aload_0
    //   46: getfield 1281	com/tencent/smtt/sdk/an:f	Ljava/nio/channels/FileLock;
    //   49: aload_0
    //   50: getfield 1283	com/tencent/smtt/sdk/an:g	Ljava/io/FileOutputStream;
    //   53: invokestatic 1286	com/tencent/smtt/utils/j:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield 103	com/tencent/smtt/sdk/an:h	Z
    //   61: goto -27 -> 34
    //   64: astore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	an
    //   6	11	1	i1	int
    //   64	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	64	finally
    //   19	26	64	finally
    //   26	34	64	finally
    //   37	61	64	finally
  }
  
  public void b(Context paramContext)
  {
    f(paramContext, true);
    ai.a(paramContext).b(h(paramContext), 2);
  }
  
  void b(Context paramContext, int paramInt)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreForThirdPartyApp");
    if (paramInt <= 0) {}
    int i1;
    do
    {
      do
      {
        return;
        i1 = i(paramContext);
      } while (i1 == paramInt);
      Context localContext = TbsShareManager.e(paramContext);
      if ((localContext != null) || (TbsShareManager.getHostCorePathAppDefined() != null))
      {
        TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp hostContext != null");
        a(paramContext, localContext);
        return;
      }
    } while (i1 > 0);
    TbsLog.i("TbsInstaller", "TbsInstaller--installTbsCoreForThirdPartyApp hostContext == null");
    QbSdk.a(paramContext, "TbsInstaller::installTbsCoreForThirdPartyApp forceSysWebViewInner #2");
  }
  
  /* Error */
  void b(Context paramContext, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 435	com/tencent/smtt/sdk/an:c	(Landroid/content/Context;)Z
    //   5: ifeq +14 -> 19
    //   8: aload_1
    //   9: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   12: sipush 64997
    //   15: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   18: return
    //   19: ldc 125
    //   21: ldc_w 1304
    //   24: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: aload_2
    //   28: ifnull -10 -> 18
    //   31: aload_1
    //   32: ifnull -14 -> 18
    //   35: aload_1
    //   36: invokestatic 506	com/tencent/smtt/utils/j:b	(Landroid/content/Context;)Z
    //   39: ifne +67 -> 106
    //   42: invokestatic 511	com/tencent/smtt/utils/v:a	()J
    //   45: lstore 5
    //   47: aload_1
    //   48: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   51: invokevirtual 514	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadMinFreeSpace	()J
    //   54: lstore 7
    //   56: aload_1
    //   57: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   60: sipush 210
    //   63: new 228	java/lang/StringBuilder
    //   66: dup
    //   67: ldc_w 1306
    //   70: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   73: lload 5
    //   75: invokevirtual 519	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   78: ldc_w 521
    //   81: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: lload 7
    //   86: invokevirtual 519	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   89: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   95: aload_1
    //   96: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   99: sipush 64996
    //   102: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   105: return
    //   106: aload_0
    //   107: aload_1
    //   108: invokevirtual 457	com/tencent/smtt/sdk/an:w	(Landroid/content/Context;)Z
    //   111: ifne +14 -> 125
    //   114: aload_1
    //   115: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   118: sipush 64995
    //   121: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   124: return
    //   125: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   128: invokeinterface 462 1 0
    //   133: istore 9
    //   135: ldc 125
    //   137: new 228	java/lang/StringBuilder
    //   140: dup
    //   141: ldc_w 1308
    //   144: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   147: iload 9
    //   149: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   152: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: iload 9
    //   160: ifeq +1016 -> 1176
    //   163: aconst_null
    //   164: astore 10
    //   166: aconst_null
    //   167: astore 13
    //   169: aconst_null
    //   170: astore 14
    //   172: aload 10
    //   174: astore 12
    //   176: aload 13
    //   178: astore 11
    //   180: iconst_1
    //   181: invokestatic 1312	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   184: aload 10
    //   186: astore 12
    //   188: aload 13
    //   190: astore 11
    //   192: aload_0
    //   193: aload_1
    //   194: invokevirtual 204	com/tencent/smtt/sdk/an:i	(Landroid/content/Context;)I
    //   197: ifle +22 -> 219
    //   200: aload 10
    //   202: astore 12
    //   204: aload 13
    //   206: astore 11
    //   208: aload_1
    //   209: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   212: invokevirtual 934	com/tencent/smtt/sdk/ai:d	()I
    //   215: iconst_1
    //   216: if_icmpne +40 -> 256
    //   219: aload 10
    //   221: astore 12
    //   223: aload 13
    //   225: astore 11
    //   227: iconst_0
    //   228: invokestatic 1312	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   231: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   234: invokeinterface 491 1 0
    //   239: aload_0
    //   240: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   243: ldc 125
    //   245: ldc_w 1314
    //   248: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   251: iconst_0
    //   252: invokestatic 1312	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   255: return
    //   256: aload 10
    //   258: astore 12
    //   260: aload 13
    //   262: astore 11
    //   264: aload_1
    //   265: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   268: getfield 188	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   271: ldc_w 882
    //   274: iconst_0
    //   275: invokeinterface 196 3 0
    //   280: istore 4
    //   282: iload 4
    //   284: iconst_1
    //   285: if_icmpeq +1126 -> 1411
    //   288: iload 4
    //   290: iconst_2
    //   291: if_icmpeq +1120 -> 1411
    //   294: iload 4
    //   296: iconst_4
    //   297: if_icmpne +297 -> 594
    //   300: goto +1111 -> 1411
    //   303: iload_3
    //   304: ifne +1098 -> 1402
    //   307: iload 4
    //   309: ifeq +1093 -> 1402
    //   312: aload 10
    //   314: astore 12
    //   316: aload 13
    //   318: astore 11
    //   320: aload_1
    //   321: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   324: ldc -91
    //   326: invokevirtual 475	com/tencent/smtt/sdk/ai:c	(Ljava/lang/String;)I
    //   329: istore_3
    //   330: iload_3
    //   331: iconst_5
    //   332: if_icmple +267 -> 599
    //   335: aload 10
    //   337: astore 12
    //   339: aload 13
    //   341: astore 11
    //   343: ldc 125
    //   345: ldc_w 1316
    //   348: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   351: aload 10
    //   353: astore 12
    //   355: aload 13
    //   357: astore 11
    //   359: aload_2
    //   360: ldc_w 1318
    //   363: invokevirtual 1321	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   366: astore 14
    //   368: aload 10
    //   370: astore 12
    //   372: aload 13
    //   374: astore 11
    //   376: aload_2
    //   377: ldc_w 1323
    //   380: invokevirtual 1321	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   383: astore 15
    //   385: aload 10
    //   387: astore 12
    //   389: aload 13
    //   391: astore 11
    //   393: aload_2
    //   394: ldc_w 1325
    //   397: invokevirtual 1321	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   400: astore_2
    //   401: aload 10
    //   403: astore 12
    //   405: aload 13
    //   407: astore 11
    //   409: aload 14
    //   411: invokestatic 986	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   414: ifne +23 -> 437
    //   417: aload 10
    //   419: astore 12
    //   421: aload 13
    //   423: astore 11
    //   425: new 296	java/io/File
    //   428: dup
    //   429: aload 14
    //   431: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   434: invokestatic 707	com/tencent/smtt/utils/j:b	(Ljava/io/File;)V
    //   437: aload 10
    //   439: astore 12
    //   441: aload 13
    //   443: astore 11
    //   445: aload 15
    //   447: invokestatic 986	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   450: ifne +23 -> 473
    //   453: aload 10
    //   455: astore 12
    //   457: aload 13
    //   459: astore 11
    //   461: new 296	java/io/File
    //   464: dup
    //   465: aload 15
    //   467: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   470: invokestatic 707	com/tencent/smtt/utils/j:b	(Ljava/io/File;)V
    //   473: aload 10
    //   475: astore 12
    //   477: aload 13
    //   479: astore 11
    //   481: aload_2
    //   482: invokestatic 986	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   485: ifne +22 -> 507
    //   488: aload 10
    //   490: astore 12
    //   492: aload 13
    //   494: astore 11
    //   496: new 296	java/io/File
    //   499: dup
    //   500: aload_2
    //   501: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   504: invokestatic 707	com/tencent/smtt/utils/j:b	(Ljava/io/File;)V
    //   507: aload 10
    //   509: astore 12
    //   511: aload 13
    //   513: astore 11
    //   515: aload_1
    //   516: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   519: getfield 858	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   522: ldc_w 860
    //   525: iconst_1
    //   526: invokestatic 865	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   529: invokeinterface 871 3 0
    //   534: pop
    //   535: aload 10
    //   537: astore 12
    //   539: aload 13
    //   541: astore 11
    //   543: aload_1
    //   544: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   547: invokevirtual 875	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   550: aload 10
    //   552: astore 12
    //   554: aload 13
    //   556: astore 11
    //   558: aload_1
    //   559: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   562: sipush 224
    //   565: ldc_w 1327
    //   568: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   571: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   574: invokeinterface 491 1 0
    //   579: aload_0
    //   580: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   583: ldc 125
    //   585: ldc_w 1314
    //   588: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   591: goto -340 -> 251
    //   594: iconst_0
    //   595: istore_3
    //   596: goto -293 -> 303
    //   599: aload 10
    //   601: astore 12
    //   603: aload 13
    //   605: astore 11
    //   607: aload_1
    //   608: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   611: ldc -91
    //   613: iload_3
    //   614: iconst_1
    //   615: iadd
    //   616: invokevirtual 168	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   619: aload 10
    //   621: astore 12
    //   623: aload 13
    //   625: astore 11
    //   627: aload_1
    //   628: invokestatic 729	com/tencent/smtt/sdk/an:s	(Landroid/content/Context;)Ljava/io/File;
    //   631: astore 15
    //   633: aload 15
    //   635: ifnull +767 -> 1402
    //   638: aload 10
    //   640: astore 12
    //   642: aload 13
    //   644: astore 11
    //   646: new 296	java/io/File
    //   649: dup
    //   650: aload 15
    //   652: ldc_w 731
    //   655: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   658: invokevirtual 561	java/io/File:exists	()Z
    //   661: ifeq +741 -> 1402
    //   664: aload 10
    //   666: astore 12
    //   668: aload 13
    //   670: astore 11
    //   672: aload_1
    //   673: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   676: sipush 64986
    //   679: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   682: aload 10
    //   684: astore 12
    //   686: aload 13
    //   688: astore 11
    //   690: aload_1
    //   691: aload_2
    //   692: invokestatic 1330	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Landroid/os/Bundle;)Landroid/os/Bundle;
    //   695: astore 10
    //   697: aload 10
    //   699: ifnonnull +141 -> 840
    //   702: aload 10
    //   704: astore 11
    //   706: aload_1
    //   707: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   710: sipush 228
    //   713: new 228	java/lang/StringBuilder
    //   716: dup
    //   717: ldc_w 1332
    //   720: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   723: aload_2
    //   724: ldc_w 1334
    //   727: invokevirtual 1336	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   730: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   733: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   736: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   739: iconst_1
    //   740: istore_3
    //   741: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   744: invokeinterface 491 1 0
    //   749: aload_0
    //   750: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   753: iload_3
    //   754: ifne +530 -> 1284
    //   757: ldc 125
    //   759: ldc_w 1338
    //   762: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   765: aload_1
    //   766: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   769: ldc -91
    //   771: iconst_0
    //   772: invokevirtual 168	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   775: aload_1
    //   776: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   779: sipush 64992
    //   782: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   785: aload_1
    //   786: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   789: iconst_0
    //   790: iconst_m1
    //   791: invokevirtual 171	com/tencent/smtt/sdk/ai:b	(II)V
    //   794: aload_1
    //   795: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   798: iconst_1
    //   799: invokevirtual 178	com/tencent/smtt/sdk/ai:c	(I)V
    //   802: aload 10
    //   804: ldc_w 1340
    //   807: invokevirtual 1321	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   810: astore_2
    //   811: new 296	java/io/File
    //   814: dup
    //   815: aload_2
    //   816: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   819: aload_1
    //   820: invokestatic 626	com/tencent/smtt/sdk/ag:a	(Ljava/io/File;Landroid/content/Context;)V
    //   823: aload_0
    //   824: aload_1
    //   825: aload_2
    //   826: aload 10
    //   828: ldc_w 1342
    //   831: invokevirtual 1336	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   834: invokespecial 694	com/tencent/smtt/sdk/an:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   837: goto -586 -> 251
    //   840: aload 10
    //   842: astore 12
    //   844: aload 10
    //   846: astore 11
    //   848: aload 10
    //   850: ldc_w 1344
    //   853: invokevirtual 1336	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   856: istore_3
    //   857: iload_3
    //   858: istore 4
    //   860: aload 10
    //   862: astore 11
    //   864: aload_1
    //   865: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   868: sipush 228
    //   871: new 228	java/lang/StringBuilder
    //   874: dup
    //   875: ldc_w 1346
    //   878: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   881: iload_3
    //   882: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   885: ldc_w 1348
    //   888: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   891: aload_2
    //   892: ldc_w 1334
    //   895: invokevirtual 1336	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   898: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   901: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   904: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   907: goto -166 -> 741
    //   910: astore_2
    //   911: iload_3
    //   912: istore 4
    //   914: aload 10
    //   916: astore 11
    //   918: ldc 125
    //   920: new 228	java/lang/StringBuilder
    //   923: dup
    //   924: ldc_w 1350
    //   927: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   930: aload_2
    //   931: invokestatic 663	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   934: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   937: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   940: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   943: aload 10
    //   945: astore 11
    //   947: aload_1
    //   948: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   951: sipush 64993
    //   954: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   957: aload 10
    //   959: astore 11
    //   961: aload_1
    //   962: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   965: sipush 218
    //   968: aload_2
    //   969: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   972: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   975: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   978: invokeinterface 491 1 0
    //   983: aload_0
    //   984: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   987: aload_1
    //   988: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   991: sipush 64990
    //   994: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   997: ldc 125
    //   999: ldc_w 1352
    //   1002: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1005: aload_1
    //   1006: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1009: getfield 858	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1012: ldc_w 860
    //   1015: iconst_1
    //   1016: invokestatic 865	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1019: invokeinterface 871 3 0
    //   1024: pop
    //   1025: aload_1
    //   1026: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1029: invokevirtual 875	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1032: aload_1
    //   1033: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1036: sipush 217
    //   1039: new 228	java/lang/StringBuilder
    //   1042: dup
    //   1043: ldc_w 1354
    //   1046: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1049: iconst_1
    //   1050: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1053: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1056: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1059: goto -808 -> 251
    //   1062: astore_2
    //   1063: iconst_2
    //   1064: istore 4
    //   1066: aload 12
    //   1068: astore 11
    //   1070: getstatic 45	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1073: invokeinterface 491 1 0
    //   1078: aload_0
    //   1079: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   1082: iload 4
    //   1084: ifne +107 -> 1191
    //   1087: ldc 125
    //   1089: ldc_w 1338
    //   1092: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1095: aload_1
    //   1096: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1099: ldc -91
    //   1101: iconst_0
    //   1102: invokevirtual 168	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   1105: aload_1
    //   1106: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1109: sipush 64992
    //   1112: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1115: aload_1
    //   1116: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1119: iconst_0
    //   1120: iconst_m1
    //   1121: invokevirtual 171	com/tencent/smtt/sdk/ai:b	(II)V
    //   1124: aload_1
    //   1125: invokestatic 156	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1128: iconst_1
    //   1129: invokevirtual 178	com/tencent/smtt/sdk/ai:c	(I)V
    //   1132: aload 11
    //   1134: ldc_w 1340
    //   1137: invokevirtual 1321	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1140: astore 10
    //   1142: new 296	java/io/File
    //   1145: dup
    //   1146: aload 10
    //   1148: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   1151: aload_1
    //   1152: invokestatic 626	com/tencent/smtt/sdk/ag:a	(Ljava/io/File;Landroid/content/Context;)V
    //   1155: aload_0
    //   1156: aload_1
    //   1157: aload 10
    //   1159: aload 11
    //   1161: ldc_w 1342
    //   1164: invokevirtual 1336	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   1167: invokespecial 694	com/tencent/smtt/sdk/an:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   1170: iconst_0
    //   1171: invokestatic 1312	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   1174: aload_2
    //   1175: athrow
    //   1176: aload_1
    //   1177: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1180: sipush 64989
    //   1183: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1186: aload_0
    //   1187: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   1190: return
    //   1191: iload 4
    //   1193: iconst_2
    //   1194: if_icmpne +14 -> 1208
    //   1197: ldc 125
    //   1199: ldc_w 1314
    //   1202: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1205: goto -35 -> 1170
    //   1208: aload_1
    //   1209: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1212: sipush 64990
    //   1215: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1218: ldc 125
    //   1220: ldc_w 1352
    //   1223: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1226: aload_1
    //   1227: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1230: getfield 858	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1233: ldc_w 860
    //   1236: iconst_1
    //   1237: invokestatic 865	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1240: invokeinterface 871 3 0
    //   1245: pop
    //   1246: aload_1
    //   1247: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1250: invokevirtual 875	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1253: aload_1
    //   1254: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1257: sipush 217
    //   1260: new 228	java/lang/StringBuilder
    //   1263: dup
    //   1264: ldc_w 1354
    //   1267: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1270: iload 4
    //   1272: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1275: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1278: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1281: goto -111 -> 1170
    //   1284: iload_3
    //   1285: iconst_2
    //   1286: if_icmpne +14 -> 1300
    //   1289: ldc 125
    //   1291: ldc_w 1314
    //   1294: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1297: goto -1046 -> 251
    //   1300: aload_1
    //   1301: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1304: sipush 64990
    //   1307: invokevirtual 433	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1310: ldc 125
    //   1312: ldc_w 1352
    //   1315: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1318: aload_1
    //   1319: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1322: getfield 858	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1325: ldc_w 860
    //   1328: iconst_1
    //   1329: invokestatic 865	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1332: invokeinterface 871 3 0
    //   1337: pop
    //   1338: aload_1
    //   1339: invokestatic 184	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1342: invokevirtual 875	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1345: aload_1
    //   1346: invokestatic 252	com/tencent/smtt/sdk/TbsLogReport:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1349: sipush 217
    //   1352: new 228	java/lang/StringBuilder
    //   1355: dup
    //   1356: ldc_w 1354
    //   1359: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1362: iload_3
    //   1363: invokevirtual 236	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1366: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1369: invokevirtual 258	com/tencent/smtt/sdk/TbsLogReport:a	(ILjava/lang/String;)V
    //   1372: goto -1121 -> 251
    //   1375: astore_2
    //   1376: iconst_1
    //   1377: istore 4
    //   1379: goto -309 -> 1070
    //   1382: astore_2
    //   1383: goto -313 -> 1070
    //   1386: astore_2
    //   1387: iconst_2
    //   1388: istore_3
    //   1389: aload 11
    //   1391: astore 10
    //   1393: goto -482 -> 911
    //   1396: astore_2
    //   1397: iconst_1
    //   1398: istore_3
    //   1399: goto -488 -> 911
    //   1402: iconst_2
    //   1403: istore_3
    //   1404: aload 14
    //   1406: astore 10
    //   1408: goto -667 -> 741
    //   1411: iconst_1
    //   1412: istore_3
    //   1413: goto -1110 -> 303
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1416	0	this	an
    //   0	1416	1	paramContext	Context
    //   0	1416	2	paramBundle	Bundle
    //   303	1110	3	i1	int
    //   280	1098	4	i2	int
    //   45	29	5	l1	long
    //   54	31	7	l2	long
    //   133	26	9	bool	boolean
    //   164	1243	10	localObject1	Object
    //   178	1212	11	localObject2	Object
    //   174	893	12	localObject3	Object
    //   167	520	13	localObject4	Object
    //   170	1235	14	str	String
    //   383	268	15	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   864	907	910	java/lang/Exception
    //   180	184	1062	finally
    //   192	200	1062	finally
    //   208	219	1062	finally
    //   227	231	1062	finally
    //   264	282	1062	finally
    //   320	330	1062	finally
    //   343	351	1062	finally
    //   359	368	1062	finally
    //   376	385	1062	finally
    //   393	401	1062	finally
    //   409	417	1062	finally
    //   425	437	1062	finally
    //   445	453	1062	finally
    //   461	473	1062	finally
    //   481	488	1062	finally
    //   496	507	1062	finally
    //   515	535	1062	finally
    //   543	550	1062	finally
    //   558	571	1062	finally
    //   607	619	1062	finally
    //   627	633	1062	finally
    //   646	664	1062	finally
    //   672	682	1062	finally
    //   690	697	1062	finally
    //   848	857	1062	finally
    //   706	739	1375	finally
    //   947	957	1375	finally
    //   961	975	1375	finally
    //   864	907	1382	finally
    //   918	943	1382	finally
    //   180	184	1386	java/lang/Exception
    //   192	200	1386	java/lang/Exception
    //   208	219	1386	java/lang/Exception
    //   227	231	1386	java/lang/Exception
    //   264	282	1386	java/lang/Exception
    //   320	330	1386	java/lang/Exception
    //   343	351	1386	java/lang/Exception
    //   359	368	1386	java/lang/Exception
    //   376	385	1386	java/lang/Exception
    //   393	401	1386	java/lang/Exception
    //   409	417	1386	java/lang/Exception
    //   425	437	1386	java/lang/Exception
    //   445	453	1386	java/lang/Exception
    //   461	473	1386	java/lang/Exception
    //   481	488	1386	java/lang/Exception
    //   496	507	1386	java/lang/Exception
    //   515	535	1386	java/lang/Exception
    //   543	550	1386	java/lang/Exception
    //   558	571	1386	java/lang/Exception
    //   607	619	1386	java/lang/Exception
    //   627	633	1386	java/lang/Exception
    //   646	664	1386	java/lang/Exception
    //   672	682	1386	java/lang/Exception
    //   690	697	1386	java/lang/Exception
    //   848	857	1386	java/lang/Exception
    //   706	739	1396	java/lang/Exception
  }
  
  void b(Context paramContext, boolean paramBoolean)
  {
    if (QbSdk.b) {}
    do
    {
      return;
      if (Build.VERSION.SDK_INT < 8)
      {
        TbsLog.e("TbsInstaller", "android version < 2.1 no need install X5 core", true);
        return;
      }
      try
      {
        if (!TbsShareManager.isThirdPartyApp(paramContext))
        {
          File localFile = u(paramContext);
          if ((localFile != null) && (localFile.exists()))
          {
            j.a(localFile, false);
            new File(s(paramContext), "x5.tbs").delete();
          }
        }
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
    } while (!x(paramContext));
    if ((d(paramContext, "core_unzip_tmp")) && (d(paramContext, paramBoolean)))
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromUnzip!!", true);
      return;
    }
    if ((d(paramContext, "core_share_backup_tmp")) && (e(paramContext, paramBoolean)))
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromBackup!!", true);
      return;
    }
    if ((d(paramContext, "core_copy_tmp")) && (c(paramContext, paramBoolean)))
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromCopy!!", true);
      return;
    }
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, error !!", true);
  }
  
  /* Error */
  public String c(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aload_2
    //   7: invokestatic 986	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   10: ifeq +8 -> 18
    //   13: aload 6
    //   15: astore_2
    //   16: aload_2
    //   17: areturn
    //   18: new 296	java/io/File
    //   21: dup
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 284	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   27: ldc_w 351
    //   30: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   33: astore 4
    //   35: aload 4
    //   37: invokevirtual 561	java/io/File:exists	()Z
    //   40: istore_3
    //   41: iload_3
    //   42: ifne +24 -> 66
    //   45: aload 6
    //   47: astore_2
    //   48: iconst_0
    //   49: ifeq -33 -> 16
    //   52: aload 5
    //   54: astore_2
    //   55: new 1172	java/lang/NullPointerException
    //   58: dup
    //   59: invokespecial 1173	java/lang/NullPointerException:<init>	()V
    //   62: athrow
    //   63: astore_1
    //   64: aload_2
    //   65: areturn
    //   66: new 353	java/util/Properties
    //   69: dup
    //   70: invokespecial 354	java/util/Properties:<init>	()V
    //   73: astore_1
    //   74: new 356	java/io/BufferedInputStream
    //   77: dup
    //   78: new 358	java/io/FileInputStream
    //   81: dup
    //   82: aload 4
    //   84: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   87: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   90: astore 4
    //   92: aload_1
    //   93: aload 4
    //   95: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   98: aload 4
    //   100: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   103: aload_1
    //   104: aload_2
    //   105: invokevirtual 1176	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   108: astore_1
    //   109: aload_1
    //   110: astore_2
    //   111: aload 4
    //   113: ifnull -97 -> 16
    //   116: aload_1
    //   117: astore_2
    //   118: aload 4
    //   120: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   123: aload_1
    //   124: areturn
    //   125: astore_1
    //   126: aconst_null
    //   127: astore_2
    //   128: aload_2
    //   129: ifnull +7 -> 136
    //   132: aload_2
    //   133: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   136: aload_1
    //   137: athrow
    //   138: astore_1
    //   139: aconst_null
    //   140: astore 4
    //   142: aload 6
    //   144: astore_2
    //   145: aload 4
    //   147: ifnull -131 -> 16
    //   150: aload 5
    //   152: astore_2
    //   153: aload 4
    //   155: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   158: aconst_null
    //   159: areturn
    //   160: astore_2
    //   161: goto -25 -> 136
    //   164: astore_1
    //   165: aload 4
    //   167: astore_2
    //   168: goto -40 -> 128
    //   171: astore_1
    //   172: goto -30 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	an
    //   0	175	1	paramContext	Context
    //   0	175	2	paramString	String
    //   40	2	3	bool	boolean
    //   33	133	4	localObject1	Object
    //   1	150	5	localObject2	Object
    //   4	139	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   55	63	63	java/io/IOException
    //   118	123	63	java/io/IOException
    //   153	158	63	java/io/IOException
    //   18	41	125	finally
    //   66	92	125	finally
    //   18	41	138	java/lang/Exception
    //   66	92	138	java/lang/Exception
    //   132	136	160	java/io/IOException
    //   92	109	164	finally
    //   92	109	171	java/lang/Exception
  }
  
  /* Error */
  boolean c(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: new 296	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 284	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   11: ldc_w 351
    //   14: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   17: astore 5
    //   19: aload 5
    //   21: invokevirtual 561	java/io/File:exists	()Z
    //   24: ifne +5 -> 29
    //   27: iconst_0
    //   28: ireturn
    //   29: new 353	java/util/Properties
    //   32: dup
    //   33: invokespecial 354	java/util/Properties:<init>	()V
    //   36: astore 6
    //   38: new 356	java/io/BufferedInputStream
    //   41: dup
    //   42: new 358	java/io/FileInputStream
    //   45: dup
    //   46: aload 5
    //   48: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   51: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   54: astore_1
    //   55: aload 6
    //   57: aload_1
    //   58: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   61: aload 6
    //   63: ldc_w 377
    //   66: ldc_w 1373
    //   69: invokevirtual 594	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   72: invokestatic 1376	java/lang/Boolean:valueOf	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   75: invokevirtual 890	java/lang/Boolean:booleanValue	()Z
    //   78: istore 4
    //   80: iload 4
    //   82: ifeq +153 -> 235
    //   85: invokestatic 541	java/lang/System:currentTimeMillis	()J
    //   88: aload 5
    //   90: invokevirtual 1379	java/io/File:lastModified	()J
    //   93: lsub
    //   94: ldc2_w 1380
    //   97: lcmp
    //   98: ifle +55 -> 153
    //   101: iconst_1
    //   102: istore_3
    //   103: ldc 125
    //   105: new 228	java/lang/StringBuilder
    //   108: dup
    //   109: ldc_w 1383
    //   112: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: iload 4
    //   117: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   120: ldc_w 1385
    //   123: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: iload_3
    //   127: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   130: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: iload_3
    //   137: ifne +21 -> 158
    //   140: iload 4
    //   142: iload_2
    //   143: iand
    //   144: istore 4
    //   146: aload_1
    //   147: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   150: iload 4
    //   152: ireturn
    //   153: iconst_0
    //   154: istore_3
    //   155: goto -52 -> 103
    //   158: iconst_0
    //   159: istore_2
    //   160: goto -20 -> 140
    //   163: astore_1
    //   164: aconst_null
    //   165: astore_1
    //   166: iconst_0
    //   167: istore_3
    //   168: iload_3
    //   169: istore 4
    //   171: aload_1
    //   172: ifnull -22 -> 150
    //   175: aload_1
    //   176: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   179: iload_3
    //   180: istore 4
    //   182: goto -32 -> 150
    //   185: astore_1
    //   186: iload_3
    //   187: istore 4
    //   189: goto -39 -> 150
    //   192: astore 5
    //   194: aconst_null
    //   195: astore_1
    //   196: aload_1
    //   197: ifnull +7 -> 204
    //   200: aload_1
    //   201: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   204: aload 5
    //   206: athrow
    //   207: astore_1
    //   208: goto -58 -> 150
    //   211: astore_1
    //   212: goto -8 -> 204
    //   215: astore 5
    //   217: goto -21 -> 196
    //   220: astore 5
    //   222: iconst_0
    //   223: istore_3
    //   224: goto -56 -> 168
    //   227: astore 5
    //   229: iload 4
    //   231: istore_3
    //   232: goto -64 -> 168
    //   235: iconst_0
    //   236: istore_3
    //   237: goto -134 -> 103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	an
    //   0	240	1	paramContext	Context
    //   1	159	2	bool1	boolean
    //   102	135	3	bool2	boolean
    //   78	152	4	bool3	boolean
    //   17	72	5	localFile	File
    //   192	13	5	localObject1	Object
    //   215	1	5	localObject2	Object
    //   220	1	5	localThrowable1	Throwable
    //   227	1	5	localThrowable2	Throwable
    //   36	26	6	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   38	55	163	java/lang/Throwable
    //   175	179	185	java/io/IOException
    //   38	55	192	finally
    //   146	150	207	java/io/IOException
    //   200	204	211	java/io/IOException
    //   55	80	215	finally
    //   85	101	215	finally
    //   103	136	215	finally
    //   55	80	220	java/lang/Throwable
    //   85	101	227	java/lang/Throwable
    //   103	136	227	java/lang/Throwable
  }
  
  boolean c(Context paramContext, int paramInt)
  {
    for (;;)
    {
      boolean bool;
      int i1;
      try
      {
        bool = TbsShareManager.isThirdPartyApp(paramContext);
        if (bool)
        {
          if (TbsShareManager.j(paramContext))
          {
            localFile = new File(TbsShareManager.c(paramContext));
            if (!localFile.getAbsolutePath().contains("com.tencent.tbs")) {
              break label276;
            }
            return true;
          }
          TbsLog.e("TbsInstaller", "321");
          return false;
        }
        File localFile = q(paramContext);
        if (localFile == null) {
          break label266;
        }
        Long[][] arrayOfLong1 = n;
        int i2 = arrayOfLong1.length;
        i1 = 0;
        if (i1 >= i2) {
          break label279;
        }
        Long[] arrayOfLong = arrayOfLong1[i1];
        if (paramInt != arrayOfLong[0].intValue()) {
          break label281;
        }
        localFile = new File(localFile, "libmttwebview.so");
        if ((localFile.exists()) && (localFile.length() == arrayOfLong[1].longValue()))
        {
          TbsLog.d("TbsInstaller", "check so success: " + paramInt + "; file: " + localFile);
          return true;
        }
      }
      catch (Throwable paramContext)
      {
        TbsLog.e("TbsInstaller", "ISTBSCORELEGAL exception getMessage is " + paramContext.getMessage());
        TbsLog.e("TbsInstaller", "ISTBSCORELEGAL exception getCause is " + paramContext.getCause());
        return false;
      }
      if (!bool) {
        j.b(paramContext.getDir("tbs", 0));
      }
      a.set(Integer.valueOf(0));
      TbsLog.e("TbsInstaller", "322");
      return false;
      label266:
      TbsLog.e("TbsInstaller", "323");
      return false;
      label276:
      continue;
      label279:
      return true;
      label281:
      i1 += 1;
    }
  }
  
  /* Error */
  public void d(Context paramContext)
  {
    // Byte code:
    //   0: new 296	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual 284	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   9: ldc_w 351
    //   12: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   15: astore_1
    //   16: new 353	java/util/Properties
    //   19: dup
    //   20: invokespecial 354	java/util/Properties:<init>	()V
    //   23: astore_3
    //   24: new 356	java/io/BufferedInputStream
    //   27: dup
    //   28: new 358	java/io/FileInputStream
    //   31: dup
    //   32: aload_1
    //   33: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   36: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_2
    //   40: aload_3
    //   41: aload_2
    //   42: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   45: new 369	java/io/BufferedOutputStream
    //   48: dup
    //   49: new 371	java/io/FileOutputStream
    //   52: dup
    //   53: aload_1
    //   54: invokespecial 372	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   57: invokespecial 375	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   60: astore_1
    //   61: aload_3
    //   62: ldc_w 377
    //   65: ldc_w 1373
    //   68: invokevirtual 383	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   71: pop
    //   72: aload_3
    //   73: aload_1
    //   74: aconst_null
    //   75: invokevirtual 387	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   78: aload_1
    //   79: invokevirtual 392	java/io/BufferedOutputStream:close	()V
    //   82: aload_2
    //   83: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   86: return
    //   87: astore_1
    //   88: aconst_null
    //   89: astore_1
    //   90: aconst_null
    //   91: astore_2
    //   92: aload_1
    //   93: ifnull +7 -> 100
    //   96: aload_1
    //   97: invokevirtual 392	java/io/BufferedOutputStream:close	()V
    //   100: aload_2
    //   101: ifnull -15 -> 86
    //   104: aload_2
    //   105: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   108: return
    //   109: astore_1
    //   110: return
    //   111: astore_1
    //   112: aconst_null
    //   113: astore_2
    //   114: aconst_null
    //   115: astore_3
    //   116: aload_2
    //   117: ifnull +7 -> 124
    //   120: aload_2
    //   121: invokevirtual 392	java/io/BufferedOutputStream:close	()V
    //   124: aload_3
    //   125: ifnull +7 -> 132
    //   128: aload_3
    //   129: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   132: aload_1
    //   133: athrow
    //   134: astore_1
    //   135: return
    //   136: astore_1
    //   137: goto -55 -> 82
    //   140: astore_1
    //   141: return
    //   142: astore_1
    //   143: goto -43 -> 100
    //   146: astore_2
    //   147: goto -23 -> 124
    //   150: astore_2
    //   151: goto -19 -> 132
    //   154: astore_1
    //   155: aconst_null
    //   156: astore 4
    //   158: aload_2
    //   159: astore_3
    //   160: aload 4
    //   162: astore_2
    //   163: goto -47 -> 116
    //   166: astore 4
    //   168: aload_1
    //   169: astore 5
    //   171: aload_2
    //   172: astore_3
    //   173: aload 4
    //   175: astore_1
    //   176: aload 5
    //   178: astore_2
    //   179: goto -63 -> 116
    //   182: astore_1
    //   183: aconst_null
    //   184: astore_1
    //   185: goto -93 -> 92
    //   188: astore_3
    //   189: goto -97 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	this	an
    //   0	192	1	paramContext	Context
    //   39	82	2	localBufferedInputStream	java.io.BufferedInputStream
    //   146	1	2	localIOException1	java.io.IOException
    //   150	9	2	localIOException2	java.io.IOException
    //   162	17	2	localObject1	Object
    //   23	150	3	localObject2	Object
    //   188	1	3	localThrowable	Throwable
    //   156	5	4	localObject3	Object
    //   166	8	4	localObject4	Object
    //   169	8	5	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   24	40	87	java/lang/Throwable
    //   104	108	109	java/io/IOException
    //   24	40	111	finally
    //   0	24	134	java/lang/Throwable
    //   78	82	134	java/lang/Throwable
    //   82	86	134	java/lang/Throwable
    //   96	100	134	java/lang/Throwable
    //   104	108	134	java/lang/Throwable
    //   120	124	134	java/lang/Throwable
    //   128	132	134	java/lang/Throwable
    //   132	134	134	java/lang/Throwable
    //   78	82	136	java/io/IOException
    //   82	86	140	java/io/IOException
    //   96	100	142	java/io/IOException
    //   120	124	146	java/io/IOException
    //   128	132	150	java/io/IOException
    //   40	61	154	finally
    //   61	78	166	finally
    //   40	61	182	java/lang/Throwable
    //   61	78	188	java/lang/Throwable
  }
  
  public boolean e(Context paramContext)
  {
    for (;;)
    {
      int i1;
      try
      {
        Object localObject = new File(j.a(paramContext, 4), "x5.tbs.decouple");
        File localFile1 = a().u(paramContext);
        j.a(localFile1);
        j.a(localFile1, true);
        j.a((File)localObject, localFile1);
        localObject = localFile1.list();
        i1 = 0;
        if (i1 < localObject.length)
        {
          File localFile2 = new File(localFile1, localObject[i1]);
          if (localFile2.getName().endsWith(".dex")) {
            localFile2.delete();
          }
        }
        else
        {
          a().f(paramContext, true);
          localObject = p(paramContext);
          j.a((File)localObject, true);
          localFile1.renameTo((File)localObject);
          TbsShareManager.b(paramContext);
          return true;
        }
      }
      catch (Exception paramContext)
      {
        return false;
      }
      i1 += 1;
    }
  }
  
  boolean f(Context paramContext)
  {
    if (TbsShareManager.getHostCorePathAppDefined() != null) {}
    for (;;)
    {
      return true;
      try
      {
        Signature localSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0];
        if (paramContext.getPackageName().equals("com.tencent.mtt"))
        {
          if (!localSignature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.mm"))
        {
          if (!localSignature.toCharsString().equals("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.mobileqq"))
        {
          if (!localSignature.toCharsString().equals("30820253308201bca00302010202044bbb0361300d06092a864886f70d0101050500306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b30090603550403130251513020170d3130303430363039343831375a180f32323834303132303039343831375a306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b300906035504031302515130819f300d06092a864886f70d010101050003818d0030818902818100a15e9756216f694c5915e0b529095254367c4e64faeff07ae13488d946615a58ddc31a415f717d019edc6d30b9603d3e2a7b3de0ab7e0cf52dfee39373bc472fa997027d798d59f81d525a69ecf156e885fd1e2790924386b2230cc90e3b7adc95603ddcf4c40bdc72f22db0f216a99c371d3bf89cba6578c60699e8a0d536950203010001300d06092a864886f70d01010505000381810094a9b80e80691645dd42d6611775a855f71bcd4d77cb60a8e29404035a5e00b21bcc5d4a562482126bd91b6b0e50709377ceb9ef8c2efd12cc8b16afd9a159f350bb270b14204ff065d843832720702e28b41491fbc3a205f5f2f42526d67f17614d8a974de6487b2c866efede3b4e49a0f916baa3c1336fd2ee1b1629652049")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.tbs"))
        {
          if (!localSignature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.qzone"))
        {
          if (!localSignature.toCharsString().equals("308202ad30820216a00302010202044c26cea2300d06092a864886f70d010105050030819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d301e170d3130303632373034303830325a170d3335303632313034303830325a30819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d30819f300d06092a864886f70d010101050003818d003081890281810082d6aca037a9843fbbe88b6dd19f36e9c24ce174c1b398f3a529e2a7fe02de99c27539602c026edf96ad8d43df32a85458bca1e6fbf11958658a7d6751a1d9b782bf43a8c19bd1c06bdbfd94c0516326ae3cf638ac42bb470580e340c46e6f306a772c1ef98f10a559edf867f3f31fe492808776b7bd953b2cba2d2b2d66a44f0203010001300d06092a864886f70d0101050500038181006003b04a8a8c5be9650f350cda6896e57dd13e6e83e7f891fc70f6a3c2eaf75cfa4fc998365deabbd1b9092159edf4b90df5702a0d101f8840b5d4586eb92a1c3cd19d95fbc1c2ac956309eda8eef3944baf08c4a49d3b9b3ffb06bc13dab94ecb5b8eb74e8789aa0ba21cb567f538bbc59c2a11e6919924a24272eb79251677")) {
            return false;
          }
        }
        else if (paramContext.getPackageName().equals("com.tencent.qqpimsecure"))
        {
          boolean bool = localSignature.toCharsString().equals("30820239308201a2a00302010202044c96f48f300d06092a864886f70d01010505003060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e57753020170d3130303932303035343334335a180f32303635303632333035343334335a3060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e577530819f300d06092a864886f70d010101050003818d0030818902818100b56e79dbb1185a79e52d792bb3d0bb3da8010d9b87da92ec69f7dc5ad66ab6bfdff2a6a1ed285dd2358f28b72a468be7c10a2ce30c4c27323ed4edcc936080e5bedc2cbbca0b7e879c08a631182793f44bb3ea284179b263410c298e5f6831032c9702ba4a74e2ccfc9ef857f12201451602fc8e774ac59d6398511586c83d1d0203010001300d06092a864886f70d0101050500038181002475615bb65b8d8786b890535802948840387d06b1692ff3ea47ef4c435719ba1865b81e6bfa6293ce31747c3cd6b34595b485cc1563fd90107ba5845c28b95c79138f0dec288940395bc10f92f2b69d8dc410999deb38900974ce9984b678030edfba8816582f56160d87e38641288d8588d2a31e20b89f223d788dd35cc9c8");
          if (!bool) {
            return false;
          }
        }
      }
      catch (Exception paramContext)
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore getPackageInfo fail");
      }
    }
    return false;
  }
  
  /* Error */
  int g(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 6
    //   7: aload_0
    //   8: aload_1
    //   9: invokevirtual 294	com/tencent/smtt/sdk/an:t	(Landroid/content/Context;)Ljava/io/File;
    //   12: astore_1
    //   13: ldc 125
    //   15: new 228	java/lang/StringBuilder
    //   18: dup
    //   19: ldc_w 1459
    //   22: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: new 296	java/io/File
    //   38: dup
    //   39: aload_1
    //   40: ldc_w 351
    //   43: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   46: astore_1
    //   47: aload_1
    //   48: invokevirtual 561	java/io/File:exists	()Z
    //   51: istore 5
    //   53: iload 5
    //   55: ifne +19 -> 74
    //   58: iconst_0
    //   59: ifeq +13 -> 72
    //   62: iload_2
    //   63: istore_3
    //   64: new 1172	java/lang/NullPointerException
    //   67: dup
    //   68: invokespecial 1173	java/lang/NullPointerException:<init>	()V
    //   71: athrow
    //   72: iload_3
    //   73: ireturn
    //   74: new 353	java/util/Properties
    //   77: dup
    //   78: invokespecial 354	java/util/Properties:<init>	()V
    //   81: astore 7
    //   83: new 356	java/io/BufferedInputStream
    //   86: dup
    //   87: new 358	java/io/FileInputStream
    //   90: dup
    //   91: aload_1
    //   92: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   95: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   98: astore_1
    //   99: aload 7
    //   101: aload_1
    //   102: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   105: aload_1
    //   106: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   109: aload 7
    //   111: ldc_w 1175
    //   114: invokevirtual 1176	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   117: astore 6
    //   119: aload 6
    //   121: ifnonnull +18 -> 139
    //   124: aload_1
    //   125: ifnull -53 -> 72
    //   128: iload_2
    //   129: istore_3
    //   130: aload_1
    //   131: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   134: iconst_0
    //   135: ireturn
    //   136: astore_1
    //   137: iload_3
    //   138: ireturn
    //   139: aload 6
    //   141: invokestatic 1179	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   144: istore 4
    //   146: iload 4
    //   148: istore_2
    //   149: iload_2
    //   150: istore_3
    //   151: aload_1
    //   152: ifnull -80 -> 72
    //   155: iload_2
    //   156: istore_3
    //   157: aload_1
    //   158: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   161: iload_2
    //   162: ireturn
    //   163: astore_1
    //   164: aload 6
    //   166: ifnull +8 -> 174
    //   169: aload 6
    //   171: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   174: aload_1
    //   175: athrow
    //   176: astore_1
    //   177: aconst_null
    //   178: astore_1
    //   179: aload_1
    //   180: ifnull -108 -> 72
    //   183: iload_2
    //   184: istore_3
    //   185: aload_1
    //   186: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   189: iconst_0
    //   190: ireturn
    //   191: astore 6
    //   193: goto -19 -> 174
    //   196: astore 7
    //   198: aload_1
    //   199: astore 6
    //   201: aload 7
    //   203: astore_1
    //   204: goto -40 -> 164
    //   207: astore 6
    //   209: goto -30 -> 179
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	an
    //   0	212	1	paramContext	Context
    //   1	183	2	i1	int
    //   3	182	3	i2	int
    //   144	3	4	i3	int
    //   51	3	5	bool	boolean
    //   5	165	6	str	String
    //   191	1	6	localIOException	java.io.IOException
    //   199	1	6	localContext	Context
    //   207	1	6	localException	Exception
    //   81	29	7	localProperties	java.util.Properties
    //   196	6	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   64	72	136	java/io/IOException
    //   130	134	136	java/io/IOException
    //   157	161	136	java/io/IOException
    //   185	189	136	java/io/IOException
    //   7	53	163	finally
    //   74	99	163	finally
    //   7	53	176	java/lang/Exception
    //   74	99	176	java/lang/Exception
    //   169	174	191	java/io/IOException
    //   99	119	196	finally
    //   139	146	196	finally
    //   99	119	207	java/lang/Exception
    //   139	146	207	java/lang/Exception
  }
  
  /* Error */
  int h(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 6
    //   8: new 296	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual 531	com/tencent/smtt/sdk/an:p	(Landroid/content/Context;)Ljava/io/File;
    //   17: ldc_w 351
    //   20: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual 561	java/io/File:exists	()Z
    //   28: istore 5
    //   30: iload 5
    //   32: ifne +22 -> 54
    //   35: iload 4
    //   37: istore_3
    //   38: iconst_0
    //   39: ifeq +13 -> 52
    //   42: iload_2
    //   43: istore_3
    //   44: new 1172	java/lang/NullPointerException
    //   47: dup
    //   48: invokespecial 1173	java/lang/NullPointerException:<init>	()V
    //   51: athrow
    //   52: iload_3
    //   53: ireturn
    //   54: new 353	java/util/Properties
    //   57: dup
    //   58: invokespecial 354	java/util/Properties:<init>	()V
    //   61: astore 7
    //   63: new 356	java/io/BufferedInputStream
    //   66: dup
    //   67: new 358	java/io/FileInputStream
    //   70: dup
    //   71: aload_1
    //   72: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   75: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   78: astore_1
    //   79: aload 7
    //   81: aload_1
    //   82: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   85: aload_1
    //   86: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   89: aload 7
    //   91: ldc_w 1175
    //   94: invokevirtual 1176	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   97: astore 6
    //   99: aload 6
    //   101: ifnonnull +21 -> 122
    //   104: iload 4
    //   106: istore_3
    //   107: aload_1
    //   108: ifnull -56 -> 52
    //   111: iload_2
    //   112: istore_3
    //   113: aload_1
    //   114: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   117: iconst_0
    //   118: ireturn
    //   119: astore_1
    //   120: iload_3
    //   121: ireturn
    //   122: aload 6
    //   124: invokestatic 1179	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   127: istore_3
    //   128: iload_3
    //   129: istore_2
    //   130: iload_2
    //   131: istore_3
    //   132: aload_1
    //   133: ifnull -81 -> 52
    //   136: iload_2
    //   137: istore_3
    //   138: aload_1
    //   139: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   142: iload_2
    //   143: ireturn
    //   144: astore_1
    //   145: aload 6
    //   147: ifnull +8 -> 155
    //   150: aload 6
    //   152: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   155: aload_1
    //   156: athrow
    //   157: astore_1
    //   158: aconst_null
    //   159: astore_1
    //   160: iload 4
    //   162: istore_3
    //   163: aload_1
    //   164: ifnull -112 -> 52
    //   167: iload_2
    //   168: istore_3
    //   169: aload_1
    //   170: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   173: iconst_0
    //   174: ireturn
    //   175: astore 6
    //   177: goto -22 -> 155
    //   180: astore 7
    //   182: aload_1
    //   183: astore 6
    //   185: aload 7
    //   187: astore_1
    //   188: goto -43 -> 145
    //   191: astore 6
    //   193: goto -33 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	an
    //   0	196	1	paramContext	Context
    //   1	167	2	i1	int
    //   37	132	3	i2	int
    //   3	158	4	i3	int
    //   28	3	5	bool	boolean
    //   6	145	6	str	String
    //   175	1	6	localIOException	java.io.IOException
    //   183	1	6	localContext	Context
    //   191	1	6	localException	Exception
    //   61	29	7	localProperties	java.util.Properties
    //   180	6	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   44	52	119	java/io/IOException
    //   113	117	119	java/io/IOException
    //   138	142	119	java/io/IOException
    //   169	173	119	java/io/IOException
    //   8	30	144	finally
    //   54	79	144	finally
    //   8	30	157	java/lang/Exception
    //   54	79	157	java/lang/Exception
    //   150	155	175	java/io/IOException
    //   79	99	180	finally
    //   122	128	180	finally
    //   79	99	191	java/lang/Exception
    //   122	128	191	java/lang/Exception
  }
  
  /* Error */
  int i(Context paramContext)
  {
    // Byte code:
    //   0: new 296	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual 284	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   9: ldc_w 351
    //   12: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   15: astore_1
    //   16: aload_1
    //   17: invokevirtual 561	java/io/File:exists	()Z
    //   20: istore 4
    //   22: iload 4
    //   24: ifne +19 -> 43
    //   27: iconst_0
    //   28: ifeq +11 -> 39
    //   31: new 1172	java/lang/NullPointerException
    //   34: dup
    //   35: invokespecial 1173	java/lang/NullPointerException:<init>	()V
    //   38: athrow
    //   39: iconst_0
    //   40: istore_2
    //   41: iload_2
    //   42: ireturn
    //   43: new 353	java/util/Properties
    //   46: dup
    //   47: invokespecial 354	java/util/Properties:<init>	()V
    //   50: astore 6
    //   52: new 356	java/io/BufferedInputStream
    //   55: dup
    //   56: new 358	java/io/FileInputStream
    //   59: dup
    //   60: aload_1
    //   61: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   64: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   67: astore 5
    //   69: aload 5
    //   71: astore_1
    //   72: aload 6
    //   74: aload 5
    //   76: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   79: aload 5
    //   81: astore_1
    //   82: aload 5
    //   84: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   87: aload 5
    //   89: astore_1
    //   90: aload 6
    //   92: ldc_w 1175
    //   95: invokevirtual 1176	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   98: astore 6
    //   100: aload 6
    //   102: ifnonnull +15 -> 117
    //   105: aload 5
    //   107: ifnull +8 -> 115
    //   110: aload 5
    //   112: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   115: iconst_0
    //   116: ireturn
    //   117: aload 5
    //   119: astore_1
    //   120: aload 6
    //   122: invokestatic 1179	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   125: istore_3
    //   126: aload 5
    //   128: astore_1
    //   129: getstatic 95	com/tencent/smtt/sdk/an:o	I
    //   132: ifne +10 -> 142
    //   135: aload 5
    //   137: astore_1
    //   138: iload_3
    //   139: putstatic 95	com/tencent/smtt/sdk/an:o	I
    //   142: iload_3
    //   143: istore_2
    //   144: aload 5
    //   146: ifnull -105 -> 41
    //   149: aload 5
    //   151: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   154: iload_3
    //   155: ireturn
    //   156: astore_1
    //   157: ldc 125
    //   159: new 228	java/lang/StringBuilder
    //   162: dup
    //   163: ldc_w 1461
    //   166: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: aload_1
    //   170: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   173: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   182: iload_3
    //   183: ireturn
    //   184: astore 6
    //   186: aconst_null
    //   187: astore 5
    //   189: aload 5
    //   191: astore_1
    //   192: ldc 125
    //   194: new 228	java/lang/StringBuilder
    //   197: dup
    //   198: ldc_w 1464
    //   201: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   204: aload 6
    //   206: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   209: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   215: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   218: aload 5
    //   220: ifnull +8 -> 228
    //   223: aload 5
    //   225: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   228: iconst_0
    //   229: ireturn
    //   230: astore 5
    //   232: aconst_null
    //   233: astore_1
    //   234: aload_1
    //   235: ifnull +7 -> 242
    //   238: aload_1
    //   239: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   242: aload 5
    //   244: athrow
    //   245: astore_1
    //   246: ldc 125
    //   248: new 228	java/lang/StringBuilder
    //   251: dup
    //   252: ldc_w 1461
    //   255: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   258: aload_1
    //   259: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   262: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   268: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   271: goto -29 -> 242
    //   274: astore_1
    //   275: ldc 125
    //   277: new 228	java/lang/StringBuilder
    //   280: dup
    //   281: ldc_w 1461
    //   284: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   287: aload_1
    //   288: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   291: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   297: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   300: goto -72 -> 228
    //   303: astore_1
    //   304: ldc 125
    //   306: new 228	java/lang/StringBuilder
    //   309: dup
    //   310: ldc_w 1461
    //   313: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   316: aload_1
    //   317: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   320: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   329: goto -290 -> 39
    //   332: astore_1
    //   333: ldc 125
    //   335: new 228	java/lang/StringBuilder
    //   338: dup
    //   339: ldc_w 1461
    //   342: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   345: aload_1
    //   346: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   349: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   355: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   358: goto -243 -> 115
    //   361: astore 5
    //   363: goto -129 -> 234
    //   366: astore 6
    //   368: goto -179 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	371	0	this	an
    //   0	371	1	paramContext	Context
    //   40	104	2	i1	int
    //   125	58	3	i2	int
    //   20	3	4	bool	boolean
    //   67	157	5	localBufferedInputStream	java.io.BufferedInputStream
    //   230	13	5	localObject1	Object
    //   361	1	5	localObject2	Object
    //   50	71	6	localObject3	Object
    //   184	21	6	localException1	Exception
    //   366	1	6	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   149	154	156	java/io/IOException
    //   0	22	184	java/lang/Exception
    //   43	69	184	java/lang/Exception
    //   0	22	230	finally
    //   43	69	230	finally
    //   238	242	245	java/io/IOException
    //   223	228	274	java/io/IOException
    //   31	39	303	java/io/IOException
    //   110	115	332	java/io/IOException
    //   72	79	361	finally
    //   82	87	361	finally
    //   90	100	361	finally
    //   120	126	361	finally
    //   129	135	361	finally
    //   138	142	361	finally
    //   192	218	361	finally
    //   72	79	366	java/lang/Exception
    //   82	87	366	java/lang/Exception
    //   90	100	366	java/lang/Exception
    //   120	126	366	java/lang/Exception
    //   129	135	366	java/lang/Exception
    //   138	142	366	java/lang/Exception
  }
  
  int j(Context paramContext)
  {
    if (o != 0) {
      return o;
    }
    return i(paramContext);
  }
  
  void k(Context paramContext)
  {
    if (o != 0) {
      return;
    }
    o = i(paramContext);
  }
  
  boolean l(Context paramContext)
  {
    return new File(q(paramContext), "tbs.conf").exists();
  }
  
  /* Error */
  int m(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 457	com/tencent/smtt/sdk/an:w	(Landroid/content/Context;)Z
    //   5: ifne +5 -> 10
    //   8: iconst_m1
    //   9: ireturn
    //   10: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   13: invokevirtual 1031	java/util/concurrent/locks/ReentrantLock:tryLock	()Z
    //   16: istore_3
    //   17: ldc 125
    //   19: new 228	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 1466
    //   26: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: iload_3
    //   30: invokevirtual 467	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   33: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: iload_3
    //   40: ifeq +317 -> 357
    //   43: new 296	java/io/File
    //   46: dup
    //   47: aload_0
    //   48: aload_1
    //   49: invokevirtual 284	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   52: ldc_w 351
    //   55: invokespecial 346	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   58: astore_1
    //   59: aload_1
    //   60: invokevirtual 561	java/io/File:exists	()Z
    //   63: istore_3
    //   64: iload_3
    //   65: ifne +36 -> 101
    //   68: iconst_0
    //   69: ifeq +11 -> 80
    //   72: new 1172	java/lang/NullPointerException
    //   75: dup
    //   76: invokespecial 1173	java/lang/NullPointerException:<init>	()V
    //   79: athrow
    //   80: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   83: invokevirtual 1469	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   86: ifeq +9 -> 95
    //   89: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   92: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   95: aload_0
    //   96: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   99: iconst_0
    //   100: ireturn
    //   101: new 353	java/util/Properties
    //   104: dup
    //   105: invokespecial 354	java/util/Properties:<init>	()V
    //   108: astore 5
    //   110: new 356	java/io/BufferedInputStream
    //   113: dup
    //   114: new 358	java/io/FileInputStream
    //   117: dup
    //   118: aload_1
    //   119: invokespecial 361	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   122: invokespecial 364	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   125: astore 4
    //   127: aload 4
    //   129: astore_1
    //   130: aload 5
    //   132: aload 4
    //   134: invokevirtual 367	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   137: aload 4
    //   139: astore_1
    //   140: aload 4
    //   142: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   145: aload 4
    //   147: astore_1
    //   148: aload 5
    //   150: ldc_w 1175
    //   153: invokevirtual 1176	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   156: astore 5
    //   158: aload 5
    //   160: ifnonnull +34 -> 194
    //   163: aload 4
    //   165: ifnull +8 -> 173
    //   168: aload 4
    //   170: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   173: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   176: invokevirtual 1469	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   179: ifeq +9 -> 188
    //   182: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   185: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   188: aload_0
    //   189: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   192: iconst_0
    //   193: ireturn
    //   194: aload 4
    //   196: astore_1
    //   197: getstatic 52	com/tencent/smtt/sdk/an:a	Ljava/lang/ThreadLocal;
    //   200: aload 5
    //   202: invokestatic 1179	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   205: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   208: invokevirtual 223	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   211: aload 4
    //   213: astore_1
    //   214: getstatic 52	com/tencent/smtt/sdk/an:a	Ljava/lang/ThreadLocal;
    //   217: invokevirtual 1183	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   220: checkcast 214	java/lang/Integer
    //   223: invokevirtual 1186	java/lang/Integer:intValue	()I
    //   226: istore_2
    //   227: aload 4
    //   229: ifnull +8 -> 237
    //   232: aload 4
    //   234: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   237: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   240: invokevirtual 1469	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   243: ifeq +9 -> 252
    //   246: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   249: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   252: aload_0
    //   253: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   256: iload_2
    //   257: ireturn
    //   258: astore 5
    //   260: aconst_null
    //   261: astore 4
    //   263: aload 4
    //   265: astore_1
    //   266: ldc 125
    //   268: new 228	java/lang/StringBuilder
    //   271: dup
    //   272: ldc_w 1471
    //   275: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   278: aload 5
    //   280: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   283: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   289: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   292: aload 4
    //   294: ifnull +8 -> 302
    //   297: aload 4
    //   299: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   302: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   305: invokevirtual 1469	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   308: ifeq +9 -> 317
    //   311: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   314: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   317: aload_0
    //   318: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   321: iconst_0
    //   322: ireturn
    //   323: astore 4
    //   325: aconst_null
    //   326: astore_1
    //   327: aload_1
    //   328: ifnull +7 -> 335
    //   331: aload_1
    //   332: invokevirtual 393	java/io/BufferedInputStream:close	()V
    //   335: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   338: invokevirtual 1469	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   341: ifeq +9 -> 350
    //   344: getstatic 43	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   347: invokevirtual 490	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   350: aload_0
    //   351: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   354: aload 4
    //   356: athrow
    //   357: aload_0
    //   358: invokevirtual 493	com/tencent/smtt/sdk/an:b	()V
    //   361: iconst_0
    //   362: ireturn
    //   363: astore_1
    //   364: ldc 125
    //   366: new 228	java/lang/StringBuilder
    //   369: dup
    //   370: ldc_w 1473
    //   373: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   376: aload_1
    //   377: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   380: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   386: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   389: goto -54 -> 335
    //   392: astore_1
    //   393: ldc 125
    //   395: new 228	java/lang/StringBuilder
    //   398: dup
    //   399: ldc_w 1475
    //   402: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   405: aload_1
    //   406: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   409: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   412: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   415: goto -65 -> 350
    //   418: astore_1
    //   419: ldc 125
    //   421: new 228	java/lang/StringBuilder
    //   424: dup
    //   425: ldc_w 1473
    //   428: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   431: aload_1
    //   432: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   435: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   441: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   444: goto -142 -> 302
    //   447: astore_1
    //   448: ldc 125
    //   450: new 228	java/lang/StringBuilder
    //   453: dup
    //   454: ldc_w 1475
    //   457: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   460: aload_1
    //   461: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   464: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   467: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   470: goto -153 -> 317
    //   473: astore_1
    //   474: ldc 125
    //   476: new 228	java/lang/StringBuilder
    //   479: dup
    //   480: ldc_w 1473
    //   483: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   486: aload_1
    //   487: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   490: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   496: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   499: goto -419 -> 80
    //   502: astore_1
    //   503: ldc 125
    //   505: new 228	java/lang/StringBuilder
    //   508: dup
    //   509: ldc_w 1475
    //   512: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   515: aload_1
    //   516: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   519: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   522: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   525: goto -430 -> 95
    //   528: astore_1
    //   529: ldc 125
    //   531: new 228	java/lang/StringBuilder
    //   534: dup
    //   535: ldc_w 1473
    //   538: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   541: aload_1
    //   542: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   545: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   551: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   554: goto -381 -> 173
    //   557: astore_1
    //   558: ldc 125
    //   560: new 228	java/lang/StringBuilder
    //   563: dup
    //   564: ldc_w 1475
    //   567: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   570: aload_1
    //   571: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   574: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   577: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   580: goto -392 -> 188
    //   583: astore_1
    //   584: ldc 125
    //   586: new 228	java/lang/StringBuilder
    //   589: dup
    //   590: ldc_w 1473
    //   593: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   596: aload_1
    //   597: invokevirtual 1462	java/io/IOException:toString	()Ljava/lang/String;
    //   600: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   603: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   606: invokestatic 132	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   609: goto -372 -> 237
    //   612: astore_1
    //   613: ldc 125
    //   615: new 228	java/lang/StringBuilder
    //   618: dup
    //   619: ldc_w 1475
    //   622: invokespecial 232	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   625: aload_1
    //   626: invokevirtual 685	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   629: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   632: invokestatic 414	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   635: goto -383 -> 252
    //   638: astore 4
    //   640: goto -313 -> 327
    //   643: astore 5
    //   645: goto -382 -> 263
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	648	0	this	an
    //   0	648	1	paramContext	Context
    //   226	31	2	i1	int
    //   16	49	3	bool	boolean
    //   125	173	4	localBufferedInputStream	java.io.BufferedInputStream
    //   323	32	4	localObject1	Object
    //   638	1	4	localObject2	Object
    //   108	93	5	localObject3	Object
    //   258	21	5	localException1	Exception
    //   643	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   43	64	258	java/lang/Exception
    //   101	127	258	java/lang/Exception
    //   43	64	323	finally
    //   101	127	323	finally
    //   331	335	363	java/io/IOException
    //   335	350	392	java/lang/Throwable
    //   297	302	418	java/io/IOException
    //   302	317	447	java/lang/Throwable
    //   72	80	473	java/io/IOException
    //   80	95	502	java/lang/Throwable
    //   168	173	528	java/io/IOException
    //   173	188	557	java/lang/Throwable
    //   232	237	583	java/io/IOException
    //   237	252	612	java/lang/Throwable
    //   130	137	638	finally
    //   140	145	638	finally
    //   148	158	638	finally
    //   197	211	638	finally
    //   214	227	638	finally
    //   266	292	638	finally
    //   130	137	643	java/lang/Exception
    //   140	145	643	java/lang/Exception
    //   148	158	643	java/lang/Exception
    //   197	211	643	java/lang/Exception
    //   214	227	643	java/lang/Exception
  }
  
  public boolean n(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple #0");
    File localFile1 = q(paramContext);
    File localFile2 = p(paramContext);
    try
    {
      j.a(localFile2, true);
      j.a(localFile1, localFile2, new au(this));
      TbsShareManager.b(paramContext);
      TbsLog.i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple success!!!");
      return true;
    }
    catch (Exception paramContext) {}
    return false;
  }
  
  void o(Context paramContext)
  {
    TbsLog.i("TbsInstaller", "TbsInstaller--cleanStatusAndTmpDir");
    ai.a(paramContext).a(0);
    ai.a(paramContext).b(0);
    ai.a(paramContext).d(0);
    ai.a(paramContext).a("incrupdate_retry_num", 0);
    if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) != 1)
    {
      ai.a(paramContext).b(0, -1);
      ai.a(paramContext).a("");
      ai.a(paramContext).a("copy_retry_num", 0);
      ai.a(paramContext).c(-1);
      ai.a(paramContext).a(0, -1);
      j.a(t(paramContext), true);
      j.a(v(paramContext), true);
    }
  }
  
  File p(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_share_decouple");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  File q(Context paramContext)
  {
    return b(null, paramContext);
  }
  
  File r(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "share");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  File t(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_unzip_tmp");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  File u(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_unzip_tmp_decouple");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  File v(Context paramContext)
  {
    File localFile = new File(paramContext.getDir("tbs", 0), "core_copy_tmp");
    paramContext = localFile;
    if (!localFile.isDirectory())
    {
      paramContext = localFile;
      if (!localFile.mkdir()) {
        paramContext = null;
      }
    }
    return paramContext;
  }
  
  boolean w(Context paramContext)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        this.e += 1;
        if (this.h)
        {
          TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= true");
          return bool;
        }
        this.g = j.b(paramContext, true, "tbslock.txt");
        if (this.g != null)
        {
          this.f = j.a(paramContext, this.g);
          if (this.f == null)
          {
            bool = false;
          }
          else
          {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= false");
            this.h = true;
          }
        }
        else
        {
          bool = false;
        }
      }
      finally {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
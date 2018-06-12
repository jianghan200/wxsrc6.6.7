package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class b
{
  public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
  public static final String KEY_CALLER_UID;
  private static final ComponentName aIA = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  private static final ComponentName aIB = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    KEY_CALLER_UID = "callerUid";
    i = Build.VERSION.SDK_INT;
  }
  
  /* Error */
  private static Bundle a(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 59	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 6
    //   6: ldc 61
    //   8: invokestatic 67	com/google/android/gms/common/internal/w:bi	(Ljava/lang/String;)V
    //   11: aload 6
    //   13: invokestatic 73	com/google/android/gms/common/e:ag	(Landroid/content/Context;)V
    //   16: new 75	android/os/Bundle
    //   19: dup
    //   20: aload_3
    //   21: invokespecial 78	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   24: astore 7
    //   26: aload_0
    //   27: invokevirtual 82	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   30: getfield 87	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   33: astore_0
    //   34: aload 7
    //   36: ldc 89
    //   38: aload_0
    //   39: invokevirtual 92	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: aload 7
    //   44: getstatic 26	com/google/android/gms/auth/b:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   47: invokevirtual 96	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   50: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   53: ifeq +12 -> 65
    //   56: aload 7
    //   58: getstatic 26	com/google/android/gms/auth/b:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   61: aload_0
    //   62: invokevirtual 92	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: new 104	com/google/android/gms/common/h
    //   68: dup
    //   69: invokespecial 106	com/google/android/gms/common/h:<init>	()V
    //   72: astore_0
    //   73: aload 6
    //   75: invokestatic 112	com/google/android/gms/common/internal/m:aj	(Landroid/content/Context;)Lcom/google/android/gms/common/internal/m;
    //   78: astore_3
    //   79: aload_3
    //   80: getstatic 38	com/google/android/gms/auth/b:aIA	Landroid/content/ComponentName;
    //   83: aload_0
    //   84: ldc 114
    //   86: invokevirtual 117	com/google/android/gms/common/internal/m:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   89: ifeq +382 -> 471
    //   92: aload_0
    //   93: invokevirtual 121	com/google/android/gms/common/h:pI	()Landroid/os/IBinder;
    //   96: invokestatic 127	com/google/android/gms/c/c$a:m	(Landroid/os/IBinder;)Lcom/google/android/gms/c/c;
    //   99: aload_1
    //   100: aload_2
    //   101: aload 7
    //   103: invokeinterface 132 4 0
    //   108: astore_2
    //   109: aload_2
    //   110: ifnonnull +76 -> 186
    //   113: new 134	com/google/android/gms/auth/a
    //   116: dup
    //   117: ldc -120
    //   119: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   122: athrow
    //   123: astore_1
    //   124: new 140	java/io/IOException
    //   127: dup
    //   128: ldc -114
    //   130: invokespecial 143	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   133: athrow
    //   134: astore_1
    //   135: aload_3
    //   136: getstatic 38	com/google/android/gms/auth/b:aIA	Landroid/content/ComponentName;
    //   139: aload_0
    //   140: invokevirtual 146	com/google/android/gms/common/internal/m:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;)V
    //   143: aload_1
    //   144: athrow
    //   145: astore_0
    //   146: new 148	com/google/android/gms/auth/c
    //   149: dup
    //   150: aload_0
    //   151: getfield 151	com/google/android/gms/common/d:aIC	I
    //   154: aload_0
    //   155: invokevirtual 155	com/google/android/gms/common/d:getMessage	()Ljava/lang/String;
    //   158: new 157	android/content/Intent
    //   161: dup
    //   162: aload_0
    //   163: getfield 163	com/google/android/gms/common/g:Hq	Landroid/content/Intent;
    //   166: invokespecial 166	android/content/Intent:<init>	(Landroid/content/Intent;)V
    //   169: invokespecial 169	com/google/android/gms/auth/c:<init>	(ILjava/lang/String;Landroid/content/Intent;)V
    //   172: athrow
    //   173: astore_0
    //   174: new 134	com/google/android/gms/auth/a
    //   177: dup
    //   178: aload_0
    //   179: invokevirtual 170	com/google/android/gms/common/c:getMessage	()Ljava/lang/String;
    //   182: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   185: athrow
    //   186: aload_2
    //   187: ldc -84
    //   189: invokevirtual 96	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   192: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   195: istore 5
    //   197: iload 5
    //   199: ifne +13 -> 212
    //   202: aload_3
    //   203: getstatic 38	com/google/android/gms/auth/b:aIA	Landroid/content/ComponentName;
    //   206: aload_0
    //   207: invokevirtual 146	com/google/android/gms/common/internal/m:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;)V
    //   210: aload_2
    //   211: areturn
    //   212: aload_2
    //   213: ldc -82
    //   215: invokevirtual 96	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   218: astore_1
    //   219: aload_2
    //   220: ldc -80
    //   222: invokevirtual 180	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   225: checkcast 157	android/content/Intent
    //   228: astore_2
    //   229: ldc -74
    //   231: aload_1
    //   232: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   235: ifne +246 -> 481
    //   238: ldc -66
    //   240: aload_1
    //   241: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   244: ifne +237 -> 481
    //   247: ldc -64
    //   249: aload_1
    //   250: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   253: ifne +228 -> 481
    //   256: ldc -62
    //   258: aload_1
    //   259: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   262: ifne +219 -> 481
    //   265: ldc -60
    //   267: aload_1
    //   268: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   271: ifne +210 -> 481
    //   274: ldc -58
    //   276: aload_1
    //   277: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   280: ifne +201 -> 481
    //   283: ldc -56
    //   285: aload_1
    //   286: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   289: ifne +192 -> 481
    //   292: getstatic 206	com/google/android/gms/c/i:aWO	Lcom/google/android/gms/c/i;
    //   295: getfield 209	com/google/android/gms/c/i:aXq	Ljava/lang/String;
    //   298: aload_1
    //   299: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   302: ifne +179 -> 481
    //   305: getstatic 212	com/google/android/gms/c/i:aWP	Lcom/google/android/gms/c/i;
    //   308: getfield 209	com/google/android/gms/c/i:aXq	Ljava/lang/String;
    //   311: aload_1
    //   312: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   315: ifne +166 -> 481
    //   318: getstatic 215	com/google/android/gms/c/i:aWQ	Lcom/google/android/gms/c/i;
    //   321: getfield 209	com/google/android/gms/c/i:aXq	Ljava/lang/String;
    //   324: aload_1
    //   325: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   328: ifne +153 -> 481
    //   331: getstatic 218	com/google/android/gms/c/i:aWR	Lcom/google/android/gms/c/i;
    //   334: getfield 209	com/google/android/gms/c/i:aXq	Ljava/lang/String;
    //   337: aload_1
    //   338: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   341: ifne +140 -> 481
    //   344: getstatic 221	com/google/android/gms/c/i:aWS	Lcom/google/android/gms/c/i;
    //   347: getfield 209	com/google/android/gms/c/i:aXq	Ljava/lang/String;
    //   350: aload_1
    //   351: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   354: ifne +127 -> 481
    //   357: getstatic 224	com/google/android/gms/c/i:aWT	Lcom/google/android/gms/c/i;
    //   360: getfield 209	com/google/android/gms/c/i:aXq	Ljava/lang/String;
    //   363: aload_1
    //   364: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   367: ifne +114 -> 481
    //   370: getstatic 227	com/google/android/gms/c/i:aWM	Lcom/google/android/gms/c/i;
    //   373: getfield 209	com/google/android/gms/c/i:aXq	Ljava/lang/String;
    //   376: aload_1
    //   377: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   380: ifeq +32 -> 412
    //   383: goto +98 -> 481
    //   386: iload 4
    //   388: ifeq +30 -> 418
    //   391: new 229	com/google/android/gms/auth/d
    //   394: dup
    //   395: aload_1
    //   396: aload_2
    //   397: invokespecial 232	com/google/android/gms/auth/d:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   400: athrow
    //   401: astore_1
    //   402: new 134	com/google/android/gms/auth/a
    //   405: dup
    //   406: ldc -22
    //   408: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   411: athrow
    //   412: iconst_0
    //   413: istore 4
    //   415: goto -29 -> 386
    //   418: ldc -20
    //   420: aload_1
    //   421: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   424: ifne +63 -> 487
    //   427: ldc -120
    //   429: aload_1
    //   430: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   433: ifne +54 -> 487
    //   436: ldc -18
    //   438: aload_1
    //   439: invokevirtual 188	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   442: ifeq +51 -> 493
    //   445: goto +42 -> 487
    //   448: iload 4
    //   450: ifeq +12 -> 462
    //   453: new 140	java/io/IOException
    //   456: dup
    //   457: aload_1
    //   458: invokespecial 143	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   461: athrow
    //   462: new 134	com/google/android/gms/auth/a
    //   465: dup
    //   466: aload_1
    //   467: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   470: athrow
    //   471: new 140	java/io/IOException
    //   474: dup
    //   475: ldc -16
    //   477: invokespecial 143	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   480: athrow
    //   481: iconst_1
    //   482: istore 4
    //   484: goto -98 -> 386
    //   487: iconst_1
    //   488: istore 4
    //   490: goto -42 -> 448
    //   493: iconst_0
    //   494: istore 4
    //   496: goto -48 -> 448
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	499	0	paramContext	Context
    //   0	499	1	paramAccount	Account
    //   0	499	2	paramString	String
    //   0	499	3	paramBundle	Bundle
    //   386	109	4	i	int
    //   195	3	5	bool	boolean
    //   4	70	6	localContext	Context
    //   24	78	7	localBundle	Bundle
    // Exception table:
    //   from	to	target	type
    //   92	109	123	android/os/RemoteException
    //   113	123	123	android/os/RemoteException
    //   186	197	123	android/os/RemoteException
    //   212	383	123	android/os/RemoteException
    //   391	401	123	android/os/RemoteException
    //   418	445	123	android/os/RemoteException
    //   453	462	123	android/os/RemoteException
    //   462	471	123	android/os/RemoteException
    //   92	109	134	finally
    //   113	123	134	finally
    //   124	134	134	finally
    //   186	197	134	finally
    //   212	383	134	finally
    //   391	401	134	finally
    //   402	412	134	finally
    //   418	445	134	finally
    //   453	462	134	finally
    //   462	471	134	finally
    //   11	16	145	com/google/android/gms/common/d
    //   11	16	173	com/google/android/gms/common/c
    //   92	109	401	java/lang/InterruptedException
    //   113	123	401	java/lang/InterruptedException
    //   186	197	401	java/lang/InterruptedException
    //   212	383	401	java/lang/InterruptedException
    //   391	401	401	java/lang/InterruptedException
    //   418	445	401	java/lang/InterruptedException
    //   453	462	401	java/lang/InterruptedException
    //   462	471	401	java/lang/InterruptedException
  }
  
  @Deprecated
  public static String e(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, new Account(paramString1, "com.google"), paramString2, new Bundle()).getString("authtoken");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/auth/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
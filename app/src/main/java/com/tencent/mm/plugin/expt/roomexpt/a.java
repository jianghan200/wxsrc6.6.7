package com.tencent.mm.plugin.expt.roomexpt;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.text.SimpleDateFormat;

public final class a
  implements c, d
{
  private static final float[] iIa = { 0.0F, 0.3F, 0.45F, 0.55F, 0.67F, 0.75F, 0.85F, 1.0F };
  private static final float[] iIb = { 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.2F, 0.3F, 0.4F };
  private static final float[] iIc = { 0.0F, 0.1F, 0.2F, 0.3F, 0.4F, 0.5F, 0.6F, 0.7F, 0.8F, 0.9F, 1.0F };
  private static final int[] iId = { 15, 35, 83, 140, 209, 297, 417, 599, 926, 1720 };
  private static final float[] iIe = { 0.0F, 0.3F, 0.5F, 0.6F, 0.7F, 0.7F, 0.8F, 0.8F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 1.0F };
  private static final float[] iIf = { 0.0F, 0.3F, 0.45F, 0.55F, 0.6F, 0.7F, 0.7F, 0.8F, 0.8F, 0.8F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 1.0F };
  private static final float[] iIg = { 0.1F, 0.2F, 0.3F, 0.4F, 0.5F, 0.6F, 0.7F, 0.8F, 0.9F, 1.0F };
  private static final int[] iIh = { 2400, 7500, 13000, 21500, 41000, 65000, 116000, 215000, 455000 };
  private static final float[] iIi = { 0.0F, 0.35F, 0.5F, 0.6F, 0.7F, 0.7F, 0.8F, 0.8F, 0.8F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 0.9F, 1.0F };
  private static a iIk;
  private SimpleDateFormat iIj = null;
  public b iIl;
  com.tencent.mm.g.b.a.g iIm;
  private String[] iIn;
  private boolean iIo = false;
  int iIp = 0;
  
  private static float a(float[] paramArrayOfFloat, int[] paramArrayOfInt, long paramLong)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length <= 0)) {}
    while ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      return 0.0F;
    }
    int j = paramArrayOfFloat.length;
    int k = Math.min(paramArrayOfFloat.length, paramArrayOfInt.length);
    int i = 0;
    if (i < k) {
      if (paramLong >= paramArrayOfInt[i]) {}
    }
    for (;;)
    {
      return paramArrayOfFloat[i];
      i += 1;
      break;
      i = j - 1;
    }
  }
  
  public static a aIx()
  {
    if (iIk == null) {
      iIk = new a();
    }
    return iIk;
  }
  
  private void aIy()
  {
    if (this.iIm == null) {
      return;
    }
    String str = this.iIm.wE();
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZZ, str);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatRoomExptService", "save expt info[%s]", new Object[] { this.iIm.wF() });
  }
  
  private static float b(float paramFloat, int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    if (paramInt1 <= 0) {
      return 0.0F;
    }
    int i;
    if (paramInt2 == 1)
    {
      i = 1;
      if (i == 0) {
        break label127;
      }
    }
    for (;;)
    {
      try
      {
        f2 = c(iIb, paramInt1);
        f1 = f2;
        f2 = (paramFloat / paramInt1 + paramFloat / 7.0F) / 2.0F - f2;
        f1 = f2;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatRoomExptService", "calc finish score result[%f] day[%d] isMute[%d] score[%f]", new Object[] { Float.valueOf(f2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Float.valueOf(paramFloat) });
        return f2;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatRoomExptService", "calc finish score error[%s]", new Object[] { localException.toString() });
        return f1;
      }
      i = 0;
      break;
      label127:
      float f2 = c(iIa, paramInt1);
      f2 += (paramFloat / paramInt1 + paramFloat / 7.0F) / 2.0F;
    }
  }
  
  private static float c(float[] paramArrayOfFloat, int paramInt)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length <= 0)) {
      return 0.0F;
    }
    if (paramInt >= paramArrayOfFloat.length) {
      return paramArrayOfFloat[(paramArrayOfFloat.length - 1)];
    }
    if (paramInt <= 0) {
      return paramArrayOfFloat[0];
    }
    return paramArrayOfFloat[paramInt];
  }
  
  public final void a(final String paramString1, final String paramString2, final long paramLong, final int paramInt1, int paramInt2, final boolean paramBoolean)
  {
    com.tencent.mm.plugin.expt.a.a locala = (com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.expt.a.a.class);
    a.a locala1 = a.a.iHN;
    boolean bool;
    int i;
    if (this.iIm != null)
    {
      bool = this.iIm.chM;
      if (locala.a(locala1, bool)) {
        break label61;
      }
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        break label226;
      }
      return;
      bool = false;
      break;
      label61:
      h.mEJ.e(869L, 1L, 1L);
      long l = this.iIm.chJ;
      if (l >= 3L)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatRoomExptService", "room expt already finish");
        i = 0;
      }
      else
      {
        if (l == 0L)
        {
          i = 1;
          label114:
          if (!paramBoolean) {
            break label180;
          }
        }
        label180:
        for (l = 1L | l;; l = 0x2 | l)
        {
          this.iIm.chJ = l;
          if (l < 3L) {
            break label191;
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatRoomExptService", "user already enter mute room and unmute room, don't expt");
          h.mEJ.e(869L, 2L, 1L);
          aIy();
          i = 0;
          break;
          i = 0;
          break label114;
        }
        label191:
        if (i != 0)
        {
          if (this.iIm.chK <= 0L) {
            this.iIm.wG();
          }
          aIy();
        }
        i = 1;
      }
    }
    label226:
    com.tencent.mm.kernel.g.Em().H(new Runnable()
    {
      public final void run()
      {
        long l1 = bi.VG();
        long l2 = bi.VE();
        String str1;
        boolean bool1;
        e locale;
        Object localObject;
        label97:
        int i;
        if (a.a(a.this).chK <= 0L)
        {
          a.a(a.this).wG();
          a.c(a.this);
          str1 = a.e(a.this);
          bool1 = a.n(paramLong, paramString1);
          locale = a.f(a.this).cG(paramInt1, str1);
          String str2 = paramInt1;
          if (locale == null) {
            break label347;
          }
          localObject = locale;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatRoomExptService", "get db [%s %s] item [%s]", new Object[] { str2, str1, localObject });
          if (locale == null) {
            break label369;
          }
          locale.field_sendCount += paramString1;
          locale.field_unReadCount += paramBoolean;
          int j = locale.field_disRedDotCount;
          if (!bool1) {
            break label354;
          }
          i = 1;
          label171:
          locale.field_disRedDotCount = (i + j);
          j = locale.field_enterCount;
          if (!bool1) {
            break label359;
          }
          i = 0;
          label192:
          locale.field_enterCount = (i + j);
          locale.field_stayTime += paramLong;
          if (!paramString2) {
            break label364;
          }
          i = 1;
          label224:
          locale.field_isMute = i;
          bool1 = true;
          a.a(locale);
          if (!bool1) {
            break label492;
          }
        }
        label347:
        label354:
        label359:
        label364:
        label369:
        label421:
        label443:
        label482:
        label487:
        label492:
        for (boolean bool2 = a.f(a.this).c(locale);; bool2 = a.f(a.this).b(locale))
        {
          if (!bool2) {
            h.mEJ.e(869L, 32L, 1L);
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatRoomExptService", "noteroominfo isUpdate[%b] dbOpRet[%b] cost[%d] item[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(bi.bI(l1)), locale });
          return;
          if (l2 - a.a(a.this).chK < 604800L) {
            break;
          }
          a.d(a.this);
          return;
          localObject = "null";
          break label97;
          i = 0;
          break label171;
          i = 1;
          break label192;
          i = 0;
          break label224;
          locale = new e();
          locale.field_chatroom = paramInt1;
          locale.field_nickname = this.iIw;
          locale.field_daySec = str1;
          locale.field_sendCount = paramString1;
          if (paramString2)
          {
            i = 1;
            locale.field_isMute = i;
            locale.field_unReadCount = paramBoolean;
            if (!bool1) {
              break label482;
            }
            i = 1;
            locale.field_disRedDotCount = i;
            if (!bool1) {
              break label487;
            }
          }
          for (i = 0;; i = 1)
          {
            locale.field_enterCount = i;
            locale.field_stayTime = paramLong;
            bool1 = false;
            break;
            i = 0;
            break label421;
            i = 0;
            break label443;
          }
        }
      }
    });
  }
  
  protected final void aIA()
  {
    b localb = this.iIl;
    try
    {
      localb.diF.delete("RoomMuteExpt", null, null);
      aIB();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ChatRoomExptStorage", localException, "deleteAll", new Object[0]);
      }
    }
  }
  
  protected final void aIB()
  {
    if (this.iIm != null)
    {
      this.iIm = new com.tencent.mm.g.b.a.g();
      this.iIm.chM = true;
      aIy();
    }
    this.iIn = null;
  }
  
  /* Error */
  final java.util.List<c> aIz()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   4: ifnonnull +13 -> 17
    //   7: ldc -75
    //   9: ldc_w 472
    //   12: invokestatic 475	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aconst_null
    //   16: areturn
    //   17: aload_0
    //   18: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   21: getfield 412	com/tencent/mm/g/b/a/g:chJ	J
    //   24: ldc2_w 413
    //   27: lcmp
    //   28: iflt +30 -> 58
    //   31: ldc -75
    //   33: ldc_w 477
    //   36: iconst_1
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_0
    //   43: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   46: getfield 412	com/tencent/mm/g/b/a/g:chJ	J
    //   49: invokestatic 482	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   52: aastore
    //   53: invokestatic 232	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   56: aconst_null
    //   57: areturn
    //   58: ldc_w 393
    //   61: invokestatic 397	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   64: checkcast 393	com/tencent/mm/plugin/expt/a/a
    //   67: astore 8
    //   69: getstatic 403	com/tencent/mm/plugin/expt/a/a$a:iHN	Lcom/tencent/mm/plugin/expt/a/a$a;
    //   72: astore 9
    //   74: aload_0
    //   75: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   78: ifnull +36 -> 114
    //   81: aload_0
    //   82: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   85: getfield 406	com/tencent/mm/g/b/a/g:chM	Z
    //   88: istore 5
    //   90: aload 8
    //   92: aload 9
    //   94: iload 5
    //   96: invokeinterface 409 3 0
    //   101: ifne +19 -> 120
    //   104: ldc -75
    //   106: ldc_w 484
    //   109: invokestatic 486	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: aconst_null
    //   113: areturn
    //   114: iconst_0
    //   115: istore 5
    //   117: goto -27 -> 90
    //   120: aload_0
    //   121: getfield 354	com/tencent/mm/plugin/expt/roomexpt/a:iIn	[Ljava/lang/String;
    //   124: ifnull +21 -> 145
    //   127: aload_0
    //   128: getfield 354	com/tencent/mm/plugin/expt/roomexpt/a:iIn	[Ljava/lang/String;
    //   131: arraylength
    //   132: ifle +13 -> 145
    //   135: ldc -75
    //   137: ldc_w 488
    //   140: invokestatic 486	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: aconst_null
    //   144: areturn
    //   145: aload_0
    //   146: getfield 85	com/tencent/mm/plugin/expt/roomexpt/a:iIo	Z
    //   149: ifeq +13 -> 162
    //   152: ldc -75
    //   154: ldc_w 490
    //   157: invokestatic 419	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aconst_null
    //   161: areturn
    //   162: invokestatic 493	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   165: lstore 6
    //   167: aload_0
    //   168: iconst_1
    //   169: putfield 85	com/tencent/mm/plugin/expt/roomexpt/a:iIo	Z
    //   172: getstatic 315	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   175: ldc2_w 318
    //   178: ldc2_w 494
    //   181: lconst_1
    //   182: invokevirtual 322	com/tencent/mm/plugin/report/service/h:e	(JJJ)V
    //   185: aload_0
    //   186: getfield 386	com/tencent/mm/plugin/expt/roomexpt/a:iIl	Lcom/tencent/mm/plugin/expt/roomexpt/b;
    //   189: invokevirtual 499	com/tencent/mm/plugin/expt/roomexpt/b:aIC	()Landroid/database/Cursor;
    //   192: astore 9
    //   194: fconst_0
    //   195: fstore_2
    //   196: fconst_0
    //   197: fstore_1
    //   198: new 501	java/util/ArrayList
    //   201: dup
    //   202: invokespecial 502	java/util/ArrayList:<init>	()V
    //   205: astore 11
    //   207: aload 9
    //   209: ifnull +612 -> 821
    //   212: fload_1
    //   213: fstore_2
    //   214: aload 9
    //   216: invokeinterface 507 1 0
    //   221: ifeq +600 -> 821
    //   224: aload 9
    //   226: invokeinterface 511 1 0
    //   231: iconst_5
    //   232: if_icmpge +186 -> 418
    //   235: ldc -75
    //   237: ldc_w 513
    //   240: invokestatic 475	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   243: aload 11
    //   245: invokestatic 519	java/util/Collections:sort	(Ljava/util/List;)V
    //   248: fconst_0
    //   249: fstore_2
    //   250: aload 11
    //   252: invokeinterface 524 1 0
    //   257: ifle +14 -> 271
    //   260: fload_1
    //   261: aload 11
    //   263: invokeinterface 524 1 0
    //   268: i2f
    //   269: fdiv
    //   270: fstore_2
    //   271: fload_2
    //   272: fconst_0
    //   273: invokestatic 528	java/lang/Math:max	(FF)F
    //   276: fstore_1
    //   277: new 530	com/tencent/mm/g/b/a/a
    //   280: dup
    //   281: invokespecial 531	com/tencent/mm/g/b/a/a:<init>	()V
    //   284: astore 12
    //   286: aconst_null
    //   287: astore 8
    //   289: aload 11
    //   291: invokeinterface 524 1 0
    //   296: iconst_5
    //   297: invokestatic 95	java/lang/Math:min	(II)I
    //   300: istore 4
    //   302: iconst_0
    //   303: istore_3
    //   304: iload_3
    //   305: iload 4
    //   307: if_icmpge +280 -> 587
    //   310: aload 11
    //   312: iload_3
    //   313: invokeinterface 535 2 0
    //   318: checkcast 537	com/tencent/mm/plugin/expt/roomexpt/c
    //   321: astore 13
    //   323: aload 8
    //   325: astore 10
    //   327: aload 13
    //   329: getfield 540	com/tencent/mm/plugin/expt/roomexpt/c:iIx	F
    //   332: fload_1
    //   333: fcmpl
    //   334: ifle +492 -> 826
    //   337: aload 8
    //   339: ifnull +179 -> 518
    //   342: aload 8
    //   344: ldc_w 542
    //   347: invokevirtual 262	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   350: aload 13
    //   352: getfield 545	com/tencent/mm/plugin/expt/roomexpt/c:bIY	Ljava/lang/String;
    //   355: invokevirtual 262	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   358: pop
    //   359: aload 12
    //   361: aload 13
    //   363: getfield 545	com/tencent/mm/plugin/expt/roomexpt/c:bIY	Ljava/lang/String;
    //   366: putfield 546	com/tencent/mm/g/b/a/a:cgb	Ljava/lang/String;
    //   369: aload 12
    //   371: new 163	java/lang/StringBuilder
    //   374: dup
    //   375: invokespecial 164	java/lang/StringBuilder:<init>	()V
    //   378: aload 13
    //   380: getfield 540	com/tencent/mm/plugin/expt/roomexpt/c:iIx	F
    //   383: invokevirtual 168	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   386: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   389: putfield 549	com/tencent/mm/g/b/a/a:cgc	Ljava/lang/String;
    //   392: aload 12
    //   394: aload_0
    //   395: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   398: getfield 412	com/tencent/mm/g/b/a/g:chJ	J
    //   401: l2i
    //   402: putfield 552	com/tencent/mm/g/b/a/a:cgd	I
    //   405: aload 12
    //   407: invokevirtual 553	com/tencent/mm/g/b/a/a:RD	()Z
    //   410: pop
    //   411: aload 8
    //   413: astore 10
    //   415: goto +411 -> 826
    //   418: aload 9
    //   420: iconst_0
    //   421: invokeinterface 554 2 0
    //   426: astore 8
    //   428: aload 9
    //   430: iconst_1
    //   431: invokeinterface 554 2 0
    //   436: astore 10
    //   438: aload 9
    //   440: iconst_2
    //   441: invokeinterface 558 2 0
    //   446: istore_3
    //   447: aload 9
    //   449: iconst_3
    //   450: invokeinterface 558 2 0
    //   455: istore 4
    //   457: aload 9
    //   459: iconst_4
    //   460: invokeinterface 562 2 0
    //   465: iload 4
    //   467: iload_3
    //   468: invokestatic 564	com/tencent/mm/plugin/expt/roomexpt/a:b	(FII)F
    //   471: fstore_2
    //   472: new 537	com/tencent/mm/plugin/expt/roomexpt/c
    //   475: dup
    //   476: invokespecial 565	com/tencent/mm/plugin/expt/roomexpt/c:<init>	()V
    //   479: astore 12
    //   481: aload 12
    //   483: aload 8
    //   485: putfield 545	com/tencent/mm/plugin/expt/roomexpt/c:bIY	Ljava/lang/String;
    //   488: aload 12
    //   490: aload 10
    //   492: putfield 568	com/tencent/mm/plugin/expt/roomexpt/c:nickname	Ljava/lang/String;
    //   495: aload 12
    //   497: fload_2
    //   498: putfield 540	com/tencent/mm/plugin/expt/roomexpt/c:iIx	F
    //   501: aload 11
    //   503: aload 12
    //   505: invokeinterface 572 2 0
    //   510: pop
    //   511: fload_1
    //   512: fload_2
    //   513: fadd
    //   514: fstore_1
    //   515: goto -303 -> 212
    //   518: new 256	java/lang/StringBuffer
    //   521: dup
    //   522: invokespecial 257	java/lang/StringBuffer:<init>	()V
    //   525: astore 8
    //   527: aload 8
    //   529: aload 13
    //   531: getfield 545	com/tencent/mm/plugin/expt/roomexpt/c:bIY	Ljava/lang/String;
    //   534: invokevirtual 262	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   537: pop
    //   538: goto -179 -> 359
    //   541: astore 10
    //   543: aload 9
    //   545: astore 8
    //   547: aload 10
    //   549: astore 9
    //   551: ldc -75
    //   553: aload 9
    //   555: ldc_w 574
    //   558: iconst_0
    //   559: anewarray 4	java/lang/Object
    //   562: invokestatic 469	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   565: aload 8
    //   567: ifnull +10 -> 577
    //   570: aload 8
    //   572: invokeinterface 577 1 0
    //   577: ldc -75
    //   579: ldc_w 579
    //   582: invokestatic 475	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   585: aconst_null
    //   586: areturn
    //   587: aload 8
    //   589: ifnull +137 -> 726
    //   592: aload_0
    //   593: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   596: aload 8
    //   598: invokevirtual 303	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   601: putfield 582	com/tencent/mm/g/b/a/g:chL	Ljava/lang/String;
    //   604: aload_0
    //   605: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   608: ldc2_w 583
    //   611: putfield 412	com/tencent/mm/g/b/a/g:chJ	J
    //   614: aload_0
    //   615: aload_0
    //   616: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   619: getfield 582	com/tencent/mm/g/b/a/g:chL	Ljava/lang/String;
    //   622: ldc_w 542
    //   625: invokevirtual 590	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   628: putfield 354	com/tencent/mm/plugin/expt/roomexpt/a:iIn	[Ljava/lang/String;
    //   631: getstatic 315	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   634: ldc2_w 318
    //   637: ldc2_w 591
    //   640: lconst_1
    //   641: invokevirtual 322	com/tencent/mm/plugin/report/service/h:e	(JJJ)V
    //   644: aload_0
    //   645: invokespecial 357	com/tencent/mm/plugin/expt/roomexpt/a:aIy	()V
    //   648: aload_0
    //   649: iconst_0
    //   650: putfield 85	com/tencent/mm/plugin/expt/roomexpt/a:iIo	Z
    //   653: aload_0
    //   654: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   657: invokevirtual 229	com/tencent/mm/g/b/a/g:wF	()Ljava/lang/String;
    //   660: astore 10
    //   662: aload_0
    //   663: getfield 354	com/tencent/mm/plugin/expt/roomexpt/a:iIn	[Ljava/lang/String;
    //   666: ifnull +118 -> 784
    //   669: aload_0
    //   670: getfield 354	com/tencent/mm/plugin/expt/roomexpt/a:iIn	[Ljava/lang/String;
    //   673: invokestatic 597	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   676: astore 8
    //   678: ldc -75
    //   680: ldc_w 599
    //   683: iconst_3
    //   684: anewarray 4	java/lang/Object
    //   687: dup
    //   688: iconst_0
    //   689: aload 10
    //   691: aastore
    //   692: dup
    //   693: iconst_1
    //   694: aload 8
    //   696: aastore
    //   697: dup
    //   698: iconst_2
    //   699: lload 6
    //   701: invokestatic 603	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   704: invokestatic 482	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   707: aastore
    //   708: invokestatic 232	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   711: aload 9
    //   713: ifnull +10 -> 723
    //   716: aload 9
    //   718: invokeinterface 577 1 0
    //   723: aload 11
    //   725: areturn
    //   726: aload_0
    //   727: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   730: ldc2_w 604
    //   733: putfield 412	com/tencent/mm/g/b/a/g:chJ	J
    //   736: aload_0
    //   737: getfield 98	com/tencent/mm/plugin/expt/roomexpt/a:iIm	Lcom/tencent/mm/g/b/a/g;
    //   740: ldc_w 607
    //   743: putfield 582	com/tencent/mm/g/b/a/g:chL	Ljava/lang/String;
    //   746: aload_0
    //   747: aconst_null
    //   748: putfield 354	com/tencent/mm/plugin/expt/roomexpt/a:iIn	[Ljava/lang/String;
    //   751: getstatic 315	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   754: ldc2_w 318
    //   757: ldc2_w 608
    //   760: lconst_1
    //   761: invokevirtual 322	com/tencent/mm/plugin/report/service/h:e	(JJJ)V
    //   764: goto -120 -> 644
    //   767: astore 8
    //   769: aload 9
    //   771: ifnull +10 -> 781
    //   774: aload 9
    //   776: invokeinterface 577 1 0
    //   781: aload 8
    //   783: athrow
    //   784: ldc_w 611
    //   787: astore 8
    //   789: goto -111 -> 678
    //   792: astore 8
    //   794: aconst_null
    //   795: astore 9
    //   797: goto -28 -> 769
    //   800: astore 10
    //   802: aload 8
    //   804: astore 9
    //   806: aload 10
    //   808: astore 8
    //   810: goto -41 -> 769
    //   813: astore 9
    //   815: aconst_null
    //   816: astore 8
    //   818: goto -267 -> 551
    //   821: fload_2
    //   822: fstore_1
    //   823: goto -580 -> 243
    //   826: iload_3
    //   827: iconst_1
    //   828: iadd
    //   829: istore_3
    //   830: aload 10
    //   832: astore 8
    //   834: goto -530 -> 304
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	837	0	this	a
    //   197	626	1	f1	float
    //   195	627	2	f2	float
    //   303	527	3	i	int
    //   300	166	4	j	int
    //   88	28	5	bool	boolean
    //   165	535	6	l	long
    //   67	628	8	localObject1	Object
    //   767	15	8	localObject2	Object
    //   787	1	8	str1	String
    //   792	11	8	localObject3	Object
    //   808	25	8	localObject4	Object
    //   72	733	9	localObject5	Object
    //   813	1	9	localException1	Exception
    //   325	166	10	localObject6	Object
    //   541	7	10	localException2	Exception
    //   660	30	10	str2	String
    //   800	31	10	localObject7	Object
    //   205	519	11	localArrayList	java.util.ArrayList
    //   284	220	12	localObject8	Object
    //   321	209	13	localc	c
    // Exception table:
    //   from	to	target	type
    //   198	207	541	java/lang/Exception
    //   214	243	541	java/lang/Exception
    //   243	248	541	java/lang/Exception
    //   250	271	541	java/lang/Exception
    //   271	286	541	java/lang/Exception
    //   289	302	541	java/lang/Exception
    //   310	323	541	java/lang/Exception
    //   327	337	541	java/lang/Exception
    //   342	359	541	java/lang/Exception
    //   359	411	541	java/lang/Exception
    //   418	511	541	java/lang/Exception
    //   518	538	541	java/lang/Exception
    //   592	644	541	java/lang/Exception
    //   644	678	541	java/lang/Exception
    //   678	711	541	java/lang/Exception
    //   726	764	541	java/lang/Exception
    //   198	207	767	finally
    //   214	243	767	finally
    //   243	248	767	finally
    //   250	271	767	finally
    //   271	286	767	finally
    //   289	302	767	finally
    //   310	323	767	finally
    //   327	337	767	finally
    //   342	359	767	finally
    //   359	411	767	finally
    //   418	511	767	finally
    //   518	538	767	finally
    //   592	644	767	finally
    //   644	678	767	finally
    //   678	711	767	finally
    //   726	764	767	finally
    //   172	194	792	finally
    //   551	565	800	finally
    //   172	194	813	java/lang/Exception
  }
  
  public final void ap(final String paramString, final boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatRoomExptService", "enter chat room [%s] isMute[%b]", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (this.iIp > 0)
    {
      this.iIp -= 1;
      com.tencent.mm.kernel.g.Em().H(new Runnable()
      {
        public final void run()
        {
          a.aq(paramString, paramBoolean);
        }
      });
    }
    do
    {
      return;
      if ((this.iIn == null) || (this.iIn.length <= 0))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatRoomExptService", "roomname list is null");
        return;
      }
    } while (this.iIm == null);
    if (this.iIm.chJ >= 5L)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatRoomExptService", "exptInfo is finish [%d]", new Object[] { Long.valueOf(this.iIm.chJ) });
      return;
    }
    com.tencent.mm.kernel.g.Em().H(new a.3(this, paramString, paramBoolean));
  }
  
  public final void eB(boolean paramBoolean)
  {
    com.tencent.mm.sdk.f.e.post(new a.1(this, paramBoolean), "click_room_mute_msg");
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    if (this.iIm == null)
    {
      paramc = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZZ, "");
      if (!bi.oW(paramc)) {
        break label82;
      }
      this.iIm = new com.tencent.mm.g.b.a.g();
      this.iIm.chM = false;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatRoomExptService", "load expt roomnameList[%s] info[%s]", new Object[] { this.iIn, this.iIm.wF() });
      return;
      label82:
      this.iIm = new com.tencent.mm.g.b.a.g(paramc);
      if (!bi.oW(this.iIm.chL)) {
        this.iIn = this.iIm.chL.split(";");
      }
    }
  }
  
  public final void onAccountRelease()
  {
    this.iIm = null;
    this.iIl = null;
  }
  
  public final void r(Context paramContext, Intent paramIntent)
  {
    paramIntent.setClass(paramContext, RoomExptDebugUI.class);
    paramContext.startActivity(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/expt/roomexpt/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
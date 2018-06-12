package com.tencent.mm.model;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Base64;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.ac.z;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.ia;
import com.tencent.mm.g.a.ip;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.oc;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.platformtools.aj;
import com.tencent.mm.platformtools.aj.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.aqc;
import com.tencent.mm.protocal.c.axa;
import com.tencent.mm.protocal.c.axb;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.protocal.y;
import com.tencent.mm.r.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.az;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class f
  implements m
{
  private long dAw = -1L;
  public a dAx;
  
  /* Error */
  private static String f(String paramString, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 30
    //   3: invokevirtual 36	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   6: ifeq +70 -> 76
    //   9: new 38	java/util/zip/ZipFile
    //   12: dup
    //   13: invokestatic 44	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   16: invokevirtual 50	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   19: getfield 56	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   22: invokespecial 59	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   25: astore 9
    //   27: aload 9
    //   29: aload 9
    //   31: aload_0
    //   32: iconst_1
    //   33: invokevirtual 63	java/lang/String:substring	(I)Ljava/lang/String;
    //   36: invokevirtual 67	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   39: invokevirtual 71	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   42: astore 8
    //   44: aload 9
    //   46: astore_0
    //   47: lload_1
    //   48: lconst_0
    //   49: lcmp
    //   50: ifle +37 -> 87
    //   53: aload_0
    //   54: astore 10
    //   56: aload 8
    //   58: astore 9
    //   60: aload 8
    //   62: lload_1
    //   63: invokevirtual 77	java/io/InputStream:skip	(J)J
    //   66: lstore 6
    //   68: lload_1
    //   69: lload 6
    //   71: lsub
    //   72: lstore_1
    //   73: goto -26 -> 47
    //   76: aload_0
    //   77: invokestatic 83	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   80: astore 8
    //   82: aconst_null
    //   83: astore_0
    //   84: goto -37 -> 47
    //   87: aload_0
    //   88: astore 10
    //   90: aload 8
    //   92: astore 9
    //   94: ldc 85
    //   96: invokestatic 91	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   99: astore 11
    //   101: aload_0
    //   102: astore 10
    //   104: aload 8
    //   106: astore 9
    //   108: sipush 2048
    //   111: newarray <illegal type>
    //   113: astore 12
    //   115: lload_3
    //   116: lconst_0
    //   117: lcmp
    //   118: ifle +60 -> 178
    //   121: aload_0
    //   122: astore 10
    //   124: aload 8
    //   126: astore 9
    //   128: aload 8
    //   130: aload 12
    //   132: iconst_0
    //   133: ldc2_w 92
    //   136: lload_3
    //   137: invokestatic 99	java/lang/Math:min	(JJ)J
    //   140: l2i
    //   141: invokevirtual 103	java/io/InputStream:read	([BII)I
    //   144: istore 5
    //   146: iload 5
    //   148: iconst_m1
    //   149: if_icmpeq +29 -> 178
    //   152: aload_0
    //   153: astore 10
    //   155: aload 8
    //   157: astore 9
    //   159: aload 11
    //   161: aload 12
    //   163: iconst_0
    //   164: iload 5
    //   166: invokevirtual 107	java/security/MessageDigest:update	([BII)V
    //   169: lload_3
    //   170: iload 5
    //   172: i2l
    //   173: lsub
    //   174: lstore_3
    //   175: goto -60 -> 115
    //   178: aload_0
    //   179: astore 10
    //   181: aload 8
    //   183: astore 9
    //   185: aload 11
    //   187: invokevirtual 111	java/security/MessageDigest:digest	()[B
    //   190: invokestatic 117	com/tencent/mm/sdk/platformtools/bi:bE	([B)Ljava/lang/String;
    //   193: astore 11
    //   195: aload 11
    //   197: astore 9
    //   199: aload 8
    //   201: ifnull +8 -> 209
    //   204: aload 8
    //   206: invokevirtual 120	java/io/InputStream:close	()V
    //   209: aload 9
    //   211: astore 8
    //   213: aload_0
    //   214: ifnull +11 -> 225
    //   217: aload_0
    //   218: invokevirtual 121	java/util/zip/ZipFile:close	()V
    //   221: aload 9
    //   223: astore 8
    //   225: aload 8
    //   227: areturn
    //   228: astore 11
    //   230: aconst_null
    //   231: astore_0
    //   232: aconst_null
    //   233: astore 8
    //   235: aload_0
    //   236: astore 10
    //   238: aload 8
    //   240: astore 9
    //   242: ldc 123
    //   244: aload 11
    //   246: ldc 125
    //   248: iconst_0
    //   249: anewarray 4	java/lang/Object
    //   252: invokestatic 131	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: ldc 125
    //   257: astore 9
    //   259: aload 8
    //   261: ifnull +8 -> 269
    //   264: aload 8
    //   266: invokevirtual 120	java/io/InputStream:close	()V
    //   269: aload 9
    //   271: astore 8
    //   273: aload_0
    //   274: ifnull -49 -> 225
    //   277: aload_0
    //   278: invokevirtual 121	java/util/zip/ZipFile:close	()V
    //   281: ldc 125
    //   283: areturn
    //   284: astore_0
    //   285: ldc 125
    //   287: areturn
    //   288: astore_0
    //   289: aconst_null
    //   290: astore 10
    //   292: aconst_null
    //   293: astore 9
    //   295: aload 9
    //   297: ifnull +8 -> 305
    //   300: aload 9
    //   302: invokevirtual 120	java/io/InputStream:close	()V
    //   305: aload 10
    //   307: ifnull +8 -> 315
    //   310: aload 10
    //   312: invokevirtual 121	java/util/zip/ZipFile:close	()V
    //   315: aload_0
    //   316: athrow
    //   317: astore 8
    //   319: goto -110 -> 209
    //   322: astore_0
    //   323: aload 9
    //   325: areturn
    //   326: astore 8
    //   328: goto -59 -> 269
    //   331: astore 8
    //   333: goto -28 -> 305
    //   336: astore 8
    //   338: goto -23 -> 315
    //   341: astore_0
    //   342: aconst_null
    //   343: astore 8
    //   345: aload 9
    //   347: astore 10
    //   349: aload 8
    //   351: astore 9
    //   353: goto -58 -> 295
    //   356: astore_0
    //   357: goto -62 -> 295
    //   360: astore 11
    //   362: aconst_null
    //   363: astore 8
    //   365: aload 9
    //   367: astore_0
    //   368: goto -133 -> 235
    //   371: astore 11
    //   373: goto -138 -> 235
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	376	0	paramString	String
    //   0	376	1	paramLong1	long
    //   0	376	3	paramLong2	long
    //   144	27	5	i	int
    //   66	4	6	l	long
    //   42	230	8	localObject1	Object
    //   317	1	8	localIOException1	java.io.IOException
    //   326	1	8	localIOException2	java.io.IOException
    //   331	1	8	localIOException3	java.io.IOException
    //   336	1	8	localIOException4	java.io.IOException
    //   343	21	8	localObject2	Object
    //   25	341	9	localObject3	Object
    //   54	294	10	localObject4	Object
    //   99	97	11	localObject5	Object
    //   228	17	11	localException1	Exception
    //   360	1	11	localException2	Exception
    //   371	1	11	localException3	Exception
    //   113	49	12	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	27	228	java/lang/Exception
    //   76	82	228	java/lang/Exception
    //   277	281	284	java/io/IOException
    //   0	27	288	finally
    //   76	82	288	finally
    //   204	209	317	java/io/IOException
    //   217	221	322	java/io/IOException
    //   264	269	326	java/io/IOException
    //   300	305	331	java/io/IOException
    //   310	315	336	java/io/IOException
    //   27	44	341	finally
    //   60	68	356	finally
    //   94	101	356	finally
    //   108	115	356	finally
    //   128	146	356	finally
    //   159	169	356	finally
    //   185	195	356	finally
    //   242	255	356	finally
    //   27	44	360	java/lang/Exception
    //   60	68	371	java/lang/Exception
    //   94	101	371	java/lang/Exception
    //   108	115	371	java/lang/Exception
    //   128	146	371	java/lang/Exception
    //   159	169	371	java/lang/Exception
    //   185	195	371	java/lang/Exception
  }
  
  private static String f(Object... paramVarArgs)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (;;)
    {
      int i;
      Object localObject;
      try
      {
        int m = paramVarArgs.length;
        i = 0;
        if (i >= m) {
          break label218;
        }
        localObject = paramVarArgs[i];
        if ((localObject instanceof String))
        {
          localByteArrayOutputStream.write(((String)localObject).getBytes());
        }
        else if ((localObject instanceof Integer))
        {
          int k = ((Integer)localObject).intValue();
          j = 0;
          if (j < 4)
          {
            localByteArrayOutputStream.write(k & 0xFF);
            k >>= 8;
            j += 1;
            continue;
          }
        }
        else if ((localObject instanceof Long))
        {
          long l = ((Long)localObject).longValue();
          j = 0;
          if (j < 8)
          {
            localByteArrayOutputStream.write((int)(0xFF & l));
            l >>= 8;
            j += 1;
            continue;
          }
        }
        else if ((localObject instanceof Boolean))
        {
          if (((Boolean)localObject).booleanValue())
          {
            j = 1;
            localByteArrayOutputStream.write(j);
          }
        }
      }
      catch (Exception paramVarArgs)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramVarArgs, "", new Object[0]);
        return "";
      }
      int j = 0;
      continue;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "Invalid object class: %s", new Object[] { localObject });
      return "";
      label218:
      paramVarArgs = bi.bE(MessageDigest.getInstance("MD5").digest(localByteArrayOutputStream.toByteArray()));
      return paramVarArgs;
      i += 1;
    }
  }
  
  /* Error */
  private static long gx(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 30
    //   3: invokevirtual 36	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   6: ifeq +115 -> 121
    //   9: new 38	java/util/zip/ZipFile
    //   12: dup
    //   13: invokestatic 44	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   16: invokevirtual 50	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   19: getfield 56	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   22: invokespecial 59	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   25: astore 4
    //   27: aload 4
    //   29: astore_3
    //   30: aload 4
    //   32: aload_0
    //   33: iconst_1
    //   34: invokevirtual 63	java/lang/String:substring	(I)Ljava/lang/String;
    //   37: invokevirtual 67	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   40: astore_0
    //   41: aload_0
    //   42: ifnonnull +12 -> 54
    //   45: aload 4
    //   47: invokevirtual 121	java/util/zip/ZipFile:close	()V
    //   50: ldc2_w 18
    //   53: lreturn
    //   54: aload 4
    //   56: astore_3
    //   57: aload_0
    //   58: invokevirtual 184	java/util/zip/ZipEntry:getSize	()J
    //   61: lstore_1
    //   62: aload 4
    //   64: invokevirtual 121	java/util/zip/ZipFile:close	()V
    //   67: lload_1
    //   68: lreturn
    //   69: astore_0
    //   70: lload_1
    //   71: lreturn
    //   72: astore 5
    //   74: aconst_null
    //   75: astore_0
    //   76: aload_0
    //   77: astore_3
    //   78: ldc 123
    //   80: aload 5
    //   82: ldc 125
    //   84: iconst_0
    //   85: anewarray 4	java/lang/Object
    //   88: invokestatic 131	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload_0
    //   92: ifnull -42 -> 50
    //   95: aload_0
    //   96: invokevirtual 121	java/util/zip/ZipFile:close	()V
    //   99: ldc2_w 18
    //   102: lreturn
    //   103: astore_0
    //   104: ldc2_w 18
    //   107: lreturn
    //   108: astore_0
    //   109: aconst_null
    //   110: astore_3
    //   111: aload_3
    //   112: ifnull +7 -> 119
    //   115: aload_3
    //   116: invokevirtual 121	java/util/zip/ZipFile:close	()V
    //   119: aload_0
    //   120: athrow
    //   121: aload_0
    //   122: invokestatic 187	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   125: lreturn
    //   126: astore_0
    //   127: ldc2_w 18
    //   130: lreturn
    //   131: astore_3
    //   132: goto -13 -> 119
    //   135: astore_0
    //   136: goto -25 -> 111
    //   139: astore 5
    //   141: aload 4
    //   143: astore_0
    //   144: goto -68 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	paramString	String
    //   61	10	1	l	long
    //   29	87	3	localObject	Object
    //   131	1	3	localIOException1	java.io.IOException
    //   25	117	4	localZipFile	java.util.zip.ZipFile
    //   72	9	5	localIOException2	java.io.IOException
    //   139	1	5	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   62	67	69	java/io/IOException
    //   9	27	72	java/io/IOException
    //   95	99	103	java/io/IOException
    //   9	27	108	finally
    //   45	50	126	java/io/IOException
    //   115	119	131	java/io/IOException
    //   30	41	135	finally
    //   57	62	135	finally
    //   78	91	135	finally
    //   30	41	139	java/io/IOException
    //   57	62	139	java/io/IOException
  }
  
  public final d.b a(String paramString, Map<String, String> paramMap, d.a parama)
  {
    Object localObject6 = parama.dIN;
    Object localObject5 = ab.a(((by)localObject6).rcl);
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null)
    {
      localObject1 = localObject2;
      if (paramString.equals("addcontact"))
      {
        ((by)localObject6).rcl = ab.oT((String)paramMap.get(".sysmsg.addcontact.content"));
        ((by)localObject6).jQd = 1;
        localObject1 = d.c.ba(Integer.valueOf(1));
        if (localObject1 != null) {
          break label1153;
        }
        localObject1 = null;
      }
    }
    int i;
    if ((paramString != null) && (paramString.equals("dynacfg")))
    {
      com.tencent.mm.k.g.AT().a((String)localObject5, paramMap, false);
      com.tencent.mm.k.g.AU();
      if (com.tencent.mm.k.c.AF() == 2) {
        h.mEJ.k(10879, "");
      }
      i = bi.getInt(com.tencent.mm.k.g.AT().getValue("MuteRoomDisable"), 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallSysCmdMsgConsumer", "Mute_Room_Disable:" + Integer.toString(i));
    }
    if ((paramString != null) && (paramString.equals("dynacfg_split"))) {
      com.tencent.mm.k.g.AT().a((String)localObject5, paramMap, true);
    }
    Object localObject7;
    Object localObject8;
    if ((paramString != null) && (paramString.equals("banner")))
    {
      localObject2 = (String)paramMap.get(".sysmsg.mainframebanner.$type");
      localObject7 = (String)paramMap.get(".sysmsg.mainframebanner.showtype");
      localObject8 = (String)paramMap.get(".sysmsg.mainframebanner.data");
      if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {}
    }
    for (;;)
    {
      Object localObject9;
      Object localObject10;
      long l1;
      try
      {
        bc.Ig().a(new bb(Integer.valueOf((String)localObject2).intValue(), Integer.valueOf((String)localObject7).intValue(), (String)localObject8));
        localObject2 = (String)paramMap.get(".sysmsg.friendrecommand.fromuser");
        localObject7 = (String)paramMap.get(".sysmsg.friendrecommand.touser");
        if ((localObject2 == null) || (localObject7 == null)) {}
      }
      catch (Exception localException3)
      {
        try
        {
          au.HU().Gt().a((String)localObject7, true, null);
          localObject2 = (String)paramMap.get(".sysmsg.banner.securitybanner.chatname");
          localObject7 = (String)paramMap.get(".sysmsg.banner.securitybanner.wording");
          localObject8 = (String)paramMap.get(".sysmsg.banner.securitybanner.linkname");
          localObject9 = (String)paramMap.get(".sysmsg.banner.securitybanner.linksrc");
          localObject10 = (String)paramMap.get(".sysmsg.banner.securitybanner.showtype");
          if ((bi.oW((String)localObject2)) || (bi.oW((String)localObject10))) {}
        }
        catch (Exception localException3)
        {
          try
          {
            if (!((String)localObject10).equals("1")) {
              break label7130;
            }
            bool1 = true;
            au.HU().Gu().a((String)localObject2, bool1, new String[] { localObject7, localObject8, localObject9 });
            au.HU().Gv().r(paramMap);
            if ((!bi.oW(paramString)) && (paramString.equals("midinfo")))
            {
              localObject2 = (String)paramMap.get(".sysmsg.midinfo.json_buffer");
              localObject7 = (String)paramMap.get(".sysmsg.midinfo.time_interval");
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "QueryMid time[%s] json[%s]  [%s] ", new Object[] { localObject7, localObject2, localObject5 });
              i = bi.getInt((String)localObject7, 0);
              if ((i > 86400L) && (i < 864000L))
              {
                au.HU();
                c.DT().set(331777, Long.valueOf(bi.VE() + i));
              }
              if (!bi.oW((String)localObject2)) {
                com.tencent.mm.plugin.report.b.d.KE((String)localObject2);
              }
            }
            if ((paramString != null) && (paramString.equals("revokemsg")))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
              localObject1 = (String)paramMap.get(".sysmsg.revokemsg.session");
              localObject2 = (String)paramMap.get(".sysmsg.revokemsg.newmsgid");
              paramString = (String)paramMap.get(".sysmsg.revokemsg.replacemsg");
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", new Object[] { localObject2, paramString });
              l1 = 0L;
            }
          }
          catch (Exception localException3)
          {
            try
            {
              long l2 = bi.getLong((String)localObject2, 0L);
              l1 = l2;
              au.HU();
              l1 = l2;
              paramMap = c.FT().I((String)localObject1, l2);
              l1 = l2;
              localObject1 = com.tencent.mm.storage.bd.al(paramMap);
              l1 = l2;
              if ((paramMap.cqa & 0x4) != 4)
              {
                l1 = l2;
                paramMap.setContent(paramString);
                l1 = l2;
                paramMap.setType(10000);
                l1 = l2;
                bd.a(paramMap, parama);
                l1 = l2;
                au.HU();
                l1 = l2;
                c.FT().a(paramMap.field_msgId, paramMap);
              }
              l1 = l2;
              au.HU();
              l1 = l2;
              localObject2 = c.FW().Yq(paramMap.field_talker);
              if (localObject2 != null)
              {
                l1 = l2;
                if (((am)localObject2).field_unReadCount > 0)
                {
                  l1 = l2;
                  au.HU();
                  l1 = l2;
                  i = c.FT().S(paramMap);
                  l1 = l2;
                  if (((am)localObject2).field_unReadCount >= i)
                  {
                    l1 = l2;
                    ((ai)localObject2).eV(((am)localObject2).field_unReadCount - 1);
                    l1 = l2;
                    au.HU();
                    l1 = l2;
                    c.FW().a((ai)localObject2, ((am)localObject2).field_username);
                  }
                }
              }
              if (parama != null)
              {
                l1 = l2;
                if (parama.dIO)
                {
                  l1 = l2;
                  localObject7 = new aw();
                  l1 = l2;
                  ((aw)localObject7).field_originSvrId = l2;
                  l1 = l2;
                  if (paramMap.field_msgId == 0L)
                  {
                    l1 = l2;
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke but msg id is 0 originSvrId[%d]", new Object[] { Long.valueOf(l2) });
                    l1 = l2;
                    ((aw)localObject7).field_content = ((String)localObject5);
                    l1 = l2;
                    ((aw)localObject7).field_createTime = ((by)localObject6).lOH;
                    l1 = l2;
                    ((aw)localObject7).field_flag = bd.c(parama);
                    l1 = l2;
                    ((aw)localObject7).field_fromUserName = ab.a(((by)localObject6).rcj);
                    l1 = l2;
                    ((aw)localObject7).field_toUserName = ab.a(((by)localObject6).rck);
                    l1 = l2;
                    ((aw)localObject7).field_newMsgId = ((by)localObject6).rcq;
                    l1 = l2;
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr insert ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(com.tencent.mm.modelmulti.o.PO().PL().b((com.tencent.mm.sdk.e.c)localObject7)), Long.valueOf(((aw)localObject7).sKx) });
                    return null;
                    label1153:
                    localObject1 = ((com.tencent.mm.ab.d)localObject1).b(parama);
                    break;
                    localException1 = localException1;
                    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", localException1.toString());
                    continue;
                    localException2 = localException2;
                    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", localException2.toString());
                    continue;
                    localException3 = localException3;
                    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "[oneliang]" + localException3.toString());
                    continue;
                  }
                  l1 = l2;
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke and has done delete info, originSvrId[%d]", new Object[] { Long.valueOf(l2) });
                  l1 = l2;
                  com.tencent.mm.modelmulti.o.PO().PL().a((com.tencent.mm.sdk.e.c)localObject7, true, new String[0]);
                  l1 = l2;
                  au.HU();
                  l1 = l2;
                  c.FT().ea(l2);
                  if (localException3 != null)
                  {
                    l1 = l2;
                    if (parama.dIN != null)
                    {
                      l1 = l2;
                      if (localException3.field_lastSeq == parama.dIN.rcr)
                      {
                        l1 = l2;
                        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke and fix fault lastseq[%s], firstUnDeliverSeq[%s]", new Object[] { Long.valueOf(localException3.field_lastSeq), Long.valueOf(localException3.field_firstUnDeliverSeq) });
                        l1 = l2;
                        au.HU();
                        l1 = l2;
                        localObject5 = c.FT().GF(localException3.field_username);
                        if (localObject5 != null)
                        {
                          l1 = l2;
                          localException3.au(((cm)localObject5).field_msgSeq);
                          l1 = l2;
                          au.HU();
                          l1 = l2;
                          i = c.FW().a(localException3, localException3.field_username);
                          l1 = l2;
                          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbadcr get a revoke and fix fault by [%s, %s] lastseq[%s], firstUnDeliverSeq[%s], update[%s]", new Object[] { Long.valueOf(((cm)localObject5).field_msgSvrId), Long.valueOf(((cm)localObject5).field_msgSeq), Long.valueOf(localException3.field_lastSeq), Long.valueOf(localException3.field_firstUnDeliverSeq), Integer.valueOf(i) });
                        }
                      }
                    }
                  }
                }
              }
              l1 = l2;
              if (paramMap.field_msgId == 0L) {
                if (parama != null)
                {
                  l1 = l2;
                  if (parama.dIO) {}
                }
                else
                {
                  l1 = l2;
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summer revoke msg id is 0 and svrid[%d]", new Object[] { Long.valueOf(l2) });
                  l1 = l2;
                  au.HU();
                  l1 = l2;
                  c.FT().ea(l2);
                }
              }
              l1 = l2;
              parama = new oc();
              l1 = l2;
              parama.bYY.bJC = paramMap.field_msgId;
              l1 = l2;
              parama.bYY.bYZ = paramString;
              l1 = l2;
              parama.bYY.bXQ = paramMap;
              l1 = l2;
              parama.bYY.bZa = ((com.tencent.mm.storage.bd)localObject1);
              l1 = l2;
              parama.bYY.bZb = l2;
              l1 = l2;
              com.tencent.mm.sdk.b.a.sFg.m(parama);
              if (localObject1 != null)
              {
                l1 = l2;
                com.tencent.mm.kernel.g.Em().H(new f.3(this, (com.tencent.mm.storage.bd)localObject1));
              }
            }
            catch (Exception paramString)
            {
              com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramString, "[oneliang][revokeMsg] msgId:%d,error:%s", new Object[] { Long.valueOf(l1), paramString.toString() });
              continue;
            }
            return null;
          }
        }
      }
      int j;
      if ((paramString != null) && (paramString.equals("clouddelmsg")))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "mm hit MM_DATA_SYSCMD_NEWXML_CLOUD_DEL_MSG");
        localObject3 = (String)paramMap.get(".sysmsg.clouddelmsg.delcommand");
        localObject1 = (String)paramMap.get(".sysmsg.clouddelmsg.msgid");
        paramMap = (String)paramMap.get(".sysmsg.clouddelmsg.fromuser");
        i = ((String)localObject5).indexOf("<msg>");
        j = ((String)localObject5).indexOf("</msg>");
        if ((i == -1) || (j == -1))
        {
          paramString = "";
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], delcommand:%s, msgid:%s, fromuser:%s, sysmsgcontent:%s", new Object[] { localObject3, localObject1, paramMap, paramString });
        }
        for (;;)
        {
          try
          {
            au.HU();
            paramMap = c.FT().dJ(paramMap, (String)localObject1);
            if ((paramMap == null) || (paramMap.size() <= 0))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "get null by getByBizClientMsgId");
              return null;
              paramString = ay.au(bl.z(((String)localObject5).substring(i, j + 6), "msg"));
              break;
            }
            paramMap = paramMap.iterator();
            if (paramMap.hasNext())
            {
              localObject5 = (com.tencent.mm.storage.bd)paramMap.next();
              if (localObject5 == null) {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], msgInfo == null");
              }
            }
            else
            {
              return null;
            }
          }
          catch (Exception paramString)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramString, "[hakon][clouddelmsg], BizClientMsgId:%d,error:%s", new Object[] { localObject1, paramString.toString() });
          }
          if (((cm)localObject5).field_msgSvrId >= 0L) {
            break label2041;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], invalid msgInfo.msgId = %s, srvId = %s", new Object[] { Long.valueOf(((cm)localObject5).field_msgId), Long.valueOf(((cm)localObject5).field_msgSvrId) });
        }
        label2041:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "[hakon][clouddelmsg], msgInfo.msgId = %s, srvId = %s", new Object[] { Long.valueOf(((cm)localObject5).field_msgId), Long.valueOf(((cm)localObject5).field_msgSvrId) });
        i = bi.getInt((String)localObject3, 0);
        if (i == 1)
        {
          au.HU();
          c.FT().R(((cm)localObject5).field_talker, ((cm)localObject5).field_msgSvrId);
        }
        for (;;)
        {
          localObject6 = new oc();
          ((oc)localObject6).bYY.bJC = ((cm)localObject5).field_msgId;
          ((oc)localObject6).bYY.bYZ = paramString;
          ((oc)localObject6).bYY.bXQ = ((com.tencent.mm.storage.bd)localObject5);
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject6);
          break;
          if ((i == 2) && (((com.tencent.mm.storage.bd)localObject5).cky()))
          {
            ((com.tencent.mm.storage.bd)localObject5).setContent(paramString);
            bd.a((com.tencent.mm.storage.bd)localObject5, parama);
            au.HU();
            c.FT().b(((cm)localObject5).field_msgSvrId, (com.tencent.mm.storage.bd)localObject5);
            au.HU();
            localObject6 = c.FW().Yq(((cm)localObject5).field_talker);
            if ((localObject6 != null) && (((am)localObject6).field_unReadCount > 0))
            {
              au.HU();
              i = c.FT().S((com.tencent.mm.storage.bd)localObject5);
              if (((am)localObject6).field_unReadCount >= i)
              {
                ((ai)localObject6).eV(((am)localObject6).field_unReadCount - 1);
                au.HU();
                c.FW().a((ai)localObject6, ((am)localObject6).field_username);
              }
            }
          }
        }
      }
      if ((paramString != null) && (paramString.equals("updatepackage")))
      {
        localObject1 = d.c.ba(Integer.valueOf(-1879048175));
        if (localObject1 != null) {}
      }
      label2377:
      label2537:
      label2748:
      label2784:
      label3116:
      label3231:
      label3266:
      label3272:
      Object localObject4;
      for (Object localObject3 = null;; localObject4 = localObject1)
      {
        for (;;)
        {
          localObject1 = localObject3;
          if (paramString != null)
          {
            localObject1 = localObject3;
            if (paramString.equals("deletepackage"))
            {
              localObject1 = d.c.ba(Integer.valueOf(-1879048174));
              if (localObject1 != null) {
                break label3231;
              }
              localObject1 = null;
            }
          }
          Object localObject11;
          if ((paramString != null) && (paramString.equals("delchatroommember")))
          {
            localObject3 = ab.a(((by)localObject6).rcj);
            au.HU();
            localObject7 = c.FT().I((String)localObject3, ((by)localObject6).rcq);
            i = 0;
            if (((cm)localObject7).field_msgId > 0L) {
              i = 1;
            }
            ((com.tencent.mm.storage.bd)localObject7).ax(((by)localObject6).rcq);
            if ((parama == null) || (!parama.dIO) || (!parama.dIQ)) {
              ((com.tencent.mm.storage.bd)localObject7).ay(bd.o((String)localObject3, ((by)localObject6).lOH));
            }
            ((com.tencent.mm.storage.bd)localObject7).setType(10002);
            ((com.tencent.mm.storage.bd)localObject7).setContent((String)localObject5);
            ((com.tencent.mm.storage.bd)localObject7).eX(0);
            ((com.tencent.mm.storage.bd)localObject7).ep((String)localObject3);
            ((com.tencent.mm.storage.bd)localObject7).dt(((by)localObject6).rco);
            bd.a((com.tencent.mm.storage.bd)localObject7, parama);
            if (i == 0) {
              bd.i((com.tencent.mm.storage.bd)localObject7);
            }
          }
          else
          {
            localObject3 = localObject1;
            if (paramString != null)
            {
              localObject3 = localObject1;
              if (paramString.equals("WakenPush"))
              {
                localObject3 = localObject1;
                if (this.dAw != ((by)localObject6).rcq)
                {
                  this.dAw = ((by)localObject6).rcq;
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "dzmonster[subType wakenpush]");
                  localObject3 = new cc(paramMap);
                  localObject5 = (String)((cc)localObject3).dzf.get(".sysmsg.WakenPush.PushContent");
                  localObject7 = (String)((cc)localObject3).dzf.get(".sysmsg.WakenPush.Jump");
                  localObject1 = (String)((cc)localObject3).dzf.get(".sysmsg.WakenPush.ExpiredTime");
                  localObject8 = (String)((cc)localObject3).dzf.get(".sysmsg.WakenPush.Username");
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WakenPushMsgExtension", "dzmonster[xml parse of wakenpush,pushContent:%s, jump:%s, expiredTime %s]", new Object[] { localObject5, localObject7, localObject1 });
                  localObject1 = com.tencent.mm.k.g.AT().getValue("WakenPushDeepLinkBitSet");
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WakenPushMsgExtension", "dzmonster[config of WakenPushDeepLinkBitSet:%s", new Object[] { localObject1 });
                  if (bi.oW((String)localObject1)) {
                    break label3266;
                  }
                  l1 = bi.getLong((String)localObject1, 0L);
                  localObject9 = com.tencent.mm.aa.c.a((String)localObject8, false, -1);
                  localObject10 = au.getNotification();
                  if (!bi.oW((String)localObject7)) {
                    break label3272;
                  }
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WakenPushMsgExtension", "dzmonster:dealDeepLink[url is null]");
                  localObject1 = "com.tencent.mm.ui.LauncherUI";
                  localObject11 = new Intent();
                  ((Intent)localObject11).setClassName(ad.getContext(), (String)localObject1);
                  ((Intent)localObject11).setFlags(536870912);
                  ((Intent)localObject11).putExtra("LauncherUI.Show.Update.DialogMsg", (String)((cc)localObject3).dzf.get(".sysmsg.WakenPush.PushContent"));
                  if (!((String)localObject7).equals("weixin://dl/update_newest_version")) {
                    ((Intent)localObject11).putExtra("LauncherUI.Show.Update.Url", (String)((cc)localObject3).dzf.get(".sysmsg.WakenPush.Jump"));
                  }
                  h.mEJ.a(405L, 32L, 1L, true);
                  localObject1 = ((al)localObject10).a(PendingIntent.getActivity(ad.getContext(), UUID.randomUUID().hashCode(), (Intent)localObject11, 134217728), ad.getContext().getString(R.l.app_name), (String)localObject5, (String)localObject5, (Bitmap)localObject9, (String)localObject8);
                  ((Notification)localObject1).flags |= 0x10;
                  au.getNotification().a((Notification)localObject1, false);
                  h.mEJ.a(405L, 31L, 1L, true);
                  localObject3 = null;
                }
              }
            }
            localObject1 = localObject3;
            if (paramString == null) {
              break label3534;
            }
            localObject1 = localObject3;
            if (!paramString.equals("DisasterNotice")) {
              break label3534;
            }
            localObject7 = (String)paramMap.get(".sysmsg.NoticeId");
            localObject8 = (String)paramMap.get(".sysmsg.Content");
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "disaster noticeID:%s, content:%s", new Object[] { localObject7, localObject8 });
            localObject9 = ad.getContext().getSharedPreferences("disaster_pref", 4);
            localObject5 = ((SharedPreferences)localObject9).getString("disaster_noticeid_list_key", "");
            if (((String)localObject5).contains((CharSequence)localObject7)) {
              break label3477;
            }
            localObject10 = ((String)localObject5).split(";");
            if ((localObject10 == null) || (localObject10.length <= 10)) {
              break label3388;
            }
            localObject1 = "";
            j = localObject10.length;
            i = 0;
            localObject3 = localObject1;
            if (i >= j) {
              break label3392;
            }
            localObject11 = localObject10[i].split(",");
            localObject3 = localObject1;
          }
          try
          {
            if (bi.bG(bi.getLong(localObject11[0], 0L)) < 1296000L) {
              localObject3 = (String)localObject1 + localObject11[0] + "," + localObject11[1] + ";";
            }
            i += 1;
            localObject1 = localObject3;
            break label3116;
            localObject3 = ((com.tencent.mm.ab.d)localObject1).b(parama);
            continue;
            localObject1 = ((com.tencent.mm.ab.d)localObject1).b(parama);
            break label2377;
            au.HU();
            c.FT().b(((by)localObject6).rcq, (com.tencent.mm.storage.bd)localObject7);
            break label2537;
            l1 = 0L;
            break label2748;
            if (((0x4 & l1) == 4L) && (((String)localObject7).startsWith("weixin://dl/moments")))
            {
              localObject1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI";
              break label2784;
            }
            if (((l1 & 0x40000) == 262144L) && (((String)localObject7).startsWith("weixin://dl/recommendation")))
            {
              localObject1 = "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI";
              break label2784;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WakenPushMsgExtension", "dzmonster:dealDeepLink[unable to deal with the deep link:%s)", new Object[] { localObject7 });
            localObject1 = "com.tencent.mm.ui.LauncherUI";
          }
          catch (Exception localException4)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "MM_DATA_SYSCMD_NEWXML_DISASTER_NOTICE parseLong error:%s", new Object[] { localException4 });
              localObject4 = localObject1;
            }
          }
        }
        label3388:
        localObject4 = localObject5;
        label3392:
        localObject1 = (String)localObject4 + bi.VE() + "," + (String)localObject7 + ";";
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "update noticeIdList %s -> %s", new Object[] { localObject5, localObject1 });
        ((SharedPreferences)localObject9).edit().putString("disaster_noticeid_list_key", (String)localObject1).commit();
        label3477:
        new ag(Looper.getMainLooper()).post(new f.1(this, (String)localObject7));
        ((by)localObject6).rcl = ab.oT((String)localObject8);
        ((by)localObject6).jQd = 1;
        localObject1 = d.c.ba(Integer.valueOf(1));
        if (localObject1 == null)
        {
          localObject1 = null;
          label3534:
          if ((paramString == null) || (!paramString.equals("EmotionKv"))) {
            break label4007;
          }
          paramString = (String)paramMap.get(".sysmsg.EmotionKv.K");
          localObject1 = (String)paramMap.get(".sysmsg.EmotionKv.I");
          if (paramString != null) {
            break label7120;
          }
          paramString = "";
        }
        label3747:
        label3762:
        label3770:
        label3777:
        label3821:
        label3856:
        label3948:
        label3956:
        label3964:
        label3991:
        label4000:
        label4007:
        label5110:
        label5498:
        label6146:
        label6483:
        label7067:
        label7079:
        label7120:
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv pcKeyStr len:%d, content[%s] pcId[%s]", new Object[] { Integer.valueOf(paramString.length()), paramString, localObject1 });
          localObject4 = y.cgr().qXe.getBytes();
          localObject5 = y.cgr().qXf.getBytes();
          paramMap = null;
          try
          {
            parama = au.DF().dJs.Lr().Lo();
            paramMap = parama;
          }
          catch (Exception parama)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "DISASTER_NOTICE :%s ", new Object[] { bi.i(parama) });
            }
            parama = new PByteArray();
            if (bi.oW(paramString)) {
              break label3747;
            }
          }
          if (bi.bC(paramMap))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallSysCmdMsgConsumer", "DISASTER_NOTICE  ecdh  is null .");
            return null;
            localObject1 = ((com.tencent.mm.ab.d)localObject1).b(parama);
            break;
          }
          int k;
          int m;
          if ((bi.bC((byte[])localObject5)) || (bi.bC((byte[])localObject4)) || (bi.bC(paramMap))) {
            if (paramString == null)
            {
              i = -1;
              if (localObject5 != null) {
                break label3948;
              }
              j = -1;
              if (localObject4 != null) {
                break label3956;
              }
              k = -1;
              if (paramMap != null) {
                break label3964;
              }
              m = -1;
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv param len err pcKeylen:%d, keynlen:%d, keyelen:%d, ecdhlen:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
              paramString = parama.value;
              paramMap = new aqc();
              if (parama.value == null) {
                break label3991;
              }
              paramMap.mEl = new String(parama.value);
              if (paramString != null) {
                break label4000;
              }
            }
          }
          for (i = -1;; i = paramString.length)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv res len:%d val len:%d, content[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramMap.mEl.length()), com.tencent.mm.a.g.u(paramMap.mEl.getBytes()) });
            paramMap.rSD = ((String)localObject1);
            au.HU();
            c.FQ().b(new h.a(59, paramMap));
            return null;
            i = paramString.length();
            break;
            j = localObject5.length;
            break label3762;
            k = localObject4.length;
            break label3770;
            m = paramMap.length;
            break label3777;
            au.HU();
            MMProtocalJni.genClientCheckKVRes(c.Df(), paramString, (byte[])localObject4, (byte[])localObject5, paramMap, parama);
            break label3821;
            paramMap.mEl = "";
            break label3856;
          }
          if ((paramString != null) && (paramString.equals("globalalert")))
          {
            paramString = (String)paramMap.get(".sysmsg.uuid");
            i = bi.getInt((String)paramMap.get(".sysmsg.id"), -1);
            j = bi.getInt((String)paramMap.get(".sysmsg.important"), -1);
            if ((bi.oW(paramString)) || (i < 0) || (j < 0))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert uuid[%s], id[%d], important[%d] is illegal ret", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(j) });
              return null;
            }
            parama = (String)paramMap.get(".sysmsg.title");
            localObject1 = (String)paramMap.get(".sysmsg.msg");
            if ((bi.oW(parama)) && (bi.oW((String)localObject1)))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert title[%s], msg[%s] is illegal ret", new Object[] { parama, localObject1 });
              return null;
            }
            localObject5 = (String)paramMap.get(".sysmsg.btnlist.btn.$title");
            k = bi.getInt((String)paramMap.get(".sysmsg.btnlist.btn.$id"), -1);
            m = bi.getInt((String)paramMap.get(".sysmsg.btnlist.btn.$actiontype"), -1);
            localObject6 = (String)paramMap.get(".sysmsg.btnlist.btn");
            if ((bi.oW((String)localObject5)) || (k < 0) || (m < 0))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert first btn btnStr[%s], btnId[%d] btnActionType[%d] is illegal ret", new Object[] { localObject5, Integer.valueOf(k), Integer.valueOf(m) });
              return null;
            }
            localObject4 = (String)paramMap.get(".sysmsg.btnlist.btn1.$title");
            int n = bi.getInt((String)paramMap.get(".sysmsg.btnlist.btn1.$id"), -1);
            int i1 = bi.getInt((String)paramMap.get(".sysmsg.btnlist.btn1.$actiontype"), -1);
            paramMap = (String)paramMap.get(".sysmsg.btnlist.btn1");
            bool1 = true;
            if ((bi.oW((String)localObject4)) || (n < 0) || (i1 < 0))
            {
              bool1 = false;
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert sec btn btnStr[%s], btnId[%d] btnActionType[%d] is illegal only one btn", new Object[] { localObject5, Integer.valueOf(k), Integer.valueOf(m) });
            }
            localObject7 = new ia();
            localObject8 = new com.tencent.mm.protocal.b.a.b();
            ((ia)localObject7).bRy.bRz = ((com.tencent.mm.protocal.b.a.b)localObject8);
            ((com.tencent.mm.protocal.b.a.b)localObject8).id = i;
            ((com.tencent.mm.protocal.b.a.b)localObject8).title = parama;
            ((com.tencent.mm.protocal.b.a.b)localObject8).bIr = ((String)localObject1);
            ((com.tencent.mm.protocal.b.a.b)localObject8).qXY = new LinkedList();
            localObject9 = new com.tencent.mm.protocal.b.a.a();
            ((com.tencent.mm.protocal.b.a.a)localObject9).id = k;
            ((com.tencent.mm.protocal.b.a.a)localObject9).actionType = m;
            ((com.tencent.mm.protocal.b.a.a)localObject9).qXW = ((String)localObject5);
            ((com.tencent.mm.protocal.b.a.a)localObject9).qXX = ((String)localObject6);
            ((com.tencent.mm.protocal.b.a.b)localObject8).qXY.add(localObject9);
            if (bool1)
            {
              localObject5 = new com.tencent.mm.protocal.b.a.a();
              ((com.tencent.mm.protocal.b.a.a)localObject5).id = n;
              ((com.tencent.mm.protocal.b.a.a)localObject5).actionType = i1;
              ((com.tencent.mm.protocal.b.a.a)localObject5).qXW = ((String)localObject4);
              ((com.tencent.mm.protocal.b.a.a)localObject5).qXX = paramMap;
              ((com.tencent.mm.protocal.b.a.b)localObject8).qXY.add(localObject5);
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summeralert uuid[%s], id[%d], important[%d], title[%s], msg[%s], twoBtn[%b], publish[%b]", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(j), parama, localObject1, Boolean.valueOf(bool1), Boolean.valueOf(com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject7)) });
            return null;
          }
          if ((paramString != null) && (paramString.equals("yybsigcheck")))
          {
            h.mEJ.a(322L, 14L, 1L, false);
            l1 = System.currentTimeMillis();
            paramString = (String)paramMap.get(".sysmsg.yybsigcheck.yybsig.nocheckmarket");
            parama = (String)paramMap.get(".sysmsg.yybsigcheck.yybsig.wording");
            paramMap = (String)paramMap.get(".sysmsg.yybsigcheck.yybsig.url");
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml nocheckmarket[%s], wording[%s], url[%s]", new Object[] { paramString, parama, paramMap });
            h.mEJ.h(11098, new Object[] { Integer.valueOf(4014), String.format("%s|%s|%s", new Object[] { paramString, parama, paramMap }) });
            if (bi.oW(paramString))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml nocheckmarket is nil and return");
              h.mEJ.a(322L, 15L, 1L, false);
              h.mEJ.h(11098, new Object[] { Integer.valueOf(4015), String.format("%s|%s", new Object[] { parama, paramMap }) });
              return null;
            }
            localObject1 = paramString.split(";");
            if (localObject1 == null) {}
            for (i = -1;; i = localObject1.length)
            {
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml infoStrs len is %d", new Object[] { Integer.valueOf(i) });
              if ((localObject1 != null) && (localObject1.length != 0)) {
                break;
              }
              h.mEJ.a(322L, 16L, 1L, false);
              h.mEJ.h(11098, new Object[] { Integer.valueOf(4016), paramString });
              return null;
            }
            localObject4 = new ArrayList();
            i = 0;
            if (i < localObject1.length)
            {
              localObject5 = localObject1[i];
              if (bi.oW((String)localObject5)) {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml infoStr is nil index:%d, continue", new Object[] { Integer.valueOf(i) });
              }
              for (;;)
              {
                i += 1;
                break;
                localObject6 = ((String)localObject5).split(",");
                if (localObject6 == null) {}
                for (j = -1;; j = localObject6.length)
                {
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml fields len is %d", new Object[] { Integer.valueOf(j) });
                  if ((localObject6 != null) && (localObject6.length == 3)) {
                    break label5110;
                  }
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml fields len is invalid index:%d, continue", new Object[] { Integer.valueOf(i) });
                  break;
                }
                try
                {
                  ((ArrayList)localObject4).add(new aj.c(localObject6[0], Integer.valueOf(localObject6[1]).intValue(), localObject6[2]));
                }
                catch (Exception localException5)
                {
                  com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml parse info index:%d, e:%s", new Object[] { Integer.valueOf(i), localException5.getMessage() });
                  h.mEJ.a(322L, 17L, 1L, false);
                  h.mEJ.h(11098, new Object[] { Integer.valueOf(4017), localObject5 });
                }
              }
            }
            if (((ArrayList)localObject4).size() == 0)
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml marketList size is 0 and return");
              h.mEJ.a(322L, 18L, 1L, false);
              h.mEJ.h(11098, new Object[] { Integer.valueOf(4018), String.format("%s|%s|%s", new Object[] { paramString, parama, paramMap }) });
              return null;
            }
            if (bi.getInt(com.tencent.mm.k.g.AT().getValue("YYBVerifyMarketUseSystemApi"), 0) != 0)
            {
              bool1 = true;
              boolean bool2 = aj.a(ad.getContext(), (ArrayList)localObject4, bool1);
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summertoken newxml marketList size[%d], usesSystemApi[%b], containLowerMarket[%b], take[%d]ms", new Object[] { Integer.valueOf(((ArrayList)localObject4).size()), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(System.currentTimeMillis() - l1) });
              if (bool2) {
                break label5498;
              }
              au.HS().setInt(46, 4);
              localObject1 = new ip();
              ((ip)localObject1).bSb.bSc = parama;
              ((ip)localObject1).bSb.url = paramMap;
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
              h.mEJ.a(322L, 20L, 1L, true);
              h.mEJ.h(11098, new Object[] { Integer.valueOf(4020), String.format("%s|%s|%s", new Object[] { paramString, parama, paramMap }) });
            }
            for (;;)
            {
              return null;
              bool1 = false;
              break;
              au.HS().setInt(46, 0);
              h.mEJ.a(322L, 19L, 1L, true);
              h.mEJ.h(11098, new Object[] { Integer.valueOf(4019), String.format("%s|%s|%s", new Object[] { paramString, parama, paramMap }) });
            }
          }
          if ((paramString != null) && (paramString.equals("qy_status_notify")))
          {
            parama = (String)paramMap.get(".sysmsg.chat_id");
            paramMap.get(".sysmsg.last_create_time");
            paramString = (String)paramMap.get(".sysmsg.brand_username");
            l1 = com.tencent.mm.ac.a.e.li(parama);
            if (l1 == -1L)
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "qy_status_notify bizLocalId == -1,%s", new Object[] { parama });
              return null;
            }
            i = z.Nb().bd(l1).field_newUnReadCount;
            z.Nb().bf(l1);
            paramMap = z.Na().ak(l1);
            au.HU();
            parama = c.FW().Yq(paramString);
            if (parama == null)
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallSysCmdMsgConsumer", "qy_status_notify cvs == null:%s", new Object[] { paramString });
              return null;
            }
            if (paramMap.hu(1))
            {
              if (parama.field_unReadMuteCount <= i)
              {
                parama.fb(0);
                au.HU();
                c.FW().a(parama, paramString);
                au.getNotification().cancelNotification(paramString);
              }
              for (;;)
              {
                return null;
                parama.fb(parama.field_unReadMuteCount - i);
                au.HU();
                c.FW().a(parama, paramString);
              }
            }
            if (parama.field_unReadCount <= i)
            {
              au.HU();
              c.FW().Ys(paramString);
              au.getNotification().cancelNotification(paramString);
            }
            for (;;)
            {
              return null;
              parama.fa(0);
              parama.fd(0);
              parama.eV(parama.field_unReadCount - i);
              au.HU();
              c.FW().a(parama, paramString);
            }
          }
          if ((paramString != null) && (paramString.equals("qy_chat_update")))
          {
            parama = (String)paramMap.get(".sysmsg.chat_id");
            localObject4 = (String)paramMap.get(".sysmsg.ver");
            com.tencent.mm.ac.a.e.n((String)paramMap.get(".sysmsg.brand_username"), parama, (String)localObject4);
          }
          if ((paramString != null) && (paramString.equals("bindmobiletip")))
          {
            i = bi.getInt((String)paramMap.get(".sysmsg.bindmobiletip.forcebind"), 0);
            parama = bi.oV((String)paramMap.get(".sysmsg.bindmobiletip.deviceid"));
            paramString = bi.oV((String)paramMap.get(".sysmsg.bindmobiletip.wording"));
            paramMap = new String(Base64.decode(parama.getBytes(), 0));
            parama = new String(com.tencent.mm.bk.b.bi(q.zz().getBytes()).Cz(16).lR);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallSysCmdMsgConsumer", "summerbindmobile forceBind:%d,decodeDeviceId[%s],localDeviceId[%s],woridingStr[%s]", new Object[] { Integer.valueOf(i), paramMap, parama, paramString });
            if ((bi.oW(paramMap)) || (paramMap.equals(parama)))
            {
              au.HU();
              c.DT().a(aa.a.sQC, Boolean.valueOf(true));
              au.HU();
              paramMap = c.DT();
              parama = aa.a.sQD;
              if (i != 1) {
                break label6146;
              }
            }
            for (bool1 = true;; bool1 = false)
            {
              paramMap.a(parama, Boolean.valueOf(bool1));
              au.HU();
              c.DT().a(aa.a.sQE, paramString);
              return null;
            }
          }
          if ((paramString != null) && (paramString.equals("ClientCheckConsistency")))
          {
            parama = new axa();
            parama.ecE = ((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.fullpathfilename"));
            parama.saf = bi.getInt((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.fileoffset"), 0);
            parama.sag = bi.getInt((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.checkbuffersize"), 0);
            parama.rko = bi.getInt((String)paramMap.get(".sysmsg.ClientCheckConsistency.clientcheck.seq"), 0);
            parama.sah = f(parama.ecE, parama.saf, parama.sag);
            parama.ruE = ((int)gx(parama.ecE));
            if (!com.tencent.mm.plugin.normsg.a.b.lFJ.bjz()) {
              break label7067;
            }
            i = 1;
          }
          for (;;)
          {
            parama.sai = i;
            parama.rth = com.tencent.mm.compatible.e.w.zQ();
            parama.saj = f(new Object[] { parama.ecE, Integer.valueOf(parama.saf), Integer.valueOf(parama.sag), Integer.valueOf(parama.rko), parama.sah, Integer.valueOf(parama.ruE), Integer.valueOf(parama.sai), Integer.valueOf(parama.rth) });
            au.HU();
            c.FQ().b(new h.a(61, parama));
            if ((paramString != null) && (paramString.equals("ClientCheckHook")))
            {
              parama = new axc();
              parama.rko = bi.getInt((String)paramMap.get(".sysmsg.ClientCheckHook.clientcheck.seq"), 0);
              parama.sal = com.tencent.mm.plugin.normsg.a.b.lFJ.gV(false);
              if (com.tencent.mm.plugin.normsg.a.b.lFJ.bjz())
              {
                i = 1;
                parama.sai = i;
                parama.rth = com.tencent.mm.compatible.e.w.zQ();
                parama.saj = f(new Object[] { Integer.valueOf(parama.rko), parama.sal, Integer.valueOf(parama.sai), Integer.valueOf(parama.rth) });
                au.HU();
                c.FQ().b(new h.a(62, parama));
              }
            }
            else
            {
              if ((paramString != null) && (paramString.equals("ClientCheckGetAppList")))
              {
                parama = new axb();
                parama.rko = bi.getInt((String)paramMap.get(".sysmsg.ClientCheckGetAppList.clientcheck.seq"), 0);
                parama.sak = com.tencent.mm.plugin.normsg.a.b.lFJ.bjD();
                if (!com.tencent.mm.plugin.normsg.a.b.lFJ.bjz()) {
                  break label7079;
                }
                i = 1;
                parama.sai = i;
                parama.rth = com.tencent.mm.compatible.e.w.zQ();
                parama.saj = f(new Object[] { Integer.valueOf(parama.rko), parama.sak, Integer.valueOf(parama.sai), Integer.valueOf(parama.rth) });
                au.HU();
                c.FQ().b(new h.a(63, parama));
              }
              if ((paramString != null) && (paramString.equals("ClientCheckGetExtInfo"))) {
                com.tencent.mm.sdk.f.e.a(new f.2(this, paramMap), "syscmd_rpt_cc");
              }
              if ((!bi.oW(paramString)) && (paramString.equals("functionmsg")))
              {
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallSysCmdMsgConsumer", "subtype functionmsg");
                parama = i.Ch();
                com.tencent.mm.sdk.platformtools.x.l("MicroMsg.FunctionMsgFetcher", "fetchFromNewXml, newXmlMsgQueue.size: %s, addMsg.createTime: %s", new Object[] { Integer.valueOf(parama.diB.size()), Integer.valueOf(localException5.lOH) });
                paramMap.put("FUNCTION_MSG_ADD_MSG_CREATE_TIME_KEY", String.valueOf(localException5.lOH));
                parama.diB.add(paramMap);
                parama.BX();
              }
              if ((!bi.oW(paramString)) && (paramString.equals("paymsg")))
              {
                i = bi.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), 0);
                localObject4 = (String)paramMap.get(".sysmsg.paymsg.appmsgcontent");
                paramString = (String)paramMap.get(".sysmsg.paymsg.fromusername");
                parama = (String)paramMap.get(".sysmsg.paymsg.tousername");
                paramMap = (String)paramMap.get(".sysmsg.paymsg.paymsgid");
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallSysCmdMsgConsumer", "payMsg, payMsgType: %s, MsgId: %s, fromUsername: %s, toUsername: %s, paymsgid: %s, appMsgContentEncode: %s, ", new Object[] { Integer.valueOf(i), Long.valueOf(localException5.rcq), paramString, parama, paramMap, localObject4 });
              }
            }
            try
            {
              localObject4 = URLDecoder.decode((String)localObject4, "UTF-8");
              if (!bi.oW((String)localObject4))
              {
                localObject5 = new mm();
                ((mm)localObject5).bXt.type = i;
                ((mm)localObject5).bXt.content = ((String)localObject4);
                ((mm)localObject5).bXt.bSS = paramString;
                ((mm)localObject5).bXt.toUser = parama;
                ((mm)localObject5).bXt.bXu = paramMap;
                com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject5);
              }
              return (d.b)localObject1;
              i = 0;
              continue;
              i = 0;
              break label6483;
              i = 0;
            }
            catch (Exception paramString)
            {
              for (;;)
              {
                com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", paramString, "", new Object[0]);
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallSysCmdMsgConsumer", "pay msg, parse failed: %s", new Object[] { paramString.getMessage() });
              }
            }
          }
        }
      }
      label7130:
      boolean bool1 = false;
    }
  }
  
  public static abstract interface a
  {
    public abstract void cX(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
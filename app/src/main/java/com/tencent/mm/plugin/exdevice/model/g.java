package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.ed;
import com.tencent.mm.g.a.hu;
import com.tencent.mm.g.a.hu.b;
import com.tencent.mm.g.c.bw;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.protocal.c.amv;
import com.tencent.mm.protocal.c.amw;
import com.tencent.mm.protocal.c.amx;
import com.tencent.mm.protocal.c.amy;
import com.tencent.mm.protocal.c.amz;
import com.tencent.mm.protocal.c.ana;
import com.tencent.mm.protocal.c.anb;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.btx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.b;
import com.tencent.mm.y.g.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class g
  implements com.tencent.mm.ab.e
{
  String bSW;
  long cYP;
  String dVk = "";
  public i.a dVu = new g.2(this);
  long dlN;
  String iuA = "send_data_sucess";
  String iuB = "send_data_failed";
  private String iuC = "send_data_sending";
  boolean iuD = false;
  boolean iuE = false;
  public HashMap<String, String> iuF = new HashMap();
  amw iuG;
  long iuH;
  List<com.tencent.mm.plugin.exdevice.h.b> iuI = null;
  List<com.tencent.mm.plugin.exdevice.h.b> iuJ = new ArrayList();
  HashMap<String, String> iuK = new HashMap();
  HashMap<String, Integer> iuL = new HashMap();
  HashMap<String, Boolean> iuM = new HashMap();
  j.a iuN;
  j.a iuO;
  j.a iuP;
  j.a iuQ;
  Runnable iuR = new g.1(this);
  amw iuS;
  String iuT;
  String iuU;
  int iuV;
  HashMap<Integer, String> iuW = new HashMap();
  boolean iuu = false;
  boolean iuv = false;
  boolean iuw = false;
  String iux;
  String iuy;
  int iuz;
  
  public g()
  {
    this.iuJ.clear();
    this.iuK.clear();
    this.iuM.clear();
    this.iuI = ad.aHe().aHI();
    if ((this.iuI != null) && (this.iuI.size() > 0))
    {
      x.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "Bind Device Size is %d", new Object[] { Integer.valueOf(this.iuI.size()) });
      int j = this.iuI.size();
      int i = 0;
      while (i < j)
      {
        if ((((com.tencent.mm.plugin.exdevice.h.b)this.iuI.get(i)).cCX.contains("internet_to_device")) && (!((com.tencent.mm.plugin.exdevice.h.b)this.iuI.get(i)).cCX.contains("wechat_to_device"))) {
          this.iuJ.add(this.iuI.get(i));
        }
        i += 1;
      }
      this.iuQ = new g.3(this);
      this.iuN = new g.4(this);
      this.iuO = new g.5(this);
      this.iuP = new g.6(this);
      au.DF().a(1717, this);
      j.aGV().a(14, this.iuN);
      j.aGV().a(12, this.iuO);
      j.aGV().a(13, this.iuP);
      j.aGV().a(15, this.iuQ);
      x.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "initWCLanDeviceLib...");
      Java2CExDevice.initWCLanDeviceLib();
    }
  }
  
  static String c(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    if (paramb == null) {
      return "";
    }
    String str = null;
    if (!bi.oW(paramb.cCR)) {
      str = paramb.cCR;
    }
    for (;;)
    {
      return bi.oV(str);
      if (!bi.oW(paramb.cCS)) {
        str = paramb.cCS;
      } else if (paramb.field_mac != 0L) {
        str = com.tencent.mm.plugin.exdevice.j.b.cY(paramb.field_mac);
      } else if (!bi.oW(paramb.field_deviceID)) {
        str = paramb.field_deviceID;
      }
    }
  }
  
  static Boolean cC(long paramLong)
  {
    boolean bool2 = false;
    au.HU();
    Object localObject = com.tencent.mm.model.c.FT().dW(paramLong);
    if (((cm)localObject).field_msgId == 0L) {
      return Boolean.valueOf(false);
    }
    String str = ((cm)localObject).field_content;
    boolean bool1 = bool2;
    if (((bd)localObject).getType() == 49)
    {
      localObject = g.a.gp(str);
      bool1 = bool2;
      if (localObject != null)
      {
        bool1 = bool2;
        if (((g.a)localObject).type == 6) {
          bool1 = true;
        }
      }
    }
    return Boolean.valueOf(bool1);
  }
  
  static Boolean cD(long paramLong)
  {
    boolean bool = false;
    au.HU();
    bd localbd = com.tencent.mm.model.c.FT().dW(paramLong);
    if (localbd.field_msgId == 0L) {
      return Boolean.valueOf(false);
    }
    if (localbd.getType() == 3) {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  static Boolean cE(long paramLong)
  {
    boolean bool = false;
    au.HU();
    bd localbd = com.tencent.mm.model.c.FT().dW(paramLong);
    if (localbd.field_msgId == 0L) {
      return Boolean.valueOf(false);
    }
    if (localbd.cmo()) {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  static Boolean cF(long paramLong)
  {
    boolean bool = false;
    au.HU();
    bd localbd = com.tencent.mm.model.c.FT().dW(paramLong);
    if (localbd.field_msgId == 0L) {
      return Boolean.valueOf(false);
    }
    if (localbd.getType() == 62) {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  private String cG(long paramLong)
  {
    String str = "";
    au.HU();
    Object localObject1 = com.tencent.mm.model.c.FT().dW(paramLong);
    if (((cm)localObject1).field_msgId == 0L) {
      localObject1 = "";
    }
    int i;
    do
    {
      Object localObject2;
      do
      {
        do
        {
          do
          {
            do
            {
              return (String)localObject1;
              i = ((bd)localObject1).getType();
              localObject2 = ((cm)localObject1).field_content;
              if (!((bd)localObject1).aQm()) {
                break;
              }
              localObject2 = g.a.gp((String)localObject2);
              if ((localObject2 != null) && ((((g.a)localObject2).type == 6) || (((g.a)localObject2).type == 2)))
              {
                localObject1 = ao.asF().SR(((g.a)localObject2).bGP);
                if (localObject1 != null) {
                  return ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath;
                }
                x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getFilePath attInfo is null");
                return "";
              }
              localObject1 = str;
            } while (localObject2 == null);
            if (((g.a)localObject2).type == 3) {
              break;
            }
            localObject1 = str;
          } while (((g.a)localObject2).type != 5);
          this.iuv = true;
          return "";
          if (i != 3) {
            break;
          }
          localObject2 = com.tencent.mm.ak.o.Pf().q((bd)localObject1);
          localObject1 = str;
        } while (localObject2 == null);
        str = com.tencent.mm.ak.o.Pf().lN(((com.tencent.mm.ak.e)localObject2).dTL);
        localObject1 = str;
      } while (!bi.oW(str));
      return com.tencent.mm.ak.o.Pf().lN(((com.tencent.mm.ak.e)localObject2).dTN);
      if (i == 62)
      {
        com.tencent.mm.modelvideo.o.Ta();
        return s.nK(((cm)localObject1).field_imgPath);
      }
      localObject1 = str;
    } while (i != 48);
    this.iuv = true;
    return "";
  }
  
  static void cx(String paramString1, String paramString2)
  {
    ed localed = new ed();
    localed.bLX.bLZ = paramString2;
    localed.bLX.byN = paramString1;
    a.sFg.m(localed);
  }
  
  /* Error */
  static String y(String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: iconst_0
    //   8: aload_0
    //   9: ldc_w 456
    //   12: invokevirtual 460	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   15: invokevirtual 464	java/lang/String:substring	(II)Ljava/lang/String;
    //   18: astore_3
    //   19: new 466	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 468
    //   26: invokespecial 471	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: aload_0
    //   30: invokevirtual 474	java/lang/String:hashCode	()I
    //   33: invokevirtual 478	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   36: invokevirtual 482	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: astore 4
    //   41: new 466	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 483	java/lang/StringBuilder:<init>	()V
    //   48: aload_3
    //   49: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: ldc_w 456
    //   55: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload 4
    //   60: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 482	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: astore 6
    //   68: new 488	com/tencent/mm/modelsfs/c
    //   71: dup
    //   72: new 490	java/io/File
    //   75: dup
    //   76: aload 6
    //   78: invokespecial 491	java/io/File:<init>	(Ljava/lang/String;)V
    //   81: lload_1
    //   82: invokespecial 494	com/tencent/mm/modelsfs/c:<init>	(Ljava/io/File;J)V
    //   85: astore_3
    //   86: aload_0
    //   87: invokestatic 500	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   90: astore_0
    //   91: aload_0
    //   92: astore 5
    //   94: aload_3
    //   95: astore 4
    //   97: sipush 1024
    //   100: newarray <illegal type>
    //   102: astore 7
    //   104: aload_0
    //   105: astore 5
    //   107: aload_3
    //   108: astore 4
    //   110: aload_0
    //   111: aload 7
    //   113: invokevirtual 506	java/io/InputStream:read	([B)I
    //   116: iconst_m1
    //   117: if_icmpeq +83 -> 200
    //   120: aload_0
    //   121: astore 5
    //   123: aload_3
    //   124: astore 4
    //   126: aload_3
    //   127: aload 7
    //   129: invokevirtual 512	java/io/OutputStream:write	([B)V
    //   132: goto -28 -> 104
    //   135: astore 6
    //   137: aload_0
    //   138: astore 5
    //   140: aload_3
    //   141: astore 4
    //   143: ldc -115
    //   145: ldc_w 514
    //   148: iconst_1
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload 6
    //   156: invokevirtual 517	java/io/IOException:getMessage	()Ljava/lang/String;
    //   159: aastore
    //   160: invokestatic 519	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_3
    //   164: ifnull +11 -> 175
    //   167: aload_3
    //   168: invokevirtual 522	java/io/OutputStream:flush	()V
    //   171: aload_3
    //   172: invokevirtual 525	java/io/OutputStream:close	()V
    //   175: aload_0
    //   176: ifnull -172 -> 4
    //   179: aload_0
    //   180: invokevirtual 526	java/io/InputStream:close	()V
    //   183: aconst_null
    //   184: areturn
    //   185: astore_0
    //   186: ldc -115
    //   188: aload_0
    //   189: ldc 88
    //   191: iconst_0
    //   192: anewarray 4	java/lang/Object
    //   195: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: aconst_null
    //   199: areturn
    //   200: aload_3
    //   201: invokevirtual 522	java/io/OutputStream:flush	()V
    //   204: aload_3
    //   205: invokevirtual 525	java/io/OutputStream:close	()V
    //   208: aload_0
    //   209: ifnull +7 -> 216
    //   212: aload_0
    //   213: invokevirtual 526	java/io/InputStream:close	()V
    //   216: aload 6
    //   218: areturn
    //   219: astore_0
    //   220: ldc -115
    //   222: aload_0
    //   223: ldc 88
    //   225: iconst_0
    //   226: anewarray 4	java/lang/Object
    //   229: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: aconst_null
    //   233: areturn
    //   234: astore_0
    //   235: ldc -115
    //   237: aload_0
    //   238: ldc 88
    //   240: iconst_0
    //   241: anewarray 4	java/lang/Object
    //   244: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: aconst_null
    //   248: areturn
    //   249: astore_0
    //   250: ldc -115
    //   252: aload_0
    //   253: ldc 88
    //   255: iconst_0
    //   256: anewarray 4	java/lang/Object
    //   259: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   262: aconst_null
    //   263: areturn
    //   264: astore_0
    //   265: aconst_null
    //   266: astore 5
    //   268: aconst_null
    //   269: astore_3
    //   270: aload_3
    //   271: ifnull +11 -> 282
    //   274: aload_3
    //   275: invokevirtual 522	java/io/OutputStream:flush	()V
    //   278: aload_3
    //   279: invokevirtual 525	java/io/OutputStream:close	()V
    //   282: aload 5
    //   284: ifnull +8 -> 292
    //   287: aload 5
    //   289: invokevirtual 526	java/io/InputStream:close	()V
    //   292: aload_0
    //   293: athrow
    //   294: astore_0
    //   295: ldc -115
    //   297: aload_0
    //   298: ldc 88
    //   300: iconst_0
    //   301: anewarray 4	java/lang/Object
    //   304: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   307: aconst_null
    //   308: areturn
    //   309: astore_0
    //   310: ldc -115
    //   312: aload_0
    //   313: ldc 88
    //   315: iconst_0
    //   316: anewarray 4	java/lang/Object
    //   319: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   322: aconst_null
    //   323: areturn
    //   324: astore_0
    //   325: aconst_null
    //   326: astore 5
    //   328: goto -58 -> 270
    //   331: astore_0
    //   332: aload 4
    //   334: astore_3
    //   335: goto -65 -> 270
    //   338: astore 6
    //   340: aconst_null
    //   341: astore_0
    //   342: aconst_null
    //   343: astore_3
    //   344: goto -207 -> 137
    //   347: astore 6
    //   349: aconst_null
    //   350: astore_0
    //   351: goto -214 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	354	0	paramString	String
    //   0	354	1	paramLong	long
    //   18	326	3	localObject1	Object
    //   39	294	4	localObject2	Object
    //   92	235	5	str1	String
    //   66	11	6	str2	String
    //   135	82	6	localIOException1	java.io.IOException
    //   338	1	6	localIOException2	java.io.IOException
    //   347	1	6	localIOException3	java.io.IOException
    //   102	26	7	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   97	104	135	java/io/IOException
    //   110	120	135	java/io/IOException
    //   126	132	135	java/io/IOException
    //   179	183	185	java/io/IOException
    //   200	208	219	java/io/IOException
    //   212	216	234	java/io/IOException
    //   167	175	249	java/io/IOException
    //   68	86	264	finally
    //   274	282	294	java/io/IOException
    //   287	292	309	java/io/IOException
    //   86	91	324	finally
    //   97	104	331	finally
    //   110	120	331	finally
    //   126	132	331	finally
    //   143	163	331	finally
    //   68	86	338	java/io/IOException
    //   86	91	347	java/io/IOException
  }
  
  /* Error */
  public static byte[] zX(String paramString)
  {
    // Byte code:
    //   0: ldc -115
    //   2: ldc_w 536
    //   5: iconst_1
    //   6: anewarray 4	java/lang/Object
    //   9: dup
    //   10: iconst_0
    //   11: aload_0
    //   12: aastore
    //   13: invokestatic 155	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   16: aload_0
    //   17: aconst_null
    //   18: invokestatic 541	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   21: astore_2
    //   22: aload_2
    //   23: ldc_w 543
    //   26: invokevirtual 548	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   29: aload_2
    //   30: sipush 25000
    //   33: invokevirtual 552	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   36: aload_2
    //   37: sipush 25000
    //   40: invokevirtual 555	com/tencent/mm/network/u:setReadTimeout	(I)V
    //   43: aload_2
    //   44: invokevirtual 559	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   47: astore_3
    //   48: aload_2
    //   49: invokevirtual 562	com/tencent/mm/network/u:getResponseCode	()I
    //   52: sipush 200
    //   55: if_icmpne +232 -> 287
    //   58: new 564	java/io/ByteArrayOutputStream
    //   61: dup
    //   62: invokespecial 565	java/io/ByteArrayOutputStream:<init>	()V
    //   65: astore_0
    //   66: aload_2
    //   67: astore 7
    //   69: aload_3
    //   70: astore 6
    //   72: aload_0
    //   73: astore 5
    //   75: sipush 1024
    //   78: newarray <illegal type>
    //   80: astore 4
    //   82: aload_2
    //   83: astore 7
    //   85: aload_3
    //   86: astore 6
    //   88: aload_0
    //   89: astore 5
    //   91: aload_3
    //   92: aload 4
    //   94: invokevirtual 506	java/io/InputStream:read	([B)I
    //   97: istore_1
    //   98: iload_1
    //   99: iconst_m1
    //   100: if_icmpeq +76 -> 176
    //   103: aload_2
    //   104: astore 7
    //   106: aload_3
    //   107: astore 6
    //   109: aload_0
    //   110: astore 5
    //   112: aload_0
    //   113: aload 4
    //   115: iconst_0
    //   116: iload_1
    //   117: invokevirtual 568	java/io/ByteArrayOutputStream:write	([BII)V
    //   120: goto -38 -> 82
    //   123: astore 4
    //   125: aload_2
    //   126: astore 7
    //   128: aload_3
    //   129: astore 6
    //   131: aload_0
    //   132: astore 5
    //   134: ldc -115
    //   136: aload 4
    //   138: ldc 88
    //   140: iconst_0
    //   141: anewarray 4	java/lang/Object
    //   144: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_0
    //   148: ifnull +7 -> 155
    //   151: aload_0
    //   152: invokevirtual 569	java/io/ByteArrayOutputStream:close	()V
    //   155: aload_3
    //   156: ifnull +7 -> 163
    //   159: aload_3
    //   160: invokevirtual 526	java/io/InputStream:close	()V
    //   163: aload_2
    //   164: ifnull +10 -> 174
    //   167: aload_2
    //   168: getfield 573	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   171: invokevirtual 578	java/net/HttpURLConnection:disconnect	()V
    //   174: aconst_null
    //   175: areturn
    //   176: aload_2
    //   177: astore 7
    //   179: aload_3
    //   180: astore 6
    //   182: aload_0
    //   183: astore 5
    //   185: aload_0
    //   186: invokevirtual 569	java/io/ByteArrayOutputStream:close	()V
    //   189: aload_2
    //   190: astore 7
    //   192: aload_3
    //   193: astore 6
    //   195: aload_0
    //   196: astore 5
    //   198: aload_3
    //   199: invokevirtual 526	java/io/InputStream:close	()V
    //   202: aload_2
    //   203: astore 7
    //   205: aload_3
    //   206: astore 6
    //   208: aload_0
    //   209: astore 5
    //   211: aload_2
    //   212: getfield 573	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   215: invokevirtual 578	java/net/HttpURLConnection:disconnect	()V
    //   218: aload_2
    //   219: astore 7
    //   221: aload_3
    //   222: astore 6
    //   224: aload_0
    //   225: astore 5
    //   227: aload_0
    //   228: invokevirtual 582	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   231: astore 4
    //   233: aload_0
    //   234: invokevirtual 569	java/io/ByteArrayOutputStream:close	()V
    //   237: aload_3
    //   238: ifnull +7 -> 245
    //   241: aload_3
    //   242: invokevirtual 526	java/io/InputStream:close	()V
    //   245: aload_2
    //   246: getfield 573	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   249: invokevirtual 578	java/net/HttpURLConnection:disconnect	()V
    //   252: aload 4
    //   254: areturn
    //   255: astore_0
    //   256: ldc -115
    //   258: aload_0
    //   259: ldc 88
    //   261: iconst_0
    //   262: anewarray 4	java/lang/Object
    //   265: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: goto -31 -> 237
    //   271: astore_0
    //   272: ldc -115
    //   274: aload_0
    //   275: ldc 88
    //   277: iconst_0
    //   278: anewarray 4	java/lang/Object
    //   281: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: goto -39 -> 245
    //   287: aload_3
    //   288: ifnull +7 -> 295
    //   291: aload_3
    //   292: invokevirtual 526	java/io/InputStream:close	()V
    //   295: aload_2
    //   296: getfield 573	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   299: invokevirtual 578	java/net/HttpURLConnection:disconnect	()V
    //   302: aconst_null
    //   303: areturn
    //   304: astore_0
    //   305: ldc -115
    //   307: aload_0
    //   308: ldc 88
    //   310: iconst_0
    //   311: anewarray 4	java/lang/Object
    //   314: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: goto -22 -> 295
    //   320: astore_0
    //   321: ldc -115
    //   323: aload_0
    //   324: ldc 88
    //   326: iconst_0
    //   327: anewarray 4	java/lang/Object
    //   330: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   333: goto -178 -> 155
    //   336: astore_0
    //   337: ldc -115
    //   339: aload_0
    //   340: ldc 88
    //   342: iconst_0
    //   343: anewarray 4	java/lang/Object
    //   346: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   349: goto -186 -> 163
    //   352: astore_0
    //   353: aconst_null
    //   354: astore 7
    //   356: aconst_null
    //   357: astore_3
    //   358: aconst_null
    //   359: astore_2
    //   360: aload_2
    //   361: ifnull +7 -> 368
    //   364: aload_2
    //   365: invokevirtual 569	java/io/ByteArrayOutputStream:close	()V
    //   368: aload_3
    //   369: ifnull +7 -> 376
    //   372: aload_3
    //   373: invokevirtual 526	java/io/InputStream:close	()V
    //   376: aload 7
    //   378: ifnull +11 -> 389
    //   381: aload 7
    //   383: getfield 573	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   386: invokevirtual 578	java/net/HttpURLConnection:disconnect	()V
    //   389: aload_0
    //   390: athrow
    //   391: astore_2
    //   392: ldc -115
    //   394: aload_2
    //   395: ldc 88
    //   397: iconst_0
    //   398: anewarray 4	java/lang/Object
    //   401: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   404: goto -36 -> 368
    //   407: astore_2
    //   408: ldc -115
    //   410: aload_2
    //   411: ldc 88
    //   413: iconst_0
    //   414: anewarray 4	java/lang/Object
    //   417: invokestatic 530	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   420: goto -44 -> 376
    //   423: astore_0
    //   424: aconst_null
    //   425: astore_3
    //   426: aconst_null
    //   427: astore 4
    //   429: aload_2
    //   430: astore 7
    //   432: aload 4
    //   434: astore_2
    //   435: goto -75 -> 360
    //   438: astore_0
    //   439: aconst_null
    //   440: astore 4
    //   442: aload_2
    //   443: astore 7
    //   445: aload 4
    //   447: astore_2
    //   448: goto -88 -> 360
    //   451: astore_0
    //   452: aload 6
    //   454: astore_3
    //   455: aload 5
    //   457: astore_2
    //   458: goto -98 -> 360
    //   461: astore 4
    //   463: aconst_null
    //   464: astore_2
    //   465: aconst_null
    //   466: astore_3
    //   467: aconst_null
    //   468: astore_0
    //   469: goto -344 -> 125
    //   472: astore 4
    //   474: aconst_null
    //   475: astore_3
    //   476: aconst_null
    //   477: astore_0
    //   478: goto -353 -> 125
    //   481: astore 4
    //   483: aconst_null
    //   484: astore_0
    //   485: goto -360 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	488	0	paramString	String
    //   97	20	1	i	int
    //   21	344	2	localu	com.tencent.mm.network.u
    //   391	4	2	localIOException1	java.io.IOException
    //   407	23	2	localIOException2	java.io.IOException
    //   434	31	2	localObject1	Object
    //   47	429	3	localObject2	Object
    //   80	34	4	arrayOfByte1	byte[]
    //   123	14	4	localException1	Exception
    //   231	215	4	arrayOfByte2	byte[]
    //   461	1	4	localException2	Exception
    //   472	1	4	localException3	Exception
    //   481	1	4	localException4	Exception
    //   73	383	5	str	String
    //   70	383	6	localObject3	Object
    //   67	377	7	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   75	82	123	java/lang/Exception
    //   91	98	123	java/lang/Exception
    //   112	120	123	java/lang/Exception
    //   185	189	123	java/lang/Exception
    //   198	202	123	java/lang/Exception
    //   211	218	123	java/lang/Exception
    //   227	233	123	java/lang/Exception
    //   233	237	255	java/io/IOException
    //   241	245	271	java/io/IOException
    //   291	295	304	java/io/IOException
    //   151	155	320	java/io/IOException
    //   159	163	336	java/io/IOException
    //   16	22	352	finally
    //   364	368	391	java/io/IOException
    //   372	376	407	java/io/IOException
    //   22	48	423	finally
    //   48	66	438	finally
    //   75	82	451	finally
    //   91	98	451	finally
    //   112	120	451	finally
    //   134	147	451	finally
    //   185	189	451	finally
    //   198	202	451	finally
    //   211	218	451	finally
    //   227	233	451	finally
    //   16	22	461	java/lang/Exception
    //   22	48	472	java/lang/Exception
    //   48	66	481	java/lang/Exception
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paraml == null) {
      x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "scene is null.");
    }
    while (!(paraml instanceof n)) {
      return;
    }
    Object localObject = (n)paraml;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "NetSceneGetAppMsgInfo onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      cx(((n)localObject).byN, this.iuB);
      return;
    }
    if ((((n)localObject).diG != null) && (((n)localObject).diG.dIE.dIL != null)) {}
    for (paramString = (btx)((n)localObject).diG.dIE.dIL;; paramString = null)
    {
      paraml = paramString.srp;
      if (1 != ((n)localObject).ivD) {
        break;
      }
      cx(((n)localObject).byN, this.iuA);
      return;
    }
    localObject = ((n)localObject).byN;
    String str = (String)this.iuK.get(localObject);
    cx((String)localObject, this.iuC);
    if ((this.iuw) && (this.iux != null)) {}
    for (paramString = this.iuy; (str == null) || (str.length() == 0); paramString = cG(this.cYP))
    {
      x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "mDeviceInfo error");
      cx((String)localObject, this.iuB);
      return;
    }
    if (!this.iuu)
    {
      x.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "onItemClick stop scan...");
      Java2CExDevice.stopScanWCLanDevice();
      this.iuu = true;
    }
    if ((!this.iuM.containsKey(localObject)) || (!((Boolean)this.iuM.get(localObject)).booleanValue()))
    {
      x.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice mDeviceInfo: " + str);
      if (Java2CExDevice.connectWCLanDevice(str.getBytes(), true) != 0)
      {
        cx((String)localObject, this.iuB);
        x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice error!");
      }
    }
    if (this.iuv)
    {
      paramInt1 = Java2CExDevice.useWCLanDeviceService(str.getBytes(), paraml.getBytes());
      if (paramInt1 != 0)
      {
        this.iuW.put(Integer.valueOf(paramInt1), localObject);
        this.iuL.put(localObject, Integer.valueOf(paramInt1));
        x.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get useWCLanDeviceService mCallBackCmdId: " + paramInt1);
        return;
      }
      cx((String)localObject, this.iuB);
      x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "useWCLanDeviceService error!");
      return;
    }
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file path is error");
      cx((String)localObject, this.iuB);
      return;
    }
    paramInt1 = Java2CExDevice.sendFileToWCLanDevice(str.getBytes(), paraml.getBytes(), paramString.getBytes());
    if (paramInt1 != 0)
    {
      this.iuW.put(Integer.valueOf(paramInt1), localObject);
      this.iuL.put(localObject, Integer.valueOf(paramInt1));
      x.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get sendFileToWCLanDevice mCallBackCmdId =" + paramInt1);
      return;
    }
    cx((String)localObject, this.iuB);
    x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "sendFileToWCLanDevice error!");
  }
  
  final boolean a(amw paramamw, long paramLong)
  {
    int j = -1;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    String str = cG(paramLong);
    Object localObject3 = localObject6;
    Object localObject2 = localObject5;
    Object localObject1 = localObject4;
    int i = j;
    if (str != null)
    {
      localObject3 = localObject6;
      localObject2 = localObject5;
      localObject1 = localObject4;
      i = j;
      if (str.length() > 0)
      {
        localObject1 = new File(str);
        localObject2 = ((File)localObject1).getName();
        i = (int)((File)localObject1).length();
        localObject3 = ((String)localObject2).substring(((String)localObject2).lastIndexOf(".") + 1, ((String)localObject2).length());
        localObject1 = com.tencent.mm.a.g.m((File)localObject1);
        x.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "filePath %s", new Object[] { str });
        x.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "fileSize %s", new Object[] { Integer.valueOf(i) });
        x.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "fileMd5 %s", new Object[] { localObject1 });
      }
    }
    au.HU();
    localObject4 = com.tencent.mm.model.c.FT().dW(paramLong);
    if (((cm)localObject4).field_msgId == 0L)
    {
      x.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "msgInfo or msgInfo.getMsgId() = 0");
      return false;
    }
    switch (((bd)localObject4).getType())
    {
    }
    for (;;)
    {
      return true;
      localObject3 = g.a.gp(((cm)localObject4).field_content);
      if (localObject3 == null)
      {
        x.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get content is null");
        return false;
      }
      if (((g.a)localObject3).type == 3)
      {
        localObject1 = new amz();
        ((amz)localObject1).bHD = ((g.a)localObject3).title;
        ((amz)localObject1).rPM = ((g.a)localObject3).description;
        ((amz)localObject1).jPK = ((g.a)localObject3).url;
        ((amz)localObject1).rPN = ((g.a)localObject3).dwn;
        ((amz)localObject1).rst = ((g.a)localObject3).dwN;
        ((amz)localObject1).rPO = ((g.a)localObject3).dwO;
        ((amz)localObject1).jSv = ((g.a)localObject3).appName;
        ((amz)localObject1).rPP = ((g.a)localObject3).dwE;
        ((amz)localObject1).rPQ = ((g.a)localObject3).dwF;
        ((amz)localObject1).rPR = ((g.a)localObject3).dwL;
        paramamw.rPD = ((amz)localObject1);
        paramamw.rPC = 1;
      }
      else if (((g.a)localObject3).type == 6)
      {
        localObject2 = new amv();
        ((amv)localObject2).rxo = ((g.a)localObject3).dwp;
        ((amv)localObject2).jPe = ((g.a)localObject3).title;
        ((amv)localObject2).hcy = i;
        ((amv)localObject2).rwk = ((String)localObject1);
        paramamw.rPG = ((amv)localObject2);
        paramamw.rPC = 4;
      }
      else if (((g.a)localObject3).type == 5)
      {
        localObject1 = new ana();
        ((ana)localObject1).jPK = ((g.a)localObject3).url;
        ((ana)localObject1).bHD = ((g.a)localObject3).title;
        ((ana)localObject1).rPM = ((g.a)localObject3).description;
        ((ana)localObject1).jSv = ((g.a)localObject3).appName;
        paramamw.rPH = ((ana)localObject1);
        paramamw.rPC = 5;
      }
      else if (((g.a)localObject3).type == 2)
      {
        localObject3 = new amx();
        ((amx)localObject3).rxo = "jpg";
        ((amx)localObject3).jPe = ((String)localObject2);
        ((amx)localObject3).hcy = i;
        ((amx)localObject3).rwk = ((String)localObject1);
        paramamw.rPF = ((amx)localObject3);
        paramamw.rPC = 3;
        continue;
        localObject4 = new amx();
        ((amx)localObject4).rxo = ((String)localObject3);
        ((amx)localObject4).jPe = ((String)localObject2);
        ((amx)localObject4).hcy = i;
        ((amx)localObject4).rwk = ((String)localObject1);
        paramamw.rPF = ((amx)localObject4);
        paramamw.rPC = 3;
        continue;
        au.HU();
        localObject1 = com.tencent.mm.model.c.FT().GS(((cm)localObject4).field_content);
        localObject2 = new amy();
        ((amy)localObject2).rjG = ((float)((bd.b)localObject1).kCw);
        ((amy)localObject2).rjH = ((float)((bd.b)localObject1).kCx);
        ((amy)localObject2).rPK = ((bd.b)localObject1).bSz;
        ((amy)localObject2).jTh = ((bd.b)localObject1).label;
        ((amy)localObject2).rPL = ((bd.b)localObject1).kFa;
        paramamw.rPE = ((amy)localObject2);
        paramamw.rPC = 2;
        continue;
        localObject4 = new anb();
        ((anb)localObject4).rxo = ((String)localObject3);
        ((anb)localObject4).hcy = i;
        ((anb)localObject4).rwk = ((String)localObject1);
        ((anb)localObject4).jPe = ((String)localObject2);
        paramamw.rPI = ((anb)localObject4);
        paramamw.rPC = 6;
      }
    }
  }
  
  public final bsu aGT()
  {
    hu localhu = new hu();
    localhu.bRf.bKW = this.iux;
    a.sFg.m(localhu);
    return localhu.bRg.bRh;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
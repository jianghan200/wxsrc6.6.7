package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.memory.l;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.atb;
import com.tencent.mm.protocal.c.ath;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS SnsMedia ( local_id INTEGER PRIMARY KEY, seqId LONG, type INT, createTime LONG, userName VARCHAR(40), totallen INT, offset INT, local_flag INT, tmp_path TEXT, nums INT, try_times INT, StrId VARCHAR(40), upload_buf TEXT, reserved1 INT, reserved2 TEXT, reserved3 TEXT, reserved4 TEXT, reserved5 TEXT )", "CREATE INDEX IF NOT EXISTS serverSnsMediaTimeIndex ON SnsMedia ( createTime )" };
  private static int niY = 0;
  private static int nig = 0;
  private static Point nqm = new Point();
  public com.tencent.mm.bt.h dCZ;
  
  public s(com.tencent.mm.bt.h paramh)
  {
    this.dCZ = paramh;
  }
  
  /* Error */
  public static boolean NB(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: invokestatic 51	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   8: astore_0
    //   9: aload_0
    //   10: astore_2
    //   11: aload_0
    //   12: astore_3
    //   13: new 53	android/graphics/BitmapFactory$Options
    //   16: dup
    //   17: invokespecial 54	android/graphics/BitmapFactory$Options:<init>	()V
    //   20: astore 4
    //   22: aload_0
    //   23: astore_2
    //   24: aload_0
    //   25: astore_3
    //   26: aload 4
    //   28: iconst_1
    //   29: putfield 58	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   32: aload_0
    //   33: astore_2
    //   34: aload_0
    //   35: astore_3
    //   36: aload_0
    //   37: aconst_null
    //   38: aload 4
    //   40: aconst_null
    //   41: iconst_0
    //   42: iconst_0
    //   43: newarray <illegal type>
    //   45: invokestatic 64	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   48: pop
    //   49: aload_0
    //   50: astore_2
    //   51: aload_0
    //   52: astore_3
    //   53: aload 4
    //   55: getfield 68	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   58: astore 4
    //   60: aload_0
    //   61: astore_2
    //   62: aload_0
    //   63: astore_3
    //   64: ldc 70
    //   66: new 72	java/lang/StringBuilder
    //   69: dup
    //   70: ldc 74
    //   72: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload 4
    //   77: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokestatic 91	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: aload_0
    //   87: astore_2
    //   88: aload_0
    //   89: astore_3
    //   90: aload 4
    //   92: invokevirtual 94	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   95: ldc 96
    //   97: invokevirtual 100	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   100: istore_1
    //   101: iload_1
    //   102: iflt +13 -> 115
    //   105: aload_0
    //   106: ifnull +7 -> 113
    //   109: aload_0
    //   110: invokevirtual 105	java/io/InputStream:close	()V
    //   113: iconst_1
    //   114: ireturn
    //   115: aload_0
    //   116: ifnull +7 -> 123
    //   119: aload_0
    //   120: invokevirtual 105	java/io/InputStream:close	()V
    //   123: iconst_0
    //   124: ireturn
    //   125: astore_0
    //   126: aload_2
    //   127: ifnull +7 -> 134
    //   130: aload_2
    //   131: invokevirtual 105	java/io/InputStream:close	()V
    //   134: iconst_0
    //   135: ireturn
    //   136: astore_0
    //   137: aload_3
    //   138: ifnull +7 -> 145
    //   141: aload_3
    //   142: invokevirtual 105	java/io/InputStream:close	()V
    //   145: aload_0
    //   146: athrow
    //   147: astore_0
    //   148: goto -35 -> 113
    //   151: astore_0
    //   152: goto -29 -> 123
    //   155: astore_0
    //   156: goto -22 -> 134
    //   159: astore_2
    //   160: goto -15 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramString	String
    //   100	2	1	i	int
    //   3	128	2	str1	String
    //   159	1	2	localIOException	IOException
    //   1	141	3	str2	String
    //   20	71	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	9	125	java/lang/Exception
    //   13	22	125	java/lang/Exception
    //   26	32	125	java/lang/Exception
    //   36	49	125	java/lang/Exception
    //   53	60	125	java/lang/Exception
    //   64	86	125	java/lang/Exception
    //   90	101	125	java/lang/Exception
    //   4	9	136	finally
    //   13	22	136	finally
    //   26	32	136	finally
    //   36	49	136	finally
    //   53	60	136	finally
    //   64	86	136	finally
    //   90	101	136	finally
    //   109	113	147	java/io/IOException
    //   119	123	151	java/io/IOException
    //   130	134	155	java/io/IOException
    //   141	145	159	java/io/IOException
  }
  
  public static Bitmap NC(String paramString)
  {
    int j = 640;
    Object localObject1 = c.VZ(paramString);
    int i;
    if (((BitmapFactory.Options)localObject1).outWidth >= ((BitmapFactory.Options)localObject1).outHeight)
    {
      i = 960;
      if (((BitmapFactory.Options)localObject1).outWidth < ((BitmapFactory.Options)localObject1).outHeight) {
        break label98;
      }
    }
    Object localObject2;
    for (;;)
    {
      localObject2 = new MMBitmapFactory.DecodeResultLogger();
      localObject1 = c.a(paramString, j, i, false, (MMBitmapFactory.DecodeResultLogger)localObject2, 0);
      if (localObject1 != null) {
        break label105;
      }
      if (((MMBitmapFactory.DecodeResultLogger)localObject2).getDecodeResult() >= 2000)
      {
        paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 10, (MMBitmapFactory.DecodeResultLogger)localObject2);
        com.tencent.mm.plugin.report.service.h.mEJ.k(12712, paramString);
      }
      return null;
      i = 640;
      break;
      label98:
      j = 960;
    }
    try
    {
      label105:
      localObject2 = new Exif();
      ((Exif)localObject2).parseFromFile(paramString);
      localObject2 = c.b((Bitmap)localObject1, ((Exif)localObject2).getOrientationInDegree());
      return (Bitmap)localObject2;
    }
    catch (IOException localIOException)
    {
      x.printErrStackTrace("MicroMsg.snsMediaStorage", localIOException, "parse exif failed: " + paramString, new Object[0]);
    }
    return (Bitmap)localObject1;
  }
  
  private static String Nz(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    String str2 = com.tencent.mm.a.g.u(paramString.getBytes());
    paramString = "";
    String str1 = "";
    if (str2.length() > 0) {
      paramString = str2.charAt(0) + "/";
    }
    if (str2.length() >= 2) {
      str1 = str2.charAt(1) + "/";
    }
    return com.tencent.mm.plugin.sns.model.af.getAccSnsPath() + paramString + str1;
  }
  
  private int a(com.tencent.mm.plugin.sns.data.h paramh)
  {
    Object localObject1 = com.tencent.mm.plugin.sns.model.af.getAccSnsPath();
    String str1 = com.tencent.mm.plugin.sns.model.af.getAccSnsTmpPath();
    x.i("MicroMsg.snsMediaStorage", "SnsMediaStorage %s %s", new Object[] { localObject1, str1 });
    long l = System.currentTimeMillis();
    Object localObject3 = paramh.path;
    int i = paramh.type;
    if (!FileOp.cn((String)localObject3)) {
      return -1;
    }
    Object localObject2 = com.tencent.mm.a.g.u(((String)localObject3 + System.currentTimeMillis()).getBytes());
    String str2 = i.LE((String)localObject2);
    x.d("MicroMsg.snsMediaStorage", "insert : original img path = " + (String)localObject3);
    if (!FileOp.cn(str1))
    {
      x.i("MicroMsg.snsMediaStorage", "create snstmp path " + str1);
      FileOp.mL(str1);
    }
    if (!FileOp.cn((String)localObject1))
    {
      x.i("MicroMsg.snsMediaStorage", "create snsPath " + (String)localObject1);
      FileOp.mL((String)localObject1);
    }
    localObject1 = new com.tencent.mm.plugin.p.a();
    paramh = a(paramh, (String)localObject3);
    int j = paramh.width;
    int k = paramh.height;
    int m = paramh.fileSize;
    ((com.tencent.mm.plugin.p.a)localObject1).knp = ((String)localObject3);
    ((com.tencent.mm.plugin.p.a)localObject1).knr = j;
    ((com.tencent.mm.plugin.p.a)localObject1).kns = k;
    ((com.tencent.mm.plugin.p.a)localObject1).knt = m;
    if (!e(str1, (String)localObject3, str2, true)) {
      return -1;
    }
    x.d("MicroMsg.snsMediaStorage", "insert0 " + (System.currentTimeMillis() - l));
    x.d("MicroMsg.snsMediaStorage", "insert: compressed bigMediaPath = " + str2);
    j = (int)FileOp.mI(str1 + str2);
    if ((((String)localObject3).toLowerCase().contains("jpg")) || (((String)localObject3).toLowerCase().contains("jpeg")))
    {
      localObject3 = c.bu(FileOp.e((String)localObject3, 0, j));
      if (localObject3 != null) {
        x.i("MicroMsg.snsMediaStorage", "insert yuvInfo:%s", new Object[] { localObject3 });
      }
    }
    try
    {
      localObject4 = new ExifInterface(str1 + str2);
      ((ExifInterface)localObject4).setAttribute("UserComment", (String)localObject3);
      ((ExifInterface)localObject4).saveAttributes();
      j = (int)FileOp.mI(str1 + str2);
      localObject3 = a(paramh, str1 + str2);
      k = ((com.tencent.mm.plugin.sns.data.h)localObject3).width;
      m = ((com.tencent.mm.plugin.sns.data.h)localObject3).height;
      ((com.tencent.mm.plugin.p.a)localObject1).knu = k;
      ((com.tencent.mm.plugin.p.a)localObject1).knv = m;
      ((com.tencent.mm.plugin.p.a)localObject1).knw = j;
      paramh = new r();
      paramh.nJI = ((String)localObject2);
      paramh.createTime = ((int)bi.VE());
      paramh.type = i;
      localObject2 = new ath();
      ((ath)localObject2).rVG = ((com.tencent.mm.plugin.sns.data.h)localObject3).nkY;
      ((ath)localObject2).rWb = ((com.tencent.mm.plugin.sns.data.h)localObject3).nkX;
      ((ath)localObject2).token = ((com.tencent.mm.plugin.sns.data.h)localObject3).nla;
      ((ath)localObject2).rWk = ((com.tencent.mm.plugin.sns.data.h)localObject3).nlb;
      ((ath)localObject2).rWy = 0;
      ((ath)localObject2).rWx = new atb();
      ((ath)localObject2).dHg = 0;
      ((ath)localObject2).jOS = ((com.tencent.mm.plugin.sns.data.h)localObject3).desc;
      x.d("MicroMsg.snsMediaStorage", "upload.filterId " + ((com.tencent.mm.plugin.sns.data.h)localObject3).nkW);
      ((ath)localObject2).rWa = ((com.tencent.mm.plugin.sns.data.h)localObject3).nkW;
      ((ath)localObject2).rWA = 2;
      ((ath)localObject2).bKg = com.tencent.mm.a.g.cu(str1 + str2);
    }
    catch (Exception localException2)
    {
      try
      {
        Object localObject4;
        paramh.nJM = ((ath)localObject2).toByteArray();
        paramh.bBB();
        paramh.nJH = j;
        x.i("MicroMsg.snsMediaStorage", "insert a local snsMedia  totallen  :" + j + " filepath: " + str1 + str2);
        j = (int)this.dCZ.insert("SnsMedia", "local_id", paramh.bBA());
        x.d("MicroMsg.snsMediaStorage", "insert localId " + j);
        localObject2 = "Locall_path" + j;
        ((com.tencent.mm.plugin.p.a)localObject1).knq = String.valueOf(j);
        localObject3 = Exif.fromFile(((com.tencent.mm.plugin.p.a)localObject1).knp);
        i = 0;
        if (((com.tencent.mm.plugin.p.a)localObject1).knp.indexOf("png") >= 0)
        {
          i = 1;
          localObject4 = new d();
          ((d)localObject4).r("20 localID", ((com.tencent.mm.plugin.p.a)localObject1).knq + ",");
          ((d)localObject4).r("21 MediaType", i + ",");
          ((d)localObject4).r("22 OriginWidth", ((com.tencent.mm.plugin.p.a)localObject1).knr + ",");
          ((d)localObject4).r("23 OriginHeight", ((com.tencent.mm.plugin.p.a)localObject1).kns + ",");
          ((d)localObject4).r("24 CompressedWidth", ((com.tencent.mm.plugin.p.a)localObject1).knu + ",");
          ((d)localObject4).r("25 CompressedHeight", ((com.tencent.mm.plugin.p.a)localObject1).knv + ",");
          ((d)localObject4).r("26 OriginSize", ((com.tencent.mm.plugin.p.a)localObject1).knt + ",");
          ((d)localObject4).r("27 CompressedSize", ((com.tencent.mm.plugin.p.a)localObject1).knw + ",");
          ((d)localObject4).r("28 FNumber", ((Exif)localObject3).fNumber + ",");
          ((d)localObject4).r("29 ExposureTime", ((Exif)localObject3).exposureTime + ",");
          ((d)localObject4).r("30 ISO", ((Exif)localObject3).isoSpeedRatings + ",");
          ((d)localObject4).r("31 Flash", ((Exif)localObject3).flash + ",");
          ((d)localObject4).r("32 LensModel", com.tencent.mm.plugin.p.a.EK(((Exif)localObject3).model) + ",");
          ((d)localObject4).r("33 CreatTime", com.tencent.mm.plugin.p.a.EK(((Exif)localObject3).dateTimeOriginal) + ",");
          ((d)localObject4).r("34 IsFromWeChat", "0,");
          ((d)localObject4).r("35 Scene", ",");
          ((d)localObject4).r("36 sceneType", ((Exif)localObject3).sceneType + ",");
          ((d)localObject4).r("37 fileSource", ((Exif)localObject3).fileSource + ",");
          ((d)localObject4).r("38 make", ((Exif)localObject3).make + ",");
          ((d)localObject4).r("39 software", ((Exif)localObject3).software + ",");
          ((d)localObject4).r("40 fileExt", com.tencent.mm.plugin.p.a.cp(((com.tencent.mm.plugin.p.a)localObject1).knp) + ",");
          x.v("MicroMsg.ImgExtInfoReport", "report logbuffer MMImageExifInfo(14525): %s, orgPath:%s", new Object[] { ((d)localObject4).wF(), ((com.tencent.mm.plugin.p.a)localObject1).knp });
          com.tencent.mm.plugin.report.service.h.mEJ.h(14525, new Object[] { localObject4 });
          localObject1 = i.LE((String)localObject2);
          localObject3 = Nz((String)localObject2);
          FileOp.mL((String)localObject3);
          x.i("MicroMsg.snsMediaStorage", "checkcntpath " + (String)localObject3);
          FileOp.y(str1 + str2, (String)localObject3 + (String)localObject1);
          str1 = (String)localObject3 + i.LA((String)localObject2);
          str2 = (String)localObject3 + i.LB((String)localObject2);
          FileOp.deleteFile(str1);
          FileOp.deleteFile(str2);
          x.i("MicroMsg.snsMediaStorage", "insert done " + (System.currentTimeMillis() - l) + " targetPath : " + (String)localObject3 + (String)localObject1 + " totalLen:" + FileOp.mI(new StringBuilder().append((String)localObject3).append((String)localObject1).toString()) + "  now delete...:" + str1 + " & " + str2);
          paramh.nJI = ((String)localObject2);
          a(j, paramh);
          return j;
          localException2 = localException2;
          x.printErrStackTrace("MicroMsg.snsMediaStorage", localException2, "", new Object[0]);
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          x.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
          continue;
          if ((((com.tencent.mm.plugin.p.a)localObject1).knp.indexOf("jpg") >= 0) || (((com.tencent.mm.plugin.p.a)localObject1).knp.indexOf("jpeg") >= 0)) {
            i = 2;
          } else if (((com.tencent.mm.plugin.p.a)localObject1).knp.indexOf("mp3") >= 0) {
            i = 3;
          }
        }
      }
    }
  }
  
  /* Error */
  private static com.tencent.mm.plugin.sns.data.h a(com.tencent.mm.plugin.sns.data.h paramh, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 9
    //   3: aconst_null
    //   4: astore 6
    //   6: aload 6
    //   8: astore 8
    //   10: aload 9
    //   12: astore 7
    //   14: new 53	android/graphics/BitmapFactory$Options
    //   17: dup
    //   18: invokespecial 54	android/graphics/BitmapFactory$Options:<init>	()V
    //   21: astore 10
    //   23: aload 6
    //   25: astore 8
    //   27: aload 9
    //   29: astore 7
    //   31: aload 10
    //   33: iconst_1
    //   34: putfield 58	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   37: aload 6
    //   39: astore 8
    //   41: aload 9
    //   43: astore 7
    //   45: aload_1
    //   46: invokestatic 51	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   49: astore 6
    //   51: aload 6
    //   53: instanceof 597
    //   56: ifeq +362 -> 418
    //   59: new 599	com/tencent/mm/sdk/platformtools/i
    //   62: dup
    //   63: aload 6
    //   65: checkcast 597	java/io/FileInputStream
    //   68: invokespecial 602	com/tencent/mm/sdk/platformtools/i:<init>	(Ljava/io/FileInputStream;)V
    //   71: astore 7
    //   73: aload 7
    //   75: astore 6
    //   77: aload 6
    //   79: astore 8
    //   81: aload 6
    //   83: astore 7
    //   85: aload 6
    //   87: ldc_w 603
    //   90: invokevirtual 607	java/io/InputStream:mark	(I)V
    //   93: aload 6
    //   95: astore 8
    //   97: aload 6
    //   99: astore 7
    //   101: aload 6
    //   103: aconst_null
    //   104: aload 10
    //   106: invokestatic 612	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   109: pop
    //   110: aload 6
    //   112: astore 8
    //   114: aload 6
    //   116: astore 7
    //   118: aload 6
    //   120: invokevirtual 615	java/io/InputStream:reset	()V
    //   123: aload 6
    //   125: astore 8
    //   127: aload 6
    //   129: astore 7
    //   131: new 148	com/tencent/mm/compatible/util/Exif
    //   134: dup
    //   135: invokespecial 149	com/tencent/mm/compatible/util/Exif:<init>	()V
    //   138: astore 9
    //   140: aload 6
    //   142: astore 8
    //   144: aload 6
    //   146: astore 7
    //   148: aload 9
    //   150: aload 6
    //   152: invokevirtual 619	com/tencent/mm/compatible/util/Exif:parseFromStream	(Ljava/io/InputStream;)I
    //   155: pop
    //   156: aload 6
    //   158: astore 8
    //   160: aload 6
    //   162: astore 7
    //   164: aload 9
    //   166: invokevirtual 155	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   169: istore_2
    //   170: iload_2
    //   171: bipush 90
    //   173: if_icmpeq +10 -> 183
    //   176: iload_2
    //   177: sipush 270
    //   180: if_icmpne +74 -> 254
    //   183: aload 6
    //   185: astore 8
    //   187: aload 6
    //   189: astore 7
    //   191: aload 10
    //   193: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   196: istore_3
    //   197: aload 6
    //   199: astore 7
    //   201: iload_3
    //   202: istore_2
    //   203: aload 10
    //   205: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   208: istore 4
    //   210: iload_3
    //   211: istore 5
    //   213: iload 4
    //   215: istore_2
    //   216: aload 6
    //   218: ifnull +14 -> 232
    //   221: aload 6
    //   223: invokevirtual 105	java/io/InputStream:close	()V
    //   226: iload 4
    //   228: istore_2
    //   229: iload_3
    //   230: istore 5
    //   232: aload_0
    //   233: iload_2
    //   234: putfield 254	com/tencent/mm/plugin/sns/data/h:width	I
    //   237: aload_0
    //   238: iload 5
    //   240: putfield 257	com/tencent/mm/plugin/sns/data/h:height	I
    //   243: aload_0
    //   244: aload_1
    //   245: invokestatic 284	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   248: l2i
    //   249: putfield 260	com/tencent/mm/plugin/sns/data/h:fileSize	I
    //   252: aload_0
    //   253: areturn
    //   254: aload 6
    //   256: astore 8
    //   258: aload 6
    //   260: astore 7
    //   262: aload 10
    //   264: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   267: istore_3
    //   268: aload 6
    //   270: astore 7
    //   272: iload_3
    //   273: istore_2
    //   274: aload 10
    //   276: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   279: istore 4
    //   281: goto -71 -> 210
    //   284: astore 7
    //   286: iconst_0
    //   287: istore_2
    //   288: aload 8
    //   290: astore 6
    //   292: aload 7
    //   294: astore 8
    //   296: aload 6
    //   298: astore 7
    //   300: ldc 70
    //   302: aload 8
    //   304: new 72	java/lang/StringBuilder
    //   307: dup
    //   308: ldc_w 621
    //   311: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   314: aload_1
    //   315: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   321: iconst_0
    //   322: anewarray 163	java/lang/Object
    //   325: invokestatic 167	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   328: aload 6
    //   330: ifnull +78 -> 408
    //   333: aload 6
    //   335: invokevirtual 105	java/io/InputStream:close	()V
    //   338: iconst_0
    //   339: istore_3
    //   340: iload_2
    //   341: istore 5
    //   343: iload_3
    //   344: istore_2
    //   345: goto -113 -> 232
    //   348: astore 6
    //   350: iconst_0
    //   351: istore_3
    //   352: iload_2
    //   353: istore 5
    //   355: iload_3
    //   356: istore_2
    //   357: goto -125 -> 232
    //   360: astore_0
    //   361: aload 7
    //   363: ifnull +8 -> 371
    //   366: aload 7
    //   368: invokevirtual 105	java/io/InputStream:close	()V
    //   371: aload_0
    //   372: athrow
    //   373: astore 6
    //   375: iload_3
    //   376: istore 5
    //   378: iload 4
    //   380: istore_2
    //   381: goto -149 -> 232
    //   384: astore_1
    //   385: goto -14 -> 371
    //   388: astore_0
    //   389: aload 6
    //   391: astore 7
    //   393: goto -32 -> 361
    //   396: astore 8
    //   398: iconst_0
    //   399: istore_2
    //   400: goto -104 -> 296
    //   403: astore 8
    //   405: goto -109 -> 296
    //   408: iconst_0
    //   409: istore_3
    //   410: iload_2
    //   411: istore 5
    //   413: iload_3
    //   414: istore_2
    //   415: goto -183 -> 232
    //   418: goto -341 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	421	0	paramh	com.tencent.mm.plugin.sns.data.h
    //   0	421	1	paramString	String
    //   169	246	2	i	int
    //   196	218	3	j	int
    //   208	171	4	k	int
    //   211	201	5	m	int
    //   4	330	6	localObject1	Object
    //   348	1	6	localIOException1	IOException
    //   373	17	6	localIOException2	IOException
    //   12	259	7	localObject2	Object
    //   284	9	7	localException1	Exception
    //   298	94	7	localObject3	Object
    //   8	295	8	localObject4	Object
    //   396	1	8	localException2	Exception
    //   403	1	8	localException3	Exception
    //   1	164	9	localExif	Exif
    //   21	254	10	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   14	23	284	java/lang/Exception
    //   31	37	284	java/lang/Exception
    //   45	51	284	java/lang/Exception
    //   85	93	284	java/lang/Exception
    //   101	110	284	java/lang/Exception
    //   118	123	284	java/lang/Exception
    //   131	140	284	java/lang/Exception
    //   148	156	284	java/lang/Exception
    //   164	170	284	java/lang/Exception
    //   191	197	284	java/lang/Exception
    //   262	268	284	java/lang/Exception
    //   333	338	348	java/io/IOException
    //   14	23	360	finally
    //   31	37	360	finally
    //   45	51	360	finally
    //   85	93	360	finally
    //   101	110	360	finally
    //   118	123	360	finally
    //   131	140	360	finally
    //   148	156	360	finally
    //   164	170	360	finally
    //   191	197	360	finally
    //   203	210	360	finally
    //   262	268	360	finally
    //   274	281	360	finally
    //   300	328	360	finally
    //   221	226	373	java/io/IOException
    //   366	371	384	java/io/IOException
    //   51	73	388	finally
    //   51	73	396	java/lang/Exception
    //   203	210	403	java/lang/Exception
    //   274	281	403	java/lang/Exception
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap.CompressFormat paramCompressFormat, int paramInt5, String paramString2, String paramString3, boolean paramBoolean)
  {
    Object localObject5 = null;
    Object localObject3 = localObject5;
    Object localObject4;
    double d2;
    double d3;
    try
    {
      x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, srcWidth: %s, srcHeight: %s, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt3) });
      localObject3 = localObject5;
      Object localObject2 = new BitmapFactory.Options();
      localObject3 = localObject5;
      localObject4 = new MMBitmapFactory.DecodeResultLogger();
      localObject3 = localObject5;
      d2 = paramInt2 * 1.0D / paramInt3;
      localObject3 = localObject5;
      d3 = paramInt1 * 1.0D / paramInt4;
      if ((paramInt1 == paramInt4) && (paramInt2 == paramInt3))
      {
        localObject3 = localObject5;
        localObject2 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
      }
      for (;;)
      {
        localObject3 = localObject5;
        x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, result bm: %s", new Object[] { localObject2 });
        if (localObject2 == null)
        {
          localObject3 = localObject5;
          if (((MMBitmapFactory.DecodeResultLogger)localObject4).getDecodeResult() >= 2000)
          {
            localObject3 = localObject5;
            paramString1 = MMBitmapFactory.KVStatHelper.getKVStatString(paramString1, 10, (MMBitmapFactory.DecodeResultLogger)localObject4);
            localObject3 = localObject5;
            com.tencent.mm.plugin.report.service.h.mEJ.k(12712, paramString1);
            break label665;
            localObject3 = localObject5;
            ((BitmapFactory.Options)localObject2).inSampleSize = 1;
            if (paramInt2 > paramInt3) {
              break label667;
            }
            if (paramInt1 > paramInt4)
            {
              break label667;
              label221:
              localObject3 = localObject5;
              Object localObject1;
              ((BitmapFactory.Options)localObject2).inSampleSize = ((int)localObject1);
              localObject3 = localObject5;
              if (((BitmapFactory.Options)localObject2).inSampleSize <= 1) {
                localObject3 = localObject5;
              }
            }
            for (((BitmapFactory.Options)localObject2).inSampleSize = 1;; ((BitmapFactory.Options)localObject2).inSampleSize += 1)
            {
              localObject3 = localObject5;
              if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject2).inSampleSize / ((BitmapFactory.Options)localObject2).inSampleSize <= 2764800) {
                break;
              }
              localObject3 = localObject5;
            }
          }
        }
        else
        {
          try
          {
            ((OutputStream)localObject3).close();
            return false;
            d1 = d2;
            break label221;
            localObject3 = localObject5;
            x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject2).inSampleSize) });
            localObject3 = localObject5;
            localObject2 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
            continue;
            localObject3 = localObject5;
            x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
            localObject4 = localObject2;
            if (paramBoolean)
            {
              if (d2 >= d3) {
                break label630;
              }
              localObject3 = localObject5;
              paramInt2 = (int)Math.ceil(paramInt4 * 1.0D * paramInt2 / paramInt1);
              paramInt1 = paramInt4;
            }
            for (;;)
            {
              localObject3 = localObject5;
              paramInt3 = BackwardSupportUtil.ExifHelper.VX(paramString1);
              if (paramInt3 == 90) {
                break label682;
              }
              if (paramInt3 != 270) {
                break;
              }
              break label682;
              localObject3 = localObject5;
              localObject4 = Bitmap.createScaledBitmap((Bitmap)localObject2, paramInt1, paramInt2, true);
              paramString1 = (String)localObject2;
              if (localObject4 != null)
              {
                if (localObject2 == localObject4) {
                  break label691;
                }
                localObject3 = localObject5;
                l.Fu().l((Bitmap)localObject2);
                break label691;
              }
              localObject3 = localObject5;
              x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScalebyUpload, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()) });
              localObject4 = paramString1;
              localObject3 = localObject5;
              paramString1 = FileOp.jx(paramString2 + paramString3);
              localObject3 = paramString1;
              c.a((Bitmap)localObject4, paramInt5, paramCompressFormat, paramString1, false);
              localObject3 = paramString1;
              l.Fu().l((Bitmap)localObject4);
              localObject3 = paramString1;
              paramString1.close();
              return true;
              localObject3 = localObject5;
              d1 = Math.ceil(paramInt3 * 1.0D * paramInt1 / paramInt2);
              paramInt1 = (int)d1;
              paramInt2 = paramInt3;
            }
          }
          catch (IOException paramString1)
          {
            for (;;) {}
          }
        }
      }
    }
    catch (IOException paramString1)
    {
      x.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString3 });
      if (localObject3 == null) {}
    }
    for (;;)
    {
      double d1;
      label630:
      label665:
      return false;
      label667:
      if (d2 < d3)
      {
        d1 = d3;
        break;
        label682:
        paramInt3 = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = paramInt3;
        continue;
        label691:
        paramString1 = (String)localObject4;
      }
    }
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, Bitmap.CompressFormat paramCompressFormat, int paramInt4, String paramString2, String paramString3)
  {
    Object localObject3 = null;
    Object localObject1 = localObject3;
    int i;
    try
    {
      x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, srcWidth: %d, srcHeight: %d, fixShort: %d, quality:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      localObject1 = localObject3;
      Object localObject2 = new BitmapFactory.Options();
      localObject1 = localObject3;
      Object localObject4 = new MMBitmapFactory.DecodeResultLogger();
      if (paramInt2 > paramInt1)
      {
        i = paramInt1;
        if (i == paramInt3)
        {
          localObject1 = localObject3;
          localObject2 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
        }
        for (;;)
        {
          localObject1 = localObject3;
          x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, result bm: %s", new Object[] { localObject2 });
          if (localObject2 == null)
          {
            localObject1 = localObject3;
            if (((MMBitmapFactory.DecodeResultLogger)localObject4).getDecodeResult() >= 2000)
            {
              localObject1 = localObject3;
              paramString1 = MMBitmapFactory.KVStatHelper.getKVStatString(paramString1, 10, (MMBitmapFactory.DecodeResultLogger)localObject4);
              localObject1 = localObject3;
              com.tencent.mm.plugin.report.service.h.mEJ.k(12712, paramString1);
              break label726;
              localObject1 = localObject3;
              ((BitmapFactory.Options)localObject2).inSampleSize = 1;
              if (i > paramInt3)
              {
                localObject1 = localObject3;
                ((BitmapFactory.Options)localObject2).inSampleSize = (i / paramInt3);
                localObject1 = localObject3;
                if (((BitmapFactory.Options)localObject2).inSampleSize <= 1) {
                  localObject1 = localObject3;
                }
              }
              for (((BitmapFactory.Options)localObject2).inSampleSize = 1;; ((BitmapFactory.Options)localObject2).inSampleSize += 1)
              {
                localObject1 = localObject3;
                if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject2).inSampleSize / ((BitmapFactory.Options)localObject2).inSampleSize <= 5529600) {
                  break;
                }
                localObject1 = localObject3;
              }
            }
          }
          else
          {
            try
            {
              ((OutputStream)localObject1).close();
              return false;
              localObject1 = localObject3;
              x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject2).inSampleSize) });
              localObject1 = localObject3;
              localObject2 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
              continue;
              localObject1 = localObject3;
              j = paramInt1 * paramInt3 / i;
              localObject1 = localObject3;
              paramInt3 = paramInt2 * paramInt3 / i;
              localObject1 = localObject3;
              m = BackwardSupportUtil.ExifHelper.VX(paramString1);
              if (m != 90) {
                if (m == 270)
                {
                  break label734;
                  localObject1 = localObject3;
                  x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, bm.width: %s, bm.height: %s, new:[%d,%d], src:[%d, %d], shortEdge:%d,degree:%d", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()), Integer.valueOf(paramInt3), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(m) });
                  localObject1 = localObject3;
                  localObject4 = Bitmap.createScaledBitmap((Bitmap)localObject2, paramInt3, j, true);
                  if (localObject4 != null)
                  {
                    paramString1 = (String)localObject4;
                    if (localObject2 != localObject4)
                    {
                      localObject1 = localObject3;
                      l.Fu().l((Bitmap)localObject2);
                      paramString1 = (String)localObject4;
                    }
                    localObject1 = localObject3;
                    x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScaleFixShort, bm.width: %s, bm.height: %s, quality:%d", new Object[] { Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()), Integer.valueOf(paramInt4) });
                    localObject1 = localObject3;
                    localObject2 = FileOp.jx(paramString2 + paramString3);
                    localObject1 = localObject2;
                    c.a(paramString1, paramInt4, paramCompressFormat, (OutputStream)localObject2, false);
                    localObject1 = localObject2;
                    l.Fu().l(paramString1);
                    localObject1 = localObject2;
                    ((OutputStream)localObject2).close();
                    localObject1 = null;
                    x.i("MicroMsg.snsMediaStorage", "createThumbNailUnScaleFixShort saving to %s, size:%d", new Object[] { paramString2 + paramString3, Long.valueOf(FileOp.mI(paramString2 + paramString3)) });
                    return true;
                  }
                }
              }
            }
            catch (IOException paramString1)
            {
              for (;;)
              {
                continue;
                paramString1 = (String)localObject2;
                continue;
                k = paramInt3;
                paramInt3 = j;
                j = k;
              }
            }
          }
        }
      }
    }
    catch (IOException paramString1)
    {
      x.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString3 });
      if (localObject1 == null) {}
    }
    label726:
    label734:
    for (;;)
    {
      int j;
      int m;
      int k;
      return false;
      i = paramInt2;
      break;
    }
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, String paramString3, boolean paramBoolean)
  {
    BitmapFactory.Options localOptions = c.VZ(paramString1);
    if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0)) {
      return false;
    }
    return a(paramString1, localOptions.outWidth, localOptions.outHeight, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramString3, paramBoolean);
  }
  
  public static boolean a(String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    localObject3 = null;
    try
    {
      InputStream localInputStream = FileOp.openRead(paramString1 + paramString2);
      localObject3 = localInputStream;
      localOptions = new BitmapFactory.Options();
      localObject3 = localInputStream;
      localOptions.inJustDecodeBounds = true;
      localObject3 = localInputStream;
      MMBitmapFactory.decodeStream(localInputStream, null, localOptions, null, 0, new int[0]);
      localObject3 = localInputStream;
      localInputStream.close();
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        BitmapFactory.Options localOptions;
        label117:
        label141:
        double d7;
        double d8;
        Object localObject2;
        Object localObject1;
        double d6;
        i = 1;
        d1 = 0.0D;
        d2 = 0.0D;
        if (localObject3 != null)
        {
          try
          {
            ((InputStream)localObject3).close();
            d6 = 240.0D;
            d5 = 240.0D;
            d4 = d1;
            d3 = d2;
            d1 = d6;
            d2 = d5;
          }
          catch (IOException localIOException) {}
        }
        else
        {
          d6 = 240.0D;
          d5 = 240.0D;
          d4 = d1;
          d3 = d2;
          d1 = d6;
          d2 = d5;
          continue;
          paramString2 = Bitmap.CompressFormat.JPEG;
        }
      }
    }
    for (;;)
    {
      try
      {
        d3 = localOptions.outWidth;
        i = localOptions.outHeight;
        d1 = i;
        if ((d3 <= 120.0D) && (d1 <= 120.0D)) {
          continue;
        }
        i = 0;
      }
      catch (Exception localException1)
      {
        Object localObject4 = null;
        i = 1;
        d1 = 0.0D;
        d2 = 0.0D;
        break label429;
        Object localObject5;
        i = 1;
        break label117;
        d5 = 240.0D;
        d2 = 240.0D;
        break label141;
      }
      try
      {
        localObject3 = localOptions.outMimeType;
        if (d3 < 0.0D) {
          continue;
        }
        if (d1 >= 0.0D) {
          continue;
        }
      }
      catch (Exception localException2)
      {
        localObject5 = null;
        d2 = d3;
        break label429;
        d4 = d5;
        break label318;
        d2 = d1;
        d5 = d3;
        break label141;
      }
    }
    d7 = paramFloat;
    d8 = paramFloat / 200.0F * 44.0F;
    d4 = paramFloat / 200.0F * 160.0F;
    if ((localObject2 > 0.0D) && (localObject1 > 0.0D))
    {
      d4 = Math.min(d7 / localObject2, d7 / localObject1);
      localObject2 *= d4;
      d6 = localObject1 * d4;
      d2 = d6;
      d4 = d5;
      if (d5 < d8)
      {
        d2 = 1.0D * d8 / d5;
        d4 = d5 * d2;
        d2 = d6 * d2;
      }
      d5 = d2;
      d6 = d4;
      if (d2 < d8)
      {
        d5 = 1.0D * d8 / d2;
        d6 = d4 * d5;
        d5 = d2 * d5;
      }
      d2 = d6;
      if (d6 > d7) {
        d2 = d7;
      }
      if (d5 > d7)
      {
        d4 = d7;
        label318:
        d5 = d1;
        d1 = d4;
      }
    }
    else
    {
      for (d4 = d5;; d4 = d5)
      {
        localObject3 = paramString1 + paramString2;
        int j = (int)d3;
        int k = (int)d4;
        int m = (int)d1;
        int n = (int)d2;
        if (i == 0) {
          break;
        }
        paramString2 = Bitmap.CompressFormat.PNG;
        return a((String)localObject3, j, k, m, n, paramString2, 70, paramString1, paramString3, false);
        d5 = d1;
        d1 = d4;
        d2 = d4;
      }
    }
  }
  
  public static boolean ad(String paramString1, String paramString2, String paramString3)
  {
    return e(paramString1, paramString2, paramString3, true);
  }
  
  public static boolean b(String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    Object localObject1;
    for (;;)
    {
      MMBitmapFactory.DecodeResultLogger localDecodeResultLogger;
      int i1;
      int n;
      int m;
      int k;
      try
      {
        FileOp.deleteFile(paramString1 + paramString3);
        localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
        localObject1 = c.VZ(paramString1 + paramString2);
        if (localObject1 == null)
        {
          x.e("MicroMsg.snsMediaStorage", "createUserAlbum, getImageOptions error");
          return false;
        }
        if ((((BitmapFactory.Options)localObject1).outMimeType != null) && ((((BitmapFactory.Options)localObject1).outMimeType.toLowerCase().endsWith("png")) || (((BitmapFactory.Options)localObject1).outMimeType.toLowerCase().endsWith("vcodec"))))
        {
          localObject1 = c.a(paramString1 + paramString2, (int)paramFloat, (int)paramFloat, true, localDecodeResultLogger, 0);
          if (localObject1 != null) {
            break;
          }
          x.i("MicroMsg.snsMediaStorage", "bitmap error " + paramString1 + paramString2);
          if (localDecodeResultLogger.getDecodeResult() >= 2000)
          {
            paramString3 = MMBitmapFactory.KVStatHelper.getKVStatString(paramString1 + paramString2, 10, localDecodeResultLogger);
            com.tencent.mm.plugin.report.service.h.mEJ.k(12712, paramString3);
          }
          FileOp.deleteFile(paramString1 + paramString2);
          return false;
        }
        i1 = ((BitmapFactory.Options)localObject1).outWidth;
        n = ((BitmapFactory.Options)localObject1).outHeight;
        m = (int)paramFloat;
        k = (int)paramFloat;
        ((BitmapFactory.Options)localObject1).inJustDecodeBounds = false;
        x.i("MicroMsg.snsMediaStorage", "createUserAlbum, srcWidth: %s, srcHeight: %s, dstWidth: %s, dstHeight: %s", new Object[] { Integer.valueOf(i1), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(k) });
        if ((i1 == m) && (n == k))
        {
          localObject1 = com.tencent.mm.plugin.sns.d.a.b(paramString1 + paramString2, (BitmapFactory.Options)localObject1, localDecodeResultLogger);
          continue;
        }
        if (n * 1.0D / k > i1 * 1.0D / m)
        {
          j = (int)Math.ceil(m * 1.0D * n / i1);
          i = m;
          x.d("MicroMsg.snsMediaStorage", "createUserAlbum, newWidth: %s, newHeight: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          ((BitmapFactory.Options)localObject1).inSampleSize = 1;
          if ((n <= j) && (i1 <= i)) {
            break label632;
          }
          ((BitmapFactory.Options)localObject1).inSampleSize = 1;
          if ((n > j) || (i1 > i))
          {
            d1 = n * 1.0D / j;
            double d2 = i1 * 1.0D / i;
            if (d1 >= d2) {
              break label1084;
            }
            d1 = d2;
            ((BitmapFactory.Options)localObject1).inSampleSize = ((int)d1);
            if (((BitmapFactory.Options)localObject1).inSampleSize <= 1) {
              ((BitmapFactory.Options)localObject1).inSampleSize = 1;
            }
          }
          if (n * i1 / ((BitmapFactory.Options)localObject1).inSampleSize / ((BitmapFactory.Options)localObject1).inSampleSize <= 2764800) {
            break label632;
          }
          ((BitmapFactory.Options)localObject1).inSampleSize += 1;
          continue;
          return true;
        }
      }
      catch (Exception paramString1)
      {
        x.e("MicroMsg.snsMediaStorage", "createUserAlbum error: %s", new Object[] { paramString1.getMessage() });
        x.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "", new Object[0]);
      }
      double d1 = k * 1.0D * i1 / n;
      i = (int)Math.ceil(d1);
      int j = k;
      continue;
      label632:
      x.i("MicroMsg.snsMediaStorage", "createUserAlbum, inSampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject1).inSampleSize) });
      if (n / i1 == k / m)
      {
        localObject1 = com.tencent.mm.plugin.sns.d.a.b(paramString1 + paramString2, (BitmapFactory.Options)localObject1, localDecodeResultLogger);
        x.i("MicroMsg.snsMediaStorage", "createUserAlbum, directly use inSampleSize");
      }
      else
      {
        paramFloat = Math.max(i / i1, j / n);
        i = (int)(m / paramFloat);
        j = (int)(k / paramFloat);
        i = Math.min(i1, i);
        j = Math.min(n, j);
        k = Math.max(0, i1 - i >> 1);
        m = Math.max(0, n - j >> 1);
        Object localObject2 = new Rect();
        ((Rect)localObject2).left = k;
        ((Rect)localObject2).right = (k + i);
        ((Rect)localObject2).top = m;
        ((Rect)localObject2).bottom = (m + j);
        String str = paramString1 + paramString2;
        long l = System.currentTimeMillis();
        localObject2 = l.Fu().a(str, (Rect)localObject2, (BitmapFactory.Options)localObject1, localDecodeResultLogger);
        localObject1 = localObject2;
        if (localObject2 != null) {
          localObject1 = i.s(str, (Bitmap)localObject2);
        }
        x.d("MicroMsg.SnsBitmapUtil", "regionDecodeWithRotateByExif used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        x.i("MicroMsg.snsMediaStorage", "createUserAlbum, dstWidth: %s, dstHeight: %s, startX: %s, startY: %s, scaleFactor: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Float.valueOf(paramFloat) });
      }
    }
    x.i("MicroMsg.snsMediaStorage", "createUserAlbum, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()) });
    int i = 1;
    if ((((Bitmap)localObject1).getHeight() <= 120) && (((Bitmap)localObject1).getWidth() <= 120)) {}
    for (;;)
    {
      if (i != 0) {}
      for (paramString2 = Bitmap.CompressFormat.PNG;; paramString2 = Bitmap.CompressFormat.JPEG)
      {
        c.a((Bitmap)localObject1, 100, paramString2, paramString1 + paramString3, false);
        l.Fu().l((Bitmap)localObject1);
        break;
      }
      label1084:
      break;
      i = 0;
    }
  }
  
  public static boolean bBD()
  {
    if ("hevc".equals(com.tencent.mm.platformtools.af.exZ)) {
      return true;
    }
    return com.tencent.mm.plugin.sns.model.af.byy();
  }
  
  public static boolean bBE()
  {
    if ("wxpc".equals(com.tencent.mm.platformtools.af.exZ)) {
      return true;
    }
    return com.tencent.mm.plugin.sns.model.af.byz();
  }
  
  public static boolean bBF()
  {
    return (nig >= 1080) && (niY >= 1080);
  }
  
  public static void dA(int paramInt1, int paramInt2)
  {
    niY = paramInt1;
    nig = paramInt2;
    x.i("MicroMsg.snsMediaStorage", "SCREEN %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  /* Error */
  public static boolean e(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 113	com/tencent/mm/sdk/platformtools/c:VZ	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   4: astore 21
    //   6: aload 21
    //   8: ifnull +981 -> 989
    //   11: aload 21
    //   13: getfield 68	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   16: astore 22
    //   18: ldc 70
    //   20: new 72	java/lang/StringBuilder
    //   23: dup
    //   24: ldc_w 834
    //   27: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload 22
    //   32: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokestatic 91	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: aload 22
    //   43: ifnull +946 -> 989
    //   46: aload 22
    //   48: invokevirtual 94	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   51: astore 22
    //   53: aload 22
    //   55: ldc_w 286
    //   58: invokevirtual 100	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   61: iflt +894 -> 955
    //   64: iconst_1
    //   65: istore 17
    //   67: aload 21
    //   69: ifnull +943 -> 1012
    //   72: aload 21
    //   74: getfield 68	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   77: astore 22
    //   79: aload 22
    //   81: ifnull +931 -> 1012
    //   84: aload 22
    //   86: invokevirtual 94	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   89: astore 22
    //   91: aload 22
    //   93: ldc_w 286
    //   96: invokevirtual 100	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   99: iflt +896 -> 995
    //   102: iconst_1
    //   103: istore 10
    //   105: iconst_m1
    //   106: istore 11
    //   108: bipush 100
    //   110: istore 7
    //   112: iload_3
    //   113: ifeq +2966 -> 3079
    //   116: iload 7
    //   118: istore 8
    //   120: invokestatic 840	com/tencent/mm/modelcdntran/g:ND	()Lcom/tencent/mm/modelcdntran/c;
    //   123: pop
    //   124: iload 7
    //   126: istore 8
    //   128: bipush 64
    //   130: invokestatic 846	com/tencent/mm/modelcdntran/c:hz	(I)Z
    //   133: ifne +23 -> 156
    //   136: iload 7
    //   138: istore 8
    //   140: invokestatic 848	com/tencent/mm/plugin/sns/storage/s:bBD	()Z
    //   143: ifne +13 -> 156
    //   146: iload 7
    //   148: istore 8
    //   150: invokestatic 850	com/tencent/mm/plugin/sns/storage/s:bBE	()Z
    //   153: ifeq +960 -> 1113
    //   156: iload 7
    //   158: istore 8
    //   160: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   163: invokestatic 862	com/tencent/mm/sdk/platformtools/ao:isWifi	(Landroid/content/Context;)Z
    //   166: ifeq +852 -> 1018
    //   169: iload 7
    //   171: istore 8
    //   173: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   176: ldc_w 870
    //   179: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   182: bipush 70
    //   184: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   187: istore 7
    //   189: iload 7
    //   191: istore 8
    //   193: ldc 70
    //   195: ldc_w 881
    //   198: bipush 7
    //   200: anewarray 163	java/lang/Object
    //   203: dup
    //   204: iconst_0
    //   205: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   208: ldc_w 870
    //   211: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   214: aastore
    //   215: dup
    //   216: iconst_1
    //   217: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   220: ldc_w 883
    //   223: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   226: aastore
    //   227: dup
    //   228: iconst_2
    //   229: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   232: ldc_w 885
    //   235: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   238: aastore
    //   239: dup
    //   240: iconst_3
    //   241: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   244: ldc_w 887
    //   247: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   250: aastore
    //   251: dup
    //   252: iconst_4
    //   253: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   256: ldc_w 889
    //   259: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   262: aastore
    //   263: dup
    //   264: iconst_5
    //   265: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   268: ldc_w 891
    //   271: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   274: aastore
    //   275: dup
    //   276: bipush 6
    //   278: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   281: ldc_w 893
    //   284: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   287: aastore
    //   288: invokestatic 747	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: ldc 70
    //   293: ldc_w 895
    //   296: iconst_2
    //   297: anewarray 163	java/lang/Object
    //   300: dup
    //   301: iconst_0
    //   302: iload 7
    //   304: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   307: aastore
    //   308: dup
    //   309: iconst_1
    //   310: iload_3
    //   311: invokestatic 900	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   314: aastore
    //   315: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   318: iload 7
    //   320: bipush 10
    //   322: if_icmple +10 -> 332
    //   325: iload 7
    //   327: bipush 100
    //   329: if_icmple +2747 -> 3076
    //   332: bipush 60
    //   334: istore 7
    //   336: iload 10
    //   338: ifeq +2731 -> 3069
    //   341: aload_1
    //   342: invokestatic 905	com/tencent/mm/sdk/platformtools/MMNativeJpeg:queryQuality	(Ljava/lang/String;)I
    //   345: istore 8
    //   347: iload 8
    //   349: iload 7
    //   351: if_icmpge +2707 -> 3058
    //   354: iload 8
    //   356: bipush 25
    //   358: if_icmple +2700 -> 3058
    //   361: iload 8
    //   363: istore 9
    //   365: iload 8
    //   367: istore 11
    //   369: aload_1
    //   370: invokestatic 284	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   373: l2i
    //   374: istore 14
    //   376: sipush 1080
    //   379: istore 8
    //   381: aload_1
    //   382: invokestatic 910	com/tencent/mm/plugin/facedetect/FaceProNative:detectFaceCnt	(Ljava/lang/String;)I
    //   385: istore 7
    //   387: ldc 70
    //   389: ldc_w 912
    //   392: iconst_1
    //   393: anewarray 163	java/lang/Object
    //   396: dup
    //   397: iconst_0
    //   398: iload 7
    //   400: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   403: aastore
    //   404: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   407: iload 7
    //   409: iconst_5
    //   410: if_icmplt +8 -> 418
    //   413: sipush 1440
    //   416: istore 8
    //   418: iconst_0
    //   419: istore 12
    //   421: iload 7
    //   423: iconst_5
    //   424: if_icmplt +787 -> 1211
    //   427: iload 12
    //   429: istore 7
    //   431: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   434: ldc_w 914
    //   437: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   440: astore 22
    //   442: iload 12
    //   444: istore 7
    //   446: aload 22
    //   448: ldc_w 916
    //   451: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   454: iconst_0
    //   455: aaload
    //   456: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   459: invokevirtual 926	java/lang/Integer:intValue	()I
    //   462: istore 12
    //   464: iload 12
    //   466: istore 7
    //   468: aload 22
    //   470: ldc_w 916
    //   473: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   476: iconst_1
    //   477: aaload
    //   478: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   481: invokevirtual 926	java/lang/Integer:intValue	()I
    //   484: istore 13
    //   486: iload 13
    //   488: istore 8
    //   490: iload 12
    //   492: istore 7
    //   494: ldc 70
    //   496: ldc_w 928
    //   499: bipush 6
    //   501: anewarray 163	java/lang/Object
    //   504: dup
    //   505: iconst_0
    //   506: iload 7
    //   508: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   511: aastore
    //   512: dup
    //   513: iconst_1
    //   514: iload 8
    //   516: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   519: aastore
    //   520: dup
    //   521: iconst_2
    //   522: getstatic 27	com/tencent/mm/plugin/sns/storage/s:nig	I
    //   525: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   528: aastore
    //   529: dup
    //   530: iconst_3
    //   531: getstatic 25	com/tencent/mm/plugin/sns/storage/s:niY	I
    //   534: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   537: aastore
    //   538: dup
    //   539: iconst_4
    //   540: iload 9
    //   542: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   545: aastore
    //   546: dup
    //   547: iconst_5
    //   548: iload_3
    //   549: invokestatic 900	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   552: aastore
    //   553: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   556: iload 7
    //   558: ifgt +972 -> 1530
    //   561: iload 8
    //   563: ifgt +967 -> 1530
    //   566: iconst_0
    //   567: istore 7
    //   569: sipush 1080
    //   572: istore 8
    //   574: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   577: ldc_w 930
    //   580: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   583: bipush 100
    //   585: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   588: istore 13
    //   590: iload 13
    //   592: istore 12
    //   594: iload 13
    //   596: ifgt +7 -> 603
    //   599: bipush 100
    //   601: istore 12
    //   603: iload 12
    //   605: sipush 1024
    //   608: imul
    //   609: istore 15
    //   611: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   614: ldc_w 932
    //   617: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   620: sipush 200
    //   623: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   626: istore 13
    //   628: iload 13
    //   630: istore 12
    //   632: iload 13
    //   634: ifgt +8 -> 642
    //   637: sipush 200
    //   640: istore 12
    //   642: iload 12
    //   644: sipush 1024
    //   647: imul
    //   648: istore 16
    //   650: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   653: ldc_w 934
    //   656: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   659: bipush 10
    //   661: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   664: istore 12
    //   666: iload 12
    //   668: ifle +10 -> 678
    //   671: iload 12
    //   673: bipush 100
    //   675: if_icmplt +2377 -> 3052
    //   678: bipush 10
    //   680: istore 12
    //   682: iconst_0
    //   683: istore 13
    //   685: iload 10
    //   687: ifeq +914 -> 1601
    //   690: aload_1
    //   691: invokestatic 448	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   694: astore 22
    //   696: iload 13
    //   698: istore 10
    //   700: aload 22
    //   702: ifnull +14 -> 716
    //   705: aload 22
    //   707: invokevirtual 155	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   710: sipush 360
    //   713: irem
    //   714: istore 10
    //   716: ldc 70
    //   718: new 72	java/lang/StringBuilder
    //   721: dup
    //   722: ldc_w 936
    //   725: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   728: aload 21
    //   730: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   733: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   736: ldc_w 938
    //   739: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: aload 21
    //   744: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   747: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   750: ldc_w 938
    //   753: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   756: iload 17
    //   758: invokevirtual 941	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   761: ldc_w 943
    //   764: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: iload 11
    //   769: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   772: ldc_w 945
    //   775: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: iload 10
    //   780: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   783: ldc_w 947
    //   786: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   789: iload 14
    //   791: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   794: ldc_w 949
    //   797: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   800: iload 7
    //   802: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   805: ldc_w 938
    //   808: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   811: iload 8
    //   813: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   816: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   819: invokestatic 240	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   822: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   825: ldc_w 951
    //   828: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   831: bipush 10
    //   833: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   836: pop
    //   837: aload 21
    //   839: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   842: aload 21
    //   844: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   847: iconst_2
    //   848: imul
    //   849: if_icmpge +18 -> 867
    //   852: aload 21
    //   854: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   857: aload 21
    //   859: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   862: iconst_2
    //   863: imul
    //   864: if_icmplt +1406 -> 2270
    //   867: aload 21
    //   869: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   872: aload 21
    //   874: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   877: imul
    //   878: ldc_w 952
    //   881: if_icmpgt +1154 -> 2035
    //   884: iload 14
    //   886: iload 16
    //   888: if_icmpge +721 -> 1609
    //   891: iload 17
    //   893: ifeq +716 -> 1609
    //   896: iload 10
    //   898: ifne +711 -> 1609
    //   901: ldc 70
    //   903: new 72	java/lang/StringBuilder
    //   906: dup
    //   907: ldc_w 954
    //   910: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   913: iload 16
    //   915: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   918: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   921: invokestatic 240	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   924: aload_1
    //   925: new 72	java/lang/StringBuilder
    //   928: dup
    //   929: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   932: aload_0
    //   933: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   936: aload_2
    //   937: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   940: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   943: invokestatic 567	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   946: lconst_0
    //   947: lcmp
    //   948: iflt +659 -> 1607
    //   951: iconst_1
    //   952: istore_3
    //   953: iload_3
    //   954: ireturn
    //   955: aload 22
    //   957: ldc_w 292
    //   960: invokevirtual 100	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   963: iflt +9 -> 972
    //   966: iconst_1
    //   967: istore 17
    //   969: goto -902 -> 67
    //   972: aload 22
    //   974: ldc_w 450
    //   977: invokevirtual 100	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   980: iflt +9 -> 989
    //   983: iconst_1
    //   984: istore 17
    //   986: goto -919 -> 67
    //   989: iconst_0
    //   990: istore 17
    //   992: goto -925 -> 67
    //   995: aload 22
    //   997: ldc_w 292
    //   1000: invokevirtual 100	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   1003: iflt +9 -> 1012
    //   1006: iconst_1
    //   1007: istore 10
    //   1009: goto -904 -> 105
    //   1012: iconst_0
    //   1013: istore 10
    //   1015: goto -910 -> 105
    //   1018: iload 7
    //   1020: istore 8
    //   1022: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1025: invokestatic 957	com/tencent/mm/sdk/platformtools/ao:is2G	(Landroid/content/Context;)Z
    //   1028: ifeq +26 -> 1054
    //   1031: iload 7
    //   1033: istore 8
    //   1035: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1038: ldc_w 883
    //   1041: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1044: bipush 70
    //   1046: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   1049: istore 7
    //   1051: goto -862 -> 189
    //   1054: iload 7
    //   1056: istore 8
    //   1058: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1061: invokestatic 960	com/tencent/mm/sdk/platformtools/ao:is3G	(Landroid/content/Context;)Z
    //   1064: ifeq +26 -> 1090
    //   1067: iload 7
    //   1069: istore 8
    //   1071: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1074: ldc_w 885
    //   1077: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1080: bipush 60
    //   1082: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   1085: istore 7
    //   1087: goto -898 -> 189
    //   1090: iload 7
    //   1092: istore 8
    //   1094: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1097: ldc_w 887
    //   1100: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1103: bipush 60
    //   1105: invokestatic 879	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   1108: istore 7
    //   1110: goto -921 -> 189
    //   1113: iload 7
    //   1115: istore 8
    //   1117: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1120: invokestatic 862	com/tencent/mm/sdk/platformtools/ao:isWifi	(Landroid/content/Context;)Z
    //   1123: ifeq +27 -> 1150
    //   1126: iload 7
    //   1128: istore 8
    //   1130: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1133: ldc_w 889
    //   1136: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1139: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1142: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1145: istore 7
    //   1147: goto -958 -> 189
    //   1150: iload 7
    //   1152: istore 8
    //   1154: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1157: invokestatic 957	com/tencent/mm/sdk/platformtools/ao:is2G	(Landroid/content/Context;)Z
    //   1160: ifeq +27 -> 1187
    //   1163: iload 7
    //   1165: istore 8
    //   1167: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1170: ldc_w 891
    //   1173: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1176: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1179: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1182: istore 7
    //   1184: goto -995 -> 189
    //   1187: iload 7
    //   1189: istore 8
    //   1191: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1194: ldc_w 893
    //   1197: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1200: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1203: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1206: istore 7
    //   1208: goto -1019 -> 189
    //   1211: iload 12
    //   1213: istore 7
    //   1215: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1218: invokestatic 862	com/tencent/mm/sdk/platformtools/ao:isWifi	(Landroid/content/Context;)Z
    //   1221: ifeq +73 -> 1294
    //   1224: iload 12
    //   1226: istore 7
    //   1228: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1231: ldc_w 962
    //   1234: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1237: astore 22
    //   1239: iload 12
    //   1241: istore 7
    //   1243: aload 22
    //   1245: ldc_w 916
    //   1248: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1251: iconst_0
    //   1252: aaload
    //   1253: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1256: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1259: istore 12
    //   1261: iload 12
    //   1263: istore 7
    //   1265: aload 22
    //   1267: ldc_w 916
    //   1270: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1273: iconst_1
    //   1274: aaload
    //   1275: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1278: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1281: istore 13
    //   1283: iload 13
    //   1285: istore 8
    //   1287: iload 12
    //   1289: istore 7
    //   1291: goto -797 -> 494
    //   1294: iload 12
    //   1296: istore 7
    //   1298: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1301: invokestatic 957	com/tencent/mm/sdk/platformtools/ao:is2G	(Landroid/content/Context;)Z
    //   1304: ifeq +73 -> 1377
    //   1307: iload 12
    //   1309: istore 7
    //   1311: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1314: ldc_w 964
    //   1317: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1320: astore 22
    //   1322: iload 12
    //   1324: istore 7
    //   1326: aload 22
    //   1328: ldc_w 916
    //   1331: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1334: iconst_0
    //   1335: aaload
    //   1336: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1339: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1342: istore 12
    //   1344: iload 12
    //   1346: istore 7
    //   1348: aload 22
    //   1350: ldc_w 916
    //   1353: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1356: iconst_1
    //   1357: aaload
    //   1358: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1361: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1364: istore 13
    //   1366: iload 13
    //   1368: istore 8
    //   1370: iload 12
    //   1372: istore 7
    //   1374: goto -880 -> 494
    //   1377: iload 12
    //   1379: istore 7
    //   1381: invokestatic 856	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   1384: invokestatic 960	com/tencent/mm/sdk/platformtools/ao:is3G	(Landroid/content/Context;)Z
    //   1387: ifeq +73 -> 1460
    //   1390: iload 12
    //   1392: istore 7
    //   1394: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1397: ldc_w 966
    //   1400: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1403: astore 22
    //   1405: iload 12
    //   1407: istore 7
    //   1409: aload 22
    //   1411: ldc_w 916
    //   1414: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1417: iconst_0
    //   1418: aaload
    //   1419: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1422: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1425: istore 12
    //   1427: iload 12
    //   1429: istore 7
    //   1431: aload 22
    //   1433: ldc_w 916
    //   1436: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1439: iconst_1
    //   1440: aaload
    //   1441: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1444: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1447: istore 13
    //   1449: iload 13
    //   1451: istore 8
    //   1453: iload 12
    //   1455: istore 7
    //   1457: goto -963 -> 494
    //   1460: iload 12
    //   1462: istore 7
    //   1464: invokestatic 868	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   1467: ldc_w 968
    //   1470: invokevirtual 875	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1473: astore 22
    //   1475: iload 12
    //   1477: istore 7
    //   1479: aload 22
    //   1481: ldc_w 916
    //   1484: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1487: iconst_0
    //   1488: aaload
    //   1489: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1492: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1495: istore 12
    //   1497: iload 12
    //   1499: istore 7
    //   1501: aload 22
    //   1503: ldc_w 916
    //   1506: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1509: iconst_1
    //   1510: aaload
    //   1511: invokestatic 923	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1514: invokevirtual 926	java/lang/Integer:intValue	()I
    //   1517: istore 13
    //   1519: iload 13
    //   1521: istore 8
    //   1523: iload 12
    //   1525: istore 7
    //   1527: goto -1033 -> 494
    //   1530: iload 8
    //   1532: sipush 2160
    //   1535: if_icmplt +14 -> 1549
    //   1538: iconst_0
    //   1539: istore 7
    //   1541: sipush 1080
    //   1544: istore 8
    //   1546: goto -972 -> 574
    //   1549: iload 8
    //   1551: ifgt +1504 -> 3055
    //   1554: iload 7
    //   1556: sipush 3240
    //   1559: if_icmple +1496 -> 3055
    //   1562: sipush 1620
    //   1565: istore 7
    //   1567: iconst_0
    //   1568: istore 8
    //   1570: goto -996 -> 574
    //   1573: astore 22
    //   1575: ldc 70
    //   1577: new 72	java/lang/StringBuilder
    //   1580: dup
    //   1581: ldc_w 970
    //   1584: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1587: aload 22
    //   1589: invokevirtual 752	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1592: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1595: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1598: invokestatic 593	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1601: iconst_0
    //   1602: istore 10
    //   1604: goto -888 -> 716
    //   1607: iconst_0
    //   1608: ireturn
    //   1609: new 53	android/graphics/BitmapFactory$Options
    //   1612: dup
    //   1613: invokespecial 54	android/graphics/BitmapFactory$Options:<init>	()V
    //   1616: astore 23
    //   1618: aload 23
    //   1620: invokestatic 974	com/tencent/mm/sdk/platformtools/c:c	(Landroid/graphics/BitmapFactory$Options;)V
    //   1623: aload_1
    //   1624: invokestatic 51	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   1627: astore 21
    //   1629: aload 21
    //   1631: invokevirtual 977	java/io/InputStream:markSupported	()Z
    //   1634: ifne +1415 -> 3049
    //   1637: aload 21
    //   1639: instanceof 597
    //   1642: ifeq +1407 -> 3049
    //   1645: new 599	com/tencent/mm/sdk/platformtools/i
    //   1648: dup
    //   1649: aload 21
    //   1651: checkcast 597	java/io/FileInputStream
    //   1654: invokespecial 602	com/tencent/mm/sdk/platformtools/i:<init>	(Ljava/io/FileInputStream;)V
    //   1657: astore 22
    //   1659: aload 22
    //   1661: astore 21
    //   1663: aload 21
    //   1665: ldc_w 603
    //   1668: invokevirtual 607	java/io/InputStream:mark	(I)V
    //   1671: new 121	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   1674: dup
    //   1675: invokespecial 122	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   1678: astore 22
    //   1680: aload 21
    //   1682: aconst_null
    //   1683: aload 23
    //   1685: aload 22
    //   1687: iconst_0
    //   1688: iconst_0
    //   1689: newarray <illegal type>
    //   1691: invokestatic 64	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   1694: astore 23
    //   1696: aload 21
    //   1698: invokevirtual 615	java/io/InputStream:reset	()V
    //   1701: aload 23
    //   1703: ifnonnull +45 -> 1748
    //   1706: aload 22
    //   1708: invokevirtual 130	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:getDecodeResult	()I
    //   1711: sipush 2000
    //   1714: if_icmplt +22 -> 1736
    //   1717: aload_1
    //   1718: bipush 10
    //   1720: aload 22
    //   1722: invokestatic 136	com/tencent/mm/sdk/platformtools/MMBitmapFactory$KVStatHelper:getKVStatString	(Ljava/lang/Object;ILcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Ljava/lang/String;
    //   1725: astore_0
    //   1726: getstatic 142	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   1729: sipush 12712
    //   1732: aload_0
    //   1733: invokevirtual 146	com/tencent/mm/plugin/report/service/h:k	(ILjava/lang/String;)V
    //   1736: aload 21
    //   1738: ifnull +8 -> 1746
    //   1741: aload 21
    //   1743: invokevirtual 105	java/io/InputStream:close	()V
    //   1746: iconst_0
    //   1747: ireturn
    //   1748: iload 10
    //   1750: i2f
    //   1751: fstore 6
    //   1753: aload 23
    //   1755: fload 6
    //   1757: invokestatic 159	com/tencent/mm/sdk/platformtools/c:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   1760: iload 9
    //   1762: getstatic 730	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1765: new 72	java/lang/StringBuilder
    //   1768: dup
    //   1769: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   1772: aload_0
    //   1773: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1776: aload_2
    //   1777: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1780: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1783: iconst_1
    //   1784: invokestatic 805	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1787: iload 17
    //   1789: ifeq +181 -> 1970
    //   1792: iload 10
    //   1794: ifne +176 -> 1970
    //   1797: new 72	java/lang/StringBuilder
    //   1800: dup
    //   1801: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   1804: aload_0
    //   1805: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1808: aload_2
    //   1809: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1812: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1815: invokestatic 284	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   1818: lstore 19
    //   1820: ldc 70
    //   1822: ldc_w 979
    //   1825: iconst_3
    //   1826: anewarray 163	java/lang/Object
    //   1829: dup
    //   1830: iconst_0
    //   1831: iload 14
    //   1833: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1836: aastore
    //   1837: dup
    //   1838: iconst_1
    //   1839: lload 19
    //   1841: invokestatic 706	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1844: aastore
    //   1845: dup
    //   1846: iconst_2
    //   1847: iload 12
    //   1849: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1852: aastore
    //   1853: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1856: iload 14
    //   1858: i2l
    //   1859: lload 19
    //   1861: lsub
    //   1862: ldc2_w 980
    //   1865: lmul
    //   1866: iload 12
    //   1868: iload 14
    //   1870: imul
    //   1871: i2l
    //   1872: lcmp
    //   1873: ifge +85 -> 1958
    //   1876: new 72	java/lang/StringBuilder
    //   1879: dup
    //   1880: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   1883: aload_0
    //   1884: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1887: aload_2
    //   1888: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1891: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1894: invokestatic 576	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   1897: pop
    //   1898: aload_1
    //   1899: new 72	java/lang/StringBuilder
    //   1902: dup
    //   1903: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   1906: aload_0
    //   1907: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1910: aload_2
    //   1911: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1914: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1917: invokestatic 567	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   1920: lstore 19
    //   1922: lload 19
    //   1924: lconst_0
    //   1925: lcmp
    //   1926: iflt +26 -> 1952
    //   1929: iconst_1
    //   1930: istore 17
    //   1932: iload 17
    //   1934: istore_3
    //   1935: aload 21
    //   1937: ifnull -984 -> 953
    //   1940: aload 21
    //   1942: invokevirtual 105	java/io/InputStream:close	()V
    //   1945: iload 17
    //   1947: ireturn
    //   1948: astore_0
    //   1949: iload 17
    //   1951: ireturn
    //   1952: iconst_0
    //   1953: istore 17
    //   1955: goto -23 -> 1932
    //   1958: aload 21
    //   1960: ifnull +8 -> 1968
    //   1963: aload 21
    //   1965: invokevirtual 105	java/io/InputStream:close	()V
    //   1968: iconst_1
    //   1969: ireturn
    //   1970: aload 21
    //   1972: ifnull +8 -> 1980
    //   1975: aload 21
    //   1977: invokevirtual 105	java/io/InputStream:close	()V
    //   1980: iconst_1
    //   1981: ireturn
    //   1982: astore_2
    //   1983: aconst_null
    //   1984: astore_0
    //   1985: ldc 70
    //   1987: aload_2
    //   1988: new 72	java/lang/StringBuilder
    //   1991: dup
    //   1992: ldc_w 983
    //   1995: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1998: aload_1
    //   1999: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2002: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2005: iconst_0
    //   2006: anewarray 163	java/lang/Object
    //   2009: invokestatic 167	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2012: aload_0
    //   2013: ifnull +7 -> 2020
    //   2016: aload_0
    //   2017: invokevirtual 105	java/io/InputStream:close	()V
    //   2020: iconst_0
    //   2021: ireturn
    //   2022: astore_1
    //   2023: aconst_null
    //   2024: astore_0
    //   2025: aload_0
    //   2026: ifnull +7 -> 2033
    //   2029: aload_0
    //   2030: invokevirtual 105	java/io/InputStream:close	()V
    //   2033: aload_1
    //   2034: athrow
    //   2035: ldc 70
    //   2037: new 72	java/lang/StringBuilder
    //   2040: dup
    //   2041: ldc_w 985
    //   2044: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2047: aload 21
    //   2049: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2052: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2055: ldc_w 938
    //   2058: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2061: aload 21
    //   2063: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2066: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2069: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2072: invokestatic 240	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2075: aload 21
    //   2077: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2080: ifgt +9 -> 2089
    //   2083: aload 21
    //   2085: iconst_1
    //   2086: putfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2089: aload 21
    //   2091: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2094: ifgt +9 -> 2103
    //   2097: aload 21
    //   2099: iconst_1
    //   2100: putfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2103: aload 21
    //   2105: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2108: aload 21
    //   2110: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2113: if_icmple +123 -> 2236
    //   2116: aload 21
    //   2118: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2121: aload 21
    //   2123: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2126: idiv
    //   2127: istore 7
    //   2129: iload 7
    //   2131: istore 8
    //   2133: iload 7
    //   2135: ifne +6 -> 2141
    //   2138: iconst_1
    //   2139: istore 8
    //   2141: ldc_w 952
    //   2144: iload 8
    //   2146: idiv
    //   2147: i2d
    //   2148: invokestatic 988	java/lang/Math:sqrt	(D)D
    //   2151: d2i
    //   2152: istore 7
    //   2154: aload 21
    //   2156: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2159: aload 21
    //   2161: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2164: if_icmple +88 -> 2252
    //   2167: iload 7
    //   2169: iload 8
    //   2171: imul
    //   2172: istore 10
    //   2174: ldc 70
    //   2176: new 72	java/lang/StringBuilder
    //   2179: dup
    //   2180: ldc_w 990
    //   2183: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2186: iload 10
    //   2188: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2191: ldc_w 938
    //   2194: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2197: iload 7
    //   2199: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2202: ldc_w 938
    //   2205: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2208: iload 8
    //   2210: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2213: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2216: invokestatic 240	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2219: aload_1
    //   2220: iload 7
    //   2222: iload 10
    //   2224: getstatic 730	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2227: iload 9
    //   2229: aload_0
    //   2230: aload_2
    //   2231: iload_3
    //   2232: invokestatic 992	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2235: ireturn
    //   2236: aload 21
    //   2238: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2241: aload 21
    //   2243: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2246: idiv
    //   2247: istore 7
    //   2249: goto -120 -> 2129
    //   2252: iload 7
    //   2254: iload 8
    //   2256: imul
    //   2257: istore 11
    //   2259: iload 7
    //   2261: istore 10
    //   2263: iload 11
    //   2265: istore 7
    //   2267: goto -93 -> 2174
    //   2270: iload 14
    //   2272: iload 15
    //   2274: if_icmpge +67 -> 2341
    //   2277: iload 17
    //   2279: ifeq +62 -> 2341
    //   2282: iload 10
    //   2284: ifne +57 -> 2341
    //   2287: ldc 70
    //   2289: new 72	java/lang/StringBuilder
    //   2292: dup
    //   2293: ldc_w 994
    //   2296: invokespecial 77	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2299: iload 15
    //   2301: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2304: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2307: invokestatic 240	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2310: aload_1
    //   2311: new 72	java/lang/StringBuilder
    //   2314: dup
    //   2315: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2318: aload_0
    //   2319: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2322: aload_2
    //   2323: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2326: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2329: invokestatic 567	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2332: lconst_0
    //   2333: lcmp
    //   2334: iflt +5 -> 2339
    //   2337: iconst_1
    //   2338: ireturn
    //   2339: iconst_0
    //   2340: ireturn
    //   2341: aload 21
    //   2343: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2346: aload 21
    //   2348: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2351: if_icmple +157 -> 2508
    //   2354: aload 21
    //   2356: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2359: istore 11
    //   2361: aload 21
    //   2363: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2366: aload 21
    //   2368: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2371: if_icmpge +147 -> 2518
    //   2374: aload 21
    //   2376: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2379: istore 13
    //   2381: iload 8
    //   2383: ifle +10 -> 2393
    //   2386: iload 13
    //   2388: iload 8
    //   2390: if_icmple +15 -> 2405
    //   2393: iload 8
    //   2395: ifgt +355 -> 2750
    //   2398: iload 11
    //   2400: iload 7
    //   2402: if_icmpgt +348 -> 2750
    //   2405: ldc 70
    //   2407: ldc_w 996
    //   2410: iconst_3
    //   2411: anewarray 163	java/lang/Object
    //   2414: dup
    //   2415: iconst_0
    //   2416: iload 14
    //   2418: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2421: aastore
    //   2422: dup
    //   2423: iconst_1
    //   2424: aload 21
    //   2426: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2429: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2432: aastore
    //   2433: dup
    //   2434: iconst_2
    //   2435: aload 21
    //   2437: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2440: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2443: aastore
    //   2444: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2447: aload_1
    //   2448: invokestatic 284	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   2451: ldc2_w 997
    //   2454: lcmp
    //   2455: ifge +120 -> 2575
    //   2458: iload 17
    //   2460: ifeq +70 -> 2530
    //   2463: ldc 70
    //   2465: ldc_w 1000
    //   2468: iconst_1
    //   2469: anewarray 163	java/lang/Object
    //   2472: dup
    //   2473: iconst_0
    //   2474: aload_1
    //   2475: aastore
    //   2476: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2479: aload_1
    //   2480: new 72	java/lang/StringBuilder
    //   2483: dup
    //   2484: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2487: aload_0
    //   2488: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2491: aload_2
    //   2492: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2495: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2498: invokestatic 567	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2501: lconst_0
    //   2502: lcmp
    //   2503: iflt +25 -> 2528
    //   2506: iconst_1
    //   2507: ireturn
    //   2508: aload 21
    //   2510: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2513: istore 11
    //   2515: goto -154 -> 2361
    //   2518: aload 21
    //   2520: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2523: istore 13
    //   2525: goto -144 -> 2381
    //   2528: iconst_0
    //   2529: ireturn
    //   2530: aload 21
    //   2532: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2535: sipush 150
    //   2538: if_icmpge +37 -> 2575
    //   2541: aload 21
    //   2543: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2546: sipush 150
    //   2549: if_icmpge +26 -> 2575
    //   2552: aload_1
    //   2553: aload 21
    //   2555: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2558: aload 21
    //   2560: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2563: getstatic 725	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   2566: iload 9
    //   2568: aload_0
    //   2569: aload_2
    //   2570: iload_3
    //   2571: invokestatic 992	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2574: ireturn
    //   2575: aload_1
    //   2576: aload 21
    //   2578: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2581: aload 21
    //   2583: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2586: getstatic 730	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2589: iload 9
    //   2591: aload_0
    //   2592: aload_2
    //   2593: iload_3
    //   2594: invokestatic 992	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2597: istore 18
    //   2599: iload 18
    //   2601: istore_3
    //   2602: iload 17
    //   2604: ifeq -1651 -> 953
    //   2607: iload 18
    //   2609: istore_3
    //   2610: iload 10
    //   2612: ifne -1659 -> 953
    //   2615: new 72	java/lang/StringBuilder
    //   2618: dup
    //   2619: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2622: aload_0
    //   2623: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2626: aload_2
    //   2627: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2630: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2633: invokestatic 284	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   2636: lstore 19
    //   2638: ldc 70
    //   2640: ldc_w 979
    //   2643: iconst_3
    //   2644: anewarray 163	java/lang/Object
    //   2647: dup
    //   2648: iconst_0
    //   2649: iload 14
    //   2651: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2654: aastore
    //   2655: dup
    //   2656: iconst_1
    //   2657: lload 19
    //   2659: invokestatic 706	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2662: aastore
    //   2663: dup
    //   2664: iconst_2
    //   2665: iload 12
    //   2667: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2670: aastore
    //   2671: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2674: iload 18
    //   2676: istore_3
    //   2677: iload 14
    //   2679: i2l
    //   2680: lload 19
    //   2682: lsub
    //   2683: ldc2_w 980
    //   2686: lmul
    //   2687: iload 12
    //   2689: iload 14
    //   2691: imul
    //   2692: i2l
    //   2693: lcmp
    //   2694: ifge -1741 -> 953
    //   2697: new 72	java/lang/StringBuilder
    //   2700: dup
    //   2701: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2704: aload_0
    //   2705: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2708: aload_2
    //   2709: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2712: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2715: invokestatic 576	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   2718: pop
    //   2719: aload_1
    //   2720: new 72	java/lang/StringBuilder
    //   2723: dup
    //   2724: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2727: aload_0
    //   2728: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2731: aload_2
    //   2732: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2735: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2738: invokestatic 567	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2741: lconst_0
    //   2742: lcmp
    //   2743: iflt +5 -> 2748
    //   2746: iconst_1
    //   2747: ireturn
    //   2748: iconst_0
    //   2749: ireturn
    //   2750: iload 8
    //   2752: ifle +177 -> 2929
    //   2755: aload_1
    //   2756: aload 21
    //   2758: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2761: aload 21
    //   2763: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2766: iload 8
    //   2768: getstatic 730	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2771: iload 9
    //   2773: aload_0
    //   2774: aload_2
    //   2775: invokestatic 1002	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IIILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;)Z
    //   2778: istore 18
    //   2780: iload 18
    //   2782: istore_3
    //   2783: iload 17
    //   2785: ifeq -1832 -> 953
    //   2788: iload 18
    //   2790: istore_3
    //   2791: iload 10
    //   2793: ifne -1840 -> 953
    //   2796: new 72	java/lang/StringBuilder
    //   2799: dup
    //   2800: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2803: aload_0
    //   2804: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2807: aload_2
    //   2808: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2811: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2814: invokestatic 284	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   2817: lstore 19
    //   2819: ldc 70
    //   2821: ldc_w 979
    //   2824: iconst_3
    //   2825: anewarray 163	java/lang/Object
    //   2828: dup
    //   2829: iconst_0
    //   2830: iload 14
    //   2832: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2835: aastore
    //   2836: dup
    //   2837: iconst_1
    //   2838: lload 19
    //   2840: invokestatic 706	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2843: aastore
    //   2844: dup
    //   2845: iconst_2
    //   2846: iload 12
    //   2848: invokestatic 629	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2851: aastore
    //   2852: invokestatic 209	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2855: iload 18
    //   2857: istore_3
    //   2858: iload 14
    //   2860: i2l
    //   2861: lload 19
    //   2863: lsub
    //   2864: ldc2_w 980
    //   2867: lmul
    //   2868: iload 12
    //   2870: iload 14
    //   2872: imul
    //   2873: i2l
    //   2874: lcmp
    //   2875: ifge -1922 -> 953
    //   2878: new 72	java/lang/StringBuilder
    //   2881: dup
    //   2882: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2885: aload_0
    //   2886: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2889: aload_2
    //   2890: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2893: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2896: invokestatic 576	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   2899: pop
    //   2900: aload_1
    //   2901: new 72	java/lang/StringBuilder
    //   2904: dup
    //   2905: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   2908: aload_0
    //   2909: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2912: aload_2
    //   2913: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2916: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2919: invokestatic 567	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2922: lconst_0
    //   2923: lcmp
    //   2924: iflt +57 -> 2981
    //   2927: iconst_1
    //   2928: ireturn
    //   2929: iload 11
    //   2931: i2d
    //   2932: dconst_1
    //   2933: dmul
    //   2934: iload 7
    //   2936: i2d
    //   2937: ddiv
    //   2938: dstore 4
    //   2940: aload 21
    //   2942: getfield 116	android/graphics/BitmapFactory$Options:outWidth	I
    //   2945: i2d
    //   2946: dload 4
    //   2948: ddiv
    //   2949: d2i
    //   2950: istore 7
    //   2952: aload_1
    //   2953: aload 21
    //   2955: getfield 119	android/graphics/BitmapFactory$Options:outHeight	I
    //   2958: i2d
    //   2959: dload 4
    //   2961: ddiv
    //   2962: d2i
    //   2963: iload 7
    //   2965: getstatic 730	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2968: iload 9
    //   2970: aload_0
    //   2971: aload_2
    //   2972: iload_3
    //   2973: invokestatic 992	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2976: istore 18
    //   2978: goto -198 -> 2780
    //   2981: iconst_0
    //   2982: ireturn
    //   2983: astore_0
    //   2984: goto -1238 -> 1746
    //   2987: astore_0
    //   2988: goto -1020 -> 1968
    //   2991: astore_0
    //   2992: goto -1012 -> 1980
    //   2995: astore_0
    //   2996: goto -976 -> 2020
    //   2999: astore_0
    //   3000: goto -967 -> 2033
    //   3003: astore_1
    //   3004: aload 21
    //   3006: astore_0
    //   3007: goto -982 -> 2025
    //   3010: astore_1
    //   3011: aload 21
    //   3013: astore_0
    //   3014: goto -989 -> 2025
    //   3017: astore_1
    //   3018: goto -993 -> 2025
    //   3021: astore_2
    //   3022: aload 21
    //   3024: astore_0
    //   3025: goto -1040 -> 1985
    //   3028: astore_2
    //   3029: aload 21
    //   3031: astore_0
    //   3032: goto -1047 -> 1985
    //   3035: astore 22
    //   3037: goto -2543 -> 494
    //   3040: astore 22
    //   3042: iload 8
    //   3044: istore 7
    //   3046: goto -2755 -> 291
    //   3049: goto -1386 -> 1663
    //   3052: goto -2370 -> 682
    //   3055: goto -2481 -> 574
    //   3058: iload 8
    //   3060: istore 11
    //   3062: iload 7
    //   3064: istore 9
    //   3066: goto -2697 -> 369
    //   3069: iload 7
    //   3071: istore 9
    //   3073: goto -2704 -> 369
    //   3076: goto -2740 -> 336
    //   3079: bipush 100
    //   3081: istore 9
    //   3083: goto -2714 -> 369
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3086	0	paramString1	String
    //   0	3086	1	paramString2	String
    //   0	3086	2	paramString3	String
    //   0	3086	3	paramBoolean	boolean
    //   2938	22	4	d	double
    //   1751	5	6	f	float
    //   110	2960	7	i	int
    //   118	2941	8	j	int
    //   363	2719	9	k	int
    //   103	2689	10	m	int
    //   106	2955	11	n	int
    //   419	2454	12	i1	int
    //   484	2040	13	i2	int
    //   374	2499	14	i3	int
    //   609	1691	15	i4	int
    //   648	266	16	i5	int
    //   65	2719	17	bool1	boolean
    //   2597	380	18	bool2	boolean
    //   1818	1044	19	l	long
    //   4	3026	21	localObject1	Object
    //   16	1486	22	localObject2	Object
    //   1573	15	22	localException1	Exception
    //   1657	64	22	localObject3	Object
    //   3035	1	22	localException2	Exception
    //   3040	1	22	localException3	Exception
    //   1616	138	23	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   690	696	1573	java/lang/Exception
    //   705	716	1573	java/lang/Exception
    //   1940	1945	1948	java/io/IOException
    //   1623	1629	1982	java/io/IOException
    //   1623	1629	2022	finally
    //   1741	1746	2983	java/io/IOException
    //   1963	1968	2987	java/io/IOException
    //   1975	1980	2991	java/io/IOException
    //   2016	2020	2995	java/io/IOException
    //   2029	2033	2999	java/io/IOException
    //   1629	1659	3003	finally
    //   1663	1701	3010	finally
    //   1706	1736	3010	finally
    //   1753	1787	3010	finally
    //   1797	1856	3010	finally
    //   1876	1922	3010	finally
    //   1985	2012	3017	finally
    //   1629	1659	3021	java/io/IOException
    //   1663	1701	3028	java/io/IOException
    //   1706	1736	3028	java/io/IOException
    //   1753	1787	3028	java/io/IOException
    //   1797	1856	3028	java/io/IOException
    //   1876	1922	3028	java/io/IOException
    //   431	442	3035	java/lang/Exception
    //   446	464	3035	java/lang/Exception
    //   468	486	3035	java/lang/Exception
    //   1215	1224	3035	java/lang/Exception
    //   1228	1239	3035	java/lang/Exception
    //   1243	1261	3035	java/lang/Exception
    //   1265	1283	3035	java/lang/Exception
    //   1298	1307	3035	java/lang/Exception
    //   1311	1322	3035	java/lang/Exception
    //   1326	1344	3035	java/lang/Exception
    //   1348	1366	3035	java/lang/Exception
    //   1381	1390	3035	java/lang/Exception
    //   1394	1405	3035	java/lang/Exception
    //   1409	1427	3035	java/lang/Exception
    //   1431	1449	3035	java/lang/Exception
    //   1464	1475	3035	java/lang/Exception
    //   1479	1497	3035	java/lang/Exception
    //   1501	1519	3035	java/lang/Exception
    //   120	124	3040	java/lang/Exception
    //   128	136	3040	java/lang/Exception
    //   140	146	3040	java/lang/Exception
    //   150	156	3040	java/lang/Exception
    //   160	169	3040	java/lang/Exception
    //   173	189	3040	java/lang/Exception
    //   193	291	3040	java/lang/Exception
    //   1022	1031	3040	java/lang/Exception
    //   1035	1051	3040	java/lang/Exception
    //   1058	1067	3040	java/lang/Exception
    //   1071	1087	3040	java/lang/Exception
    //   1094	1110	3040	java/lang/Exception
    //   1117	1126	3040	java/lang/Exception
    //   1130	1147	3040	java/lang/Exception
    //   1154	1163	3040	java/lang/Exception
    //   1167	1184	3040	java/lang/Exception
    //   1191	1208	3040	java/lang/Exception
  }
  
  public static int getScreenWidth()
  {
    if (niY > nig) {
      return nig;
    }
    return niY;
  }
  
  public final r NA(String paramString)
  {
    r localr = new r();
    paramString = this.dCZ.a("SnsMedia", null, "StrId=?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst())
    {
      localr.d(paramString);
      paramString.close();
      return localr;
    }
    paramString.close();
    return null;
  }
  
  public final int a(int paramInt, r paramr)
  {
    paramr = paramr.bBA();
    return this.dCZ.update("SnsMedia", paramr, "local_id=?", new String[] { String.valueOf(paramInt) });
  }
  
  public final com.tencent.mm.plugin.sns.data.h a(com.tencent.mm.plugin.sns.data.h paramh, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    r localr = new r();
    localr.createTime = ((int)bi.VE());
    localr.type = paramh.type;
    ath localath = new ath();
    localath.rVG = paramh.nkY;
    localath.rWb = paramh.nkX;
    localath.token = paramh.nla;
    localath.rWk = paramh.nlb;
    localath.rWy = 0;
    localath.rWx = new atb();
    localath.dHg = 0;
    localath.jOS = paramh.desc;
    x.d("MicroMsg.snsMediaStorage", "upload.filterId " + paramh.nkW);
    localath.rWa = paramh.nkW;
    localath.rWA = 2;
    localath.videoPath = paramString1;
    localath.rWC = paramString2;
    localath.bKg = paramh.nlc;
    for (;;)
    {
      try
      {
        localr.nJM = localath.toByteArray();
        localr.bBB();
        i = (int)this.dCZ.insert("SnsMedia", "local_id", localr.bBA());
        str1 = "Locall_path" + i;
        x.d("MicroMsg.snsMediaStorage", "insert localId " + i);
        String str2 = i.LE(str1);
        String str3 = i.LF(str1);
        String str4 = i.LD(str1);
        String str5 = i.LG(str1);
        String str6 = Nz(str1);
        FileOp.mL(str6);
        FileOp.y(paramString2, str6 + str2);
        FileOp.y(paramString2, str6 + str3);
        FileOp.y(paramString2, str6 + str4);
        FileOp.y(paramString1, str6 + str5);
        localath.videoPath = (str6 + str5);
        localath.rWC = (str6 + str3);
        localath.bKg = paramh.nlc;
      }
      catch (Exception localException)
      {
        try
        {
          int i;
          String str1;
          localr.nJM = localath.toByteArray();
          localr.nJI = str1;
          if ((TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString4)))
          {
            a(i, localr);
            paramh = a(paramh, localath.rWC);
            paramh.nkZ = i;
            return paramh;
            localException = localException;
            x.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
          }
        }
        catch (Exception paramString2)
        {
          x.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
          continue;
          paramString2 = new atb();
          paramString2.hcE = 1;
          paramString2.jPK = paramString3;
          localath.rWx = paramString2;
          localath.rWA = 0;
          com.tencent.mm.modelcdntran.g.NE();
          localath.rVZ = b.ls(paramString1);
          if (!bi.oW(paramString4))
          {
            paramString1 = new atb();
            paramString1.hcE = 1;
            paramString1.jPK = paramString4;
            localath.rWz.add(paramString1);
          }
        }
      }
      try
      {
        localr.nJM = localath.toByteArray();
        localr.bBC();
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "", new Object[0]);
        }
      }
    }
  }
  
  public final boolean a(String paramString, r paramr)
  {
    x.d("MicroMsg.snsMediaStorage", "replace AlbumLikeList " + paramString);
    Cursor localCursor = this.dCZ.a("SnsMedia", null, "StrId=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      localCursor.close();
      x.d("MicroMsg.snsMediaStorage", "snsMedia Insert");
      if (paramr != null)
      {
        paramString = paramr.bBA();
        if ((int)this.dCZ.insert("SnsMedia", "local_id", paramString) != -1) {
          return true;
        }
      }
      return false;
    }
    localCursor.close();
    paramr = paramr.bBA();
    return this.dCZ.update("SnsMedia", paramr, "StrId=?", new String[] { paramString }) > 0;
  }
  
  public final List<com.tencent.mm.plugin.sns.data.h> cn(List<com.tencent.mm.plugin.sns.data.h> paramList)
  {
    LinkedList localLinkedList = new LinkedList();
    if ((paramList == null) || (paramList.size() == 0)) {
      return null;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.plugin.sns.data.h localh1 = (com.tencent.mm.plugin.sns.data.h)paramList.next();
      int i = a(localh1);
      if (i == -1) {
        return null;
      }
      com.tencent.mm.plugin.sns.data.h localh2 = new com.tencent.mm.plugin.sns.data.h(i, localh1.type);
      localh2.height = localh1.height;
      localh2.width = localh1.width;
      localh2.fileSize = localh1.fileSize;
      localLinkedList.add(localh2);
    }
    return localLinkedList;
  }
  
  public final r fj(long paramLong)
  {
    r localr = new r();
    Cursor localCursor = this.dCZ.a("SnsMedia", null, "local_id=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return null;
    }
    localr.d(localCursor);
    localCursor.close();
    return localr;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
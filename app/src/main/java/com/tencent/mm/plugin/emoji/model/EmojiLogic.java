package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.model.au;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.adb;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.io.File;
import java.util.Map;

public class EmojiLogic
{
  public static final String ihe = File.separator;
  
  public static String K(String paramString1, String paramString2, String paramString3)
  {
    if ((bi.oW(paramString2)) && (bi.oW(paramString3))) {
      x.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and url are null.");
    }
    do
    {
      return null;
      paramString3 = cw(paramString2, paramString3);
    } while (bi.oW(paramString3));
    if (bi.oW(paramString2)) {
      return paramString1 + paramString3;
    }
    return paramString1 + paramString2 + ihe + paramString3;
  }
  
  public static String L(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    if ((bi.oW(paramString2)) && (bi.oW(paramString3)))
    {
      x.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and md5 are null.");
      return null;
    }
    if (!bi.oW(paramString3)) {
      if (!bi.oW(paramString2)) {
        break label83;
      }
    }
    label83:
    for (str = paramString1 + paramString3;; str = paramString1 + paramString2 + ihe + paramString3)
    {
      x.d("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path. productid:%s md5:%s path:%s", new Object[] { paramString2, paramString3, str });
      return str;
    }
  }
  
  public static EmojiInfo a(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    int j = 0;
    if (TextUtils.isEmpty(paramString1))
    {
      x.d("MicroMsg.emoji.EmojiLogic", "getIcon : productId is null.");
      return null;
    }
    EmojiInfo localEmojiInfo = new EmojiInfo();
    if (paramBoolean)
    {
      au.HU();
      str = K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
      int i = j;
      if (e.cn(str))
      {
        File localFile = new File(str);
        i = j;
        if (localFile.exists())
        {
          if (localFile.length() >= 1L) {
            break label139;
          }
          localFile.delete();
        }
      }
      for (i = j; i == 0; i = 1)
      {
        x.d("MicroMsg.emoji.EmojiLogic", "banner icon does not exist. icon path :" + str + "...., icon type:" + paramInt);
        return null;
        label139:
        localEmojiInfo.field_type = ak(e.e(str, 0, 10));
      }
    }
    au.HU();
    String str = K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!e.cn(str))
    {
      x.d("MicroMsg.emoji.EmojiLogic", "icon file no exist. path:%s type:%d, url:%s", new Object[] { str, Integer.valueOf(paramInt), paramString2 });
      return null;
    }
    localEmojiInfo.field_md5 = cw(paramString1, paramString2);
    switch (paramInt)
    {
    default: 
      paramInt = EmojiInfo.tcD;
    }
    for (;;)
    {
      localEmojiInfo.field_catalog = paramInt;
      localEmojiInfo.field_groupId = paramString1;
      localEmojiInfo.field_temp = 1;
      return localEmojiInfo;
      paramInt = 82;
      continue;
      paramInt = 83;
      continue;
      paramInt = 84;
    }
  }
  
  public static EmojiInfo a(String paramString1, String paramString2, com.tencent.mm.ak.a.c.i parami)
  {
    au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      if (ad.getContext() == null) {}
      while (ad.getContext().getResources() == null) {
        return null;
      }
      new EmojiInfo().field_type = EmojiInfo.tcI;
      return null;
    }
    EmojiInfo localEmojiInfo = a(paramString1, 4, paramString2, true);
    if (localEmojiInfo == null)
    {
      com.tencent.mm.ak.o.Pj().a(paramString2, null, f.c(paramString1, paramString2, new Object[0]), parami);
      x.i("MicroMsg.emoji.EmojiLogic", "[cpan] get emoji info, try to load image:%s", new Object[] { paramString2 });
    }
    return localEmojiInfo;
  }
  
  public static String a(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    if (paramInt1 > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<tid>" + paramInt1 + "</tid>");
      localStringBuilder.append("<title>" + paramString1 + "</title>");
      localStringBuilder.append("<desc>" + paramString2 + "</desc>");
      localStringBuilder.append("<iconUrl>" + paramString3 + "</iconUrl>");
      localStringBuilder.append("<secondUrl>" + paramString4 + "</secondUrl>");
      localStringBuilder.append("<pageType>" + paramInt2 + "</pageType>");
      localStringBuilder.append("</xml>");
      paramString1 = localStringBuilder.toString();
      x.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString1 });
      return paramString1;
    }
    return null;
  }
  
  public static void a(Context paramContext, byte[] paramArrayOfByte, String paramString1, String paramString2, EmojiInfo paramEmojiInfo)
  {
    boolean bool;
    label43:
    int i;
    int j;
    float f;
    if (paramArrayOfByte == null) {
      if (paramEmojiInfo == null)
      {
        bool = true;
        x.d("MicroMsg.emoji.EmojiLogic", "insertEmoji: thumb is null, emojiInfo is null ? %B", new Object[] { Boolean.valueOf(bool) });
        if (paramEmojiInfo != null)
        {
          paramContext = paramEmojiInfo.gi(paramContext);
          if ((paramContext == null) || ((paramContext.getWidth() <= 300) && (paramContext.getHeight() <= 300))) {
            break label355;
          }
          i = paramContext.getWidth();
          j = paramContext.getHeight();
          x.i("MicroMsg.emoji.EmojiLogic", "cpan app msg width:%d height:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if (i <= j) {
            break label258;
          }
          f = j / i;
          j = 300;
          i = (int)(f * 300.0F);
          label135:
          x.i("MicroMsg.emoji.EmojiLogic", "cpan app msg new width:%d new height:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          paramContext = com.tencent.mm.sdk.platformtools.c.a(paramContext, i, j, false, true);
        }
      }
    }
    label258:
    label355:
    for (;;)
    {
      if (paramContext != null) {}
      try
      {
        if (paramContext.getByteCount() > 32768)
        {
          com.tencent.mm.sdk.platformtools.c.a(paramContext, 80, Bitmap.CompressFormat.JPEG, paramString2 + paramString1 + "_thumb", true);
          x.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is over size. save as jpg. size :%d", new Object[] { Integer.valueOf(paramContext.getByteCount()) });
          return;
          bool = false;
          break;
          paramContext = com.tencent.mm.sdk.platformtools.c.bs(paramArrayOfByte);
          break label43;
          f = i / j;
          i = 300;
          j = (int)(f * 300.0F);
          break label135;
        }
        com.tencent.mm.sdk.platformtools.c.a(paramContext, 100, Bitmap.CompressFormat.PNG, paramString2 + paramString1 + "_thumb", true);
        x.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is in normal size. sav as png. size :%d", new Object[] { Integer.valueOf(paramContext.getByteCount()) });
        return;
      }
      catch (Exception paramContext)
      {
        x.printErrStackTrace("MicroMsg.emoji.EmojiLogic", paramContext, "insertEmoji Error", new Object[0]);
        return;
      }
    }
  }
  
  private static void a(Context paramContext, byte[] paramArrayOfByte1, String paramString1, byte[] paramArrayOfByte2, String paramString2)
  {
    if ((paramString1 == null) && (paramArrayOfByte2 == null)) {
      return;
    }
    au.HU();
    String str = com.tencent.mm.model.c.Gg();
    e.b(str + paramString1, paramArrayOfByte2, paramArrayOfByte2.length);
    if (com.tencent.mm.sdk.platformtools.o.bv(paramArrayOfByte2)) {}
    for (paramArrayOfByte2 = i.aEA().igx.a(paramString1, "", EmojiInfo.tcB, EmojiInfo.tcL, paramArrayOfByte2.length, paramString2, "");; paramArrayOfByte2 = i.aEA().igx.a(paramString1, "", EmojiInfo.tcB, EmojiInfo.tcM, paramArrayOfByte2.length, paramString2, ""))
    {
      a(paramContext, paramArrayOfByte1, paramString1, str, paramArrayOfByte2);
      return;
    }
  }
  
  /* Error */
  public static boolean a(String paramString1, String paramString2, com.tencent.mm.storage.emotion.EmojiGroupInfo paramEmojiGroupInfo)
  {
    // Byte code:
    //   0: new 43	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   7: getstatic 337	com/tencent/mm/compatible/util/e:dgj	Ljava/lang/String;
    //   10: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: aload_0
    //   14: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   20: astore 14
    //   22: new 43	java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   29: astore 7
    //   31: invokestatic 82	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   34: pop
    //   35: aload 7
    //   37: invokestatic 87	com/tencent/mm/model/c:Gg	()Ljava/lang/String;
    //   40: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: aload_0
    //   44: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: astore 19
    //   52: aconst_null
    //   53: astore 12
    //   55: aconst_null
    //   56: astore 8
    //   58: aconst_null
    //   59: astore 13
    //   61: aconst_null
    //   62: astore 10
    //   64: aconst_null
    //   65: astore 7
    //   67: aconst_null
    //   68: astore 9
    //   70: aconst_null
    //   71: astore 15
    //   73: aconst_null
    //   74: astore 11
    //   76: aconst_null
    //   77: astore 16
    //   79: new 339	java/util/HashMap
    //   82: dup
    //   83: invokespecial 340	java/util/HashMap:<init>	()V
    //   86: astore 20
    //   88: new 342	java/util/ArrayList
    //   91: dup
    //   92: invokespecial 343	java/util/ArrayList:<init>	()V
    //   95: astore 18
    //   97: new 345	java/util/zip/ZipFile
    //   100: dup
    //   101: aload 14
    //   103: invokespecial 346	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   106: astore 14
    //   108: aload 16
    //   110: astore 9
    //   112: aload 12
    //   114: astore 11
    //   116: aload 14
    //   118: astore 12
    //   120: aload 15
    //   122: astore 8
    //   124: aload 13
    //   126: astore 10
    //   128: aload 14
    //   130: invokevirtual 350	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   133: astore 21
    //   135: iconst_0
    //   136: istore_3
    //   137: aconst_null
    //   138: astore 12
    //   140: aload 12
    //   142: astore 10
    //   144: aload 7
    //   146: astore 8
    //   148: aload 12
    //   150: astore 11
    //   152: aload 7
    //   154: astore 9
    //   156: aload 21
    //   158: invokeinterface 355 1 0
    //   163: ifeq +1526 -> 1689
    //   166: aload 12
    //   168: astore 10
    //   170: aload 7
    //   172: astore 8
    //   174: aload 12
    //   176: astore 11
    //   178: aload 7
    //   180: astore 9
    //   182: aload 21
    //   184: invokeinterface 359 1 0
    //   189: checkcast 361	java/util/zip/ZipEntry
    //   192: astore 15
    //   194: aload 12
    //   196: astore 10
    //   198: aload 7
    //   200: astore 8
    //   202: aload 7
    //   204: astore 13
    //   206: aload 12
    //   208: astore 11
    //   210: aload 7
    //   212: astore 9
    //   214: aload 15
    //   216: invokevirtual 364	java/util/zip/ZipEntry:isDirectory	()Z
    //   219: ifne +2998 -> 3217
    //   222: aload 12
    //   224: astore 10
    //   226: aload 7
    //   228: astore 8
    //   230: aload 12
    //   232: astore 11
    //   234: aload 7
    //   236: astore 9
    //   238: aload 14
    //   240: aload 15
    //   242: invokevirtual 368	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   245: astore 7
    //   247: aload 12
    //   249: astore 10
    //   251: aload 7
    //   253: astore 8
    //   255: aload 12
    //   257: astore 11
    //   259: aload 7
    //   261: astore 9
    //   263: aload 15
    //   265: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   268: aload 15
    //   270: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   273: ldc_w 373
    //   276: invokevirtual 379	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   279: iconst_1
    //   280: iadd
    //   281: invokevirtual 383	java/lang/String:substring	(I)Ljava/lang/String;
    //   284: invokevirtual 386	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   287: astore 22
    //   289: aload 12
    //   291: astore 10
    //   293: aload 7
    //   295: astore 8
    //   297: aload 12
    //   299: astore 11
    //   301: aload 7
    //   303: astore 9
    //   305: new 10	java/io/File
    //   308: dup
    //   309: new 43	java/lang/StringBuilder
    //   312: dup
    //   313: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   316: aload 19
    //   318: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: ldc_w 373
    //   324: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: aload 15
    //   329: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   332: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   338: invokespecial 97	java/io/File:<init>	(Ljava/lang/String;)V
    //   341: astore 13
    //   343: aload 12
    //   345: astore 10
    //   347: aload 7
    //   349: astore 8
    //   351: aload 12
    //   353: astore 11
    //   355: aload 7
    //   357: astore 9
    //   359: aload 13
    //   361: invokevirtual 389	java/io/File:isFile	()Z
    //   364: ifeq +25 -> 389
    //   367: aload 12
    //   369: astore 10
    //   371: aload 7
    //   373: astore 8
    //   375: aload 12
    //   377: astore 11
    //   379: aload 7
    //   381: astore 9
    //   383: aload 13
    //   385: invokevirtual 108	java/io/File:delete	()Z
    //   388: pop
    //   389: aload 12
    //   391: astore 10
    //   393: aload 7
    //   395: astore 8
    //   397: aload 12
    //   399: astore 11
    //   401: aload 7
    //   403: astore 9
    //   405: aload 13
    //   407: invokevirtual 393	java/io/File:getParentFile	()Ljava/io/File;
    //   410: invokevirtual 396	java/io/File:mkdirs	()Z
    //   413: pop
    //   414: aload 12
    //   416: astore 10
    //   418: aload 7
    //   420: astore 8
    //   422: aload 7
    //   424: astore 13
    //   426: aload 12
    //   428: astore 11
    //   430: aload 7
    //   432: astore 9
    //   434: aload 22
    //   436: ldc_w 398
    //   439: invokevirtual 401	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   442: ifne +2775 -> 3217
    //   445: aload 12
    //   447: astore 10
    //   449: aload 7
    //   451: astore 8
    //   453: aload 12
    //   455: astore 11
    //   457: aload 7
    //   459: astore 9
    //   461: aload 22
    //   463: ldc_w 403
    //   466: invokevirtual 406	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   469: ifne +34 -> 503
    //   472: aload 12
    //   474: astore 10
    //   476: aload 7
    //   478: astore 8
    //   480: aload 7
    //   482: astore 13
    //   484: aload 12
    //   486: astore 11
    //   488: aload 7
    //   490: astore 9
    //   492: aload 22
    //   494: ldc_w 408
    //   497: invokevirtual 406	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   500: ifeq +2717 -> 3217
    //   503: aload 12
    //   505: astore 10
    //   507: aload 7
    //   509: astore 8
    //   511: aload 12
    //   513: astore 11
    //   515: aload 7
    //   517: astore 9
    //   519: aload 15
    //   521: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   524: invokevirtual 386	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   527: ldc_w 410
    //   530: invokevirtual 413	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   533: ifeq +871 -> 1404
    //   536: aload 12
    //   538: astore 10
    //   540: aload 7
    //   542: astore 8
    //   544: aload 12
    //   546: astore 11
    //   548: aload 7
    //   550: astore 9
    //   552: new 415	java/io/FileOutputStream
    //   555: dup
    //   556: new 43	java/lang/StringBuilder
    //   559: dup
    //   560: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   563: aload 19
    //   565: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   571: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: aload 22
    //   576: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   582: invokespecial 416	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   585: astore 13
    //   587: aload 13
    //   589: astore 9
    //   591: aload 7
    //   593: astore 11
    //   595: aload 14
    //   597: astore 12
    //   599: aload 13
    //   601: astore 8
    //   603: aload 7
    //   605: astore 10
    //   607: ldc_w 417
    //   610: newarray <illegal type>
    //   612: astore 15
    //   614: aload 13
    //   616: astore 9
    //   618: aload 7
    //   620: astore 11
    //   622: aload 14
    //   624: astore 12
    //   626: aload 13
    //   628: astore 8
    //   630: aload 7
    //   632: astore 10
    //   634: aload 7
    //   636: aload 15
    //   638: invokevirtual 422	java/io/InputStream:read	([B)I
    //   641: istore 4
    //   643: iload 4
    //   645: ifle +106 -> 751
    //   648: aload 13
    //   650: astore 9
    //   652: aload 7
    //   654: astore 11
    //   656: aload 14
    //   658: astore 12
    //   660: aload 13
    //   662: astore 8
    //   664: aload 7
    //   666: astore 10
    //   668: aload 13
    //   670: aload 15
    //   672: iconst_0
    //   673: iload 4
    //   675: invokevirtual 428	java/io/OutputStream:write	([BII)V
    //   678: goto -64 -> 614
    //   681: astore_2
    //   682: aload 11
    //   684: astore_1
    //   685: aload 9
    //   687: astore_0
    //   688: aload 14
    //   690: astore 12
    //   692: aload_0
    //   693: astore 8
    //   695: aload_1
    //   696: astore 10
    //   698: ldc 29
    //   700: new 43	java/lang/StringBuilder
    //   703: dup
    //   704: ldc_w 430
    //   707: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   710: aload_2
    //   711: invokevirtual 433	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   714: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   720: invokestatic 435	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   723: aload_0
    //   724: ifnull +7 -> 731
    //   727: aload_0
    //   728: invokevirtual 438	java/io/OutputStream:close	()V
    //   731: aload_1
    //   732: ifnull +7 -> 739
    //   735: aload_1
    //   736: invokevirtual 439	java/io/InputStream:close	()V
    //   739: aload 14
    //   741: ifnull +8 -> 749
    //   744: aload 14
    //   746: invokevirtual 440	java/util/zip/ZipFile:close	()V
    //   749: iconst_0
    //   750: ireturn
    //   751: aload 13
    //   753: astore 9
    //   755: aload 7
    //   757: astore 11
    //   759: aload 14
    //   761: astore 12
    //   763: aload 13
    //   765: astore 8
    //   767: aload 7
    //   769: astore 10
    //   771: aload 13
    //   773: invokevirtual 438	java/io/OutputStream:close	()V
    //   776: aconst_null
    //   777: astore 15
    //   779: aconst_null
    //   780: astore 16
    //   782: aconst_null
    //   783: astore 13
    //   785: aload 15
    //   787: astore 10
    //   789: aload 7
    //   791: astore 8
    //   793: aload 16
    //   795: astore 11
    //   797: aload 7
    //   799: astore 9
    //   801: new 43	java/lang/StringBuilder
    //   804: dup
    //   805: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   808: aload 19
    //   810: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   816: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   819: aload 22
    //   821: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   824: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   827: invokestatic 446	com/tencent/mm/a/g:cu	(Ljava/lang/String;)Ljava/lang/String;
    //   830: astore 23
    //   832: aload 15
    //   834: astore 10
    //   836: aload 7
    //   838: astore 8
    //   840: aload 16
    //   842: astore 11
    //   844: aload 7
    //   846: astore 9
    //   848: ldc 29
    //   850: ldc_w 448
    //   853: iconst_2
    //   854: anewarray 4	java/lang/Object
    //   857: dup
    //   858: iconst_0
    //   859: aload 23
    //   861: aastore
    //   862: dup
    //   863: iconst_1
    //   864: iload_3
    //   865: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   868: aastore
    //   869: invokestatic 194	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   872: aload 15
    //   874: astore 10
    //   876: aload 7
    //   878: astore 8
    //   880: aload 16
    //   882: astore 11
    //   884: aload 7
    //   886: astore 9
    //   888: new 10	java/io/File
    //   891: dup
    //   892: new 43	java/lang/StringBuilder
    //   895: dup
    //   896: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   899: aload 19
    //   901: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   904: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   907: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   910: aload 22
    //   912: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   915: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   918: invokespecial 97	java/io/File:<init>	(Ljava/lang/String;)V
    //   921: astore 24
    //   923: aload 15
    //   925: astore 10
    //   927: aload 7
    //   929: astore 8
    //   931: aload 16
    //   933: astore 11
    //   935: aload 7
    //   937: astore 9
    //   939: new 10	java/io/File
    //   942: dup
    //   943: new 43	java/lang/StringBuilder
    //   946: dup
    //   947: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   950: aload 19
    //   952: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   955: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   958: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   961: aload 23
    //   963: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   966: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   969: invokespecial 97	java/io/File:<init>	(Ljava/lang/String;)V
    //   972: astore 25
    //   974: aload 15
    //   976: astore 10
    //   978: aload 7
    //   980: astore 8
    //   982: aload 16
    //   984: astore 11
    //   986: aload 7
    //   988: astore 9
    //   990: aload 24
    //   992: invokevirtual 451	java/io/File:getPath	()Ljava/lang/String;
    //   995: invokestatic 454	com/tencent/mm/sdk/platformtools/o:Wf	(Ljava/lang/String;)Z
    //   998: ifeq +382 -> 1380
    //   1001: aload 15
    //   1003: astore 10
    //   1005: aload 7
    //   1007: astore 8
    //   1009: aload 16
    //   1011: astore 11
    //   1013: aload 7
    //   1015: astore 9
    //   1017: getstatic 457	com/tencent/mm/storage/emotion/EmojiInfo:tcJ	I
    //   1020: istore 4
    //   1022: aload 15
    //   1024: astore 10
    //   1026: aload 7
    //   1028: astore 8
    //   1030: aload 16
    //   1032: astore 11
    //   1034: aload 7
    //   1036: astore 9
    //   1038: invokestatic 307	com/tencent/mm/plugin/emoji/model/i:aEA	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   1041: getfield 313	com/tencent/mm/plugin/emoji/e/l:igx	Lcom/tencent/mm/storage/emotion/d;
    //   1044: aload 23
    //   1046: invokevirtual 461	com/tencent/mm/storage/emotion/d:Zy	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   1049: astore 17
    //   1051: aload 17
    //   1053: astore 12
    //   1055: aload 17
    //   1057: ifnonnull +50 -> 1107
    //   1060: aload 15
    //   1062: astore 10
    //   1064: aload 7
    //   1066: astore 8
    //   1068: aload 16
    //   1070: astore 11
    //   1072: aload 7
    //   1074: astore 9
    //   1076: new 75	com/tencent/mm/storage/emotion/EmojiInfo
    //   1079: dup
    //   1080: invokespecial 76	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   1083: astore 12
    //   1085: aload 15
    //   1087: astore 10
    //   1089: aload 7
    //   1091: astore 8
    //   1093: aload 16
    //   1095: astore 11
    //   1097: aload 7
    //   1099: astore 9
    //   1101: aload 12
    //   1103: iconst_0
    //   1104: putfield 145	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   1107: aload 15
    //   1109: astore 10
    //   1111: aload 7
    //   1113: astore 8
    //   1115: aload 16
    //   1117: astore 11
    //   1119: aload 7
    //   1121: astore 9
    //   1123: aload 12
    //   1125: aload 22
    //   1127: putfield 464	com/tencent/mm/storage/emotion/EmojiInfo:field_name	Ljava/lang/String;
    //   1130: aload 15
    //   1132: astore 10
    //   1134: aload 7
    //   1136: astore 8
    //   1138: aload 16
    //   1140: astore 11
    //   1142: aload 7
    //   1144: astore 9
    //   1146: aload 12
    //   1148: aload 23
    //   1150: putfield 139	com/tencent/mm/storage/emotion/EmojiInfo:field_md5	Ljava/lang/String;
    //   1153: aload 15
    //   1155: astore 10
    //   1157: aload 7
    //   1159: astore 8
    //   1161: aload 16
    //   1163: astore 11
    //   1165: aload 7
    //   1167: astore 9
    //   1169: aload 12
    //   1171: aload 24
    //   1173: invokevirtual 105	java/io/File:length	()J
    //   1176: l2i
    //   1177: putfield 467	com/tencent/mm/storage/emotion/EmojiInfo:field_size	I
    //   1180: aload 15
    //   1182: astore 10
    //   1184: aload 7
    //   1186: astore 8
    //   1188: aload 16
    //   1190: astore 11
    //   1192: aload 7
    //   1194: astore 9
    //   1196: aload 12
    //   1198: iload 4
    //   1200: putfield 128	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
    //   1203: aload 15
    //   1205: astore 10
    //   1207: aload 7
    //   1209: astore 8
    //   1211: aload 16
    //   1213: astore 11
    //   1215: aload 7
    //   1217: astore 9
    //   1219: aload 12
    //   1221: aload_0
    //   1222: putfield 148	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   1225: aload 15
    //   1227: astore 10
    //   1229: aload 7
    //   1231: astore 8
    //   1233: aload 16
    //   1235: astore 11
    //   1237: aload 7
    //   1239: astore 9
    //   1241: aload 12
    //   1243: iload_3
    //   1244: putfield 470	com/tencent/mm/storage/emotion/EmojiInfo:field_idx	I
    //   1247: aload 15
    //   1249: astore 10
    //   1251: aload 7
    //   1253: astore 8
    //   1255: aload 16
    //   1257: astore 11
    //   1259: aload 7
    //   1261: astore 9
    //   1263: aload 18
    //   1265: aload 12
    //   1267: invokevirtual 474	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1270: pop
    //   1271: aload 15
    //   1273: astore 10
    //   1275: aload 7
    //   1277: astore 8
    //   1279: aload 16
    //   1281: astore 11
    //   1283: aload 7
    //   1285: astore 9
    //   1287: aload 24
    //   1289: aload 25
    //   1291: invokevirtual 478	java/io/File:renameTo	(Ljava/io/File;)Z
    //   1294: pop
    //   1295: aload 15
    //   1297: astore 10
    //   1299: aload 7
    //   1301: astore 8
    //   1303: aload 16
    //   1305: astore 11
    //   1307: aload 7
    //   1309: astore 9
    //   1311: aload 20
    //   1313: aload 22
    //   1315: iconst_0
    //   1316: aload 22
    //   1318: invokevirtual 480	java/lang/String:length	()I
    //   1321: iconst_4
    //   1322: isub
    //   1323: invokevirtual 483	java/lang/String:substring	(II)Ljava/lang/String;
    //   1326: aload 23
    //   1328: invokevirtual 487	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1331: pop
    //   1332: aload 13
    //   1334: astore 12
    //   1336: aload 7
    //   1338: astore 8
    //   1340: aload 7
    //   1342: ifnull +27 -> 1369
    //   1345: aload 7
    //   1347: astore 8
    //   1349: aload 12
    //   1351: astore 10
    //   1353: aload 7
    //   1355: astore 9
    //   1357: aload 12
    //   1359: astore 11
    //   1361: aload 7
    //   1363: invokevirtual 439	java/io/InputStream:close	()V
    //   1366: aconst_null
    //   1367: astore 8
    //   1369: iload_3
    //   1370: iconst_1
    //   1371: iadd
    //   1372: istore_3
    //   1373: aload 8
    //   1375: astore 7
    //   1377: goto -1237 -> 140
    //   1380: aload 15
    //   1382: astore 10
    //   1384: aload 7
    //   1386: astore 8
    //   1388: aload 16
    //   1390: astore 11
    //   1392: aload 7
    //   1394: astore 9
    //   1396: getstatic 170	com/tencent/mm/storage/emotion/EmojiInfo:tcI	I
    //   1399: istore 4
    //   1401: goto -379 -> 1022
    //   1404: aload 12
    //   1406: astore 10
    //   1408: aload 7
    //   1410: astore 8
    //   1412: aload 7
    //   1414: astore 13
    //   1416: aload 12
    //   1418: astore 11
    //   1420: aload 7
    //   1422: astore 9
    //   1424: aload 22
    //   1426: ldc_w 489
    //   1429: invokevirtual 401	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1432: ifeq +1785 -> 3217
    //   1435: aload 12
    //   1437: astore 10
    //   1439: aload 7
    //   1441: astore 8
    //   1443: aload 12
    //   1445: astore 11
    //   1447: aload 7
    //   1449: astore 9
    //   1451: new 43	java/lang/StringBuilder
    //   1454: dup
    //   1455: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   1458: aload_0
    //   1459: invokevirtual 493	java/lang/String:getBytes	()[B
    //   1462: invokestatic 497	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   1465: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1468: ldc_w 499
    //   1471: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1474: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1477: astore 13
    //   1479: aload 12
    //   1481: astore 10
    //   1483: aload 7
    //   1485: astore 8
    //   1487: aload 12
    //   1489: astore 11
    //   1491: aload 7
    //   1493: astore 9
    //   1495: new 415	java/io/FileOutputStream
    //   1498: dup
    //   1499: new 43	java/lang/StringBuilder
    //   1502: dup
    //   1503: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   1506: aload 19
    //   1508: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1511: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   1514: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1517: aload 13
    //   1519: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1522: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1525: invokespecial 416	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   1528: astore 13
    //   1530: aload 13
    //   1532: astore 9
    //   1534: aload 7
    //   1536: astore 11
    //   1538: aload 14
    //   1540: astore 12
    //   1542: aload 13
    //   1544: astore 8
    //   1546: aload 7
    //   1548: astore 10
    //   1550: ldc_w 417
    //   1553: newarray <illegal type>
    //   1555: astore 15
    //   1557: aload 13
    //   1559: astore 9
    //   1561: aload 7
    //   1563: astore 11
    //   1565: aload 14
    //   1567: astore 12
    //   1569: aload 13
    //   1571: astore 8
    //   1573: aload 7
    //   1575: astore 10
    //   1577: aload 7
    //   1579: aload 15
    //   1581: invokevirtual 422	java/io/InputStream:read	([B)I
    //   1584: istore 4
    //   1586: iload 4
    //   1588: ifle +70 -> 1658
    //   1591: aload 13
    //   1593: astore 9
    //   1595: aload 7
    //   1597: astore 11
    //   1599: aload 14
    //   1601: astore 12
    //   1603: aload 13
    //   1605: astore 8
    //   1607: aload 7
    //   1609: astore 10
    //   1611: aload 13
    //   1613: aload 15
    //   1615: iconst_0
    //   1616: iload 4
    //   1618: invokevirtual 428	java/io/OutputStream:write	([BII)V
    //   1621: goto -64 -> 1557
    //   1624: astore_0
    //   1625: aload 8
    //   1627: astore_1
    //   1628: aload_1
    //   1629: ifnull +7 -> 1636
    //   1632: aload_1
    //   1633: invokevirtual 438	java/io/OutputStream:close	()V
    //   1636: aload 10
    //   1638: ifnull +8 -> 1646
    //   1641: aload 10
    //   1643: invokevirtual 439	java/io/InputStream:close	()V
    //   1646: aload 12
    //   1648: ifnull +8 -> 1656
    //   1651: aload 12
    //   1653: invokevirtual 440	java/util/zip/ZipFile:close	()V
    //   1656: aload_0
    //   1657: athrow
    //   1658: aload 13
    //   1660: astore 9
    //   1662: aload 7
    //   1664: astore 11
    //   1666: aload 14
    //   1668: astore 12
    //   1670: aload 13
    //   1672: astore 8
    //   1674: aload 7
    //   1676: astore 10
    //   1678: aload 13
    //   1680: invokevirtual 438	java/io/OutputStream:close	()V
    //   1683: aconst_null
    //   1684: astore 12
    //   1686: goto -350 -> 1336
    //   1689: aload 12
    //   1691: astore 10
    //   1693: aload 7
    //   1695: astore 8
    //   1697: aload 12
    //   1699: astore 11
    //   1701: aload 7
    //   1703: astore 9
    //   1705: aload 14
    //   1707: invokevirtual 350	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   1710: astore 21
    //   1712: aload 12
    //   1714: astore 13
    //   1716: aload 13
    //   1718: astore 10
    //   1720: aload 7
    //   1722: astore 8
    //   1724: aload 13
    //   1726: astore 11
    //   1728: aload 7
    //   1730: astore 9
    //   1732: aload 21
    //   1734: invokeinterface 355 1 0
    //   1739: ifeq +842 -> 2581
    //   1742: aload 13
    //   1744: astore 10
    //   1746: aload 7
    //   1748: astore 8
    //   1750: aload 13
    //   1752: astore 11
    //   1754: aload 7
    //   1756: astore 9
    //   1758: aload 21
    //   1760: invokeinterface 359 1 0
    //   1765: checkcast 361	java/util/zip/ZipEntry
    //   1768: astore 16
    //   1770: aload 13
    //   1772: astore 12
    //   1774: aload 7
    //   1776: astore 15
    //   1778: aload 13
    //   1780: astore 10
    //   1782: aload 7
    //   1784: astore 8
    //   1786: aload 13
    //   1788: astore 11
    //   1790: aload 7
    //   1792: astore 9
    //   1794: aload 16
    //   1796: invokevirtual 364	java/util/zip/ZipEntry:isDirectory	()Z
    //   1799: ifne +734 -> 2533
    //   1802: aload 13
    //   1804: astore 10
    //   1806: aload 7
    //   1808: astore 8
    //   1810: aload 13
    //   1812: astore 11
    //   1814: aload 7
    //   1816: astore 9
    //   1818: aload 14
    //   1820: aload 16
    //   1822: invokevirtual 368	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   1825: astore 7
    //   1827: aload 13
    //   1829: astore 10
    //   1831: aload 7
    //   1833: astore 8
    //   1835: aload 13
    //   1837: astore 11
    //   1839: aload 7
    //   1841: astore 9
    //   1843: aload 16
    //   1845: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   1848: aload 16
    //   1850: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   1853: ldc_w 373
    //   1856: invokevirtual 379	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   1859: iconst_1
    //   1860: iadd
    //   1861: invokevirtual 383	java/lang/String:substring	(I)Ljava/lang/String;
    //   1864: invokevirtual 386	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1867: astore 17
    //   1869: aload 13
    //   1871: astore 10
    //   1873: aload 7
    //   1875: astore 8
    //   1877: aload 13
    //   1879: astore 11
    //   1881: aload 7
    //   1883: astore 9
    //   1885: new 10	java/io/File
    //   1888: dup
    //   1889: new 43	java/lang/StringBuilder
    //   1892: dup
    //   1893: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   1896: aload 19
    //   1898: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1901: ldc_w 373
    //   1904: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1907: aload 16
    //   1909: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   1912: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1915: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1918: invokespecial 97	java/io/File:<init>	(Ljava/lang/String;)V
    //   1921: astore 12
    //   1923: aload 13
    //   1925: astore 10
    //   1927: aload 7
    //   1929: astore 8
    //   1931: aload 13
    //   1933: astore 11
    //   1935: aload 7
    //   1937: astore 9
    //   1939: aload 12
    //   1941: invokevirtual 389	java/io/File:isFile	()Z
    //   1944: ifeq +25 -> 1969
    //   1947: aload 13
    //   1949: astore 10
    //   1951: aload 7
    //   1953: astore 8
    //   1955: aload 13
    //   1957: astore 11
    //   1959: aload 7
    //   1961: astore 9
    //   1963: aload 12
    //   1965: invokevirtual 108	java/io/File:delete	()Z
    //   1968: pop
    //   1969: aload 13
    //   1971: astore 10
    //   1973: aload 7
    //   1975: astore 8
    //   1977: aload 13
    //   1979: astore 11
    //   1981: aload 7
    //   1983: astore 9
    //   1985: aload 12
    //   1987: invokevirtual 393	java/io/File:getParentFile	()Ljava/io/File;
    //   1990: invokevirtual 396	java/io/File:mkdirs	()Z
    //   1993: pop
    //   1994: aload 13
    //   1996: astore 12
    //   1998: aload 7
    //   2000: astore 15
    //   2002: aload 13
    //   2004: astore 10
    //   2006: aload 7
    //   2008: astore 8
    //   2010: aload 13
    //   2012: astore 11
    //   2014: aload 7
    //   2016: astore 9
    //   2018: aload 16
    //   2020: invokevirtual 371	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   2023: invokevirtual 386	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   2026: ldc_w 501
    //   2029: invokevirtual 413	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   2032: ifeq +501 -> 2533
    //   2035: aload 13
    //   2037: astore 10
    //   2039: aload 7
    //   2041: astore 8
    //   2043: aload 13
    //   2045: astore 11
    //   2047: aload 7
    //   2049: astore 9
    //   2051: aload 17
    //   2053: ldc_w 398
    //   2056: invokevirtual 379	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   2059: iconst_1
    //   2060: iadd
    //   2061: istore_3
    //   2062: aload 13
    //   2064: astore 10
    //   2066: aload 7
    //   2068: astore 8
    //   2070: aload 13
    //   2072: astore 11
    //   2074: aload 7
    //   2076: astore 9
    //   2078: aload 17
    //   2080: iload_3
    //   2081: invokevirtual 383	java/lang/String:substring	(I)Ljava/lang/String;
    //   2084: astore 12
    //   2086: aload 13
    //   2088: astore 10
    //   2090: aload 7
    //   2092: astore 8
    //   2094: aload 13
    //   2096: astore 11
    //   2098: aload 7
    //   2100: astore 9
    //   2102: new 43	java/lang/StringBuilder
    //   2105: dup
    //   2106: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   2109: aload 17
    //   2111: iconst_0
    //   2112: iload_3
    //   2113: iconst_1
    //   2114: isub
    //   2115: invokevirtual 483	java/lang/String:substring	(II)Ljava/lang/String;
    //   2118: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2121: ldc_w 503
    //   2124: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2127: aload 12
    //   2129: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2132: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2135: astore 22
    //   2137: aload 13
    //   2139: astore 10
    //   2141: aload 7
    //   2143: astore 8
    //   2145: aload 13
    //   2147: astore 11
    //   2149: aload 7
    //   2151: astore 9
    //   2153: new 415	java/io/FileOutputStream
    //   2156: dup
    //   2157: new 43	java/lang/StringBuilder
    //   2160: dup
    //   2161: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   2164: aload 19
    //   2166: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2169: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   2172: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2175: aload 22
    //   2177: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2180: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2183: invokespecial 416	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   2186: astore 13
    //   2188: aload 13
    //   2190: astore 9
    //   2192: aload 7
    //   2194: astore 11
    //   2196: aload 14
    //   2198: astore 12
    //   2200: aload 13
    //   2202: astore 8
    //   2204: aload 7
    //   2206: astore 10
    //   2208: ldc_w 417
    //   2211: newarray <illegal type>
    //   2213: astore 15
    //   2215: aload 13
    //   2217: astore 9
    //   2219: aload 7
    //   2221: astore 11
    //   2223: aload 14
    //   2225: astore 12
    //   2227: aload 13
    //   2229: astore 8
    //   2231: aload 7
    //   2233: astore 10
    //   2235: aload 7
    //   2237: aload 15
    //   2239: invokevirtual 422	java/io/InputStream:read	([B)I
    //   2242: istore_3
    //   2243: iload_3
    //   2244: ifle +35 -> 2279
    //   2247: aload 13
    //   2249: astore 9
    //   2251: aload 7
    //   2253: astore 11
    //   2255: aload 14
    //   2257: astore 12
    //   2259: aload 13
    //   2261: astore 8
    //   2263: aload 7
    //   2265: astore 10
    //   2267: aload 13
    //   2269: aload 15
    //   2271: iconst_0
    //   2272: iload_3
    //   2273: invokevirtual 428	java/io/OutputStream:write	([BII)V
    //   2276: goto -61 -> 2215
    //   2279: aload 13
    //   2281: astore 9
    //   2283: aload 7
    //   2285: astore 11
    //   2287: aload 14
    //   2289: astore 12
    //   2291: aload 13
    //   2293: astore 8
    //   2295: aload 7
    //   2297: astore 10
    //   2299: aload 13
    //   2301: invokevirtual 438	java/io/OutputStream:close	()V
    //   2304: aconst_null
    //   2305: astore 16
    //   2307: aconst_null
    //   2308: astore 17
    //   2310: aconst_null
    //   2311: astore 13
    //   2313: aload 16
    //   2315: astore 10
    //   2317: aload 7
    //   2319: astore 8
    //   2321: aload 17
    //   2323: astore 11
    //   2325: aload 7
    //   2327: astore 9
    //   2329: aload 22
    //   2331: iconst_0
    //   2332: aload 22
    //   2334: ldc_w 503
    //   2337: invokevirtual 379	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   2340: invokevirtual 483	java/lang/String:substring	(II)Ljava/lang/String;
    //   2343: astore 23
    //   2345: aload 13
    //   2347: astore 12
    //   2349: aload 7
    //   2351: astore 15
    //   2353: aload 16
    //   2355: astore 10
    //   2357: aload 7
    //   2359: astore 8
    //   2361: aload 17
    //   2363: astore 11
    //   2365: aload 7
    //   2367: astore 9
    //   2369: aload 20
    //   2371: aload 23
    //   2373: invokevirtual 506	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   2376: ifeq +157 -> 2533
    //   2379: aload 16
    //   2381: astore 10
    //   2383: aload 7
    //   2385: astore 8
    //   2387: aload 17
    //   2389: astore 11
    //   2391: aload 7
    //   2393: astore 9
    //   2395: aload 20
    //   2397: aload 23
    //   2399: invokevirtual 510	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   2402: checkcast 375	java/lang/String
    //   2405: astore 12
    //   2407: aload 16
    //   2409: astore 10
    //   2411: aload 7
    //   2413: astore 8
    //   2415: aload 17
    //   2417: astore 11
    //   2419: aload 7
    //   2421: astore 9
    //   2423: new 10	java/io/File
    //   2426: dup
    //   2427: new 43	java/lang/StringBuilder
    //   2430: dup
    //   2431: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   2434: aload 19
    //   2436: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2439: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   2442: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2445: aload 22
    //   2447: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2450: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2453: invokespecial 97	java/io/File:<init>	(Ljava/lang/String;)V
    //   2456: new 10	java/io/File
    //   2459: dup
    //   2460: new 43	java/lang/StringBuilder
    //   2463: dup
    //   2464: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   2467: aload 19
    //   2469: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2472: getstatic 13	java/io/File:separator	Ljava/lang/String;
    //   2475: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2478: aload 12
    //   2480: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2483: ldc_w 512
    //   2486: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2489: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2492: invokespecial 97	java/io/File:<init>	(Ljava/lang/String;)V
    //   2495: invokevirtual 478	java/io/File:renameTo	(Ljava/io/File;)Z
    //   2498: pop
    //   2499: aload 16
    //   2501: astore 10
    //   2503: aload 7
    //   2505: astore 8
    //   2507: aload 17
    //   2509: astore 11
    //   2511: aload 7
    //   2513: astore 9
    //   2515: aload 20
    //   2517: aload 22
    //   2519: aload 12
    //   2521: invokevirtual 487	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2524: pop
    //   2525: aload 7
    //   2527: astore 15
    //   2529: aload 13
    //   2531: astore 12
    //   2533: aload 15
    //   2535: astore 7
    //   2537: aload 7
    //   2539: astore 8
    //   2541: aload 7
    //   2543: ifnull +27 -> 2570
    //   2546: aload 7
    //   2548: astore 8
    //   2550: aload 12
    //   2552: astore 10
    //   2554: aload 7
    //   2556: astore 9
    //   2558: aload 12
    //   2560: astore 11
    //   2562: aload 7
    //   2564: invokevirtual 439	java/io/InputStream:close	()V
    //   2567: aconst_null
    //   2568: astore 8
    //   2570: aload 8
    //   2572: astore 7
    //   2574: aload 12
    //   2576: astore 13
    //   2578: goto -862 -> 1716
    //   2581: aload 13
    //   2583: astore 10
    //   2585: aload 7
    //   2587: astore 8
    //   2589: aload 13
    //   2591: astore 11
    //   2593: aload 7
    //   2595: astore 9
    //   2597: aload 20
    //   2599: invokevirtual 515	java/util/HashMap:clear	()V
    //   2602: aload_2
    //   2603: astore 12
    //   2605: aload_2
    //   2606: ifnonnull +32 -> 2638
    //   2609: aload 13
    //   2611: astore 10
    //   2613: aload 7
    //   2615: astore 8
    //   2617: aload 13
    //   2619: astore 11
    //   2621: aload 7
    //   2623: astore 9
    //   2625: invokestatic 307	com/tencent/mm/plugin/emoji/model/i:aEA	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   2628: getfield 519	com/tencent/mm/plugin/emoji/e/l:igy	Lcom/tencent/mm/storage/emotion/a;
    //   2631: aload_0
    //   2632: iconst_0
    //   2633: invokevirtual 525	com/tencent/mm/storage/emotion/a:br	(Ljava/lang/String;Z)Lcom/tencent/mm/storage/emotion/EmojiGroupInfo;
    //   2636: astore 12
    //   2638: aload 13
    //   2640: astore 10
    //   2642: aload 7
    //   2644: astore 8
    //   2646: aload 13
    //   2648: astore 11
    //   2650: aload 7
    //   2652: astore 9
    //   2654: aload 12
    //   2656: aload_0
    //   2657: putfield 530	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_productID	Ljava/lang/String;
    //   2660: aload 13
    //   2662: astore 10
    //   2664: aload 7
    //   2666: astore 8
    //   2668: aload 13
    //   2670: astore 11
    //   2672: aload 7
    //   2674: astore 9
    //   2676: aload_1
    //   2677: invokestatic 27	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   2680: ifne +25 -> 2705
    //   2683: aload 13
    //   2685: astore 10
    //   2687: aload 7
    //   2689: astore 8
    //   2691: aload 13
    //   2693: astore 11
    //   2695: aload 7
    //   2697: astore 9
    //   2699: aload 12
    //   2701: aload_1
    //   2702: putfield 533	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_packName	Ljava/lang/String;
    //   2705: aload 13
    //   2707: astore 10
    //   2709: aload 7
    //   2711: astore 8
    //   2713: aload 13
    //   2715: astore 11
    //   2717: aload 7
    //   2719: astore 9
    //   2721: aload 12
    //   2723: invokestatic 538	java/lang/System:currentTimeMillis	()J
    //   2726: putfield 542	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_lastUseTime	J
    //   2729: aload 13
    //   2731: astore 10
    //   2733: aload 7
    //   2735: astore 8
    //   2737: aload 13
    //   2739: astore 11
    //   2741: aload 7
    //   2743: astore 9
    //   2745: aload 12
    //   2747: bipush 7
    //   2749: putfield 545	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_status	I
    //   2752: aload 13
    //   2754: astore 10
    //   2756: aload 7
    //   2758: astore 8
    //   2760: aload 13
    //   2762: astore 11
    //   2764: aload 7
    //   2766: astore 9
    //   2768: aload 12
    //   2770: iconst_1
    //   2771: putfield 548	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_packStatus	I
    //   2774: aload 13
    //   2776: astore 10
    //   2778: aload 7
    //   2780: astore 8
    //   2782: aload 13
    //   2784: astore 11
    //   2786: aload 7
    //   2788: astore 9
    //   2790: aload 12
    //   2792: getstatic 551	com/tencent/mm/storage/emotion/EmojiGroupInfo:tcv	I
    //   2795: putfield 552	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_type	I
    //   2798: aload 13
    //   2800: astore 10
    //   2802: aload 7
    //   2804: astore 8
    //   2806: aload 13
    //   2808: astore 11
    //   2810: aload 7
    //   2812: astore 9
    //   2814: aload 12
    //   2816: iconst_0
    //   2817: putfield 555	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_recommand	I
    //   2820: aload 13
    //   2822: astore 10
    //   2824: aload 7
    //   2826: astore 8
    //   2828: aload 13
    //   2830: astore 11
    //   2832: aload 7
    //   2834: astore 9
    //   2836: aload 12
    //   2838: iconst_2
    //   2839: putfield 558	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_sync	I
    //   2842: aload 13
    //   2844: astore 10
    //   2846: aload 7
    //   2848: astore 8
    //   2850: aload 13
    //   2852: astore 11
    //   2854: aload 7
    //   2856: astore 9
    //   2858: aload 12
    //   2860: aload 18
    //   2862: invokevirtual 561	java/util/ArrayList:size	()I
    //   2865: putfield 564	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_count	I
    //   2868: aload 13
    //   2870: astore 10
    //   2872: aload 7
    //   2874: astore 8
    //   2876: aload 13
    //   2878: astore 11
    //   2880: aload 7
    //   2882: astore 9
    //   2884: invokestatic 307	com/tencent/mm/plugin/emoji/model/i:aEA	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   2887: getfield 313	com/tencent/mm/plugin/emoji/e/l:igx	Lcom/tencent/mm/storage/emotion/d;
    //   2890: aload 18
    //   2892: aload_0
    //   2893: invokevirtual 568	com/tencent/mm/storage/emotion/d:j	(Ljava/util/List;Ljava/lang/String;)Z
    //   2896: istore 5
    //   2898: iload 5
    //   2900: ifeq +215 -> 3115
    //   2903: aload 13
    //   2905: astore 10
    //   2907: aload 7
    //   2909: astore 8
    //   2911: aload 13
    //   2913: astore 11
    //   2915: aload 7
    //   2917: astore 9
    //   2919: invokestatic 307	com/tencent/mm/plugin/emoji/model/i:aEA	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   2922: getfield 519	com/tencent/mm/plugin/emoji/e/l:igy	Lcom/tencent/mm/storage/emotion/a;
    //   2925: aload 12
    //   2927: invokevirtual 571	com/tencent/mm/storage/emotion/a:c	(Lcom/tencent/mm/storage/emotion/EmojiGroupInfo;)Z
    //   2930: istore 6
    //   2932: aload 13
    //   2934: astore 10
    //   2936: aload 7
    //   2938: astore 8
    //   2940: aload 13
    //   2942: astore 11
    //   2944: aload 7
    //   2946: astore 9
    //   2948: aload 18
    //   2950: invokevirtual 575	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   2953: astore_0
    //   2954: aload 13
    //   2956: astore 10
    //   2958: aload 7
    //   2960: astore 8
    //   2962: aload 13
    //   2964: astore 11
    //   2966: aload 7
    //   2968: astore 9
    //   2970: aload_0
    //   2971: invokeinterface 580 1 0
    //   2976: ifeq +78 -> 3054
    //   2979: aload 13
    //   2981: astore 10
    //   2983: aload 7
    //   2985: astore 8
    //   2987: aload 13
    //   2989: astore 11
    //   2991: aload 7
    //   2993: astore 9
    //   2995: aload_0
    //   2996: invokeinterface 583 1 0
    //   3001: checkcast 75	com/tencent/mm/storage/emotion/EmojiInfo
    //   3004: astore_1
    //   3005: aload 13
    //   3007: astore 10
    //   3009: aload 7
    //   3011: astore 8
    //   3013: aload 13
    //   3015: astore 11
    //   3017: aload 7
    //   3019: astore 9
    //   3021: aload_1
    //   3022: iconst_0
    //   3023: putfield 586	com/tencent/mm/storage/emotion/EmojiInfo:field_reserved4	I
    //   3026: aload 13
    //   3028: astore 10
    //   3030: aload 7
    //   3032: astore 8
    //   3034: aload 13
    //   3036: astore 11
    //   3038: aload 7
    //   3040: astore 9
    //   3042: invokestatic 592	com/tencent/mm/plugin/emoji/e/e:aDM	()Lcom/tencent/mm/plugin/emoji/e/e;
    //   3045: aload_1
    //   3046: iconst_1
    //   3047: invokevirtual 595	com/tencent/mm/plugin/emoji/e/e:c	(Lcom/tencent/mm/storage/emotion/EmojiInfo;Z)Z
    //   3050: pop
    //   3051: goto -97 -> 2954
    //   3054: aload 13
    //   3056: astore 10
    //   3058: aload 7
    //   3060: astore 8
    //   3062: aload 13
    //   3064: astore 11
    //   3066: aload 7
    //   3068: astore 9
    //   3070: ldc 29
    //   3072: ldc_w 597
    //   3075: iconst_2
    //   3076: anewarray 4	java/lang/Object
    //   3079: dup
    //   3080: iconst_0
    //   3081: iload 6
    //   3083: invokestatic 235	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3086: aastore
    //   3087: dup
    //   3088: iconst_1
    //   3089: iload 5
    //   3091: invokestatic 235	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3094: aastore
    //   3095: invokestatic 194	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3098: aload 7
    //   3100: ifnull +8 -> 3108
    //   3103: aload 7
    //   3105: invokevirtual 439	java/io/InputStream:close	()V
    //   3108: aload 14
    //   3110: invokevirtual 440	java/util/zip/ZipFile:close	()V
    //   3113: iconst_1
    //   3114: ireturn
    //   3115: aload 13
    //   3117: astore 10
    //   3119: aload 7
    //   3121: astore 8
    //   3123: aload 13
    //   3125: astore 11
    //   3127: aload 7
    //   3129: astore 9
    //   3131: ldc 29
    //   3133: ldc_w 599
    //   3136: iconst_1
    //   3137: anewarray 4	java/lang/Object
    //   3140: dup
    //   3141: iconst_0
    //   3142: iload 5
    //   3144: invokestatic 235	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3147: aastore
    //   3148: invokestatic 194	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3151: goto -53 -> 3098
    //   3154: astore_0
    //   3155: aload 10
    //   3157: astore_1
    //   3158: aload 14
    //   3160: astore 12
    //   3162: aload 8
    //   3164: astore 10
    //   3166: goto -1538 -> 1628
    //   3169: astore_0
    //   3170: aconst_null
    //   3171: astore 12
    //   3173: aload 11
    //   3175: astore_1
    //   3176: goto -1548 -> 1628
    //   3179: astore_0
    //   3180: aload 10
    //   3182: astore_1
    //   3183: aload 14
    //   3185: astore 12
    //   3187: aload 8
    //   3189: astore 10
    //   3191: goto -1563 -> 1628
    //   3194: astore_2
    //   3195: aconst_null
    //   3196: astore 14
    //   3198: aload 9
    //   3200: astore_0
    //   3201: aload 8
    //   3203: astore_1
    //   3204: goto -2516 -> 688
    //   3207: astore_2
    //   3208: aload 11
    //   3210: astore_0
    //   3211: aload 9
    //   3213: astore_1
    //   3214: goto -2526 -> 688
    //   3217: aload 13
    //   3219: astore 7
    //   3221: goto -1885 -> 1336
    //   3224: astore_2
    //   3225: aload 11
    //   3227: astore_0
    //   3228: aload 9
    //   3230: astore_1
    //   3231: goto -2543 -> 688
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3234	0	paramString1	String
    //   0	3234	1	paramString2	String
    //   0	3234	2	paramEmojiGroupInfo	com.tencent.mm.storage.emotion.EmojiGroupInfo
    //   136	2137	3	i	int
    //   641	976	4	j	int
    //   2896	247	5	bool1	boolean
    //   2930	152	6	bool2	boolean
    //   29	3191	7	localObject1	Object
    //   56	3146	8	localObject2	Object
    //   68	3161	9	localObject3	Object
    //   62	3128	10	localObject4	Object
    //   74	3152	11	localObject5	Object
    //   53	3133	12	localObject6	Object
    //   59	3159	13	localObject7	Object
    //   20	3177	14	localObject8	Object
    //   71	2463	15	localObject9	Object
    //   77	2423	16	localZipEntry	java.util.zip.ZipEntry
    //   1049	1459	17	localObject10	Object
    //   95	2854	18	localArrayList	java.util.ArrayList
    //   50	2418	19	str1	String
    //   86	2512	20	localHashMap	java.util.HashMap
    //   133	1626	21	localEnumeration	java.util.Enumeration
    //   287	2231	22	str2	String
    //   830	1568	23	str3	String
    //   921	367	24	localFile1	File
    //   972	318	25	localFile2	File
    // Exception table:
    //   from	to	target	type
    //   128	135	681	java/lang/Exception
    //   607	614	681	java/lang/Exception
    //   634	643	681	java/lang/Exception
    //   668	678	681	java/lang/Exception
    //   771	776	681	java/lang/Exception
    //   1550	1557	681	java/lang/Exception
    //   1577	1586	681	java/lang/Exception
    //   1611	1621	681	java/lang/Exception
    //   1678	1683	681	java/lang/Exception
    //   2208	2215	681	java/lang/Exception
    //   2235	2243	681	java/lang/Exception
    //   2267	2276	681	java/lang/Exception
    //   2299	2304	681	java/lang/Exception
    //   128	135	1624	finally
    //   607	614	1624	finally
    //   634	643	1624	finally
    //   668	678	1624	finally
    //   698	723	1624	finally
    //   771	776	1624	finally
    //   1550	1557	1624	finally
    //   1577	1586	1624	finally
    //   1611	1621	1624	finally
    //   1678	1683	1624	finally
    //   2208	2215	1624	finally
    //   2235	2243	1624	finally
    //   2267	2276	1624	finally
    //   2299	2304	1624	finally
    //   156	166	3154	finally
    //   182	194	3154	finally
    //   214	222	3154	finally
    //   238	247	3154	finally
    //   263	289	3154	finally
    //   305	343	3154	finally
    //   359	367	3154	finally
    //   383	389	3154	finally
    //   405	414	3154	finally
    //   434	445	3154	finally
    //   461	472	3154	finally
    //   492	503	3154	finally
    //   519	536	3154	finally
    //   552	587	3154	finally
    //   801	832	3154	finally
    //   848	872	3154	finally
    //   888	923	3154	finally
    //   939	974	3154	finally
    //   990	1001	3154	finally
    //   1017	1022	3154	finally
    //   1038	1051	3154	finally
    //   1076	1085	3154	finally
    //   1101	1107	3154	finally
    //   1123	1130	3154	finally
    //   1146	1153	3154	finally
    //   1169	1180	3154	finally
    //   1196	1203	3154	finally
    //   1219	1225	3154	finally
    //   1241	1247	3154	finally
    //   1263	1271	3154	finally
    //   1287	1295	3154	finally
    //   1311	1332	3154	finally
    //   1396	1401	3154	finally
    //   1424	1435	3154	finally
    //   1451	1479	3154	finally
    //   1495	1530	3154	finally
    //   1705	1712	3154	finally
    //   1732	1742	3154	finally
    //   1758	1770	3154	finally
    //   1794	1802	3154	finally
    //   1818	1827	3154	finally
    //   1843	1869	3154	finally
    //   1885	1923	3154	finally
    //   1939	1947	3154	finally
    //   1963	1969	3154	finally
    //   1985	1994	3154	finally
    //   2018	2035	3154	finally
    //   2051	2062	3154	finally
    //   2078	2086	3154	finally
    //   2102	2137	3154	finally
    //   2153	2188	3154	finally
    //   2329	2345	3154	finally
    //   2369	2379	3154	finally
    //   2395	2407	3154	finally
    //   2423	2499	3154	finally
    //   2515	2525	3154	finally
    //   2597	2602	3154	finally
    //   2625	2638	3154	finally
    //   2654	2660	3154	finally
    //   2676	2683	3154	finally
    //   2699	2705	3154	finally
    //   2721	2729	3154	finally
    //   2745	2752	3154	finally
    //   2768	2774	3154	finally
    //   2790	2798	3154	finally
    //   2814	2820	3154	finally
    //   2836	2842	3154	finally
    //   2858	2868	3154	finally
    //   2884	2898	3154	finally
    //   2919	2932	3154	finally
    //   2948	2954	3154	finally
    //   2970	2979	3154	finally
    //   2995	3005	3154	finally
    //   3021	3026	3154	finally
    //   3042	3051	3154	finally
    //   3070	3098	3154	finally
    //   3131	3151	3154	finally
    //   97	108	3169	finally
    //   1361	1366	3179	finally
    //   2562	2567	3179	finally
    //   97	108	3194	java/lang/Exception
    //   1361	1366	3207	java/lang/Exception
    //   2562	2567	3207	java/lang/Exception
    //   156	166	3224	java/lang/Exception
    //   182	194	3224	java/lang/Exception
    //   214	222	3224	java/lang/Exception
    //   238	247	3224	java/lang/Exception
    //   263	289	3224	java/lang/Exception
    //   305	343	3224	java/lang/Exception
    //   359	367	3224	java/lang/Exception
    //   383	389	3224	java/lang/Exception
    //   405	414	3224	java/lang/Exception
    //   434	445	3224	java/lang/Exception
    //   461	472	3224	java/lang/Exception
    //   492	503	3224	java/lang/Exception
    //   519	536	3224	java/lang/Exception
    //   552	587	3224	java/lang/Exception
    //   801	832	3224	java/lang/Exception
    //   848	872	3224	java/lang/Exception
    //   888	923	3224	java/lang/Exception
    //   939	974	3224	java/lang/Exception
    //   990	1001	3224	java/lang/Exception
    //   1017	1022	3224	java/lang/Exception
    //   1038	1051	3224	java/lang/Exception
    //   1076	1085	3224	java/lang/Exception
    //   1101	1107	3224	java/lang/Exception
    //   1123	1130	3224	java/lang/Exception
    //   1146	1153	3224	java/lang/Exception
    //   1169	1180	3224	java/lang/Exception
    //   1196	1203	3224	java/lang/Exception
    //   1219	1225	3224	java/lang/Exception
    //   1241	1247	3224	java/lang/Exception
    //   1263	1271	3224	java/lang/Exception
    //   1287	1295	3224	java/lang/Exception
    //   1311	1332	3224	java/lang/Exception
    //   1396	1401	3224	java/lang/Exception
    //   1424	1435	3224	java/lang/Exception
    //   1451	1479	3224	java/lang/Exception
    //   1495	1530	3224	java/lang/Exception
    //   1705	1712	3224	java/lang/Exception
    //   1732	1742	3224	java/lang/Exception
    //   1758	1770	3224	java/lang/Exception
    //   1794	1802	3224	java/lang/Exception
    //   1818	1827	3224	java/lang/Exception
    //   1843	1869	3224	java/lang/Exception
    //   1885	1923	3224	java/lang/Exception
    //   1939	1947	3224	java/lang/Exception
    //   1963	1969	3224	java/lang/Exception
    //   1985	1994	3224	java/lang/Exception
    //   2018	2035	3224	java/lang/Exception
    //   2051	2062	3224	java/lang/Exception
    //   2078	2086	3224	java/lang/Exception
    //   2102	2137	3224	java/lang/Exception
    //   2153	2188	3224	java/lang/Exception
    //   2329	2345	3224	java/lang/Exception
    //   2369	2379	3224	java/lang/Exception
    //   2395	2407	3224	java/lang/Exception
    //   2423	2499	3224	java/lang/Exception
    //   2515	2525	3224	java/lang/Exception
    //   2597	2602	3224	java/lang/Exception
    //   2625	2638	3224	java/lang/Exception
    //   2654	2660	3224	java/lang/Exception
    //   2676	2683	3224	java/lang/Exception
    //   2699	2705	3224	java/lang/Exception
    //   2721	2729	3224	java/lang/Exception
    //   2745	2752	3224	java/lang/Exception
    //   2768	2774	3224	java/lang/Exception
    //   2790	2798	3224	java/lang/Exception
    //   2814	2820	3224	java/lang/Exception
    //   2836	2842	3224	java/lang/Exception
    //   2858	2868	3224	java/lang/Exception
    //   2884	2898	3224	java/lang/Exception
    //   2919	2932	3224	java/lang/Exception
    //   2948	2954	3224	java/lang/Exception
    //   2970	2979	3224	java/lang/Exception
    //   2995	3005	3224	java/lang/Exception
    //   3021	3026	3224	java/lang/Exception
    //   3042	3051	3224	java/lang/Exception
    //   3070	3098	3224	java/lang/Exception
    //   3131	3151	3224	java/lang/Exception
  }
  
  public static adb aEq()
  {
    adb localadb = new adb();
    localadb.rHu = 1;
    localadb.rHw = 1;
    return localadb;
  }
  
  public static int ak(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4)) {
      return EmojiInfo.tcx;
    }
    if ((paramArrayOfByte[1] == 80) && (paramArrayOfByte[2] == 78) && (paramArrayOfByte[3] == 71)) {
      return EmojiInfo.tcI;
    }
    if ((paramArrayOfByte[0] == 71) && (paramArrayOfByte[1] == 73) && (paramArrayOfByte[2] == 70)) {
      return EmojiInfo.tcJ;
    }
    if ((paramArrayOfByte[6] == 74) && (paramArrayOfByte[7] == 70) && (paramArrayOfByte[8] == 73) && (paramArrayOfByte[9] == 70)) {
      return EmojiInfo.tcK;
    }
    return EmojiInfo.tcx;
  }
  
  public static String b(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    if (paramWXMediaMessage.getType() != 8) {
      return null;
    }
    Object localObject = (WXEmojiObject)paramWXMediaMessage.mediaObject;
    String str;
    if (!bi.bC(((WXEmojiObject)localObject).emojiData))
    {
      x.d("MicroMsg.emoji.EmojiLogic", " fileData:" + ((WXEmojiObject)localObject).emojiData.length);
      str = g.u(((WXEmojiObject)localObject).emojiData);
      a(paramContext, paramWXMediaMessage.thumbData, str, ((WXEmojiObject)localObject).emojiData, paramString);
      return str;
    }
    if (!bi.oW(((WXEmojiObject)localObject).emojiPath))
    {
      int i = e.cm(((WXEmojiObject)localObject).emojiPath);
      if (i > 0)
      {
        localObject = e.e(((WXEmojiObject)localObject).emojiPath, 0, i);
        str = g.u((byte[])localObject);
        a(paramContext, paramWXMediaMessage.thumbData, str, (byte[])localObject, paramString);
        return str;
      }
      return null;
    }
    return null;
  }
  
  private static String cw(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) && (bi.oW(paramString2)))
    {
      x.e("MicroMsg.emoji.EmojiLogic", "[cpan] product id and url are null.");
      return null;
    }
    if (bi.oW(paramString2)) {
      return g.u(paramString1.getBytes());
    }
    return g.u(paramString2.getBytes());
  }
  
  public static native boolean extractForeground(int[] paramArrayOfInt, int paramInt1, int paramInt2);
  
  public static native boolean gifToMMAni(byte[] paramArrayOfByte, PByteArray paramPByteArray, int paramInt);
  
  public static String h(int paramInt, String paramString1, String paramString2)
  {
    if (paramInt != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<designeruin>" + paramInt + "</designeruin>");
      localStringBuilder.append("<designername>" + paramString1 + "</designername>");
      localStringBuilder.append("<designerrediretcturl>" + paramString2 + "</designerrediretcturl>");
      localStringBuilder.append("</xml>");
      paramString1 = localStringBuilder.toString();
      x.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString1 });
      return paramString1;
    }
    return null;
  }
  
  public static String zA(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      paramString = bi.aG((String)paramString.get(".xml.secondUrl"), "");
    }
    catch (Exception localException1)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "secondUrl:%s", new Object[] { paramString });
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    tmp59_56[0] = localException1.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageSecondUrl exception. %s", tmp59_56);
    return paramString;
  }
  
  public static int zB(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      i = bi.WU((String)paramString.get(".xml.pageType"));
    }
    catch (Exception paramString)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "pageType:%s", new Object[] { Integer.valueOf(i) });
        return i;
      }
      catch (Exception paramString)
      {
        int i;
        for (;;) {}
      }
      paramString = paramString;
      i = 0;
    }
    tmp57_54[0] = paramString.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageType exception. %s", tmp57_54);
    return i;
  }
  
  public static boolean zC(String paramString)
  {
    if (!bi.oW(paramString)) {
      try
      {
        if (b.lz(paramString))
        {
          x.d("MicroMsg.emoji.EmojiLogic", "In Not Auto Download Time Range. timeRange:%s", new Object[] { paramString });
          return true;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.emoji.EmojiLogic", "isInNotAutoDownloadTimeRange :%s", new Object[] { bi.i(paramString) });
      }
    }
    return false;
  }
  
  public static String zj(String paramString)
  {
    byte[] arrayOfByte = null;
    Object localObject = arrayOfByte;
    if (!bi.oW(paramString))
    {
      int i = e.cm(paramString);
      localObject = arrayOfByte;
      if (i > 0)
      {
        arrayOfByte = e.e(paramString, 0, i);
        paramString = g.u(arrayOfByte);
        if (paramString == null)
        {
          localObject = paramString;
          if (arrayOfByte == null) {}
        }
        else
        {
          au.HU();
          localObject = com.tencent.mm.model.c.Gg();
          e.b((String)localObject + paramString, arrayOfByte, arrayOfByte.length);
          if (!com.tencent.mm.sdk.platformtools.o.bv(arrayOfByte)) {
            break label116;
          }
          i.aEA().igx.a(paramString, "", EmojiInfo.tcB, EmojiInfo.tcJ, arrayOfByte.length, "", "");
          localObject = paramString;
        }
      }
    }
    return (String)localObject;
    label116:
    i.aEA().igx.a(paramString, "", EmojiInfo.tcB, EmojiInfo.tcI, arrayOfByte.length, "", "");
    return paramString;
  }
  
  public static String zn(String paramString)
  {
    x.d("MicroMsg.emoji.EmojiLogic", "url:%s", new Object[] { paramString });
    String str2 = "";
    String str1 = str2;
    if (!TextUtils.isEmpty(paramString))
    {
      str1 = str2;
      if (paramString.startsWith("http://weixin.qq.com/emoticonstore/")) {
        str1 = paramString.substring(paramString.lastIndexOf("/") + 1);
      }
    }
    return str1;
  }
  
  public static String zo(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      paramString = (String)paramString.get(".xml.productid");
    }
    catch (Exception localException1)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "productId:%s", new Object[] { paramString });
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    tmp53_50[0] = localException1.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getProductIdBySnsObjData exception. %s", tmp53_50);
    return paramString;
  }
  
  public static int zp(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      i = com.tencent.mm.a.o.cx((String)paramString.get(".xml.designeruin"));
    }
    catch (Exception paramString)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "designeruin:%s", new Object[] { Integer.valueOf(i) });
        return i;
      }
      catch (Exception paramString)
      {
        int i;
        for (;;) {}
      }
      paramString = paramString;
      i = 0;
    }
    tmp57_54[0] = paramString.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getDesignerUINBySnsObjData exception. %s", tmp57_54);
    return i;
  }
  
  public static String zq(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      paramString = (String)paramString.get(".xml.designername");
    }
    catch (Exception localException1)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "designeruin:%s", new Object[] { paramString });
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    tmp53_50[0] = localException1.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getDesignerNameBySnsObjData exception. %s", tmp53_50);
    return paramString;
  }
  
  public static String zu(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<productid>" + paramString + "</productid>");
      localStringBuilder.append("</xml>");
      paramString = localStringBuilder.toString();
      x.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString });
      return paramString;
    }
    return null;
  }
  
  public static String zv(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      paramString = (String)paramString.get(".xml.designerrediretcturl");
    }
    catch (Exception localException1)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "designerrediretcturl:%s", new Object[] { paramString });
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    tmp53_50[0] = localException1.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getDesignerRediretctUrlBySnsObjData exception. %s", tmp53_50);
    return paramString;
  }
  
  public static int zw(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      i = bi.WU((String)paramString.get(".xml.tid"));
    }
    catch (Exception paramString)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "tid:%s", new Object[] { Integer.valueOf(i) });
        return i;
      }
      catch (Exception paramString)
      {
        int i;
        for (;;) {}
      }
      paramString = paramString;
      i = 0;
    }
    tmp57_54[0] = paramString.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTid exception. %s", tmp57_54);
    return i;
  }
  
  public static String zx(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      paramString = (String)paramString.get(".xml.title");
    }
    catch (Exception localException1)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "title:%s", new Object[] { paramString });
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    tmp53_50[0] = localException1.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTitle exception. %s", tmp53_50);
    return paramString;
  }
  
  public static String zy(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      paramString = (String)paramString.get(".xml.desc");
    }
    catch (Exception localException1)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "desc:%s", new Object[] { paramString });
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    tmp53_50[0] = localException1.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageDesc exception. %s", tmp53_50);
    return paramString;
  }
  
  public static String zz(String paramString)
  {
    paramString = bl.z(paramString, "xml");
    try
    {
      paramString = (String)paramString.get(".xml.iconUrl");
    }
    catch (Exception localException1)
    {
      try
      {
        x.d("MicroMsg.emoji.EmojiLogic", "iconUrl:%s", new Object[] { paramString });
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    tmp53_50[0] = localException1.toString();
    x.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageIconUrl exception. %s", tmp53_50);
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/model/EmojiLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
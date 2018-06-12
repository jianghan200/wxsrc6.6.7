package com.tencent.mm.storage.emotion;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.api.i;
import com.tencent.mm.g.c.as;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

public class EmojiInfo
  extends as
  implements Parcelable, i
{
  public static final Parcelable.Creator<EmojiInfo> CREATOR = new EmojiInfo.1();
  public static int TYPE_TEXT;
  protected static c.a dhO;
  public static final String ihe;
  public static int tcB;
  public static String tcC = ".gif";
  public static int tcD = 17;
  public static int tcE = 32;
  public static int tcF = 49;
  public static int tcG = 50;
  public static int tcH;
  public static int tcI;
  public static int tcJ;
  public static int tcK;
  public static int tcL;
  public static int tcM;
  public static int tcN;
  public static int tcO;
  public static int tcP;
  public static int tcQ;
  public static int tcR;
  public static int tcS;
  public static int tcT;
  public static int tcU;
  public static int tcV;
  public static int tcW;
  public static int tcx;
  public final String mcn;
  public String talker;
  
  static
  {
    tcB = 65;
    tcH = 81;
    tcx = -1;
    tcI = 1;
    tcJ = 2;
    tcK = 3;
    TYPE_TEXT = 4;
    tcL = 10;
    tcM = 11;
    tcN = 0;
    tcO = 1;
    tcP = 3;
    tcQ = 4;
    tcR = 8;
    tcS = 0;
    tcT = 1;
    tcU = 0;
    tcV = 1;
    tcW = 1;
    c.a locala = new c.a();
    locala.sKy = new Field[33];
    locala.columns = new String[34];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "md5";
    locala.sKA.put("md5", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.sKz = "md5";
    locala.columns[1] = "svrid";
    locala.sKA.put("svrid", "TEXT");
    localStringBuilder.append(" svrid TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "catalog";
    locala.sKA.put("catalog", "INTEGER");
    localStringBuilder.append(" catalog INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "size";
    locala.sKA.put("size", "INTEGER");
    localStringBuilder.append(" size INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "start";
    locala.sKA.put("start", "INTEGER");
    localStringBuilder.append(" start INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "state";
    locala.sKA.put("state", "INTEGER");
    localStringBuilder.append(" state INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "name";
    locala.sKA.put("name", "TEXT");
    localStringBuilder.append(" name TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "content";
    locala.sKA.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "reserved1";
    locala.sKA.put("reserved1", "TEXT");
    localStringBuilder.append(" reserved1 TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "reserved2";
    locala.sKA.put("reserved2", "TEXT");
    localStringBuilder.append(" reserved2 TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "reserved3";
    locala.sKA.put("reserved3", "INTEGER");
    localStringBuilder.append(" reserved3 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "reserved4";
    locala.sKA.put("reserved4", "INTEGER");
    localStringBuilder.append(" reserved4 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "app_id";
    locala.sKA.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "groupId";
    locala.sKA.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "lastUseTime";
    locala.sKA.put("lastUseTime", "LONG");
    localStringBuilder.append(" lastUseTime LONG");
    localStringBuilder.append(", ");
    locala.columns[16] = "framesInfo";
    locala.sKA.put("framesInfo", "TEXT default '' ");
    localStringBuilder.append(" framesInfo TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[17] = "idx";
    locala.sKA.put("idx", "INTEGER default '0' ");
    localStringBuilder.append(" idx INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "temp";
    locala.sKA.put("temp", "INTEGER default '0' ");
    localStringBuilder.append(" temp INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "source";
    locala.sKA.put("source", "INTEGER default '0' ");
    localStringBuilder.append(" source INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "needupload";
    locala.sKA.put("needupload", "INTEGER default '0' ");
    localStringBuilder.append(" needupload INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[21] = "designerID";
    locala.sKA.put("designerID", "TEXT");
    localStringBuilder.append(" designerID TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "thumbUrl";
    locala.sKA.put("thumbUrl", "TEXT");
    localStringBuilder.append(" thumbUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "cdnUrl";
    locala.sKA.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "encrypturl";
    locala.sKA.put("encrypturl", "TEXT");
    localStringBuilder.append(" encrypturl TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "aeskey";
    locala.sKA.put("aeskey", "TEXT");
    localStringBuilder.append(" aeskey TEXT");
    localStringBuilder.append(", ");
    locala.columns[26] = "width";
    locala.sKA.put("width", "INTEGER default '0' ");
    localStringBuilder.append(" width INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[27] = "height";
    locala.sKA.put("height", "INTEGER default '0' ");
    localStringBuilder.append(" height INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[28] = "externUrl";
    locala.sKA.put("externUrl", "TEXT");
    localStringBuilder.append(" externUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[29] = "externMd5";
    locala.sKA.put("externMd5", "TEXT");
    localStringBuilder.append(" externMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[30] = "activityid";
    locala.sKA.put("activityid", "TEXT");
    localStringBuilder.append(" activityid TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "tpurl";
    locala.sKA.put("tpurl", "TEXT");
    localStringBuilder.append(" tpurl TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "tpauthkey";
    locala.sKA.put("tpauthkey", "TEXT");
    localStringBuilder.append(" tpauthkey TEXT");
    locala.columns[33] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
    ihe = File.separator;
  }
  
  public EmojiInfo()
  {
    StringBuilder localStringBuilder;
    if (((h)com.tencent.mm.kernel.g.Ef().DM()).ES())
    {
      localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.Ek();
    }
    for (this.mcn = (com.tencent.mm.kernel.g.Ei().dqp + "emoji/");; this.mcn = (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().Gq() + "emoji/"))
    {
      reset();
      return;
    }
  }
  
  protected EmojiInfo(Parcel paramParcel)
  {
    this.mcn = paramParcel.readString();
    this.field_md5 = paramParcel.readString();
    this.field_svrid = paramParcel.readString();
    this.field_catalog = paramParcel.readInt();
    this.field_type = paramParcel.readInt();
    this.field_size = paramParcel.readInt();
    this.field_start = paramParcel.readInt();
    this.field_state = paramParcel.readInt();
    this.field_name = paramParcel.readString();
    this.field_content = paramParcel.readString();
    this.field_reserved1 = paramParcel.readString();
    this.field_reserved2 = paramParcel.readString();
    this.field_reserved3 = paramParcel.readInt();
    this.field_reserved4 = paramParcel.readInt();
    this.field_app_id = paramParcel.readString();
    this.field_groupId = paramParcel.readString();
    this.field_lastUseTime = paramParcel.readLong();
    this.field_framesInfo = paramParcel.readString();
    this.field_idx = paramParcel.readInt();
    this.field_temp = paramParcel.readInt();
    this.field_source = paramParcel.readInt();
    this.field_needupload = paramParcel.readInt();
    this.field_designerID = paramParcel.readString();
    this.field_thumbUrl = paramParcel.readString();
    this.field_cdnUrl = paramParcel.readString();
    this.field_encrypturl = paramParcel.readString();
    this.field_aeskey = paramParcel.readString();
    this.field_width = paramParcel.readInt();
    this.field_height = paramParcel.readInt();
    this.field_activityid = paramParcel.readString();
    this.sKx = paramParcel.readLong();
  }
  
  public EmojiInfo(String paramString)
  {
    this.mcn = paramString;
    reset();
  }
  
  public static boolean Dr(int paramInt)
  {
    return (paramInt == tcG) || (paramInt == tcF);
  }
  
  public static InputStream bt(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (bi.oW(paramString))) {
      return null;
    }
    try
    {
      paramString = paramString.split("\\.")[0];
      x.d("MicroMsg.emoji.EmojiInfo", "emoji drawable name is %s", new Object[] { paramString });
      int i = paramContext.getResources().getIdentifier(paramString, "drawable", paramContext.getPackageName());
      paramContext = paramContext.getResources().openRawResource(i);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      x.w("MicroMsg.emoji.EmojiInfo", "get emoji file fail, %s", new Object[] { paramContext.getMessage() });
    }
    return null;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final void Ds(int paramInt)
  {
    this.field_catalog = paramInt;
  }
  
  public final String Xh()
  {
    if (this.field_md5 == null) {
      return "";
    }
    return this.field_md5;
  }
  
  public final Bitmap aR(Context paramContext)
  {
    int j = 0;
    int i;
    for (;;)
    {
      try
      {
        if ((this.field_catalog == EmojiGroupInfo.tcz) || (this.field_catalog == tcG) || (this.field_catalog == tcF))
        {
          localObject = getName();
          if (!bi.oW((String)localObject))
          {
            if (((String)localObject).startsWith("jsb"))
            {
              localObject = "jsb";
              i = paramContext.getResources().getIdentifier((String)localObject, "drawable", ad.getPackageName());
              paramContext = com.tencent.mm.sdk.platformtools.c.s(paramContext.getResources().getDrawable(i));
              x.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(this.field_catalog), Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
              return paramContext;
            }
            if (((String)localObject).startsWith("dice"))
            {
              localObject = "dice";
              continue;
            }
            localObject = ((String)localObject).replaceAll(".png", "");
            continue;
          }
          x.i("MicroMsg.emoji.EmojiInfo", "name is null");
          x.i("MicroMsg.emoji.EmojiInfo", "emoji:%s", new Object[] { this });
          paramContext = null;
          continue;
        }
        if (this.field_catalog != EmojiGroupInfo.tcy) {
          break label376;
        }
        localObject = getName();
        if (bi.oW((String)localObject)) {
          break label364;
        }
        if (bi.oW(getContent()))
        {
          localObject = getName();
          localObject = ((String)localObject).replaceAll(".png", "");
          x.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] drawable name:%s", new Object[] { localObject });
          i = paramContext.getResources().getIdentifier((String)localObject, "drawable", ad.getPackageName());
          paramContext = com.tencent.mm.sdk.platformtools.c.s(paramContext.getResources().getDrawable(i));
          x.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(this.field_catalog), Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
          continue;
        }
        localObject = getContent();
      }
      finally {}
      continue;
      label364:
      x.i("MicroMsg.emoji.EmojiInfo", "name is null");
      continue;
      label376:
      paramContext = cnF() + "_cover";
      boolean bool = com.tencent.mm.a.e.cn(paramContext);
      x.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] thumbPath:%s isExist:%s", new Object[] { paramContext, Boolean.valueOf(bool) });
      if (bool) {
        break;
      }
      paramContext = cnF();
      bool = com.tencent.mm.a.e.cn(paramContext);
      if (bool)
      {
        paramContext = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().a(this);
        if (paramContext == null)
        {
          x.e("MicroMsg.emoji.EmojiInfo", "bytes is null!");
          paramContext = null;
        }
        else
        {
          x.i("MicroMsg.emoji.EmojiInfo", "bytes size:%s", new Object[] { Integer.valueOf(paramContext.length) });
          if (o.bx(paramContext)) {}
          for (localObject = com.tencent.mm.plugin.gif.g.ay(paramContext);; localObject = com.tencent.mm.sdk.platformtools.c.decodeByteArray(paramContext, 480, 480))
          {
            paramContext = (Context)localObject;
            if (localObject == null) {
              break;
            }
            x.i("MicroMsg.emoji.EmojiInfo", "emoji:%s width:%s height:%s", new Object[] { this, Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
            paramContext = (Context)localObject;
            break;
          }
        }
      }
      else
      {
        x.w("MicroMsg.emoji.EmojiInfo", "[addEmoji] Path:%s isExist:%s", new Object[] { paramContext, Boolean.valueOf(bool) });
      }
    }
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramContext, (BitmapFactory.Options)localObject);
    label680:
    int k;
    if ((((BitmapFactory.Options)localObject).outHeight < 480) && (((BitmapFactory.Options)localObject).outWidth < 480))
    {
      paramContext = com.tencent.mm.sdk.platformtools.c.ai(paramContext, ((BitmapFactory.Options)localObject).outHeight, ((BitmapFactory.Options)localObject).outWidth);
      k = this.field_catalog;
      if (paramContext != null) {
        break label748;
      }
      i = 0;
      label692:
      if (paramContext != null) {
        break label756;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j) });
      break;
      paramContext = com.tencent.mm.sdk.platformtools.c.ai(paramContext, 480, 480);
      break label680;
      label748:
      i = paramContext.getWidth();
      break label692;
      label756:
      j = paramContext.getHeight();
    }
  }
  
  public final boolean aaq()
  {
    return (this.field_catalog == tcG) || (this.field_catalog == tcF);
  }
  
  public final boolean cl(Object paramObject)
  {
    return (paramObject != null) && ((paramObject instanceof EmojiInfo)) && (((EmojiInfo)paramObject).Xh().equalsIgnoreCase(this.field_md5));
  }
  
  public final boolean cnA()
  {
    return (bi.oW(this.field_app_id)) && (!bi.oW(this.field_groupId)) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.tcz))) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.tcy))) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.tcA))) && (!this.field_groupId.equals(String.valueOf(tcB)));
  }
  
  public final boolean cnB()
  {
    return Xh().length() == 32;
  }
  
  public final String cnC()
  {
    if (this.field_svrid == null) {
      return "";
    }
    return this.field_svrid;
  }
  
  public final void cnD()
  {
    this.field_temp = 1;
  }
  
  public final boolean cnE()
  {
    if ((this.field_catalog == tcD) || (this.field_catalog == EmojiGroupInfo.tcz) || (this.field_catalog == tcG) || (this.field_catalog == tcF)) {
      return true;
    }
    if (cnA())
    {
      String str = cnF();
      localObject = str;
      if (str == null) {
        localObject = this.mcn + this.field_groupId + File.separator + Xh();
      }
    }
    for (Object localObject = new File((String)localObject); (((File)localObject).exists()) && (((File)localObject).length() > 0L); localObject = new File(this.mcn + Xh())) {
      return true;
    }
    return false;
  }
  
  public final String cnF()
  {
    if ((bi.oW(this.field_groupId)) && (bi.oW(this.field_md5))) {
      x.w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
    }
    while (bi.oW(this.field_md5)) {
      return null;
    }
    if (bi.oW(this.field_groupId)) {
      return this.mcn + this.field_md5;
    }
    return this.mcn + this.field_groupId + ihe + this.field_md5;
  }
  
  public final boolean cnv()
  {
    if ((this.field_catalog == tcD) || (this.field_catalog == tcG) || (this.field_catalog == tcF)) {
      return true;
    }
    if (!bi.oW(this.field_groupId)) {}
    for (File localFile = new File(this.mcn + this.field_groupId + File.separator + Xh()); (localFile.exists()) && (localFile.length() > 0L); localFile = new File(this.mcn + Xh())) {
      return true;
    }
    return false;
  }
  
  public final void cnw()
  {
    if ((this.field_catalog == tcD) || (this.field_catalog == tcG) || (this.field_catalog == tcF)) {}
    for (;;)
    {
      return;
      if (!bi.oW(this.field_groupId)) {}
      for (File localFile = new File(this.mcn + this.field_groupId + File.separator + Xh()); localFile.exists(); localFile = new File(this.mcn + Xh()))
      {
        localFile.delete();
        return;
      }
    }
  }
  
  public final boolean cnx()
  {
    if ((this.field_catalog == tcD) || (this.field_catalog == tcG) || (this.field_catalog == tcF)) {
      return true;
    }
    return new File(this.mcn + this.field_groupId + File.separator + Xh()).exists();
  }
  
  public final boolean cny()
  {
    return (this.field_catalog == tcD) || (this.field_catalog == tcG) || (this.field_catalog == tcF);
  }
  
  public final boolean cnz()
  {
    return this.field_groupId.equalsIgnoreCase("com.tencent.xin.emoticon.tuzki2");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  /* Error */
  public final byte[] eI(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload 6
    //   5: astore 5
    //   7: iload_1
    //   8: iflt +11 -> 19
    //   11: iload_2
    //   12: ifge +10 -> 22
    //   15: aload 6
    //   17: astore 5
    //   19: aload 5
    //   21: areturn
    //   22: aload_0
    //   23: getfield 374	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   26: getstatic 50	com/tencent/mm/storage/emotion/EmojiInfo:tcD	I
    //   29: if_icmpeq +23 -> 52
    //   32: aload_0
    //   33: getfield 374	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   36: getstatic 56	com/tencent/mm/storage/emotion/EmojiInfo:tcG	I
    //   39: if_icmpeq +13 -> 52
    //   42: aload_0
    //   43: getfield 374	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   46: getstatic 54	com/tencent/mm/storage/emotion/EmojiInfo:tcF	I
    //   49: if_icmpne +155 -> 204
    //   52: ldc_w 481
    //   55: ldc_w 723
    //   58: iconst_1
    //   59: anewarray 485	java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: aload_0
    //   65: invokevirtual 537	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   68: aastore
    //   69: invokestatic 491	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: invokestatic 727	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   75: aload_0
    //   76: invokevirtual 537	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   79: invokestatic 729	com/tencent/mm/storage/emotion/EmojiInfo:bt	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   82: astore 6
    //   84: iload_1
    //   85: i2l
    //   86: lstore_3
    //   87: aload 6
    //   89: astore 5
    //   91: aload 6
    //   93: lload_3
    //   94: invokevirtual 735	java/io/InputStream:skip	(J)J
    //   97: pop2
    //   98: aload 6
    //   100: astore 5
    //   102: iload_2
    //   103: newarray <illegal type>
    //   105: astore 7
    //   107: aload 6
    //   109: astore 5
    //   111: aload 6
    //   113: aload 7
    //   115: iconst_0
    //   116: iload_2
    //   117: invokevirtual 739	java/io/InputStream:read	([BII)I
    //   120: pop
    //   121: aload 7
    //   123: astore 5
    //   125: aload 6
    //   127: ifnull -108 -> 19
    //   130: aload 6
    //   132: invokevirtual 742	java/io/InputStream:close	()V
    //   135: aload 7
    //   137: areturn
    //   138: astore 5
    //   140: ldc_w 481
    //   143: ldc_w 744
    //   146: iconst_1
    //   147: anewarray 485	java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: aload 5
    //   154: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   157: aastore
    //   158: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload 7
    //   163: areturn
    //   164: astore 7
    //   166: aconst_null
    //   167: astore 6
    //   169: aload 6
    //   171: astore 5
    //   173: ldc_w 481
    //   176: ldc_w 744
    //   179: iconst_1
    //   180: anewarray 485	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: aload 7
    //   187: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload 6
    //   196: ifnull +8 -> 204
    //   199: aload 6
    //   201: invokevirtual 742	java/io/InputStream:close	()V
    //   204: new 113	java/lang/StringBuilder
    //   207: dup
    //   208: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   211: aload_0
    //   212: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   215: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: aload_0
    //   219: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   222: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: astore 5
    //   230: aload_0
    //   231: invokevirtual 695	com/tencent/mm/storage/emotion/EmojiInfo:cnA	()Z
    //   234: ifeq +42 -> 276
    //   237: new 113	java/lang/StringBuilder
    //   240: dup
    //   241: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   244: aload_0
    //   245: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   248: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: aload_0
    //   252: getfield 410	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   255: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: getstatic 293	java/io/File:separator	Ljava/lang/String;
    //   261: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: aload_0
    //   265: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   268: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: astore 5
    //   276: aload 5
    //   278: aload_0
    //   279: getfield 383	com/tencent/mm/storage/emotion/EmojiInfo:field_start	I
    //   282: iload_2
    //   283: invokestatic 752	com/tencent/mm/a/e:e	(Ljava/lang/String;II)[B
    //   286: areturn
    //   287: astore 5
    //   289: ldc_w 481
    //   292: ldc_w 744
    //   295: iconst_1
    //   296: anewarray 485	java/lang/Object
    //   299: dup
    //   300: iconst_0
    //   301: aload 5
    //   303: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   306: aastore
    //   307: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   310: goto -106 -> 204
    //   313: astore 6
    //   315: aconst_null
    //   316: astore 5
    //   318: aload 5
    //   320: ifnull +8 -> 328
    //   323: aload 5
    //   325: invokevirtual 742	java/io/InputStream:close	()V
    //   328: aload 6
    //   330: athrow
    //   331: astore 5
    //   333: ldc_w 481
    //   336: ldc_w 744
    //   339: iconst_1
    //   340: anewarray 485	java/lang/Object
    //   343: dup
    //   344: iconst_0
    //   345: aload 5
    //   347: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   350: aastore
    //   351: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: goto -26 -> 328
    //   357: astore 6
    //   359: goto -41 -> 318
    //   362: astore 7
    //   364: goto -195 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	367	0	this	EmojiInfo
    //   0	367	1	paramInt1	int
    //   0	367	2	paramInt2	int
    //   86	8	3	l	long
    //   5	119	5	localObject1	Object
    //   138	15	5	localIOException1	java.io.IOException
    //   171	106	5	localObject2	Object
    //   287	15	5	localIOException2	java.io.IOException
    //   316	8	5	localObject3	Object
    //   331	15	5	localIOException3	java.io.IOException
    //   1	199	6	localInputStream	InputStream
    //   313	16	6	localObject4	Object
    //   357	1	6	localObject5	Object
    //   105	57	7	arrayOfByte	byte[]
    //   164	22	7	localIOException4	java.io.IOException
    //   362	1	7	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   130	135	138	java/io/IOException
    //   52	84	164	java/io/IOException
    //   199	204	287	java/io/IOException
    //   52	84	313	finally
    //   323	328	331	java/io/IOException
    //   91	98	357	finally
    //   102	107	357	finally
    //   111	121	357	finally
    //   173	194	357	finally
    //   91	98	362	java/io/IOException
    //   102	107	362	java/io/IOException
    //   111	121	362	java/io/IOException
  }
  
  public boolean equals(Object paramObject)
  {
    return cl(paramObject);
  }
  
  public final String getContent()
  {
    if (this.field_content == null) {
      return "";
    }
    return this.field_content;
  }
  
  public final String getName()
  {
    if (this.field_name == null) {
      return "";
    }
    return this.field_name;
  }
  
  public final Bitmap gi(Context paramContext)
  {
    try
    {
      paramContext = gj(paramContext);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  public final Bitmap gj(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_1
    //   6: bipush 120
    //   8: invokestatic 766	com/tencent/mm/bp/a:fromDPToPix	(Landroid/content/Context;I)I
    //   11: pop
    //   12: aload_0
    //   13: getfield 374	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   16: getstatic 50	com/tencent/mm/storage/emotion/EmojiInfo:tcD	I
    //   19: if_icmpeq +37 -> 56
    //   22: aload_0
    //   23: getfield 374	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   26: getstatic 534	com/tencent/mm/storage/emotion/EmojiGroupInfo:tcz	I
    //   29: if_icmpeq +27 -> 56
    //   32: aload_0
    //   33: getfield 374	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   36: getstatic 56	com/tencent/mm/storage/emotion/EmojiInfo:tcG	I
    //   39: if_icmpeq +17 -> 56
    //   42: aload_0
    //   43: getfield 374	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   46: istore_2
    //   47: getstatic 54	com/tencent/mm/storage/emotion/EmojiInfo:tcF	I
    //   50: istore_3
    //   51: iload_2
    //   52: iload_3
    //   53: if_icmpne +232 -> 285
    //   56: aload_0
    //   57: invokevirtual 537	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   60: astore 4
    //   62: aload_0
    //   63: getfield 377	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
    //   66: getstatic 66	com/tencent/mm/storage/emotion/EmojiInfo:tcJ	I
    //   69: if_icmpne +19 -> 88
    //   72: aload_0
    //   73: invokevirtual 595	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
    //   76: invokestatic 473	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   79: ifeq +47 -> 126
    //   82: aload_0
    //   83: invokevirtual 537	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   86: astore 4
    //   88: aload_1
    //   89: aload 4
    //   91: invokestatic 729	com/tencent/mm/storage/emotion/EmojiInfo:bt	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   94: astore 4
    //   96: aload 4
    //   98: astore_1
    //   99: aload 4
    //   101: invokestatic 770	com/tencent/mm/sdk/platformtools/c:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   104: astore 5
    //   106: aload 5
    //   108: astore_1
    //   109: aload 4
    //   111: ifnull +11 -> 122
    //   114: aload 4
    //   116: invokevirtual 742	java/io/InputStream:close	()V
    //   119: aload 5
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_1
    //   125: areturn
    //   126: aload_0
    //   127: invokevirtual 595	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
    //   130: astore 4
    //   132: goto -44 -> 88
    //   135: astore_1
    //   136: ldc_w 481
    //   139: ldc_w 744
    //   142: iconst_1
    //   143: anewarray 485	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload_1
    //   149: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   152: aastore
    //   153: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: aload 5
    //   158: astore_1
    //   159: goto -37 -> 122
    //   162: astore_1
    //   163: aload_0
    //   164: monitorexit
    //   165: aload_1
    //   166: athrow
    //   167: astore 5
    //   169: aconst_null
    //   170: astore 4
    //   172: aload 4
    //   174: astore_1
    //   175: ldc_w 481
    //   178: ldc_w 744
    //   181: iconst_1
    //   182: anewarray 485	java/lang/Object
    //   185: dup
    //   186: iconst_0
    //   187: aload 5
    //   189: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   192: aastore
    //   193: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   196: aload 4
    //   198: ifnull +82 -> 280
    //   201: aload 4
    //   203: invokevirtual 742	java/io/InputStream:close	()V
    //   206: aconst_null
    //   207: astore_1
    //   208: goto -86 -> 122
    //   211: astore_1
    //   212: ldc_w 481
    //   215: ldc_w 744
    //   218: iconst_1
    //   219: anewarray 485	java/lang/Object
    //   222: dup
    //   223: iconst_0
    //   224: aload_1
    //   225: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   228: aastore
    //   229: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: aconst_null
    //   233: astore_1
    //   234: goto -112 -> 122
    //   237: astore_1
    //   238: aload 5
    //   240: astore 4
    //   242: aload 4
    //   244: ifnull +8 -> 252
    //   247: aload 4
    //   249: invokevirtual 742	java/io/InputStream:close	()V
    //   252: aload_1
    //   253: athrow
    //   254: astore 4
    //   256: ldc_w 481
    //   259: ldc_w 744
    //   262: iconst_1
    //   263: anewarray 485	java/lang/Object
    //   266: dup
    //   267: iconst_0
    //   268: aload 4
    //   270: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   273: aastore
    //   274: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: goto -25 -> 252
    //   280: aconst_null
    //   281: astore_1
    //   282: goto -160 -> 122
    //   285: aload_0
    //   286: invokevirtual 695	com/tencent/mm/storage/emotion/EmojiInfo:cnA	()Z
    //   289: ifeq +156 -> 445
    //   292: aload_0
    //   293: invokevirtual 600	com/tencent/mm/storage/emotion/EmojiInfo:cnF	()Ljava/lang/String;
    //   296: astore_1
    //   297: aload_1
    //   298: ifnonnull +855 -> 1153
    //   301: new 113	java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   308: aload_0
    //   309: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   312: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: aload_0
    //   316: getfield 410	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   319: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: getstatic 293	java/io/File:separator	Ljava/lang/String;
    //   325: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload_0
    //   329: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   332: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: ldc_w 772
    //   338: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   344: astore_1
    //   345: new 290	java/io/File
    //   348: dup
    //   349: aload_1
    //   350: invokespecial 697	java/io/File:<init>	(Ljava/lang/String;)V
    //   353: astore_1
    //   354: aload_1
    //   355: invokevirtual 700	java/io/File:exists	()Z
    //   358: ifeq +220 -> 578
    //   361: new 774	java/io/FileInputStream
    //   364: dup
    //   365: aload_1
    //   366: invokespecial 777	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   369: astore 6
    //   371: aload 6
    //   373: astore_1
    //   374: aload 6
    //   376: astore 4
    //   378: aload 6
    //   380: astore 5
    //   382: aload 6
    //   384: invokestatic 770	com/tencent/mm/sdk/platformtools/c:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   387: astore 7
    //   389: aload 7
    //   391: astore_1
    //   392: aload 6
    //   394: astore 7
    //   396: aload_1
    //   397: astore 6
    //   399: aload 6
    //   401: astore_1
    //   402: aload 7
    //   404: ifnull -282 -> 122
    //   407: aload 7
    //   409: invokevirtual 778	java/io/FileInputStream:close	()V
    //   412: aload 6
    //   414: astore_1
    //   415: goto -293 -> 122
    //   418: astore_1
    //   419: ldc_w 481
    //   422: ldc_w 744
    //   425: iconst_1
    //   426: anewarray 485	java/lang/Object
    //   429: dup
    //   430: iconst_0
    //   431: aload_1
    //   432: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   435: aastore
    //   436: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   439: aload 6
    //   441: astore_1
    //   442: goto -320 -> 122
    //   445: new 290	java/io/File
    //   448: dup
    //   449: new 113	java/lang/StringBuilder
    //   452: dup
    //   453: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   456: aload_0
    //   457: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   460: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: aload_0
    //   464: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   467: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: ldc_w 780
    //   473: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   479: invokespecial 697	java/io/File:<init>	(Ljava/lang/String;)V
    //   482: astore_1
    //   483: goto -129 -> 354
    //   486: astore 7
    //   488: aconst_null
    //   489: astore 4
    //   491: aconst_null
    //   492: astore 6
    //   494: aload 4
    //   496: astore_1
    //   497: ldc_w 481
    //   500: ldc_w 744
    //   503: iconst_1
    //   504: anewarray 485	java/lang/Object
    //   507: dup
    //   508: iconst_0
    //   509: aload 7
    //   511: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   514: aastore
    //   515: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   518: aload 4
    //   520: astore_1
    //   521: ldc_w 481
    //   524: aload 7
    //   526: invokevirtual 781	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   529: invokestatic 623	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   532: aload 6
    //   534: astore_1
    //   535: aload 4
    //   537: ifnull -415 -> 122
    //   540: aload 4
    //   542: invokevirtual 778	java/io/FileInputStream:close	()V
    //   545: aload 6
    //   547: astore_1
    //   548: goto -426 -> 122
    //   551: astore_1
    //   552: ldc_w 481
    //   555: ldc_w 744
    //   558: iconst_1
    //   559: anewarray 485	java/lang/Object
    //   562: dup
    //   563: iconst_0
    //   564: aload_1
    //   565: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   568: aastore
    //   569: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   572: aload 6
    //   574: astore_1
    //   575: goto -453 -> 122
    //   578: aload_0
    //   579: invokevirtual 695	com/tencent/mm/storage/emotion/EmojiInfo:cnA	()Z
    //   582: ifeq +268 -> 850
    //   585: getstatic 786	android/os/Build$VERSION:SDK_INT	I
    //   588: bipush 19
    //   590: if_icmpge +554 -> 1144
    //   593: new 774	java/io/FileInputStream
    //   596: dup
    //   597: new 113	java/lang/StringBuilder
    //   600: dup
    //   601: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   604: aload_0
    //   605: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   608: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   611: aload_0
    //   612: getfield 410	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   615: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: getstatic 293	java/io/File:separator	Ljava/lang/String;
    //   621: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   624: aload_0
    //   625: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   628: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   631: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   634: invokespecial 787	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   637: astore 6
    //   639: aload 6
    //   641: astore_1
    //   642: aload 6
    //   644: astore 4
    //   646: aload 6
    //   648: astore 5
    //   650: aload 6
    //   652: invokestatic 770	com/tencent/mm/sdk/platformtools/c:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   655: astore 7
    //   657: aload 7
    //   659: astore 5
    //   661: aload 6
    //   663: astore 4
    //   665: aload 4
    //   667: astore_1
    //   668: aload_0
    //   669: invokevirtual 695	com/tencent/mm/storage/emotion/EmojiInfo:cnA	()Z
    //   672: ifeq +240 -> 912
    //   675: aload 4
    //   677: astore_1
    //   678: ldc_w 481
    //   681: ldc_w 789
    //   684: invokestatic 791	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   687: aload 5
    //   689: astore 6
    //   691: aload 4
    //   693: astore 7
    //   695: aload 4
    //   697: astore_1
    //   698: new 290	java/io/File
    //   701: dup
    //   702: new 113	java/lang/StringBuilder
    //   705: dup
    //   706: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   709: aload_0
    //   710: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   713: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: aload_0
    //   717: getfield 410	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   720: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   723: getstatic 293	java/io/File:separator	Ljava/lang/String;
    //   726: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   729: aload_0
    //   730: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   733: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   736: ldc_w 602
    //   739: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   745: invokespecial 697	java/io/File:<init>	(Ljava/lang/String;)V
    //   748: invokevirtual 700	java/io/File:exists	()Z
    //   751: ifne -352 -> 399
    //   754: aload 5
    //   756: astore 6
    //   758: aload 4
    //   760: astore 7
    //   762: aload 4
    //   764: astore_1
    //   765: getstatic 786	android/os/Build$VERSION:SDK_INT	I
    //   768: bipush 19
    //   770: if_icmpge -371 -> 399
    //   773: aload 4
    //   775: astore_1
    //   776: aload 5
    //   778: bipush 100
    //   780: getstatic 797	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   783: new 113	java/lang/StringBuilder
    //   786: dup
    //   787: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   790: aload_0
    //   791: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   794: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   797: aload_0
    //   798: getfield 410	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   801: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   804: getstatic 293	java/io/File:separator	Ljava/lang/String;
    //   807: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   810: aload_0
    //   811: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   814: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: ldc_w 602
    //   820: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   826: iconst_0
    //   827: invokestatic 800	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   830: aload 5
    //   832: astore 6
    //   834: aload 4
    //   836: astore 7
    //   838: goto -439 -> 399
    //   841: astore 7
    //   843: aload 5
    //   845: astore 6
    //   847: goto -353 -> 494
    //   850: new 774	java/io/FileInputStream
    //   853: dup
    //   854: new 113	java/lang/StringBuilder
    //   857: dup
    //   858: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   861: aload_0
    //   862: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   865: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   868: aload_0
    //   869: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   872: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   875: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   878: invokespecial 787	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   881: astore 6
    //   883: aload 6
    //   885: astore_1
    //   886: aload 6
    //   888: astore 4
    //   890: aload 6
    //   892: astore 5
    //   894: aload 6
    //   896: invokestatic 770	com/tencent/mm/sdk/platformtools/c:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   899: astore 7
    //   901: aload 7
    //   903: astore 5
    //   905: aload 6
    //   907: astore 4
    //   909: goto -244 -> 665
    //   912: aload 4
    //   914: astore_1
    //   915: aload 5
    //   917: bipush 100
    //   919: getstatic 797	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   922: new 113	java/lang/StringBuilder
    //   925: dup
    //   926: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   929: aload_0
    //   930: getfield 337	com/tencent/mm/storage/emotion/EmojiInfo:mcn	Ljava/lang/String;
    //   933: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   936: aload_0
    //   937: invokevirtual 673	com/tencent/mm/storage/emotion/EmojiInfo:Xh	()Ljava/lang/String;
    //   940: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   943: ldc_w 780
    //   946: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   949: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   952: iconst_0
    //   953: invokestatic 800	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   956: aload 5
    //   958: astore 6
    //   960: aload 4
    //   962: astore 7
    //   964: goto -565 -> 399
    //   967: astore 6
    //   969: aload 4
    //   971: astore_1
    //   972: ldc_w 481
    //   975: ldc_w 744
    //   978: iconst_1
    //   979: anewarray 485	java/lang/Object
    //   982: dup
    //   983: iconst_0
    //   984: aload 6
    //   986: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   989: aastore
    //   990: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   993: aload 4
    //   995: astore_1
    //   996: ldc_w 481
    //   999: aload 6
    //   1001: invokevirtual 517	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1004: invokestatic 623	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1007: aload 5
    //   1009: astore_1
    //   1010: aload 4
    //   1012: ifnull -890 -> 122
    //   1015: aload 4
    //   1017: invokevirtual 778	java/io/FileInputStream:close	()V
    //   1020: aload 5
    //   1022: astore_1
    //   1023: goto -901 -> 122
    //   1026: astore_1
    //   1027: ldc_w 481
    //   1030: ldc_w 744
    //   1033: iconst_1
    //   1034: anewarray 485	java/lang/Object
    //   1037: dup
    //   1038: iconst_0
    //   1039: aload_1
    //   1040: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1043: aastore
    //   1044: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1047: aload 5
    //   1049: astore_1
    //   1050: goto -928 -> 122
    //   1053: astore 4
    //   1055: aconst_null
    //   1056: astore_1
    //   1057: aload_1
    //   1058: ifnull +7 -> 1065
    //   1061: aload_1
    //   1062: invokevirtual 778	java/io/FileInputStream:close	()V
    //   1065: aload 4
    //   1067: athrow
    //   1068: astore_1
    //   1069: ldc_w 481
    //   1072: ldc_w 744
    //   1075: iconst_1
    //   1076: anewarray 485	java/lang/Object
    //   1079: dup
    //   1080: iconst_0
    //   1081: aload_1
    //   1082: invokestatic 747	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1085: aastore
    //   1086: invokestatic 749	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1089: goto -24 -> 1065
    //   1092: astore 4
    //   1094: goto -37 -> 1057
    //   1097: astore 6
    //   1099: aconst_null
    //   1100: astore 4
    //   1102: aconst_null
    //   1103: astore 5
    //   1105: goto -136 -> 969
    //   1108: astore 6
    //   1110: aconst_null
    //   1111: astore 5
    //   1113: goto -144 -> 969
    //   1116: astore 7
    //   1118: aconst_null
    //   1119: astore 6
    //   1121: aload 5
    //   1123: astore 4
    //   1125: goto -631 -> 494
    //   1128: astore 5
    //   1130: aload_1
    //   1131: astore 4
    //   1133: aload 5
    //   1135: astore_1
    //   1136: goto -894 -> 242
    //   1139: astore 5
    //   1141: goto -969 -> 172
    //   1144: aconst_null
    //   1145: astore 4
    //   1147: aconst_null
    //   1148: astore 5
    //   1150: goto -485 -> 665
    //   1153: goto -808 -> 345
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1156	0	this	EmojiInfo
    //   0	1156	1	paramContext	Context
    //   46	8	2	i	int
    //   50	4	3	j	int
    //   60	188	4	localObject1	Object
    //   254	15	4	localIOException	java.io.IOException
    //   376	640	4	localObject2	Object
    //   1053	13	4	localObject3	Object
    //   1092	1	4	localObject4	Object
    //   1100	46	4	localObject5	Object
    //   1	156	5	localBitmap	Bitmap
    //   167	72	5	localException1	Exception
    //   380	742	5	localObject6	Object
    //   1128	6	5	localObject7	Object
    //   1139	1	5	localException2	Exception
    //   1148	1	5	localObject8	Object
    //   369	590	6	localObject9	Object
    //   967	33	6	localException3	Exception
    //   1097	1	6	localException4	Exception
    //   1108	1	6	localException5	Exception
    //   1119	1	6	localObject10	Object
    //   387	21	7	localObject11	Object
    //   486	39	7	localFileNotFoundException1	java.io.FileNotFoundException
    //   655	182	7	localObject12	Object
    //   841	1	7	localFileNotFoundException2	java.io.FileNotFoundException
    //   899	64	7	localObject13	Object
    //   1116	1	7	localFileNotFoundException3	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   114	119	135	java/io/IOException
    //   5	51	162	finally
    //   114	119	162	finally
    //   136	156	162	finally
    //   201	206	162	finally
    //   212	232	162	finally
    //   247	252	162	finally
    //   252	254	162	finally
    //   256	277	162	finally
    //   407	412	162	finally
    //   419	439	162	finally
    //   540	545	162	finally
    //   552	572	162	finally
    //   1015	1020	162	finally
    //   1027	1047	162	finally
    //   1061	1065	162	finally
    //   1065	1068	162	finally
    //   1069	1089	162	finally
    //   56	62	167	java/lang/Exception
    //   62	88	167	java/lang/Exception
    //   88	96	167	java/lang/Exception
    //   126	132	167	java/lang/Exception
    //   201	206	211	java/io/IOException
    //   56	62	237	finally
    //   62	88	237	finally
    //   88	96	237	finally
    //   126	132	237	finally
    //   247	252	254	java/io/IOException
    //   407	412	418	java/io/IOException
    //   285	297	486	java/io/FileNotFoundException
    //   301	345	486	java/io/FileNotFoundException
    //   345	354	486	java/io/FileNotFoundException
    //   354	371	486	java/io/FileNotFoundException
    //   445	483	486	java/io/FileNotFoundException
    //   578	639	486	java/io/FileNotFoundException
    //   850	883	486	java/io/FileNotFoundException
    //   540	545	551	java/io/IOException
    //   668	675	841	java/io/FileNotFoundException
    //   678	687	841	java/io/FileNotFoundException
    //   698	754	841	java/io/FileNotFoundException
    //   765	773	841	java/io/FileNotFoundException
    //   776	830	841	java/io/FileNotFoundException
    //   915	956	841	java/io/FileNotFoundException
    //   668	675	967	java/lang/Exception
    //   678	687	967	java/lang/Exception
    //   698	754	967	java/lang/Exception
    //   765	773	967	java/lang/Exception
    //   776	830	967	java/lang/Exception
    //   915	956	967	java/lang/Exception
    //   1015	1020	1026	java/io/IOException
    //   285	297	1053	finally
    //   301	345	1053	finally
    //   345	354	1053	finally
    //   354	371	1053	finally
    //   445	483	1053	finally
    //   578	639	1053	finally
    //   850	883	1053	finally
    //   1061	1065	1068	java/io/IOException
    //   382	389	1092	finally
    //   497	518	1092	finally
    //   521	532	1092	finally
    //   650	657	1092	finally
    //   668	675	1092	finally
    //   678	687	1092	finally
    //   698	754	1092	finally
    //   765	773	1092	finally
    //   776	830	1092	finally
    //   894	901	1092	finally
    //   915	956	1092	finally
    //   972	993	1092	finally
    //   996	1007	1092	finally
    //   285	297	1097	java/lang/Exception
    //   301	345	1097	java/lang/Exception
    //   345	354	1097	java/lang/Exception
    //   354	371	1097	java/lang/Exception
    //   445	483	1097	java/lang/Exception
    //   578	639	1097	java/lang/Exception
    //   850	883	1097	java/lang/Exception
    //   382	389	1108	java/lang/Exception
    //   650	657	1108	java/lang/Exception
    //   894	901	1108	java/lang/Exception
    //   382	389	1116	java/io/FileNotFoundException
    //   650	657	1116	java/io/FileNotFoundException
    //   894	901	1116	java/io/FileNotFoundException
    //   99	106	1128	finally
    //   175	196	1128	finally
    //   99	106	1139	java/lang/Exception
  }
  
  public final boolean isGif()
  {
    return (this.field_type == tcJ) || (this.field_type == tcL);
  }
  
  public final void po(String paramString)
  {
    this.field_md5 = paramString;
  }
  
  public final void reset()
  {
    this.field_md5 = "";
    this.field_svrid = "";
    this.field_catalog = tcD;
    this.field_type = tcI;
    this.field_size = 0;
    this.field_start = 0;
    this.field_state = tcN;
    this.field_name = "";
    this.field_content = "";
    this.field_reserved1 = "";
    this.field_reserved2 = "";
    this.field_reserved3 = 0;
    this.field_reserved4 = 0;
    this.field_app_id = "";
    this.field_temp = 0;
  }
  
  public final void setSize(int paramInt)
  {
    this.field_size = paramInt;
  }
  
  public final void setType(int paramInt)
  {
    this.field_type = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("field_md5:").append(this.field_md5).append("\n");
    localStringBuilder.append("field_svrid:").append(this.field_svrid).append("\n");
    localStringBuilder.append("field_catalog:").append(this.field_catalog).append("\n");
    localStringBuilder.append("field_type:").append(this.field_type).append("\n");
    localStringBuilder.append("field_size:").append(this.field_size).append("\n");
    localStringBuilder.append("field_start:").append(this.field_start).append("\n");
    localStringBuilder.append("field_state:").append(this.field_state).append("\n");
    localStringBuilder.append("field_name:").append(this.field_name).append("\n");
    localStringBuilder.append("field_content:").append(this.field_content).append("\n");
    localStringBuilder.append("field_reserved1:").append(this.field_reserved1).append("\n");
    localStringBuilder.append("field_reserved2:").append(this.field_reserved2).append("\n");
    localStringBuilder.append("field_reserved3:").append(this.field_reserved3).append("\n");
    localStringBuilder.append("field_reserved4:").append(this.field_reserved4).append("\n");
    localStringBuilder.append("field_app_id:").append(this.field_app_id).append("\n");
    localStringBuilder.append("field_groupId:").append(this.field_groupId).append("\n");
    localStringBuilder.append("field_lastUseTime:").append(this.field_lastUseTime).append("\n");
    localStringBuilder.append("field_framesInfo:").append(this.field_framesInfo).append("\n");
    localStringBuilder.append("field_idx:").append(this.field_idx).append("\n");
    localStringBuilder.append("field_temp:").append(this.field_temp).append("\n");
    localStringBuilder.append("field_source:").append(this.field_source).append("\n");
    localStringBuilder.append("field_needupload:").append(this.field_needupload).append("\n");
    localStringBuilder.append("field_designerID:").append(this.field_designerID).append("\n");
    localStringBuilder.append("field_thumbUrl:").append(this.field_thumbUrl).append("\n");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mcn);
    paramParcel.writeString(this.field_md5);
    paramParcel.writeString(this.field_svrid);
    paramParcel.writeInt(this.field_catalog);
    paramParcel.writeInt(this.field_type);
    paramParcel.writeInt(this.field_size);
    paramParcel.writeInt(this.field_start);
    paramParcel.writeInt(this.field_state);
    paramParcel.writeString(this.field_name);
    paramParcel.writeString(this.field_content);
    paramParcel.writeString(this.field_reserved1);
    paramParcel.writeString(this.field_reserved2);
    paramParcel.writeInt(this.field_reserved3);
    paramParcel.writeInt(this.field_reserved4);
    paramParcel.writeString(this.field_app_id);
    paramParcel.writeString(this.field_groupId);
    paramParcel.writeLong(this.field_lastUseTime);
    paramParcel.writeString(this.field_framesInfo);
    paramParcel.writeInt(this.field_idx);
    paramParcel.writeInt(this.field_temp);
    paramParcel.writeInt(this.field_source);
    paramParcel.writeInt(this.field_needupload);
    paramParcel.writeString(this.field_designerID);
    paramParcel.writeString(this.field_thumbUrl);
    paramParcel.writeString(this.field_cdnUrl);
    paramParcel.writeString(this.field_encrypturl);
    paramParcel.writeString(this.field_aeskey);
    paramParcel.writeInt(this.field_width);
    paramParcel.writeInt(this.field_height);
    paramParcel.writeString(this.field_activityid);
    paramParcel.writeLong(this.sKx);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/emotion/EmojiInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
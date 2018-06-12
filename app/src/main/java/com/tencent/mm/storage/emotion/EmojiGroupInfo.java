package com.tencent.mm.storage.emotion;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.c.ar;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public class EmojiGroupInfo
  extends ar
  implements Parcelable
{
  public static final Parcelable.Creator<EmojiGroupInfo> CREATOR = new EmojiGroupInfo.1();
  public static int TYPE_CUSTOM;
  public static int TYPE_SYSTEM;
  protected static c.a dhO;
  public static int tcA;
  public static int tcB;
  public static int tcv;
  public static int tcw;
  public static int tcx;
  public static int tcy;
  public static int tcz;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[29];
    locala.columns = new String[30];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productID";
    locala.sKA.put("productID", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" productID TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.sKz = "productID";
    locala.columns[1] = "packIconUrl";
    locala.sKA.put("packIconUrl", "TEXT");
    localStringBuilder.append(" packIconUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "packGrayIconUrl";
    locala.sKA.put("packGrayIconUrl", "TEXT");
    localStringBuilder.append(" packGrayIconUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "packCoverUrl";
    locala.sKA.put("packCoverUrl", "TEXT");
    localStringBuilder.append(" packCoverUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "packName";
    locala.sKA.put("packName", "TEXT");
    localStringBuilder.append(" packName TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "packDesc";
    locala.sKA.put("packDesc", "TEXT");
    localStringBuilder.append(" packDesc TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "packAuthInfo";
    locala.sKA.put("packAuthInfo", "TEXT");
    localStringBuilder.append(" packAuthInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "packPrice";
    locala.sKA.put("packPrice", "TEXT");
    localStringBuilder.append(" packPrice TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "packType";
    locala.sKA.put("packType", "INTEGER");
    localStringBuilder.append(" packType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "packFlag";
    locala.sKA.put("packFlag", "INTEGER");
    localStringBuilder.append(" packFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "packExpire";
    locala.sKA.put("packExpire", "LONG");
    localStringBuilder.append(" packExpire LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "packTimeStamp";
    locala.sKA.put("packTimeStamp", "LONG");
    localStringBuilder.append(" packTimeStamp LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "packCopyright";
    locala.sKA.put("packCopyright", "TEXT");
    localStringBuilder.append(" packCopyright TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[14] = "status";
    locala.sKA.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "sort";
    locala.sKA.put("sort", "INTEGER default '1' ");
    localStringBuilder.append(" sort INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "lastUseTime";
    locala.sKA.put("lastUseTime", "LONG");
    localStringBuilder.append(" lastUseTime LONG");
    localStringBuilder.append(", ");
    locala.columns[17] = "packStatus";
    locala.sKA.put("packStatus", "INTEGER default '0' ");
    localStringBuilder.append(" packStatus INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "flag";
    locala.sKA.put("flag", "INTEGER default '0' ");
    localStringBuilder.append(" flag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "recommand";
    locala.sKA.put("recommand", "INTEGER default '0' ");
    localStringBuilder.append(" recommand INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "sync";
    locala.sKA.put("sync", "INTEGER default '0' ");
    localStringBuilder.append(" sync INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[21] = "idx";
    locala.sKA.put("idx", "INTEGER default '0' ");
    localStringBuilder.append(" idx INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[22] = "BigIconUrl";
    locala.sKA.put("BigIconUrl", "TEXT");
    localStringBuilder.append(" BigIconUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "MutiLanName";
    locala.sKA.put("MutiLanName", "TEXT");
    localStringBuilder.append(" MutiLanName TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "recommandType";
    locala.sKA.put("recommandType", "INTEGER default '-1' ");
    localStringBuilder.append(" recommandType INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[25] = "lang";
    locala.sKA.put("lang", "TEXT");
    localStringBuilder.append(" lang TEXT");
    localStringBuilder.append(", ");
    locala.columns[26] = "recommandWord";
    locala.sKA.put("recommandWord", "TEXT");
    localStringBuilder.append(" recommandWord TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "buttonType";
    locala.sKA.put("buttonType", "INTEGER");
    localStringBuilder.append(" buttonType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[28] = "count";
    locala.sKA.put("count", "INTEGER");
    localStringBuilder.append(" count INTEGER");
    locala.columns[29] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
    TYPE_SYSTEM = 1;
    tcv = 2;
    TYPE_CUSTOM = 3;
    tcw = 4;
    tcx = 256;
    tcy = 17;
    tcz = 18;
    tcA = 81;
    tcB = 65;
  }
  
  public EmojiGroupInfo() {}
  
  protected EmojiGroupInfo(Parcel paramParcel)
  {
    this.field_productID = paramParcel.readString();
    this.field_packIconUrl = paramParcel.readString();
    this.field_packGrayIconUrl = paramParcel.readString();
    this.field_packCoverUrl = paramParcel.readString();
    this.field_packName = paramParcel.readString();
    this.field_packDesc = paramParcel.readString();
    this.field_packAuthInfo = paramParcel.readString();
    this.field_packPrice = paramParcel.readString();
    this.field_packType = paramParcel.readInt();
    this.field_packFlag = paramParcel.readInt();
    this.field_packExpire = paramParcel.readLong();
    this.field_packTimeStamp = paramParcel.readLong();
    this.field_packCopyright = paramParcel.readString();
    this.field_type = paramParcel.readInt();
    this.field_status = paramParcel.readInt();
    this.field_sort = paramParcel.readInt();
    this.field_lastUseTime = paramParcel.readLong();
    this.field_packStatus = paramParcel.readInt();
    this.field_flag = paramParcel.readInt();
    this.field_recommand = paramParcel.readInt();
    this.field_sync = paramParcel.readInt();
    this.field_idx = paramParcel.readInt();
    this.field_BigIconUrl = paramParcel.readString();
    this.field_MutiLanName = paramParcel.readString();
    this.field_recommandType = paramParcel.readInt();
    this.field_lang = paramParcel.readString();
    this.field_recommandWord = paramParcel.readString();
    this.field_buttonType = paramParcel.readInt();
    this.field_count = paramParcel.readInt();
    this.sKx = paramParcel.readLong();
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final ts cnc()
  {
    ts localts = new ts();
    localts.rem = this.field_productID;
    localts.jPG = this.field_packIconUrl;
    localts.rwQ = this.field_packName;
    localts.rwR = this.field_packDesc;
    localts.rwS = this.field_packAuthInfo;
    localts.rwT = this.field_packPrice;
    localts.rwU = this.field_packType;
    localts.rwV = this.field_packFlag;
    localts.rwY = this.field_packCoverUrl;
    localts.rwZ = ((int)this.field_packExpire);
    localts.rxa = this.field_packCopyright;
    localts.rxy = ((int)this.field_packTimeStamp);
    localts.rxb = this.field_packPrice;
    return localts;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("field_productID:").append(this.field_productID).append("\n");
    localStringBuilder.append("field_packIconUrl:").append(this.field_packIconUrl).append("\n");
    localStringBuilder.append("field_packGrayIconUrl:").append(this.field_packGrayIconUrl).append("\n");
    localStringBuilder.append("field_packCoverUrl:").append(this.field_packCoverUrl).append("\n");
    localStringBuilder.append("field_packName:").append(this.field_packName).append("\n");
    localStringBuilder.append("field_packDesc:").append(this.field_packDesc).append("\n");
    localStringBuilder.append("field_packAuthInfo:").append(this.field_packAuthInfo).append("\n");
    localStringBuilder.append("field_packPrice:").append(this.field_packPrice).append("\n");
    localStringBuilder.append("field_packType:").append(this.field_packType).append("\n");
    localStringBuilder.append("field_packFlag:").append(this.field_packFlag).append("\n");
    localStringBuilder.append("field_packExpire:").append(this.field_packExpire).append("\n");
    localStringBuilder.append("field_packTimeStamp:").append(this.field_packTimeStamp).append("\n");
    localStringBuilder.append("field_packCopyright:").append(this.field_packCopyright).append("\n");
    localStringBuilder.append("field_type:").append(this.field_type).append("\n");
    localStringBuilder.append("field_status:").append(this.field_status).append("\n");
    localStringBuilder.append("field_sort:").append(this.field_sort).append("\n");
    localStringBuilder.append("field_lastUseTime:").append(this.field_lastUseTime).append("\n");
    localStringBuilder.append("field_packStatus:").append(this.field_packStatus).append("\n");
    localStringBuilder.append("field_recommand:").append(this.field_recommand).append("\n");
    localStringBuilder.append("field_sync:").append(this.field_sync).append("\n");
    localStringBuilder.append("field_idx:").append(this.field_idx).append("\n");
    localStringBuilder.append("field_BigIconUrl:").append(this.field_BigIconUrl).append("\n");
    localStringBuilder.append("field_MutiLanName:").append(this.field_MutiLanName).append("\n");
    localStringBuilder.append("field_count:").append(this.field_count).append("\n");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.field_productID);
    paramParcel.writeString(this.field_packIconUrl);
    paramParcel.writeString(this.field_packGrayIconUrl);
    paramParcel.writeString(this.field_packCoverUrl);
    paramParcel.writeString(this.field_packName);
    paramParcel.writeString(this.field_packDesc);
    paramParcel.writeString(this.field_packAuthInfo);
    paramParcel.writeString(this.field_packPrice);
    paramParcel.writeInt(this.field_packType);
    paramParcel.writeInt(this.field_packFlag);
    paramParcel.writeLong(this.field_packExpire);
    paramParcel.writeLong(this.field_packTimeStamp);
    paramParcel.writeString(this.field_packCopyright);
    paramParcel.writeInt(this.field_type);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeInt(this.field_sort);
    paramParcel.writeLong(this.field_lastUseTime);
    paramParcel.writeInt(this.field_packStatus);
    paramParcel.writeInt(this.field_flag);
    paramParcel.writeInt(this.field_recommand);
    paramParcel.writeInt(this.field_sync);
    paramParcel.writeInt(this.field_idx);
    paramParcel.writeString(this.field_BigIconUrl);
    paramParcel.writeString(this.field_MutiLanName);
    paramParcel.writeInt(this.field_recommandType);
    paramParcel.writeString(this.field_lang);
    paramParcel.writeString(this.field_recommandWord);
    paramParcel.writeInt(this.field_buttonType);
    paramParcel.writeInt(this.field_count);
    paramParcel.writeLong(this.sKx);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/storage/emotion/EmojiGroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
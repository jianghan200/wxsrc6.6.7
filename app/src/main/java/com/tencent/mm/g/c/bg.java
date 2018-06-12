package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class bg
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS FavItemInfo_id_Index ON FavItemInfo(id)", "CREATE INDEX IF NOT EXISTS FavItemInfo_type_Index ON FavItemInfo(type)", "CREATE INDEX IF NOT EXISTS FavItemInfo_updateSeq_Index ON FavItemInfo(updateSeq)", "CREATE INDEX IF NOT EXISTS FavItemInfo_flag_Index ON FavItemInfo(flag)", "CREATE INDEX IF NOT EXISTS FavItemInfo_sourceId_Index ON FavItemInfo(sourceId)", "CREATE INDEX IF NOT EXISTS FavItemInfo_datatotalsize_Index ON FavItemInfo(datatotalsize)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cke;
  private static final int ckf;
  private static final int clj;
  private static final int cne;
  private static final int cnk;
  private static final int cuh;
  private static final int cxT = "localId".hashCode();
  private static final int cyj;
  private static final int cyk;
  private static final int cyl;
  private static final int cym;
  private static final int cyn;
  private static final int cyo;
  private static final int cyp;
  private static final int cyq;
  private static final int cyr;
  private static final int cys;
  private static final int cyt;
  private static final int cyu;
  private static final int cyv;
  private static final int cyw;
  private boolean cjI = true;
  private boolean cjJ = true;
  private boolean clh = true;
  private boolean cna = true;
  private boolean cni = true;
  private boolean cue = true;
  private boolean cxR = true;
  private boolean cxV = true;
  private boolean cxW = true;
  private boolean cxX = true;
  private boolean cxY = true;
  private boolean cxZ = true;
  private boolean cya = true;
  private boolean cyb = true;
  private boolean cyc = true;
  private boolean cyd = true;
  private boolean cye = true;
  private boolean cyf = true;
  private boolean cyg = true;
  private boolean cyh = true;
  private boolean cyi = true;
  public long field_datatotalsize;
  public long field_edittime;
  public String field_ext;
  public wl field_favProto;
  public int field_flag;
  public String field_fromUser;
  public int field_id;
  public int field_itemStatus;
  public long field_localId;
  public int field_localSeq;
  public String field_realChatName;
  public String field_sessionId;
  public long field_sourceCreateTime;
  public String field_sourceId;
  public int field_sourceType;
  public wy field_tagProto;
  public String field_toUser;
  public int field_type;
  public int field_updateSeq;
  public long field_updateTime;
  public String field_xml;
  
  static
  {
    cuh = "id".hashCode();
    cke = "type".hashCode();
    cyj = "localSeq".hashCode();
    cyk = "updateSeq".hashCode();
    cnk = "flag".hashCode();
    cyl = "sourceId".hashCode();
    cym = "itemStatus".hashCode();
    ckf = "sourceType".hashCode();
    cyn = "sourceCreateTime".hashCode();
    clj = "updateTime".hashCode();
    cyo = "fromUser".hashCode();
    cyp = "toUser".hashCode();
    cyq = "realChatName".hashCode();
    cyr = "favProto".hashCode();
    cne = "xml".hashCode();
    cys = "ext".hashCode();
    cyt = "edittime".hashCode();
    cyu = "tagProto".hashCode();
    cyv = "sessionId".hashCode();
    cyw = "datatotalsize".hashCode();
  }
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.sKA.put("localId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" localId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "localId";
    locala.columns[1] = "id";
    locala.sKA.put("id", "INTEGER");
    localStringBuilder.append(" id INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "localSeq";
    locala.sKA.put("localSeq", "INTEGER");
    localStringBuilder.append(" localSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "updateSeq";
    locala.sKA.put("updateSeq", "INTEGER");
    localStringBuilder.append(" updateSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "flag";
    locala.sKA.put("flag", "INTEGER");
    localStringBuilder.append(" flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "sourceId";
    locala.sKA.put("sourceId", "TEXT");
    localStringBuilder.append(" sourceId TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "itemStatus";
    locala.sKA.put("itemStatus", "INTEGER");
    localStringBuilder.append(" itemStatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "sourceType";
    locala.sKA.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "sourceCreateTime";
    locala.sKA.put("sourceCreateTime", "LONG");
    localStringBuilder.append(" sourceCreateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "updateTime";
    locala.sKA.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "fromUser";
    locala.sKA.put("fromUser", "TEXT");
    localStringBuilder.append(" fromUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "toUser";
    locala.sKA.put("toUser", "TEXT");
    localStringBuilder.append(" toUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "realChatName";
    locala.sKA.put("realChatName", "TEXT");
    localStringBuilder.append(" realChatName TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "favProto";
    locala.sKA.put("favProto", "BLOB");
    localStringBuilder.append(" favProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "xml";
    locala.sKA.put("xml", "TEXT");
    localStringBuilder.append(" xml TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "ext";
    locala.sKA.put("ext", "TEXT");
    localStringBuilder.append(" ext TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "edittime";
    locala.sKA.put("edittime", "LONG");
    localStringBuilder.append(" edittime LONG");
    localStringBuilder.append(", ");
    locala.columns[18] = "tagProto";
    locala.sKA.put("tagProto", "BLOB");
    localStringBuilder.append(" tagProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[19] = "sessionId";
    locala.sKA.put("sessionId", "TEXT");
    localStringBuilder.append(" sessionId TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "datatotalsize";
    locala.sKA.put("datatotalsize", "LONG");
    localStringBuilder.append(" datatotalsize LONG");
    locala.columns[21] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cxT != k) {
        break label65;
      }
      this.field_localId = paramCursor.getLong(i);
      this.cxR = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cuh == k) {
        this.field_id = paramCursor.getInt(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (cyj == k) {
        this.field_localSeq = paramCursor.getInt(i);
      } else if (cyk == k) {
        this.field_updateSeq = paramCursor.getInt(i);
      } else if (cnk == k) {
        this.field_flag = paramCursor.getInt(i);
      } else if (cyl == k) {
        this.field_sourceId = paramCursor.getString(i);
      } else if (cym == k) {
        this.field_itemStatus = paramCursor.getInt(i);
      } else if (ckf == k) {
        this.field_sourceType = paramCursor.getInt(i);
      } else if (cyn == k) {
        this.field_sourceCreateTime = paramCursor.getLong(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (cyo == k) {
        this.field_fromUser = paramCursor.getString(i);
      } else if (cyp == k) {
        this.field_toUser = paramCursor.getString(i);
      } else if (cyq == k) {
        this.field_realChatName = paramCursor.getString(i);
      } else if (cyr == k) {
        try
        {
          byte[] arrayOfByte1 = paramCursor.getBlob(i);
          if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
            continue;
          }
          this.field_favProto = ((wl)new wl().aG(arrayOfByte1));
        }
        catch (IOException localIOException1)
        {
          x.e("MicroMsg.SDK.BaseFavItemInfo", localIOException1.getMessage());
        }
      } else if (cne == k) {
        this.field_xml = paramCursor.getString(i);
      } else if (cys == k) {
        this.field_ext = paramCursor.getString(i);
      } else if (cyt == k) {
        this.field_edittime = paramCursor.getLong(i);
      } else if (cyu == k) {
        try
        {
          byte[] arrayOfByte2 = paramCursor.getBlob(i);
          if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
            continue;
          }
          this.field_tagProto = ((wy)new wy().aG(arrayOfByte2));
        }
        catch (IOException localIOException2)
        {
          x.e("MicroMsg.SDK.BaseFavItemInfo", localIOException2.getMessage());
        }
      } else if (cyv == k) {
        this.field_sessionId = paramCursor.getString(i);
      } else if (cyw == k) {
        this.field_datatotalsize = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxR) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if (this.cue) {
      localContentValues.put("id", Integer.valueOf(this.field_id));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cxV) {
      localContentValues.put("localSeq", Integer.valueOf(this.field_localSeq));
    }
    if (this.cxW) {
      localContentValues.put("updateSeq", Integer.valueOf(this.field_updateSeq));
    }
    if (this.cni) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.cxX) {
      localContentValues.put("sourceId", this.field_sourceId);
    }
    if (this.cxY) {
      localContentValues.put("itemStatus", Integer.valueOf(this.field_itemStatus));
    }
    if (this.cjJ) {
      localContentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
    }
    if (this.cxZ) {
      localContentValues.put("sourceCreateTime", Long.valueOf(this.field_sourceCreateTime));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.cya) {
      localContentValues.put("fromUser", this.field_fromUser);
    }
    if (this.cyb) {
      localContentValues.put("toUser", this.field_toUser);
    }
    if (this.cyc) {
      localContentValues.put("realChatName", this.field_realChatName);
    }
    if ((this.cyd) && (this.field_favProto != null)) {}
    try
    {
      localContentValues.put("favProto", this.field_favProto.toByteArray());
      if (this.cna) {
        localContentValues.put("xml", this.field_xml);
      }
      if (this.cye) {
        localContentValues.put("ext", this.field_ext);
      }
      if (this.cyf) {
        localContentValues.put("edittime", Long.valueOf(this.field_edittime));
      }
      if ((!this.cyg) || (this.field_tagProto == null)) {}
    }
    catch (IOException localIOException1)
    {
      try
      {
        localContentValues.put("tagProto", this.field_tagProto.toByteArray());
        if (this.cyh) {
          localContentValues.put("sessionId", this.field_sessionId);
        }
        if (this.cyi) {
          localContentValues.put("datatotalsize", Long.valueOf(this.field_datatotalsize));
        }
        if (this.sKx > 0L) {
          localContentValues.put("rowid", Long.valueOf(this.sKx));
        }
        return localContentValues;
        localIOException1 = localIOException1;
        x.e("MicroMsg.SDK.BaseFavItemInfo", localIOException1.getMessage());
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          x.e("MicroMsg.SDK.BaseFavItemInfo", localIOException2.getMessage());
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
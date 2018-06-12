package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class eg
  extends c
{
  private static final int cEa;
  private static final int cPJ;
  private static final int cPK;
  private static final int cPL;
  private static final int cPM;
  private static final int cPN;
  private static final int cPO;
  private static final int cPP;
  private static final int cPQ;
  private static final int cPR;
  private static final int cPS;
  private static final int cPT;
  private static final int cPU;
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS voiceRemindFileNameIndex ON VoiceRemindInfo(filename)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckV;
  private static final int cvS;
  private static final int cvT;
  private boolean cDV = true;
  private boolean cPA = true;
  private boolean cPB = true;
  private boolean cPC = true;
  private boolean cPD = true;
  private boolean cPE = true;
  private boolean cPF = true;
  private boolean cPG = true;
  private boolean cPH = true;
  private boolean cPI = true;
  private boolean cPx = true;
  private boolean cPy = true;
  private boolean cPz = true;
  private boolean ciS = true;
  private boolean ckE = true;
  private boolean cvq = true;
  private boolean cvr = true;
  public String field_clientid;
  public long field_createtime;
  public String field_filename;
  public int field_filenowsize;
  public String field_human;
  public long field_lastmodifytime;
  public long field_msgid;
  public int field_msglocalid;
  public int field_nettimes;
  public int field_offset;
  public int field_reserved1;
  public String field_reserved2;
  public int field_status;
  public int field_totallen;
  public String field_user;
  public int field_voiceformat;
  public int field_voicelenght;
  
  static
  {
    cPJ = "filename".hashCode();
    cPK = "user".hashCode();
    cPL = "msgid".hashCode();
    ckV = "offset".hashCode();
    cPM = "filenowsize".hashCode();
    cPN = "totallen".hashCode();
    ciV = "status".hashCode();
    cEa = "createtime".hashCode();
    cPO = "lastmodifytime".hashCode();
    cPP = "clientid".hashCode();
    cPQ = "voicelenght".hashCode();
    cPR = "msglocalid".hashCode();
    cPS = "human".hashCode();
    cPT = "voiceformat".hashCode();
    cPU = "nettimes".hashCode();
    cvS = "reserved1".hashCode();
    cvT = "reserved2".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cPJ != k) {
        break label60;
      }
      this.field_filename = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cPK == k) {
        this.field_user = paramCursor.getString(i);
      } else if (cPL == k) {
        this.field_msgid = paramCursor.getLong(i);
      } else if (ckV == k) {
        this.field_offset = paramCursor.getInt(i);
      } else if (cPM == k) {
        this.field_filenowsize = paramCursor.getInt(i);
      } else if (cPN == k) {
        this.field_totallen = paramCursor.getInt(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cEa == k) {
        this.field_createtime = paramCursor.getLong(i);
      } else if (cPO == k) {
        this.field_lastmodifytime = paramCursor.getLong(i);
      } else if (cPP == k) {
        this.field_clientid = paramCursor.getString(i);
      } else if (cPQ == k) {
        this.field_voicelenght = paramCursor.getInt(i);
      } else if (cPR == k) {
        this.field_msglocalid = paramCursor.getInt(i);
      } else if (cPS == k) {
        this.field_human = paramCursor.getString(i);
      } else if (cPT == k) {
        this.field_voiceformat = paramCursor.getInt(i);
      } else if (cPU == k) {
        this.field_nettimes = paramCursor.getInt(i);
      } else if (cvS == k) {
        this.field_reserved1 = paramCursor.getInt(i);
      } else if (cvT == k) {
        this.field_reserved2 = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cPx) {
      localContentValues.put("filename", this.field_filename);
    }
    if (this.cPy) {
      localContentValues.put("user", this.field_user);
    }
    if (this.cPz) {
      localContentValues.put("msgid", Long.valueOf(this.field_msgid));
    }
    if (this.ckE) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.cPA) {
      localContentValues.put("filenowsize", Integer.valueOf(this.field_filenowsize));
    }
    if (this.cPB) {
      localContentValues.put("totallen", Integer.valueOf(this.field_totallen));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cDV) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.cPC) {
      localContentValues.put("lastmodifytime", Long.valueOf(this.field_lastmodifytime));
    }
    if (this.cPD) {
      localContentValues.put("clientid", this.field_clientid);
    }
    if (this.cPE) {
      localContentValues.put("voicelenght", Integer.valueOf(this.field_voicelenght));
    }
    if (this.cPF) {
      localContentValues.put("msglocalid", Integer.valueOf(this.field_msglocalid));
    }
    if (this.cPG) {
      localContentValues.put("human", this.field_human);
    }
    if (this.cPH) {
      localContentValues.put("voiceformat", Integer.valueOf(this.field_voiceformat));
    }
    if (this.cPI) {
      localContentValues.put("nettimes", Integer.valueOf(this.field_nettimes));
    }
    if (this.cvq) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if (this.cvr) {
      localContentValues.put("reserved2", this.field_reserved2);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
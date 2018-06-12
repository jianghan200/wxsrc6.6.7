package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class di
  extends c
{
  private static final int cKQ;
  private static final int cKR;
  private static final int cKS = "favFrom".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciO;
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cke;
  private static final int cnf;
  private static final int cws;
  private static final int cxT = "localId".hashCode();
  private static final int cyp;
  private boolean cKN = true;
  private boolean cKO = true;
  private boolean cKP = true;
  private boolean ciK = true;
  private boolean ciS = true;
  private boolean cjI = true;
  private boolean cnb = true;
  private boolean cwo = true;
  private boolean cxR = true;
  private boolean cyb = true;
  public wl field_dataProto;
  public String field_desc;
  public String field_favFrom;
  public int field_localId;
  public long field_msgId;
  public long field_oriMsgId;
  public int field_status;
  public String field_title;
  public String field_toUser;
  public int field_type;
  
  static
  {
    ciO = "msgId".hashCode();
    cKQ = "oriMsgId".hashCode();
    cyp = "toUser".hashCode();
    cnf = "title".hashCode();
    cws = "desc".hashCode();
    cKR = "dataProto".hashCode();
    cke = "type".hashCode();
    ciV = "status".hashCode();
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
      this.field_localId = paramCursor.getInt(i);
      this.cxR = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ciO == k) {
        this.field_msgId = paramCursor.getLong(i);
      } else if (cKQ == k) {
        this.field_oriMsgId = paramCursor.getLong(i);
      } else if (cyp == k) {
        this.field_toUser = paramCursor.getString(i);
      } else if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (cws == k) {
        this.field_desc = paramCursor.getString(i);
      } else if (cKR == k) {
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(i);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
            continue;
          }
          this.field_dataProto = ((wl)new wl().aG(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          x.e("MicroMsg.SDK.BaseRecordMessageInfo", localIOException.getMessage());
        }
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cKS == k) {
        this.field_favFrom = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxR) {
      localContentValues.put("localId", Integer.valueOf(this.field_localId));
    }
    if (this.ciK) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.cKN) {
      localContentValues.put("oriMsgId", Long.valueOf(this.field_oriMsgId));
    }
    if (this.field_toUser == null) {
      this.field_toUser = "";
    }
    if (this.cyb) {
      localContentValues.put("toUser", this.field_toUser);
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cwo) {
      localContentValues.put("desc", this.field_desc);
    }
    if ((this.cKO) && (this.field_dataProto != null)) {}
    try
    {
      localContentValues.put("dataProto", this.field_dataProto.toByteArray());
      if (this.cjI) {
        localContentValues.put("type", Integer.valueOf(this.field_type));
      }
      if (this.ciS) {
        localContentValues.put("status", Integer.valueOf(this.field_status));
      }
      if (this.cKP) {
        localContentValues.put("favFrom", this.field_favFrom);
      }
      if (this.sKx > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.sKx));
      }
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.BaseRecordMessageInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
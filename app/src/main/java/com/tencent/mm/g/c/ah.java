package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ah
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int crA = "chatroomname".hashCode();
  private static final int crB = "addtime".hashCode();
  private static final int crC = "memberlist".hashCode();
  private static final int crD = "displayname".hashCode();
  private static final int crE = "chatroomnick".hashCode();
  private static final int crF = "roomflag".hashCode();
  private static final int crG = "roomowner".hashCode();
  private static final int crH = "roomdata".hashCode();
  private static final int crI = "isShowname".hashCode();
  private static final int crJ = "selfDisplayName".hashCode();
  private static final int crK = "style".hashCode();
  private static final int crL = "chatroomdataflag".hashCode();
  private static final int crM = "modifytime".hashCode();
  private static final int crN = "chatroomnotice".hashCode();
  private static final int crO = "chatroomVersion".hashCode();
  private static final int crP = "chatroomnoticeEditor".hashCode();
  private static final int crQ = "chatroomnoticePublishTime".hashCode();
  private static final int crR = "chatroomLocalVersion".hashCode();
  private boolean cri = true;
  private boolean crj = true;
  private boolean crk = true;
  private boolean crl = true;
  private boolean crm = true;
  private boolean crn = true;
  private boolean cro = true;
  private boolean crp = true;
  private boolean crq = true;
  private boolean crr = true;
  private boolean crs = true;
  private boolean crt = true;
  private boolean cru = true;
  private boolean crv = true;
  private boolean crw = true;
  private boolean crx = true;
  private boolean cry = true;
  private boolean crz = true;
  public long field_addtime;
  public long field_chatroomLocalVersion;
  public int field_chatroomVersion;
  public int field_chatroomdataflag;
  public String field_chatroomname;
  public String field_chatroomnick;
  public String field_chatroomnotice;
  public String field_chatroomnoticeEditor;
  public long field_chatroomnoticePublishTime;
  public String field_displayname;
  public int field_isShowname;
  public String field_memberlist;
  public long field_modifytime;
  public byte[] field_roomdata;
  public int field_roomflag;
  public String field_roomowner;
  public String field_selfDisplayName;
  public int field_style;
  
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
      if (crA != k) {
        break label65;
      }
      this.field_chatroomname = paramCursor.getString(i);
      this.cri = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (crB == k) {
        this.field_addtime = paramCursor.getLong(i);
      } else if (crC == k) {
        this.field_memberlist = paramCursor.getString(i);
      } else if (crD == k) {
        this.field_displayname = paramCursor.getString(i);
      } else if (crE == k) {
        this.field_chatroomnick = paramCursor.getString(i);
      } else if (crF == k) {
        this.field_roomflag = paramCursor.getInt(i);
      } else if (crG == k) {
        this.field_roomowner = paramCursor.getString(i);
      } else if (crH == k) {
        this.field_roomdata = paramCursor.getBlob(i);
      } else if (crI == k) {
        this.field_isShowname = paramCursor.getInt(i);
      } else if (crJ == k) {
        this.field_selfDisplayName = paramCursor.getString(i);
      } else if (crK == k) {
        this.field_style = paramCursor.getInt(i);
      } else if (crL == k) {
        this.field_chatroomdataflag = paramCursor.getInt(i);
      } else if (crM == k) {
        this.field_modifytime = paramCursor.getLong(i);
      } else if (crN == k) {
        this.field_chatroomnotice = paramCursor.getString(i);
      } else if (crO == k) {
        this.field_chatroomVersion = paramCursor.getInt(i);
      } else if (crP == k) {
        this.field_chatroomnoticeEditor = paramCursor.getString(i);
      } else if (crQ == k) {
        this.field_chatroomnoticePublishTime = paramCursor.getLong(i);
      } else if (crR == k) {
        this.field_chatroomLocalVersion = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_chatroomname == null) {
      this.field_chatroomname = "";
    }
    if (this.cri) {
      localContentValues.put("chatroomname", this.field_chatroomname);
    }
    if (this.crj) {
      localContentValues.put("addtime", Long.valueOf(this.field_addtime));
    }
    if (this.crk) {
      localContentValues.put("memberlist", this.field_memberlist);
    }
    if (this.crl) {
      localContentValues.put("displayname", this.field_displayname);
    }
    if (this.crm) {
      localContentValues.put("chatroomnick", this.field_chatroomnick);
    }
    if (this.crn) {
      localContentValues.put("roomflag", Integer.valueOf(this.field_roomflag));
    }
    if (this.cro) {
      localContentValues.put("roomowner", this.field_roomowner);
    }
    if (this.crp) {
      localContentValues.put("roomdata", this.field_roomdata);
    }
    if (this.crq) {
      localContentValues.put("isShowname", Integer.valueOf(this.field_isShowname));
    }
    if (this.crr) {
      localContentValues.put("selfDisplayName", this.field_selfDisplayName);
    }
    if (this.crs) {
      localContentValues.put("style", Integer.valueOf(this.field_style));
    }
    if (this.crt) {
      localContentValues.put("chatroomdataflag", Integer.valueOf(this.field_chatroomdataflag));
    }
    if (this.cru) {
      localContentValues.put("modifytime", Long.valueOf(this.field_modifytime));
    }
    if (this.crv) {
      localContentValues.put("chatroomnotice", this.field_chatroomnotice);
    }
    if (this.crw) {
      localContentValues.put("chatroomVersion", Integer.valueOf(this.field_chatroomVersion));
    }
    if (this.crx) {
      localContentValues.put("chatroomnoticeEditor", this.field_chatroomnoticeEditor);
    }
    if (this.cry) {
      localContentValues.put("chatroomnoticePublishTime", Long.valueOf(this.field_chatroomnoticePublishTime));
    }
    if (this.crz) {
      localContentValues.put("chatroomLocalVersion", Long.valueOf(this.field_chatroomLocalVersion));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
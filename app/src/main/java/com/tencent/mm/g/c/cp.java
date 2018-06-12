package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class cp
  extends c
{
  private static final int cHK;
  private static final int cHL;
  private static final int cHM;
  private static final int cHN;
  private static final int cHO;
  private static final int cHP;
  private static final int cHQ;
  private static final int cHR;
  private static final int cHS;
  private static final int cHT;
  private static final int cHU;
  private static final int cHV;
  private static final int cHW;
  private static final int cHX;
  private static final int cHY;
  private static final int cHZ;
  private static final int cIa;
  private static final int cIb;
  private static final int cIc;
  private static final int cId;
  private static final int cIe;
  private static final int cIf;
  private static final int cIg;
  private static final int cIh;
  private static final int cIi;
  private static final int cIj;
  private static final int cIk;
  private static final int cIl;
  private static final int cIm;
  private static final int cIn = "mimetype".hashCode();
  private static final int cIo = "protocol".hashCode();
  private static final int cIp = "barBackToWebView".hashCode();
  private static final int cIq = "musicbar_url".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjj;
  private static final int ckP;
  private static final int clj;
  private boolean cHA = true;
  private boolean cHB = true;
  private boolean cHC = true;
  private boolean cHD = true;
  private boolean cHE = true;
  private boolean cHF = true;
  private boolean cHG = true;
  private boolean cHH = true;
  private boolean cHI = true;
  private boolean cHJ = true;
  private boolean cHd = true;
  private boolean cHe = true;
  private boolean cHf = true;
  private boolean cHg = true;
  private boolean cHh = true;
  private boolean cHi = true;
  private boolean cHj = true;
  private boolean cHk = true;
  private boolean cHl = true;
  private boolean cHm = true;
  private boolean cHn = true;
  private boolean cHo = true;
  private boolean cHp = true;
  private boolean cHq = true;
  private boolean cHr = true;
  private boolean cHs = true;
  private boolean cHt = true;
  private boolean cHu = true;
  private boolean cHv = true;
  private boolean cHw = true;
  private boolean cHx = true;
  private boolean cHy = true;
  private boolean cHz = true;
  private boolean cjb = true;
  private boolean cky = true;
  private boolean clh = true;
  public String field_appId;
  public boolean field_barBackToWebView;
  public long field_downloadedLength;
  public int field_endFlag;
  public boolean field_hideBanner;
  public int field_isBlock;
  public String field_jsWebUrlDomain;
  public String field_mimetype;
  public String field_musicId;
  public int field_musicType;
  public String field_musicbar_url;
  public String field_originMusicId;
  public String field_protocol;
  public String field_songAlbum;
  public String field_songAlbumLocalPath;
  public int field_songAlbumType;
  public String field_songAlbumUrl;
  public int field_songBgColor;
  public long field_songFileLength;
  public String field_songHAlbumUrl;
  public int field_songId;
  public String field_songLyric;
  public int field_songLyricColor;
  public String field_songMediaId;
  public String field_songName;
  public String field_songSinger;
  public String field_songSnsAlbumUser;
  public String field_songSnsShareUser;
  public String field_songWapLinkUrl;
  public String field_songWebUrl;
  public long field_songWifiFileLength;
  public String field_songWifiUrl;
  public int field_startTime;
  public long field_updateTime;
  public long field_wifiDownloadedLength;
  public int field_wifiEndFlag;
  
  static
  {
    cHK = "musicId".hashCode();
    cHL = "originMusicId".hashCode();
    cHM = "musicType".hashCode();
    cHN = "downloadedLength".hashCode();
    cHO = "wifiDownloadedLength".hashCode();
    cHP = "endFlag".hashCode();
    cHQ = "wifiEndFlag".hashCode();
    clj = "updateTime".hashCode();
    cHR = "songId".hashCode();
    cHS = "songName".hashCode();
    cHT = "songSinger".hashCode();
    cHU = "songAlbum".hashCode();
    cHV = "songAlbumType".hashCode();
    cHW = "songAlbumUrl".hashCode();
    cHX = "songHAlbumUrl".hashCode();
    cHY = "songAlbumLocalPath".hashCode();
    cHZ = "songWifiUrl".hashCode();
    cIa = "songWapLinkUrl".hashCode();
    cIb = "songWebUrl".hashCode();
    ckP = "appId".hashCode();
    cIc = "songMediaId".hashCode();
    cId = "songSnsAlbumUser".hashCode();
    cIe = "songSnsShareUser".hashCode();
    cIf = "songLyric".hashCode();
    cIg = "songBgColor".hashCode();
    cIh = "songLyricColor".hashCode();
    cIi = "songFileLength".hashCode();
    cIj = "songWifiFileLength".hashCode();
    cIk = "hideBanner".hashCode();
    cIl = "jsWebUrlDomain".hashCode();
    cIm = "isBlock".hashCode();
    cjj = "startTime".hashCode();
  }
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[36];
    locala.columns = new String[37];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "musicId";
    locala.sKA.put("musicId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" musicId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "musicId";
    locala.columns[1] = "originMusicId";
    locala.sKA.put("originMusicId", "TEXT");
    localStringBuilder.append(" originMusicId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "musicType";
    locala.sKA.put("musicType", "INTEGER");
    localStringBuilder.append(" musicType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "downloadedLength";
    locala.sKA.put("downloadedLength", "LONG");
    localStringBuilder.append(" downloadedLength LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "wifiDownloadedLength";
    locala.sKA.put("wifiDownloadedLength", "LONG");
    localStringBuilder.append(" wifiDownloadedLength LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "endFlag";
    locala.sKA.put("endFlag", "INTEGER");
    localStringBuilder.append(" endFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "wifiEndFlag";
    locala.sKA.put("wifiEndFlag", "INTEGER");
    localStringBuilder.append(" wifiEndFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "updateTime";
    locala.sKA.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "songId";
    locala.sKA.put("songId", "INTEGER");
    localStringBuilder.append(" songId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "songName";
    locala.sKA.put("songName", "TEXT");
    localStringBuilder.append(" songName TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "songSinger";
    locala.sKA.put("songSinger", "TEXT");
    localStringBuilder.append(" songSinger TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "songAlbum";
    locala.sKA.put("songAlbum", "TEXT");
    localStringBuilder.append(" songAlbum TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "songAlbumType";
    locala.sKA.put("songAlbumType", "INTEGER");
    localStringBuilder.append(" songAlbumType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "songAlbumUrl";
    locala.sKA.put("songAlbumUrl", "TEXT");
    localStringBuilder.append(" songAlbumUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "songHAlbumUrl";
    locala.sKA.put("songHAlbumUrl", "TEXT");
    localStringBuilder.append(" songHAlbumUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "songAlbumLocalPath";
    locala.sKA.put("songAlbumLocalPath", "TEXT");
    localStringBuilder.append(" songAlbumLocalPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "songWifiUrl";
    locala.sKA.put("songWifiUrl", "TEXT");
    localStringBuilder.append(" songWifiUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "songWapLinkUrl";
    locala.sKA.put("songWapLinkUrl", "TEXT");
    localStringBuilder.append(" songWapLinkUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "songWebUrl";
    locala.sKA.put("songWebUrl", "TEXT");
    localStringBuilder.append(" songWebUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "appId";
    locala.sKA.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "songMediaId";
    locala.sKA.put("songMediaId", "TEXT");
    localStringBuilder.append(" songMediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "songSnsAlbumUser";
    locala.sKA.put("songSnsAlbumUser", "TEXT");
    localStringBuilder.append(" songSnsAlbumUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "songSnsShareUser";
    locala.sKA.put("songSnsShareUser", "TEXT");
    localStringBuilder.append(" songSnsShareUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "songLyric";
    locala.sKA.put("songLyric", "TEXT");
    localStringBuilder.append(" songLyric TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "songBgColor";
    locala.sKA.put("songBgColor", "INTEGER");
    localStringBuilder.append(" songBgColor INTEGER");
    localStringBuilder.append(", ");
    locala.columns[25] = "songLyricColor";
    locala.sKA.put("songLyricColor", "INTEGER");
    localStringBuilder.append(" songLyricColor INTEGER");
    localStringBuilder.append(", ");
    locala.columns[26] = "songFileLength";
    locala.sKA.put("songFileLength", "LONG");
    localStringBuilder.append(" songFileLength LONG");
    localStringBuilder.append(", ");
    locala.columns[27] = "songWifiFileLength";
    locala.sKA.put("songWifiFileLength", "LONG");
    localStringBuilder.append(" songWifiFileLength LONG");
    localStringBuilder.append(", ");
    locala.columns[28] = "hideBanner";
    locala.sKA.put("hideBanner", "INTEGER");
    localStringBuilder.append(" hideBanner INTEGER");
    localStringBuilder.append(", ");
    locala.columns[29] = "jsWebUrlDomain";
    locala.sKA.put("jsWebUrlDomain", "TEXT");
    localStringBuilder.append(" jsWebUrlDomain TEXT");
    localStringBuilder.append(", ");
    locala.columns[30] = "isBlock";
    locala.sKA.put("isBlock", "INTEGER");
    localStringBuilder.append(" isBlock INTEGER");
    localStringBuilder.append(", ");
    locala.columns[31] = "startTime";
    locala.sKA.put("startTime", "INTEGER");
    localStringBuilder.append(" startTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[32] = "mimetype";
    locala.sKA.put("mimetype", "TEXT");
    localStringBuilder.append(" mimetype TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "protocol";
    locala.sKA.put("protocol", "TEXT");
    localStringBuilder.append(" protocol TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "barBackToWebView";
    locala.sKA.put("barBackToWebView", "INTEGER");
    localStringBuilder.append(" barBackToWebView INTEGER");
    localStringBuilder.append(", ");
    locala.columns[35] = "musicbar_url";
    locala.sKA.put("musicbar_url", "TEXT");
    localStringBuilder.append(" musicbar_url TEXT");
    locala.columns[36] = "rowid";
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
      if (cHK != k) {
        break label65;
      }
      this.field_musicId = paramCursor.getString(i);
      this.cHd = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cHL == k)
      {
        this.field_originMusicId = paramCursor.getString(i);
      }
      else if (cHM == k)
      {
        this.field_musicType = paramCursor.getInt(i);
      }
      else if (cHN == k)
      {
        this.field_downloadedLength = paramCursor.getLong(i);
      }
      else if (cHO == k)
      {
        this.field_wifiDownloadedLength = paramCursor.getLong(i);
      }
      else if (cHP == k)
      {
        this.field_endFlag = paramCursor.getInt(i);
      }
      else if (cHQ == k)
      {
        this.field_wifiEndFlag = paramCursor.getInt(i);
      }
      else if (clj == k)
      {
        this.field_updateTime = paramCursor.getLong(i);
      }
      else if (cHR == k)
      {
        this.field_songId = paramCursor.getInt(i);
      }
      else if (cHS == k)
      {
        this.field_songName = paramCursor.getString(i);
      }
      else if (cHT == k)
      {
        this.field_songSinger = paramCursor.getString(i);
      }
      else if (cHU == k)
      {
        this.field_songAlbum = paramCursor.getString(i);
      }
      else if (cHV == k)
      {
        this.field_songAlbumType = paramCursor.getInt(i);
      }
      else if (cHW == k)
      {
        this.field_songAlbumUrl = paramCursor.getString(i);
      }
      else if (cHX == k)
      {
        this.field_songHAlbumUrl = paramCursor.getString(i);
      }
      else if (cHY == k)
      {
        this.field_songAlbumLocalPath = paramCursor.getString(i);
      }
      else if (cHZ == k)
      {
        this.field_songWifiUrl = paramCursor.getString(i);
      }
      else if (cIa == k)
      {
        this.field_songWapLinkUrl = paramCursor.getString(i);
      }
      else if (cIb == k)
      {
        this.field_songWebUrl = paramCursor.getString(i);
      }
      else if (ckP == k)
      {
        this.field_appId = paramCursor.getString(i);
      }
      else if (cIc == k)
      {
        this.field_songMediaId = paramCursor.getString(i);
      }
      else if (cId == k)
      {
        this.field_songSnsAlbumUser = paramCursor.getString(i);
      }
      else if (cIe == k)
      {
        this.field_songSnsShareUser = paramCursor.getString(i);
      }
      else if (cIf == k)
      {
        this.field_songLyric = paramCursor.getString(i);
      }
      else if (cIg == k)
      {
        this.field_songBgColor = paramCursor.getInt(i);
      }
      else if (cIh == k)
      {
        this.field_songLyricColor = paramCursor.getInt(i);
      }
      else if (cIi == k)
      {
        this.field_songFileLength = paramCursor.getLong(i);
      }
      else if (cIj == k)
      {
        this.field_songWifiFileLength = paramCursor.getLong(i);
      }
      else
      {
        boolean bool;
        if (cIk == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_hideBanner = bool;
            break;
          }
        }
        if (cIl == k)
        {
          this.field_jsWebUrlDomain = paramCursor.getString(i);
        }
        else if (cIm == k)
        {
          this.field_isBlock = paramCursor.getInt(i);
        }
        else if (cjj == k)
        {
          this.field_startTime = paramCursor.getInt(i);
        }
        else if (cIn == k)
        {
          this.field_mimetype = paramCursor.getString(i);
        }
        else if (cIo == k)
        {
          this.field_protocol = paramCursor.getString(i);
        }
        else
        {
          if (cIp == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_barBackToWebView = bool;
              break;
            }
          }
          if (cIq == k) {
            this.field_musicbar_url = paramCursor.getString(i);
          } else if (ciP == k) {
            this.sKx = paramCursor.getLong(i);
          }
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cHd) {
      localContentValues.put("musicId", this.field_musicId);
    }
    if (this.cHe) {
      localContentValues.put("originMusicId", this.field_originMusicId);
    }
    if (this.cHf) {
      localContentValues.put("musicType", Integer.valueOf(this.field_musicType));
    }
    if (this.cHg) {
      localContentValues.put("downloadedLength", Long.valueOf(this.field_downloadedLength));
    }
    if (this.cHh) {
      localContentValues.put("wifiDownloadedLength", Long.valueOf(this.field_wifiDownloadedLength));
    }
    if (this.cHi) {
      localContentValues.put("endFlag", Integer.valueOf(this.field_endFlag));
    }
    if (this.cHj) {
      localContentValues.put("wifiEndFlag", Integer.valueOf(this.field_wifiEndFlag));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.cHk) {
      localContentValues.put("songId", Integer.valueOf(this.field_songId));
    }
    if (this.cHl) {
      localContentValues.put("songName", this.field_songName);
    }
    if (this.cHm) {
      localContentValues.put("songSinger", this.field_songSinger);
    }
    if (this.cHn) {
      localContentValues.put("songAlbum", this.field_songAlbum);
    }
    if (this.cHo) {
      localContentValues.put("songAlbumType", Integer.valueOf(this.field_songAlbumType));
    }
    if (this.cHp) {
      localContentValues.put("songAlbumUrl", this.field_songAlbumUrl);
    }
    if (this.cHq) {
      localContentValues.put("songHAlbumUrl", this.field_songHAlbumUrl);
    }
    if (this.cHr) {
      localContentValues.put("songAlbumLocalPath", this.field_songAlbumLocalPath);
    }
    if (this.cHs) {
      localContentValues.put("songWifiUrl", this.field_songWifiUrl);
    }
    if (this.cHt) {
      localContentValues.put("songWapLinkUrl", this.field_songWapLinkUrl);
    }
    if (this.cHu) {
      localContentValues.put("songWebUrl", this.field_songWebUrl);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cHv) {
      localContentValues.put("songMediaId", this.field_songMediaId);
    }
    if (this.cHw) {
      localContentValues.put("songSnsAlbumUser", this.field_songSnsAlbumUser);
    }
    if (this.cHx) {
      localContentValues.put("songSnsShareUser", this.field_songSnsShareUser);
    }
    if (this.cHy) {
      localContentValues.put("songLyric", this.field_songLyric);
    }
    if (this.cHz) {
      localContentValues.put("songBgColor", Integer.valueOf(this.field_songBgColor));
    }
    if (this.cHA) {
      localContentValues.put("songLyricColor", Integer.valueOf(this.field_songLyricColor));
    }
    if (this.cHB) {
      localContentValues.put("songFileLength", Long.valueOf(this.field_songFileLength));
    }
    if (this.cHC) {
      localContentValues.put("songWifiFileLength", Long.valueOf(this.field_songWifiFileLength));
    }
    if (this.cHD) {
      localContentValues.put("hideBanner", Boolean.valueOf(this.field_hideBanner));
    }
    if (this.cHE) {
      localContentValues.put("jsWebUrlDomain", this.field_jsWebUrlDomain);
    }
    if (this.cHF) {
      localContentValues.put("isBlock", Integer.valueOf(this.field_isBlock));
    }
    if (this.cjb) {
      localContentValues.put("startTime", Integer.valueOf(this.field_startTime));
    }
    if (this.cHG) {
      localContentValues.put("mimetype", this.field_mimetype);
    }
    if (this.cHH) {
      localContentValues.put("protocol", this.field_protocol);
    }
    if (this.cHI) {
      localContentValues.put("barBackToWebView", Boolean.valueOf(this.field_barBackToWebView));
    }
    if (this.cHJ) {
      localContentValues.put("musicbar_url", this.field_musicbar_url);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
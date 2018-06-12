package com.tencent.mm.plugin.music.model.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.a.f;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.music.b.e;
import com.tencent.mm.plugin.music.model.a.a;
import com.tencent.mm.plugin.music.model.g;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  extends i<com.tencent.mm.an.a>
{
  public e diF;
  public f<String, com.tencent.mm.an.a> lzX;
  public f<String, com.tencent.mm.plugin.music.model.a> lzY;
  
  public a(e parame)
  {
    super(parame, com.tencent.mm.an.a.dhO, "Music", null);
    this.diF = parame;
    this.lzX = new f(20);
    this.lzY = new f(10);
  }
  
  public final com.tencent.mm.an.a IC(String paramString)
  {
    if (this.lzX.get(paramString) != null) {
      return (com.tencent.mm.an.a)this.lzX.get(paramString);
    }
    Object localObject = String.format("Select * From Music Where musicId=?", new Object[0]);
    localObject = this.diF.b((String)localObject, new String[] { paramString }, 2);
    if ((localObject != null) && (((Cursor)localObject).moveToFirst()))
    {
      com.tencent.mm.an.a locala = new com.tencent.mm.an.a();
      locala.d((Cursor)localObject);
      ((Cursor)localObject).close();
      this.lzX.put(paramString, locala);
      return locala;
    }
    if (localObject != null) {
      ((Cursor)localObject).close();
    }
    return null;
  }
  
  public final com.tencent.mm.an.a Z(String paramString, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.Music.MusicStorage", "updateMusicWithColor %s %d %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    com.tencent.mm.an.a locala = IC(paramString);
    if (locala == null)
    {
      x.e("MicroMsg.Music.MusicStorage", "updateMusicWithColor can not find music %s", new Object[] { paramString });
      return null;
    }
    locala.field_songBgColor = paramInt1;
    locala.field_songLyricColor = paramInt2;
    c(locala, new String[] { "songBgColor", "songLyricColor" });
    this.lzX.put(paramString, locala);
    return locala;
  }
  
  public final void aa(String paramString, long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("wifiDownloadedLength", Long.valueOf(paramLong));
    x.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiDownloadedLength=%d", new Object[] { Integer.valueOf(this.diF.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.an.a)this.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_wifiDownloadedLength = paramLong;
    }
  }
  
  public final void ab(String paramString, long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("songWifiFileLength", Long.valueOf(paramLong));
    x.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songWifiFileLength=%d", new Object[] { Integer.valueOf(this.diF.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.an.a)this.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_songWifiFileLength = paramLong;
    }
  }
  
  public final void ac(String paramString, long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("downloadedLength", Long.valueOf(paramLong));
    x.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s downloadedLength=%d", new Object[] { Integer.valueOf(this.diF.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.an.a)this.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_downloadedLength = paramLong;
    }
  }
  
  public final void ad(String paramString, long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("songFileLength", Long.valueOf(paramLong));
    x.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songFileLength=%d", new Object[] { Integer.valueOf(this.diF.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.an.a)this.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_songFileLength = paramLong;
    }
  }
  
  public final void bN(String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("wifiEndFlag", Integer.valueOf(paramInt));
    x.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiEndFlag=%d", new Object[] { Integer.valueOf(this.diF.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Integer.valueOf(paramInt) });
    paramString = (com.tencent.mm.an.a)this.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_wifiEndFlag = paramInt;
    }
  }
  
  public final void bO(String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("endFlag", Integer.valueOf(paramInt));
    x.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s endFlag=%d", new Object[] { Integer.valueOf(this.diF.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Integer.valueOf(paramInt) });
    paramString = (com.tencent.mm.an.a)this.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_endFlag = paramInt;
    }
  }
  
  public final com.tencent.mm.plugin.music.model.a e(com.tencent.mm.an.a parama, boolean paramBoolean)
  {
    String str2 = parama.field_songLyric;
    String str1 = ad.getContext().getString(b.e.music_prefix);
    String str3 = parama.field_songSnsShareUser;
    boolean bool = g.f(parama);
    Object localObject1 = parama.field_songSinger;
    com.tencent.mm.plugin.music.model.a locala = new com.tencent.mm.plugin.music.model.a();
    long l = bi.VG();
    if (!bi.oW(str2)) {
      if (str2 == null)
      {
        x.w("MicroMsg.Music.LyricObj", "parserLrc: but lrc or lrcMgr is null");
        x.d("MicroMsg.Music.LyricObj", "getLrcMgr beg: src lrc = %s", new Object[] { str2 });
        x.d("MicroMsg.Music.LyricObj", "parse finish: sentence size [%d], result:", new Object[] { Integer.valueOf(locala.lxL.size()) });
        label110:
        if (!bi.oW(str3)) {
          break label1040;
        }
        x.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
        label126:
        if (!bi.oW(str2))
        {
          if (!bi.oW(str1)) {
            break label1200;
          }
          x.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
        }
      }
    }
    for (;;)
    {
      x.d("MicroMsg.Music.LyricObj", "getLrcMgr finish: use %d ms", new Object[] { Long.valueOf(bi.bI(l)) });
      this.lzY.put(parama.field_musicId, locala);
      return locala;
      localObject1 = str2.replaceAll("\n", " ").replaceAll("\r", " ");
      Matcher localMatcher1 = Pattern.compile("(\\[((\\d{2}:\\d{2}(\\.\\d{2}){0,1}\\])|(al:|ar:|by:|offset:|re:|ti:|ve:))[^\\[]*)").matcher((CharSequence)localObject1);
      while (localMatcher1.find())
      {
        String str4 = localMatcher1.group();
        localMatcher1.start();
        localMatcher1.end();
        if (str4 == null)
        {
          x.w("MicroMsg.Music.LyricObj", "parserLine fail: lrcMgr or str is null");
        }
        else if (str4.startsWith("[ti:"))
        {
          locala.title = com.tencent.mm.plugin.music.model.a.dT(str4, "[ti:");
        }
        else if (str4.startsWith("[ar:"))
        {
          locala.fHZ = com.tencent.mm.plugin.music.model.a.dT(str4, "[ar:");
        }
        else if (str4.startsWith("[al:"))
        {
          locala.album = com.tencent.mm.plugin.music.model.a.dT(str4, "[al:");
        }
        else if (str4.startsWith("[by:"))
        {
          locala.lxN = com.tencent.mm.plugin.music.model.a.dT(str4, "[by:");
        }
        else if (str4.startsWith("[offset:"))
        {
          locala.mb = bi.getLong(com.tencent.mm.plugin.music.model.a.dT(str4, "[offset:"), 0L);
        }
        else if (str4.startsWith("[re:"))
        {
          locala.lxO = com.tencent.mm.plugin.music.model.a.dT(str4, "[re:");
        }
        else if (str4.startsWith("[ve:"))
        {
          locala.lxP = com.tencent.mm.plugin.music.model.a.dT(str4, "[ve:");
        }
        else
        {
          Pattern localPattern = Pattern.compile("\\[(\\d{2}:\\d{2}(\\.\\d{2}){0,1})\\]");
          Matcher localMatcher2 = localPattern.matcher(str4);
          a.a locala1 = new a.a();
          label487:
          if (localMatcher2.find())
          {
            if (localMatcher2.groupCount() > 0) {
              locala1.timestamp = com.tencent.mm.plugin.music.model.a.Ir(localMatcher2.group(1));
            }
            localObject1 = localPattern.split(str4);
            if ((localObject1 != null) && (localObject1.length > 0))
            {
              localObject2 = localObject1[(localObject1.length - 1)];
              localObject1 = localObject2;
              if (localObject2 != null) {
                localObject1 = ((String)localObject2).trim();
              }
              localObject2 = localObject1;
              if (bi.oW((String)localObject1)) {
                localObject2 = " ";
              }
              locala1.content = ((String)localObject2);
              i = 0;
            }
            for (;;)
            {
              if (i < locala.lxM.size())
              {
                localObject1 = new a.a();
                ((a.a)localObject1).timestamp = ((Long)locala.lxM.get(i)).longValue();
                ((a.a)localObject1).content = locala1.content;
                ((a.a)localObject1).lxR = true;
                i += 1;
                continue;
                locala.lxM.add(Long.valueOf(locala1.timestamp));
                break;
              }
            }
            locala.lxM.clear();
            i = locala.lxL.size() - 1;
          }
          for (;;)
          {
            if ((i >= 0) && (((a.a)locala.lxL.get(i)).timestamp != locala1.timestamp))
            {
              if (((a.a)locala.lxL.get(i)).timestamp < locala1.timestamp) {
                locala.lxL.add(i + 1, locala1);
              }
            }
            else
            {
              if (i >= 0) {
                break label487;
              }
              locala.lxL.add(0, locala1);
              break label487;
              break;
            }
            i -= 1;
          }
        }
      }
      x.d("MicroMsg.Music.LyricObj", "handle offset %d", new Object[] { Long.valueOf(locala.mb) });
      if (locala.mb != 0L)
      {
        i = 0;
        while (i < locala.lxL.size())
        {
          localObject1 = (a.a)locala.lxL.get(i);
          ((a.a)localObject1).timestamp += locala.mb;
          i += 1;
        }
        locala.mb = 0L;
      }
      int i = 0;
      while (i < locala.lxL.size() - 1)
      {
        localObject1 = (a.a)locala.lxL.get(i);
        if ((((a.a)localObject1).lxR) && (((a.a)localObject1).content.equals(((a.a)locala.lxL.get(i + 1)).content))) {
          ((a.a)localObject1).content = " ";
        }
        i += 1;
      }
      break;
      Object localObject2 = new a.a();
      ((a.a)localObject2).timestamp = 0L;
      if (paramBoolean) {
        ((a.a)localObject2).content = ((String)localObject1);
      }
      for (;;)
      {
        if (((a.a)localObject2).content == null) {
          break label1038;
        }
        locala.lxL.add(localObject2);
        break;
        if (!bool) {
          ((a.a)localObject2).content = ad.getContext().getString(b.e.no_licence_lyric_wording);
        } else {
          ((a.a)localObject2).content = ad.getContext().getString(b.e.no_lyric_wording);
        }
      }
      label1038:
      break label110;
      label1040:
      localObject1 = new a.a();
      ((a.a)localObject1).timestamp = 0L;
      ((a.a)localObject1).content = ad.getContext().getString(b.e.user_share_music, new Object[] { r.gT(str3) });
      if (locala.lxL.isEmpty())
      {
        locala.lxL.add(localObject1);
        break label126;
      }
      if (locala.lxL.size() == 1)
      {
        locala.lxL.add(0, localObject1);
        ((a.a)locala.lxL.get(1)).timestamp = 5000L;
        break label126;
      }
      locala.lxL.add(0, localObject1);
      ((a.a)locala.lxL.get(1)).timestamp = (3L * (((a.a)locala.lxL.get(2)).timestamp >> 2));
      break label126;
      label1200:
      localObject1 = new a.a();
      ((a.a)localObject1).timestamp = 0L;
      ((a.a)localObject1).content = str1;
      if (locala.lxL.isEmpty())
      {
        locala.lxL.add(localObject1);
      }
      else if (locala.lxL.size() == 1)
      {
        locala.lxL.add(0, localObject1);
        ((a.a)locala.lxL.get(1)).timestamp = 5000L;
      }
      else
      {
        locala.lxL.add(0, localObject1);
        ((a.a)locala.lxL.get(1)).timestamp = (3L * (((a.a)locala.lxL.get(2)).timestamp >> 2));
      }
    }
  }
  
  public final com.tencent.mm.an.a w(avq paramavq)
  {
    String str = com.tencent.mm.plugin.music.d.a.x(paramavq);
    com.tencent.mm.an.a locala = IC(str);
    if (locala == null) {
      locala = new com.tencent.mm.an.a();
    }
    for (int i = 0;; i = 1)
    {
      locala.field_musicId = str;
      locala.field_originMusicId = paramavq.rsp;
      locala.field_musicType = paramavq.rYj;
      locala.field_appId = paramavq.jQb;
      if (bi.oW(locala.field_appId)) {
        locala.field_appId = g.j(paramavq);
      }
      locala.field_songAlbum = paramavq.rYn;
      locala.field_songAlbumType = paramavq.rYv;
      locala.field_songWifiUrl = paramavq.rYp;
      locala.field_songName = paramavq.rYl;
      locala.field_songSinger = paramavq.rYm;
      locala.field_songWapLinkUrl = paramavq.rYq;
      locala.field_songWebUrl = paramavq.rYr;
      locala.field_songAlbumLocalPath = paramavq.rYt;
      locala.field_songMediaId = paramavq.rvP;
      locala.field_songSnsAlbumUser = paramavq.rYz;
      locala.field_songAlbumUrl = paramavq.rYo;
      locala.field_songSnsShareUser = paramavq.rYA;
      if (!bi.oW(paramavq.rYw)) {
        locala.field_songHAlbumUrl = paramavq.rYw;
      }
      locala.field_updateTime = System.currentTimeMillis();
      if (locala.field_songId == 0)
      {
        g.h(paramavq);
        locala.field_songId = paramavq.rKe;
      }
      if (((bi.oW(locala.field_songWapLinkUrl)) || (locala.field_songWapLinkUrl.equals(locala.field_songWebUrl))) && (!bi.oW(locala.field_songWifiUrl))) {
        locala.field_songWapLinkUrl = locala.field_songWifiUrl;
      }
      if ((locala.field_songId == 0) && (paramavq.rYj == 4)) {}
      try
      {
        locala.field_songId = Integer.valueOf(paramavq.rsp).intValue();
        locala.field_hideBanner = paramavq.rYC;
        locala.field_jsWebUrlDomain = paramavq.rYD;
        locala.field_startTime = paramavq.dGs;
        locala.eaZ = paramavq.eaZ;
        locala.field_protocol = paramavq.protocol;
        locala.field_barBackToWebView = paramavq.rYE;
        locala.field_musicbar_url = paramavq.rYF;
        if (i != 0)
        {
          x.i("MicroMsg.Music.MusicStorage", "update music %s", new Object[] { str });
          c(locala, new String[0]);
        }
        for (;;)
        {
          this.lzX.put(str, locala);
          return locala;
          x.i("MicroMsg.Music.MusicStorage", "insert music %s", new Object[] { str });
          b(locala);
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/model/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
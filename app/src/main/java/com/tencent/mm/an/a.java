package com.tencent.mm.an;

import com.tencent.mm.g.c.cp;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
  extends cp
{
  public static c.a dhO = ;
  public String eaZ;
  public String playUrl;
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final boolean PT()
  {
    return (this.field_songBgColor != 0) && (this.field_songLyricColor != 0);
  }
  
  public final boolean PU()
  {
    return !bi.oW(this.field_songHAlbumUrl);
  }
  
  public final avq PV()
  {
    avq localavq = new avq();
    localavq.rsp = this.field_originMusicId;
    localavq.rYj = this.field_musicType;
    localavq.jQb = this.field_appId;
    localavq.rYn = this.field_songAlbum;
    localavq.rYv = this.field_songAlbumType;
    localavq.rYo = this.field_songAlbumUrl;
    localavq.rYp = this.field_songWifiUrl;
    localavq.rYl = this.field_songName;
    localavq.rYm = this.field_songSinger;
    localavq.rYq = this.field_songWapLinkUrl;
    localavq.rYr = this.field_songWebUrl;
    localavq.rYt = this.field_songAlbumLocalPath;
    localavq.rvP = this.field_songMediaId;
    localavq.rYz = this.field_songSnsAlbumUser;
    localavq.rYA = this.field_songSnsShareUser;
    localavq.rYC = this.field_hideBanner;
    localavq.rYD = this.field_jsWebUrlDomain;
    localavq.dGs = this.field_startTime;
    localavq.eaZ = this.eaZ;
    localavq.protocol = this.field_protocol;
    localavq.rYE = this.field_barBackToWebView;
    localavq.rYF = this.field_musicbar_url;
    return localavq;
  }
  
  public final boolean a(a parama)
  {
    if (parama == null) {
      return false;
    }
    return this.field_musicId.equals(parama.field_musicId);
  }
  
  public final boolean f(int[] paramArrayOfInt)
  {
    return (this.field_songBgColor == paramArrayOfInt[0]) && (this.field_songLyricColor == paramArrayOfInt[1]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/an/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.fav.a.a;

import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class a
{
  public static String bc(List<vx> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      x.v("MicroMsg.FavDataItemParser", "klem toXml data list empty");
      return "";
    }
    int j = paramList.size();
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<datalist count='").append(j).append("'>");
    int i = 0;
    if (i < j)
    {
      Object localObject1 = (vx)paramList.get(i);
      localStringBuffer.append("<dataitem ");
      if (((vx)localObject1).rzC) {
        localStringBuffer.append("datatype='").append(((vx)localObject1).bjS).append("'");
      }
      if (((vx)localObject1).rAf) {
        localStringBuffer.append(" datastatus='").append(((vx)localObject1).rAe).append("'");
      }
      if (((vx)localObject1).rzL) {
        localStringBuffer.append(" dataid='").append(((vx)localObject1).jdM).append("'");
      }
      if (((vx)localObject1).rAr) {
        localStringBuffer.append(" htmlid='").append(bi.WS(((vx)localObject1).rAq)).append("'");
      }
      if (((vx)localObject1).rAx) {
        localStringBuffer.append(" dataillegaltype='").append(((vx)localObject1).rAw).append("'");
      }
      if (((vx)localObject1).rzX) {
        localStringBuffer.append(" datasourceid='").append(((vx)localObject1).rzW).append("'");
      }
      localStringBuffer.append(">");
      if (((vx)localObject1).rzE) {
        localStringBuffer.append("<datafmt>").append(((vx)localObject1).rzD).append("</datafmt>");
      }
      if (((vx)localObject1).rzh) {
        localStringBuffer.append("<datatitle>").append(bi.WS(((vx)localObject1).title)).append("</datatitle>");
      }
      if (((vx)localObject1).rzi) {
        localStringBuffer.append("<datadesc>").append(bi.WS(((vx)localObject1).desc)).append("</datadesc>");
      }
      if (((vx)localObject1).rzj) {
        localStringBuffer.append("<cdn_thumburl>").append(bi.WS(((vx)localObject1).dwE)).append("</cdn_thumburl>");
      }
      if (((vx)localObject1).rzm) {
        localStringBuffer.append("<thumb_width>").append(((vx)localObject1).dwJ).append("</thumb_width>");
      }
      if (((vx)localObject1).rzn) {
        localStringBuffer.append("<thumb_height>").append(((vx)localObject1).dwI).append("</thumb_height>");
      }
      if (((vx)localObject1).rzp) {
        localStringBuffer.append("<cdn_dataurl>").append(bi.WS(((vx)localObject1).rzo)).append("</cdn_dataurl>");
      }
      if (((vx)localObject1).rzl) {
        localStringBuffer.append("<cdn_thumbkey>").append(bi.WS(((vx)localObject1).rzk)).append("</cdn_thumbkey>");
      }
      if (((vx)localObject1).rzr) {
        localStringBuffer.append("<cdn_datakey>").append(bi.WS(((vx)localObject1).rzq)).append("</cdn_datakey>");
      }
      if (((vx)localObject1).rzt) {
        localStringBuffer.append("<cdn_encryver>").append(((vx)localObject1).rzs).append("</cdn_encryver>");
      }
      if (((vx)localObject1).rzu) {
        localStringBuffer.append("<duration>").append(((vx)localObject1).duration).append("</duration>");
      }
      if (((vx)localObject1).rzw) {
        localStringBuffer.append("<stream_weburl>").append(bi.WS(((vx)localObject1).rzv)).append("</stream_weburl>");
      }
      if (((vx)localObject1).rzy) {
        localStringBuffer.append("<stream_dataurl>").append(bi.WS(((vx)localObject1).rzx)).append("</stream_dataurl>");
      }
      if (((vx)localObject1).rzA) {
        localStringBuffer.append("<stream_lowbandurl>").append(bi.WS(((vx)localObject1).rzz)).append("</stream_lowbandurl>");
      }
      if (((vx)localObject1).rzB) {
        localStringBuffer.append("<dataext>").append(bi.WS(((vx)localObject1).bJv)).append("</dataext>");
      }
      if (((vx)localObject1).rzG) {
        localStringBuffer.append("<fullmd5>").append(((vx)localObject1).rzF).append("</fullmd5>");
      }
      if (((vx)localObject1).rzI) {
        localStringBuffer.append("<head256md5>").append(((vx)localObject1).rzH).append("</head256md5>");
      }
      if (((vx)localObject1).rzK) {
        localStringBuffer.append("<fullsize>").append(((vx)localObject1).rzJ).append("</fullsize>");
      }
      if (((vx)localObject1).rzR) {
        localStringBuffer.append("<thumbfullmd5>").append(((vx)localObject1).rzQ).append("</thumbfullmd5>");
      }
      if (((vx)localObject1).rzT) {
        localStringBuffer.append("<thumbhead256md5>").append(((vx)localObject1).rzS).append("</thumbhead256md5>");
      }
      if (((vx)localObject1).rzV) {
        localStringBuffer.append("<thumbfullsize>").append(((vx)localObject1).rzU).append("</thumbfullsize>");
      }
      if (((vx)localObject1).rzZ) {
        localStringBuffer.append("<stream_videoid>").append(bi.WS(((vx)localObject1).rzY)).append("</stream_videoid>");
      }
      if (((vx)localObject1).rAh) {
        localStringBuffer.append("<datasrctitle>").append(bi.WS(((vx)localObject1).rAg)).append("</datasrctitle>");
      }
      if (((vx)localObject1).rAl) {
        localStringBuffer.append("<datasrcname>").append(bi.WS(((vx)localObject1).rAk)).append("</datasrcname>");
      }
      if (((vx)localObject1).rAn) {
        localStringBuffer.append("<datasrctime>").append(bi.WS(((vx)localObject1).rAm)).append("</datasrctime>");
      }
      if ((((vx)localObject1).rAt) && ((((vx)localObject1).rAi == null) || (((vx)localObject1).rAi.rAN == null) || (((vx)localObject1).rAi.rAN.boi() == 0))) {
        localStringBuffer.append("<canvasPageXml>").append(bi.WS(((vx)localObject1).canvasPageXml)).append("</canvasPageXml>");
      }
      if (((vx)localObject1).rAs) {
        localStringBuffer.append("<statextstr>").append(bi.WS(((vx)localObject1).bZN)).append("</statextstr>");
      }
      if (((vx)localObject1).rAz) {
        localStringBuffer.append("<recordxml>").append(((vx)localObject1).rAy).append("</recordxml>");
      }
      Object localObject2 = ((vx)localObject1).rAo;
      if (localObject2 != null)
      {
        localStringBuffer.append("<streamvideo>");
        localStringBuffer.append("<streamvideourl>").append(bi.WS(((wa)localObject2).dyJ)).append("</streamvideourl>");
        localStringBuffer.append("<streamvideototaltime>").append(((wa)localObject2).rBq).append("</streamvideototaltime>");
        localStringBuffer.append("<streamvideotitle>").append(bi.WS(((wa)localObject2).dyL)).append("</streamvideotitle>");
        localStringBuffer.append("<streamvideowording>").append(bi.WS(((wa)localObject2).dyM)).append("</streamvideowording>");
        localStringBuffer.append("<streamvideoweburl>").append(bi.WS(((wa)localObject2).dyN)).append("</streamvideoweburl>");
        localStringBuffer.append("<streamvideoaduxinfo>").append(bi.WS(((wa)localObject2).dyP)).append("</streamvideoaduxinfo>");
        localStringBuffer.append("<streamvideopublishid>").append(bi.WS(((wa)localObject2).dyQ)).append("</streamvideopublishid>");
        localStringBuffer.append("</streamvideo>");
      }
      localObject2 = ((vx)localObject1).rAi;
      if ((localObject2 == null) || (((vy)localObject2).rAJ == null) || (((vy)localObject2).rAJ.boi() == 0))
      {
        x.v("MicroMsg.FavDataItemParser", "klem toXml, data source item empty");
        label1389:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAL != null) && (((vy)localObject2).rAL.boi() != 0)) {
          break label1934;
        }
        x.v("MicroMsg.FavDataItemParser", "klem toXml, loc item empty");
        label1428:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAN != null) && (((vy)localObject2).rAN.boi() != 0)) {
          break label2113;
        }
        x.v("MicroMsg.FavDataItemParser", "klem toXml, url item empty");
        label1467:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAP != null) && (((vy)localObject2).rAP.boi() != 0)) {
          break label2364;
        }
        x.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
        label1506:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAR != null) && (((vy)localObject2).rAR.boi() != 0)) {
          break label2558;
        }
        x.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
        label1545:
        localObject1 = ((vx)localObject1).rAi;
        if ((localObject1 != null) && (((vy)localObject1).rBa != null)) {
          break label2716;
        }
        x.e("MicroMsg.FavDataItemParser", "setAppBrandXml toXml, item empty");
      }
      for (;;)
      {
        localStringBuffer.append("</dataitem>");
        i += 1;
        break;
        localObject2 = ((vy)localObject2).rAJ;
        localStringBuffer.append("<dataitemsource");
        if (((vz)localObject2).rBc) {
          localStringBuffer.append(" sourcetype='").append(((vz)localObject2).bJt).append("'");
        }
        if (((vz)localObject2).rBg) {
          localStringBuffer.append(" sourceid='").append(((vz)localObject2).rBf).append("'");
        }
        localStringBuffer.append(">");
        if (((vz)localObject2).rBd) {
          localStringBuffer.append("<fromusr>").append(bi.WS(((vz)localObject2).bSS)).append("</fromusr>");
        }
        if (((vz)localObject2).rBe) {
          localStringBuffer.append("<tousr>").append(bi.WS(((vz)localObject2).toUser)).append("</tousr>");
        }
        if (((vz)localObject2).rBi) {
          localStringBuffer.append("<realchatname>").append(bi.WS(((vz)localObject2).rBh)).append("</realchatname>");
        }
        if (((vz)localObject2).rBj) {
          localStringBuffer.append("<msgid>").append(((vz)localObject2).bWQ).append("</msgid>");
        }
        if (((vz)localObject2).rBk) {
          localStringBuffer.append("<eventid>").append(((vz)localObject2).cca).append("</eventid>");
        }
        if (((vz)localObject2).rBl) {
          localStringBuffer.append("<appid>").append(((vz)localObject2).appId).append("</appid>");
        }
        if (((vz)localObject2).rBm) {
          localStringBuffer.append("<link>").append(bi.WS(((vz)localObject2).egr)).append("</link>");
        }
        if (((vz)localObject2).rBp) {
          localStringBuffer.append("<brandid>").append(bi.WS(((vz)localObject2).bGy)).append("</brandid>");
        }
        localStringBuffer.append("</dataitemsource>");
        break label1389;
        label1934:
        localObject2 = ((vy)localObject2).rAL;
        localStringBuffer.append("<locitem>");
        if (((we)localObject2).rBx) {
          localStringBuffer.append("<label>").append(bi.WS(((we)localObject2).label)).append("</label>");
        }
        if (((we)localObject2).rBv) {
          localStringBuffer.append("<lat>").append(((we)localObject2).lat).append("</lat>");
        }
        if (((we)localObject2).rBu) {
          localStringBuffer.append("<lng>").append(((we)localObject2).lng).append("</lng>");
        }
        if (((we)localObject2).rBw) {
          localStringBuffer.append("<scale>").append(((we)localObject2).bSz).append("</scale>");
        }
        if (((we)localObject2).rBy) {
          localStringBuffer.append("<poiname>").append(((we)localObject2).bWB).append("</poiname>");
        }
        localStringBuffer.append("</locitem>");
        break label1428;
        label2113:
        localObject2 = ((vy)localObject2).rAN;
        localStringBuffer.append("<weburlitem>");
        if (((xa)localObject2).rCo) {
          localStringBuffer.append("<clean_url>").append(bi.WS(((xa)localObject2).rCn)).append("</clean_url>");
        }
        if (((xa)localObject2).rzi) {
          localStringBuffer.append("<pagedesc>").append(bi.WS(((xa)localObject2).desc)).append("</pagedesc>");
        }
        if (((xa)localObject2).rBD) {
          localStringBuffer.append("<pagethumb_url>").append(bi.WS(((xa)localObject2).thumbUrl)).append("</pagethumb_url>");
        }
        if (((xa)localObject2).rzh) {
          localStringBuffer.append("<pagetitle>").append(bi.WS(((xa)localObject2).title)).append("</pagetitle>");
        }
        if (((xa)localObject2).rCq) {
          localStringBuffer.append("<opencache>").append(((xa)localObject2).rCp).append("</opencache>");
        }
        if (((xa)localObject2).rCr) {
          localStringBuffer.append("<contentattr>").append(((xa)localObject2).dwt).append("</contentattr>");
        }
        if (((xa)localObject2).rAt) {
          localStringBuffer.append("<canvasPageXml>").append(bi.WS(((xa)localObject2).canvasPageXml)).append("</canvasPageXml>");
        }
        localStringBuffer.append("</weburlitem>");
        break label1467;
        label2364:
        localObject2 = ((vy)localObject2).rAP;
        localStringBuffer.append("<productitem");
        if (((wk)localObject2).rBF) {
          localStringBuffer.append(" type='").append(((wk)localObject2).type).append("'");
        }
        localStringBuffer.append(">");
        if (((wk)localObject2).rzh) {
          localStringBuffer.append("<producttitle>").append(bi.WS(((wk)localObject2).title)).append("</producttitle>");
        }
        if (((wk)localObject2).rzi) {
          localStringBuffer.append("<productdesc>").append(bi.WS(((wk)localObject2).desc)).append("</productdesc>");
        }
        if (((wk)localObject2).rBD) {
          localStringBuffer.append("<productthumb_url>").append(bi.WS(((wk)localObject2).thumbUrl)).append("</productthumb_url>");
        }
        if (((wk)localObject2).rBE) {
          localStringBuffer.append("<productinfo>").append(bi.WS(((wk)localObject2).info)).append("</productinfo>");
        }
        localStringBuffer.append("</productitem>");
        break label1506;
        label2558:
        localObject2 = ((vy)localObject2).rAR;
        localStringBuffer.append("<tvitem>");
        if (((wu)localObject2).rzh) {
          localStringBuffer.append("<tvtitle>").append(bi.WS(((wu)localObject2).title)).append("</tvtitle>");
        }
        if (((wu)localObject2).rzi) {
          localStringBuffer.append("<tvdesc>").append(bi.WS(((wu)localObject2).desc)).append("</tvdesc>");
        }
        if (((wu)localObject2).rBD) {
          localStringBuffer.append("<tvthumb_url>").append(bi.WS(((wu)localObject2).thumbUrl)).append("</tvthumb_url>");
        }
        if (((wu)localObject2).rBE) {
          localStringBuffer.append("<tvinfo>").append(bi.WS(((wu)localObject2).info)).append("</tvinfo>");
        }
        localStringBuffer.append("</tvitem>");
        break label1545;
        label2716:
        localObject1 = ((vy)localObject1).rBa;
        if (localObject1 != null)
        {
          localStringBuffer.append("<appbranditem>");
          localStringBuffer.append("<username>").append(bi.WS(((vv)localObject1).username)).append("</username>");
          localStringBuffer.append("<appid>").append(bi.WS(((vv)localObject1).appId)).append("</appid>");
          localStringBuffer.append("<pkgtype>").append(((vv)localObject1).bPh).append("</pkgtype>");
          localStringBuffer.append("<iconurl>").append(bi.WS(((vv)localObject1).iconUrl)).append("</iconurl>");
          localStringBuffer.append("<type>").append(((vv)localObject1).type).append("</type>");
          localStringBuffer.append("<pagepath>").append(bi.WS(((vv)localObject1).bGH)).append("</pagepath>");
          localStringBuffer.append("<sourcedisplayname>").append(bi.WS(((vv)localObject1).rzd)).append("</sourcedisplayname>");
          localStringBuffer.append("</appbranditem>");
        }
      }
    }
    localStringBuffer.append("</datalist>");
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
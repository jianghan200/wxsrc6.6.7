package com.tencent.mm.plugin.record.b;

import com.tencent.mm.ac.a.e;
import com.tencent.mm.model.s;
import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class i
{
  public static String bc(List<vx> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      x.w("MicroMsg.RecordMsgParser", "klem toXml data list empty");
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
        localStringBuffer.append(" htmlid='").append(((vx)localObject1).rAq).append("'");
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
        localStringBuffer.append("<cdnthumburl>").append(bi.WS(((vx)localObject1).dwE)).append("</cdnthumburl>");
      }
      if (((vx)localObject1).rzm) {
        localStringBuffer.append("<thumbwidth>").append(((vx)localObject1).dwJ).append("</thumbwidth>");
      }
      if (((vx)localObject1).rzn) {
        localStringBuffer.append("<thumbheight>").append(((vx)localObject1).dwI).append("</thumbheight>");
      }
      if (((vx)localObject1).rzp) {
        localStringBuffer.append("<cdndataurl>").append(bi.WS(((vx)localObject1).rzo)).append("</cdndataurl>");
      }
      if (((vx)localObject1).rzl) {
        localStringBuffer.append("<cdnthumbkey>").append(bi.WS(((vx)localObject1).rzk)).append("</cdnthumbkey>");
      }
      if (((vx)localObject1).rzr) {
        localStringBuffer.append("<cdndatakey>").append(bi.WS(((vx)localObject1).rzq)).append("</cdndatakey>");
      }
      if (((vx)localObject1).rzt) {
        localStringBuffer.append("<cdnencryver>").append(((vx)localObject1).rzs).append("</cdnencryver>");
      }
      if (((vx)localObject1).rzu) {
        localStringBuffer.append("<duration>").append(((vx)localObject1).duration).append("</duration>");
      }
      if (((vx)localObject1).rzw) {
        localStringBuffer.append("<streamweburl>").append(bi.WS(((vx)localObject1).rzv)).append("</streamweburl>");
      }
      if (((vx)localObject1).rzy) {
        localStringBuffer.append("<streamdataurl>").append(bi.WS(((vx)localObject1).rzx)).append("</streamdataurl>");
      }
      if (((vx)localObject1).rzA) {
        localStringBuffer.append("<streamlowbandurl>").append(bi.WS(((vx)localObject1).rzz)).append("</streamlowbandurl>");
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
        localStringBuffer.append("<datasize>").append(((vx)localObject1).rzJ).append("</datasize>");
      }
      if (((vx)localObject1).rzR) {
        localStringBuffer.append("<thumbfullmd5>").append(((vx)localObject1).rzQ).append("</thumbfullmd5>");
      }
      if (((vx)localObject1).rzT) {
        localStringBuffer.append("<thumbhead256md5>").append(((vx)localObject1).rzS).append("</thumbhead256md5>");
      }
      if (((vx)localObject1).rzV) {
        localStringBuffer.append("<thumbsize>").append(((vx)localObject1).rzU).append("</thumbsize>");
      }
      if (((vx)localObject1).rzZ) {
        localStringBuffer.append("<streamvideoid>").append(bi.WS(((vx)localObject1).rzY)).append("</streamvideoid>");
      }
      if (((vx)localObject1).rAh) {
        localStringBuffer.append("<sourcetitle>").append(bi.WS(((vx)localObject1).rAg)).append("</sourcetitle>");
      }
      if (((vx)localObject1).rAl) {
        localStringBuffer.append("<sourcename>").append(bi.WS(((vx)localObject1).rAk)).append("</sourcename>");
      }
      if (((vx)localObject1).rAn) {
        localStringBuffer.append("<sourcetime>").append(bi.WS(((vx)localObject1).rAm)).append("</sourcetime>");
      }
      if (((vx)localObject1).rAs) {
        localStringBuffer.append("<statextstr>").append(bi.WS(((vx)localObject1).bZN)).append("</statextstr>");
      }
      if (((vx)localObject1).rAz) {
        localStringBuffer.append("<recordxml>").append(((vx)localObject1).rAy).append("</recordxml>");
      }
      Object localObject2 = ((vx)localObject1).rAi;
      if ((localObject2 == null) || (((vy)localObject2).rAJ == null) || (((vy)localObject2).rAJ.boi() == 0))
      {
        x.w("MicroMsg.RecordMsgParser", "klem toXml, data source item empty");
        label1120:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAL != null) && (((vy)localObject2).rAL.boi() != 0)) {
          break label1604;
        }
        x.w("MicroMsg.RecordMsgParser", "klem toXml, loc item empty");
        label1159:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAN != null) && (((vy)localObject2).rAN.boi() != 0)) {
          break label1783;
        }
        x.w("MicroMsg.RecordMsgParser", "klem toXml, url item empty");
        label1198:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAP != null) && (((vy)localObject2).rAP.boi() != 0)) {
          break label2001;
        }
        x.w("MicroMsg.RecordMsgParser", "klem toXml, product item empty");
        label1237:
        localObject2 = ((vx)localObject1).rAi;
        if ((localObject2 != null) && (((vy)localObject2).rAR != null) && (((vy)localObject2).rAR.boi() != 0)) {
          break label2195;
        }
        x.w("MicroMsg.RecordMsgParser", "klem toXml, product item empty");
        label1276:
        localObject1 = ((vx)localObject1).rAi;
        if ((localObject1 != null) && (((vy)localObject1).rBa != null)) {
          break label2353;
        }
        x.e("MicroMsg.RecordMsgParser", "setAppBrandXml toXml, item empty");
      }
      for (;;)
      {
        localStringBuffer.append("</dataitem>");
        i += 1;
        break;
        localObject2 = ((vy)localObject2).rAJ;
        if (((vz)localObject2).rBl) {
          localStringBuffer.append("<appid>").append(((vz)localObject2).appId).append("</appid>");
        }
        if (((vz)localObject2).rBm) {
          localStringBuffer.append("<link>").append(bi.WS(((vz)localObject2).egr)).append("</link>");
        }
        if (((vz)localObject2).rBp) {
          localStringBuffer.append("<brandid>").append(bi.WS(((vz)localObject2).bGy)).append("</brandid>");
        }
        if ((((vz)localObject2).rBd) && (((vz)localObject2).rBi))
        {
          if (((vz)localObject2).bSS.equals(((vz)localObject2).rBh))
          {
            localStringBuffer.append("<dataitemsource><fromusr>").append(bi.WS(((vz)localObject2).bSS)).append("</fromusr></dataitemsource>");
            break label1120;
          }
          if ((!s.fq(((vz)localObject2).bSS)) && (!e.lb(((vz)localObject2).rBh))) {
            break label1120;
          }
          localStringBuffer.append("<dataitemsource><realchatname>").append(bi.WS(((vz)localObject2).rBh)).append("</realchatname></dataitemsource>");
          break label1120;
        }
        if (((vz)localObject2).rBd)
        {
          localStringBuffer.append("<dataitemsource><fromusr>").append(bi.WS(((vz)localObject2).bSS)).append("</fromusr></dataitemsource>");
          break label1120;
        }
        if (!((vz)localObject2).rBi) {
          break label1120;
        }
        localStringBuffer.append("<dataitemsource><realchatname>").append(bi.WS(((vz)localObject2).rBh)).append("</realchatname></dataitemsource>");
        break label1120;
        label1604:
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
        break label1159;
        label1783:
        localObject2 = ((vy)localObject2).rAN;
        localStringBuffer.append("<weburlitem>");
        if (((xa)localObject2).rCo) {
          localStringBuffer.append("<link>").append(bi.WS(((xa)localObject2).rCn)).append("</link>");
        }
        if (((xa)localObject2).rzi) {
          localStringBuffer.append("<desc>").append(bi.WS(((xa)localObject2).desc)).append("</desc>");
        }
        if (((xa)localObject2).rBD) {
          localStringBuffer.append("<thumburl>").append(bi.WS(((xa)localObject2).thumbUrl)).append("</thumburl>");
        }
        if (((xa)localObject2).rzh) {
          localStringBuffer.append("<title>").append(bi.WS(((xa)localObject2).title)).append("</title>");
        }
        if (((xa)localObject2).rCq) {
          localStringBuffer.append("<opencache>").append(((xa)localObject2).rCp).append("</opencache>");
        }
        if (((xa)localObject2).rCr) {
          localStringBuffer.append("<contentattr>").append(((xa)localObject2).dwt).append("</contentattr>");
        }
        localStringBuffer.append("</weburlitem>");
        break label1198;
        label2001:
        localObject2 = ((vy)localObject2).rAP;
        localStringBuffer.append("<productitem");
        if (((wk)localObject2).rBF) {
          localStringBuffer.append(" type='").append(((wk)localObject2).type).append("'");
        }
        localStringBuffer.append(">");
        if (((wk)localObject2).rzh) {
          localStringBuffer.append("<title>").append(bi.WS(((wk)localObject2).title)).append("</title>");
        }
        if (((wk)localObject2).rzi) {
          localStringBuffer.append("<desc>").append(bi.WS(((wk)localObject2).desc)).append("</desc>");
        }
        if (((wk)localObject2).rBD) {
          localStringBuffer.append("<thumburl>").append(bi.WS(((wk)localObject2).thumbUrl)).append("</thumburl>");
        }
        if (((wk)localObject2).rBE) {
          localStringBuffer.append("<productinfo>").append(bi.WS(((wk)localObject2).info)).append("</productinfo>");
        }
        localStringBuffer.append("</productitem>");
        break label1237;
        label2195:
        localObject2 = ((vy)localObject2).rAR;
        localStringBuffer.append("<tvitem>");
        if (((wu)localObject2).rzh) {
          localStringBuffer.append("<title>").append(bi.WS(((wu)localObject2).title)).append("</title>");
        }
        if (((wu)localObject2).rzi) {
          localStringBuffer.append("<desc>").append(bi.WS(((wu)localObject2).desc)).append("</desc>");
        }
        if (((wu)localObject2).rBD) {
          localStringBuffer.append("<thumburl>").append(bi.WS(((wu)localObject2).thumbUrl)).append("</thumburl>");
        }
        if (((wu)localObject2).rBE) {
          localStringBuffer.append("<tvinfo>").append(bi.WS(((wu)localObject2).info)).append("</tvinfo>");
        }
        localStringBuffer.append("</tvitem>");
        break label1276;
        label2353:
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/record/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.fav.a.a;

import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class b
{
  public static void a(String paramString, wl paramwl)
  {
    paramwl.rBI.clear();
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("datalist");
        if (paramString != null)
        {
          NodeList localNodeList = paramString.item(0).getChildNodes();
          if ((localNodeList != null) && (localNodeList.getLength() > 0))
          {
            int j = localNodeList.getLength();
            i = 0;
            if (i < j)
            {
              localObject1 = localNodeList.item(i);
              paramString = bl.b((Node)localObject1);
              localObject1 = ((Element)localObject1).getElementsByTagName("recordxml");
              if ((localObject1 == null) || (((NodeList)localObject1).getLength() <= 0)) {
                break label3838;
              }
              localObject1 = bl.b(((NodeList)localObject1).item(0).getFirstChild());
              if (!paramString.trim().startsWith("<dataitem")) {
                break label3833;
              }
              paramString = bl.z(paramString, "dataitem");
              if (paramString == null) {
                break label3844;
              }
              vx localvx = new vx();
              localvx.CF(bi.getInt((String)paramString.get(".dataitem" + ".$datatype"), 0));
              localvx.UT((String)paramString.get(".dataitem" + ".$datasourceid"));
              localvx.CG(bi.getInt((String)paramString.get(".dataitem" + ".$datastatus"), 0));
              localvx.UL((String)paramString.get(".dataitem" + ".datafmt"));
              localvx.UB((String)paramString.get(".dataitem" + ".datatitle"));
              localvx.UC((String)paramString.get(".dataitem" + ".datadesc"));
              localvx.UD((String)paramString.get(".dataitem" + ".cdn_thumburl"));
              localvx.UE((String)paramString.get(".dataitem" + ".cdn_thumbkey"));
              localvx.CC(bi.getInt((String)paramString.get(".dataitem" + ".thumb_width"), 0));
              localvx.CD(bi.getInt((String)paramString.get(".dataitem" + ".thumb_height"), 0));
              localvx.UF((String)paramString.get(".dataitem" + ".cdn_dataurl"));
              localvx.UG((String)paramString.get(".dataitem" + ".cdn_datakey"));
              localObject2 = (String)paramString.get(".dataitem" + ".duration");
              if ((localObject2 != null) && (((String)localObject2).length() > 0)) {
                localvx.CE(bi.getInt((String)localObject2, 0));
              }
              localvx.UI((String)paramString.get(".dataitem" + ".stream_dataurl"));
              localvx.UJ((String)paramString.get(".dataitem" + ".stream_lowbandurl"));
              localvx.UH((String)paramString.get(".dataitem" + ".stream_weburl"));
              localvx.Va((String)paramString.get(".dataitem" + ".canvasPageXml"));
              localvx.UM((String)paramString.get(".dataitem" + ".fullmd5"));
              localvx.UN((String)paramString.get(".dataitem" + ".head256md5"));
              localObject2 = (String)paramString.get(".dataitem" + ".fullsize");
              if (!bi.oW((String)localObject2)) {
                localvx.fO(bi.getInt((String)localObject2, 0));
              }
              localvx.UK((String)paramString.get(".dataitem" + ".dataext"));
              localvx.UR((String)paramString.get(".dataitem" + ".thumbfullmd5"));
              localvx.US((String)paramString.get(".dataitem" + ".thumbhead256md5"));
              localObject2 = (String)paramString.get(".dataitem" + ".thumbfullsize");
              if (!bi.oW((String)localObject2)) {
                localvx.fP(bi.getInt((String)localObject2, 0));
              }
              localvx.UU((String)paramString.get(".dataitem" + ".stream_videoid"));
              localObject3 = (String)paramString.get(".dataitem" + ".$dataid");
              if (!bi.oW((String)localObject3))
              {
                localObject2 = localObject3;
                if (((String)localObject3).length() >= 32) {}
              }
              else
              {
                localObject2 = com.tencent.mm.plugin.fav.a.b.bm(localvx.toString(), localvx.bjS);
              }
              localvx.UO((String)localObject2);
              localvx.UV((String)paramString.get(".dataitem" + ".datasrctitle"));
              localvx.UW((String)paramString.get(".dataitem" + ".datasrcname"));
              localvx.UX((String)paramString.get(".dataitem" + ".datasrctime"));
              localvx.UZ((String)paramString.get(".dataitem" + ".statextstr"));
              localvx.UY((String)paramString.get(".dataitem" + ".$htmlid"));
              localvx.CH(bi.getInt((String)paramString.get(".dataitem" + ".$dataillegaltype"), 0));
              if (localObject1 != null) {
                localvx.Vb((String)localObject1);
              }
              localObject1 = new wa();
              ((wa)localObject1).dyJ = bi.aG((String)paramString.get(".dataitem" + ".streamvideo.streamvideourl"), "");
              ((wa)localObject1).rBq = bi.WU((String)paramString.get(".dataitem" + ".streamvideo.streamvideototaltime"));
              ((wa)localObject1).dyL = bi.aG((String)paramString.get(".dataitem" + ".streamvideo.streamvideotitle"), "");
              ((wa)localObject1).dyM = bi.aG((String)paramString.get(".dataitem" + ".streamvideo.streamvideowording"), "");
              ((wa)localObject1).dyN = bi.aG((String)paramString.get(".dataitem" + ".streamvideo.streamvideoweburl"), "");
              ((wa)localObject1).dyP = bi.aG((String)paramString.get(".dataitem" + ".streamvideo.streamvideoaduxinfo"), "");
              ((wa)localObject1).dyQ = bi.aG((String)paramString.get(".dataitem" + ".streamvideo.streamvideopublishid"), "");
              localvx.a((wa)localObject1);
              localObject1 = new vy();
              localObject2 = ".dataitem" + ".dataitemsource";
              if (!paramString.containsKey(localObject2))
              {
                x.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
                localObject3 = ".dataitem" + ".locitem";
                if (paramString.containsKey(localObject3)) {
                  break label2556;
                }
                x.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject3 });
                localObject2 = ".dataitem" + ".weburlitem";
                if (paramString.containsKey(localObject2)) {
                  break label2913;
                }
                x.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
                localObject2 = ".dataitem" + ".productitem";
                if (paramString.containsKey(localObject2)) {
                  break label3192;
                }
                x.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
                localObject2 = ".dataitem" + ".tvitem";
                if (paramString.containsKey(localObject2)) {
                  break label3396;
                }
                x.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
                localObject2 = ".dataitem" + ".appbranditem";
                if (paramString.containsKey(localObject2)) {
                  break label3560;
                }
                x.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
                localvx.a((vy)localObject1);
                paramwl.rBI.add(localvx);
                break label3844;
              }
              localObject3 = new vz();
              ((vz)localObject3).CJ(bi.getInt((String)paramString.get((String)localObject2 + ".$sourcetype"), 0));
              ((vz)localObject3).Vh((String)paramString.get((String)localObject2 + ".$sourceid"));
              ((vz)localObject3).Vf((String)paramString.get((String)localObject2 + ".fromusr"));
              ((vz)localObject3).Vg((String)paramString.get((String)localObject2 + ".tousr"));
              ((vz)localObject3).Vi((String)paramString.get((String)localObject2 + ".realchatname"));
              ((vz)localObject3).fR(bi.getLong((String)paramString.get((String)localObject2 + ".createtime"), 0L));
              ((vz)localObject3).Vj((String)paramString.get((String)localObject2 + ".msgid"));
              ((vz)localObject3).cca = ((String)paramString.get((String)localObject2 + ".eventid"));
              ((vz)localObject3).rBk = true;
              ((vz)localObject3).Vk((String)paramString.get((String)localObject2 + ".appid"));
              ((vz)localObject3).Vl((String)paramString.get((String)localObject2 + ".link"));
              ((vz)localObject3).Vm((String)paramString.get((String)localObject2 + ".brandid"));
              ((vy)localObject1).c((vz)localObject3);
              continue;
            }
          }
        }
        return;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.FavProtoItemParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
      }
      label2556:
      Object localObject2 = new we();
      if (!bi.oW((String)paramString.get((String)localObject3 + ".label"))) {
        ((we)localObject2).Vn((String)paramString.get((String)localObject3 + ".label"));
      }
      if (!bi.oW((String)paramString.get((String)localObject3 + ".poiname"))) {
        ((we)localObject2).Vo((String)paramString.get((String)localObject3 + ".poiname"));
      }
      String str = (String)paramString.get((String)localObject3 + ".lng");
      if (!bi.oW(str)) {
        ((we)localObject2).y(bi.getDouble(str, 0.0D));
      }
      str = (String)paramString.get((String)localObject3 + ".lat");
      if (!bi.oW(str)) {
        ((we)localObject2).z(bi.getDouble(str, 0.0D));
      }
      Object localObject3 = (String)paramString.get((String)localObject3 + ".scale");
      if (!bi.oW((String)localObject3))
      {
        if (((String)localObject3).indexOf('.') == -1) {
          break label2898;
        }
        ((we)localObject2).CK(bi.getInt(((String)localObject3).substring(0, ((String)localObject3).indexOf('.')), -1));
      }
      for (;;)
      {
        ((vy)localObject1).a((we)localObject2);
        break;
        label2898:
        ((we)localObject2).CK(bi.getInt((String)localObject3, -1));
      }
      label2913:
      localObject3 = new xa();
      ((xa)localObject3).VL((String)paramString.get((String)localObject2 + ".clean_url"));
      ((xa)localObject3).VK((String)paramString.get((String)localObject2 + ".pagedesc"));
      ((xa)localObject3).VM((String)paramString.get((String)localObject2 + ".pagethumb_url"));
      ((xa)localObject3).VJ((String)paramString.get((String)localObject2 + ".pagetitle"));
      ((xa)localObject3).CP(bi.getInt((String)paramString.get((String)localObject2 + ".opencache"), 0));
      ((xa)localObject3).CQ(bi.getInt((String)paramString.get((String)localObject2 + ".contentattr"), 0));
      ((xa)localObject3).VN((String)paramString.get((String)localObject2 + ".canvasPageXml"));
      ((vy)localObject1).a((xa)localObject3);
      continue;
      label3192:
      localObject3 = new wk();
      ((wk)localObject3).Vp((String)paramString.get((String)localObject2 + ".producttitle"));
      ((wk)localObject3).Vq((String)paramString.get((String)localObject2 + ".productdesc"));
      ((wk)localObject3).Vr((String)paramString.get((String)localObject2 + ".productthumb_url"));
      ((wk)localObject3).Vs((String)paramString.get((String)localObject2 + ".productinfo"));
      ((wk)localObject3).CL(bi.getInt((String)paramString.get((String)localObject2 + ".$type"), 0));
      ((vy)localObject1).a((wk)localObject3);
      continue;
      label3396:
      localObject3 = new wu();
      ((wu)localObject3).VF((String)paramString.get((String)localObject2 + ".tvtitle"));
      ((wu)localObject3).VG((String)paramString.get((String)localObject2 + ".tvdesc"));
      ((wu)localObject3).VH((String)paramString.get((String)localObject2 + ".tvthumb_url"));
      ((wu)localObject3).VI((String)paramString.get((String)localObject2 + ".tvinfo"));
      ((vy)localObject1).a((wu)localObject3);
      continue;
      label3560:
      localObject3 = new vv();
      ((vv)localObject3).username = ((String)paramString.get((String)localObject2 + ".username"));
      ((vv)localObject3).appId = ((String)paramString.get((String)localObject2 + ".appid"));
      ((vv)localObject3).bPh = bi.getInt((String)paramString.get((String)localObject2 + ".pkgtype"), 0);
      ((vv)localObject3).iconUrl = ((String)paramString.get((String)localObject2 + ".iconurl"));
      ((vv)localObject3).type = bi.getInt((String)paramString.get((String)localObject2 + ".type"), 0);
      ((vv)localObject3).bGH = ((String)paramString.get((String)localObject2 + ".pagepath"));
      ((vv)localObject3).rzd = ((String)paramString.get((String)localObject2 + ".sourcedisplayname"));
      ((vy)localObject1).a((vv)localObject3);
      continue;
      label3833:
      paramString = null;
      continue;
      label3838:
      localObject1 = null;
      continue;
      label3844:
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
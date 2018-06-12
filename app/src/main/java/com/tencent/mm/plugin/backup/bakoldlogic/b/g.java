package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvideo.p;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.backup.bakoldlogic.a.a;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b;
import com.tencent.mm.plugin.backup.bakoldlogic.d.c;
import com.tencent.mm.plugin.backup.bakoldlogic.d.d;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class g
  implements j
{
  private static String a(ey paramey, bd parambd)
  {
    r localr = d.wF(parambd.field_imgPath);
    if (localr == null) {
      return null;
    }
    if (parambd.getType() == 62) {}
    for (int i = 62;; i = 43)
    {
      paramey.hcE = i;
      if (!bi.oW(parambd.field_content)) {
        break;
      }
      return null;
    }
    if (d.fq(parambd.field_talker)) {}
    for (paramey = localr.Tk();; paramey = paramey.rcj.siM)
    {
      parambd = new StringWriter();
      try
      {
        XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput(parambd);
        localXmlSerializer.startTag(null, "msg");
        localXmlSerializer.startTag(null, "videomsg");
        Map localMap = bl.z(localr.Tm(), "msg");
        if (localMap != null)
        {
          localXmlSerializer.attribute(null, "aeskey", (String)localMap.get(".msg.videomsg.$aeskey"));
          localXmlSerializer.attribute(null, "cdnthumbaeskey", (String)localMap.get(".msg.videomsg.$cdnthumbaeskey"));
          localXmlSerializer.attribute(null, "cdnvideourl", (String)localMap.get(".msg.videomsg.$cdnvideourl"));
          localXmlSerializer.attribute(null, "cdnthumburl", (String)localMap.get(".msg.videomsg.$cdnthumburl"));
          localXmlSerializer.attribute(null, "cdnthumblength", (String)localMap.get(".msg.videomsg.$cdnthumblength"));
        }
        localXmlSerializer.attribute(null, "playlength", localr.enM);
        localXmlSerializer.attribute(null, "length", localr.dHI);
        localXmlSerializer.attribute(null, "type", String.valueOf(i));
        if (!bi.oW(paramey)) {
          localXmlSerializer.attribute(null, "fromusername", paramey);
        }
        localXmlSerializer.attribute(null, "md5", localr.cas);
        localXmlSerializer.endTag(null, "videomsg");
        localXmlSerializer.endTag(null, "msg");
        localXmlSerializer.endDocument();
        parambd.flush();
        parambd.close();
        paramey = parambd.getBuffer().toString();
        x.d("MicroMsg.BakOldItemVideo", "parseContent xml:" + paramey);
        return paramey;
      }
      catch (Exception paramey)
      {
        x.e("MicroMsg.BakOldItemVideo", "packetVoice xml error: " + paramey.toString());
      }
    }
    return null;
  }
  
  public final int a(ey paramey, bd parambd, LinkedList<u> paramLinkedList)
  {
    b.atl().atm().Ta();
    String str = s.nK(parambd.field_imgPath);
    Object localObject = d.wF(parambd.field_imgPath);
    int j;
    if ((localObject == null) || (((r)localObject).status == 199))
    {
      j = 1;
      localObject = new File(str);
      if ((j == 0) || (!((File)localObject).exists())) {
        break label305;
      }
    }
    label167:
    label253:
    label302:
    label305:
    for (int k = (int)((File)localObject).length();; k = 0)
    {
      int m = 0;
      b.atl().atm().Ta();
      localObject = s.nL(parambd.field_imgPath);
      File localFile = new File((String)localObject);
      if (localFile.exists()) {
        m = (int)localFile.length();
      }
      int i = 0;
      if (m != 0)
      {
        if (parambd.getType() == 62) {
          i = i.a(new i.a((String)localObject, paramey, paramLinkedList, 13, "_thumb")) + 0;
        }
      }
      else
      {
        if ((j == 0) || (k == 0)) {
          break label302;
        }
        if (parambd.getType() != 62) {
          break label253;
        }
        i = i.a(new i.a(str, paramey, paramLinkedList, 12, false, null)) + i;
      }
      for (;;)
      {
        parambd = a(paramey, parambd);
        if (parambd == null)
        {
          return i;
          j = 0;
          break;
          i = i.a(new i.a((String)localObject, paramey, paramLinkedList, 11, "_thumb")) + 0;
          break label167;
          i = i.a(new i.a(str, paramey, paramLinkedList, 10, false, null)) + i;
          continue;
        }
        paramey.rcl = new bhz().VO(parambd);
        return i + parambd.length();
      }
    }
  }
  
  public final int a(String paramString, ey paramey, bd parambd)
  {
    paramString = new r();
    paramString.bWJ = paramey.rcj.siM;
    paramString.createTime = parambd.field_createTime;
    paramString.bYu = paramey.rcq;
    Object localObject = paramey.rcl.siM;
    x.d("MicroMsg.BakOldItemVideo", "parseVideoMsgXML content:" + (String)localObject);
    localObject = bl.z((String)localObject, "msg");
    if (localObject != null)
    {
      try
      {
        paramString.dHI = a.aR((String)((Map)localObject).get(".msg.videomsg.$length"), 0);
        paramString.enM = a.aR((String)((Map)localObject).get(".msg.videomsg.$playlength"), 0);
        paramString.enF = ((String)((Map)localObject).get(".msg.videomsg.$fromusername"));
        i = a.aR((String)((Map)localObject).get(".msg.videomsg.$type"), 0);
        x.d("MicroMsg.BakOldItemVideo", "video msg exportType :" + i);
        if (i != 44) {
          break label472;
        }
        i = 1;
        paramString.enQ = i;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int i;
          label198:
          label223:
          x.e("MicroMsg.BakOldItemVideo", "parsing voice msg xml failed");
          x.printErrStackTrace("MicroMsg.BakOldItemVideo", localException, "", new Object[0]);
        }
      }
      if ((!a.d(paramey, 10)) && (!a.d(paramey, 12))) {
        break label541;
      }
      paramString.status = 199;
      localObject = s.nJ(paramString.Tk());
      parambd.eq((String)localObject);
      paramString.fileName = ((String)localObject);
      if (parambd.getType() != 62) {
        parambd.setType(43);
      }
      parambd.setContent(p.b(paramString.Tk(), paramString.enL, false));
      paramString.enN = ((int)d.i(parambd));
      paramString.enK = bi.VE();
      paramString.enO = 0;
      x.d("MicroMsg.BakOldItemVideo", "Insert fileName[" + paramString.getFileName() + "] size:" + paramString.dHI + " svrid:" + paramString.bYu + " timelen:" + paramString.enM + " user:" + paramString.Tj() + " human:" + paramString.Tk());
      b.atl().atm().Ta().a(paramString);
      b.atl().atm().Ta();
      paramString = s.nL((String)localObject);
      if (parambd.getType() != 62) {
        break label550;
      }
      a.b(paramey, 13, paramString);
    }
    for (paramString = a.a(paramey, 12);; paramString = a.a(paramey, 10))
    {
      if (paramString != null)
      {
        paramString = a.wI(paramString);
        b.atl().atm().Ta();
        com.tencent.mm.sdk.platformtools.j.q(paramString, s.nK((String)localObject), false);
      }
      return 0;
      label472:
      i = 0;
      break;
      x.e("MicroMsg.BakOldItemVideo", "videomsg paseXml failed:%s", new Object[] { paramey.rcl.siM });
      parambd.setContent(paramey.rcl.siM);
      break label198;
      label541:
      paramString.status = 111;
      break label223;
      label550:
      a.b(paramey, 11, paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
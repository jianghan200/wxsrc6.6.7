package com.tencent.mm.plugin.backup.e;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvideo.p;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.plugin.backup.g.b;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.plugin.backup.g.d;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class f
  implements l
{
  private static String a(ey paramey, bd parambd)
  {
    r localr = c.wF(parambd.field_imgPath);
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
    if (c.fq(parambd.field_talker)) {}
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
        x.d("MicroMsg.BackupItemVideo", "parseContent xml:" + paramey);
        return paramey;
      }
      catch (Exception paramey)
      {
        x.e("MicroMsg.BackupItemVideo", "packetVoice xml error: " + paramey.toString());
      }
    }
    return null;
  }
  
  public final int a(ey paramey, boolean paramBoolean1, bd parambd, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    d.asG().asH().Ta();
    paramString = s.nK(parambd.field_imgPath);
    paramHashMap = c.wF(parambd.field_imgPath);
    int j;
    if ((paramHashMap == null) || (paramHashMap.status == 199))
    {
      j = 1;
      paramHashMap = new File(paramString);
      if ((j == 0) || (!paramHashMap.exists())) {
        break label334;
      }
    }
    label191:
    label302:
    label331:
    label334:
    for (int k = (int)paramHashMap.length();; k = 0)
    {
      int m = 0;
      d.asG().asH().Ta();
      paramHashMap = s.nL(parambd.field_imgPath);
      File localFile = new File(paramHashMap);
      if (localFile.exists()) {
        m = (int)localFile.length();
      }
      if (paramBoolean1)
      {
        j = m + k;
        return j;
        j = 0;
        break;
      }
      int i = 0;
      if (m != 0)
      {
        if (parambd.getType() == 62) {
          i = i.a(new i.a(paramHashMap, paramey, paramLinkedList, 13, paramBoolean1, "_thumb", paramBoolean2)) + 0;
        }
      }
      else
      {
        if ((j == 0) || (k == 0)) {
          break label331;
        }
        if (parambd.getType() != 62) {
          break label302;
        }
        i = i.a(new i.a(paramString, paramey, paramLinkedList, 12, paramBoolean1, paramBoolean2, null)) + i;
      }
      for (;;)
      {
        parambd = a(paramey, parambd);
        j = i;
        if (parambd == null) {
          break;
        }
        paramey.rcl = new bhz().VO(parambd);
        return i + parambd.length();
        i = i.a(new i.a(paramHashMap, paramey, paramLinkedList, 11, paramBoolean1, "_thumb", paramBoolean2)) + 0;
        break label191;
        i = i.a(new i.a(paramString, paramey, paramLinkedList, 10, paramBoolean1, paramBoolean2, null)) + i;
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
    x.d("MicroMsg.BackupItemVideo", "parseVideoMsgXML content:" + (String)localObject);
    localObject = bl.z((String)localObject, "msg");
    if (localObject != null)
    {
      try
      {
        paramString.dHI = g.aR((String)((Map)localObject).get(".msg.videomsg.$length"), 0);
        paramString.enM = g.aR((String)((Map)localObject).get(".msg.videomsg.$playlength"), 0);
        paramString.enF = ((String)((Map)localObject).get(".msg.videomsg.$fromusername"));
        i = g.aR((String)((Map)localObject).get(".msg.videomsg.$type"), 0);
        x.d("MicroMsg.BackupItemVideo", "video msg exportType :" + i);
        if (i != 44) {
          break label489;
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
          x.e("MicroMsg.BackupItemVideo", "parsing voice msg xml failed");
          x.printErrStackTrace("MicroMsg.BackupItemVideo", localException, "", new Object[0]);
        }
      }
      if ((!g.d(paramey, 10)) && (!g.d(paramey, 12))) {
        break label558;
      }
      paramString.status = 199;
      localObject = s.nJ(paramString.Tk());
      parambd.eq((String)localObject);
      paramString.fileName = ((String)localObject);
      if (parambd.getType() != 62) {
        parambd.setType(43);
      }
      parambd.setContent(p.b(paramString.Tk(), paramString.enL, false));
      paramString.enN = ((int)c.i(parambd));
      paramString.enK = bi.VE();
      paramString.enO = 0;
      x.d("MicroMsg.BackupItemVideo", "Insert fileName[" + paramString.getFileName() + "] size:" + paramString.dHI + " svrid:" + paramString.bYu + " timelen:" + paramString.enM + " user:" + paramString.Tj() + " human:" + paramString.Tk());
      d.asG().asH().Ta().a(paramString);
      d.asG().asH().Ta();
      paramString = s.nL((String)localObject);
      if (parambd.getType() != 62) {
        break label567;
      }
      g.b(paramey, 13, paramString);
    }
    for (paramString = g.a(paramey, 12);; paramString = g.a(paramey, 10))
    {
      if (paramString != null)
      {
        paramString = g.wu(paramString) + paramString;
        d.asG().asH().Ta();
        j.q(paramString, s.nK((String)localObject), false);
      }
      return 0;
      label489:
      i = 0;
      break;
      x.e("MicroMsg.BackupItemVideo", "videomsg paseXml failed:%s", new Object[] { paramey.rcl.siM });
      parambd.setContent(paramey.rcl.siM);
      break label198;
      label558:
      paramString.status = 111;
      break label223;
      label567:
      g.b(paramey, 11, paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
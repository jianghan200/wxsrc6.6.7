package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.mm.a.e;
import com.tencent.mm.bk.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.plugin.backup.bakoldlogic.a.a;
import com.tencent.mm.plugin.backup.bakoldlogic.d.d;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class h
  implements j
{
  byte[] gVS = { 35, 33, 65, 77, 82, 10, 2, 35, 33 };
  byte[] gVT = { 35, 33, 65, 77, 82, 10, 35, 33 };
  
  private static String d(bd parambd, int paramInt)
  {
    if (bi.oW(parambd.field_content)) {
      return null;
    }
    n localn = new n(parambd.field_content);
    Object localObject2 = new StringWriter();
    try
    {
      XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
      localXmlSerializer.setOutput((Writer)localObject2);
      localXmlSerializer.startTag(null, "msg");
      localXmlSerializer.startTag(null, "voicemsg");
      localXmlSerializer.attribute(null, "length", String.valueOf(paramInt));
      localXmlSerializer.attribute(null, "endflag", "1");
      localXmlSerializer.attribute(null, "cancelflag", "0");
      localXmlSerializer.attribute(null, "voicelength", localn.time);
      if (!bi.oW(localn.enF)) {
        localXmlSerializer.attribute(null, "fromusername", localn.enF);
      }
      if (localn.enG) {}
      for (Object localObject1 = "1";; localObject1 = "0")
      {
        localXmlSerializer.attribute(null, "isPlayed", (String)localObject1);
        localXmlSerializer.endTag(null, "voicemsg");
        localXmlSerializer.endTag(null, "msg");
        localXmlSerializer.endDocument();
        ((StringWriter)localObject2).flush();
        ((StringWriter)localObject2).close();
        localObject2 = ((StringWriter)localObject2).getBuffer().toString();
        localObject1 = localObject2;
        if (d.fq(parambd.field_talker)) {
          localObject1 = localn.enF + ":\n" + (String)localObject2;
        }
        x.i("MicroMsg.BakOldItemVoice", "parseContent xml:" + (String)localObject1);
        return (String)localObject1;
      }
      return null;
    }
    catch (Exception parambd)
    {
      x.e("MicroMsg.BakOldItemVoice", "packetVoice xml error: " + parambd.toString());
    }
  }
  
  private static boolean d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (bi.bC(paramArrayOfByte2)) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte1.length) {
        break label33;
      }
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        break;
      }
      i += 1;
    }
    label33:
    return true;
  }
  
  public final int a(ey paramey, bd parambd, LinkedList<com.tencent.mm.plugin.backup.h.u> paramLinkedList)
  {
    int j = 0;
    String str = d.wG(parambd.field_imgPath);
    int i;
    if (bi.oW(str)) {
      i = j;
    }
    int k;
    do
    {
      int m;
      do
      {
        File localFile;
        do
        {
          return i;
          localFile = new File(str);
          i = j;
        } while (!localFile.exists());
        k = (int)localFile.length();
        m = i.a(new i.a(str, paramey, paramLinkedList, 9, false, null));
        parambd = d(parambd, k);
        i = j;
      } while (parambd == null);
      paramey.rcl = new bhz().VO(parambd);
      j = m + parambd.length();
      i = j;
    } while (k != 0);
    return j;
  }
  
  public final int a(String paramString, ey paramey, bd parambd)
  {
    Object localObject = paramey.rcl.siM;
    paramString = (String)localObject;
    int i;
    if (d.fq(paramey.rcj.siM))
    {
      i = d.iA((String)localObject);
      if (i == -1)
      {
        paramString = (String)localObject;
        x.v("MicroMsg.BakOldItemVoice", "chatroom voicemsg, new content=" + paramString);
      }
    }
    else
    {
      paramString = bl.z(paramString, "msg");
      if (paramString == null) {
        break label311;
      }
    }
    try
    {
      i = a.aR((String)paramString.get(".msg.voicemsg.$voicelength"), 0);
      localObject = (String)paramString.get(".msg.voicemsg.$fromusername");
      if (a.aR((String)paramString.get(".msg.voicemsg.$isPlayed"), 1) != 1) {
        break label280;
      }
      bool = true;
      label127:
      parambd.setContent(n.b((String)localObject, i, bool));
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        boolean bool;
        label141:
        x.e("MicroMsg.BakOldItemVoice", "parsing voice msg xml failed");
        x.printErrStackTrace("MicroMsg.BakOldItemVoice", paramString, "", new Object[0]);
      }
    }
    paramString = com.tencent.mm.modelvoice.u.ov(paramey.rcj.siM);
    parambd.eq(paramString);
    d.i(parambd);
    paramString = d.wG(paramString);
    if (paramey.rfA == 9)
    {
      parambd = paramey.rfy.siK.lR;
      if (d(this.gVS, parambd))
      {
        localObject = new byte[parambd.length - 6];
        System.arraycopy(parambd, 6, localObject, 0, parambd.length - 6);
        paramey.rfz = (parambd.length - 6);
        paramey.rfy = new bhy().bq((byte[])localObject);
        label246:
        if (paramString != null) {
          break label522;
        }
      }
    }
    label280:
    label311:
    label522:
    do
    {
      do
      {
        return 0;
        paramString = (String)localObject;
        if (i + 2 >= ((String)localObject).length()) {
          break;
        }
        paramString = ((String)localObject).substring(i + 2);
        break;
        bool = false;
        break label127;
        x.e("MicroMsg.BakOldItemVoice", "voicemsg paseXml failed:%s", new Object[] { paramey.rcl.siM });
        parambd.setContent(paramey.rcl.siM);
        break label141;
        if (d(this.gVT, parambd))
        {
          localObject = new byte[parambd.length - 6];
          System.arraycopy(parambd, 6, localObject, 0, parambd.length - 6);
          paramey.rfz = (parambd.length - 6);
          paramey.rfy = new bhy().bq((byte[])localObject);
          break label246;
        }
        parambd = a.a(paramey, 9);
        if (bi.oW(parambd)) {
          break label246;
        }
        parambd = a.wI(parambd);
        if (!e.cn(parambd)) {
          break label246;
        }
        localObject = e.f(parambd, 0, 9);
        if (d(this.gVS, (byte[])localObject))
        {
          localObject = e.f(parambd, 6, -1);
          e.deleteFile(parambd);
          e.b(parambd, (byte[])localObject, localObject.length);
          break label246;
        }
        if (!d(this.gVT, (byte[])localObject)) {
          break label246;
        }
        localObject = e.f(parambd, 6, -1);
        e.deleteFile(parambd);
        e.b(parambd, (byte[])localObject, localObject.length);
        break label246;
      } while (a.b(paramey, 9, paramString));
      paramey = a.a(paramey, 9);
    } while (paramey == null);
    paramey = a.wI(paramey);
    x.d("MicroMsg.BakOldItemVoice", "recover Frome Sdcard" + paramey);
    com.tencent.mm.sdk.platformtools.j.q(paramey, paramString, false);
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.backup.e;

import com.tencent.mm.a.e;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class g
  implements l
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
        if (c.fq(parambd.field_talker)) {
          localObject1 = localn.enF + ":\n" + (String)localObject2;
        }
        x.i("MicroMsg.BackupItemVoice", "parseContent xml:%s", new Object[] { localObject1 });
        return (String)localObject1;
      }
      return null;
    }
    catch (Exception parambd)
    {
      x.e("MicroMsg.BackupItemVoice", "packetVoice xml error: " + parambd.toString());
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
  
  public final int a(ey paramey, boolean paramBoolean1, bd parambd, String paramString, LinkedList<com.tencent.mm.plugin.backup.h.u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    paramString = c.wG(parambd.field_imgPath);
    int i;
    if (bi.oW(paramString)) {
      i = 0;
    }
    int k;
    int j;
    do
    {
      return i;
      paramHashMap = new File(paramString);
      if (!paramHashMap.exists()) {
        return 0;
      }
      k = (int)paramHashMap.length();
      if (paramBoolean1) {
        return k;
      }
      i = i.a(new i.a(paramString, paramey, paramLinkedList, 9, paramBoolean2, paramBoolean2, null));
      parambd = d(parambd, k);
      if (parambd == null) {
        return 0;
      }
      paramey.rcl = new bhz().VO(parambd);
      j = i + parambd.length();
      i = j;
    } while (k != 0);
    return j;
  }
  
  public final int a(String paramString, ey paramey, bd parambd)
  {
    Object localObject = paramey.rcl.siM;
    paramString = (String)localObject;
    int i;
    if (c.fq(paramey.rcj.siM))
    {
      i = c.iA((String)localObject);
      if (i == -1)
      {
        paramString = (String)localObject;
        x.v("MicroMsg.BackupItemVoice", "recover, voiceContentXml:%s", new Object[] { paramString });
      }
    }
    else
    {
      paramString = bl.z(paramString, "msg");
      if (paramString == null) {
        break label322;
      }
    }
    try
    {
      i = com.tencent.mm.plugin.backup.a.g.aR((String)paramString.get(".msg.voicemsg.$voicelength"), 0);
      localObject = (String)paramString.get(".msg.voicemsg.$fromusername");
      int j = com.tencent.mm.plugin.backup.a.g.aR((String)paramString.get(".msg.voicemsg.$isPlayed"), 1);
      long l = i;
      if (j != 1) {
        break label291;
      }
      bool = true;
      label130:
      parambd.setContent(n.b((String)localObject, l, bool));
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        boolean bool;
        label143:
        x.e("MicroMsg.BackupItemVoice", "parsing voice msg xml failed");
        x.printErrStackTrace("MicroMsg.BackupItemVoice", paramString, "", new Object[0]);
      }
    }
    paramString = com.tencent.mm.modelvoice.u.ov(paramey.rcj.siM);
    parambd.eq(paramString);
    c.i(parambd);
    paramString = c.wG(paramString);
    parambd = com.tencent.mm.plugin.backup.a.g.a(paramey, 9);
    if (!bi.oW(parambd))
    {
      parambd = com.tencent.mm.plugin.backup.a.g.wu(parambd) + parambd;
      if (e.cn(parambd))
      {
        localObject = e.f(parambd, 0, 9);
        if (!d(this.gVS, (byte[])localObject)) {
          break label358;
        }
        localObject = e.f(parambd, 6, -1);
        e.deleteFile(parambd);
        e.b(parambd, (byte[])localObject, localObject.length);
      }
    }
    label257:
    if (paramString == null) {}
    label291:
    label322:
    label358:
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
        break label130;
        x.e("MicroMsg.BackupItemVoice", "voicemsg paseXml failed:%s", new Object[] { paramey.rcl.siM });
        parambd.setContent(paramey.rcl.siM);
        break label143;
        if (!d(this.gVT, (byte[])localObject)) {
          break label257;
        }
        localObject = e.f(parambd, 6, -1);
        e.deleteFile(parambd);
        e.b(parambd, (byte[])localObject, localObject.length);
        break label257;
      } while (com.tencent.mm.plugin.backup.a.g.b(paramey, 9, paramString));
      paramey = com.tencent.mm.plugin.backup.a.g.a(paramey, 9);
    } while (paramey == null);
    paramey = com.tencent.mm.plugin.backup.a.g.wu(paramey) + paramey;
    x.d("MicroMsg.BackupItemVoice", "recover from path:%s", new Object[] { paramey });
    j.q(paramey, paramString, false);
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
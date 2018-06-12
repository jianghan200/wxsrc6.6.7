package com.tencent.mm.plugin.backup.e;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class d
  implements l
{
  private static String a(com.tencent.mm.ak.e parame, com.tencent.mm.storage.bd parambd)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
      localXmlSerializer.setOutput(localStringWriter);
      if (com.tencent.mm.plugin.backup.g.c.fq(parambd.field_talker)) {
        localStringWriter.write(com.tencent.mm.model.bd.iB(parambd.field_content) + ":\n");
      }
      localXmlSerializer.startTag(null, "msg");
      localXmlSerializer.startTag(null, "img");
      Map localMap = bl.z(parame.dTV, "msg");
      if (localMap != null)
      {
        localXmlSerializer.attribute(null, "aeskey", (String)localMap.get(".msg.img.$aeskey"));
        localXmlSerializer.attribute(null, "encryver", (String)localMap.get(".msg.img.$encryver"));
        localXmlSerializer.attribute(null, "cdnthumbaeskey", (String)localMap.get(".msg.img.$cdnthumbaeskey"));
        localXmlSerializer.attribute(null, "cdnthumburl", (String)localMap.get(".msg.img.$cdnthumburl"));
        localXmlSerializer.attribute(null, "cdnthumblength", bi.getLong((String)localMap.get(".msg.img.$cdnthumblength"), 10240L));
        localXmlSerializer.attribute(null, "cdnthumbheight", bi.getInt((String)localMap.get(".msg.img.$cdnthumbheight"), 0));
        localXmlSerializer.attribute(null, "cdnthumbwidth", bi.getInt((String)localMap.get(".msg.img.$cdnthumbwidth"), 0));
        localXmlSerializer.attribute(null, "cdnmidheight", bi.getInt((String)localMap.get(".msg.img.$cdnmidheight"), 0));
        localXmlSerializer.attribute(null, "cdnmidwidth", bi.getInt((String)localMap.get(".msg.img.$cdnmidwidth"), 0));
        localXmlSerializer.attribute(null, "cdnhdheight", bi.getInt((String)localMap.get(".msg.img.$cdnhdheight"), 0));
        localXmlSerializer.attribute(null, "cdnhdwidth", bi.getInt((String)localMap.get(".msg.img.$cdnhdwidth"), 0));
        localXmlSerializer.attribute(null, "cdnmidimgurl", (String)localMap.get(".msg.img.$cdnmidimgurl"));
        long l2 = bi.getLong((String)localMap.get(".msg.img.$length"), 0L);
        StringBuilder localStringBuilder = new StringBuilder();
        long l1 = l2;
        if (l2 == 0L) {
          l1 = com.tencent.mm.a.e.cm(com.tencent.mm.plugin.backup.g.d.asG().asH().asD().o(parame.dTL, "", ""));
        }
        localXmlSerializer.attribute(null, "length", l1);
        if ((parambd.field_isSend != 1) || (parame.dTO == 1))
        {
          localXmlSerializer.attribute(null, "cdnbigimgurl", (String)localMap.get(".msg.img.$cdnbigimgurl"));
          localXmlSerializer.attribute(null, "hdlength", bi.getLong((String)localMap.get(".msg.img.$hdlength"), 0L));
        }
        localXmlSerializer.attribute(null, "md5", (String)localMap.get(".msg.img.$md5"));
      }
      localXmlSerializer.endTag(null, "img");
      localXmlSerializer.endTag(null, "msg");
      localXmlSerializer.endDocument();
      localStringWriter.flush();
      localStringWriter.close();
      parame = localStringWriter.getBuffer().toString();
      x.d("MicroMsg.BackupItemImg", "parseContent xml:%s", new Object[] { parame });
      return parame;
    }
    catch (Exception parame)
    {
      x.e("MicroMsg.BackupItemImg", "packetImg xml error: " + parame.toString());
    }
    return null;
  }
  
  public final int a(ey paramey, boolean paramBoolean1, com.tencent.mm.storage.bd parambd, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    int i;
    if (bi.oW(parambd.field_content))
    {
      i = 0;
      if (parambd.field_isSend == 1)
      {
        paramString = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().br(parambd.field_msgId);
        if (paramString.dTK != 0L) {
          break label942;
        }
      }
      paramString = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().bq(parambd.field_msgSvrId);
    }
    label301:
    label436:
    label460:
    label479:
    label554:
    label900:
    label919:
    label942:
    for (;;)
    {
      paramHashMap = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().E(parambd.field_imgPath, true);
      int j;
      Object localObject1;
      int k;
      if (com.tencent.mm.a.e.cn(paramHashMap))
      {
        j = i + i.a(new i.a(paramHashMap, paramey, paramLinkedList, 1, paramBoolean1, "_thumb", paramBoolean2));
        if (parambd.field_isSend != 1) {
          break label479;
        }
        localObject2 = "";
        str = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().o(paramString.dTL, "", "");
        localObject1 = localObject2;
        k = j;
        paramHashMap = paramString;
        if (paramString.ON())
        {
          paramHashMap = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().hQ(paramString.dTU);
          if (paramHashMap == null) {
            break label460;
          }
          localObject1 = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().o(paramHashMap.dTL, "", "");
          x.d("MicroMsg.BackupItemImg", "packet hd bigImgPath " + (String)localObject1 + " " + com.tencent.mm.a.e.cm((String)localObject1));
          com.tencent.mm.a.e.cm((String)localObject1);
          if (!com.tencent.mm.a.e.cn((String)localObject1)) {
            break label436;
          }
          k = i.a(new i.a((String)localObject1, paramey, paramLinkedList, 3, paramBoolean1, "_hd", paramBoolean2)) + j;
        }
        com.tencent.mm.a.e.cm(str);
        i = k;
        localObject2 = paramHashMap;
        if (!bi.oW(str))
        {
          i = k;
          localObject2 = paramHashMap;
          if (!str.equals(localObject1))
          {
            x.d("MicroMsg.BackupItemImg", "bigImgPath " + str + " " + com.tencent.mm.a.e.cm(str));
            i = k + i.a(new i.a(str, paramey, paramLinkedList, 2, paramBoolean1, paramBoolean2, null));
            localObject2 = paramHashMap;
          }
        }
      }
      do
      {
        parambd = a((com.tencent.mm.ak.e)localObject2, parambd);
        if (parambd != null) {
          break label919;
        }
        return i;
        i = parambd.field_content.getBytes().length;
        break;
        return -1;
        x.e("MicroMsg.BackupItemImg", "packet img.hasHdImg but hdbigImgPath has no file, hdbigImgPath:%s", new Object[] { localObject1 });
        k = j;
        break label301;
        x.e("MicroMsg.BackupItemImg", "packet img.hasHdImg but img is null");
        localObject1 = localObject2;
        k = j;
        break label301;
        i = j;
        localObject2 = paramString;
      } while (!paramString.OM());
      String str = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().o(paramString.dTL, "", "");
      Object localObject2 = "";
      if (paramString.ON())
      {
        localObject1 = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().hQ(paramString.dTU);
        if (localObject1 != null)
        {
          if (localObject1 != null) {
            x.i("MicroMsg.BackupItemImg", "packet receive img hdinfo, offset[%d], totalLen[%d], compressType[%d], path:%s", new Object[] { Integer.valueOf(((com.tencent.mm.ak.e)localObject1).offset), Integer.valueOf(((com.tencent.mm.ak.e)localObject1).dHI), Integer.valueOf(((com.tencent.mm.ak.e)localObject1).dTO), ((com.tencent.mm.ak.e)localObject1).dTL });
          }
          paramHashMap = (HashMap<Long, h.a>)localObject2;
          k = j;
          if (localObject1 != null)
          {
            paramHashMap = (HashMap<Long, h.a>)localObject2;
            k = j;
            if (((com.tencent.mm.ak.e)localObject1).dTO == 1)
            {
              if ((localObject1.equals(paramString)) || (((com.tencent.mm.ak.e)localObject1).offset != ((com.tencent.mm.ak.e)localObject1).dHI)) {
                break label900;
              }
              localObject1 = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().o(((com.tencent.mm.ak.e)localObject1).dTL, "", "");
              x.d("MicroMsg.BackupItemImg", "packet hdPath:%s, fileLen[%d]", new Object[] { localObject1, Integer.valueOf(com.tencent.mm.a.e.cm((String)localObject1)) });
              paramHashMap = (HashMap<Long, h.a>)localObject1;
              k = j;
              if (com.tencent.mm.a.e.cn((String)localObject1))
              {
                k = j + i.a(new i.a((String)localObject1, paramey, paramLinkedList, 3, paramBoolean1, "_hd", paramBoolean2));
                com.tencent.mm.a.e.cm((String)localObject1);
                paramHashMap = (HashMap<Long, h.a>)localObject1;
              }
            }
          }
        }
      }
      for (;;)
      {
        i = k;
        localObject2 = paramString;
        if (!com.tencent.mm.a.e.cn(str)) {
          break;
        }
        com.tencent.mm.a.e.cm(str);
        i = k;
        localObject2 = paramString;
        if (bi.oW(str)) {
          break;
        }
        i = k;
        localObject2 = paramString;
        if (str.equals(paramHashMap)) {
          break;
        }
        x.d("MicroMsg.BackupItemImg", "bigImgPath " + str + " " + com.tencent.mm.a.e.cm(str));
        i = k + i.a(new i.a(str, paramey, paramLinkedList, 2, paramBoolean1, paramBoolean2, null));
        localObject2 = paramString;
        break;
        localObject1 = null;
        break label554;
        localObject1.equals(paramString);
        paramHashMap = (HashMap<Long, h.a>)localObject2;
        k = j;
      }
      paramey.rcl = new bhz().VO(parambd);
      return i + parambd.length();
    }
  }
  
  public final int a(String paramString, ey paramey, com.tencent.mm.storage.bd parambd)
  {
    if ((paramey == null) || (paramey.rcl == null))
    {
      x.e("MicroMsg.BackupItemImg", "recover bakitem or bakitem content is null");
      return 0;
    }
    String str1 = new String(bi.aG(paramey.rcl.siM, ""));
    x.d("MicroMsg.BackupItemImg", "recover msg" + paramey.rcq + " " + str1);
    int i;
    int j;
    label104:
    Object localObject1;
    label115:
    com.tencent.mm.ak.g localg;
    if (paramey.rfy == null)
    {
      i = 0;
      j = paramey.rfA;
      if (paramey.rfx != null) {
        break label586;
      }
      paramString = "";
      if (paramey.rfw != null) {
        break label597;
      }
      localObject1 = "";
      x.d("MicroMsg.BackupItemImg", "recover bakitem:, buf:%d, BufferType:%d, MediaType%s, ids:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), paramString, localObject1 });
      paramString = null;
      parambd.setContent(str1);
      localg = com.tencent.mm.plugin.backup.g.d.asG().asH().asD();
      if (parambd.field_isSend != 1) {
        break label609;
      }
      if (parambd.field_msgId != 0L) {
        paramString = localg.br(parambd.field_msgId);
      }
      if ((paramString != null) && (paramString.dTK != 0L)) {
        break label1183;
      }
      paramString = localg.bq(parambd.field_msgSvrId);
    }
    label221:
    label586:
    label597:
    label609:
    label674:
    label1167:
    label1183:
    for (;;)
    {
      localObject1 = bl.z(str1, "msg");
      long l1 = 0L;
      long l2;
      if (localObject1 != null)
      {
        l2 = bi.getLong((String)((Map)localObject1).get(".msg.img.$hdlength"), 0L);
        l1 = l2;
        if (l2 > 0L) {
          i = 1;
        }
      }
      for (;;)
      {
        Object localObject3 = bi.aG(com.tencent.mm.plugin.backup.a.g.a(paramey, 3), "");
        if ((paramey.rfA == 3) && (paramey.rfy != null)) {
          com.tencent.mm.a.e.b(com.tencent.mm.plugin.backup.a.g.wu((String)localObject3), (String)localObject3, paramey.rfy.siK.lR);
        }
        localObject1 = bi.aG(com.tencent.mm.plugin.backup.a.g.a(paramey, 2), "");
        if ((paramey.rfA == 2) && (paramey.rfy != null)) {
          com.tencent.mm.a.e.b(com.tencent.mm.plugin.backup.a.g.wu((String)localObject1), (String)localObject1, paramey.rfy.siK.lR);
        }
        x.d("MicroMsg.BackupItemImg", "hdName %s, imgName:%s", new Object[] { localObject3, localObject1 });
        if (bi.oW((String)localObject1))
        {
          x.e("MicroMsg.BackupItemImg", "imgName is null, imgName = hdName");
          localObject1 = localObject3;
        }
        for (;;)
        {
          Object localObject2 = com.tencent.mm.plugin.backup.a.g.b(paramey, 1);
          Object localObject4;
          if (localObject2 == null)
          {
            x.i("MicroMsg.BackupItemImg", "getThumbBuf is null and read from mediapath");
            localObject2 = com.tencent.mm.plugin.backup.a.g.wu((String)localObject1) + (String)localObject1;
            str2 = com.tencent.mm.a.g.u((bi.VF() + " ").getBytes());
            localObject4 = com.tencent.mm.plugin.backup.a.g.wu(str2);
            str3 = (String)localObject4 + str2;
            localObject4 = new File((String)localObject4);
            if (!((File)localObject4).exists()) {
              ((File)localObject4).mkdirs();
            }
            j = z.Wn(str3);
            if (j > 0)
            {
              if (z.a((String)localObject2, Bitmap.CompressFormat.JPEG, str3, j)) {
                break label674;
              }
              x.e("MicroMsg.BackupItemImg", "createLongPictureThumbNail failed");
              return -1;
              i = paramey.rfy.siI;
              break;
              paramString = paramey.rfx.toString();
              break label104;
              localObject1 = paramey.rfw.toString();
              break label115;
              paramString = localg.bq(parambd.field_msgSvrId);
              break label221;
            }
            if (!com.tencent.mm.sdk.platformtools.c.a((String)localObject2, 120, 120, Bitmap.CompressFormat.JPEG, 90, str3))
            {
              x.e("MicroMsg.BackupItemImg", "createThumbNail failed");
              return -1;
            }
            x.d("MicroMsg.BackupItemImg", "insert: thumbName = " + str2);
            localObject2 = com.tencent.mm.a.e.f(str3, 0, -1);
          }
          while (localObject2 == null)
          {
            x.e("MicroMsg.BackupItemImg", "img buf is null");
            return -1;
            x.i("MicroMsg.BackupItemImg", "getThumbBuf len:%d", new Object[] { Integer.valueOf(localObject2.length) });
          }
          String str2 = localg.o((String)localObject3, "", "");
          String str3 = localg.o((String)localObject1, "", "");
          l1 = 0L;
          long l3;
          if (paramString.dTK == 0L)
          {
            j = com.tencent.mm.plugin.backup.a.g.c(paramey, 2);
            if (i != 0)
            {
              i = com.tencent.mm.plugin.backup.a.g.c(paramey, 3);
              l3 = localg.a((byte[])localObject2, paramey.rcq, true, (String)localObject3, i, str1, new PString(), new PInt(), new PInt());
              l1 = l3;
              if (!com.tencent.mm.plugin.backup.a.g.b(paramey, 3, str2))
              {
                x.e("MicroMsg.BackupItemImg", "writeItem BACKUPITEM_IMAGE_HD failed:%s", new Object[] { str2 });
                l1 = l3;
                if (j == l2) {
                  if (com.tencent.mm.plugin.backup.a.g.b(paramey, 3, str3))
                  {
                    x.i("MicroMsg.BackupItemImg", "writeItem, try take img for hd img success:%s", new Object[] { str3 });
                    l1 = l3;
                    i = 0;
                    if (j > 0) {
                      break label1167;
                    }
                    j = com.tencent.mm.plugin.backup.a.g.c(paramey, 3);
                  }
                }
              }
            }
          }
          for (;;)
          {
            paramString = new PString();
            localObject3 = new PInt();
            localObject4 = new PInt();
            l2 = localg.a((byte[])localObject2, paramey.rcq, false, (String)localObject1, j, str1, paramString, (PInt)localObject3, (PInt)localObject4);
            if ((i != 0) && (!com.tencent.mm.plugin.backup.a.g.b(paramey, 2, str3))) {
              x.e("MicroMsg.BackupItemImg", "writeItem BACKUPITEM_IMAGE failed:%s", new Object[] { str2 });
            }
            if (l2 > 0L)
            {
              parambd.eq(paramString.value);
              parambd.fh(((PInt)localObject3).value);
              parambd.fi(((PInt)localObject4).value);
              if (l1 > 0L)
              {
                paramString = com.tencent.mm.plugin.backup.g.d.asG().asH().asD().b(Long.valueOf(l2));
                paramString.hM((int)l1);
                com.tencent.mm.plugin.backup.g.d.asG().asH().asD().a(Long.valueOf(l2), paramString);
              }
            }
            for (;;)
            {
              com.tencent.mm.plugin.backup.g.c.i(parambd);
              return 0;
              x.e("MicroMsg.BackupItemImg", "writeItem, try take img for hd img failed:%s", new Object[] { str3 });
              l1 = l3;
              i = 1;
              break;
              return -1;
              paramey = paramString.dTN;
              if ((paramey != null) && (paramey.startsWith("THUMBNAIL_DIRPATH://"))) {
                parambd.eq(paramey);
              } else {
                parambd.eq("THUMBNAIL://" + paramString.dTK);
              }
            }
          }
        }
        i = 0;
        l2 = l1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
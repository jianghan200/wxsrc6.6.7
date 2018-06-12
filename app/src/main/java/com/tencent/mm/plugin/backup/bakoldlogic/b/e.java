package com.tencent.mm.plugin.backup.bakoldlogic.b;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.backup.bakoldlogic.a.a;
import com.tencent.mm.plugin.backup.bakoldlogic.d.d;
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
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class e
  implements j
{
  private static String a(com.tencent.mm.ak.e parame, com.tencent.mm.storage.bd parambd)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
      localXmlSerializer.setOutput(localStringWriter);
      if (d.fq(parambd.field_talker)) {
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
          l1 = com.tencent.mm.a.e.cm(com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().o(parame.dTL, "", ""));
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
      x.d("MicroMsg.BakOldItemImg", "parseContent xml:%s", new Object[] { parame });
      return parame;
    }
    catch (Exception parame)
    {
      x.e("MicroMsg.BakOldItemImg", "packetImg xml error: " + parame.toString());
    }
    return null;
  }
  
  public final int a(ey paramey, com.tencent.mm.storage.bd parambd, LinkedList<u> paramLinkedList)
  {
    int i;
    Object localObject1;
    if (bi.oW(parambd.field_content))
    {
      i = 0;
      if (parambd.field_isSend == 1)
      {
        localObject1 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().br(parambd.field_msgId);
        if (((com.tencent.mm.ak.e)localObject1).dTK != 0L) {
          break label964;
        }
      }
      localObject1 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().bq(parambd.field_msgSvrId);
    }
    label285:
    label417:
    label441:
    label453:
    label464:
    label535:
    label543:
    label551:
    label561:
    label569:
    label868:
    label878:
    label888:
    label898:
    label908:
    label916:
    label950:
    label957:
    label964:
    for (;;)
    {
      Object localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().E(parambd.field_imgPath, true);
      String str1;
      String str2;
      int j;
      if (com.tencent.mm.a.e.cn((String)localObject2))
      {
        i += i.a(new i.a((String)localObject2, paramey, paramLinkedList, 1, "_thumb"));
        if (parambd.field_isSend != 1) {
          break label464;
        }
        str1 = "";
        str2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().o(((com.tencent.mm.ak.e)localObject1).dTL, "", "");
        localObject2 = localObject1;
        if (!((com.tencent.mm.ak.e)localObject1).ON()) {
          break label453;
        }
        localObject1 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().hQ(((com.tencent.mm.ak.e)localObject1).dTU);
        if (localObject1 == null) {
          break label441;
        }
        str1 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().o(((com.tencent.mm.ak.e)localObject1).dTL, "", "");
        x.d("MicroMsg.BakOldItemImg", "packet hd bigImgPath " + str1 + " " + com.tencent.mm.a.e.cm(str1));
        com.tencent.mm.a.e.cm(str1);
        if (!com.tencent.mm.a.e.cn(str1)) {
          break label417;
        }
        j = i.a(new i.a(str1, paramey, paramLinkedList, 3, "_hd")) + i;
        com.tencent.mm.a.e.cm(str2);
        localObject2 = localObject1;
        i = j;
        if (!bi.oW(str2))
        {
          localObject2 = localObject1;
          i = j;
          if (!str2.equals(str1))
          {
            x.d("MicroMsg.BakOldItemImg", "bigImgPath " + str2 + " " + com.tencent.mm.a.e.cm(str2));
            i = j + i.a(new i.a(str2, paramey, paramLinkedList, 2, false, null));
            localObject2 = localObject1;
          }
        }
      }
      for (;;)
      {
        parambd = a((com.tencent.mm.ak.e)localObject2, parambd);
        int k;
        int m;
        if (parambd == null)
        {
          return i;
          i = parambd.field_content.getBytes().length;
          break;
          return -1;
          x.e("MicroMsg.BakOldItemImg", "packet img.hasHdImg but hdbigImgPath has no file, hdbigImgPath:%s", new Object[] { str1 });
          j = i;
          break label285;
          x.e("MicroMsg.BakOldItemImg", "packet img.hasHdImg but img is null");
          localObject2 = localObject1;
          localObject1 = localObject2;
          j = i;
          break label285;
          if (!((com.tencent.mm.ak.e)localObject1).OM()) {
            break label957;
          }
          str2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().o(((com.tencent.mm.ak.e)localObject1).dTL, "", "");
          if (((com.tencent.mm.ak.e)localObject1).ON()) {
            if (((com.tencent.mm.ak.e)localObject1).ON())
            {
              localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().hQ(((com.tencent.mm.ak.e)localObject1).dTU);
              if (localObject2 != null)
              {
                if (localObject2 != null) {
                  break label868;
                }
                j = -1;
                if (localObject2 != null) {
                  break label878;
                }
                k = -1;
                if (localObject2 != null) {
                  break label888;
                }
                str1 = "null";
                if (localObject2 != null) {
                  break label898;
                }
                m = -1;
                x.i("MicroMsg.BakOldItemImg", "packet hdinfo off:%d total:%d path:%s, compressType[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), str1, Integer.valueOf(m) });
                if ((localObject2 == null) || (((com.tencent.mm.ak.e)localObject2).dTO != 1)) {
                  break label916;
                }
                if ((localObject2.equals(localObject1)) || (((com.tencent.mm.ak.e)localObject2).offset != ((com.tencent.mm.ak.e)localObject2).dHI)) {
                  break label908;
                }
                str1 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().o(((com.tencent.mm.ak.e)localObject2).dTL, "", "");
                x.d("MicroMsg.BakOldItemImg", "packet hdPath:%s, fileLen[%d]", new Object[] { str1, Integer.valueOf(com.tencent.mm.a.e.cm(str1)) });
                if (!com.tencent.mm.a.e.cn(str1)) {
                  break label950;
                }
                j = i.a(new i.a(str1, paramey, paramLinkedList, 3, "_hd"));
                com.tencent.mm.a.e.cm(str1);
                j = i + j;
              }
            }
          }
        }
        for (;;)
        {
          localObject2 = localObject1;
          i = j;
          if (!com.tencent.mm.a.e.cn(str2)) {
            break;
          }
          com.tencent.mm.a.e.cm(str2);
          localObject2 = localObject1;
          i = j;
          if (bi.oW(str2)) {
            break;
          }
          localObject2 = localObject1;
          i = j;
          if (str2.equals(str1)) {
            break;
          }
          x.d("MicroMsg.BakOldItemImg", "bigImgPath " + str2 + " " + com.tencent.mm.a.e.cm(str2));
          i = j + i.a(new i.a(str2, paramey, paramLinkedList, 2, false, null));
          localObject2 = localObject1;
          break;
          localObject2 = localObject1;
          break label535;
          j = ((com.tencent.mm.ak.e)localObject2).offset;
          break label543;
          k = ((com.tencent.mm.ak.e)localObject2).dHI;
          break label551;
          str1 = ((com.tencent.mm.ak.e)localObject2).dTL;
          break label561;
          m = ((com.tencent.mm.ak.e)localObject2).dTO;
          break label569;
          localObject2.equals(localObject1);
          str1 = "";
          j = i;
          continue;
          paramey.rcl = new bhz().VO(parambd);
          return i + parambd.length();
          j = i;
        }
        localObject2 = localObject1;
      }
    }
  }
  
  public final int a(String paramString, ey paramey, com.tencent.mm.storage.bd parambd)
  {
    if ((paramey == null) || (paramey.rcl == null))
    {
      x.e("MicroMsg.BakOldItemImg", "recover bakitem or bakitem content is null");
      return 0;
    }
    String str1 = new String(bi.aG(paramey.rcl.siM, ""));
    x.d("MicroMsg.BakOldItemImg", "recover msg" + paramey.rcq + " " + str1);
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
        break label632;
      }
      paramString = "";
      if (paramey.rfw != null) {
        break label643;
      }
      localObject1 = "";
      x.d("MicroMsg.BakOldItemImg", "recover bakitem:, buf:%d, BufferType:%d, MediaType%s, ids:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), paramString, localObject1 });
      paramString = null;
      parambd.setContent(str1);
      localg = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD();
      if (parambd.field_isSend != 1) {
        break label655;
      }
      if (parambd.field_msgId != 0L) {
        paramString = localg.br(parambd.field_msgId);
      }
      if ((paramString != null) && (paramString.dTK != 0L)) {
        break label1151;
      }
      paramString = localg.bq(parambd.field_msgSvrId);
    }
    label221:
    label632:
    label643:
    label655:
    label720:
    label1151:
    for (;;)
    {
      localObject1 = bl.z(str1, "msg");
      if ((localObject1 != null) && (bi.getLong((String)((Map)localObject1).get(".msg.img.$hdlength"), 0L) > 0L)) {}
      for (i = 1;; i = 0)
      {
        Object localObject3 = bi.aG(a.a(paramey, 3), "");
        if ((paramey.rfA == 3) && (paramey.rfy != null)) {
          com.tencent.mm.a.e.b(a.asK() + "backupMeida/" + a.wv((String)localObject3), (String)localObject3, paramey.rfy.siK.lR);
        }
        localObject1 = bi.aG(a.a(paramey, 2), "");
        if ((paramey.rfA == 2) && (paramey.rfy != null)) {
          com.tencent.mm.a.e.b(a.asK() + "backupMeida/" + a.wv((String)localObject1), (String)localObject1, paramey.rfy.siK.lR);
        }
        x.d("MicroMsg.BakOldItemImg", "hdName %s, imgName:%s", new Object[] { localObject3, localObject1 });
        if (bi.oW((String)localObject1))
        {
          x.e("MicroMsg.BakOldItemImg", "imgName is null, imgName = hdName");
          localObject1 = localObject3;
        }
        for (;;)
        {
          Object localObject2 = a.b(paramey, 1);
          Object localObject4;
          if (localObject2 == null)
          {
            x.i("MicroMsg.BakOldItemImg", "getThumbBuf is null and read from mediapath");
            localObject2 = a.wI((String)localObject1);
            str2 = com.tencent.mm.a.g.u((bi.VF() + " ").getBytes());
            localObject4 = a.asK() + "backupMeida/" + a.wv(str2);
            str3 = (String)localObject4 + str2;
            localObject4 = new File((String)localObject4);
            if (!((File)localObject4).exists()) {
              ((File)localObject4).mkdirs();
            }
            j = z.Wn(str3);
            if (j > 0)
            {
              if (z.a((String)localObject2, Bitmap.CompressFormat.JPEG, str3, j)) {
                break label720;
              }
              x.e("MicroMsg.BakOldItemImg", "createLongPictureThumbNail failed");
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
              x.e("MicroMsg.BakOldItemImg", "createThumbNail failed");
              return -1;
            }
            x.d("MicroMsg.BakOldItemImg", "insert: thumbName = " + str2);
            localObject2 = com.tencent.mm.a.e.f(str3, 0, -1);
          }
          while (localObject2 == null)
          {
            x.e("MicroMsg.BakOldItemImg", "img buf is null");
            return -1;
            x.i("MicroMsg.BakOldItemImg", "getThumbBuf len:%d", new Object[] { Integer.valueOf(localObject2.length) });
          }
          String str2 = localg.o((String)localObject3, "", "");
          String str3 = localg.o((String)localObject1, "", "");
          long l1 = 0L;
          if (paramString.dTK == 0L)
          {
            if (i != 0)
            {
              i = a.c(paramey, 3);
              l2 = localg.a((byte[])localObject2, paramey.rcq, true, (String)localObject3, i, str1, new PString(), new PInt(), new PInt());
              l1 = l2;
              if (!a.b(paramey, 3, str2))
              {
                x.e("MicroMsg.BakOldItemImg", "writeItem MMBAK_HD_IMG failed:%s", new Object[] { str2 });
                l1 = l2;
              }
            }
            j = a.c(paramey, 2);
            i = j;
            if (j <= 0) {
              i = a.c(paramey, 3);
            }
            paramString = new PString();
            localObject3 = new PInt();
            localObject4 = new PInt();
            long l2 = localg.a((byte[])localObject2, paramey.rcq, false, (String)localObject1, i, str1, paramString, (PInt)localObject3, (PInt)localObject4);
            if (!a.b(paramey, 2, str3)) {
              x.e("MicroMsg.BakOldItemImg", "writeItem MMBAK_IMG failed:%s", new Object[] { str2 });
            }
            if (l2 > 0L)
            {
              parambd.eq(paramString.value);
              parambd.fh(((PInt)localObject3).value);
              parambd.fi(((PInt)localObject4).value);
              if (l1 > 0L)
              {
                paramString = com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().b(Long.valueOf(l2));
                paramString.hM((int)l1);
                com.tencent.mm.plugin.backup.bakoldlogic.d.b.atl().atm().asD().a(Long.valueOf(l2), paramString);
              }
            }
          }
          for (;;)
          {
            d.i(parambd);
            return 0;
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
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
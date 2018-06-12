package com.tencent.mm.plugin.backup.e;

import android.text.TextUtils;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class b
  implements l
{
  private static boolean wx(String paramString)
  {
    int i = paramString.indexOf('<');
    String str = paramString;
    if (i > 0) {
      str = paramString.substring(i);
    }
    return bl.z(str, "msg") != null;
  }
  
  public final int a(ey paramey, boolean paramBoolean1, bd parambd, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    int j;
    int i;
    if (bi.oW(parambd.field_content))
    {
      j = 0;
      paramHashMap = an.YJ(parambd.field_content).taT.trim();
      paramString = paramHashMap;
      if (!wx(paramHashMap))
      {
        paramHashMap = parambd.field_content;
        paramString = paramHashMap;
        if (!wx(paramHashMap))
        {
          paramHashMap = a.a(parambd, paramey);
          paramString = paramHashMap;
          if (parambd.field_isSend != 1)
          {
            paramString = paramHashMap;
            if (com.tencent.mm.plugin.backup.g.c.fq(parambd.field_talker)) {
              paramString = parambd.field_talker + " :\n " + paramHashMap;
            }
          }
        }
      }
      if ((paramString != null) && (wx(paramString))) {
        break label174;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BackupItemEmoji", "emoji error" + paramString);
      i = -1;
    }
    label174:
    label234:
    do
    {
      do
      {
        do
        {
          return i;
          j = parambd.field_content.getBytes().length;
          break;
          paramHashMap = new bhz();
          paramHashMap.VO(bi.aG(paramString, ""));
          paramey.rcl = paramHashMap;
          parambd = com.tencent.mm.plugin.backup.g.d.asG().asH().asE().Zy(parambd.field_imgPath);
          if (parambd == null) {
            break label234;
          }
          i = j;
        } while (parambd.cny());
        i = j;
      } while (parambd == null);
      if (TextUtils.isEmpty(parambd.field_groupId))
      {
        paramString = com.tencent.mm.plugin.backup.g.d.asG().asH().Gg();
        paramString = paramString + parambd.Xh() + "_thumb";
        if (e.cm(paramString) < 0)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupItemEmoji", "thumbPath error");
          return -1;
        }
      }
      for (j = i.a(new i.a(paramString, paramey, paramLinkedList, 4, paramBoolean1, "_thumb", paramBoolean2)) + j; (TextUtils.isEmpty(parambd.field_groupId)) && (parambd.cnv()); j = i.a(new i.a(paramString, paramey, paramLinkedList, 4, paramBoolean1, "_thumb", paramBoolean2)) + j)
      {
        paramString = com.tencent.mm.plugin.backup.g.d.asG().asH().Gg();
        return j + i.a(new i.a(paramString + parambd.Xh(), paramey, paramLinkedList, 5, paramBoolean1, paramBoolean2, null));
        paramString = com.tencent.mm.plugin.backup.g.d.asG().asH().Gg();
        paramString = paramString + parambd.field_groupId + File.separator + parambd.Xh() + "_cover";
        if (e.cm(paramString) < 0)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupItemEmoji", "thumbPath error");
          return -1;
        }
      }
      i = j;
    } while (!parambd.cnx());
    paramString = com.tencent.mm.plugin.backup.g.d.asG().asH().Gg();
    return j + i.a(new i.a(paramString + parambd.field_groupId + File.separator + parambd.Xh(), paramey, paramLinkedList, 5, paramBoolean1, paramBoolean2, null));
  }
  
  public final int a(String paramString, ey paramey, bd parambd)
  {
    boolean bool = true;
    parambd.setContent(paramey.rcl.siM);
    paramString = paramey.rcj.siM;
    Object localObject1 = paramey.rck.siM;
    if (((String)com.tencent.mm.plugin.backup.g.d.asG().asH().DT().get(2, null)).equals(paramString)) {
      paramString = (String)localObject1;
    }
    for (;;)
    {
      localObject2 = paramey.rcl.siM;
      localObject1 = bl.z((String)localObject2, "msg");
      paramString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().cu((String)localObject2, paramString);
      if (paramString != null) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupItemEmoji", "EmojiMsgInfo is null");
      return -1;
    }
    Object localObject2 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(paramString.bKg);
    if (localObject2 == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupItemEmoji", "EmojiInfo is null");
      return -1;
    }
    if (((Map)localObject1).get(".msg.emoji.$androidmd5") == null)
    {
      localObject3 = a.wC(paramString.bKg);
      if (!bi.oW((String)localObject3))
      {
        paramString.bKg = ((String)localObject3);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BackupItemEmoji", "convert ip to android md5 %s", new Object[] { localObject3 });
      }
    }
    localObject1 = (String)((Map)localObject1).get(".msg.emoji.$productid");
    if (!TextUtils.isEmpty((CharSequence)localObject1)) {
      paramString.bKk = ((String)localObject1);
    }
    parambd.setType(47);
    parambd.eq(paramString.bKg);
    Object localObject3 = paramString.enF;
    if ((!((EmojiInfo)localObject2).aaq()) && (!((EmojiInfo)localObject2).isGif()))
    {
      parambd.setContent(an.a((String)localObject3, 0L, bool, paramString.bKg, false, ""));
      if (!((EmojiInfo)localObject2).cnv())
      {
        localObject2 = com.tencent.mm.plugin.backup.g.d.asG().asH().Gg();
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          break label518;
        }
        com.tencent.mm.plugin.backup.a.g.b(paramey, 4, (String)localObject2 + paramString.bKg + "_thumb");
        com.tencent.mm.plugin.backup.a.g.b(paramey, 5, (String)localObject2 + paramString.bKg);
      }
    }
    for (;;)
    {
      paramey = new EmojiInfo((String)localObject2);
      paramey.field_md5 = paramString.bKg;
      paramey.field_svrid = paramString.id;
      paramey.field_catalog = EmojiInfo.tcB;
      paramey.field_type = paramString.taZ;
      paramey.field_size = paramString.tba;
      paramey.field_state = EmojiInfo.tcN;
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramey.field_groupId = ((String)localObject1);
      }
      if (!bi.oW(paramString.tbi)) {
        paramey.field_activityid = paramString.tbi;
      }
      com.tencent.mm.plugin.backup.g.d.asG().asH().asE().a(paramey);
      long l = com.tencent.mm.plugin.backup.g.c.i(parambd);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BackupItemEmoji", "id " + l);
      return 0;
      bool = false;
      break;
      label518:
      localObject3 = new File((String)localObject2 + (String)localObject1);
      if (!((File)localObject3).exists()) {
        ((File)localObject3).mkdirs();
      }
      com.tencent.mm.plugin.backup.a.g.b(paramey, 4, (String)localObject2 + (String)localObject1 + File.separator + paramString.bKg + "_cover");
      com.tencent.mm.plugin.backup.a.g.b(paramey, 5, (String)localObject2 + (String)localObject1 + File.separator + paramString.bKg);
    }
  }
  
  private static final class a
  {
    public static String gVL = "<msg>";
    public static String gVM = "</msg>";
    
    public static String a(bd parambd, ey paramey)
    {
      EmojiInfo localEmojiInfo = com.tencent.mm.plugin.backup.g.d.asG().asH().asE().Zy(parambd.field_imgPath);
      if (localEmojiInfo == null) {
        return null;
      }
      Object localObject = k.wE(localEmojiInfo.Xh());
      parambd = (bd)localObject;
      if (localObject == null) {
        parambd = new k.a(localEmojiInfo.Xh(), localEmojiInfo.Xh(), localEmojiInfo.Xh(), localEmojiInfo.Xh());
      }
      localObject = new StringWriter();
      try
      {
        XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput((Writer)localObject);
        localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(true));
        localXmlSerializer.startTag(null, "msg");
        localXmlSerializer.startTag(null, "emoji");
        localXmlSerializer.attribute(null, "fromusername", paramey.rcj.siM);
        localXmlSerializer.attribute(null, "tousername", paramey.rck.siM);
        localXmlSerializer.attribute(null, "type", localEmojiInfo.field_type);
        localXmlSerializer.attribute(null, "idbuffer", localEmojiInfo.cnC());
        localXmlSerializer.attribute(null, "md5", parambd.gWk);
        localXmlSerializer.attribute(null, "len", "1024");
        localXmlSerializer.attribute(null, "androidmd5", parambd.gWj);
        localXmlSerializer.attribute(null, "androidlen", "1024");
        localXmlSerializer.attribute(null, "productid", localEmojiInfo.field_groupId);
        localXmlSerializer.endTag(null, "emoji");
        if (localEmojiInfo.aaq())
        {
          localXmlSerializer.startTag(null, "gameext");
          paramey = bl.z(localEmojiInfo.getContent(), "gameext");
          parambd = bi.aG((String)paramey.get(".gameext.$type"), "");
          paramey = bi.aG((String)paramey.get(".gameext.$content"), "");
          if ((parambd.equals("")) || (paramey.equals("")))
          {
            ((StringWriter)localObject).close();
            return "";
          }
          localXmlSerializer.attribute(null, "type", parambd);
          localXmlSerializer.attribute(null, "content", paramey);
          localXmlSerializer.endTag(null, "gameext");
        }
        localXmlSerializer.endTag(null, "msg");
        localXmlSerializer.endDocument();
        ((StringWriter)localObject).flush();
        ((StringWriter)localObject).close();
        parambd = ((StringWriter)localObject).getBuffer().toString();
        try
        {
          parambd = parambd.substring(parambd.indexOf(gVL), parambd.indexOf(gVM) + gVM.length());
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EmojiConvert", "xml " + parambd);
          return parambd;
        }
        catch (Exception parambd)
        {
          return "";
        }
        return "";
      }
      catch (XmlPullParserException parambd)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.EmojiConvert", parambd, "", new Object[0]);
        return "";
      }
      catch (IllegalArgumentException parambd)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.EmojiConvert", parambd, "", new Object[0]);
        return "";
      }
      catch (IllegalStateException parambd)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.EmojiConvert", parambd, "", new Object[0]);
        return "";
      }
      catch (IOException parambd)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.EmojiConvert", parambd, "", new Object[0]);
      }
    }
    
    public static String wC(String paramString)
    {
      paramString = k.wD(paramString);
      if (paramString == null) {
        return null;
      }
      return paramString.gWj;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
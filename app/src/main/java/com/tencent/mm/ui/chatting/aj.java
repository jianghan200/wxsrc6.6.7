package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.net.Uri;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.iy.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.y.g.a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class aj
{
  private ab bTk = null;
  private Context context;
  private SimpleDateFormat gVk = new SimpleDateFormat("yyyy-MM-dd");
  String juM = null;
  List<com.tencent.mm.storage.bd> tIM;
  private String tME = null;
  ArrayList<Uri> tMF = new ArrayList();
  
  public aj(Context paramContext, List<com.tencent.mm.storage.bd> paramList, ab paramab)
  {
    this.context = paramContext;
    this.tIM = paramList;
    this.bTk = paramab;
  }
  
  private String aG(com.tencent.mm.storage.bd parambd)
  {
    String str = null;
    if (!this.bTk.field_username.endsWith("@chatroom")) {
      str = r.gT(parambd.field_talker);
    }
    for (;;)
    {
      if (parambd.field_isSend == 1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OtherMailHistoryExporter", "isSend");
        str = q.GH();
      }
      long l = parambd.field_createTime;
      parambd = new SimpleDateFormat("HH:mm").format(new Date(l));
      Object localObject = new StringBuilder("");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("  ");
      ((StringBuilder)localObject).append(parambd);
      return ((StringBuilder)localObject).toString();
      localObject = parambd.field_content;
      int i = com.tencent.mm.model.bd.iA((String)localObject);
      if (i != -1) {
        str = r.gT(((String)localObject).substring(0, i).trim());
      }
    }
  }
  
  private String cuk()
  {
    Object localObject;
    if (!this.bTk.field_username.endsWith("@chatroom"))
    {
      str1 = this.context.getString(R.l.send_mail_content_start_msg);
      localObject = this.bTk.BK();
      au.HU();
      return String.format(str1, new Object[] { localObject, com.tencent.mm.model.c.DT().get(4, null) });
    }
    if (bi.oW(this.bTk.field_nickname))
    {
      localObject = m.gI(this.bTk.field_username).iterator();
      String str2;
      for (str1 = ""; ((Iterator)localObject).hasNext(); str1 = str1 + str2 + ", ") {
        str2 = r.gT((String)((Iterator)localObject).next());
      }
    }
    for (String str1 = str1.substring(0, str1.length() - 2);; str1 = this.bTk.BK()) {
      return String.format(this.context.getString(R.l.send_mail_content_room_start_msg), new Object[] { str1 });
    }
  }
  
  private String gw(long paramLong)
  {
    return this.gVk.format(new Date(paramLong));
  }
  
  public final String cuj()
  {
    if (this.juM == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.OtherMailHistoryExporter", "export: history is null? %B, selectItems.size = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tIM.size()) });
      if (this.juM == null) {
        break;
      }
      return this.juM;
    }
    this.tMF.clear();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(cuk());
    localStringBuilder.append("\n\n");
    Iterator localIterator = this.tIM.iterator();
    com.tencent.mm.storage.bd localbd;
    label178:
    Object localObject1;
    if (localIterator.hasNext())
    {
      localbd = (com.tencent.mm.storage.bd)localIterator.next();
      if (this.tME == null)
      {
        this.tME = gw(localbd.field_createTime);
        localStringBuilder.append(String.format("—————  %s  —————\n\n", new Object[] { this.tME }));
        localStringBuilder.append("\n");
        if (!localbd.isText()) {
          break label415;
        }
        if (!localbd.isText()) {
          break label409;
        }
        if (localbd.field_isSend != 1) {
          break label307;
        }
        localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aG(localbd), localbd.field_content });
      }
    }
    for (;;)
    {
      localStringBuilder.append((String)localObject1);
      break;
      localObject1 = gw(localbd.field_createTime);
      if (((String)localObject1).equals(this.tME)) {
        break label178;
      }
      this.tME = ((String)localObject1);
      localStringBuilder.append(String.format("—————  %s  —————\n\n", new Object[] { this.tME }));
      localStringBuilder.append("\n");
      break label178;
      label307:
      if (!this.bTk.field_username.endsWith("@chatroom"))
      {
        localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aG(localbd), localbd.field_content });
      }
      else
      {
        int i = com.tencent.mm.model.bd.iA(localbd.field_content);
        if (i != -1)
        {
          localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aG(localbd), localbd.field_content.substring(i + 1).trim() });
          continue;
          label409:
          localObject1 = null;
          continue;
          label415:
          Object localObject2;
          if (localbd.ckA())
          {
            if (localbd.ckA())
            {
              long l1 = localbd.field_msgId;
              long l2 = localbd.field_msgSvrId;
              localObject2 = ae.gu(l1);
              localObject1 = localObject2;
              if (bi.oW((String)localObject2)) {
                localObject1 = ae.gv(l2);
              }
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.OtherMailHistoryExporter", "hdPath[%s]", new Object[] { localObject1 });
              if (!bi.oW((String)localObject1))
              {
                localObject2 = "file://" + (String)localObject1;
                this.tMF.add(Uri.parse((String)localObject2));
                localObject1 = String.format("[%s: %s(%s)]", new Object[] { this.context.getString(R.l.email_image_prompt), new File((String)localObject1).getName(), this.context.getString(R.l.email_attach_tips) });
              }
            }
            for (localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aG(localbd), localObject1 });; localObject1 = null)
            {
              localStringBuilder.append((String)localObject1);
              break;
            }
          }
          if (localbd.ckz()) {
            localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.email_voice_prompt) });
          }
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.OtherMailHistoryExporter", "formatOtherMsg, msgStr = %s", new Object[] { localObject1 });
            localStringBuilder.append(String.format("%s\n\n%s\n\n", new Object[] { aG(localbd), localObject1 }));
            break;
            if (localbd.cme())
            {
              if (localbd.field_isSend == 1) {
                localObject1 = this.context.getString(R.l.email_send_voip_prompt);
              } else {
                localObject1 = this.context.getString(R.l.email_receive_voip_prompt);
              }
            }
            else if (localbd.aQo())
            {
              localObject1 = new iy();
              ((iy)localObject1).bSB.bSv = 1;
              ((iy)localObject1).bSB.bGS = localbd;
              a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
              localObject1 = String.format("[%s]", new Object[] { ((iy)localObject1).bSC.bPu });
            }
            else
            {
              if (localbd.aQm())
              {
                localObject1 = g.a.gp(bi.WT(localbd.field_content));
                if (localObject1 != null)
                {
                  switch (((g.a)localObject1).type)
                  {
                  }
                  for (;;)
                  {
                    localObject2 = g.bl(((g.a)localObject1).appId, true);
                    if (localObject2 != null) {
                      break label959;
                    }
                    localObject1 = "";
                    break;
                    localObject2 = ao.asF().SR(((g.a)localObject1).bGP);
                    if (localObject2 != null)
                    {
                      localObject2 = new File(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
                      if (((File)localObject2).exists()) {
                        this.tMF.add(Uri.fromFile((File)localObject2));
                      }
                    }
                  }
                  label959:
                  localObject2 = ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appName;
                  if (6 == ((g.a)localObject1).type)
                  {
                    localObject1 = String.format("[%s: %s(%s)]", new Object[] { this.context.getString(R.l.email_appmsg_prompt), localObject2, this.context.getString(R.l.email_attach_tips) });
                    continue;
                  }
                  localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(R.l.email_appmsg_prompt), localObject2 });
                }
              }
              else
              {
                if (localbd.cmi())
                {
                  au.HU();
                  localObject1 = com.tencent.mm.model.c.FT().GR(localbd.field_content).nickname;
                  localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(R.l.email_card_prompt), localObject1 });
                  continue;
                }
                if (localbd.cmj())
                {
                  localObject1 = this.context.getString(R.l.email_video_prompt);
                  o.Ta();
                  localObject2 = String.format("[%s: %s(%s)]", new Object[] { localObject1, new File(s.nK(localbd.field_imgPath)).getName(), this.context.getString(R.l.email_attach_tips) });
                  o.Ta();
                  File localFile = new File(s.nK(localbd.field_imgPath));
                  localObject1 = localObject2;
                  if (!localFile.exists()) {
                    continue;
                  }
                  this.tMF.add(Uri.fromFile(localFile));
                  localObject1 = localObject2;
                  continue;
                }
                if ((localbd.cml()) || (localbd.cmm()))
                {
                  localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.email_emoji_prompt) });
                  continue;
                  localStringBuilder.append("\n\n");
                  this.juM = localStringBuilder.toString();
                  return this.juM;
                }
              }
              localObject1 = null;
            }
          }
        }
        else
        {
          localObject1 = null;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
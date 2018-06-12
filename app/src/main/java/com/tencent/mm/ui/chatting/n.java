package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n
{
  public static boolean a(com.tencent.mm.ui.chatting.c.a parama, List<bd> paramList, ab paramab)
  {
    if (parama == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingEditModeSendToMail", "do send to mail fail, context is null");
      return false;
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingEditModeSendToMail", "do send to mail fail, select item empty");
      return false;
    }
    if ((paramab == null) || ((int)paramab.dhP <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingEditModeSendToMail", "do send to mail fail, contact error");
      return false;
    }
    return b(parama, paramList, paramab);
  }
  
  private static boolean b(com.tencent.mm.ui.chatting.c.a parama, List<bd> paramList, ab paramab)
  {
    String str;
    Object localObject2;
    label138:
    Object localObject3;
    if (!paramab.field_username.endsWith("@chatroom"))
    {
      str = parama.tTq.getMMResources().getString(R.l.send_mail_subject);
      localObject1 = paramab.BK();
      au.HU();
      str = String.format(str, new Object[] { localObject1, com.tencent.mm.model.c.DT().get(4, null) });
      h.mEJ.h(10811, new Object[] { Integer.valueOf(7), Integer.valueOf(paramList.size()) });
      if ((q.GQ() & 0x1) != 0) {
        break label615;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingEditModeSendToMail", "use qq mail plugin to send mail");
      localObject1 = new ArrayList();
      localObject2 = new ArrayList();
      Iterator localIterator = paramList.iterator();
      if (!localIterator.hasNext()) {
        break label496;
      }
      localObject3 = (bd)localIterator.next();
      if (!((bd)localObject3).cmj()) {
        break label369;
      }
      o.Ta();
      ((List)localObject1).add(s.nK(((cm)localObject3).field_imgPath));
      ((List)localObject2).add(null);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingEditModeSendToMail", "file path = " + localObject1 + "file name = " + localObject2);
      break label138;
      if (bi.oW(paramab.field_nickname))
      {
        localObject1 = m.gI(paramab.field_username).iterator();
        for (str = ""; ((Iterator)localObject1).hasNext(); str = str + (String)localObject2 + ", ") {
          localObject2 = r.gT((String)((Iterator)localObject1).next());
        }
      }
      for (str = str.substring(0, str.length() - 2);; str = paramab.BK())
      {
        str = String.format(parama.tTq.getMMResources().getString(R.l.send_mail_suject_room), new Object[] { str });
        break;
      }
      label369:
      if (((bd)localObject3).aQm())
      {
        localObject3 = g.a.gp(((cm)localObject3).field_content);
        if (localObject3 == null) {
          break label138;
        }
        switch (((g.a)localObject3).type)
        {
        case 5: 
        default: 
          break;
        case 4: 
        case 6: 
          Object localObject4 = ao.asF().SR(((g.a)localObject3).bGP);
          if (localObject4 == null) {
            break label138;
          }
          localObject4 = new File(((b)localObject4).field_fileFullPath);
          if (((File)localObject4).exists())
          {
            ((List)localObject1).add(((File)localObject4).getAbsolutePath());
            ((List)localObject2).add(((g.a)localObject3).title);
          }
          break;
        }
      }
    }
    label496:
    paramList = new QQMailHistoryExporter(parama.tTq.getContext(), paramList, paramab).cuj();
    paramab = new Intent();
    paramab.putExtra("mail_mode", 6);
    paramab.putExtra("mail_content", paramList);
    paramab.putExtra("subject", str);
    paramab.putExtra("show_qqmail", true);
    paramab.putStringArrayListExtra("mail_attach", (ArrayList)localObject1);
    paramab.putStringArrayListExtra("mail_attach_title", (ArrayList)localObject2);
    d.a(parama.tTo, "qqmail", ".ui.ComposeUI", paramab, 220, new n.1(parama));
    return false;
    label615:
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingEditModeSendToMail", "use order mail app to send mail");
    paramList = new aj(parama.tTq.getContext(), paramList, paramab);
    Object localObject1 = paramList.cuj();
    paramab = new Intent("android.intent.action.SEND_MULTIPLE");
    paramab.setType("message/rfc822");
    paramab.putExtra("android.intent.extra.SUBJECT", str);
    paramab.putExtra("android.intent.extra.TEXT", (String)localObject1);
    boolean bool;
    if (paramList.juM == null) {
      bool = true;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.OtherMailHistoryExporter", "get image attach: history is null? %B, selectItems.size = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramList.tIM.size()) });
      if (paramList.juM != null)
      {
        paramList = paramList.tMF;
        paramab.putParcelableArrayListExtra("android.intent.extra.STREAM", paramList);
      }
      try
      {
        parama.tTq.startActivity(Intent.createChooser(paramab, parama.tTq.getContext().getString(R.l.send_mail_selector)));
        return true;
        bool = false;
        continue;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.OtherMailHistoryExporter", "had not exported, do export first");
        paramList.cuj();
        paramList = paramList.tMF;
      }
      catch (ActivityNotFoundException paramList)
      {
        for (;;)
        {
          Toast.makeText(parama.tTq.getContext(), R.l.send_no_email_app, 0).show();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
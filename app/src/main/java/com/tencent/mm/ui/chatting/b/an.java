package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.chatting.b.b.af;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.util.ArrayList;

@com.tencent.mm.ui.chatting.b.a.a(cwo=af.class)
public class an
  extends a
  implements af
{
  private long tTb = -1L;
  private SparseBooleanArray tTc = new SparseBooleanArray();
  
  private void U(Intent paramIntent)
  {
    com.tencent.mm.modelvideo.c localc = new com.tencent.mm.modelvideo.c();
    localc.a(this.bAG.tTq.getContext(), paramIntent, new an.7(this));
    paramIntent = this.bAG;
    Activity localActivity = this.bAG.tTq.getContext();
    this.bAG.tTq.getMMResources().getString(R.l.app_tip);
    paramIntent.d(localActivity, this.bAG.tTq.getMMResources().getString(R.l.app_waiting), new an.8(this, localc));
  }
  
  private void ag(ArrayList<String> paramArrayList)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ChattingUI.VideoComponent", "send video path: %s", new Object[] { paramArrayList.toString() });
    paramArrayList = new j(this.bAG.tTq.getContext(), paramArrayList, null, this.bAG.getTalkerUserName(), 2, new an.4(this));
    com.tencent.mm.ui.chatting.c.a locala = this.bAG;
    Activity localActivity = this.bAG.tTq.getContext();
    this.bAG.tTq.getMMResources().getString(R.l.app_tip);
    locala.d(localActivity, this.bAG.tTq.getMMResources().getString(R.l.app_waiting), new an.5(this, paramArrayList));
    com.tencent.mm.sdk.f.e.post(paramArrayList, "ChattingUI_importMultiVideo");
  }
  
  private void ay(Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.VideoComponent", "sendVideoFromCustomRecord");
    if (paramIntent == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VideoComponent", "data == null");
    }
    Object localObject;
    String str;
    int i;
    do
    {
      return;
      localObject = paramIntent.getStringExtra("VideoRecorder_ToUser");
      str = paramIntent.getStringExtra("VideoRecorder_FileName");
      i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VideoComponent", "fileName " + str + " length " + i + " user " + (String)localObject);
    } while ((bi.oW((String)localObject)) || (bi.oW(str)) || (i < 0));
    if ((((String)localObject).equals("medianote")) && ((q.GJ() & 0x4000) == 0))
    {
      paramIntent = new r();
      paramIntent.fileName = str;
      paramIntent.enM = i;
      paramIntent.bWJ = ((String)localObject);
      paramIntent.enF = ((String)com.tencent.mm.kernel.g.Ei().DT().get(2, ""));
      paramIntent.createTime = bi.VE();
      paramIntent.enK = bi.VE();
      paramIntent.enH = i;
      paramIntent.emu = i;
      o.Ta();
      i = com.tencent.mm.modelvideo.s.nM(com.tencent.mm.modelvideo.s.nK(str));
      if (i <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "get Video size failed :" + str);
        return;
      }
      paramIntent.dHI = i;
      o.Ta();
      localObject = com.tencent.mm.modelvideo.s.nL(str);
      i = com.tencent.mm.modelvideo.s.nM((String)localObject);
      if (i <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "get Thumb size failed :" + (String)localObject + " size:" + i);
        return;
      }
      paramIntent.enJ = i;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "init record file:" + str + " thumbsize:" + paramIntent.enJ + " videosize:" + paramIntent.dHI);
      paramIntent.status = 199;
      localObject = new com.tencent.mm.storage.bd();
      ((com.tencent.mm.storage.bd)localObject).ep(paramIntent.Tj());
      ((com.tencent.mm.storage.bd)localObject).setType(43);
      ((com.tencent.mm.storage.bd)localObject).eX(1);
      ((com.tencent.mm.storage.bd)localObject).eq(str);
      ((com.tencent.mm.storage.bd)localObject).setStatus(2);
      ((com.tencent.mm.storage.bd)localObject).ay(com.tencent.mm.model.bd.iD(paramIntent.Tj()));
      paramIntent.enN = ((int)com.tencent.mm.model.bd.i((com.tencent.mm.storage.bd)localObject));
      o.Ta().a(paramIntent);
      return;
    }
    t.b(str, i, (String)localObject, null);
    t.nR(str);
    this.bAG.lT(true);
  }
  
  private void jdMethod_do(final String paramString, final int paramInt)
  {
    au.Em().H(new Runnable()
    {
      public final void run()
      {
        t.W(paramString, paramInt);
      }
    });
  }
  
  public final void T(Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.VideoComponent", "sendVideo");
    if (!ab.bU(this.bAG.tTq.getContext()))
    {
      com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), R.l.video_export_file_warning, R.l.app_tip, new an.6(this, paramIntent), null);
      return;
    }
    U(paramIntent);
  }
  
  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.storage.bd parambd)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
    case 106: 
    case 107: 
      for (;;)
      {
        return false;
        paramMenuItem = o.Ta().nI(parambd.field_imgPath);
        if (paramMenuItem != null) {
          if (paramMenuItem.status == 199)
          {
            o.Ta();
            parambd = com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath);
            if (paramMenuItem != null)
            {
              i = 0;
              if (com.tencent.mm.model.s.fq(paramMenuItem.Tj())) {
                i = m.gK(paramMenuItem.Tj());
              }
              com.tencent.mm.plugin.report.service.h.mEJ.a(106L, 215L, 1L, false);
              com.tencent.mm.plugin.report.service.h.mEJ.h(12084, new Object[] { Integer.valueOf(paramMenuItem.dHI), Integer.valueOf(paramMenuItem.enM * 1000), Integer.valueOf(0), Integer.valueOf(2), paramMenuItem.Tj(), Integer.valueOf(i), r.nH(paramMenuItem.Tm()), Long.valueOf(paramMenuItem.createTime) });
            }
            paramMenuItem = t.nX(parambd);
            if (bi.oW(paramMenuItem)) {
              Toast.makeText(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.video_file_save_failed), 1).show();
            }
          }
        }
        for (;;)
        {
          return true;
          Toast.makeText(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.video_file_saved, new Object[] { paramMenuItem }), 1).show();
          l.a(paramMenuItem, this.bAG.tTq.getContext());
          continue;
          jdMethod_do(paramMenuItem.getFileName(), 6);
          paramMenuItem = new Intent(this.bAG.tTq.getContext(), ImageGalleryUI.class);
          paramMenuItem.putExtra("img_gallery_msg_id", parambd.field_msgId);
          paramMenuItem.putExtra("img_gallery_msg_svr_id", parambd.field_msgSvrId);
          paramMenuItem.putExtra("img_gallery_talker", parambd.field_talker);
          paramMenuItem.putExtra("img_gallery_chatroom_name", parambd.field_talker);
          paramMenuItem.putExtra("img_gallery_enter_video_opcode", t.e(parambd.field_msgId, 2));
          i.a(this.bAG, parambd, paramMenuItem);
          this.bAG.tTq.startActivity(paramMenuItem);
          this.bAG.tTq.overridePendingTransition(0, 0);
          continue;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VideoComponent", "save video but videoInfo is null!");
        }
        au.HU();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          com.tencent.mm.ui.base.s.gH(this.bAG.tTq.getContext());
        }
        else
        {
          paramMenuItem = t.nW(parambd.field_imgPath);
          if (paramMenuItem != null)
          {
            if (parambd.cmu())
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "video is clean!!!");
              com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getContext().getString(R.l.video_clean), this.bAG.tTq.getContext().getString(R.l.app_tip), new an.2(this));
            }
            else
            {
              o.Ta();
              if (i.e(parambd, com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath)))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "video is expired");
                jdMethod_do(paramMenuItem.getFileName(), 3);
                localIntent = new Intent(this.bAG.tTq.getContext(), ImageGalleryUI.class);
                localIntent.putExtra("img_gallery_msg_id", parambd.field_msgId);
                localIntent.putExtra("img_gallery_msg_svr_id", parambd.field_msgSvrId);
                localIntent.putExtra("img_gallery_talker", parambd.field_talker);
                localIntent.putExtra("img_gallery_chatroom_name", parambd.field_talker);
                localIntent.putExtra("img_gallery_enter_video_opcode", t.e(parambd.field_msgId, 1));
                i.a(this.bAG, parambd, localIntent);
                this.bAG.tTq.startActivity(localIntent);
                this.bAG.tTq.overridePendingTransition(0, 0);
                if (paramMenuItem.To())
                {
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "start complete online video");
                  t.oa(parambd.field_imgPath);
                }
                else
                {
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "start complete offline video");
                  t.nS(parambd.field_imgPath);
                }
              }
              else
              {
                if (paramMenuItem.status == 199)
                {
                  localIntent = new Intent(this.bAG.tTq.getContext(), MsgRetransmitUI.class);
                  localIntent.putExtra("Retr_length", paramMenuItem.enM);
                  localIntent.putExtra("Retr_File_Name", parambd.field_imgPath);
                  localIntent.putExtra("Retr_video_isexport", paramMenuItem.enQ);
                  localIntent.putExtra("Retr_Msg_Id", parambd.field_msgId);
                  localIntent.putExtra("Retr_From", "chattingui");
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.VideoComponent", "dkvideo msg.getType():" + parambd.getType());
                  if (parambd.cmk()) {
                    localIntent.putExtra("Retr_Msg_Type", 11);
                  }
                  for (;;)
                  {
                    this.bAG.tTq.startActivity(localIntent);
                    break;
                    localIntent.putExtra("Retr_Msg_Type", 1);
                  }
                }
                if ((parambd.cmj()) || (parambd.cmk()))
                {
                  jdMethod_do(paramMenuItem.getFileName(), 3);
                  localIntent = new Intent(this.bAG.tTq.getContext(), ImageGalleryUI.class);
                  localIntent.putExtra("img_gallery_msg_id", parambd.field_msgId);
                  localIntent.putExtra("img_gallery_msg_svr_id", parambd.field_msgSvrId);
                  localIntent.putExtra("img_gallery_talker", parambd.field_talker);
                  localIntent.putExtra("img_gallery_chatroom_name", parambd.field_talker);
                  localIntent.putExtra("img_gallery_enter_video_opcode", t.e(parambd.field_msgId, 1));
                  i.a(this.bAG, parambd, localIntent);
                  this.bAG.tTq.startActivity(localIntent);
                  this.bAG.tTq.overridePendingTransition(0, 0);
                  if (paramMenuItem.To())
                  {
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "start complete online video");
                    t.oa(parambd.field_imgPath);
                  }
                  else
                  {
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "start complete offline video");
                    t.nS(parambd.field_imgPath);
                  }
                }
                else
                {
                  com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingUI.VideoComponent", "retranmist video unknow status.");
                }
              }
            }
          }
          else {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VideoComponent", "retransmit video but videoInfo is null!");
          }
        }
      }
    }
    Intent localIntent = paramMenuItem.getIntent();
    int j = 0;
    int i = 0;
    paramMenuItem = new int[2];
    if (localIntent == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VideoComponent", "[LONGCLICK_MENU_MUTE_PLAY] intent is null!");
    }
    for (;;)
    {
      localIntent = new Intent(this.bAG.tTq.getContext(), ImageGalleryUI.class);
      localIntent.putExtra("img_gallery_msg_id", parambd.field_msgId);
      localIntent.putExtra("img_gallery_msg_svr_id", parambd.field_msgSvrId);
      localIntent.putExtra("img_gallery_talker", parambd.field_talker);
      localIntent.putExtra("img_gallery_chatroom_name", parambd.field_talker);
      localIntent.putExtra("img_gallery_left", paramMenuItem[0]);
      localIntent.putExtra("img_gallery_top", paramMenuItem[1]);
      localIntent.putExtra("img_gallery_width", j);
      localIntent.putExtra("img_gallery_height", i);
      localIntent.putExtra("img_gallery_enter_video_opcode", t.e(parambd.field_msgId, 3));
      i.a(this.bAG, parambd, localIntent);
      this.bAG.tTq.startActivity(localIntent);
      this.bAG.tTq.overridePendingTransition(0, 0);
      return true;
      j = localIntent.getIntExtra("img_gallery_width", 0);
      i = localIntent.getIntExtra("img_gallery_height", 0);
      paramMenuItem[0] = localIntent.getIntExtra("img_gallery_left", 0);
      paramMenuItem[1] = localIntent.getIntExtra("img_gallery_top", 0);
    }
  }
  
  public final void ax(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    paramIntent = paramIntent.getStringArrayListExtra("key_select_video_list");
    if ((paramIntent != null) && (paramIntent.size() > 0))
    {
      if (!ab.bU(this.bAG.tTq.getContext()))
      {
        com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), R.l.video_export_file_warning, R.l.app_tip, new an.3(this, paramIntent), null);
        return;
      }
      ag(paramIntent);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VideoComponent", "send video list is null or nil");
  }
  
  public final void cpI()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingResume]");
    com.tencent.mm.ui.chatting.b.b.g localg = (com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class);
    o.Ta().a(localg.ctQ(), au.Em().lnJ.getLooper());
  }
  
  public final void cpJ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingPause]");
    com.tencent.mm.ui.chatting.b.b.g localg = (com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class);
    o.Ta().a(localg.ctQ());
  }
  
  public final void cpK()
  {
    b.Fm();
    this.tTc.clear();
  }
  
  public final boolean g(com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    boolean bool;
    if (parambd.cmj())
    {
      o.Ta();
      bool = paramBoolean;
      if (!FileOp.cn(com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath))) {
        bool = false;
      }
    }
    do
    {
      do
      {
        return bool;
        bool = paramBoolean;
      } while (!parambd.cmk());
      o.Ta();
      bool = paramBoolean;
    } while (FileOp.cn(com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath)));
    return false;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default: 
    case 208: 
    case 215: 
    case 216: 
    case 218: 
      do
      {
        return;
        T(paramIntent);
        return;
        T(paramIntent);
        return;
        ay(paramIntent);
        return;
      } while (paramIntent == null);
      if (paramIntent.getBooleanExtra("from_record", false))
      {
        ay(paramIntent);
        return;
      }
      T(paramIntent);
      return;
    }
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingUI.VideoComponent", "[dealWithRequestCode] REQUEST_SIGHT_CAPTURE! null == data");
      return;
    }
    paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingUI.VideoComponent", "[dealWithRequestCode] REQUEST_SIGHT_CAPTURE! null == captureResult");
      return;
    }
    if (!paramIntent.lec)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "video path %s thumb path ", new Object[] { paramIntent.lee, paramIntent.lef });
      o.Ta();
      String str = com.tencent.mm.modelvideo.s.nK(paramIntent.leg);
      if (!paramIntent.lee.equals(str))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VideoComponent", "filepath not videopath and move it %s %s", new Object[] { paramIntent.lee, str });
        FileOp.av(paramIntent.lee, str);
      }
      str = paramIntent.leg;
      paramInt1 = paramIntent.lei;
      Object localObject = this.bAG.getTalkerUserName();
      aso localaso = paramIntent.lej;
      r localr = new r();
      localr.fileName = str;
      localr.enM = paramInt1;
      localr.bWJ = ((String)localObject);
      localr.enF = ((String)com.tencent.mm.kernel.g.Ei().DT().get(2, ""));
      localr.createTime = bi.VE();
      localr.enK = bi.VE();
      localr.enW = localaso;
      localr.enQ = 0;
      localr.enT = 1;
      o.Ta();
      paramInt1 = com.tencent.mm.modelvideo.s.nM(com.tencent.mm.modelvideo.s.nK(str));
      boolean bool;
      if (paramInt1 <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "get Video size failed :" + str);
        bool = false;
      }
      while (bool)
      {
        t.nR(paramIntent.leg);
        return;
        localr.dHI = paramInt1;
        o.Ta();
        localObject = com.tencent.mm.modelvideo.s.nL(str);
        paramInt1 = com.tencent.mm.modelvideo.s.nM((String)localObject);
        if (paramInt1 <= 0)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "get Thumb size failed :" + (String)localObject + " size:" + paramInt1);
          bool = false;
        }
        else
        {
          localr.enJ = paramInt1;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "prepareMMSightRecord file:" + str + " thumbsize:" + localr.enJ + " videosize:" + localr.dHI);
          localr.status = 102;
          localObject = new com.tencent.mm.storage.bd();
          ((com.tencent.mm.storage.bd)localObject).ep(localr.Tj());
          ((com.tencent.mm.storage.bd)localObject).setType(43);
          ((com.tencent.mm.storage.bd)localObject).eX(1);
          ((com.tencent.mm.storage.bd)localObject).eq(str);
          ((com.tencent.mm.storage.bd)localObject).setStatus(1);
          ((com.tencent.mm.storage.bd)localObject).ay(com.tencent.mm.model.bd.iD(localr.Tj()));
          localr.enN = ((int)com.tencent.mm.model.bd.i((com.tencent.mm.storage.bd)localObject));
          bool = o.Ta().a(localr);
        }
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VideoComponent", "prepareMMSightRecord failed");
      return;
    }
    ((com.tencent.mm.ui.chatting.b.b.x)this.bAG.O(com.tencent.mm.ui.chatting.b.b.x.class)).a(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/b/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
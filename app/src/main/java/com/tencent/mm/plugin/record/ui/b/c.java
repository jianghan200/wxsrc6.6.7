package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.f;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.plugin.record.ui.RecordMsgFileUI;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.Map;

public final class c
  implements h.b
{
  public static Map<String, View> mtG = new HashMap();
  private View.OnClickListener iZP = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      com.tencent.mm.plugin.record.ui.a.b localb = (com.tencent.mm.plugin.record.ui.a.b)paramAnonymousView.getTag();
      Object localObject;
      if (localb.bjS == 0) {
        if (com.tencent.mm.plugin.record.b.h.d(localb.bOz, localb.bJC))
        {
          x.i("MicroMsg.SightViewWrapper", "onclick: play sight");
          localObject = new Intent(paramAnonymousView.getContext(), RecordMsgFileUI.class);
          ((Intent)localObject).putExtra("message_id", localb.bJC);
          ((Intent)localObject).putExtra("record_xml", localb.bXN);
          ((Intent)localObject).putExtra("record_data_id", localb.bOz.jdM);
          paramAnonymousView.getContext().startActivity((Intent)localObject);
        }
      }
      label225:
      while (localb.bjS != 1)
      {
        f localf;
        do
        {
          return;
          localObject = com.tencent.mm.plugin.record.b.h.e(localb.bOz.jdM, localb.bJC, true);
          localf = n.getRecordMsgCDNStorage().Kr((String)localObject);
          if (localf == null) {}
          for (localObject = "null";; localObject = Integer.valueOf(localf.field_status))
          {
            x.i("MicroMsg.SightViewWrapper", "onclick: cdnInfo status %s", new Object[] { localObject });
            if ((localf == null) || (2 == localf.field_status) || (3 == localf.field_status)) {
              break label225;
            }
            if (4 != localf.field_status) {
              break;
            }
            com.tencent.mm.ui.base.h.bA(paramAnonymousView.getContext(), paramAnonymousView.getResources().getString(R.l.favorite_record_video_error));
            return;
          }
        } while ((localf.field_status == 0) || (1 == localf.field_status));
        com.tencent.mm.plugin.record.b.h.b(localb.bOz, localb.bJC, true);
        return;
      }
      x.i("MicroMsg.SightViewWrapper", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(localb.msw.field_id), Long.valueOf(localb.msw.field_localId), Integer.valueOf(localb.msw.field_itemStatus) });
      if (localb.msw.isDone())
      {
        localObject = new fz();
        ((fz)localObject).bOL.type = 14;
        ((fz)localObject).bOL.bON = localb.bOz;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
        x.i("MicroMsg.SightViewWrapper", "favItemInfo is Done,file exist ret = %d", new Object[] { Integer.valueOf(((fz)localObject).bOM.ret) });
        if (((fz)localObject).bOM.ret == 1)
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("key_detail_info_id", localb.msw.field_localId);
          ((Intent)localObject).putExtra("key_detail_data_id", localb.bOz.jdM);
          ((Intent)localObject).putExtra("key_detail_can_delete", false);
          com.tencent.mm.plugin.fav.a.b.a(paramAnonymousView.getContext(), ".ui.detail.FavoriteFileDetailUI", (Intent)localObject, 1);
          return;
        }
        if (bi.oW(localb.bOz.rzo))
        {
          x.w("MicroMsg.SightViewWrapper", "favItemInfo getCdnDataUrl empty");
          return;
        }
        x.w("MicroMsg.SightViewWrapper", "? info is done, source file not exist, cdn data url is not null");
      }
      for (;;)
      {
        paramAnonymousView = new fz();
        paramAnonymousView.bOL.bJA = localb.msw.field_localId;
        if (!localb.msw.aLg()) {
          break;
        }
        x.w("MicroMsg.SightViewWrapper", "upload failed, try to restart...");
        paramAnonymousView.bOL.type = 15;
        com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousView);
        return;
        if ((localb.msw.aLh()) || (localb.msw.aLg()))
        {
          x.i("MicroMsg.SightViewWrapper", "favItemInfo isDownLoadFaied or isUploadFailed, wait download");
        }
        else
        {
          if ((localb.msw.isDownloading()) || (localb.msw.aLf()))
          {
            x.i("MicroMsg.SightViewWrapper", "favItemInfo isDownloading or isUploadding, wait download");
            return;
          }
          x.w("MicroMsg.SightViewWrapper", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        }
      }
      x.w("MicroMsg.SightViewWrapper", "download failed, try to restart...");
      paramAnonymousView.bOL.type = 16;
      com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousView);
    }
  };
  private h.a msR;
  
  public c(h.a parama)
  {
    this.msR = parama;
  }
  
  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    paramView.setTag(paramb);
    paramView.setOnClickListener(this.iZP);
    com.tencent.mm.plugin.sight.decode.a.a locala = (com.tencent.mm.plugin.sight.decode.a.a)paramView.findViewById(R.h.image);
    ImageView localImageView = (ImageView)paramView.findViewById(R.h.status_btn);
    MMPinProgressBtn localMMPinProgressBtn = (MMPinProgressBtn)paramView.findViewById(R.h.progress);
    locala.setPosition(paramInt);
    com.tencent.mm.plugin.record.ui.a.c localc1 = (com.tencent.mm.plugin.record.ui.a.c)paramb;
    paramb = this.msR;
    Map localMap = mtG;
    h.a.c localc = new h.a.c();
    localc.bOz = localc1.bOz;
    if (localc1.bjS == 0)
    {
      localc.msT = localc1.bJC;
      if (com.tencent.mm.plugin.record.b.h.d(localc1.bOz, localc1.bJC))
      {
        localImageView.setVisibility(8);
        localMMPinProgressBtn.setVisibility(8);
        paramView = com.tencent.mm.plugin.record.b.h.c(localc1.bOz, localc1.bJC);
        if (!paramView.equals(locala.getVideoPath())) {
          locala.setThumbBmp(paramb.a(localc));
        }
        locala.aO(paramView, false);
      }
    }
    while (localc1.bjS != 1)
    {
      return;
      paramView = com.tencent.mm.plugin.record.b.h.e(localc1.bOz.jdM, localc1.bJC, true);
      paramView = n.getRecordMsgCDNStorage().Kr(paramView);
      if ((paramView == null) || (2 == paramView.field_status)) {
        localImageView.setImageResource(R.k.shortvideo_play_btn);
      }
      for (;;)
      {
        localImageView.setVisibility(0);
        localMMPinProgressBtn.setVisibility(8);
        locala.clear();
        locala.setThumbBmp(paramb.a(localc));
        return;
        if ((3 == paramView.field_status) || (4 == paramView.field_status))
        {
          localImageView.setImageResource(R.g.sight_chat_error);
        }
        else
        {
          if ((paramView.field_status == 0) || (1 == paramView.field_status))
          {
            localImageView.setVisibility(8);
            localMMPinProgressBtn.setVisibility(0);
            localMMPinProgressBtn.setProgress((int)(paramView.field_offset / Math.max(1, paramView.field_totalLen) * 100.0F));
            locala.clear();
            locala.setThumbBmp(paramb.a(localc));
            return;
          }
          localImageView.setImageResource(R.k.shortvideo_play_btn);
        }
      }
    }
    localMap.put(localc1.bOz.jdM, paramView);
    x.d("MicroMsg.SightRecordData", "dataId %s, status %s", new Object[] { Long.valueOf(localc1.msw.field_localId), Integer.valueOf(localc1.msw.field_itemStatus) });
    localc.msT = localc1.msw.field_localId;
    paramView = new fz();
    paramView.bOL.type = 14;
    paramView.bOL.bON = localc1.bOz;
    com.tencent.mm.sdk.b.a.sFg.m(paramView);
    if ((localc1.msw.isDone()) || (paramView.bOM.ret == 1))
    {
      if (paramView.bOM.ret == 1)
      {
        localImageView.setVisibility(8);
        localMMPinProgressBtn.setVisibility(8);
        paramView.bOL.type = 2;
        com.tencent.mm.sdk.b.a.sFg.m(paramView);
        paramView = paramView.bOM.path;
        if (bi.oW(paramView))
        {
          x.w("MicroMsg.SightRecordData", "videoPath is null!");
          return;
        }
        if (!paramView.equals(locala.getVideoPath())) {
          locala.setThumbBmp(paramb.a(localc));
        }
        locala.aO(paramView, false);
        return;
      }
      if (bi.oW(localc1.bOz.rzo)) {
        localImageView.setImageResource(R.g.sight_chat_error);
      }
    }
    for (;;)
    {
      localImageView.setVisibility(0);
      localMMPinProgressBtn.setVisibility(8);
      locala.clear();
      locala.setThumbBmp(paramb.a(localc));
      return;
      x.w("MicroMsg.SightRecordData", "? info is done, source file not exist, cdn data url is not null");
      localImageView.setImageResource(R.k.shortvideo_play_btn);
      continue;
      if ((localc1.msw.aLh()) || (localc1.msw.aLg()))
      {
        localImageView.setImageResource(R.k.shortvideo_play_btn);
      }
      else
      {
        if (localc1.msw.isDownloading())
        {
          localImageView.setVisibility(8);
          localMMPinProgressBtn.setVisibility(0);
          localMMPinProgressBtn.cAt();
          locala.clear();
          locala.setThumbBmp(paramb.a(localc));
          return;
        }
        x.w("MicroMsg.SightRecordData", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        localImageView.setImageResource(R.k.shortvideo_play_btn);
      }
    }
  }
  
  public final void destroy()
  {
    this.msR = null;
  }
  
  public final View eb(Context paramContext)
  {
    View localView = View.inflate(paramContext, R.i.record_listitem_sight, null);
    ((com.tencent.mm.plugin.sight.decode.a.a)localView.findViewById(R.h.image)).setDrawableWidth(com.tencent.mm.bp.a.fromDPToPix(paramContext, 260));
    return localView;
  }
  
  public final void pause() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/record/ui/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
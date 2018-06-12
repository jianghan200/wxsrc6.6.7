package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SnsGalleryUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private int nTw = 0;
  private String userName = "";
  
  public final void ci(String paramString, int paramInt)
  {
    if (this.nTu != null)
    {
      if ((!bi.oW(paramString)) && (paramInt != 3))
      {
        SnsInfoFlip localSnsInfoFlip = this.nTu;
        if (localSnsInfoFlip.dEw != null)
        {
          paramInt = 0;
          if (paramInt >= 0)
          {
            label37:
            if (paramInt < localSnsInfoFlip.dEw.size())
            {
              com.tencent.mm.plugin.sns.g.b localb = (com.tencent.mm.plugin.sns.g.b)localSnsInfoFlip.dEw.get(paramInt);
              if ((!bi.oW(localb.nuP)) && (localb.nuP.equals(paramString))) {
                localSnsInfoFlip.dEw.remove(paramInt);
              }
            }
            for (;;)
            {
              break;
              paramInt += 1;
              break label37;
              paramInt = -1;
            }
          }
          localSnsInfoFlip.nWy.notifyDataSetChanged();
        }
      }
      this.nTu.aKx();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      x.d("MicroMsg.SnsGalleryUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.nTr.nND);
      setResult(-1, paramKeyEvent);
      finish();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_gallery_img;
  }
  
  protected final void initView()
  {
    this.userName = getIntent().getStringExtra("sns_gallery_userName");
    int i = getIntent().getIntExtra("sns_gallery_localId", 0);
    boolean bool = getIntent().getBooleanExtra("sns_gallery_is_self", false);
    this.nTw = getIntent().getIntExtra("sns_gallery_position", 0);
    Object localObject = v.ai("sns_table_", i);
    x.i("MicroMsg.SnsGalleryUI", "initView localId:%s, pos:%d", new Object[] { localObject, Integer.valueOf(this.nTw) });
    cj((String)localObject, this.nTw);
    t(bool, 1);
    this.nTu = new SnsInfoFlip(this);
    this.nTu.setNeedScanImage(true);
    localObject = af.bye();
    String str = this.userName;
    if (((am.a)localObject).nrr.containsKey(str))
    {
      i = ((Integer)((am.a)localObject).nrr.get(str)).intValue();
      ((am.a)localObject).nrr.put(str, Integer.valueOf(i + 1));
      localObject = (ArrayList)((am.a)localObject).nrq.get(str);
      if (localObject != null) {
        break label423;
      }
      localObject = new ArrayList();
    }
    label423:
    for (;;)
    {
      this.nTu.setDoubleClick(true);
      this.nTu.setShowTitle(true);
      this.nTu.setEnableHorLongBmpMode(false);
      this.nTu.a((List)localObject, this.userName, this.nTw, this.nTp, this);
      this.nTu.setOnDeleteAllAction(new SnsGalleryUI.1(this));
      com.tencent.mm.kernel.g.Ek();
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(this.userName);
      if ((localObject != null) && ((int)((a)localObject).dhP > 0) && (a.gd(((ai)localObject).field_type))) {
        localObject = av.clU();
      }
      for (;;)
      {
        this.nTu.setFromScene((av)localObject);
        this.nTu.username = this.userName;
        addView(this.nTu);
        setBackBtn(new SnsGalleryUI.2(this));
        addIconOptionMenu(0, i.e.mm_title_btn_menu, new SnsGalleryUI.3(this, bool));
        return;
        ((am.a)localObject).nrr.put(str, Integer.valueOf(0));
        break;
        localObject = q.GF();
        if (this.userName.equals(localObject)) {
          localObject = av.clV();
        } else {
          localObject = av.clW();
        }
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.SnsGalleryUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {}
    label501:
    label505:
    for (;;)
    {
      return;
      String str2;
      String str1;
      if (2 == paramInt1)
      {
        if (-1 != paramInt2) {
          continue;
        }
        str2 = paramIntent.getStringExtra("Select_Conv_User");
        str1 = paramIntent.getStringExtra("custom_send_text");
        if (this.nTu == null) {
          break label501;
        }
        paramIntent = this.nTu.getSelectItem();
        if (paramIntent.caK.hcE != 6) {
          continue;
        }
      }
      for (Object localObject2 = paramIntent.caK;; localObject2 = null)
      {
        if (localObject2 == null) {
          break label505;
        }
        String str3 = an.s(af.getAccSnsPath(), ((ate)localObject2).ksA);
        paramIntent = "";
        Object localObject1 = "";
        String str4 = com.tencent.mm.plugin.sns.data.i.j((ate)localObject2);
        if (FileOp.cn(str3 + str4))
        {
          localObject1 = str3 + str4;
          paramIntent = str3 + com.tencent.mm.plugin.sns.data.i.e((ate)localObject2);
        }
        if (FileOp.cn(str3 + com.tencent.mm.plugin.sns.data.i.p((ate)localObject2))) {
          paramIntent = str3 + com.tencent.mm.plugin.sns.data.i.p((ate)localObject2);
        }
        for (localObject1 = str3 + com.tencent.mm.plugin.sns.data.i.n((ate)localObject2);; localObject1 = localObject2)
        {
          localObject2 = bi.F(str2.split(","));
          paramInt1 = com.tencent.mm.plugin.sns.data.i.LQ(paramIntent);
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            str2 = (String)((Iterator)localObject2).next();
            x.i("MicroMsg.SnsGalleryUI", "send sight to %s, videopath %s, thumbpath %s duration %d", new Object[] { str2, paramIntent, localObject1, Integer.valueOf(paramInt1) });
            com.tencent.mm.plugin.messenger.a.g.bcT().a(this, str2, paramIntent, (String)localObject1, 62, paramInt1, "");
            com.tencent.mm.plugin.messenger.a.g.bcT().dF(str1, str2);
          }
          com.tencent.mm.ui.widget.snackbar.b.h(this, getString(i.j.has_send));
          return;
          if (1 != paramInt1) {
            break;
          }
          paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
          localObject1 = v.ai("sns_table_", paramIntent.getIntExtra("sns_gallery_op_id", 0));
          this.nTr.xg(paramInt1);
          ci((String)localObject1, 1);
          if (!paramIntent.getBooleanExtra("sns_gallery_force_finish", false)) {
            break;
          }
          paramIntent = new Intent();
          paramIntent.putExtra("sns_cmd_list", this.nTr.nND);
          setResult(-1, paramIntent);
          finish();
          return;
          localObject2 = paramIntent;
          paramIntent = (Intent)localObject1;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    initView();
  }
  
  public void onDestroy()
  {
    if (this.nTu != null)
    {
      this.nTu.bDr();
      this.nTu.onDestroy();
    }
    getWindow().clearFlags(128);
    am.a locala = af.bye();
    String str = this.userName;
    int i;
    if (locala.nrr.containsKey(str))
    {
      i = Math.max(((Integer)locala.nrr.get(str)).intValue() - 1, 0);
      locala.nrr.put(str, Integer.valueOf(i));
    }
    for (;;)
    {
      if (i <= 0) {
        locala.nrq.remove(str);
      }
      af.byl().H(this);
      super.onDestroy();
      return;
      i = 0;
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    m.Bk(2);
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.nTu != null) {
      this.nTu.aKx();
    }
    m.Bk(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
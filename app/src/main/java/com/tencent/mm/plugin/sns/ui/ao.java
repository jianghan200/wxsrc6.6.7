package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.au;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ao
{
  private Activity bOb;
  private List<ate> list = new ArrayList();
  
  public ao(Activity paramActivity)
  {
    this.bOb = paramActivity;
  }
  
  private boolean ck(String paramString, int paramInt)
  {
    Object localObject = h.Nl(paramString);
    if (localObject == null)
    {
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] snsinfo is null! localId:%s index:%ss", new Object[] { paramString, Integer.valueOf(paramInt) });
      return false;
    }
    paramString = ((n)localObject).bAJ();
    if (paramString.sqc == null)
    {
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj is null!");
      return false;
    }
    if (paramString.sqc.ruA.size() == 0)
    {
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj.MediaObjList.size() == 0");
      return false;
    }
    this.list.clear();
    paramString = paramString.sqc.ruA.iterator();
    int i = 0;
    while (paramString.hasNext())
    {
      localObject = (ate)paramString.next();
      this.list.add(localObject);
      if ((paramInt == i) && (!af.byl().B((ate)localObject)))
      {
        x.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] is not exists");
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public final void a(View paramView, int paramInt, au paramau)
  {
    if (paramView == null) {
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] view is null! scene:%s", new Object[] { Integer.valueOf(paramInt) });
    }
    Object localObject;
    do
    {
      return;
      localObject = paramView.getTag();
    } while (!(localObject instanceof ap));
    ap localap = (ap)localObject;
    String str = localap.bNH;
    int i = localap.index;
    int j = localap.position;
    if (!ck(str, i))
    {
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", new Object[] { str, Integer.valueOf(i) });
      return;
    }
    com.tencent.mm.kernel.g.Ek();
    if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
    {
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
      return;
    }
    n localn = h.Nl(str);
    if (!ck(str, i))
    {
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", new Object[] { str, Integer.valueOf(i) });
      return;
    }
    Intent localIntent = new Intent();
    if (localn != null)
    {
      if (paramau != null) {
        paramau.nrb.v(localn);
      }
      bsu localbsu = localn.bAJ();
      if (localap.index < localbsu.sqc.ruA.size())
      {
        paramau = (ate)localbsu.sqc.ruA.get(localap.index);
        if (paramInt != 1) {
          break label637;
        }
        localObject = com.tencent.mm.modelsns.b.io(716);
        label251:
        ((com.tencent.mm.modelsns.b)localObject).nb(i.g(localn)).ir(localn.field_type).bP(localn.xb(32)).nb(localn.bBo()).nb(paramau.ksA).ir(localap.index).ir(localbsu.sqc.ruA.size());
        ((com.tencent.mm.modelsns.b)localObject).RD();
        if (paramInt != 1) {
          break label648;
        }
        paramau = com.tencent.mm.modelsns.b.io(744);
        label335:
        paramau.nb(i.g(localn)).ir(localn.field_type).bP(localn.xb(32)).nb(localn.bBo());
        paramau.b(localIntent, "intent_key_StatisticsOplog");
        paramau = new Bundle();
        paramau.putInt("stat_scene", 3);
        paramau.putString("stat_msg_id", "sns_" + i.eF(localn.field_snsId));
        paramau.putString("stat_send_msg_user", localn.field_userName);
        localIntent.putExtra("_stat_obj", paramau);
      }
    }
    for (;;)
    {
      paramau = new int[2];
      paramView.getLocationInWindow(paramau);
      int k = paramView.getWidth();
      int m = paramView.getHeight();
      if (paramInt == -1) {
        localIntent.putExtra("k_is_from_sns_msg_ui", true);
      }
      localIntent.putExtra("sns_gallery_localId", str);
      localIntent.putExtra("sns_gallery_position", i);
      localIntent.putExtra("sns_position", j);
      localIntent.putExtra("sns_gallery_showtype", 1);
      localIntent.putExtra("K_ad_scene", paramInt);
      localIntent.putExtra("k_is_from_sns_main_timeline", localap.nTx);
      localIntent.putExtra("img_gallery_left", paramau[0]);
      localIntent.putExtra("img_gallery_top", paramau[1]);
      localIntent.putExtra("img_gallery_width", k);
      localIntent.putExtra("img_gallery_height", m);
      localIntent.setClass(this.bOb, SnsBrowseUI.class);
      this.bOb.startActivity(localIntent);
      this.bOb.overridePendingTransition(0, 0);
      return;
      paramau = new ate();
      break;
      label637:
      localObject = com.tencent.mm.modelsns.b.ip(716);
      break label251;
      label648:
      paramau = com.tencent.mm.modelsns.b.ip(744);
      break label335;
      x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
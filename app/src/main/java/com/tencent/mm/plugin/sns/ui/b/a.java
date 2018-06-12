package com.tencent.mm.plugin.sns.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.MenuItem;
import android.view.View;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.a.qs;
import com.tencent.mm.g.a.qs.b;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.FlipView;
import com.tencent.mm.plugin.sns.ui.SnsBrowseUI;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.as;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
  implements com.tencent.mm.ab.e, n.d
{
  private Activity activity;
  private ClipboardManager jdw;
  private p nLY;
  private ae nMm;
  private View okr;
  private String oks;
  private bsu okt;
  private int scene;
  
  public a(Activity paramActivity, int paramInt, ae paramae)
  {
    this.activity = paramActivity;
    this.scene = paramInt;
    this.jdw = ((ClipboardManager)paramActivity.getSystemService("clipboard"));
    this.nMm = paramae;
  }
  
  private void Oc(String paramString)
  {
    Object localObject2 = af.byo().Nl(paramString);
    if (localObject2 == null) {
      return;
    }
    if (((n)localObject2).xb(32))
    {
      ((n)localObject2).bAH();
      localObject1 = ((n)localObject2).bBp();
      str1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((n)localObject2);
      if (!bi.oW(str1)) {
        ((com.tencent.mm.plugin.sns.storage.e)localObject1).field_adxml = str1;
      }
    }
    for (Object localObject1 = ((com.tencent.mm.plugin.sns.storage.e)localObject1).field_adxml;; localObject1 = ((n)localObject2).bAJ().ogR)
    {
      localObject3 = bl.z((String)localObject1, "adxml");
      if (localObject3 == null) {
        break;
      }
      if (((Map)localObject3).containsKey(".adxml.adCanvasInfo")) {
        break label106;
      }
      com.tencent.mm.ui.base.h.i(this.activity, i.j.favorite_fail_parse_error, 0);
      return;
    }
    label106:
    localObject2 = u.ic(((n)localObject2).field_snsId);
    String str1 = bi.aG((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareTitle"), "");
    String str2 = bi.aG((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareWebUrl"), "");
    String str3 = bi.aG((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareDesc"), "");
    Object localObject3 = new ch();
    qs localqs = new qs();
    localqs.cbk.cbn = paramString;
    localqs.cbk.cbo = ((ch)localObject3);
    localqs.cbk.url = str2;
    com.tencent.mm.sdk.b.a.sFg.m(localqs);
    if (!localqs.cbl.bJm)
    {
      if (((ch)localObject3).bJF.bJL == 0) {
        ((ch)localObject3).bJF.bJL = i.j.favorite_fail_nonsupport;
      }
      com.tencent.mm.ui.base.h.i(this.activity, ((ch)localObject3).bJF.bJL, 0);
      return;
    }
    ((ch)localObject3).bJF.bJK = ((String)localObject2);
    ((ch)localObject3).bJF.title = str1;
    ((ch)localObject3).bJF.desc = str3;
    paramString = ((ch)localObject3).bJF.bJH;
    if ((paramString != null) && (paramString.rBI != null) && (paramString.rBI.size() > 0) && (paramString.rBI.get(0) != null))
    {
      ((vx)paramString.rBI.get(0)).Va((String)localObject1);
      if (bi.oW(((vx)paramString.rBI.get(0)).title)) {
        ((vx)paramString.rBI.get(0)).UB(((ch)localObject3).bJF.title);
      }
      if (bi.oW(((vx)paramString.rBI.get(0)).desc)) {
        ((vx)paramString.rBI.get(0)).UC(((ch)localObject3).bJF.desc);
      }
    }
    ((ch)localObject3).bJF.activity = this.activity;
    ((ch)localObject3).bJF.bJM = 28;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
  }
  
  private String bEH()
  {
    if ((this.okr != null) && ((this.okr.getTag() instanceof as)) && (((as)this.okr.getTag()).bDG()))
    {
      ap.b localb = com.tencent.mm.plugin.sns.model.ap.Mq(af.byo().Nl(this.oks).bAK());
      if (localb != null) {
        return localb.result;
      }
    }
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "onSceneEnd");
    if ((this.nLY != null) && (this.nLY.isShowing())) {
      this.nLY.dismiss();
    }
  }
  
  public final void a(View paramView, String paramString, bsu parambsu)
  {
    this.okr = paramView;
    this.oks = paramString;
    this.okt = parambsu;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      if (paramInt1 == 15)
      {
        localn = af.byo().Nl(this.oks);
        localObject1 = (ate)this.okt.sqc.ruA.get(0);
        str1 = paramIntent.getStringExtra("Select_Conv_User");
        localObject2 = paramIntent.getStringExtra("custom_send_text");
        str2 = an.s(af.getAccSnsPath(), ((ate)localObject1).ksA) + i.e((ate)localObject1);
        paramIntent = bi.F(str1.split(",")).iterator();
        if (!paramIntent.hasNext()) {
          break label712;
        }
        str1 = (String)paramIntent.next();
        if (!localn.xb(32)) {
          break label574;
        }
        str3 = an.s(af.getAccSnsPath(), ((ate)localObject1).ksA) + i.j((ate)localObject1);
        localbsu = localn.bAJ();
        localb = localn.bAF();
        localbri = new bri();
        localbri.rBq = ((ate)localObject1).oig;
        localbri.dyJ = ((ate)localObject1).rVL;
        if (localbsu.sqc.ruz != 15) {
          break label519;
        }
        localbri.dyP = localn.bAH().ntU;
        localbri.dyQ = localbsu.ksA;
        localbri.dyL = localbsu.spZ;
        if (!bi.oW(((ate)localObject1).rVO)) {
          break label548;
        }
        paramIntent = ((ate)localObject1).rVE;
        localbri.dyO = paramIntent;
        if ((localb != null) && (localb.nyL == 0))
        {
          localbri.dyN = localb.nyN;
          localbri.dyM = localb.nyM;
        }
        paramInt1 = i.LQ(str3);
        x.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, str3, str2, ((ate)localObject1).rVL, Integer.valueOf(((ate)localObject1).oig), Integer.valueOf(paramInt1) });
        com.tencent.mm.plugin.messenger.a.g.bcT().a(this.activity, str1, str3, str2, 43, paramInt1, localbri, localbsu.nNV);
        com.tencent.mm.plugin.messenger.a.g.bcT().dF((String)localObject2, str1);
        if (this.scene != 0) {
          break label557;
        }
        paramInt1 = 1;
        paramIntent = new c(localn.bBn(), 12, paramInt1, "", 2, localn.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(paramIntent, 0);
        bool = s.fq(str1);
        localObject1 = j.d.nke;
        if (!bool) {
          break label562;
        }
        paramIntent = j.c.nkb;
        localObject2 = j.e.nkk;
        if (!bool) {
          break label569;
        }
        paramInt1 = com.tencent.mm.model.m.gK(str1);
        j.a((j.d)localObject1, paramIntent, (j.e)localObject2, paramInt1, localn);
      }
    }
    label519:
    label548:
    label557:
    label562:
    label569:
    label574:
    label712:
    while (paramInt1 != 15)
    {
      for (;;)
      {
        n localn;
        Object localObject1;
        String str1;
        Object localObject2;
        String str2;
        bsu localbsu;
        com.tencent.mm.plugin.sns.storage.b localb;
        bri localbri;
        boolean bool;
        return;
        localbri.dyP = localbsu.sqh.dyP;
        localbri.dyQ = localbsu.sqh.dyQ;
        continue;
        paramIntent = ((ate)localObject1).rVO;
        continue;
        paramInt1 = 2;
        continue;
        paramIntent = j.c.nka;
        continue;
        paramInt1 = 0;
        continue;
        String str3 = an.s(af.getAccSnsPath(), ((ate)localObject1).ksA) + i.j((ate)localObject1);
        paramInt1 = i.LQ(str3);
        x.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, str3, str2, ((ate)localObject1).rVL, Integer.valueOf(((ate)localObject1).oig), Integer.valueOf(paramInt1) });
        com.tencent.mm.plugin.messenger.a.g.bcT().a(this.activity, str1, str3, str2, 43, paramInt1, this.okt.nNV);
        com.tencent.mm.plugin.messenger.a.g.bcT().dF((String)localObject2, str1);
      }
      com.tencent.mm.ui.widget.snackbar.b.h(this.activity, this.activity.getString(i.j.has_send));
      return;
    }
    paramIntent = af.byo().Nl(this.oks);
    if (paramIntent == null)
    {
      x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "menuitemselected and snsinfo is null %s", new Object[] { this.oks });
      return;
    }
    if (this.scene == 0) {}
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      paramIntent = new c(paramIntent.bBn(), 13, paramInt1, "", 2, paramIntent.bAK());
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(paramIntent, 0);
      return;
    }
  }
  
  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    if (this.okr == null) {}
    label425:
    Object localObject7;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    int i;
    long l;
    label2317:
    label3410:
    label3555:
    label3894:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        return;
                        switch (paramMenuItem.getItemId())
                        {
                        case 6: 
                        default: 
                          return;
                        case 0: 
                          localObject1 = bEH();
                          paramMenuItem = (MenuItem)localObject1;
                          if (bi.oW((String)localObject1)) {
                            paramMenuItem = this.okt.spZ;
                          }
                          this.jdw.setText(paramMenuItem);
                          com.tencent.mm.ui.base.h.bA(this.activity, this.activity.getString(i.j.app_copy_ok));
                          paramInt = com.tencent.mm.plugin.secinforeport.a.a.mOt;
                          com.tencent.mm.plugin.secinforeport.a.a.f(2, this.okt.ksA, bi.WK(paramMenuItem));
                          return;
                        case 1: 
                          localObject1 = bEH();
                          paramMenuItem = (MenuItem)localObject1;
                          if (bi.oW((String)localObject1)) {
                            paramMenuItem = this.okt.spZ;
                          }
                          this.nMm.bxT().eE(this.oks, this.okt.ksA);
                          localObject1 = new ch();
                          com.tencent.mm.plugin.sns.i.a.a((ch)localObject1, this.oks, paramMenuItem);
                          ((ch)localObject1).bJF.activity = this.activity;
                          ((ch)localObject1).bJF.bJM = 30;
                          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
                          return;
                        case 2: 
                          this.nMm.bxT().eE(this.oks, this.okt.ksA);
                          paramMenuItem = new ch();
                          localObject1 = com.tencent.mm.plugin.sns.storage.h.Nl(this.oks);
                          if ((!((n)localObject1).xb(32)) || (!((n)localObject1).bAF().bzm())) {
                            break label425;
                          }
                          Oc(this.oks);
                        }
                      } while (!((n)localObject1).xb(32));
                      if (this.scene == 0) {}
                      for (paramInt = 1;; paramInt = 2)
                      {
                        paramMenuItem = new c(((n)localObject1).bBn(), 11, paramInt, "", ((n)localObject1).bBr(), ((n)localObject1).bAK());
                        com.tencent.mm.kernel.g.Ek();
                        com.tencent.mm.kernel.g.Eh().dpP.a(paramMenuItem, 0);
                        return;
                        if (this.okt.csE == 1)
                        {
                          com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, this.oks, 0);
                          paramMenuItem.bJF.activity = this.activity;
                          paramMenuItem.bJF.bJM = 31;
                          com.tencent.mm.sdk.b.a.sFg.m(paramMenuItem);
                          break;
                        }
                        localObject3 = (com.tencent.mm.plugin.sns.ui.ap)this.okr.getTag();
                        com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, this.oks, ((com.tencent.mm.plugin.sns.ui.ap)localObject3).index);
                        paramMenuItem.bJF.activity = this.activity;
                        paramMenuItem.bJF.bJM = 31;
                        com.tencent.mm.sdk.b.a.sFg.m(paramMenuItem);
                        break;
                      }
                      this.nMm.bxT().eE(this.oks, this.okt.ksA);
                      paramMenuItem = af.byo().Nl(this.oks);
                    } while (this.okt.sqc.ruA.size() == 0);
                    localObject1 = (ate)this.okt.sqc.ruA.get(0);
                    if ((paramMenuItem == null) || (localObject1 == null))
                    {
                      x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite music fail, snsinfo or mediaobj is null");
                      return;
                    }
                    localObject3 = new ch();
                    if ((localObject1 == null) || (paramMenuItem == null) || (paramMenuItem.nJc == 0)) {
                      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
                    }
                    for (((ch)localObject3).bJF.bJL = i.j.favorite_fail_argument_error;; ((ch)localObject3).bJF.bJL = i.j.favorite_fail_system_error)
                    {
                      ((ch)localObject3).bJF.activity = this.activity;
                      ((ch)localObject3).bJF.bJM = 25;
                      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
                      return;
                      if (!af.bxX()) {
                        break;
                      }
                      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                    }
                    localObject7 = String.format("%s#%s", new Object[] { i.eF(paramMenuItem.field_snsId), ((ate)localObject1).ksA });
                    localObject4 = new wl();
                    localObject5 = new wr();
                    x.i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", new Object[] { paramMenuItem.field_userName });
                    ((wr)localObject5).Vw(paramMenuItem.field_userName);
                    ((wr)localObject5).Vx(q.GF());
                    ((wr)localObject5).CO(2);
                    ((wr)localObject5).fU(paramMenuItem.field_createTime * 1000L);
                    ((wr)localObject5).VB(paramMenuItem.bAK());
                    ((wr)localObject5).Vy((String)localObject7);
                    localObject6 = new vx();
                    ((vx)localObject6).UT((String)localObject7);
                    ((vx)localObject6).UI(((ate)localObject1).jPK);
                    ((vx)localObject6).UJ(((ate)localObject1).rVI);
                    ((vx)localObject6).UH(paramMenuItem.bAJ().sqc.jPK);
                    localObject7 = an.s(af.getAccSnsPath(), ((ate)localObject1).ksA) + i.e((ate)localObject1);
                    if (FileOp.cn((String)localObject7)) {
                      ((vx)localObject6).UQ((String)localObject7);
                    }
                    for (;;)
                    {
                      ((vx)localObject6).CF(7);
                      ((vx)localObject6).UB(((ate)localObject1).bHD);
                      ((vx)localObject6).UC(((ate)localObject1).jOS);
                      ((vx)localObject6).kX(true);
                      ((wl)localObject4).rBI.add(localObject6);
                      ((wl)localObject4).a((wr)localObject5);
                      ((ch)localObject3).bJF.bJH = ((wl)localObject4);
                      ((ch)localObject3).bJF.type = 7;
                      com.tencent.mm.plugin.sns.i.a.a((vx)localObject6, paramMenuItem);
                      break;
                      ((vx)localObject6).kY(true);
                      ((vx)localObject6).UK(((ate)localObject1).rVE);
                      localObject7 = new xa();
                      ((xa)localObject7).VM(((ate)localObject1).rVE);
                      ((wl)localObject4).b((xa)localObject7);
                    }
                    paramMenuItem = this.activity;
                    localObject4 = af.byo().Nl(this.oks);
                  } while (localObject4 == null);
                  Object localObject1 = new Intent();
                  if (((n)localObject4).bAJ().sqc.ruz == 1)
                  {
                    localObject3 = (com.tencent.mm.plugin.sns.ui.ap)this.okr.getTag();
                    localObject4 = aj.a((n)localObject4, ((com.tencent.mm.plugin.sns.ui.ap)localObject3).index);
                    if (localObject4 == null)
                    {
                      x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "send photo fail, mediaObj is null");
                      return;
                    }
                    localObject5 = ((ate)localObject4).ksA;
                    ((Intent)localObject1).putExtra("sns_send_data_ui_image_path", FlipView.g(an.s(af.getAccSnsPath(), (String)localObject5) + i.l((ate)localObject4), paramMenuItem));
                    ((Intent)localObject1).putExtra("sns_send_data_ui_image_position", ((com.tencent.mm.plugin.sns.ui.ap)localObject3).index);
                  }
                  while (((((n)localObject4).bAJ().sqc.ruz != 4) && (((n)localObject4).bAJ().sqc.ruz != 15) && (((n)localObject4).bAJ().sqc.ruz != 3)) || ((ate)((n)localObject4).bAJ().sqc.ruA.get(0) != null))
                  {
                    ((Intent)localObject1).putExtra("exdevice_open_scene_type", 1);
                    ((Intent)localObject1).putExtra("sns_local_id", this.oks);
                    ((Intent)localObject1).putExtra("sns_send_data_ui_activity", true);
                    com.tencent.mm.bg.d.e(this.activity, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject1);
                    return;
                  }
                  x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mediaObj is null, send failed!");
                  return;
                  paramMenuItem = af.byo().Nl(this.oks);
                  if (paramMenuItem == null)
                  {
                    x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but sns info is null.");
                    return;
                  }
                  if (paramMenuItem.xb(32))
                  {
                    x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but it is ad");
                    return;
                  }
                  localObject1 = (ate)paramMenuItem.bAJ().sqc.ruA.get(0);
                  if (localObject1 == null)
                  {
                    x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute paly video but media is null");
                    return;
                  }
                  localObject3 = an.s(af.getAccSnsPath(), ((ate)localObject1).ksA);
                  paramMenuItem = "";
                  localObject4 = i.j((ate)localObject1);
                  if (FileOp.cn((String)localObject3 + (String)localObject4)) {
                    paramMenuItem = (String)localObject3 + i.e((ate)localObject1);
                  }
                  if (FileOp.cn((String)localObject3 + i.p((ate)localObject1))) {
                    paramMenuItem = (String)localObject3 + i.n((ate)localObject1);
                  }
                  localObject1 = new Intent();
                  ((Intent)localObject1).setClass(this.activity, SnsOnlineVideoActivity.class);
                  ((Intent)localObject1).putExtra("intent_thumbpath", paramMenuItem);
                  ((Intent)localObject1).putExtra("intent_localid", this.oks);
                  ((Intent)localObject1).putExtra("intent_from_scene", this.scene);
                  ((Intent)localObject1).putExtra("intent_ismute", true);
                  if (this.okr != null)
                  {
                    paramMenuItem = new int[2];
                    this.okr.getLocationInWindow(paramMenuItem);
                    paramInt = this.okr.getWidth();
                    i = this.okr.getHeight();
                    ((Intent)localObject1).putExtra("img_gallery_left", paramMenuItem[0]);
                    ((Intent)localObject1).putExtra("img_gallery_top", paramMenuItem[1]);
                    ((Intent)localObject1).putExtra("img_gallery_width", paramInt);
                    ((Intent)localObject1).putExtra("img_gallery_height", i);
                  }
                  this.activity.startActivity((Intent)localObject1);
                  this.activity.overridePendingTransition(0, 0);
                  return;
                  this.nMm.bxT().eE(this.oks, this.okt.ksA);
                  paramMenuItem = this.okt.sqc.jPK;
                  localObject1 = this.okt.sqb.ksA;
                  localObject1 = av.Ob(paramMenuItem);
                  if (bi.oW((String)localObject1))
                  {
                    x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
                    return;
                  }
                  paramMenuItem = new ch();
                  localObject3 = com.tencent.mm.plugin.sns.storage.h.Nl(this.oks);
                  if (localObject3 != null)
                  {
                    localObject4 = u.ic(((n)localObject3).field_snsId);
                    localObject5 = u.Hx().v((String)localObject4, true);
                    ((u.b)localObject5).p("prePublishId", "sns_" + i.eF(((n)localObject3).field_snsId));
                    ((u.b)localObject5).p("preUsername", ((n)localObject3).field_userName);
                    ((u.b)localObject5).p("preChatName", "");
                    ((u.b)localObject5).p("url", localObject1);
                    ((u.b)localObject5).p("preMsgIndex", Integer.valueOf(0));
                    ((u.b)localObject5).p("sendAppMsgScene", Integer.valueOf(1));
                    ((u.b)localObject5).p("adExtStr", ((n)localObject3).bAJ().nNV);
                    paramMenuItem.bJF.bJK = ((String)localObject4);
                  }
                  localObject3 = af.byo().Nl(this.oks);
                  if ((localObject3 != null) && (this.okt.sqc.ruz == 18)) {
                    j.a(j.d.nkf, j.c.njZ, j.e.nkk, 0, (n)localObject3);
                  }
                  if (!bi.oW(this.okt.ogR))
                  {
                    Oc(((n)localObject3).bBe());
                    return;
                  }
                  if (((n)localObject3).xb(32)) {
                    if (this.scene != 0) {
                      break label2317;
                    }
                  }
                  for (paramInt = 1;; paramInt = 2)
                  {
                    localObject3 = new c(((n)localObject3).bBn(), 11, paramInt, "", ((n)localObject3).bBr(), ((n)localObject3).bAK());
                    com.tencent.mm.kernel.g.Ek();
                    com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject3, 0);
                    com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, (String)localObject1, this.oks);
                    paramMenuItem.bJF.activity = this.activity;
                    paramMenuItem.bJF.bJM = 28;
                    com.tencent.mm.sdk.b.a.sFg.m(paramMenuItem);
                    if (paramMenuItem.bJG.ret != 0) {
                      break;
                    }
                    l = bi.VE();
                    if (bi.oW((String)localObject1)) {
                      break;
                    }
                    x.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), localObject1, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                    paramMenuItem = "";
                    try
                    {
                      localObject1 = URLEncoder.encode((String)localObject1, "UTF-8");
                      paramMenuItem = (MenuItem)localObject1;
                    }
                    catch (UnsupportedEncodingException localUnsupportedEncodingException)
                    {
                      for (;;)
                      {
                        x.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", localUnsupportedEncodingException, "", new Object[0]);
                      }
                    }
                    com.tencent.mm.plugin.report.service.h.mEJ.h(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                    return;
                  }
                  this.nMm.bxT().eE(this.oks, this.okt.ksA);
                } while (this.okt == null);
                paramMenuItem = new ch();
                localObject5 = this.okt;
                if (localObject5 == null)
                {
                  x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
                  paramMenuItem.bJF.bJL = i.j.favorite_fail_argument_error;
                }
                for (;;)
                {
                  paramMenuItem.bJF.activity = this.activity;
                  paramMenuItem.bJF.bJM = 26;
                  com.tencent.mm.sdk.b.a.sFg.m(paramMenuItem);
                  return;
                  localObject2 = new wl();
                  localObject3 = new wr();
                  localObject4 = new wk();
                  ((wr)localObject3).Vw(((bsu)localObject5).hbL);
                  ((wr)localObject3).Vx(q.GF());
                  ((wr)localObject3).CO(2);
                  ((wr)localObject3).fU(bi.VF());
                  if (((bsu)localObject5).sqb != null) {
                    ((wr)localObject3).VC(((bsu)localObject5).sqb.ksA);
                  }
                  if (((bsu)localObject5).sqc != null)
                  {
                    ((wk)localObject4).Vp(((bsu)localObject5).sqc.bHD);
                    ((wk)localObject4).Vq(((bsu)localObject5).sqc.jOS);
                    if ((((bsu)localObject5).sqc.ruA != null) && (!((bsu)localObject5).sqc.ruA.isEmpty()))
                    {
                      localObject5 = (ate)((bsu)localObject5).sqc.ruA.get(0);
                      ((wk)localObject4).CL(((ate)localObject5).bID);
                      ((wk)localObject4).Vs(((ate)localObject5).nME);
                      ((wk)localObject4).Vr(((ate)localObject5).rVE);
                    }
                  }
                  paramMenuItem.bJF.title = ((wk)localObject4).title;
                  paramMenuItem.bJF.desc = ((wk)localObject4).desc;
                  paramMenuItem.bJF.bJH = ((wl)localObject2);
                  paramMenuItem.bJF.type = 10;
                  ((wl)localObject2).a((wr)localObject3);
                  ((wl)localObject2).b((wk)localObject4);
                }
                this.nMm.bxT().eE(this.oks, this.okt.ksA);
              } while (this.okt == null);
              paramMenuItem = new ch();
              localObject5 = this.okt;
              if (localObject5 == null)
              {
                x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
                paramMenuItem.bJF.bJL = i.j.favorite_fail_argument_error;
              }
              for (;;)
              {
                paramMenuItem.bJF.activity = this.activity;
                paramMenuItem.bJF.bJM = 27;
                com.tencent.mm.sdk.b.a.sFg.m(paramMenuItem);
                return;
                localObject2 = new wl();
                localObject3 = new wr();
                localObject4 = new wu();
                ((wr)localObject3).Vw(((bsu)localObject5).hbL);
                ((wr)localObject3).Vx(q.GF());
                ((wr)localObject3).CO(8);
                ((wr)localObject3).fU(bi.VF());
                if (((bsu)localObject5).sqb != null) {
                  ((wr)localObject3).VC(((bsu)localObject5).sqb.ksA);
                }
                if (((bsu)localObject5).sqc != null)
                {
                  ((wu)localObject4).VF(((bsu)localObject5).sqc.bHD);
                  ((wu)localObject4).VG(((bsu)localObject5).sqc.jOS);
                  if ((((bsu)localObject5).sqc.ruA != null) && (!((bsu)localObject5).sqc.ruA.isEmpty()))
                  {
                    localObject5 = (ate)((bsu)localObject5).sqc.ruA.get(0);
                    ((wu)localObject4).VI(((ate)localObject5).nME);
                    ((wu)localObject4).VH(((ate)localObject5).rVE);
                  }
                }
                paramMenuItem.bJF.title = ((wu)localObject4).title;
                paramMenuItem.bJF.desc = ((wu)localObject4).desc;
                paramMenuItem.bJF.bJH = ((wl)localObject2);
                paramMenuItem.bJF.type = 15;
                ((wl)localObject2).a((wr)localObject3);
                ((wl)localObject2).b((wu)localObject4);
              }
              paramMenuItem = af.byo().Nl(this.oks).bAK();
              localObject2 = (com.tencent.mm.plugin.sns.ui.m)this.okr.getTag();
              if (v.ND(paramMenuItem))
              {
                paramMenuItem = new r(v.NE(paramMenuItem), 6, ((com.tencent.mm.plugin.sns.ui.m)localObject2).noe);
                com.tencent.mm.kernel.g.Ek();
                com.tencent.mm.kernel.g.Eh().dpP.a(paramMenuItem, 0);
              }
              for (;;)
              {
                localObject2 = this.activity;
                this.activity.getString(i.j.app_tip);
                this.nLY = com.tencent.mm.ui.base.h.a((Context)localObject2, this.activity.getString(i.j.sns_deling_sns), true, new a.1(this, paramMenuItem));
                return;
                paramMenuItem = new r(v.NE(paramMenuItem), 4, ((com.tencent.mm.plugin.sns.ui.m)localObject2).noe);
                com.tencent.mm.kernel.g.Ek();
                com.tencent.mm.kernel.g.Eh().dpP.a(paramMenuItem, 0);
              }
              paramMenuItem = af.byo().Nl(this.oks);
            } while (paramMenuItem == null);
            com.tencent.mm.plugin.sns.abtest.a.b(paramMenuItem);
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("sns_permission_snsinfo_svr_id", paramMenuItem.field_snsId);
            ((Intent)localObject2).putExtra("sns_permission_userName", paramMenuItem.field_userName);
            ((Intent)localObject2).putExtra("sns_permission_anim", true);
            ((Intent)localObject2).setClass(this.activity, SnsPermissionUI.class);
            this.activity.startActivityForResult((Intent)localObject2, 11);
            return;
            this.nMm.bxT().eE(this.oks, this.okt.ksA);
            paramMenuItem = com.tencent.mm.plugin.sns.storage.h.Nl(this.oks);
            if ((paramMenuItem.xb(32)) && (paramMenuItem.bAF().bzm()))
            {
              paramMenuItem = af.byo().Nl(this.oks);
              if ((paramMenuItem != null) && (paramMenuItem.xb(32))) {
                if (this.scene != 0) {
                  break label3410;
                }
              }
              for (paramInt = 1;; paramInt = 2)
              {
                paramMenuItem = new c(paramMenuItem.bBn(), 11, paramInt, "", 2, paramMenuItem.bAK());
                com.tencent.mm.kernel.g.Ek();
                com.tencent.mm.kernel.g.Eh().dpP.a(paramMenuItem, 0);
                Oc(this.oks);
                return;
              }
            }
            paramMenuItem = this.oks;
            paramMenuItem = af.byo().Nl(paramMenuItem);
          } while (paramMenuItem == null);
          if (paramMenuItem.xb(32))
          {
            j.a(j.d.nke, j.c.njZ, j.e.nkk, 0, paramMenuItem);
            if (this.scene != 0) {
              break label3555;
            }
          }
          for (paramInt = 1;; paramInt = 2)
          {
            localObject2 = new c(paramMenuItem.bBn(), 11, paramInt, "", paramMenuItem.bBr(), paramMenuItem.bAK());
            com.tencent.mm.kernel.g.Ek();
            com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject2, 0);
            localObject2 = new ch();
            com.tencent.mm.plugin.sns.i.a.a((ch)localObject2, paramMenuItem);
            ((ch)localObject2).bJF.activity = this.activity;
            ((ch)localObject2).bJF.bJM = 29;
            com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
            return;
          }
          paramMenuItem = (ate)this.okt.sqc.ruA.get(0);
          paramMenuItem = an.s(af.getAccSnsPath(), paramMenuItem.ksA) + i.e(paramMenuItem);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
          ((Intent)localObject2).putExtra("select_is_ret", true);
          ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
          ((Intent)localObject2).putExtra("image_path", paramMenuItem);
          ((Intent)localObject2).putExtra("Retr_Msg_Type", 11);
          com.tencent.mm.bg.d.b(this.activity, ".ui.transmit.SelectConversationUI", (Intent)localObject2, 15);
          return;
        } while (!(this.okr.getTag() instanceof com.tencent.mm.plugin.sns.ui.m));
        paramMenuItem = (com.tencent.mm.plugin.sns.ui.m)this.okr.getTag();
        this.jdw.setText(paramMenuItem.jSA);
        com.tencent.mm.ui.base.h.bA(this.activity, this.activity.getString(i.j.app_copy_ok));
      } while (paramMenuItem.noe == null);
      paramInt = com.tencent.mm.plugin.secinforeport.a.a.mOt;
      com.tencent.mm.plugin.secinforeport.a.a.f(4, this.okt.ksA + ":" + paramMenuItem.noe.smh, bi.WK(paramMenuItem.jSA));
      return;
      paramMenuItem = af.byo().Nl(this.oks);
      com.tencent.mm.plugin.sns.abtest.a.a(this.activity, paramMenuItem);
      return;
      localObject2 = af.byo().Nl(this.oks);
      if (localObject2 != null) {
        if (this.scene != 0) {
          break label3894;
        }
      }
      for (paramMenuItem = com.tencent.mm.modelsns.b.io(714);; paramMenuItem = com.tencent.mm.modelsns.b.ip(714))
      {
        paramMenuItem.nb(i.g((n)localObject2)).ir(((n)localObject2).field_type).bP(((n)localObject2).xb(32)).nb(((n)localObject2).bBo());
        paramMenuItem.RD();
        com.tencent.mm.plugin.sns.model.ap.o((n)localObject2);
        return;
      }
    } while (!(this.okr.getTag() instanceof com.tencent.mm.plugin.sns.ui.m));
    Object localObject2 = (com.tencent.mm.plugin.sns.ui.m)this.okr.getTag();
    Object localObject3 = af.byo().Nk(((com.tencent.mm.plugin.sns.ui.m)localObject2).nMv);
    if (localObject3 != null)
    {
      if (this.scene != 0) {
        break label4065;
      }
      paramMenuItem = com.tencent.mm.modelsns.b.io(715);
      paramMenuItem.nb(i.g((n)localObject3)).ir(((n)localObject3).field_type).bP(((n)localObject3).xb(32)).nb(((n)localObject3).bBo());
      if (((com.tencent.mm.plugin.sns.ui.m)localObject2).noe == null) {
        break label4101;
      }
      if (((com.tencent.mm.plugin.sns.ui.m)localObject2).noe.smh != 0) {
        break label4075;
      }
      localObject2 = ((com.tencent.mm.plugin.sns.ui.m)localObject2).noe.smk;
      label4039:
      paramMenuItem.nb((String)localObject2);
    }
    for (;;)
    {
      paramMenuItem.RD();
      com.tencent.mm.plugin.sns.model.ap.a((com.tencent.mm.plugin.sns.ui.m)this.okr.getTag());
      return;
      label4065:
      paramMenuItem = com.tencent.mm.modelsns.b.ip(715);
      break;
      label4075:
      localObject2 = ((com.tencent.mm.plugin.sns.ui.m)localObject2).noe.smh;
      break label4039;
      label4101:
      paramMenuItem.nb("");
    }
    this.nMm.bxT().eE(this.oks, this.okt.ksA);
    paramMenuItem = com.tencent.mm.plugin.sns.storage.h.Nl(this.oks);
    if ((paramMenuItem.xb(32)) && (paramMenuItem.bAF().bzm()))
    {
      paramMenuItem = af.byo().Nl(this.oks);
      if ((paramMenuItem != null) && (paramMenuItem.xb(32)))
      {
        if ((this.okt == null) || (this.okt.sqc.ruz != 15) || (this.okt.sqj == 1)) {
          break label4279;
        }
        if (this.scene != 0) {
          break label4274;
        }
      }
      label4274:
      for (paramInt = 1;; paramInt = 2)
      {
        paramMenuItem = new c(paramMenuItem.bBn(), 11, paramInt, "", 5, paramMenuItem.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(paramMenuItem, 0);
        Oc(this.oks);
        return;
      }
      label4279:
      if (this.scene == 0) {}
      for (paramInt = 1;; paramInt = 2)
      {
        paramMenuItem = new c(paramMenuItem.bBn(), 11, paramInt, "", 4, paramMenuItem.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(paramMenuItem, 0);
        break;
      }
    }
    paramMenuItem = this.oks;
    localObject3 = af.byo().Nl(paramMenuItem);
    localObject2 = null;
    paramMenuItem = (MenuItem)localObject2;
    if (localObject3 != null)
    {
      paramMenuItem = (MenuItem)localObject2;
      if (((n)localObject3).xb(32))
      {
        localObject2 = ((n)localObject3).bBm();
        paramMenuItem = (MenuItem)localObject2;
        if (bi.oW((String)localObject2)) {
          paramMenuItem = ((n)localObject3).bBl();
        }
      }
    }
    if (bi.oW(paramMenuItem))
    {
      paramMenuItem = this.okt.sqc.jPK;
      localObject2 = this.okt.sqb.ksA;
      paramMenuItem = av.Ob(paramMenuItem);
    }
    for (;;)
    {
      if (bi.oW(paramMenuItem))
      {
        x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
        return;
      }
      localObject2 = new ch();
      localObject4 = com.tencent.mm.plugin.sns.storage.h.Nl(this.oks);
      if (localObject4 != null)
      {
        localObject5 = u.ic(((n)localObject4).field_snsId);
        localObject6 = u.Hx().v((String)localObject5, true);
        ((u.b)localObject6).p("prePublishId", "sns_" + i.eF(((n)localObject4).field_snsId));
        ((u.b)localObject6).p("preUsername", ((n)localObject4).field_userName);
        ((u.b)localObject6).p("preChatName", "");
        ((u.b)localObject6).p("url", paramMenuItem);
        ((u.b)localObject6).p("preMsgIndex", Integer.valueOf(0));
        ((u.b)localObject6).p("sendAppMsgScene", Integer.valueOf(1));
        ((u.b)localObject6).p("adExtStr", ((n)localObject4).bAJ().nNV);
        ((ch)localObject2).bJF.bJK = ((String)localObject5);
      }
      if ((localObject3 != null) && ((this.okt.sqc.ruz == 18) || (((n)localObject3).xb(32))))
      {
        j.a(j.d.nkf, j.c.njZ, j.e.nkk, 0, (n)localObject3);
        if ((this.okt == null) || (this.okt.sqc.ruz != 15) || (this.okt.sqj == 1)) {
          break label4783;
        }
        if (this.scene != 0) {
          break label4778;
        }
      }
      label4778:
      for (paramInt = 1;; paramInt = 2)
      {
        localObject4 = new c(((n)localObject3).bBn(), 11, paramInt, "", 5, ((n)localObject3).bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject4, 0);
        if (bi.oW(this.okt.ogR)) {
          break;
        }
        Oc(((n)localObject3).bBe());
        return;
      }
      label4783:
      if (this.scene == 0) {}
      for (paramInt = 1;; paramInt = 2)
      {
        localObject4 = new c(((n)localObject3).bBn(), 11, paramInt, "", ((n)localObject3).bBr(), ((n)localObject3).bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject4, 0);
        break;
      }
      com.tencent.mm.plugin.sns.i.a.a((ch)localObject2, paramMenuItem, this.oks);
      ((ch)localObject2).bJF.activity = this.activity;
      ((ch)localObject2).bJF.bJM = 28;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      if (((ch)localObject2).bJG.ret != 0) {
        break;
      }
      l = bi.VE();
      if (bi.oW(paramMenuItem)) {
        break;
      }
      x.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
      localObject2 = "";
      try
      {
        paramMenuItem = URLEncoder.encode(paramMenuItem, "UTF-8");
        com.tencent.mm.plugin.report.service.h.mEJ.h(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
        return;
      }
      catch (UnsupportedEncodingException paramMenuItem)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", paramMenuItem, "", new Object[0]);
          paramMenuItem = (MenuItem)localObject2;
        }
      }
      com.tencent.mm.plugin.sns.model.ap.p(af.byo().Nl(this.oks));
      return;
      if (!(this.okr.getTag() instanceof com.tencent.mm.plugin.sns.ui.m)) {
        break;
      }
      com.tencent.mm.plugin.sns.model.ap.b((com.tencent.mm.plugin.sns.ui.m)this.okr.getTag());
      return;
      localObject2 = com.tencent.mm.plugin.sns.storage.h.Nl(this.oks);
      if (localObject2 == null)
      {
        x.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "edit photo fail, info is null");
        return;
      }
      localObject6 = (com.tencent.mm.plugin.sns.ui.ap)this.okr.getTag();
      localObject3 = this.activity;
      localObject4 = paramMenuItem.getIntent();
      paramMenuItem = this.nMm;
      if (localObject4 == null)
      {
        x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] intent is null!");
        return;
      }
      if (paramMenuItem == null)
      {
        x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] snsContext is null!");
        return;
      }
      if (localObject2 == null)
      {
        x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
        return;
      }
      com.tencent.mm.kernel.g.Ek();
      if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
      {
        x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is not SDCardAvailable");
        return;
      }
      localObject5 = ((com.tencent.mm.plugin.sns.ui.ap)localObject6).bNH;
      paramInt = ((com.tencent.mm.plugin.sns.ui.ap)localObject6).index;
      i = ((com.tencent.mm.plugin.sns.ui.ap)localObject6).position;
      localObject6 = ((n)localObject2).bAJ();
      if ((((bsu)localObject6).sqc == null) || (((bsu)localObject6).sqc.ruA.size() == 0))
      {
        x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is ContentObj null");
        return;
      }
      paramMenuItem.bxT().v((n)localObject2);
      localObject6 = ((n)localObject2).bAJ();
      if (paramInt < ((bsu)localObject6).sqc.ruA.size()) {}
      for (paramMenuItem = (ate)((bsu)localObject6).sqc.ruA.get(paramInt); !af.byl().B(paramMenuItem); paramMenuItem = new ate())
      {
        x.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] media[%s] is illegal", new Object[] { Integer.valueOf(paramMenuItem.nkZ) });
        return;
      }
      localObject7 = com.tencent.mm.modelsns.b.io(716);
      ((com.tencent.mm.modelsns.b)localObject7).nb(i.g((n)localObject2)).ir(((n)localObject2).field_type).bP(((n)localObject2).xb(32)).nb(((n)localObject2).bBo()).nb(paramMenuItem.ksA).ir(paramInt).ir(((bsu)localObject6).sqc.ruA.size());
      ((com.tencent.mm.modelsns.b)localObject7).RD();
      paramMenuItem = com.tencent.mm.modelsns.b.io(744);
      paramMenuItem.nb(i.g((n)localObject2)).ir(((n)localObject2).field_type).bP(((n)localObject2).xb(32)).nb(((n)localObject2).bBo());
      paramMenuItem.b((Intent)localObject4, "intent_key_StatisticsOplog");
      ((Intent)localObject4).putExtra("sns_soon_enter_photoedit_ui", true);
      ((Intent)localObject4).putExtra("sns_gallery_localId", (String)localObject5);
      ((Intent)localObject4).putExtra("sns_gallery_position", paramInt);
      ((Intent)localObject4).putExtra("sns_position", i);
      ((Intent)localObject4).putExtra("sns_gallery_showtype", 1);
      ((Intent)localObject4).putExtra("K_ad_scene", 1);
      ((Intent)localObject4).putExtra("k_is_from_sns_main_timeline", true);
      ((Intent)localObject4).setClass((Context)localObject3, SnsBrowseUI.class);
      paramMenuItem = new Bundle();
      paramMenuItem.putInt("stat_scene", 3);
      paramMenuItem.putString("stat_msg_id", "sns_" + i.eF(((n)localObject2).field_snsId));
      paramMenuItem.putString("stat_send_msg_user", ((n)localObject2).field_userName);
      ((Intent)localObject4).putExtra("_stat_obj", paramMenuItem);
      ((Activity)localObject3).startActivity((Intent)localObject4);
      ((Activity)localObject3).overridePendingTransition(0, 0);
      return;
      if (this.okt == null)
      {
        x.e("MicroMsg.TimeLineMMMenuItemSelectedListener", "favNotelink,tlobj is null, return");
        return;
      }
      paramMenuItem = new ch();
      com.tencent.mm.plugin.sns.i.a.b(paramMenuItem, this.oks);
      paramMenuItem.bJF.activity = this.activity;
      paramMenuItem.bJF.bJM = 28;
      com.tencent.mm.sdk.b.a.sFg.m(paramMenuItem);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
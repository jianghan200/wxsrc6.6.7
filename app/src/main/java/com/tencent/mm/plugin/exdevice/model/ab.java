package com.tencent.mm.plugin.exdevice.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.a.gw.a;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.protocal.c.arc;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.bji;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.brc;
import com.tencent.mm.protocal.c.ce;
import com.tencent.mm.protocal.c.ci;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.LinkedList;

public final class ab
  extends com.tencent.mm.sdk.b.c<gw>
  implements com.tencent.mm.ab.e
{
  private ProgressDialog eHw;
  gw ivS;
  
  public ab()
  {
    this.sFo = gw.class.getName().hashCode();
  }
  
  private boolean a(gw paramgw)
  {
    if (!(paramgw instanceof gw)) {
      x.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mismatched event");
    }
    do
    {
      do
      {
        return false;
        this.ivS = paramgw;
        paramgw = this.ivS.bQd.result;
        x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "action = %s, key = %s", new Object[] { Integer.valueOf(this.ivS.bQd.actionCode), paramgw });
      } while (bi.oW(paramgw));
      switch (this.ivS.bQd.actionCode)
      {
      default: 
        return false;
      }
    } while ((this.ivS.bQd.context == null) || (!(this.ivS.bQd.context instanceof Activity)));
    au.DF().a(540, this);
    paramgw = new u(paramgw);
    au.DF().a(paramgw, 0);
    Context localContext = this.ivS.bQd.context;
    this.ivS.bQd.context.getString(R.l.app_tip);
    this.eHw = h.b(localContext, this.ivS.bQd.context.getString(R.l.scan_loading_tip), new ab.1(this, paramgw));
    return false;
  }
  
  private void aHc()
  {
    if ((this.ivS != null) && (this.ivS.bJX != null))
    {
      this.ivS.bQe.ret = 1;
      this.ivS.bJX.run();
    }
  }
  
  private void atI()
  {
    if ((this.ivS != null) && (this.ivS.bJX != null))
    {
      this.ivS.bQe.ret = 2;
      this.ivS.bJX.run();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
    if (paraml == null) {
      aHc();
    }
    do
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        x.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", new Object[] { Integer.valueOf(paraml.getType()) });
        aHc();
        return;
      }
      x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", new Object[] { Integer.valueOf(paraml.getType()) });
    } while (paraml.getType() != 540);
    au.DF().b(540, this);
    paramString = (u)paraml;
    if ((paramString.diG != null) && (paramString.diG.dIE.dIL != null)) {}
    for (bji localbji = (bji)paramString.diG.dIE.dIL; localbji == null; localbji = null)
    {
      x.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp == null");
      aHc();
      return;
    }
    alx localalx = localbji.rhk;
    x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "deviceId = %s, deviceType = %s", new Object[] { localalx.hbO, localalx.reT });
    aly localaly = localbji.rhl;
    x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "AuthKey = %s, BrandName = %s, CloseStrategy = %s, ConnProto = %s, ConnStrategy = %s, Mac = %s", new Object[] { localaly.reA, localaly.rOv, Integer.valueOf(localaly.rOy), localaly.rOw, Integer.valueOf(localaly.rOx), localaly.rgL });
    paraml = "";
    paramString = "";
    Object localObject3 = new LinkedList();
    Object localObject2 = paraml;
    Object localObject1 = paramString;
    if (localbji.sjw != null)
    {
      if (localbji.sjw.rcJ != null) {
        paraml = localbji.sjw.rcJ;
      }
      if (localbji.sjw.title != null) {
        paramString = localbji.sjw.title;
      }
      localObject2 = paraml;
      localObject1 = paramString;
      if (localbji.sjw.rcK == null) {}
    }
    for (localObject1 = localbji.sjw.rcK;; localObject1 = localObject3)
    {
      localObject2 = new ArrayList();
      if ((localObject1 != null) && (((LinkedList)localObject1).size() > 0))
      {
        paramInt1 = 0;
        while (paramInt1 < ((LinkedList)localObject1).size())
        {
          localObject3 = (brc)((LinkedList)localObject1).get(paramInt1);
          if (((brc)localObject3).type.contains("text")) {
            ((ArrayList)localObject2).add(((brc)localObject3).content);
          }
          paramInt1 += 1;
        }
      }
      x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp.BindTicket = %s", new Object[] { localbji.rgQ });
      boolean bool;
      if (localbji.sjv == 1)
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("device_scan_mode", "SCAN_CATALOG");
        if ((localaly.rOw.contains("3")) || (localaly.rOw.contains("1"))) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          bool = localaly.rOw.contains("4");
          if ((paramInt1 == 0) || (!bool)) {
            break;
          }
          x.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Category connect proto can not be blue&wifi at the same time...");
          return;
        }
        if (paramInt1 != 0) {
          ((Intent)localObject1).putExtra("device_scan_conn_proto", "blue");
        }
        for (;;)
        {
          ((Intent)localObject1).putExtra("device_id", localalx.hbO);
          ((Intent)localObject1).putExtra("device_type", localalx.reT);
          ((Intent)localObject1).putExtra("device_title", localaly.rOC);
          ((Intent)localObject1).putExtra("device_desc", localaly.rOD);
          ((Intent)localObject1).putExtra("device_icon_url", localaly.jPG);
          ((Intent)localObject1).putExtra("device_category_id", localaly.rOE);
          ((Intent)localObject1).putExtra("device_brand_name", localaly.rOv);
          ((Intent)localObject1).putExtra("bind_ticket", localbji.rgQ);
          ((Intent)localObject1).putExtra("device_ble_simple_proto", localaly.cCW);
          ((Intent)localObject1).putExtra("device_airkiss_key", paraml);
          ((Intent)localObject1).putExtra("device_airkiss_title", paramString);
          ((Intent)localObject1).putStringArrayListExtra("device_airkiss_steps", (ArrayList)localObject2);
          com.tencent.mm.bg.d.b(this.ivS.bQd.context, "exdevice", ".ui.ExdeviceBindDeviceGuideUI", (Intent)localObject1);
          atI();
          return;
          if (bool) {
            ((Intent)localObject1).putExtra("device_scan_conn_proto", "wifi");
          }
        }
      }
      paramString = localbji.rgR;
      if (paramString == null)
      {
        x.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mContact == null");
        aHc();
        return;
      }
      atI();
      if (paramString == null) {
        x.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "unable to parse mod contact");
      }
      for (;;)
      {
        paraml = com.tencent.mm.platformtools.ab.a(paramString.rvi);
        if ((this.ivS != null) && (this.ivS.bQd != null) && (this.ivS.bQd.context != null)) {
          break;
        }
        x.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "a8KeyRedirectEvent null");
        return;
        paraml = com.tencent.mm.platformtools.ab.a(paramString.rvi);
        localObject1 = bi.oV(paramString.rXj);
        if ((bi.oW(paraml)) && (bi.oW((String)localObject1)))
        {
          x.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact user is null user:%s enuser:%s", new Object[] { paraml, localObject1 });
        }
        else
        {
          x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact : %s", new Object[] { paraml });
          au.HU();
          localObject2 = com.tencent.mm.model.c.FR().Yg(paraml);
          if ((localObject2 != null) && (paraml.equals(((ai)localObject2).field_encryptUsername)))
          {
            x.w("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "cat's replace user with stranger");
          }
          else
          {
            localObject3 = new com.tencent.mm.storage.ab(paraml);
            ((com.tencent.mm.storage.ab)localObject3).du(paramString.eJM);
            ((com.tencent.mm.storage.ab)localObject3).setType(paramString.ruj & paramString.ruk);
            label1093:
            long l;
            if (!bi.oW((String)localObject1))
            {
              ((com.tencent.mm.storage.ab)localObject3).dD((String)localObject1);
              if (localObject2 != null) {
                break label1626;
              }
              l = 0L;
              label1101:
              ((com.tencent.mm.storage.ab)localObject3).dhP = l;
              ((com.tencent.mm.storage.ab)localObject3).dx(com.tencent.mm.platformtools.ab.a(paramString.rQz));
              ((com.tencent.mm.storage.ab)localObject3).dy(com.tencent.mm.platformtools.ab.a(paramString.ruT));
              ((com.tencent.mm.storage.ab)localObject3).dz(com.tencent.mm.platformtools.ab.a(paramString.ruU));
              ((com.tencent.mm.storage.ab)localObject3).eJ(paramString.eJH);
              ((com.tencent.mm.storage.ab)localObject3).eM(paramString.rup);
              ((com.tencent.mm.storage.ab)localObject3).dw(com.tencent.mm.platformtools.ab.a(paramString.rXd));
              ((com.tencent.mm.storage.ab)localObject3).eN(paramString.rut);
              ((com.tencent.mm.storage.ab)localObject3).eO(paramString.eJL);
              ((com.tencent.mm.storage.ab)localObject3).dS(RegionCodeDecoder.aq(paramString.eJQ, paramString.eJI, paramString.eJJ));
              ((com.tencent.mm.storage.ab)localObject3).dM(paramString.eJK);
              ((com.tencent.mm.storage.ab)localObject3).eF(paramString.rTe);
              ((com.tencent.mm.storage.ab)localObject3).dR(paramString.rTf);
              ((com.tencent.mm.storage.ab)localObject3).setSource(paramString.rdq);
              ((com.tencent.mm.storage.ab)localObject3).eE(paramString.rTi);
              ((com.tencent.mm.storage.ab)localObject3).dA(paramString.rTh);
              if (s.hU(paramString.rTg)) {
                ((com.tencent.mm.storage.ab)localObject3).dQ(paramString.rTg);
              }
              ((com.tencent.mm.storage.ab)localObject3).eQ((int)bi.VE());
              ((com.tencent.mm.storage.ab)localObject3).dv(com.tencent.mm.platformtools.ab.a(paramString.rWH));
              ((com.tencent.mm.storage.ab)localObject3).dB(com.tencent.mm.platformtools.ab.a(paramString.rWJ));
              ((com.tencent.mm.storage.ab)localObject3).dC(com.tencent.mm.platformtools.ab.a(paramString.rWI));
              ((com.tencent.mm.storage.ab)localObject3).dT(paramString.rej);
              ((com.tencent.mm.storage.ab)localObject3).dU(paramString.rXt);
              if ((localObject2 != null) && (!bi.oV(((ai)localObject2).csU).equals(bi.oV(paramString.rXt))))
              {
                com.tencent.mm.at.c.Qt();
                com.tencent.mm.at.c.mA(paraml);
              }
              au.HU();
              com.tencent.mm.model.c.FR().Yl(paraml);
              if (!bi.oW(((ai)localObject3).field_username)) {
                break label1638;
              }
              x.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "dkinit dealModContactExtInfo failed invalid contact");
              label1418:
              ((com.tencent.mm.storage.ab)localObject3).eH(paramString.rXs);
              if ((paramString.rXo != null) && (paramString.rXo.rcy != null))
              {
                ((com.tencent.mm.storage.ab)localObject3).dV(paramString.rXo.rcy.rhn);
                ((com.tencent.mm.storage.ab)localObject3).dW(paramString.rXo.rcy.rho);
                ((com.tencent.mm.storage.ab)localObject3).dX(paramString.rXo.rcy.rhp);
              }
              if (s.hO(paraml)) {
                ((com.tencent.mm.storage.ab)localObject3).Bk();
              }
              if (((com.tencent.mm.storage.ab)localObject3).ckW()) {
                ((com.tencent.mm.storage.ab)localObject3).Bn();
              }
              if (bi.oW((String)localObject1)) {
                break label1968;
              }
              au.HU();
              com.tencent.mm.model.c.FR().b((String)localObject1, (com.tencent.mm.storage.ab)localObject3);
            }
            for (;;)
            {
              if ((localObject2 == null) || ((((ai)localObject2).field_type & 0x800) == (((ai)localObject3).field_type & 0x800))) {
                break label1984;
              }
              if ((((ai)localObject3).field_type & 0x800) == 0) {
                break label1986;
              }
              au.HU();
              com.tencent.mm.model.c.FW().Yv(((ai)localObject3).field_username);
              break;
              if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).dhP <= 0)) {
                break label1093;
              }
              ((com.tencent.mm.storage.ab)localObject3).dD(((ai)localObject2).field_encryptUsername);
              break label1093;
              label1626:
              l = (int)((com.tencent.mm.l.a)localObject2).dhP;
              break label1101;
              label1638:
              Object localObject4 = ((ai)localObject3).field_username;
              Object localObject5 = com.tencent.mm.aa.c.a((String)localObject4, paramString);
              com.tencent.mm.aa.q.KH().a((j)localObject5);
              localObject5 = paramString.rTk;
              if ((!((ai)localObject3).field_username.endsWith("@chatroom")) && (localObject5 != null))
              {
                x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsFlag modcontact " + ((bqd)localObject5).eJS + " " + paramString.rvi);
                x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBg modcontact " + ((bqd)localObject5).eJT);
                x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + ((bqd)localObject5).eJU);
                x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + ((bqd)localObject5).sod);
                if (n.nky != null) {
                  n.nky.a(((ai)localObject3).field_username, (bqd)localObject5);
                }
              }
              localObject5 = com.tencent.mm.model.q.GF();
              if ((localObject5 == null) || (((String)localObject5).equals(localObject4))) {
                break label1418;
              }
              localObject5 = z.MY().kA((String)localObject4);
              ((com.tencent.mm.ac.d)localObject5).field_username = ((String)localObject4);
              ((com.tencent.mm.ac.d)localObject5).field_brandList = paramString.eJR;
              localObject4 = paramString.rTl;
              if (localObject4 != null)
              {
                ((com.tencent.mm.ac.d)localObject5).field_brandFlag = ((qt)localObject4).eJV;
                ((com.tencent.mm.ac.d)localObject5).field_brandInfo = ((qt)localObject4).eJX;
                ((com.tencent.mm.ac.d)localObject5).field_brandIconURL = ((qt)localObject4).eJY;
                ((com.tencent.mm.ac.d)localObject5).field_extInfo = ((qt)localObject4).eJW;
                ((com.tencent.mm.ac.d)localObject5).field_attrSyncVersion = null;
                ((com.tencent.mm.ac.d)localObject5).field_incrementUpdateTime = 0L;
              }
              if (!z.MY().e((com.tencent.mm.ac.d)localObject5)) {
                z.MY().d((com.tencent.mm.ac.d)localObject5);
              }
              ((com.tencent.mm.storage.ab)localObject3).eR(((com.tencent.mm.ac.d)localObject5).field_type);
              break label1418;
              label1968:
              au.HU();
              com.tencent.mm.model.c.FR().S((com.tencent.mm.storage.ab)localObject3);
            }
            label1984:
            continue;
            label1986:
            au.HU();
            com.tencent.mm.model.c.FW().Yw(((ai)localObject3).field_username);
          }
        }
      }
      au.HU();
      paramString = com.tencent.mm.model.c.FR().Yg(paraml);
      if (paramString == null) {
        break;
      }
      if (localaly.cCV != 0)
      {
        x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to DeviceProfileUI.");
        paraml = this.ivS.bQd.context;
        localObject1 = new Intent(paraml, ExdeviceDeviceProfileUI.class);
        if (!(paraml instanceof Activity)) {
          ((Intent)localObject1).addFlags(268435456);
        }
        ((Intent)localObject1).putExtra("device_id", localalx.hbO);
        ((Intent)localObject1).putExtra("device_type", localalx.reT);
        ((Intent)localObject1).putExtra("device_mac", localaly.rgL);
        ((Intent)localObject1).putExtra("device_brand_name", localaly.rOv);
        ((Intent)localObject1).putExtra("device_alias", localaly.eJM);
        ((Intent)localObject1).putExtra("device_desc", localaly.rOD);
        ((Intent)localObject1).putExtra("device_title", localaly.rOC);
        ((Intent)localObject1).putExtra("device_icon_url", localaly.jPG);
        ((Intent)localObject1).putExtra("device_jump_url", localaly.jOU);
        ((Intent)localObject1).putExtra("bind_ticket", localbji.rgQ);
        if (ad.aHe().cA(paramString.field_username, localalx.hbO) != null) {}
        for (bool = true;; bool = false)
        {
          ((Intent)localObject1).putExtra("device_has_bound", bool);
          paraml.startActivity((Intent)localObject1);
          return;
        }
      }
      x.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to ContactInfoUI.");
      paramString = new Intent();
      paramString.putExtra("Contact_User", paraml);
      paramString.putExtra("KIsHardDevice", true);
      paramString.putExtra("KHardDeviceBindTicket", localbji.rgQ);
      paramString.putExtra("device_id", localalx.hbO);
      paramString.putExtra("device_type", localalx.reT);
      com.tencent.mm.plugin.exdevice.a.isu.d(paramString, this.ivS.bQd.context);
      return;
      paraml = (l)localObject2;
      paramString = (String)localObject1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bl;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.q;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import com.tencent.mm.protocal.c.auy;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.protocal.c.sh;
import com.tencent.mm.protocal.c.si;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ay;

public final class g
  implements q
{
  public final void a(pm parampm, byte[] paramArrayOfByte, boolean paramBoolean, s params)
  {
    switch (parampm.rtM)
    {
    default: 
      return;
    }
    params = (auy)new auy().aG(paramArrayOfByte);
    int i = params.rXT;
    com.tencent.mm.kernel.g.Ei().DT().get(2, null);
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.UserInfoSyncExtension", "processModUserInfo bitFlag:%d status:%d PluginFlag:%d PluginSwitch:%d", new Object[] { Integer.valueOf(params.rXT), Integer.valueOf(params.hcd), Integer.valueOf(params.raB), Integer.valueOf(params.rYa) });
    paramArrayOfByte = com.tencent.mm.platformtools.ab.a(params.rvi);
    Object localObject = com.tencent.mm.platformtools.ab.a(params.rQz);
    String str1 = com.tencent.mm.platformtools.ab.a(params.rXU);
    String str2 = com.tencent.mm.platformtools.ab.a(params.rXV);
    i = params.ray;
    parampm = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramArrayOfByte);
    if ((parampm == null) || (parampm.field_username == null) || (!parampm.field_username.equals(paramArrayOfByte))) {
      parampm = new com.tencent.mm.storage.ab(paramArrayOfByte);
    }
    for (;;)
    {
      parampm.du(params.eJM);
      parampm.dx((String)localObject);
      parampm.dS(RegionCodeDecoder.aq(params.eJQ, params.eJI, params.eJJ));
      parampm.eJ(params.eJH);
      parampm.dM(params.eJK);
      parampm.eE(params.rTi);
      parampm.dQ(params.rTg);
      parampm.dA(params.rTh);
      parampm.eK(i);
      ((i)com.tencent.mm.kernel.g.l(i.class)).FR().S(parampm);
      localx.set(2, paramArrayOfByte);
      localx.set(4, localObject);
      localx.set(5, str1);
      localx.set(6, str2);
      localx.set(9, Integer.valueOf(i));
      localObject = new StringBuilder("doCmd : status ");
      i = params.hcd;
      paramArrayOfByte = "code=" + Integer.toHexString(i) + ", status = " + i;
      parampm = paramArrayOfByte;
      if ((i & 0x1) != 0) {
        parampm = paramArrayOfByte + ", open";
      }
      paramArrayOfByte = parampm;
      if ((i & 0x2) != 0) {
        paramArrayOfByte = parampm + ", email-verified";
      }
      parampm = paramArrayOfByte;
      if ((i & 0x4) != 0) {
        parampm = paramArrayOfByte + ", mobile-verified";
      }
      paramArrayOfByte = parampm;
      if ((i & 0x8) != 0) {
        paramArrayOfByte = parampm + ", hide-qq-search";
      }
      parampm = paramArrayOfByte;
      if ((i & 0x10) != 0) {
        parampm = paramArrayOfByte + ", hide-qq-promote";
      }
      paramArrayOfByte = parampm;
      if ((i & 0x20) != 0) {
        paramArrayOfByte = parampm + ", need-verify";
      }
      parampm = paramArrayOfByte;
      if ((i & 0x40) != 0) {
        parampm = paramArrayOfByte + ", has-qq-msg";
      }
      paramArrayOfByte = parampm;
      if ((i & 0x80) != 0) {
        paramArrayOfByte = parampm + ", no-qq-promote";
      }
      parampm = paramArrayOfByte;
      if ((i & 0x100) != 0) {
        parampm = paramArrayOfByte + ", no-mobile-promote";
      }
      paramArrayOfByte = parampm;
      if ((i & 0x200) != 0) {
        paramArrayOfByte = parampm + ", hide-mobile_search";
      }
      parampm = paramArrayOfByte;
      if ((i & 0x1000) != 0) {
        parampm = paramArrayOfByte + ", open-float-bottle";
      }
      paramArrayOfByte = parampm;
      if ((i & 0x20000) != 0) {
        paramArrayOfByte = parampm + ", bind but not upload";
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", paramArrayOfByte);
      localx.set(7, Integer.valueOf(params.hcd));
      if (params.eJL != 0)
      {
        parampm = new bl();
        parampm.csJ = 1;
        parampm.sex = params.eJH;
        parampm.signature = params.eJK;
        parampm.countryCode = params.eJQ;
        parampm.dDf = params.eJI;
        parampm.dDe = params.eJJ;
        parampm.csO = params.rTg;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", " getPersonalCard weibo url : " + parampm.csO + " nickName :" + params.rTh);
        bl.a(parampm);
      }
      paramArrayOfByte = new StringBuilder("userinfo Plugstate: ");
      i = params.raB;
      parampm = "code=" + Integer.toHexString(i) + ", pluginFlag = " + i;
      if ((i & 0x1) != 0)
      {
        parampm = parampm + ", QQMAIL_UNINSTALL";
        if ((i & 0x2) == 0) {
          break label1935;
        }
        parampm = parampm + ", PM_UNINSTALL";
        label1036:
        if ((i & 0x4) == 0) {
          break label1959;
        }
        parampm = parampm + ", FM_UNINSTALL";
        label1064:
        if ((i & 0x8) == 0) {
          break label1983;
        }
        parampm = parampm + ", WEIBO_UNINSTALL";
        label1093:
        if ((i & 0x10) == 0) {
          break label2007;
        }
        parampm = parampm + ", MEDIANOTE_UNINSTALL";
        label1122:
        if ((i & 0x20) == 0) {
          break label2031;
        }
        parampm = parampm + ", QMSG_UNINSTALL";
        label1151:
        if ((i & 0x40) == 0) {
          break label2055;
        }
        parampm = parampm + ", BOTTLE_UNINSTALL";
        label1180:
        if ((i & 0x80) == 0) {
          break label2079;
        }
        parampm = parampm + ", QSYNC_UNISTALL";
        label1210:
        if ((i & 0x100) == 0) {
          break label2103;
        }
        parampm = parampm + ", SHAKE_UNISTALL";
        label1240:
        if ((i & 0x200) == 0) {
          break label2127;
        }
        parampm = parampm + ", LBS_UNISTALL";
        label1270:
        if ((i & 0x400) == 0) {
          break label2151;
        }
        parampm = parampm + ", BOTTLE_CHART_INSTALL";
        label1300:
        if ((i & 0x1000) == 0) {
          break label2175;
        }
        parampm = parampm + ",CHECKQQF_UNINSTALL";
        label1330:
        if ((i & 0x8000) == 0) {
          break label2199;
        }
        parampm = parampm + ",MM_FEEDSAPP_UNINSTALL";
        label1360:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.UserInfoSyncExtension", parampm);
        localx.set(34, Integer.valueOf(params.raB));
        if (1 != params.rXz.rvE) {
          break label2223;
        }
      }
      label1935:
      label1959:
      label1983:
      label2007:
      label2031:
      label2055:
      label2079:
      label2103:
      label2127:
      label2151:
      label2175:
      label2199:
      label2223:
      for (paramBoolean = true;; paramBoolean = false)
      {
        localx.set(8200, Boolean.valueOf(bi.a(Boolean.valueOf(paramBoolean), false)));
        localx.set(8201, Integer.valueOf(bi.a(Integer.valueOf(params.rXz.rvF.rvI), 22)));
        localx.set(8208, Integer.valueOf(bi.a(Integer.valueOf(params.rXz.rvF.rvJ), 8)));
        localx.set(66049, Integer.valueOf(params.rTe));
        localx.set(66050, params.rTf);
        localx.set(40, Integer.valueOf(params.rYa));
        at.dBv.T("last_login_use_voice", params.rYa);
        localx.set(41, Integer.valueOf(params.rTi));
        localx.set(43, params.rTh);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", "doCmd PluginSwitch:" + params.rYa + " WeiboFlag:" + params.rTi);
        localx.set(868518889, Integer.valueOf(params.rXL));
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", "doCmd USERINFO_TXNEWSCATEGORY:" + params.rXL);
        localx.set(42, params.eJM);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", "userid:" + params.ryG + " username:" + params.ryH);
        localx.set(65825, params.ryG);
        localx.set(65826, params.ryH);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", "getiAlbumFlag " + params.eJN);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", "getiAlbumStyle " + params.eJO);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UserInfoSyncExtension", "getPcAlbumBGImgID " + params.eJP);
        parampm = bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(65830, null));
        if ((parampm == null) || (parampm.length() == 0))
        {
          parampm = params.rYd;
          if ((parampm != null) && (parampm.length() > 0)) {
            com.tencent.mm.kernel.g.Ei().DT().set(65830, parampm);
          }
        }
        t.b(1, params);
        return;
        parampm = parampm + ", QQMAIL_INSTALL";
        break;
        parampm = parampm + ", PM_INSTALL";
        break label1036;
        parampm = parampm + ", FM_INSTALL";
        break label1064;
        parampm = parampm + ", WEIBO_INSTALL";
        break label1093;
        parampm = parampm + ", MEDIANOTE_INSTALL";
        break label1122;
        parampm = parampm + ", QMSG_INSTALL";
        break label1151;
        parampm = parampm + ", BOTTLE_INSTALL";
        break label1180;
        parampm = parampm + ", QSYNC_INSTALL";
        break label1210;
        parampm = parampm + ", SHAKE_INSTALL";
        break label1240;
        parampm = parampm + ", LBS_INSTALL";
        break label1270;
        parampm = parampm + ", BOTTLE_CHART_INSTALL";
        break label1300;
        parampm = parampm + ",CHECKQQF_INSTALL";
        break label1330;
        parampm = parampm + ",MM_FEEDSAPP_INSTALL";
        break label1360;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
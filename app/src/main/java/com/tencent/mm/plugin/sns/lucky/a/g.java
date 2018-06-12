package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.mm.g.a.pq;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.g.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.d;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  private static int[] nlW = { 50, 66, 68, 88, 99, 121, 123, 166, 168, 188, 199, 233, 266, 268, 288, 299, 369, 419, 520, 666, 1024 };
  private static String nlq;
  private static g nlr = null;
  private StringBuffer gVP = new StringBuffer();
  public long hcQ = 0L;
  public String nlA = "";
  public String nlB = "";
  public String nlC = "";
  public String nlD = "";
  public String nlE = "";
  public String nlF = "";
  public String nlG = "";
  public String nlH = "";
  public String nlI = "";
  public String nlJ = "";
  public String nlK = "";
  public String nlL = "";
  public String nlM = "";
  public String nlN = "";
  public String nlO = "";
  public String nlP = "";
  public String nlQ = "";
  public String nlR = "";
  public int nlS = -1;
  public String nlT = "";
  private List<List<Integer>> nlU = new LinkedList();
  private List<Integer> nlV = new LinkedList();
  private LinkedList<c> nlX = new LinkedList();
  public String nln = "";
  public long nlo = 0L;
  public String nls = "";
  public int nlt = 0;
  public int nlu = 0;
  public long nlv = 0L;
  public long nlw = 0L;
  public String nlx = "";
  public long nly = 0L;
  public long nlz = 0L;
  
  static
  {
    nlq = "";
  }
  
  public static g bxc()
  {
    com.tencent.mm.kernel.g.Ek();
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return new g();
    }
    Object localObject3 = com.tencent.mm.model.c.c.Jx().fJ("100068");
    Object localObject2 = ((com.tencent.mm.storage.c)localObject3).field_rawXML;
    Object localObject1 = localObject2;
    if (bi.oW((String)localObject2)) {
      localObject1 = "";
    }
    String str = com.tencent.mm.a.g.u(((String)localObject1).getBytes());
    if ((nlr == null) || (!str.equals(nlq)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsCtrlV2", "create newYearSnsCtrl");
      nlr = new g();
    }
    for (;;)
    {
      try
      {
        localObject2 = ((com.tencent.mm.storage.c)localObject3).ckq();
        localObject1 = "";
        if (localObject2 != null) {
          localObject1 = (String)((Map)localObject2).get("SnsHBConfig");
        }
        localObject2 = localObject1;
        if (bi.oW((String)localObject1)) {
          localObject2 = "";
        }
        localObject1 = URLDecoder.decode((String)localObject2, "UTF-8");
        localObject2 = nlr;
        ((g)localObject2).gVP = new StringBuffer();
        ((g)localObject2).nlX.clear();
        localObject3 = bl.z((String)localObject1, "sysmsg");
        if (localObject3 != null) {
          continue;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsCtrlV2", "errr for paser %s", new Object[] { localObject1 });
        nlq = str;
      }
      catch (Exception localException)
      {
        int i;
        int k;
        LinkedList localLinkedList;
        int j;
        StringBuilder localStringBuilder;
        int m;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewYearSnsCtrlV2", "createctrl error " + localException.getMessage());
        continue;
      }
      return nlr;
      ((g)localObject2).nlo = bi.WV((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BeginTime"));
      ((g)localObject2).gVP.append("BeginTime:" + ((g)localObject2).nlo + ";");
      ((g)localObject2).hcQ = bi.WV((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EndTime"));
      ((g)localObject2).gVP.append("EndTime:" + ((g)localObject2).hcQ + ";\n");
      ((g)localObject2).nlt = bi.WU((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMin"));
      ((g)localObject2).nlu = bi.WU((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMax"));
      ((g)localObject2).gVP.append("SvrDownReqLimitLevelMin:" + ((g)localObject2).nlt + " SvrDownReqLimitLevelMax: " + ((g)localObject2).nlu + ";\n");
      ((g)localObject2).nly = bi.WV((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseBeginTime"));
      ((g)localObject2).nlz = bi.WV((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseEndTime"));
      ((g)localObject2).nlA = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenTitle"), "");
      ((g)localObject2).nlB = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenDescription"), "");
      ((g)localObject2).nlC = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenQueryTips"), "");
      ((g)localObject2).nlD = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenAcceptButtonText"), "");
      ((g)localObject2).nlE = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenRejectButtonText"), "");
      ((g)localObject2).nlF = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenTips"), "");
      ((g)localObject2).nlH = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenSuccTips"), "");
      ((g)localObject2).nlI = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenFailTips"), "");
      ((g)localObject2).nlG = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseTips"), "");
      ((g)localObject2).nlJ = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseSuccTips"), "");
      ((g)localObject2).nlK = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseFailTips"), "");
      ((g)localObject2).nlR = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedID"), "");
      ((g)localObject2).nlS = bi.WU((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedCount"));
      ((g)localObject2).nlT = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenID"), "");
      if (((g)localObject2).nlS <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsCtrlV2", "svr MaxPostFeedCount error " + ((g)localObject2).nlS);
        ((g)localObject2).nlS = 1;
      }
      ((g)localObject2).gVP.append("FullScreenID:" + ((g)localObject2).nlT + " BrowseBeginTime:" + ((g)localObject2).nly + " BrowseEndTime:" + ((g)localObject2).nlz + " FullScreenTitle:" + ((g)localObject2).nlA + " FullScreenDescription:" + ((g)localObject2).nlB + " FullScreenQueryTips:" + ((g)localObject2).nlC + " FullScreenAcceptButtonText: " + ((g)localObject2).nlD);
      ((g)localObject2).gVP.append("FullScreenRejectButtonText:" + ((g)localObject2).nlE + " ActionSheetOpenTips:" + ((g)localObject2).nlF + " ActionSheetOpenSuccTips:" + ((g)localObject2).nlH + " ActionSheetOpenFailTips:" + ((g)localObject2).nlI + " ActionSheetCloseTips:" + ((g)localObject2).nlG + " ActionSheetCloseSuccTips: " + ((g)localObject2).nlJ + " ActionSheetCloseFailTips: " + ((g)localObject2).nlK + "MaxPostFeedID: " + ((g)localObject2).nlR + " MaxPostFeedCount:" + ((g)localObject2).nlS);
      ((g)localObject2).nlL = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForHasUsed"), "");
      ((g)localObject2).nlM = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForObtainUsedRight"), "");
      ((g)localObject2).nlN = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForClosedBrowseSwitch"), "");
      ((g)localObject2).nlO = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertButtonText"), "");
      ((g)localObject2).nlP = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTip"), "");
      ((g)localObject2).nlQ = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTipID"), "");
      ((g)localObject2).gVP.append("AlertTipForHasUsed:" + ((g)localObject2).nlL + " AlertTipForObtainUsedRight:" + ((g)localObject2).nlM + " AlertTipForClosedBrowseSwitch:" + ((g)localObject2).nlN + " AlertButtonText:" + ((g)localObject2).nlO + " GoldenCameraTip:" + ((g)localObject2).nlP + " GoldenCameraTipID:" + ((g)localObject2).nlQ);
      i = 0;
      if (i == 0)
      {
        localObject1 = "";
        ((g)localObject2).nln = bi.aG((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "RedPointID" })), "");
        ((g)localObject2).gVP.append("RedPointID:" + ((g)localObject2).nln + ";");
        if (bi.oW(((g)localObject2).nln)) {
          continue;
        }
        if (i == 0)
        {
          localObject1 = "";
          ((g)localObject2).nlv = bi.WV((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "BeginTime" })));
          ((g)localObject2).gVP.append("RedPointID_BeginTime:" + ((g)localObject2).nlv + ";");
          if (i != 0) {
            continue;
          }
          localObject1 = "";
          ((g)localObject2).nlw = bi.WV((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "EndTime" })));
          ((g)localObject2).gVP.append("RedPointID_EndTime:" + ((g)localObject2).nlw + ";\n");
          localObject1 = new c();
          ((c)localObject1).nln = ((g)localObject2).nln;
          ((c)localObject1).nlo = ((g)localObject2).nlv;
          ((c)localObject1).hcQ = ((g)localObject2).nlw;
          ((g)localObject2).nlX.add(localObject1);
          i += 1;
        }
      }
      else
      {
        localObject1 = String.valueOf(i);
        continue;
      }
      localObject1 = String.valueOf(i);
      continue;
      localObject1 = String.valueOf(i);
      continue;
      ((g)localObject2).nlx = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.PostTips"), "");
      ((g)localObject2).gVP.append("PostTips:" + ((g)localObject2).nlx + ";");
      ((g)localObject2).nls = bi.aG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EntranceTips"), "");
      ((g)localObject2).gVP.append("EntranceTips:" + ((g)localObject2).nls + ";");
      ((g)localObject2).nlU.clear();
      i = 0;
      k = bi.WU((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.AmountLevel" + i + ".Count"));
      ((g)localObject2).gVP.append("count: " + i + " | " + k + ";\n");
      if (k != 0)
      {
        localLinkedList = new LinkedList();
        j = 0;
        if (j < k)
        {
          localStringBuilder = new StringBuilder(".sysmsg.NewYearSNSCtrl2016.AmountLevel").append(i).append(".Amount");
          if (j == 0)
          {
            localObject1 = "";
            m = bi.WU((String)((Map)localObject3).get(localObject1));
            localLinkedList.add(Integer.valueOf(m));
            ((g)localObject2).gVP.append("AmountLevel : " + i + " index " + j + " val: " + m + ";");
            j += 1;
          }
          else
          {
            localObject1 = Integer.valueOf(j);
          }
        }
        else
        {
          ((g)localObject2).nlU.add(localLinkedList);
          i += 1;
        }
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsCtrlV2", "dumpinfo " + ((g)localObject2).gVP.toString());
      }
    }
  }
  
  public static boolean bxd()
  {
    com.tencent.mm.kernel.g.Ek();
    return ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sSw, Boolean.valueOf(true))).booleanValue();
  }
  
  public final void bxe()
  {
    Object localObject = k.h(aa.a.sSA);
    if ((((i)localObject).nvf == null) || (bi.oW(((i)localObject).nvf.nvc)))
    {
      ((i)localObject).nvf = new com.tencent.mm.plugin.sns.g.g();
      ((i)localObject).nvf.nvc = this.nlR;
      ((i)localObject).nvf.nvd = 0;
    }
    if ((!bi.oW(((i)localObject).nvf.nvc)) && (((i)localObject).nvf.nvc.equals(this.nlR)))
    {
      com.tencent.mm.plugin.sns.g.g localg = ((i)localObject).nvf;
      localg.nvd -= 1;
      if (((i)localObject).nvf.nvd < 0) {
        ((i)localObject).nvf.nvd = 0;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 " + ((i)localObject).nvf.nvd + " postId: " + this.nlR + " " + bi.cjd().toString());
      try
      {
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sSA, new String(((i)localObject).toByteArray(), Charset.forName("ISO-8859-1")));
        localObject = new pq();
        com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
        return;
        ((i)localObject).nvf = new com.tencent.mm.plugin.sns.g.g();
        ((i)localObject).nvf.nvc = this.nlR;
        ((i)localObject).nvf.nvd = 0;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 save exception:" + localIOException.getLocalizedMessage());
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
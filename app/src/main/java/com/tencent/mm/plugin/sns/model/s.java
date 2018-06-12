package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.ua;
import com.tencent.mm.g.a.ua.a;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.n.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.h.f;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.c.ari;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.atc;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.ath;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.boj;
import com.tencent.mm.protocal.c.bot;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpi;
import com.tencent.mm.protocal.c.bpj;
import com.tencent.mm.protocal.c.bpk;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.bue;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.ku;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class s
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  int dlT = 0;
  private com.tencent.mm.sdk.b.c dlW = new s.2(this);
  private com.tencent.mm.sdk.b.c dlX = new s.3(this);
  boolean hNA = false;
  int nkZ;
  private bsu noh;
  private bsu noi;
  long noj = 0L;
  private int nok = 0;
  private ua nol;
  int nom;
  String non = "";
  HashMap<String, ate> noo = new HashMap();
  HashMap<String, Integer> nop = new HashMap();
  String noq = "";
  
  public s(String paramString1, int paramInt1, int paramInt2, List<String> paramList, bsu parambsu, int paramInt3, String paramString2, int paramInt4, LinkedList<Long> paramLinkedList, int paramInt5, atf paramatf, boolean paramBoolean, LinkedList<bhz> paramLinkedList1, bpi parambpi, com.tencent.mm.bk.b paramb, String paramString3)
  {
    this.noh = parambsu;
    this.nkZ = paramInt3;
    this.nom = paramInt5;
    localObject1 = new b.a();
    ((b.a)localObject1).dIG = new bpj();
    ((b.a)localObject1).dIH = new bpk();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnspost";
    ((b.a)localObject1).dIF = 209;
    ((b.a)localObject1).dII = 97;
    ((b.a)localObject1).dIJ = 1000000097;
    this.diG = ((b.a)localObject1).KT();
    bpj localbpj = (bpj)this.diG.dID.dIL;
    if (!TextUtils.isEmpty(parambsu.nsB.raS.raN))
    {
      localObject1 = new ku();
      ((ku)localObject1).rmR = parambsu.nsB.raS.raN;
      localbpj.snv = ((ku)localObject1);
    }
    localObject1 = u.Hx().ib(paramatf.bJK);
    Object localObject2;
    if (localObject1 != null)
    {
      this.nol = new ua();
      this.nol.cfH.cfI = ((u.b)localObject1).getString("prePublishId", "");
      this.nol.cfH.url = ((u.b)localObject1).getString("url", "");
      this.nol.cfH.cfK = ((u.b)localObject1).getString("preUsername", "");
      this.nol.cfH.cfL = ((u.b)localObject1).getString("preChatName", "");
      this.nol.cfH.cfM = ((u.b)localObject1).getInt("preMsgIndex", 0);
      this.nol.cfH.cfQ = ((u.b)localObject1).getInt("sendAppMsgScene", 0);
      this.nol.cfH.cfR = ((u.b)localObject1).getInt("getA8KeyScene", 0);
      this.nol.cfH.cfS = ((u.b)localObject1).getString("referUrl", null);
      this.nol.cfH.cfT = ((u.b)localObject1).getString("adExtStr", null);
      this.nol.cfH.cfU = paramString3;
      localObject1 = "";
      paramString3 = (String)localObject1;
      if (parambsu.nNV != null)
      {
        localObject2 = new bqw();
        paramString3 = Base64.decode(parambsu.nNV, 0);
      }
    }
    try
    {
      ((bqw)localObject2).aG(paramString3);
      paramString3 = (String)localObject1;
      if (((bqw)localObject2).soY != null) {
        paramString3 = ((bqw)localObject2).soY.jLY;
      }
    }
    catch (Exception paramString3)
    {
      for (;;)
      {
        int i;
        int j;
        paramString3 = (String)localObject1;
      }
    }
    localObject1 = paramString3;
    if (bi.oW(paramString3))
    {
      localObject1 = paramString3;
      if (parambsu.sqb != null) {
        localObject1 = parambsu.sqb.ksA;
      }
    }
    localbpj.snu = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.nol.cfH.cfI, this.nol.cfH.cfK, this.nol.cfH.cfL, Integer.valueOf(t.N(this.nol.cfH.cfK, this.nol.cfH.cfL)), Integer.valueOf(this.nol.cfH.cfR), localObject1 });
    paramString3 = new bhy();
    paramString3.bq(paramString1.getBytes());
    i = paramString1.length();
    j = paramString3.siI;
    if (paramb == null) {}
    for (paramInt3 = 0;; paramInt3 = paramb.lR.length)
    {
      x.i("MicroMsg.NetSceneSnsPost", "len:%d   skb:%d ctx.len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt3) });
      localbpj.smH = paramString3;
      localbpj.snp = paramInt1;
      localbpj.rWb = paramInt2;
      localbpj.rcc = paramString2;
      this.nok = paramInt1;
      if (com.tencent.mm.platformtools.af.ewO)
      {
        localbpj.smH = new bhy();
        x.e("MicroMsg.NetSceneSnsPost", "post error setObjectDesc is null!");
      }
      paramString3 = new LinkedList();
      if ((paramList == null) || (paramList.size() <= 0)) {
        break label931;
      }
      paramList = paramList.iterator();
      for (paramString1 = ""; paramList.hasNext(); paramString1 = paramString1 + "; + " + (String)localObject1)
      {
        localObject1 = (String)paramList.next();
        localObject2 = new bhz();
        ((bhz)localObject2).VO((String)localObject1);
        paramString3.add(localObject2);
      }
    }
    x.d("MicroMsg.NetSceneSnsPost", "post with list : " + paramString1);
    label931:
    localbpj.smR = paramString3;
    localbpj.smQ = paramString3.size();
    localbpj.snq = paramInt4;
    paramString1 = localbpj.snu;
    if (paramatf.rWt != null)
    {
      paramInt1 = paramatf.rWt.smt;
      x.i("MicroMsg.NetSceneSnsPost", "setObjectSource: %d, clientid:%s fromScene:%s, score:%d", new Object[] { Integer.valueOf(paramInt5), paramString2, paramString1, Integer.valueOf(paramInt1) });
      if ((paramLinkedList1 != null) && (paramLinkedList1.size() > 0))
      {
        if (!paramBoolean) {
          break label1211;
        }
        localbpj.smW = paramLinkedList1;
        localbpj.smV = paramLinkedList1.size();
      }
    }
    for (;;)
    {
      x.d("MicroMsg.NetSceneSnsPost", "setObjectSource " + paramInt5);
      localbpj.snr = paramInt5;
      paramString1 = new bue();
      if (!bi.oW(paramatf.token))
      {
        paramString1.srB = paramatf.token;
        paramString1.srC = paramatf.rWk;
        localbpj.sdt = paramString1;
      }
      if ((paramLinkedList == null) || (paramLinkedList.isEmpty())) {
        break label1275;
      }
      localbpj.rYP = paramLinkedList.size();
      paramString1 = paramLinkedList.iterator();
      while (paramString1.hasNext())
      {
        paramList = (Long)paramString1.next();
        paramString2 = new bot();
        paramString2.smF = paramList.longValue();
        localbpj.rWh.add(paramString2);
      }
      paramInt1 = 0;
      break;
      label1211:
      localbpj.rWm = paramLinkedList1;
      localbpj.smX = paramLinkedList1.size();
    }
    x.d("MicroMsg.NetSceneSnsPost", "tagid " + paramLinkedList.size() + " " + localbpj.rWh.toString());
    label1275:
    localbpj.rWn = parambpi;
    if (!bi.oW(paramatf.rWp)) {
      localbpj.smZ = new bpn();
    }
    if (parambpi != null) {
      x.d("MicroMsg.NetSceneSnsPost", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { parambpi.rds, parambpi.rdt, parambpi.rdu });
    }
    if (paramb != null) {
      localbpj.snt = new bhy().b(paramb);
    }
    localbpj.sny = paramatf.rWt;
    paramString1 = af.byo().xd(this.nkZ);
    if ((paramString1 != null) && ((paramString1.field_type == 1) || (paramString1.field_type == 15)) && (parambsu.sqc != null) && (parambsu.sqc.ruA != null) && (parambsu.sqc.ruA.size() > 0) && (paramatf.rWc != null) && (paramatf.rWc.size() == parambsu.sqc.ruA.size()))
    {
      paramString1 = af.getAccSnsPath();
      paramList = parambsu.sqc.ruA.iterator();
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramList.hasNext())
      {
        paramLinkedList = (ate)paramList.next();
        if ((paramLinkedList.hcE == 2) || (paramLinkedList.hcE == 6))
        {
          parambsu = new atc();
          if (paramLinkedList.hcE != 2) {
            break label1755;
          }
          paramInt2 = 2;
          label1554:
          parambsu.jSO = paramInt2;
          if (paramLinkedList.hcE == 6)
          {
            paramString2 = an.s(paramString1, paramLinkedList.ksA);
            paramLinkedList = com.tencent.mm.plugin.sns.data.i.p(paramLinkedList);
            paramString2 = com.tencent.mm.plugin.sight.base.d.Lo(paramString2 + paramLinkedList);
            if (paramString2 != null) {
              parambsu.rVA = ((int)Math.round(paramString2.jdD / 1000.0D));
            }
          }
          paramString2 = (ari)paramatf.rWc.get(paramInt1);
          paramString2 = af.byd().fj(paramString2.rTF);
        }
      }
      try
      {
        parambsu.rdq = ((ath)new ath().aG(paramString2.nJM)).rWF;
        x.i("MicroMsg.NetSceneSnsPost", "post add mediaInfo, Source: %s, videoPlayLength: %s, MediaType: %s", new Object[] { Integer.valueOf(parambsu.rdq), Integer.valueOf(parambsu.rVA), Integer.valueOf(parambsu.jSO) });
        localbpj.snx.add(parambsu);
        paramInt1 += 1;
        continue;
        label1755:
        paramInt2 = 1;
        break label1554;
        localbpj.snw = localbpj.snx.size();
        x.i("MicroMsg.NetSceneSnsPost", "post mediaCount: %s", new Object[] { Integer.valueOf(localbpj.snw) });
        localbpj.rTr = new bhy().bq(com.tencent.mm.plugin.normsg.a.b.lFJ.bjE());
        return;
      }
      catch (Exception paramString2)
      {
        for (;;) {}
      }
    }
  }
  
  private void Md(String paramString)
  {
    this.noq = paramString;
    paramString = com.tencent.mm.model.c.c.Jx().fJ("100132");
    if (paramString.isValid()) {
      this.dlT = bi.getInt((String)paramString.ckq().get("needUploadData"), 1);
    }
    if ((this.nom != 12) && (this.dlT == 0)) {}
    for (;;)
    {
      return;
      if ((this.noi != null) && (this.noi.sqc != null) && (this.noi.sqc.ruA != null) && (this.noi.sqc.ruA.size() > 0))
      {
        paramString = this.noi.sqc.ruA;
        com.tencent.mm.sdk.b.a.sFg.b(this.dlW);
        com.tencent.mm.sdk.b.a.sFg.b(this.dlX);
        paramString = paramString.iterator();
        int i = 0;
        while (paramString.hasNext())
        {
          Object localObject = (ate)paramString.next();
          if (((ate)localObject).hcE == 2)
          {
            String str = g.C((ate)localObject);
            if (!bi.oW(str))
            {
              this.nop.put(str, Integer.valueOf(i));
              this.noo.put(str, localObject);
              localObject = new ms();
              ((ms)localObject).bXH.filePath = str;
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
              i += 1;
            }
          }
        }
      }
    }
  }
  
  private static boolean a(bsu parambsu1, bsu parambsu2)
  {
    if ((parambsu1 == null) || (parambsu2 == null) || (parambsu1.sqc == null) || (parambsu2.sqc == null)) {
      return false;
    }
    String str1 = af.getAccSnsPath();
    int i = 0;
    while ((i < parambsu1.sqc.ruA.size()) && (i < parambsu2.sqc.ruA.size()))
    {
      Object localObject2 = (ate)parambsu1.sqc.ruA.get(i);
      Object localObject1 = (ate)parambsu2.sqc.ruA.get(i);
      String str2 = com.tencent.mm.plugin.sns.data.i.m((ate)localObject2);
      String str3 = com.tencent.mm.plugin.sns.data.i.n((ate)localObject2);
      String str4 = com.tencent.mm.plugin.sns.data.i.o((ate)localObject2);
      String str5 = com.tencent.mm.plugin.sns.data.i.p((ate)localObject2);
      String str6 = com.tencent.mm.plugin.sns.data.i.l((ate)localObject1);
      String str7 = com.tencent.mm.plugin.sns.data.i.e((ate)localObject1);
      String str8 = com.tencent.mm.plugin.sns.data.i.f((ate)localObject1);
      String str9 = com.tencent.mm.plugin.sns.data.i.j((ate)localObject1);
      x.d("MicroMsg.NetSceneSnsPost", "updateMediaFileName " + str2 + "  - " + str6);
      localObject2 = an.s(str1, ((ate)localObject2).ksA);
      localObject1 = an.s(str1, ((ate)localObject1).ksA);
      FileOp.mL((String)localObject1);
      FileOp.av((String)localObject2 + str2, (String)localObject1 + str6);
      FileOp.av((String)localObject2 + str3, (String)localObject1 + str7);
      FileOp.av((String)localObject2 + str4, (String)localObject1 + str8);
      if (FileOp.cn((String)localObject2 + str5))
      {
        x.i("MicroMsg.NetSceneSnsPost", "post done copy file %s", new Object[] { (String)localObject1 + str9 });
        FileOp.av((String)localObject2 + str5, (String)localObject1 + str9);
      }
      i += 1;
    }
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSnsPost", "post netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    Object localObject1 = (bpk)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramInt2 == 4) {
      paramq = af.byo().xd(this.nkZ);
    }
    try
    {
      paramArrayOfByte = (atf)new atf().aG(paramq.field_postBuf);
      paramArrayOfByte.rWj = paramInt3;
      paramArrayOfByte.rWr = ((bpk)localObject1).rWr;
      paramArrayOfByte.rWs = false;
      paramq.field_postBuf = paramArrayOfByte.toByteArray();
      if (paramq != null)
      {
        paramq.bBi();
        af.byo().b(this.nkZ, paramq);
        af.byn().ws(this.nkZ);
        x.d("MicroMsg.NetSceneSnsPost", "onErrorServer, publish SnsPostFailEvent, snsInfoLocalId: " + paramq.bBe());
        paramq = new qh();
        paramq.caS.caT = this.nkZ;
        com.tencent.mm.sdk.b.a.sFg.m(paramq);
      }
      if ((this.noh != null) && (this.noh.sqc != null) && (this.noh.sqc.ruz == 21))
      {
        com.tencent.mm.plugin.sns.lucky.a.b.kB(8);
        switch (paramInt3)
        {
        default: 
          com.tencent.mm.plugin.sns.lucky.a.b.kB(20);
        }
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        com.tencent.mm.plugin.sns.lucky.a.b.kB(17);
        continue;
        com.tencent.mm.plugin.sns.lucky.a.b.kB(19);
        continue;
        com.tencent.mm.plugin.sns.lucky.a.b.kB(18);
      }
      if (paramInt3 != 0)
      {
        af.byn().ws(this.nkZ);
        if ((this.noh != null) && (this.noh.sqc != null) && (this.noh.sqc.ruz == 21))
        {
          com.tencent.mm.plugin.sns.lucky.a.b.kB(8);
          com.tencent.mm.plugin.sns.lucky.a.b.kB(16);
        }
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      if ((((bpk)localObject1).slX == null) || (((bpk)localObject1).slX.smH == null) || (((bpk)localObject1).slX.smH.siK == null))
      {
        x.e("MicroMsg.NetSceneSnsPost", "err respone buffer is null ignore");
        af.byn().ws(this.nkZ);
        paramq = af.byo().xd(this.nkZ);
        paramq.bBh();
        af.byo().b(this.nkZ, paramq);
        paramq = new qi();
        paramq.caU.caT = this.nkZ;
        com.tencent.mm.sdk.b.a.sFg.m(paramq);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      Object localObject2 = new String(((bpk)localObject1).slX.smH.siK.toByteArray());
      if (this.nok == 0) {
        x.d("MicroMsg.NetSceneSnsPost", "resp " + (String)localObject2 + "  ");
      }
      this.noi = com.tencent.mm.modelsns.e.ng((String)localObject2);
      if (this.noi.sqh != null)
      {
        paramq = this.noi.ksA;
        paramArrayOfByte = this.noi.sqh.dyQ;
        String str = this.noi.sqh.dyP;
        com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
        locald.r("20CurrPublishId", paramq + ",");
        locald.r("20SourcePublishId", paramArrayOfByte + ",");
        locald.r("20SourceAdUxInfo", str + ",");
        x.i("MicroMsg.SnsVideoStatistic", "report snsad_shareReport: " + locald.wF());
        h.mEJ.h(13004, new Object[] { locald });
      }
      paramArrayOfByte = af.byo().xd(this.nkZ);
      paramq = paramArrayOfByte;
      if (paramArrayOfByte == null)
      {
        x.e("MicroMsg.NetSceneSnsPost", "the item has delete");
        paramq = new com.tencent.mm.plugin.sns.storage.n();
      }
      paramq.hK(((bpk)localObject1).slX.lOH);
      paramq.Nj((String)localObject2);
      paramq.field_localFlag &= 0xFFFFFFEF;
      paramq.fe(((bpk)localObject1).slX.rlK);
      paramq.fg(((bpk)localObject1).slX.rlK);
      if ((((bpk)localObject1).slX.rXx & 0x1) > 0) {
        paramq.bBb();
      }
      this.noj = ((bpk)localObject1).slX.rlK;
      if (this.nol != null)
      {
        this.nol.cfH.cfJ = ("sns_" + com.tencent.mm.plugin.sns.data.i.eF(this.noj));
        com.tencent.mm.sdk.b.a.sFg.m(this.nol);
      }
      localObject2 = ((bpk)localObject1).slX;
      ((boy)localObject2).smH.bq(new byte[0]);
      try
      {
        if ((((boy)localObject2).smN == 0) && (((boy)localObject2).smK == 0) && (((boy)localObject2).smQ == 0) && (((boy)localObject2).rYP == 0)) {
          x.d("MicroMsg.NetSceneSnsPost", "no use! this buf");
        }
        for (;;)
        {
          paramq.bBh();
          af.byo().b(this.nkZ, paramq);
          af.byn().ws(this.nkZ);
          if (((this.noh.sqc.ruz == 1) && (this.noh.csE == 0) && (this.noi.csE == 1)) || ((this.noh.sqc.ruz == 15) && (this.noh.sqj == 0) && (this.noi.sqj == 1) && (com.tencent.mm.plugin.sns.storage.i.fb(v.NE(paramq.bAK()))))) {
            new ag(Looper.getMainLooper()).post(new s.1(this));
          }
          paramArrayOfByte = com.tencent.mm.plugin.sns.h.e.nxO.bR(Integer.valueOf(this.nkZ));
          if ((paramArrayOfByte != null) && (this.noi != null))
          {
            paramArrayOfByte.RA();
            paramArrayOfByte.RB();
            paramArrayOfByte.nd(this.noi.ksA);
            paramArrayOfByte.ir(this.noi.sqc.ruz);
            paramArrayOfByte.RD();
          }
          paramArrayOfByte = f.nxO.bR(Integer.valueOf(this.nkZ));
          if ((paramArrayOfByte != null) && (this.noi != null))
          {
            paramArrayOfByte.RA();
            paramArrayOfByte.RB();
            paramArrayOfByte.nd(this.noi.ksA);
            paramArrayOfByte.ir(this.noi.sqc.ruz);
            paramArrayOfByte.RD();
          }
          paramArrayOfByte = new qi();
          paramArrayOfByte.caU.caT = this.nkZ;
          com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfByte);
          if (paramq.field_type == 21)
          {
            if (paramq.field_pravited != 1) {
              paramInt1 = ((bpk)localObject1).slX.rXx;
            }
            com.tencent.mm.plugin.sns.lucky.a.b.kB(7);
            paramArrayOfByte = this.noi.ksA;
            System.currentTimeMillis();
          }
          a(this.noh, this.noi);
          if (this.noi != null) {
            break;
          }
          paramArrayOfByte = "";
          Md(paramArrayOfByte);
          if (af.byk() != null) {
            af.byk().bwX();
          }
          try
          {
            if (paramq.field_type == 15)
            {
              localObject1 = (ate)this.noi.sqc.ruA.get(0);
              if (localObject1 != null)
              {
                paramq = an.s(af.getAccSnsPath(), ((ate)localObject1).ksA) + com.tencent.mm.plugin.sns.data.i.j((ate)localObject1);
                paramArrayOfByte = com.tencent.mm.modelvideo.n.SY();
                localObject1 = ((ate)localObject1).jPK;
                l = ((boy)localObject2).rlK;
                if (!bi.oW((String)localObject1))
                {
                  boolean bool = bi.oW(paramq);
                  if (!bool) {
                    break label1610;
                  }
                }
              }
            }
          }
          catch (Exception paramq)
          {
            long l;
            for (;;) {}
          }
          this.diJ.a(paramInt2, paramInt3, paramString, this);
          return;
          paramq.aK(((boy)localObject2).toByteArray());
        }
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NetSceneSnsPost", paramArrayOfByte, "", new Object[0]);
          continue;
          paramArrayOfByte = this.noi.spZ;
          continue;
          label1610:
          localObject2 = ((String)localObject1).hashCode();
          x.d("MicroMsg.SubCoreMediaRpt", "rpt sns video upload info snsKey[%s] url[%s] snsId[%d] path[%s]", new Object[] { localObject2, localObject1, Long.valueOf(l), paramq });
          localObject1 = (n.a)paramArrayOfByte.ena.get(localObject2);
          if (localObject1 != null)
          {
            ((n.a)localObject1).enq = String.valueOf(l);
            ((n.a)localObject1).enp = paramq;
            paramArrayOfByte.a(((n.a)localObject1).emE, (String)localObject2);
          }
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;) {}
    }
  }
  
  public final int getType()
  {
    return 209;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
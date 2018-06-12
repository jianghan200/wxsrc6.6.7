package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sns.data.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.c.ari;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.ath;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.bot;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpi;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.de;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ax
{
  private static final Pattern eXS = Pattern.compile("(\n){3,}");
  public int afv;
  private String cXR;
  public aso caX;
  int nkX;
  int nkY;
  boy nsA = null;
  av nsB;
  public brh nsC;
  public cfn nsD;
  private boolean nsE;
  List<h> nss;
  String nst;
  String nsu;
  LinkedList<bqg> nsv;
  LinkedList<Long> nsw;
  public bsu nsx = e.RF();
  public atf nsy = new atf();
  n nsz = new n();
  
  public ax(int paramInt)
  {
    Object localObject = new av();
    ((av)localObject).raS = new at();
    ((av)localObject).raU = new ct();
    ((av)localObject).raV = new de();
    this.nsB = ((av)localObject);
    this.nsC = new brh();
    this.caX = new aso();
    this.nsD = null;
    this.cXR = "";
    this.nsE = false;
    this.cXR = af.bxU();
    this.afv = paramInt;
    this.nsx.sqc.ruz = paramInt;
    x.d("MicroMsg.UploadPackHelper", "contentType " + paramInt);
    this.nsx.rVG = 0;
    this.nsx.hbL = this.cXR;
    this.nsy.rcc = com.tencent.mm.a.g.u((af.bxU() + bi.VG() + System.currentTimeMillis()).getBytes());
    this.nsy.rWa = 0;
    this.nsy.rWb = 0;
    this.nsy.rVG = 0;
    this.nsy.rWe = 0;
    this.nsy.dHg = 0;
    this.nsy.rWg = 0;
    this.nsy.rWi = 0;
    localObject = new boy();
    ((boy)localObject).rlK = 0L;
    ((boy)localObject).lOH = 0;
    ((boy)localObject).smI = 0;
    ((boy)localObject).rdS = af.bxU();
    ((boy)localObject).smL = new LinkedList();
    ((boy)localObject).smJ = 0;
    ((boy)localObject).smK = 0;
    ((boy)localObject).smR = new LinkedList();
    ((boy)localObject).smP = 0;
    ((boy)localObject).smQ = 0;
    ((boy)localObject).smO = new LinkedList();
    ((boy)localObject).smM = 0;
    ((boy)localObject).smN = 0;
    ((boy)localObject).rXx = 1;
    ((boy)localObject).smI = 0;
    ((boy)localObject).smS = 0;
    ((boy)localObject).smH = new bhy().bq(new byte[0]);
    this.nsA = ((boy)localObject);
    localObject = this.nsz;
    ((n)localObject).field_localFlag |= 0x10;
    this.nsz.hK((int)(System.currentTimeMillis() / 1000L));
    this.nsz.field_type = paramInt;
    this.nsz.field_userName = this.cXR;
    this.nsz.field_pravited = 0;
    this.nsz.field_stringSeq = "0000099999999999999999999";
    this.nsz.wZ(2);
    this.nsz.bBb();
    if ((paramInt == 1) || (paramInt == 2)) {
      this.nsz.wZ(4);
    }
    if (paramInt == 7) {
      this.nsz.xc(2);
    }
    this.nsw = new LinkedList();
    this.nsy.rWh = this.nsw;
    localObject = this.nsw.iterator();
    while (((Iterator)localObject).hasNext())
    {
      long l = ((Long)((Iterator)localObject).next()).longValue();
      bot localbot = new bot();
      localbot.smF = l;
      this.nsA.rcM.add(localbot);
    }
    this.nsA.rYP = this.nsw.size();
  }
  
  public static void MI(String paramString)
  {
    paramString = new File(paramString);
    if (!paramString.getParentFile().exists()) {
      paramString.getParentFile().mkdirs();
    }
  }
  
  private static String Mx(String paramString)
  {
    if (paramString == null) {}
    String str2;
    for (String str1 = "";; str2 = paramString)
    {
      paramString = str1;
      try
      {
        str1 = str1.trim();
        paramString = str1;
        str1 = str1.replace("\r\n", "\n");
        paramString = str1;
        str1 = eXS.matcher(str1).replaceAll("\n\n");
        return str1;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      x.e("MicroMsg.UploadPackHelper", "filter desc error ");
      return paramString;
    }
  }
  
  public static ate ab(String paramString1, String paramString2, String paramString3)
  {
    ate localate = e.RG();
    localate.ksA = paramString1;
    x.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localate.hcE = 2;
    localate.jPK = paramString2;
    localate.rVD = 0;
    localate.rVE = paramString3;
    localate.rVF = 0;
    localate.rVK = 1;
    return localate;
  }
  
  public static ate c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    ate localate = e.RG();
    localate.ksA = paramString1;
    x.i("MicroMsg.UploadPackHelper", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", new Object[] { Integer.valueOf(6), paramString2, paramString4, paramString5, paramString6 });
    localate.hcE = 6;
    if (FileOp.mI(paramString2) <= 0L) {
      return null;
    }
    paramString1 = new h(paramString2, 6);
    paramString1.nlc = paramString4;
    paramString2 = af.byd().a(paramString1, paramString2, paramString3, paramString5, paramString6);
    if ((paramString2.height > 0) && (paramString2.width > 0) && (paramString2.fileSize > 0))
    {
      paramString1 = new atg();
      paramString1.rWv = paramString2.height;
      paramString1.rWu = paramString2.width;
      paramString1.rWw = paramString2.fileSize;
    }
    for (;;)
    {
      localate.ksA = ("Locall_path" + paramString2.nkZ);
      localate.rVH = paramString1;
      localate.nkZ = paramString2.nkZ;
      return localate;
      paramString1 = null;
    }
  }
  
  private static ate eC(String paramString1, String paramString2)
  {
    Object localObject = null;
    ate localate = e.RG();
    localate.ksA = paramString1;
    x.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localate.hcE = 2;
    if (FileOp.mI(paramString2) <= 0L) {}
    do
    {
      return null;
      paramString1 = af.getAccSnsTmpPath() + com.tencent.mm.a.g.u(new StringBuilder().append(paramString2).append(System.currentTimeMillis()).toString().getBytes());
      FileOp.y(paramString2, paramString1);
      paramString1 = new h(paramString1, 2);
      paramString2 = new LinkedList();
      paramString2.add(paramString1);
      paramString1 = af.byd().cn(paramString2);
    } while ((paramString1 == null) || (paramString1.size() == 0));
    paramString2 = (h)paramString1.get(0);
    paramString1 = (String)localObject;
    if (paramString2.height > 0)
    {
      paramString1 = (String)localObject;
      if (paramString2.width > 0)
      {
        paramString1 = (String)localObject;
        if (paramString2.fileSize > 0)
        {
          paramString1 = new atg();
          paramString1.rWv = paramString2.height;
          paramString1.rWu = paramString2.width;
          paramString1.rWw = paramString2.fileSize;
        }
      }
    }
    localate.ksA = ("Locall_path" + paramString2.nkZ);
    localate.rVH = paramString1;
    localate.nkZ = paramString2.nkZ;
    return localate;
  }
  
  private static ate s(String paramString, byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte))
    {
      x.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.Ac() + " attachBuf is null");
      return null;
    }
    String str = af.getAccSnsTmpPath() + com.tencent.mm.a.g.u(new StringBuilder(" ").append(System.currentTimeMillis()).toString().getBytes());
    FileOp.mL(af.getAccSnsTmpPath());
    x.d("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.Ac() + " buildUploadAttachInfo file:" + str);
    if (FileOp.b(str, paramArrayOfByte, paramArrayOfByte.length) < 0)
    {
      x.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.Ac() + " writeFile error file:" + str);
      return null;
    }
    return eC(paramString, str);
  }
  
  public final ax MA(String paramString)
  {
    this.nsx.ogR = paramString;
    return this;
  }
  
  public final ax MB(String paramString)
  {
    this.nsu = paramString;
    this.nsx.sqc.jOS = paramString;
    return this;
  }
  
  public final ax MC(String paramString)
  {
    this.nsx.sqc.jPK = paramString;
    return this;
  }
  
  public final ax MD(String paramString)
  {
    this.nsx.sqc.bHD = paramString;
    return this;
  }
  
  public final ax ME(String paramString)
  {
    dc localdc2 = this.nsx.sqb;
    dc localdc1 = localdc2;
    if (localdc2 == null) {
      localdc1 = new dc();
    }
    localdc1.ksA = paramString;
    this.nsx.sqb = localdc1;
    return this;
  }
  
  public final ax MF(String paramString)
  {
    dc localdc2 = this.nsx.sqb;
    dc localdc1 = localdc2;
    if (localdc2 == null) {
      localdc1 = new dc();
    }
    localdc1.jSv = paramString;
    this.nsx.sqb = localdc1;
    return this;
  }
  
  public final ax MG(String paramString)
  {
    this.nsx.qIb = bi.oV(paramString);
    return this;
  }
  
  public final ax MH(String paramString)
  {
    this.nsx.qIc = bi.oV(paramString);
    return this;
  }
  
  public final ax My(String paramString)
  {
    this.nst = Mx(paramString);
    this.nsx.spZ = this.nst;
    return this;
  }
  
  public final ax Mz(String paramString)
  {
    this.nsx.sqg = paramString;
    this.nsB.raS.raM = paramString;
    return this;
  }
  
  public final ax a(arj paramarj)
  {
    if (paramarj == null) {
      return this;
    }
    this.nsx.sqa = paramarj;
    return this;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    paramArrayOfByte = s("", paramArrayOfByte);
    if (paramArrayOfByte == null)
    {
      x.e("MicroMsg.UploadPackHelper", "share img o.data is null!");
      return false;
    }
    paramArrayOfByte.jOS = paramString1;
    if (paramInt > 0) {
      paramArrayOfByte.bID = paramInt;
    }
    if (!bi.oW(paramString3)) {
      paramArrayOfByte.nME = paramString3;
    }
    if (!bi.oW(paramString2)) {
      paramArrayOfByte.bHD = paramString2;
    }
    if (!bi.oW(paramString1)) {
      paramArrayOfByte.jOS = paramString1;
    }
    this.nsx.sqc.ruA.add(paramArrayOfByte);
    paramString1 = new ari();
    paramString1.rTF = paramArrayOfByte.nkZ;
    this.nsy.rWc.add(paramString1);
    return true;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    paramArrayOfByte = s("", paramArrayOfByte);
    if ((paramArrayOfByte == null) || ((bi.oW(paramString2)) && (bi.oW(paramString3))))
    {
      x.e("MicroMsg.UploadPackHelper", "share music/video  appmsg.thumbData is null!");
      return false;
    }
    if (!bi.oW(paramString1)) {
      this.nsx.sqc.jPK = paramString1;
    }
    if (!bi.oW(paramString3))
    {
      paramArrayOfByte.jPK = paramString3;
      paramArrayOfByte.rVD = 0;
    }
    for (;;)
    {
      if (!bi.oW(paramString2))
      {
        paramArrayOfByte.rVI = paramString2;
        paramArrayOfByte.rVJ = 0;
      }
      paramArrayOfByte.hcE = paramInt;
      paramArrayOfByte.bHD = bi.aG(paramString4, "");
      paramArrayOfByte.jOS = bi.aG(paramString5, "");
      this.nsx.sqc.ruA.add(paramArrayOfByte);
      paramString1 = new ari();
      paramString1.rTF = paramArrayOfByte.nkZ;
      this.nsy.rWc.add(paramString1);
      return true;
      if (!bi.oW(paramString2))
      {
        paramArrayOfByte.jPK = paramString2;
        paramArrayOfByte.rVD = 0;
      }
    }
  }
  
  public final ax aa(String paramString1, String paramString2, String paramString3)
  {
    at localat = this.nsB.raS;
    Object localObject = paramString1;
    if (bi.oW(paramString1)) {
      localObject = "";
    }
    localat.jQb = ((String)localObject);
    localObject = this.nsB.raS;
    paramString1 = paramString2;
    if (bi.oW(paramString2)) {
      paramString1 = "";
    }
    ((at)localObject).raN = paramString1;
    paramString2 = this.nsB.raS;
    paramString1 = paramString3;
    if (bi.oW(paramString3)) {
      paramString1 = "";
    }
    paramString2.raO = paramString1;
    return this;
  }
  
  public final ax ag(LinkedList<bqg> paramLinkedList)
  {
    this.nsv = paramLinkedList;
    this.nsy.rWd = paramLinkedList;
    paramLinkedList = this.nsv.iterator();
    while (paramLinkedList.hasNext())
    {
      bqg localbqg = (bqg)paramLinkedList.next();
      bon localbon = new bon();
      localbon.rdS = localbqg.hbL;
      this.nsA.smR.add(localbon);
    }
    this.nsA.smP = this.nsv.size();
    this.nsA.smQ = this.nsv.size();
    return this;
  }
  
  @Deprecated
  public final boolean b(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    paramString1 = ab("", paramString1, paramString2);
    if (paramString1 == null)
    {
      x.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
      return false;
    }
    paramString1.jOS = paramString3;
    if (paramInt > 0) {
      paramString1.bID = paramInt;
    }
    if (!bi.oW(paramString4)) {
      paramString1.nME = paramString4;
    }
    this.nsx.sqc.ruA.add(paramString1);
    return true;
  }
  
  public final boolean b(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    return a(paramArrayOfByte, paramString1, paramString2, -1, "");
  }
  
  public final ax ci(List<String> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      this.nsA.rXx = 1;
    }
    LinkedList localLinkedList;
    do
    {
      return this;
      paramList = paramList.iterator();
      localLinkedList = new LinkedList();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        bhz localbhz = new bhz();
        localbhz.VO(str);
        localLinkedList.add(localbhz);
      }
      this.nsy.rWm = localLinkedList;
      if (this.nsA.rXx == 3)
      {
        this.nsA.smW = localLinkedList;
        this.nsA.smV = localLinkedList.size();
        return this;
      }
    } while (this.nsA.rXx != 5);
    this.nsA.rWm = localLinkedList;
    this.nsA.smX = localLinkedList.size();
    return this;
  }
  
  public final void cj(List<h> paramList)
  {
    this.nss = paramList;
    paramList = af.byd().cn(this.nss);
    Object localObject1 = new LinkedList();
    if (paramList == null) {}
    for (;;)
    {
      return;
      Object localObject2 = paramList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        h localh = (h)((Iterator)localObject2).next();
        ari localari = new ari();
        localari.rTF = localh.nkZ;
        ((LinkedList)localObject1).add(localari);
      }
      this.nsy.rWc = ((LinkedList)localObject1);
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject1 = (h)paramList.next();
        localObject2 = new atg();
        ((atg)localObject2).rWv = 0.0F;
        ((atg)localObject2).rWu = 0.0F;
        ((atg)localObject2).rWw = 0.0F;
        if ((((h)localObject1).height > 0) && (((h)localObject1).width > 0) && (((h)localObject1).fileSize > 0))
        {
          ((atg)localObject2).rWv = ((h)localObject1).height;
          ((atg)localObject2).rWu = ((h)localObject1).width;
          ((atg)localObject2).rWw = ((h)localObject1).fileSize;
        }
        localObject1 = e.a("Locall_path" + ((h)localObject1).nkZ, ((h)localObject1).type, "", "", 0, 0, this.nkY, "", (atg)localObject2);
        this.nsx.sqc.ruA.add(localObject1);
      }
    }
  }
  
  public final int commit()
  {
    long l = System.currentTimeMillis();
    try
    {
      this.nsy.rWf = System.currentTimeMillis();
      this.nsy.dHg = 0;
      this.nsz.aK(this.nsA.toByteArray());
      this.nsz.field_postBuf = this.nsy.toByteArray();
      x.d("MicroMsg.UploadPackHelper", "snsObj " + this.nsA.toString());
      x.d("MicroMsg.UploadPackHelper", "postinfo " + this.nsy.toString());
      x.d("MicroMsg.UploadPackHelper", "timelineObj " + this.nsx.toString());
      if (this.nsx.sqc.ruA != null)
      {
        x.d("MicroMsg.UploadPackHelper", "timelineObj MeidaCount %d ", new Object[] { Integer.valueOf(this.nsx.sqc.ruA.size()) });
        i = 0;
        while (i < this.nsx.sqc.ruA.size())
        {
          ate localate = (ate)this.nsx.sqc.ruA.get(i);
          if (localate != null) {
            x.d("MicroMsg.UploadPackHelper", "timelineObj media %d %s", new Object[] { Integer.valueOf(localate.nkZ), bi.aG(localate.jPK, "") });
          }
          i += 1;
        }
      }
    }
    catch (Exception localException1)
    {
      int i;
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.UploadPackHelper", localException1, "", new Object[0]);
      }
      if (this.nsB != null) {
        this.nsx.nsB = this.nsB;
      }
      if (this.nsD != null) {
        this.nsx.nsD = this.nsD;
      }
      this.nsz.c(this.nsx);
      int k = af.byo().y(this.nsz);
      Iterator localIterator = this.nsy.rWc.iterator();
      int j = 0;
      Object localObject1 = null;
      if (localIterator.hasNext())
      {
        Object localObject2 = (ari)localIterator.next();
        r localr = af.byd().fj(((ari)localObject2).rTF);
        for (;;)
        {
          try
          {
            ath localath = (ath)new ath().aG(localr.nJM);
            if (this.nsx.sqb != null) {
              localath.bPS = this.nsx.sqb.ksA;
            }
            if (this.caX != null) {
              this.caX.rUQ = 0;
            }
            localath.rWE = this.caX;
            localath.afv = this.nsx.sqc.ruz;
            if ((localath.afv == 1) || (localath.afv == 15))
            {
              if (!bi.oW(localath.bPS))
              {
                i = 5;
                localath.rWF = i;
              }
            }
            else
            {
              localr.nJM = localath.toByteArray();
              af.byd().a(((ari)localObject2).rTF, localr);
              localObject2 = localath.bKg;
              j += 1;
              localObject1 = localObject2;
              break;
            }
            if ((localath.rWE == null) || (localath.afv != 15)) {
              break label616;
            }
            if (localath.rWE.rUP)
            {
              i = 1;
              localath.rWF = i;
              continue;
            }
          }
          catch (Exception localException2)
          {
            x.e("MicroMsg.UploadPackHelper", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
          }
          i = 2;
          continue;
          label616:
          boolean bool = ((h)this.nss.get(j)).nld;
          if (bool) {
            i = 1;
          } else {
            i = 2;
          }
        }
      }
      x.i("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s", new Object[] { Integer.valueOf(k), Integer.valueOf(this.nsz.field_type), localObject1 });
      if ((k > 0) && (this.nsz.field_type == 15)) {
        aq.eA(v.ah("sns_table_", k), (String)localObject1);
      }
      x.d("MicroMsg.UploadPackHelper", "pack commit result " + k + " cost " + (System.currentTimeMillis() - l));
      return k;
    }
  }
  
  public final ax eB(String paramString1, String paramString2)
  {
    this.nsy.token = paramString1;
    this.nsy.rWk = paramString2;
    return this;
  }
  
  public final boolean eD(String paramString1, String paramString2)
  {
    String str = af.getAccSnsTmpPath() + com.tencent.mm.a.g.u(paramString1.getBytes());
    MI(str);
    FileOp.y(paramString1, str);
    paramString1 = eC("", str);
    if (paramString1 == null)
    {
      x.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      return false;
    }
    paramString1.jOS = paramString2;
    if (bi.oW(paramString1.bHD)) {
      paramString1.bHD = paramString2;
    }
    this.nsx.sqc.ruA.add(paramString1);
    paramString2 = new ari();
    paramString2.rTF = paramString1.nkZ;
    this.nsy.rWc.add(paramString2);
    return true;
  }
  
  public final void f(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    bpi localbpi = new bpi();
    localbpi.rds = paramString1;
    localbpi.rdt = paramString2;
    localbpi.rdu = paramString3;
    localbpi.nRo = paramInt1;
    localbpi.nRp = paramInt2;
    this.nsy.rWn = localbpi;
  }
  
  public final boolean o(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str = af.getAccSnsTmpPath() + com.tencent.mm.a.g.u(paramString1.getBytes());
    MI(str);
    FileOp.y(paramString1, str);
    paramString1 = af.getAccSnsTmpPath() + com.tencent.mm.a.g.u(paramString2.getBytes());
    FileOp.y(paramString2, paramString1);
    paramString1 = c("", str, paramString1, paramString4, "", "");
    if (paramString1 == null)
    {
      x.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      return false;
    }
    paramString1.jOS = paramString3;
    if (bi.oW(paramString1.bHD)) {
      paramString1.bHD = paramString3;
    }
    this.nsx.sqc.ruA.add(paramString1);
    paramString2 = new ari();
    paramString2.rTF = paramString1.nkZ;
    this.nsy.rWc.add(paramString2);
    return true;
  }
  
  public final void setSessionId(String paramString)
  {
    this.nsy.bJK = paramString;
  }
  
  public final ax wC(int paramInt)
  {
    this.nsx.sqe = 1;
    this.nsx.sqf = paramInt;
    return this;
  }
  
  public final void wD(int paramInt)
  {
    x.d("MicroMsg.UploadPackHelper", "set post form " + paramInt);
    this.nsy.rWg = paramInt;
  }
  
  public final ax wE(int paramInt)
  {
    this.nkY = paramInt;
    this.nsy.rVG = paramInt;
    this.nsx.rVG = paramInt;
    if (paramInt > 0)
    {
      this.nsz.field_pravited = paramInt;
      this.nsz.bAY();
      this.nsz.xc(2);
      this.nsz.bBc();
    }
    return this;
  }
  
  public final ax wF(int paramInt)
  {
    this.nkX = paramInt;
    this.nsy.rWb = paramInt;
    return this;
  }
  
  public final ax wG(int paramInt)
  {
    this.nsy.rWi = paramInt;
    return this;
  }
  
  public final ax wH(int paramInt)
  {
    if (paramInt == 1) {
      this.nsA.rXx = 3;
    }
    for (;;)
    {
      this.nsy.rWl = paramInt;
      return this;
      if (paramInt == 0) {
        this.nsA.rXx = 5;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
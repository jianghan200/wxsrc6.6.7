package com.tencent.mm.ar;

import android.os.Looper;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.lu;
import com.tencent.mm.g.a.lu.a;
import com.tencent.mm.g.a.sg;
import com.tencent.mm.k.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.protocal.c.afy;
import com.tencent.mm.protocal.c.afz;
import com.tencent.mm.protocal.c.ayv;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends l
  implements com.tencent.mm.ab.n, com.tencent.mm.network.k
{
  private int bJE;
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private boolean ecQ = false;
  private int flags = -1;
  
  public k(int paramInt)
  {
    this.bJE = paramInt;
    this.ecQ = false;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:" + paramInt);
  }
  
  public k(boolean paramBoolean)
  {
    this.bJE = 26;
    this.ecQ = false;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:26");
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "isOnlyCheckInReqList: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      this.flags = 1;
    }
  }
  
  private void Q(List<ayv> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "[oneliang]empty update expose scene list");
      return;
    }
    r.Qp();
    String str = n.Qm();
    int i = 0;
    label31:
    ayv localayv;
    Object localObject;
    m localm;
    if (i < paramList.size())
    {
      localayv = (ayv)paramList.get(i);
      localObject = r.Qp().bi(localayv.jTt, this.bJE);
      if ((localObject == null) || (((m)localObject).version != localayv.hcD))
      {
        com.tencent.mm.a.e.deleteFile(str + r.Qp().bk(localayv.jTt, this.bJE));
        localm = a(localayv);
        localm.bWA = -1;
        if (localObject != null) {
          break label215;
        }
        r.Qp().a(localm);
      }
    }
    for (;;)
    {
      localObject = new j(localm.id, 19);
      g.Eh().dpP.a((l)localObject, 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "[oneliang]name:%s,packName:%s", new Object[] { localayv.jPe, localayv.rwQ });
      i += 1;
      break label31;
      break;
      label215:
      r.Qp().b(localm);
    }
  }
  
  private void R(List<ayv> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, package list is empty");
    }
    int i;
    m localm1;
    m localm2;
    do
    {
      return;
      while (!paramList.hasNext())
      {
        do
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, pkgList.size: %d", new Object[] { Integer.valueOf(paramList.size()) });
          i = ((Integer)g.Ei().DT().get(aa.a.sQP, Integer.valueOf(-1))).intValue();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "configPkgId: %d", new Object[] { Integer.valueOf(i) });
        } while (i == -1);
        localm1 = r.Qp().bi(i, this.bJE);
        paramList = paramList.iterator();
      }
      localm2 = a((ayv)paramList.next());
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "newInfo.id: %d, version: %d", new Object[] { Integer.valueOf(localm2.id), Integer.valueOf(localm2.version) });
      if ((localm1 != null) && (localm2.id == i))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "find match old pkg, update one");
        r.Qp().b(localm2);
        return;
      }
    } while ((localm1 != null) || (localm2.id != i));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "insert new pkg");
    r.Qp().a(localm2);
  }
  
  private void S(List<ayv> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "update sense where location but package list is empty.");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetPackageList", "start update sense where location. package list size " + paramList.size());
    paramList = paramList.iterator();
    label54:
    Object localObject2;
    Object localObject1;
    while (paramList.hasNext())
    {
      localObject2 = (ayv)paramList.next();
      localObject1 = r.Qp().bi(((ayv)localObject2).jTt, this.bJE);
      if ((localObject1 == null) || (((m)localObject1).version != ((ayv)localObject2).hcD))
      {
        localObject2 = a((ayv)localObject2);
        ((m)localObject2).bWA = -1;
        if (localObject1 != null) {
          break label155;
        }
        r.Qp().a((m)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new j(((m)localObject2).id, 36);
      g.Eh().dpP.a((l)localObject1, 0);
      break label54;
      break;
      label155:
      r.Qp().b((m)localObject2);
    }
  }
  
  private m a(ayv paramayv)
  {
    m localm = new m();
    localm.id = paramayv.jTt;
    localm.version = paramayv.hcD;
    localm.name = paramayv.jPe;
    localm.size = paramayv.hcy;
    localm.ecV = paramayv.rwQ;
    localm.status = 5;
    localm.bPh = this.bJE;
    return localm;
  }
  
  private void f(LinkedList<ayv> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty upload speex config list");
      return;
    }
    r.Qp();
    String str = n.Qm();
    int i = 0;
    label30:
    ayv localayv;
    Object localObject;
    m localm;
    if (i < paramLinkedList.size())
    {
      localayv = (ayv)paramLinkedList.get(i);
      localObject = r.Qp().bi(localayv.jTt, this.bJE);
      if ((localObject == null) || (((m)localObject).version != localayv.hcD))
      {
        com.tencent.mm.a.e.deleteFile(str + r.Qp().bk(localayv.jTt, this.bJE));
        localm = a(localayv);
        localm.bWA = -1;
        if (localObject != null) {
          break label363;
        }
        r.Qp().a(localm);
      }
    }
    for (;;)
    {
      localObject = new j(localm.id, 9);
      g.Eh().dpP.a((l)localObject, 0);
      if (ab.a(localayv.rdp) != null)
      {
        localObject = new String(ab.a(localayv.rdp));
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetPackageList", "xml:" + (String)localObject);
      }
      if (ab.a(localayv.sbD) != null)
      {
        localObject = new String(ab.a(localayv.sbD));
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetPackageList", "xml2:" + (String)localObject);
      }
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetPackageList", "xml3:" + localayv.toString());
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetPackageList", "xml4:" + localayv.jPe);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetPackageList", "xml5:" + localayv.rwQ);
      i += 1;
      break label30;
      break;
      label363:
      r.Qp().b(localm);
    }
  }
  
  private void g(LinkedList<ayv> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty background pkg list");
      return;
    }
    r.Qp();
    String str = n.Qm();
    int i = 0;
    label30:
    Object localObject1;
    Object localObject2;
    m localm;
    if (i < paramLinkedList.size())
    {
      localObject1 = (ayv)paramLinkedList.get(i);
      localObject2 = r.Qp().bi(((ayv)localObject1).jTt, this.bJE);
      if ((localObject2 == null) || (((m)localObject2).version != ((ayv)localObject1).hcD))
      {
        com.tencent.mm.a.e.deleteFile(str + r.Qp().bk(((ayv)localObject1).jTt, this.bJE));
        localm = a((ayv)localObject1);
        localm.bWA = -1;
        if (localObject2 != null) {
          break label225;
        }
        r.Qp().a(localm);
      }
    }
    for (;;)
    {
      localObject2 = ab.a(((ayv)localObject1).rdp);
      if ((localObject2 != null) && (localObject2.length > 0))
      {
        r.Qp();
        localObject1 = n.bj(((ayv)localObject1).jTt, this.bJE);
        com.tencent.mm.a.e.deleteFile(str + (String)localObject1);
        com.tencent.mm.a.e.b(str, (String)localObject1, (byte[])localObject2);
      }
      i += 1;
      break label30;
      break;
      label225:
      r.Qp().b(localm);
    }
  }
  
  @Deprecated
  private void h(LinkedList<ayv> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
      return;
    }
    int i = 0;
    label22:
    Object localObject1;
    Object localObject2;
    m localm;
    if (i < paramLinkedList.size())
    {
      localObject1 = (ayv)paramLinkedList.get(i);
      localObject2 = r.Qp().bi(((ayv)localObject1).jTt, this.bJE);
      localm = a((ayv)localObject1);
      localm.bWA = -1;
      if (localObject2 != null) {
        break label139;
      }
      r.Qp().a(localm);
    }
    for (;;)
    {
      localObject1 = ab.a(((ayv)localObject1).rdp);
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        localObject2 = new ArrayList();
        ((List)localObject2).add(new String((byte[])localObject1));
        ((List)localObject2).size();
      }
      i += 1;
      break label22;
      break;
      label139:
      r.Qp().b(localm);
    }
  }
  
  private void i(LinkedList<ayv> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0)) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
    }
    String str1;
    ayv localayv;
    m localm;
    byte[] arrayOfByte;
    for (;;)
    {
      return;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramLinkedList.size());
      r.Qp();
      str1 = n.Qm();
      int i = 0;
      while (i < paramLinkedList.size())
      {
        localayv = (ayv)paramLinkedList.get(i);
        localm = r.Qp().bi(localayv.jTt, this.bJE);
        arrayOfByte = ab.a(localayv.rdp);
        if (localayv.rdp != null) {
          break label124;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetPackageList", "error give me a null thumb it should be xml");
        i += 1;
      }
    }
    label124:
    String str2;
    Object localObject;
    if ((localm == null) || (localm.version != localayv.hcD))
    {
      str2 = new String(arrayOfByte);
      localObject = "zh_CN";
      if (str2.indexOf("zh_CN") >= 0)
      {
        label168:
        str2 = (String)localObject + "_ARTIST.mm";
        com.tencent.mm.a.e.deleteFile(str1 + str2);
        com.tencent.mm.a.e.deleteFile(str1 + (String)localObject + "_ARTISTF.mm");
        com.tencent.mm.a.e.b(str1, str2, arrayOfByte);
      }
    }
    else
    {
      localObject = a(localayv);
      ((m)localObject).bWA = -1;
      if (localm != null) {
        break label383;
      }
      r.Qp().a((m)localObject);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", localayv.jPe + " - " + localayv.jTt + " - " + localayv.rwQ + " - " + localayv.hcy);
      break;
      localObject = "en";
      if (str2.indexOf("en") >= 0) {
        break label168;
      }
      localObject = "zh_TW";
      if (str2.indexOf("zh_TW") >= 0) {
        break label168;
      }
      localObject = "en";
      break label168;
      label383:
      r.Qp().b((m)localObject);
    }
  }
  
  private void j(LinkedList<ayv> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty config list");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "updateConfigList pkgList size " + paramLinkedList.size());
    int i = 0;
    label47:
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (i < paramLinkedList.size())
    {
      localObject1 = (ayv)paramLinkedList.get(i);
      localObject2 = r.Qp().bi(((ayv)localObject1).jTt, this.bJE);
      localObject3 = a((ayv)localObject1);
      ((m)localObject3).bWA = -1;
      if (localObject2 != null) {
        break label329;
      }
      r.Qp().a((m)localObject3);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", ((ayv)localObject1).jPe + " - " + ((ayv)localObject1).jTt + " - " + ((ayv)localObject1).rwQ + " - " + ((ayv)localObject1).hcy);
      localObject2 = ab.a(((ayv)localObject1).rdp);
      localObject3 = new String((byte[])localObject2);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "ConfigList xml : " + (String)localObject3);
      localObject3 = ((com.tencent.mm.plugin.zero.b.a)g.l(com.tencent.mm.plugin.zero.b.a.class)).AU();
      int j = ((ayv)localObject1).jTt;
      localObject1 = new File(c.dgQ);
      if (!((File)localObject1).exists()) {
        ((File)localObject1).mkdir();
      }
      try
      {
        localObject1 = new File(c.fU(j));
        if (!((File)localObject1).exists()) {
          ((File)localObject1).createNewFile();
        }
        com.tencent.mm.a.e.b(c.fU(j), (byte[])localObject2, localObject2.length);
        ((c)localObject3).p(j, new String((byte[])localObject2));
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigListDecoder", "exception:%s", new Object[] { bi.i(localException) });
        }
      }
      i += 1;
      break label47;
      break;
      label329:
      r.Qp().b((m)localObject3);
    }
  }
  
  private void k(LinkedList<ayv> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty regioncode pkg list");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramLinkedList.size());
    paramLinkedList = paramLinkedList.iterator();
    label50:
    ayv localayv;
    m localm2;
    if (paramLinkedList.hasNext())
    {
      localayv = (ayv)paramLinkedList.next();
      m localm1 = r.Qp().bi(localayv.jTt, this.bJE);
      localm2 = a(localayv);
      localm2.bWA = -1;
      if (localm1 != null) {
        break label174;
      }
      r.Qp().a(localm2);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", localayv.jPe + " - " + localayv.jTt + " - " + localayv.rwQ + " - " + localayv.hcy);
      break label50;
      break;
      label174:
      r.Qp().b(localm2);
    }
  }
  
  private void l(LinkedList<ayv> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetPackageList", "empty address pkg list");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetPackageList", "updateRcptAddress pkgList size " + paramLinkedList.size());
    int i = 0;
    label47:
    Object localObject2;
    Object localObject1;
    if (i < paramLinkedList.size())
    {
      localObject2 = (ayv)paramLinkedList.get(i);
      localObject1 = r.Qp().bi(((ayv)localObject2).jTt, this.bJE);
      localObject2 = a((ayv)localObject2);
      ((m)localObject2).bWA = -1;
      if (localObject1 != null) {
        break label142;
      }
      r.Qp().a((m)localObject2);
    }
    for (;;)
    {
      localObject1 = new j(((m)localObject2).id, 12);
      g.Eh().dpP.a((l)localObject1, 0);
      i += 1;
      break label47;
      break;
      label142:
      r.Qp().b((m)localObject2);
    }
  }
  
  private void m(LinkedList<ayv> paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "updateLangPkg");
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0)) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty langage package list");
    }
    for (;;)
    {
      return;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        Object localObject = (ayv)paramLinkedList.next();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "pkg.toString %s", new Object[] { localObject.toString() });
        m localm = r.Qp().bi(((ayv)localObject).jTt, this.bJE);
        localObject = a((ayv)localObject);
        ((m)localObject).bWA = -1;
        if (localm == null) {
          r.Qp().a((m)localObject);
        } else {
          r.Qp().b((m)localObject);
        }
      }
    }
  }
  
  private void n(LinkedList<ayv> paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "updateAppleEmojiPackage");
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "update apple emoji but package list is empty.");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetPackageList", "start update apple emoji. package list size " + paramLinkedList.size());
    paramLinkedList = paramLinkedList.iterator();
    label58:
    Object localObject2;
    Object localObject1;
    while (paramLinkedList.hasNext())
    {
      localObject2 = (ayv)paramLinkedList.next();
      localObject1 = r.Qp().bi(((ayv)localObject2).jTt, this.bJE);
      if ((localObject1 == null) || (((m)localObject1).version != ((ayv)localObject2).hcD))
      {
        localObject2 = a((ayv)localObject2);
        ((m)localObject2).bWA = -1;
        if (localObject1 != null) {
          break label159;
        }
        r.Qp().a((m)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new j(((m)localObject2).id, 37);
      g.Eh().dpP.a((l)localObject1, 0);
      break label58;
      break;
      label159:
      r.Qp().b((m)localObject2);
    }
  }
  
  protected final int Cc()
  {
    return 20;
  }
  
  public final boolean KX()
  {
    return true;
  }
  
  public final int Lf()
  {
    return this.bJE;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "DoScene dkregcode :" + this.bJE);
    parame1 = new b.a();
    parame1.dIG = new afy();
    parame1.dIH = new afz();
    parame1.uri = "/cgi-bin/micromsg-bin/getpackagelist";
    parame1.dIF = 159;
    parame1.dII = 51;
    parame1.dIJ = 1000000051;
    this.diG = parame1.KT();
    parame1 = (afy)this.diG.dID.dIL;
    LinkedList localLinkedList = new LinkedList();
    if (!g.Eg().Dx()) {
      return -1;
    }
    m[] arrayOfm = r.Qp().ik(this.bJE);
    if ((arrayOfm != null) && (arrayOfm.length > 0))
    {
      int i = 0;
      if (i < arrayOfm.length)
      {
        ayv localayv = new ayv();
        localayv.jTt = arrayOfm[i].id;
        if ((af.exc) && (this.bJE == 7)) {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "isShakeGetConfigList");
        }
        for (localayv.hcD = 0;; localayv.hcD = arrayOfm[i].version)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "package, id:%d, ver:%d", new Object[] { Integer.valueOf(localayv.jTt), Integer.valueOf(localayv.hcD) });
          localLinkedList.add(localayv);
          i += 1;
          break;
        }
      }
    }
    parame1.hbG = localLinkedList;
    parame1.hbF = localLinkedList.size();
    parame1.hcE = this.bJE;
    if (this.flags != -1) {
      parame1.rbZ = this.flags;
    }
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "onGYNetEnd, netid:%d, errType:%d, errCode:%d, pkgType:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.bJE), paramString });
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (afz)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramq.hcE != this.bJE)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetPackageList", "packageType is not consistent, respType = %d", new Object[] { Integer.valueOf(paramq.hcE) });
      this.diJ.a(3, -1, "", this);
      return;
    }
    paramArrayOfByte = paramq.hbG;
    Object localObject1 = new StringBuilder("summer list size:");
    if (paramArrayOfByte == null)
    {
      paramInt1 = 0;
      label164:
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetPackageList", paramInt1 + " packageType: " + this.bJE + " resp.Type: " + paramq.hcE);
      if (this.bJE != 2) {
        break label308;
      }
      h(paramArrayOfByte);
    }
    for (;;)
    {
      localObject1 = new sg();
      ((sg)localObject1).cdb.cdc = paramArrayOfByte;
      ((sg)localObject1).cdb.bJE = this.bJE;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
      if (paramq.rlm <= 0) {
        break label1562;
      }
      if (a(this.dIX, this.diJ) != -1) {
        break;
      }
      this.diJ.a(3, -1, "doScene failed", this);
      return;
      paramInt1 = paramArrayOfByte.size();
      break label164;
      label308:
      if (this.bJE == 1)
      {
        g(paramArrayOfByte);
      }
      else if (this.bJE == 4)
      {
        i(paramArrayOfByte);
      }
      else if (this.bJE == 6)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetPackageList", "change new egg.");
      }
      else if (this.bJE == 7)
      {
        j(paramArrayOfByte);
      }
      else
      {
        Object localObject2;
        m localm2;
        if (this.bJE == 8)
        {
          if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "empty regioncode pkg list");
          }
          else
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramArrayOfByte.size());
            localObject1 = (ayv)paramArrayOfByte.get(0);
            localObject2 = r.Qp().bi(((ayv)localObject1).jTt, this.bJE);
            localm2 = a((ayv)localObject1);
            localm2.bWA = -1;
            if (localObject2 == null) {
              r.Qp().a(localm2);
            }
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", ((ayv)localObject1).jPe + " - " + ((ayv)localObject1).jTt + " - " + ((ayv)localObject1).rwQ + " - " + ((ayv)localObject1).hcy);
              break;
              r.Qp().b(localm2);
            }
          }
        }
        else if (this.bJE == 9) {
          f(paramArrayOfByte);
        } else if (this.bJE == 10)
        {
          if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetPackageList", "empty mass send top config package");
          }
          else
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramArrayOfByte.size());
            localObject2 = (ayv)paramArrayOfByte.get(0);
            localObject1 = r.Qp().bi(((ayv)localObject2).jTt, this.bJE);
            localObject2 = a((ayv)localObject2);
            ((m)localObject2).bWA = -1;
            if (localObject1 == null) {
              r.Qp().a((m)localObject2);
            } else {
              r.Qp().b((m)localObject2);
            }
          }
        }
        else if (this.bJE != 11) {
          if (this.bJE == 12) {
            l(paramArrayOfByte);
          } else if (this.bJE == 5) {
            m(paramArrayOfByte);
          } else if (this.bJE == 20) {
            k(paramArrayOfByte);
          } else if (this.bJE == 17)
          {
            if ((paramArrayOfByte == null) || (paramArrayOfByte.size() == 0))
            {
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "poi type is null");
            }
            else
            {
              localObject1 = (ayv)paramArrayOfByte.get(0);
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", ((ayv)localObject1).jPe + " - " + ((ayv)localObject1).jTt + " - " + ((ayv)localObject1).rwQ + " - " + ((ayv)localObject1).hcy);
              localObject2 = r.Qp().bi(((ayv)localObject1).jTt, this.bJE);
              localm2 = a((ayv)localObject1);
              localm2.bWA = -1;
              if (localObject2 == null) {
                r.Qp().a(localm2);
              }
              for (;;)
              {
                localObject2 = new lu();
                try
                {
                  ((lu)localObject2).bWi.content = ab.a(((ayv)localObject1).rdp);
                  if (((lu)localObject2).bWi.content == null) {
                    break;
                  }
                  com.tencent.mm.sdk.b.a.sFg.a((com.tencent.mm.sdk.b.b)localObject2, Looper.getMainLooper());
                }
                catch (Exception localException)
                {
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetPackageList", localException.getMessage());
                }
                r.Qp().b(localm2);
              }
            }
          }
          else if (this.bJE != 18) {
            if (this.bJE == 19)
            {
              Q(paramArrayOfByte);
            }
            else
            {
              m localm1;
              if (this.bJE == 21)
              {
                if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
                {
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "summer trace config empty scene list");
                }
                else
                {
                  localObject2 = (ayv)paramArrayOfByte.get(0);
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "summer getpackage pkg: " + localObject2 + "|id = " + ((ayv)localObject2).jTt + "|Name = " + ((ayv)localObject2).jPe + "|PackName = " + ((ayv)localObject2).rwQ + "|Size = " + ((ayv)localObject2).hcy + "|Version = " + ((ayv)localObject2).hcD);
                  localm1 = r.Qp().bi(((ayv)localObject2).jTt, this.bJE);
                  localObject2 = a((ayv)localObject2);
                  ((m)localObject2).bWA = -1;
                  if (localm1 == null) {
                    r.Qp().a((m)localObject2);
                  } else if (localm1.version < ((m)localObject2).version) {
                    r.Qp().b((m)localObject2);
                  } else {
                    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "summer old version [%d] new version[%d], not need update", new Object[] { Integer.valueOf(localm1.version), Integer.valueOf(((m)localObject2).version) });
                  }
                }
              }
              else if (23 == this.bJE)
              {
                if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
                {
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "permission tips config is empty");
                }
                else
                {
                  localObject2 = (ayv)paramArrayOfByte.get(0);
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetPackageList", "permission getpackage pkg: " + localObject2 + "|id = " + ((ayv)localObject2).jTt + "|Name = " + ((ayv)localObject2).jPe + "|PackName = " + ((ayv)localObject2).rwQ + "|Size = " + ((ayv)localObject2).hcy + "|Version = " + ((ayv)localObject2).hcD);
                  localm1 = r.Qp().bi(((ayv)localObject2).jTt, this.bJE);
                  localObject2 = a((ayv)localObject2);
                  ((m)localObject2).bWA = -1;
                  if (localm1 == null) {
                    r.Qp().a((m)localObject2);
                  } else if (localm1.version < ((m)localObject2).version) {
                    r.Qp().b((m)localObject2);
                  }
                }
              }
              else if (this.bJE == 26) {
                R(paramArrayOfByte);
              } else if (this.bJE == 36) {
                S(paramArrayOfByte);
              } else if (this.bJE == 37) {
                n(paramArrayOfByte);
              }
            }
          }
        }
      }
    }
    label1562:
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  protected final void a(l.a parama) {}
  
  protected final boolean b(l paraml)
  {
    if (!(paraml instanceof k)) {}
    while (this.bJE != ((k)paraml).bJE) {
      return true;
    }
    return false;
  }
  
  public final int getType()
  {
    return 159;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ar/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
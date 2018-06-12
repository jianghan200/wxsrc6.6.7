package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.ui.e.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ag
{
  public int mRetryCount = 0;
  public Bankcard paw = null;
  public ArrayList<Bankcard> pcZ = new ArrayList();
  ArrayList<Bankcard> pda = new ArrayList();
  public af prA = null;
  public Bankcard prB = null;
  ae prC = null;
  public k prD = null;
  public b prE = null;
  private List<c> prF = new LinkedList();
  public Bankcard prG = null;
  public long prH = bi.VE();
  long prI = 0L;
  public long prJ = -1L;
  private String prK = "";
  public int prL = 10000;
  public String prM = "";
  public String prN = "";
  private ArrayList<Bankcard> pry = new ArrayList();
  private ArrayList<Bankcard> prz = new ArrayList();
  
  public ag()
  {
    bPB();
  }
  
  public static void Pc(String paramString)
  {
    if (!bi.oW(paramString))
    {
      g.Ek();
      g.Ei().DT().set(196612, paramString);
    }
  }
  
  private void bPI()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "recordDataState()");
    if (this.prA == null) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "userInfo == null");
    }
    if (this.pcZ == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "bankcards == null");
      if (this.pda != null) {
        break label142;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "virtualBankcards == null");
      label49:
      if (this.paw != null) {
        break label192;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "balance == null");
      label63:
      if (this.prB != null) {
        break label202;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "historyBankcard == null");
    }
    for (;;)
    {
      if (this.prD != null) {
        break label212;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo == null");
      return;
      if (this.pcZ.size() == 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == 0");
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == " + this.pcZ.size());
      break;
      label142:
      if (this.pda.size() == 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == 0");
        break label49;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == " + this.pda.size());
      break label49;
      label192:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "balance != null");
      break label63;
      label202:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "historyBankcard != null");
    }
    label212:
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo != null");
  }
  
  public static boolean cD(List<Bankcard> paramList)
  {
    if (paramList.size() == 0) {}
    int j;
    do
    {
      return false;
      g.Ek();
      Object localObject = (String)g.Ei().DT().get(196659, null);
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        return true;
      }
      localObject = ((String)localObject).split("&");
      if ((localObject == null) || (localObject.length == 0)) {
        return true;
      }
      int i = 0;
      j = 0;
      if (i < localObject.length)
      {
        CharSequence localCharSequence = localObject[i];
        int k = j;
        int m;
        if (!TextUtils.isEmpty(localCharSequence)) {
          m = 0;
        }
        for (;;)
        {
          k = j;
          if (m < paramList.size())
          {
            Bankcard localBankcard = (Bankcard)paramList.get(m);
            if ((localBankcard != null) && (localCharSequence.equals(localBankcard.field_bankcardType))) {
              k = j + 1;
            }
          }
          else
          {
            i += 1;
            j = k;
            break;
          }
          m += 1;
        }
      }
    } while (j >= paramList.size());
    return true;
  }
  
  public final boolean Pb(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    Iterator localIterator;
    Bankcard localBankcard;
    if (this.pcZ != null)
    {
      localIterator = this.pcZ.iterator();
      while (localIterator.hasNext())
      {
        localBankcard = (Bankcard)localIterator.next();
        if ((paramString.equals(localBankcard.field_bankcardType)) && (localBankcard.bOr())) {
          return false;
        }
      }
    }
    if (this.pda != null)
    {
      localIterator = this.pda.iterator();
      while (localIterator.hasNext())
      {
        localBankcard = (Bankcard)localIterator.next();
        if ((paramString.equals(localBankcard.field_bankcardType)) && (localBankcard.field_bankcardState == 0)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public final Bankcard a(ArrayList<Bankcard> paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramArrayList, paramString, paramBoolean1, paramBoolean2, false);
  }
  
  public final Bankcard a(ArrayList<Bankcard> paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject = paramArrayList;
    if (paramArrayList == null) {
      localObject = this.pcZ;
    }
    paramArrayList = paramString;
    if (bi.oW(paramString))
    {
      g.Ek();
      paramArrayList = (String)g.Ei().DT().get(196612, null);
    }
    if ((paramBoolean1) && (this.paw != null))
    {
      if (bPt())
      {
        paramString = this.paw;
        return paramString;
      }
      if ((paramArrayList != null) && (paramArrayList.equals(this.paw.field_bindSerial))) {
        return this.paw;
      }
      if ((this.prG != null) && (this.prA != null) && (this.prA.field_lqt_state == 1) && (paramArrayList != null) && (paramArrayList.equals(this.prG.field_bindSerial))) {
        return this.prG;
      }
      if ((!bPp()) && ((localObject == null) || (((ArrayList)localObject).size() == 0))) {
        return this.paw;
      }
    }
    if ((localObject == null) || (((ArrayList)localObject).size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
      return null;
    }
    if ((((ArrayList)localObject).size() == 1) && (paramBoolean2))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletUserInfoManger", "only one bankcard!");
      return (Bankcard)((ArrayList)localObject).get(0);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "have multiple bankcards!");
    if (!bi.oW(paramArrayList))
    {
      Iterator localIterator = ((ArrayList)localObject).iterator();
      Bankcard localBankcard;
      do
      {
        while (!paramString.hasNext())
        {
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            localBankcard = (Bankcard)localIterator.next();
          } while ((localBankcard == null) || (!paramArrayList.equals(localBankcard.field_bindSerial)));
          paramString = localBankcard;
          if (!paramBoolean3) {
            break;
          }
          paramString = localBankcard;
          if (!localBankcard.bOw()) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "default card is honeypay");
          if ((paramBoolean1) && (this.paw != null)) {
            return this.paw;
          }
          paramString = ((ArrayList)localObject).iterator();
        }
        localBankcard = (Bankcard)paramString.next();
      } while (localBankcard.bOw());
      return localBankcard;
    }
    if (paramBoolean2) {
      return (Bankcard)((ArrayList)localObject).get(0);
    }
    return null;
  }
  
  public final void a(af paramaf, ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2, Bankcard paramBankcard1, Bankcard paramBankcard2, k paramk, b paramb, Bankcard paramBankcard3, int paramInt1, int paramInt2, List<c> paramList)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "setBankcards scene %d", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 == 8) {
      this.pry = paramArrayList1;
    }
    if ((paramInt2 == 24) || (paramInt2 == 25)) {
      this.prz = paramArrayList1;
    }
    this.prF = paramList;
    this.prA = paramaf;
    this.pcZ = paramArrayList1;
    this.pda = paramArrayList2;
    this.paw = paramBankcard1;
    this.prC = new ae(paramaf.field_switchConfig);
    this.prB = paramBankcard2;
    this.prD = paramk;
    this.prE = paramb;
    this.prG = paramBankcard3;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "setBankcards()! " + paramaf.field_switchConfig);
    bPI();
    int i = paramInt1;
    if (paramInt1 < 0) {
      i = 600;
    }
    this.prH = (bi.VE() + i);
    this.prI = (bi.VE() + 600L);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "hy: cache time: %d, dead time: %d, cacheDeadTime: %s", new Object[] { Integer.valueOf(i), Long.valueOf(this.prH), Long.valueOf(this.prI) });
    o.bOU().diF.fV("WalletBankcard", "delete from WalletBankcard");
    if ((paramInt2 != 24) && (paramInt2 != 25) && (paramArrayList1 != null)) {
      o.bOU().cG(paramArrayList1);
    }
    if (paramArrayList2 != null) {
      o.bOU().cG(paramArrayList2);
    }
    if (paramBankcard1 != null) {
      o.bOU().e(paramBankcard1);
    }
    if (paramBankcard2 != null) {
      o.bOU().e(paramBankcard2);
    }
    if (paramBankcard3 != null) {
      o.bOU().e(paramBankcard3);
    }
    o.bOS().diF.fV("WalletUserInfo", "delete from WalletUserInfo");
    o.bOS().a(paramaf);
    o.bOY().diF.fV("LoanEntryInfo", "delete from LoanEntryInfo");
    if (paramk != null) {
      o.bOY().b(paramk);
    }
  }
  
  public final String aCl()
  {
    if (this.prA != null) {
      return this.prA.field_true_name;
    }
    return null;
  }
  
  public final void aMk()
  {
    if (this.prA != null)
    {
      this.prA.field_is_reg = -1;
      this.prA = null;
    }
    if (this.prC != null) {
      this.prC = null;
    }
    if (this.paw != null) {
      this.paw = null;
    }
    if (this.pcZ != null)
    {
      this.pcZ.clear();
      this.pcZ = null;
    }
    if (this.pda != null)
    {
      this.pda.clear();
      this.pda = null;
    }
    this.prI = 0L;
    com.tencent.mm.wallet_core.ui.e.a(new e.c[] { new e.c("wallet_balance_version", Integer.valueOf(-1)), new e.c("wallet_balance_last_update_time", Integer.valueOf(-1)), new e.c("wallet_balance", Integer.valueOf(-1)) });
    this.prH = bi.VE();
  }
  
  public final String bPA()
  {
    if (this.prA != null) {
      return this.prA.field_lct_url;
    }
    return null;
  }
  
  public final void bPB()
  {
    Object localObject3 = null;
    Object localObject2 = null;
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.WalletUserInfoManger", "Account Not Ready!");
      return;
    }
    this.prA = o.bOS().bPU();
    if (this.prA != null) {}
    Object localObject1;
    Object localObject4;
    for (this.prC = new ae(this.prA.field_switchConfig);; this.prC = new ae())
    {
      localObject1 = o.bOU();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.plL + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.d.c)localObject1).diF.b((String)localObject4, null, 2);
      if (localObject4 != null) {
        break;
      }
      localObject1 = null;
      this.paw = ((Bankcard)localObject1);
      localObject1 = o.bOU();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.plO + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.d.c)localObject1).diF.b((String)localObject4, null, 2);
      if (localObject4 != null) {
        break label356;
      }
      localObject1 = null;
      this.prG = ((Bankcard)localObject1);
      com.tencent.mm.wallet_core.ui.e.a("wallet_balance", new ag.1(this));
      this.pcZ = o.bOU().bPD();
      this.pda = o.bOU().bPS();
      localObject1 = o.bOU();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.plM + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.d.c)localObject1).diF.b((String)localObject4, null, 2);
      if (localObject4 != null) {
        break label390;
      }
      localObject1 = null;
      this.prB = ((Bankcard)localObject1);
      localObject4 = o.bOY().diF.b("select * from LoanEntryInfo", null, 2);
      if (localObject4 != null) {
        break label424;
      }
      localObject1 = localObject2;
      label290:
      this.prD = ((k)localObject1);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletUserInfoManger", "loadDbData!");
      bPI();
      return;
    }
    if (((Cursor)localObject4).moveToFirst())
    {
      localObject1 = new Bankcard();
      ((Bankcard)localObject1).d((Cursor)localObject4);
    }
    for (;;)
    {
      ((Cursor)localObject4).close();
      break;
      label356:
      if (((Cursor)localObject4).moveToFirst())
      {
        localObject1 = new Bankcard();
        ((Bankcard)localObject1).d((Cursor)localObject4);
      }
      for (;;)
      {
        ((Cursor)localObject4).close();
        break;
        label390:
        if (((Cursor)localObject4).moveToNext())
        {
          localObject1 = new Bankcard();
          ((Bankcard)localObject1).d((Cursor)localObject4);
        }
        for (;;)
        {
          ((Cursor)localObject4).close();
          break;
          label424:
          localObject1 = localObject3;
          if (((Cursor)localObject4).moveToFirst())
          {
            localObject1 = new k();
            ((k)localObject1).d((Cursor)localObject4);
          }
          ((Cursor)localObject4).close();
          break label290;
          localObject1 = null;
        }
        localObject1 = null;
      }
      localObject1 = null;
    }
  }
  
  public final boolean bPC()
  {
    if (com.tencent.mm.platformtools.af.eyi) {
      return true;
    }
    g.Ek();
    int i = ((Integer)g.Ei().DT().get(aa.a.sYw, Integer.valueOf(-1))).intValue();
    if (i != -1) {
      return i == 1;
    }
    if (this.prA != null) {
      return this.prA.field_lqt_state == 1;
    }
    return false;
  }
  
  public final ArrayList<Bankcard> bPD()
  {
    if ((this.pcZ == null) || (this.pcZ.size() <= 0)) {
      this.pcZ = o.bOU().bPD();
    }
    if ((this.pcZ == null) || (this.pcZ.size() <= 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.pcZ.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((Bankcard)localIterator.next());
    }
    return localArrayList;
  }
  
  public final List<c> bPE()
  {
    if (this.prF != null) {
      this.prF.size();
    }
    if ((this.prF == null) || (this.prF.size() <= 0)) {
      return null;
    }
    return this.prF;
  }
  
  public final ArrayList<Bankcard> bPF()
  {
    if ((this.pcZ == null) || (this.pcZ.size() <= 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.pcZ.iterator();
    while (localIterator.hasNext())
    {
      Bankcard localBankcard = (Bankcard)localIterator.next();
      if ((!localBankcard.bOu()) && (!localBankcard.bOw())) {
        localArrayList.add(localBankcard);
      }
    }
    return localArrayList;
  }
  
  public final ArrayList<Bankcard> bPG()
  {
    ArrayList localArrayList = new ArrayList();
    if ((this.paw != null) && (!bPp())) {
      localArrayList.add(this.paw);
    }
    if ((this.prz != null) && (this.pcZ != null) && (this.prz.size() > 0))
    {
      Iterator localIterator = this.prz.iterator();
      while (localIterator.hasNext())
      {
        Bankcard localBankcard = (Bankcard)localIterator.next();
        if (!localBankcard.bOw()) {
          localArrayList.add(localBankcard);
        }
      }
    }
    return localArrayList;
  }
  
  public final String bPH()
  {
    if ((this.pcZ == null) || (this.pcZ.size() <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
    }
    Iterator localIterator;
    do
    {
      return null;
      localIterator = this.pcZ.iterator();
    } while (!localIterator.hasNext());
    return ((Bankcard)localIterator.next()).field_bindSerial;
  }
  
  public final boolean bPp()
  {
    return (this.prA != null) && (this.prA.bPp());
  }
  
  public final boolean bPr()
  {
    return (this.prA == null) || ((this.prA != null) && (this.prA.bPq()));
  }
  
  public final boolean bPs()
  {
    if (this.prA != null)
    {
      if (this.prA.field_is_reg == 1) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean bPt()
  {
    if (this.prA != null)
    {
      if (this.prA.field_is_reg == 2) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean bPu()
  {
    if (this.prA != null)
    {
      if (this.prA.field_is_open_touch == 1) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final String bPv()
  {
    if (this.prA != null) {
      return this.prA.field_ftf_pay_url;
    }
    return null;
  }
  
  public final ae bPw()
  {
    if (this.prC == null) {
      return new ae();
    }
    return this.prC;
  }
  
  public final boolean bPx()
  {
    return (this.prA != null) && (this.prA.field_isDomesticUser);
  }
  
  public final int bPy()
  {
    if (this.prA != null) {
      return this.prA.field_cre_type;
    }
    return 1;
  }
  
  public final String bPz()
  {
    g.Ek();
    String str = (String)g.Ei().DT().get(aa.a.sYx, null);
    if (!bi.oW(str)) {
      return str;
    }
    if (this.prA != null) {
      return this.prA.field_lct_wording;
    }
    return null;
  }
  
  public final void f(ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2)
  {
    if ((this.pcZ == null) || (paramArrayList1 == null) || (paramArrayList2 == null)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletUserInfoManger", "error list, bankcards == null || bankcardsClone == null || virtualBankcardsClone == null");
    }
    for (;;)
    {
      return;
      paramArrayList1.clear();
      paramArrayList2.clear();
      Iterator localIterator;
      if (this.pcZ != null)
      {
        localIterator = this.pcZ.iterator();
        while (localIterator.hasNext()) {
          paramArrayList1.add((Bankcard)localIterator.next());
        }
      }
      if (this.pda != null)
      {
        localIterator = this.pda.iterator();
        while (localIterator.hasNext())
        {
          Bankcard localBankcard = (Bankcard)localIterator.next();
          if (localBankcard.field_wxcreditState == 0) {
            paramArrayList2.add(localBankcard);
          } else {
            paramArrayList1.add(localBankcard);
          }
        }
      }
    }
  }
  
  public final ArrayList<Bankcard> jl(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      if ((this.paw != null) && (!bPp())) {
        localArrayList.add(this.paw);
      }
      if ((this.prG != null) && (!bPp())) {
        localArrayList.add(this.prG);
      }
    }
    if ((this.pcZ != null) && (this.pcZ.size() > 0))
    {
      Iterator localIterator = this.pcZ.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add((Bankcard)localIterator.next());
      }
    }
    return localArrayList;
  }
  
  public final ArrayList<Bankcard> jt(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      if ((this.paw != null) && (!bPp())) {
        localArrayList.add(this.paw);
      }
      if ((this.prG != null) && (!bPp())) {
        localArrayList.add(this.prG);
      }
    }
    Iterator localIterator;
    if ((this.pry != null) && (this.pcZ != null) && (this.pry.size() == this.pcZ.size()) && (this.pry.size() > 0)) {
      localIterator = this.pry.iterator();
    }
    while (localIterator.hasNext())
    {
      localArrayList.add((Bankcard)localIterator.next());
      continue;
      if ((this.pcZ != null) && (this.pcZ.size() > 0))
      {
        localIterator = this.pcZ.iterator();
        while (localIterator.hasNext()) {
          localArrayList.add((Bankcard)localIterator.next());
        }
      }
    }
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
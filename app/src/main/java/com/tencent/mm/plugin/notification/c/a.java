package com.tencent.mm.plugin.notification.c;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.v4.app.z.d;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.plugin.notification.d.b.a;
import com.tencent.mm.plugin.notification.d.f;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class a<T>
  implements c
{
  private al lHA = null;
  private com.tencent.mm.sdk.b.c lHB = new a.1(this);
  public b lHt = null;
  protected FailSendMsgNotification lHu = null;
  protected boolean lHv = false;
  protected ArrayList<Long> lHw = null;
  protected ArrayList<Long> lHx = null;
  protected ArrayList<Long> lHy = null;
  private ArrayList<al> lHz = new ArrayList();
  public Context mContext = null;
  
  public a()
  {
    this.lHu.lIn = new a.2(this);
    this.lHu.lIo = new a.3(this);
    this.lHu.lIp = new a.4(this);
    bka();
  }
  
  private void aXL()
  {
    this.lHt.clear();
    this.lHv = false;
    this.lHw.clear();
    this.lHx.clear();
    bkh();
  }
  
  private void bka()
  {
    this.lHA = new al(Looper.getMainLooper(), new a.5(this), true);
  }
  
  private void bkb()
  {
    x.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, isInForeground:%b", new Object[] { Boolean.valueOf(f.bkz()) });
    this.lHu.lIr = ue(this.lHt.lHE.size());
    this.lHu.bkE();
    if ((!f.bkz()) && (!this.lHu.lIw))
    {
      this.lHu.lIq = ue(this.lHt.lHE.size());
      this.lHu.bkD();
      this.lHu.bkC();
      x.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, first show notification");
      this.lHu.show();
      com.tencent.mm.sdk.b.a.sFg.c(this.lHB);
      com.tencent.mm.sdk.b.a.sFg.b(this.lHB);
      return;
    }
    if (this.lHu.lIw)
    {
      this.lHu.bkD();
      this.lHu.bkC();
      x.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, update notification content text");
      this.lHu.IU(ue(this.lHt.lHE.size()));
      com.tencent.mm.sdk.b.a.sFg.c(this.lHB);
      com.tencent.mm.sdk.b.a.sFg.b(this.lHB);
      return;
    }
    x.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, not show or update notification, isForeground:%b", new Object[] { Boolean.valueOf(f.bkz()) });
  }
  
  private void bkc()
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.lHu.lIr = ue(this.lHt.lHE.size());
      if (this.lHx.size() <= 0) {
        this.lHu.IU(dc(this.lHt.lHE.size(), this.lHw.size() + this.lHx.size()));
      }
    }
    else
    {
      return;
    }
    this.lHu.IU(T(this.lHt.lHE.size(), this.lHw.size() + this.lHx.size(), this.lHx.size()));
  }
  
  private void bkd()
  {
    this.lHv = false;
    x.d("MicroMsg.AbstractSendMsgFailNotification", "finish resend, msgList.size:%d, mFailList.size:%d, mSuccessList.size:%d", new Object[] { Integer.valueOf(this.lHt.lHE.size()), Integer.valueOf(this.lHx.size()), Integer.valueOf(this.lHw.size()) });
    x.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, before check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", new Object[] { Integer.valueOf(this.lHt.lHE.size()), Integer.valueOf(this.lHw.size()), Integer.valueOf(this.lHx.size()) });
    bkg();
    Object localObject1 = new ArrayList();
    Object localObject2 = this.lHw.iterator();
    Long localLong;
    while (((Iterator)localObject2).hasNext())
    {
      localLong = (Long)((Iterator)localObject2).next();
      if (!ei(localLong.longValue())) {
        ((ArrayList)localObject1).add(localLong);
      }
    }
    localObject2 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localLong = (Long)((Iterator)localObject2).next();
      this.lHw.remove(localLong);
    }
    ((ArrayList)localObject1).clear();
    localObject2 = this.lHx.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localLong = (Long)((Iterator)localObject2).next();
      if (!ei(localLong.longValue())) {
        ((ArrayList)localObject1).add(localLong);
      }
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Long)((Iterator)localObject1).next();
      this.lHx.remove(localObject2);
    }
    x.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, after check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", new Object[] { Integer.valueOf(this.lHt.lHE.size()), Integer.valueOf(this.lHw.size()), Integer.valueOf(this.lHx.size()) });
    if ((this.lHx.size() <= 0) || (Build.VERSION.SDK_INT < 16)) {
      com.tencent.mm.plugin.notification.d.b.ug(getType());
    }
    h.mEJ.h(11425, new Object[] { Integer.valueOf(getType()), Integer.valueOf(0), Integer.valueOf(this.lHw.size()), Integer.valueOf(this.lHx.size()) });
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.lHu.bkD();
      this.lHu.lIr = ue(this.lHt.lHE.size());
      localObject1 = this.lHu;
      this.lHt.lHE.size();
      ((FailSendMsgNotification)localObject1).IU(dd(this.lHw.size(), this.lHx.size()));
      this.lHu.bkC();
      if (this.lHx.size() > 0)
      {
        this.lHu.bkE();
        this.lHu.show();
        bkl();
        bkn();
      }
    }
    localObject1 = new kf();
    ((kf)localObject1).bUC.type = getType();
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    if (this.lHA != null) {
      this.lHA.SO();
    }
    for (;;)
    {
      bkh();
      com.tencent.mm.sdk.b.a.sFg.c(this.lHB);
      bke();
      return;
      x.e("MicroMsg.AbstractSendMsgFailNotification", "stopCheckMsgExistTimer error, timer is null");
    }
  }
  
  private void bkh()
  {
    Iterator localIterator = this.lHz.iterator();
    while (localIterator.hasNext()) {
      ((al)localIterator.next()).SO();
    }
    this.lHz.clear();
    this.lHy.clear();
  }
  
  private String bkj()
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    int i = 0;
    while (i < this.lHt.lHE.size())
    {
      long l = this.lHt.get(i);
      localStringBuilder.append(l + ", ");
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  private void bkl()
  {
    this.lHt.currentIndex = 0;
    if (this.lHw.size() > 0)
    {
      Iterator localIterator = this.lHw.iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        this.lHt.remove(localLong.longValue());
      }
    }
    this.lHw.clear();
    this.lHx.clear();
  }
  
  private void bkn()
  {
    b.a locala = new b.a(this.lHt, this.lHt.currentIndex, this.lHw, this.lHx);
    com.tencent.mm.plugin.notification.d.b.a(getType(), locala);
  }
  
  public abstract void I(ArrayList<Long> paramArrayList);
  
  public abstract String T(int paramInt1, int paramInt2, int paramInt3);
  
  public final void bJ(T paramT)
  {
    if (paramT == null) {
      return;
    }
    x.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, msgId:%d, msgList:%s, isResending:%b", new Object[] { Long.valueOf(bL(paramT)), bkj(), Boolean.valueOf(this.lHv) });
    if (!this.lHv)
    {
      if (!this.lHy.contains(Long.valueOf(bL(paramT))))
      {
        if (paramT == null)
        {
          x.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgObj is null");
          return;
        }
        paramT = bM(paramT);
        if ((paramT == null) || (paramT.size() <= 0))
        {
          x.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, cannot get history fail msg");
          return;
        }
        aXL();
        b localb = this.lHt;
        if ((paramT != null) && (paramT.size() > 0)) {
          localb.lHE.addAll(paramT);
        }
        bkn();
        x.d("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgList.size:%d, msgList:%s", new Object[] { Integer.valueOf(this.lHt.lHE.size()), bkj() });
        h.mEJ.h(11426, new Object[] { Integer.valueOf(getType()) });
        ah.i(new a.6(this), 1000L);
        return;
      }
      this.lHy.remove(Long.valueOf(bL(paramT)));
      return;
    }
    if ((this.lHt.ek(bL(paramT))) && (!this.lHx.contains(Long.valueOf(bL(paramT))))) {
      this.lHx.add(Long.valueOf(bL(paramT)));
    }
    if (!this.lHt.ek(bL(paramT)))
    {
      x.d("MicroMsg.AbstractSendMsgFailNotification", "sending msg, another fail msg");
      this.lHt.ej(bL(paramT));
    }
    bkc();
    x.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, successlist.size:%d, faillist.size:%d", new Object[] { Integer.valueOf(this.lHw.size()), Integer.valueOf(this.lHx.size()) });
    if (this.lHw.size() + this.lHx.size() < this.lHt.lHE.size())
    {
      long l = this.lHt.bks();
      if (l == -1L)
      {
        x.e("TAG", "resend error, next msg id is -1");
        return;
      }
      x.d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", new Object[] { Long.valueOf(l) });
      bkn();
      eg(l);
      return;
    }
    bkd();
  }
  
  public final void bK(T paramT)
  {
    x.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSucess, msgId:%d, msgList:%s", new Object[] { Long.valueOf(bL(paramT)), bkj() });
    long l;
    if (this.lHt.ek(bL(paramT)))
    {
      l = bL(paramT);
      if ((this.lHy.contains(Long.valueOf(l))) && (this.lHx.contains(Long.valueOf(l))))
      {
        x.i("MicroMsg.AbstractSendMsgFailNotification", "receive send msg success event from a timout message, remvoe it from the fail list");
        this.lHy.remove(Long.valueOf(l));
        this.lHx.remove(Long.valueOf(l));
      }
      if (!this.lHv) {
        break label260;
      }
      this.lHw.add(Long.valueOf(l));
      bkc();
      x.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSuccess, successlist.size:%d, faillist.size:%d", new Object[] { Integer.valueOf(this.lHw.size()), Integer.valueOf(this.lHx.size()) });
      if (this.lHw.size() + this.lHx.size() >= this.lHt.lHE.size()) {
        break label255;
      }
      l = this.lHt.bks();
      if (l == -1L) {
        x.e("TAG", "resend error, next msg id is -1");
      }
    }
    else
    {
      return;
    }
    x.d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", new Object[] { Long.valueOf(l) });
    bkn();
    eg(l);
    return;
    label255:
    bkd();
    return;
    label260:
    this.lHt.remove(bL(paramT));
    if (this.lHt.lHE.size() == 0)
    {
      this.lHu.dismiss();
      aXL();
      com.tencent.mm.plugin.notification.d.b.ug(getType());
      return;
    }
    x.d("MicroMsg.AbstractSendMsgFailNotification", "maybe the user manually resend the message, update init wording");
    this.lHu.IU(ue(this.lHt.lHE.size()));
  }
  
  public abstract long bL(T paramT);
  
  public abstract ArrayList<Long> bM(T paramT);
  
  public void bke() {}
  
  public final void bkf()
  {
    x.d("MicroMsg.AbstractSendMsgFailNotification", "resendAllMsg, mMsgList.size:%d", new Object[] { Integer.valueOf(this.lHt.lHE.size()) });
    this.lHv = true;
    if (Build.VERSION.SDK_INT >= 16)
    {
      FailSendMsgNotification localFailSendMsgNotification = this.lHu;
      localFailSendMsgNotification.lIy = false;
      localFailSendMsgNotification.lIk = new z.d(localFailSendMsgNotification.mContext);
      localFailSendMsgNotification.bkB();
      localFailSendMsgNotification.show();
      x.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, removeActionButton");
      localFailSendMsgNotification = this.lHu;
      localFailSendMsgNotification.lIk.j(2, true);
      localFailSendMsgNotification.lIx = true;
      localFailSendMsgNotification.show();
      x.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, setLockInNotificationBar");
      this.lHu.IU(dc(this.lHt.lHE.size(), 0));
    }
    this.lHt.currentIndex = 0;
    bkh();
    com.tencent.mm.sdk.b.a.sFg.c(this.lHB);
    com.tencent.mm.sdk.b.a.sFg.b(this.lHB);
    eg(this.lHt.bks());
    if (this.lHA != null)
    {
      this.lHA.J(300000L, 300000L);
      return;
    }
    x.e("MicroMsg.AbstractSendMsgFailNotification", "startCheckMsgExistTimer error, timer is null");
  }
  
  final void bkg()
  {
    Object localObject = new ArrayList();
    int i = 0;
    while (i < this.lHt.lHE.size())
    {
      long l = this.lHt.get(i);
      if (!ei(l)) {
        ((ArrayList)localObject).add(Long.valueOf(l));
      }
      i += 1;
    }
    if (((ArrayList)localObject).size() > 0)
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Long localLong = (Long)((Iterator)localObject).next();
        this.lHt.remove(localLong.longValue());
      }
    }
  }
  
  public final void bki()
  {
    x.d("MicroMsg.AbstractSendMsgFailNotification", "omitFailMsg, size:%d", new Object[] { Integer.valueOf(this.lHt.lHE.size()) });
    if (this.lHt.lHE.size() > 0)
    {
      Object localObject = this.lHt;
      ArrayList localArrayList = new ArrayList();
      localObject = ((b)localObject).lHE.iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(Long.valueOf(((Long)((Iterator)localObject).next()).longValue()));
      }
      I(localArrayList);
    }
  }
  
  public final FailSendMsgNotification bkk()
  {
    return this.lHu;
  }
  
  protected final void bkm()
  {
    b.a locala;
    if ((this.lHt == null) || (this.lHt.lHE.size() == 0))
    {
      x.d("MicroMsg.AbstractSendMsgFailNotification", "autoResumeFromCrash");
      locala = com.tencent.mm.plugin.notification.d.b.uf(getType());
      if (locala == null) {
        x.e("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, cacheObj is null");
      }
    }
    else
    {
      return;
    }
    if (this.lHA == null) {
      bka();
    }
    b localb = locala.lHG;
    ArrayList localArrayList1 = locala.lHI;
    ArrayList localArrayList2 = locala.lHJ;
    int i = locala.lHH;
    if ((localArrayList1.size() == 0) && (localArrayList2.size() == 0) && (i == 0))
    {
      x.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, not start resend");
      this.lHt.clear();
      this.lHt = localb;
      this.lHw.clear();
      this.lHx.clear();
      bkb();
      return;
    }
    if (localArrayList1.size() + localArrayList2.size() >= localb.lHE.size())
    {
      x.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, resendFinish");
      bkd();
      return;
    }
    x.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, currently resending");
    this.lHt.clear();
    this.lHt = localb;
    this.lHt.currentIndex = i;
    this.lHw.clear();
    this.lHw.addAll(localArrayList1);
    this.lHx.clear();
    this.lHx.addAll(localArrayList2);
    bkc();
  }
  
  public abstract void bko();
  
  public abstract String dc(int paramInt1, int paramInt2);
  
  public abstract String dd(int paramInt1, int paramInt2);
  
  final void eg(long paramLong)
  {
    ah.i(new a.7(this, paramLong), 200L);
  }
  
  public abstract void eh(long paramLong);
  
  public abstract boolean ei(long paramLong);
  
  public abstract int getType();
  
  public abstract String ue(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/notification/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
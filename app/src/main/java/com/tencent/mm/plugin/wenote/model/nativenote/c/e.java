package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collections;

public final class e
  implements a.a
{
  public static boolean mHasInit = false;
  public static volatile e qsb = null;
  public ag mHandler = null;
  public int mScreenHeight = 0;
  public int mScreenWidth = 0;
  public TextView qsA = null;
  public TextView qsB = null;
  public TextView qsC = null;
  public TextView qsD = null;
  public TextView qsE = null;
  public TextView qsF = null;
  public TextView qsG = null;
  public TextView qsH = null;
  public boolean qsc = true;
  public int qsd = 0;
  public int qse = 0;
  public int qsf = 14;
  public int qsg = 0;
  public int qsh = 0;
  public int qsi = 0;
  public int qsj = 0;
  public int qsk = 0;
  public int qsl = 0;
  public int qsm = 0;
  public int[] qsn = null;
  public int[] qso = null;
  public int[] qsp = null;
  public int[] qsq = null;
  public PopupWindow qsr = null;
  public PopupWindow qss = null;
  public PopupWindow qst = null;
  public PopupWindow qsu = null;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.a qsv = null;
  public d qsw = null;
  public b qsx = null;
  public al qsy = null;
  public al qsz = null;
  
  private e()
  {
    mHasInit = false;
  }
  
  private boolean By(int paramInt)
  {
    boolean bool = true;
    if ((this.qsx != null) && (this.qsx.hER == paramInt) && (this.qsx.getType() == 1)) {
      return false;
    }
    if ((paramInt == 2) && (this.qsr != null))
    {
      this.qsr.dismiss();
      ac(2, -1, -1);
    }
    for (;;)
    {
      return bool;
      if ((paramInt == 3) && (this.qss != null))
      {
        this.qss.dismiss();
        ac(3, -1, -1);
      }
      else if ((paramInt == 4) && (this.qst != null))
      {
        this.qst.dismiss();
        ac(4, -1, -1);
      }
      else
      {
        bool = false;
      }
    }
  }
  
  private int D(RecyclerView paramRecyclerView)
  {
    int j = 150;
    int i = j;
    if (paramRecyclerView != null)
    {
      paramRecyclerView.getLocationOnScreen(this.qsn);
      i = j;
      if (p(this.qsn)) {
        i = this.qsn[1];
      }
    }
    return i;
  }
  
  private static SpannableStringBuilder a(h paramh, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    if (paramh == null)
    {
      x.e("NoteSelectManager", "processTextDataItem: textDataItem is null");
      return null;
    }
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.a.a.Sk(paramh.content);
    if (localObject == null)
    {
      x.e("NoteSelectManager", "processTextDataItem: spannedText is null");
      return null;
    }
    if (paramBoolean1) {
      paramInt2 = ((Spanned)localObject).length();
    }
    for (;;)
    {
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      if ((paramInt1 < 0) || (paramInt1 > ((Spanned)localObject).length()) || (paramInt2 < 0) || (paramInt2 > ((Spanned)localObject).length()) || (paramInt1 > paramInt2))
      {
        x.e("NoteSelectManager", "processTextDataItem: incorrect offset");
        return null;
      }
      paramString = (SpannableStringBuilder)((Spanned)localObject).subSequence(0, paramInt1);
      SpannableStringBuilder localSpannableStringBuilder = (SpannableStringBuilder)((Spanned)localObject).subSequence(paramInt1, paramInt2);
      localObject = (SpannableStringBuilder)((Spanned)localObject).subSequence(paramInt2, ((Spanned)localObject).length());
      paramInt1 = paramInt2;
      if (paramBoolean2)
      {
        paramInt2 = paramString.length();
        paramInt1 = paramInt2;
        if (!bi.oW(str))
        {
          Spanned localSpanned = com.tencent.mm.plugin.wenote.model.nativenote.a.a.Sk(str);
          paramInt1 = paramInt2;
          if (localSpanned != null) {
            paramInt1 = paramInt2 + localSpanned.length();
          }
        }
        paramh.content = (com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(paramString) + str + com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject));
      }
      if (paramBoolean3)
      {
        paramh.qoH = true;
        paramh.qoJ = paramInt1;
        return localSpannableStringBuilder;
      }
      paramh.qoH = false;
      paramh.qoJ = -1;
      return localSpannableStringBuilder;
    }
  }
  
  private SpannableStringBuilder a(boolean paramBoolean, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, String paramString)
  {
    SpannableStringBuilder localSpannableStringBuilder = null;
    int i = 2;
    d locald = car();
    cat();
    int j = locald.cao();
    if ((j != 1) && (j != 2))
    {
      x.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
      paramArrayList = localSpannableStringBuilder;
    }
    do
    {
      return paramArrayList;
      localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(locald.dHJ);
      if (localObject == null)
      {
        x.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
        return null;
      }
      localSpannableStringBuilder = new SpannableStringBuilder();
      if (((com.tencent.mm.plugin.wenote.model.a.b)localObject).getType() == 1)
      {
        if ((paramBoolean) && (paramArrayList != null) && (paramArrayList.size() > 0))
        {
          paramString = a((h)localObject, locald.startOffset, locald.qsa, false, false, "", true);
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().a(paramArrayList, 0, locald.dHJ, locald.startOffset, locald.qsa);
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().er(locald.dHJ, locald.dHJ + paramArrayList.size() + 1);
          paramArrayList = paramString;
        }
        for (;;)
        {
          return paramArrayList;
          paramString = a((h)localObject, locald.startOffset, locald.qsa, false, paramBoolean, paramString, true);
          if (this.qsv != null) {
            this.qsv.Bo(locald.dHJ);
          }
          paramArrayList = paramString;
          if (paramBoolean)
          {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().bZM();
            paramArrayList = paramString;
          }
        }
      }
      if ((j != 1) || (!paramBoolean)) {
        break;
      }
      if (locald.startOffset == 0) {
        i = 1;
      }
      if ((paramArrayList != null) && (paramArrayList.size() > 0)) {
        break label395;
      }
      paramArrayList = localSpannableStringBuilder;
    } while (bi.oW(paramString));
    paramArrayList = new ArrayList();
    Object localObject = new h();
    ((h)localObject).content = paramString;
    ((h)localObject).qoH = false;
    ((h)localObject).qoJ = -1;
    paramArrayList.add(localObject);
    label395:
    for (;;)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().a(paramArrayList, i, locald.dHJ, locald.startOffset, locald.qsa);
      paramString = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD();
      i = locald.dHJ;
      j = locald.dHJ;
      paramString.er(i - 1, paramArrayList.size() + j + 1);
      paramArrayList = localSpannableStringBuilder;
      break;
    }
  }
  
  private void a(int paramInt1, RecyclerView paramRecyclerView, View paramView, int paramInt2)
  {
    if ((!mHasInit) || (paramRecyclerView == null)) {
      return;
    }
    paramView = f.dd(paramView);
    if (paramView == null)
    {
      By(paramInt1);
      return;
    }
    if (paramView.qrX != null) {
      paramView = paramView.qrX;
    }
    for (;;)
    {
      if (paramView == null)
      {
        By(paramInt1);
        return;
        if ((paramView.qrY != null) && (paramView.qrZ != null))
        {
          if (paramInt2 == 0)
          {
            paramView = paramView.qrY;
            paramInt2 = 0;
            continue;
          }
          if (paramInt2 == 1)
          {
            paramView = paramView.qrZ;
            paramInt2 = 0;
          }
        }
      }
      else
      {
        Object localObject = paramView.getText();
        if ((localObject == null) || (paramInt2 < 0) || (paramInt2 > ((Editable)localObject).length()))
        {
          By(paramInt1);
          return;
        }
        localObject = paramView.getLayout();
        if (localObject == null)
        {
          By(paramInt1);
          return;
        }
        float f4 = ((Layout)localObject).getPrimaryHorizontal(paramInt2) + paramView.getPaddingLeft();
        int i = paramView.getPaddingTop();
        float f3 = ((Layout)localObject).getLineTop(((Layout)localObject).getLineForOffset(paramInt2)) + i;
        float f1 = f4;
        float f2 = f3;
        label239:
        boolean bool;
        if (paramView.getEditTextType() != 0)
        {
          f3 = f3 + paramView.getHeight() - this.qsd;
          if (paramInt1 == 3)
          {
            f1 = f4 + this.qsm;
            f2 = f3;
          }
        }
        else
        {
          localObject = new int[2];
          paramView.getLocationOnScreen((int[])localObject);
          switch (paramInt1)
          {
          default: 
            bool = false;
          }
        }
        while (!bool)
        {
          By(paramInt1);
          return;
          f1 = f4;
          f2 = f3;
          if (paramInt1 != 4) {
            break label239;
          }
          f1 = f4 - this.qsm;
          f2 = f3;
          break label239;
          bool = a(2, paramRecyclerView, this.qsr, (int)(f1 + localObject[0] - this.qsl), (int)(localObject[1] + f2));
          continue;
          bool = a(3, paramRecyclerView, this.qss, (int)(f1 + localObject[0] - this.qss.getWidth()), (int)(localObject[1] + f2));
          continue;
          bool = a(4, paramRecyclerView, this.qst, (int)(f1 + localObject[0]), (int)(localObject[1] + f2));
        }
      }
      paramView = null;
    }
  }
  
  private boolean a(int paramInt1, RecyclerView paramRecyclerView, PopupWindow paramPopupWindow, int paramInt2, int paramInt3)
  {
    if ((!mHasInit) || (paramRecyclerView == null) || (paramPopupWindow == null)) {}
    while ((paramInt3 < D(paramRecyclerView)) || (paramInt3 > this.mScreenHeight - caq())) {
      return false;
    }
    if (paramPopupWindow.isShowing())
    {
      paramPopupWindow.update(paramInt2, paramInt3, -1, -1, false);
      ac(paramInt1, paramInt2, paramInt3);
      if (paramInt1 == 2)
      {
        if (this.qsz != null) {
          break label134;
        }
        this.qsz = new al(new e.7(this), false);
      }
    }
    for (;;)
    {
      this.qsz.J(3000L, 0L);
      return true;
      paramPopupWindow.showAtLocation(paramRecyclerView, 0, paramInt2, paramInt3);
      ac(paramInt1, paramInt2, paramInt3);
      break;
      label134:
      this.qsz.SO();
    }
  }
  
  private void ac(int paramInt1, int paramInt2, int paramInt3)
  {
    if (!mHasInit) {}
    do
    {
      do
      {
        do
        {
          return;
          switch (paramInt1)
          {
          default: 
            return;
          }
        } while ((this.qso == null) || (this.qso.length != 2));
        this.qso[0] = paramInt2;
        this.qso[1] = paramInt3;
        return;
      } while ((this.qsp == null) || (this.qsp.length != 2));
      this.qsp[0] = paramInt2;
      this.qsp[1] = paramInt3;
      return;
    } while ((this.qsq == null) || (this.qsq.length != 2));
    this.qsq[0] = paramInt2;
    this.qsq[1] = paramInt3;
  }
  
  private int ad(int paramInt1, int paramInt2, int paramInt3)
  {
    if (!mHasInit) {
      return 0;
    }
    boolean bool;
    switch (paramInt1)
    {
    default: 
      return 0;
    case 2: 
      bool = w(paramInt2, paramInt3, paramInt2, paramInt3);
    }
    while (bool)
    {
      return 3;
      if ((this.qsw == null) || (paramInt2 > this.qsw.endPos) || ((paramInt2 == this.qsw.endPos) && (paramInt3 >= this.qsw.qsa))) {
        return 1;
      }
      bool = w(paramInt2, paramInt3, this.qsw.endPos, this.qsw.qsa);
      continue;
      if ((this.qsw == null) || (paramInt2 < this.qsw.dHJ) || ((paramInt2 == this.qsw.dHJ) && (paramInt3 <= this.qsw.startOffset))) {
        return 1;
      }
      bool = w(this.qsw.dHJ, this.qsw.startOffset, paramInt2, paramInt3);
    }
    return 2;
  }
  
  private ArrayList<com.tencent.mm.plugin.wenote.model.a.b> b(boolean paramBoolean, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, String paramString)
  {
    d locald = car();
    cat();
    ArrayList localArrayList = new ArrayList();
    if (locald.cao() != 3)
    {
      x.e("NoteSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
      return null;
    }
    int i = locald.dHJ;
    int j = locald.endPos;
    if (j >= locald.dHJ)
    {
      Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(j);
      SpannableStringBuilder localSpannableStringBuilder;
      h localh;
      if (localObject != null) {
        if ((j == locald.endPos) && (((com.tencent.mm.plugin.wenote.model.a.b)localObject).getType() == 1))
        {
          localObject = (h)localObject;
          localSpannableStringBuilder = a((h)localObject, 0, locald.qsa, false, paramBoolean, "", false);
          if (!bi.K(localSpannableStringBuilder))
          {
            localh = new h();
            localh.content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(localSpannableStringBuilder);
            localh.qoJ = -1;
            localh.qoH = false;
            localArrayList.add(localh);
          }
          if ((paramBoolean) && (bi.oW(((h)localObject).content))) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().ab(j, true);
          }
        }
      }
      for (;;)
      {
        j -= 1;
        break;
        if ((j == locald.dHJ) && (((com.tencent.mm.plugin.wenote.model.a.b)localObject).getType() == 1))
        {
          localObject = (h)localObject;
          localSpannableStringBuilder = a((h)localObject, locald.startOffset, 0, true, paramBoolean, "", false);
          if (!bi.K(localSpannableStringBuilder))
          {
            localh = new h();
            localh.content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(localSpannableStringBuilder);
            localh.qoJ = -1;
            localh.qoH = false;
            localArrayList.add(localh);
          }
          if ((paramBoolean) && (bi.oW(((h)localObject).content))) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().ab(j, true);
          } else {
            i += 1;
          }
        }
        else
        {
          localArrayList.add(com.tencent.mm.plugin.wenote.b.c.c((com.tencent.mm.plugin.wenote.model.a.b)localObject));
          if (paramBoolean) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().ab(j, true);
          }
        }
      }
    }
    if (paramBoolean)
    {
      j = i + 1;
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().a(i, paramArrayList);
        j = paramArrayList.size() + i;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().er(i - 1, j);
      }
    }
    else
    {
      Collections.reverse(localArrayList);
      return localArrayList;
    }
    paramArrayList = new h();
    if (paramString != null) {}
    for (;;)
    {
      paramArrayList.content = paramString;
      paramArrayList.qoH = false;
      paramArrayList.qoJ = -1;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().a(i, paramArrayList);
      break;
      paramString = "";
    }
  }
  
  private RecyclerView bAt()
  {
    if (this.qsv != null) {
      return this.qsv.bZw();
    }
    return null;
  }
  
  private int caA()
  {
    int j = 0;
    if (this.qsv != null) {
      j = this.qsv.bZt();
    }
    int i = j;
    if (j == 0)
    {
      i = j;
      if (this.qsv != null) {
        i = this.qsv.bZu();
      }
    }
    j = i;
    if (i == 0) {
      j = 150;
    }
    return this.mScreenHeight - j;
  }
  
  private void caB()
  {
    if (this.qsv != null) {
      this.qsv.bZr();
    }
  }
  
  public static e cap()
  {
    if (qsb == null) {}
    try
    {
      if (qsb == null) {
        qsb = new e();
      }
      return qsb;
    }
    finally {}
  }
  
  private int caq()
  {
    if (this.qsv != null) {
      return this.qsv.bZt() + this.qsv.bZu();
    }
    return 0;
  }
  
  private void cas()
  {
    if (this.qsv != null) {
      this.qsv.bZs();
    }
  }
  
  private void cay()
  {
    if (this.qsx == null)
    {
      this.qsx = new b();
      return;
    }
    this.qsx.reset();
  }
  
  private void caz()
  {
    if (this.qsy == null)
    {
      this.qsy = new al(new e.9(this), true);
      return;
    }
    this.qsy.SO();
  }
  
  private boolean d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((!mHasInit) || (paramRecyclerView == null) || (this.qsu == null)) {}
    while ((paramInt2 < D(paramRecyclerView)) || (paramInt2 > this.mScreenHeight - caq())) {
      return false;
    }
    if (this.qsu.isShowing()) {
      this.qsu.update(paramInt1, paramInt2, -1, -1, false);
    }
    for (;;)
    {
      return true;
      this.qsu.showAtLocation(paramRecyclerView, 0, paramInt1, paramInt2);
    }
  }
  
  public static void f(TextView paramTextView, int paramInt)
  {
    if (paramTextView != null) {
      paramTextView.setTextSize(1, paramInt);
    }
  }
  
  public static boolean isEnabled()
  {
    return mHasInit;
  }
  
  private void kz(boolean paramBoolean)
  {
    if ((!mHasInit) || (this.qsr == null) || (this.qss == null) || (this.qst == null) || (this.qsw == null)) {}
    RecyclerView localRecyclerView;
    int k;
    do
    {
      do
      {
        return;
        localRecyclerView = bAt();
      } while ((localRecyclerView == null) || (this.qsx == null) || (this.qsx.getType() != 1));
      k = this.qsx.hER;
    } while ((k != 2) && (k != 3) && (k != 4));
    float f2 = this.qsx.qrP - this.qsx.fto;
    float f1 = this.qsx.qrQ;
    float f3 = this.qsx.ftp;
    f3 = this.qsd / 2 + (f1 - f3);
    label157:
    View localView;
    Object localObject2;
    Object localObject1;
    int i;
    if (k == 2)
    {
      f1 = f2 + this.qsr.getWidth() / 2;
      localRecyclerView.getLocationOnScreen(this.qsn);
      localView = localRecyclerView.u(f1 - this.qsn[0], f3 - this.qsn[1]);
      localObject2 = f.dd(localView);
      localObject1 = null;
      if (localObject2 != null) {
        break label344;
      }
      i = 2;
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return;
      case 1: 
        label210:
        i = 0;
      }
      for (;;)
      {
        if (i != 0)
        {
          if ((!paramBoolean) || ((this.qsx.qrQ >= D(localRecyclerView)) && (this.qsx.qrQ <= caA())) || ((this.qsy != null) && (!this.qsy.ciq()))) {
            break;
          }
          caz();
          this.qsy.J(100L, 100L);
          return;
          f1 = f2;
          if (k != 3) {
            break label157;
          }
          f1 = f2 + this.qss.getWidth();
          break label157;
          label344:
          if (((c)localObject2).qrX != null)
          {
            localObject1 = ((c)localObject2).qrX;
            localObject2 = new int[2];
            ((WXRTEditText)localObject1).getLocationOnScreen((int[])localObject2);
            i = ((WXRTEditText)localObject1).getOffsetForPosition(f1 - localObject2[0], f3 - localObject2[1]);
            i = ad(k, ((WXRTEditText)localObject1).getPosInDataList(), i);
            break label210;
          }
          if ((((c)localObject2).qrY == null) || (((c)localObject2).qrZ == null)) {
            break label1123;
          }
          if (k == 3)
          {
            localObject2 = ((c)localObject2).qrY;
            j = ad(k, ((WXRTEditText)localObject2).getPosInDataList(), 0);
            if (j != 2)
            {
              i = j;
              localObject1 = localObject2;
              if (j != 3) {
                break label757;
              }
            }
            a(k, localRecyclerView, this.qss, (int)(this.qsx.qrP - this.qsx.fto), (int)(this.qsx.qrQ - this.qsx.ftp));
            i = j;
            localObject1 = localObject2;
            break label210;
          }
          if (k == 4)
          {
            localObject2 = ((c)localObject2).qrZ;
            j = ad(k, ((WXRTEditText)localObject2).getPosInDataList(), 1);
            if (j != 2)
            {
              i = j;
              localObject1 = localObject2;
              if (j != 3) {
                break label757;
              }
            }
            a(k, localRecyclerView, this.qst, (int)(this.qsx.qrP - this.qsx.fto), (int)(this.qsx.qrQ - this.qsx.ftp));
            i = j;
            localObject1 = localObject2;
            break label210;
          }
          localObject1 = new int[2];
          localView.getLocationOnScreen((int[])localObject1);
          if (f1 <= localObject1[0] + localView.getWidth() / 2) {
            localObject2 = ((c)localObject2).qrY;
          }
          for (int j = ad(k, ((WXRTEditText)localObject2).getPosInDataList(), 0);; j = ad(k, ((WXRTEditText)localObject2).getPosInDataList(), 1))
          {
            if (j != 2)
            {
              i = j;
              localObject1 = localObject2;
              if (j != 3) {}
            }
            else
            {
              a(k, localRecyclerView, this.qsr, (int)(this.qsx.qrP - this.qsx.fto), (int)(this.qsx.qrQ - this.qsx.ftp));
              localObject1 = localObject2;
              i = j;
            }
            label757:
            break;
            localObject2 = ((c)localObject2).qrZ;
          }
          i = 1;
          continue;
          localObject2 = ((WXRTEditText)localObject1).getText();
          i = cao();
          if ((this.qsc) && (localObject2 != null) && (i == 1))
          {
            if (!((WXRTEditText)localObject1).hasFocus()) {
              ((WXRTEditText)localObject1).requestFocus();
            }
            if ((((WXRTEditText)localObject1).getEditTextType() == 1) || (((WXRTEditText)localObject1).getEditTextType() == 2))
            {
              ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(true);
              ((WXRTEditText)localObject1).setSelection(0);
              ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(false);
              label871:
              if ((i == 3) || (i == 0)) {
                cas();
              }
              cav();
              f(true, 0L);
              if (k != 4) {
                break label1106;
              }
            }
          }
          label1106:
          for (i = this.qsw.qsa;; i = this.qsw.startOffset)
          {
            a(k, localRecyclerView, localView, i);
            i = 1;
            break;
            if (this.qsw.startOffset > ((Editable)localObject2).length()) {
              break label871;
            }
            ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(true);
            ((WXRTEditText)localObject1).setSelection(this.qsw.startOffset);
            ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(false);
            break label871;
            if ((!this.qsc) || (localObject2 == null) || (i != 2) || (!((WXRTEditText)localObject1).hasFocus())) {
              break label871;
            }
            if ((((WXRTEditText)localObject1).getEditTextType() == 1) || (((WXRTEditText)localObject1).getEditTextType() == 2))
            {
              ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(true);
              ((WXRTEditText)localObject1).setSelection(0);
              ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(false);
              break label871;
            }
            if ((this.qsw.startOffset > ((Editable)localObject2).length()) || (this.qsw.qsa > ((Editable)localObject2).length())) {
              break label871;
            }
            ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(true);
            ((WXRTEditText)localObject1).setSelection(this.qsw.startOffset, this.qsw.qsa);
            ((WXRTEditText)localObject1).setIgnoreSelectChangeByMultiSelect(false);
            break label871;
          }
        }
      }
      caz();
      return;
      label1123:
      i = 0;
    }
  }
  
  private static boolean l(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {
      return false;
    }
    if (paramBoolean)
    {
      paramView.setVisibility(0);
      return true;
    }
    paramView.setVisibility(8);
    return false;
  }
  
  private static boolean p(int[] paramArrayOfInt)
  {
    return (mHasInit) && (paramArrayOfInt != null) && (paramArrayOfInt.length == 2) && (paramArrayOfInt[0] != -1) && (paramArrayOfInt[1] != -1);
  }
  
  public final int Bx(int paramInt)
  {
    if ((!mHasInit) || (this.qsw == null)) {}
    do
    {
      do
      {
        return 0;
      } while ((cao() == 0) || (paramInt < this.qsw.dHJ) || (paramInt > this.qsw.endPos));
      if ((paramInt == this.qsw.dHJ) && (paramInt == this.qsw.endPos)) {
        return 1;
      }
      if ((paramInt > this.qsw.dHJ) && (paramInt < this.qsw.endPos)) {
        return 2;
      }
      if ((paramInt == this.qsw.dHJ) && (paramInt < this.qsw.endPos)) {
        return 4;
      }
    } while ((paramInt <= this.qsw.dHJ) || (paramInt != this.qsw.endPos));
    return 3;
  }
  
  public final void Q(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!mHasInit) {
      return;
    }
    cax();
    cav();
    f(true, 50L);
    ky(paramBoolean1);
    kw(paramBoolean2);
  }
  
  public final void a(int paramInt, MotionEvent paramMotionEvent)
  {
    if ((!mHasInit) || (this.mHandler == null)) {}
    do
    {
      do
      {
        return;
      } while ((this.qsx != null) && (this.qsx.getType() == 1) && (this.qsx.hER != paramInt));
      switch (paramMotionEvent.getAction())
      {
      default: 
        return;
      case 0: 
        cay();
        if (!cau()) {
          kx(true);
        }
        this.qsx.a(paramInt, paramMotionEvent.getRawX(), paramMotionEvent.getRawY(), paramMotionEvent.getX(), paramMotionEvent.getY(), 0);
        return;
      }
    } while ((this.qsx == null) || (this.qsx.getType() != 1));
    this.qsx.qrP = paramMotionEvent.getRawX();
    this.qsx.qrQ = paramMotionEvent.getRawY();
    kz(true);
    return;
    cay();
    this.mHandler.postDelayed(new e.8(this), 200L);
  }
  
  public final void a(View paramView1, View paramView2, View paramView3, int paramInt)
  {
    if ((!mHasInit) || (paramView1 == null) || (paramView2 == null) || (paramView3 == null) || (this.qsw == null)) {
      return;
    }
    switch (Bx(paramInt))
    {
    }
    do
    {
      paramView1.setVisibility(8);
      paramView2.setVisibility(4);
      paramView3.setVisibility(4);
      return;
      paramView1.setVisibility(8);
      paramView2.setVisibility(4);
      paramView3.setVisibility(4);
      return;
      if (this.qsw.startOffset == this.qsw.qsa) {
        paramView1.setVisibility(8);
      }
      for (;;)
      {
        paramView2.setVisibility(4);
        paramView3.setVisibility(4);
        return;
        paramView1.setVisibility(0);
      }
      paramView1.setVisibility(0);
      paramView2.setVisibility(0);
      paramView3.setVisibility(0);
      return;
      if (this.qsw.startOffset == 0)
      {
        paramView1.setVisibility(0);
        paramView2.setVisibility(4);
        paramView3.setVisibility(0);
        return;
      }
      paramView1.setVisibility(8);
      paramView2.setVisibility(4);
      paramView3.setVisibility(4);
      return;
    } while (this.qsw.qsa == 0);
    paramView1.setVisibility(0);
    paramView2.setVisibility(0);
    paramView3.setVisibility(4);
  }
  
  public final void caC()
  {
    x.i("NoteSelectManager", "deleteSelectedData");
    if (!mHasInit)
    {
      x.e("NoteSelectManager", "deleteSelectedData: not init");
      return;
    }
    cav();
    int i = cao();
    if (i == 2)
    {
      a(true, null, "");
      return;
    }
    if (i == 3)
    {
      b(true, null, "");
      return;
    }
    x.e("NoteSelectManager", "deleteSelectedData: not in select");
    caB();
  }
  
  public final int cao()
  {
    if (!mHasInit) {
      return 0;
    }
    if (this.qsw == null) {
      this.qsw = new d();
    }
    return this.qsw.cao();
  }
  
  public final d car()
  {
    if (!mHasInit) {
      return new d();
    }
    if (this.qsw == null) {
      this.qsw = new d();
    }
    return new d(this.qsw.dHJ, this.qsw.startOffset, this.qsw.endPos, this.qsw.qsa);
  }
  
  public final void cat()
  {
    if (!mHasInit) {
      return;
    }
    w(-1, -1, -1, -1);
    f(true, 0L);
    cax();
    cav();
  }
  
  public final boolean cau()
  {
    return (this.qsu != null) && (this.qsu.isShowing());
  }
  
  public final void cav()
  {
    if (this.qsu != null) {
      this.qsu.dismiss();
    }
  }
  
  public final boolean caw()
  {
    return (this.qsr != null) && (this.qsr.isShowing());
  }
  
  public final void cax()
  {
    if (!mHasInit) {
      return;
    }
    By(2);
    By(3);
    By(4);
  }
  
  public final void f(boolean paramBoolean, long paramLong)
  {
    if ((!mHasInit) || (this.mHandler == null)) {
      return;
    }
    this.mHandler.postDelayed(new e.1(this, paramBoolean), paramLong);
  }
  
  public final boolean isEditable()
  {
    return (mHasInit) && (this.qsc);
  }
  
  public final void kw(final boolean paramBoolean)
  {
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        e.this.kx(paramBoolean);
      }
    }, 50L);
  }
  
  public final void kx(boolean paramBoolean)
  {
    if ((!mHasInit) || (this.qsu == null)) {
      return;
    }
    RecyclerView localRecyclerView = bAt();
    int i = cao();
    if ((localRecyclerView == null) || (i == 0) || ((i == 1) && (!paramBoolean)) || ((this.qsx != null) && (this.qsx.getType() == 1)))
    {
      cav();
      return;
    }
    boolean bool1 = l(this.qsA, false);
    boolean bool2 = l(this.qsB, false);
    Object localObject1 = this.qsC;
    Object localObject2;
    boolean bool3;
    int j;
    com.tencent.mm.plugin.wenote.model.a.b localb;
    label213:
    boolean bool4;
    if (cao() == 1)
    {
      localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(this.qsw.dHJ);
      if ((localObject2 != null) && ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().size() > 1) || (((com.tencent.mm.plugin.wenote.model.a.b)localObject2).getType() != 1) || (!bi.oW(((h)localObject2).content))))
      {
        paramBoolean = true;
        bool3 = l((View)localObject1, paramBoolean);
        localObject1 = this.qsD;
        i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().bZN();
        j = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().bZO();
        localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(i);
        localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(j);
        if ((localObject2 != null) && (localb != null)) {
          break label397;
        }
        paramBoolean = false;
        bool4 = l((View)localObject1, paramBoolean);
        localObject1 = this.qsE;
        if (this.qsc) {
          break label520;
        }
        paramBoolean = false;
      }
    }
    for (;;)
    {
      label236:
      boolean bool5 = l((View)localObject1, paramBoolean);
      localObject1 = this.qsF;
      i = cao();
      if ((this.qsc) && ((i == 2) || (i == 3)))
      {
        paramBoolean = true;
        label274:
        boolean bool6 = l((View)localObject1, paramBoolean);
        localObject1 = this.qsG;
        i = cao();
        if ((i != 2) && (i != 3)) {
          break label573;
        }
        paramBoolean = true;
        label305:
        boolean bool7 = l((View)localObject1, paramBoolean);
        localObject1 = this.qsH;
        if ((this.qsc) && (cao() != 0)) {
          break label578;
        }
        paramBoolean = false;
        label335:
        paramBoolean = l((View)localObject1, paramBoolean);
        if ((!bool1) && (!bool2) && (!bool3) && (!bool4) && (!bool5) && (!bool6) && (!bool7) && (!paramBoolean)) {
          break label598;
        }
      }
      label397:
      label515:
      label520:
      label573:
      label578:
      label598:
      for (i = 1;; i = 0)
      {
        if (i != 0) {
          break label603;
        }
        cav();
        return;
        paramBoolean = false;
        break;
        if ((this.qsw != null) && (this.qsw.dHJ == i) && (this.qsw.startOffset == 0) && (this.qsw.endPos == j))
        {
          if (localb.getType() == 1)
          {
            localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.Sk(((h)localb).content);
            if (localObject2 == null)
            {
              paramBoolean = false;
              break label213;
            }
            if (this.qsw.qsa != ((Spanned)localObject2).length()) {
              break label515;
            }
            paramBoolean = false;
            break label213;
          }
          if ((localb.getType() != 1) && (this.qsw.qsa == 1))
          {
            paramBoolean = false;
            break label213;
          }
        }
        paramBoolean = true;
        break label213;
        i = cao();
        if ((i == 0) || (i == 1))
        {
          paramBoolean = false;
          break label236;
        }
        if (this.qsv == null) {
          break label1306;
        }
        if (!this.qsv.bZv())
        {
          paramBoolean = true;
          break label236;
        }
        paramBoolean = false;
        break label236;
        paramBoolean = false;
        break label274;
        paramBoolean = false;
        break label305;
        if (com.tencent.mm.plugin.wenote.model.nativenote.manager.f.eE(ad.getContext()) != 1)
        {
          paramBoolean = true;
          break label335;
        }
        paramBoolean = false;
        break label335;
      }
      label603:
      int i2 = D(localRecyclerView);
      int i3 = caA();
      if ((this.qsu != null) && (this.qsu.getContentView() != null))
      {
        this.qsu.getContentView().measure(0, 0);
        i = this.qsu.getContentView().getMeasuredHeight();
        j = this.qsg * 2 + i;
        i = this.qsu.getContentView().getMeasuredWidth() + this.qsg * 2;
      }
      for (;;)
      {
        int m;
        int k;
        if (j == 0)
        {
          m = this.qsi;
          if (i != 0) {
            break label883;
          }
          k = this.qsj;
          label704:
          if ((this.qsr == null) || (!this.qsr.isShowing()) || (!p(this.qso))) {
            break label911;
          }
          i = this.qso[1] - m;
          j = this.qso[1] + this.qsr.getHeight() - this.qsk;
          if ((i < i2) || (i > i3)) {
            break label889;
          }
          m = this.qso[0];
          j = i;
          i = m;
        }
        for (;;)
        {
          m = j;
          if (j == -1)
          {
            localObject1 = localRecyclerView.getLayoutManager();
            if ((localObject1 != null) && ((localObject1 instanceof LinearLayoutManager)))
            {
              localObject1 = (LinearLayoutManager)localObject1;
              i = ((LinearLayoutManager)localObject1).fi();
              m = ((LinearLayoutManager)localObject1).fj();
              if ((this.qsw.dHJ <= i) && (this.qsw.endPos >= m))
              {
                m = 300;
                i = 64536;
              }
            }
          }
          else
          {
            label866:
            if (m == -1)
            {
              cav();
              return;
              m = j;
              break;
              label883:
              k = i;
              break label704;
              label889:
              if ((j < i2) || (j > i3)) {
                break label1290;
              }
              i = this.qso[0];
              continue;
              label911:
              if ((this.qss == null) || (!this.qss.isShowing()) || (!p(this.qsp))) {
                break label1281;
              }
              j = this.qsp[1] - m;
              i = this.qsp[1] + this.qss.getHeight() - this.qsk;
              if ((j >= i2) && (j <= i3)) {
                i = this.qsp[0];
              }
            }
          }
          for (;;)
          {
            if ((this.qst != null) && (this.qst.isShowing()) && (p(this.qsq)))
            {
              int i1 = this.qsq[1] - m;
              int n = this.qsq[1] + this.qst.getHeight() - this.qsk;
              if (j == -1)
              {
                if ((i1 >= i2) && (i1 <= i3))
                {
                  i = this.qsq[0];
                  j = i1;
                  break;
                  if ((i < i2) || (i > i3)) {
                    break label1281;
                  }
                  n = this.qsp[0];
                  j = i;
                  i = n;
                  continue;
                }
                if ((n < i2) || (n > i3)) {
                  break label1278;
                }
                i = this.qsq[0];
                j = n;
                break;
              }
              if ((j + m > this.qsq[1]) && (n >= i2) && (n <= i3))
              {
                i = this.qsq[0];
                j = n;
                break;
                j = this.mScreenWidth / 3;
                n = this.mScreenWidth * 2 / 3;
                if ((i == 64536) || ((i >= j) && (i <= n)))
                {
                  d(localRecyclerView, (this.mScreenWidth - k) / 2, m);
                  return;
                }
                if (i < j)
                {
                  d(localRecyclerView, this.qsh, m);
                  return;
                }
                d(localRecyclerView, this.mScreenWidth - k - this.qsh, m);
                return;
                i = 64536;
                m = j;
                break label866;
              }
            }
            label1278:
            break;
            label1281:
            i = 64536;
            j = -1;
          }
          label1290:
          i = 64536;
          j = -1;
        }
        i = 0;
        j = 0;
      }
      label1306:
      paramBoolean = true;
    }
  }
  
  public final void ky(boolean paramBoolean)
  {
    if (!mHasInit) {
      return;
    }
    RecyclerView localRecyclerView = bAt();
    int i = cao();
    if ((localRecyclerView == null) || (i == 0) || ((i == 1) && (!paramBoolean)))
    {
      cax();
      return;
    }
    View localView1 = f.g(localRecyclerView, this.qsw.dHJ);
    View localView2 = f.g(localRecyclerView, this.qsw.endPos);
    if (i == 1)
    {
      By(3);
      By(4);
      a(2, localRecyclerView, localView1, this.qsw.startOffset);
      return;
    }
    By(2);
    a(3, localRecyclerView, localView1, this.qsw.startOffset);
    a(4, localRecyclerView, localView2, this.qsw.qsa);
  }
  
  public final boolean w(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!mHasInit) {
      return false;
    }
    boolean bool;
    if (this.qsw == null)
    {
      this.qsw = new d(paramInt1, paramInt2, paramInt3, paramInt4);
      bool = true;
    }
    for (;;)
    {
      if (bool) {
        x.d("NoteSelectManager", "setSelectInfo: %d:%d - %d:%d", new Object[] { Integer.valueOf(this.qsw.dHJ), Integer.valueOf(this.qsw.startOffset), Integer.valueOf(this.qsw.endPos), Integer.valueOf(this.qsw.qsa) });
      }
      return bool;
      if ((this.qsw.dHJ != paramInt1) || (this.qsw.startOffset != paramInt2) || (this.qsw.endPos != paramInt3) || (this.qsw.qsa != paramInt4))
      {
        this.qsw.set(paramInt1, paramInt2, paramInt3, paramInt4);
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
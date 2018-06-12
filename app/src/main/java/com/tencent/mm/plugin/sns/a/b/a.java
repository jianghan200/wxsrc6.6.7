package com.tencent.mm.plugin.sns.a.b;

import android.view.View;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class a
{
  public String bNH = "";
  long egG = 0L;
  public String egH = "";
  private String fvT = "";
  boolean hxu = false;
  public int iGo = 0;
  private int niA = 55450;
  private int niB = 55450;
  long niC = 0L;
  int niD = 0;
  int niE = -1;
  int niF = -1;
  int niG = 0;
  int niH = 0;
  int niI = 0;
  private boolean niJ = false;
  private int niK = 0;
  boolean nia = false;
  public boy nib;
  public View nic;
  public View nid;
  public int nie = 0;
  public int nif = 0;
  public int nig;
  private View nih;
  private int nii = 0;
  private com.tencent.mm.plugin.sns.storage.a nij = null;
  b nik;
  int nil = 55450;
  private int nim = 55450;
  int nin = 55450;
  private int nio = 55450;
  long nip = 0L;
  long niq = 0L;
  private int nir = 55450;
  private int nis = 55450;
  long nit = 0L;
  private int niu = 55450;
  private int niv = 55450;
  long niw = 0L;
  private int nix = 55450;
  private int niy = 55450;
  long niz = 0L;
  int position = 0;
  public int sceneType = 1;
  
  public a(com.tencent.mm.plugin.sns.storage.a parama, String paramString, long paramLong, View paramView1, int paramInt1, View paramView2, int paramInt2, int paramInt3, boy paramboy, int paramInt4, b paramb)
  {
    this.position = paramInt4;
    this.nic = paramView1;
    this.nib = paramboy;
    this.nik = paramb;
    this.nij = parama;
    this.sceneType = paramInt3;
    if (parama == null)
    {
      paramView1 = "";
      this.fvT = paramView1;
      if (parama != null) {
        break label355;
      }
    }
    label355:
    for (parama = "";; parama = com.tencent.mm.sdk.platformtools.bi.aG(parama.ntU, ""))
    {
      this.egH = parama;
      this.bNH = paramString;
      this.egG = paramLong;
      this.nig = paramInt1;
      this.nih = paramView2;
      this.nii = paramInt2;
      if (this.nic != null) {
        this.nid = this.nic.findViewById(i.f.album_list_fatherview);
      }
      initView();
      return;
      paramView1 = com.tencent.mm.sdk.platformtools.bi.aG(parama.fvT, "");
      break;
    }
  }
  
  private void initView()
  {
    if ((this.iGo == 0) && (this.nic != null))
    {
      BackwardSupportUtil.b.b(this.nic.getContext(), 50.0F);
      this.iGo = this.nic.getHeight();
      if (this.nid != null) {
        this.nie = this.nid.getHeight();
      }
      if (this.iGo != 0) {}
    }
    else
    {
      return;
    }
    int i = 0;
    if (this.nih != null) {
      i = this.nih.getBottom();
    }
    this.iGo -= this.nie;
    this.nif = (this.iGo / 2);
    this.nig = (this.nig - i - this.nii);
    x.i("MicroMsg.AdViewStatic", "viewHeight " + this.iGo + " SCREEN_HEIGHT: " + this.nig + " abottom: " + i + " stHeight: " + this.nii + " commentViewHeight:" + this.nie);
  }
  
  public final void bwK()
  {
    int j = 1;
    if (this.nic != null)
    {
      initView();
      if ((!this.hxu) && (this.iGo > 0)) {}
    }
    else
    {
      return;
    }
    this.nia = true;
    int k = this.nic.getTop();
    int m = this.nic.getBottom();
    int n = this.nie;
    int[] arrayOfInt;
    if (!this.niJ)
    {
      arrayOfInt = new int[2];
      this.nic.getLocationOnScreen(arrayOfInt);
      if (this.nih == null) {
        break label917;
      }
    }
    label151:
    label725:
    label753:
    label896:
    label904:
    label912:
    label917:
    for (int i = this.nih.getBottom();; i = 0)
    {
      this.niK = (k - (arrayOfInt[1] - i - this.nii));
      this.niJ = true;
      k -= this.niK;
      m = m - n - this.niK;
      int i1;
      if ((k >= 0) && (m <= this.nig))
      {
        this.niI = 1;
        if ((this.nil == 55450) && (this.nim == 55450))
        {
          this.nil = k;
          this.nim = m;
        }
        this.nin = k;
        this.nio = m;
        if (k < 0)
        {
          n = k + this.iGo;
          i1 = this.iGo - n;
          if ((n < this.nif) || (this.nir != 55450)) {
            break label912;
          }
          this.nir = k;
          this.nis = m;
          this.nit = System.currentTimeMillis();
          x.i("MicroMsg.AdViewStatic", "up first touch half" + n + " top " + k + " viewhieght " + this.iGo + " inscreenval: " + n + " outscreenval: " + i1);
        }
      }
      for (i = 0;; i = 1)
      {
        if ((i1 >= this.nif) && (this.niu == 55450) && (i != 0) && (this.nit > 0L))
        {
          this.niu = k;
          this.niv = m;
          this.niw = System.currentTimeMillis();
          x.i("MicroMsg.AdViewStatic", "down first touch half" + n + " bottom " + m + " viewhieght " + this.iGo + " inscreenval: " + n + " outscreenval: " + i1);
        }
        if (m > this.nig)
        {
          n = m - this.nig;
          i1 = this.iGo - n;
          i = j;
          if (i1 >= this.nif)
          {
            i = j;
            if (this.nir == 55450)
            {
              this.nir = k;
              this.nis = m;
              this.nit = System.currentTimeMillis();
              x.i("MicroMsg.AdViewStatic", "up first touch half" + n + " top " + k + " viewhieght " + this.iGo + " inscreenval: " + i1 + " outscreenval: " + n);
              i = 0;
            }
          }
          if ((n >= this.nif) && (this.niu == 55450) && (i != 0) && (this.nit > 0L))
          {
            this.niu = k;
            this.niv = m;
            this.niw = System.currentTimeMillis();
            x.i("MicroMsg.AdViewStatic", "down first touch half" + n + " bottom " + m + " viewhieght " + this.iGo + " inscreenval: " + i1 + " outscreenval: " + n);
          }
        }
        if ((k >= 0) && (m <= this.nig))
        {
          if (this.niz == 0L)
          {
            this.nix = k;
            this.niy = m;
            this.niz = System.currentTimeMillis();
          }
          if (k >= 0) {
            break label896;
          }
          i = -k;
          if ((this.niE == -1) || (this.niE > i)) {
            this.niE = i;
          }
          if (m <= this.nig) {
            break label904;
          }
          i = m - this.nig;
          if ((this.niF != -1) && (this.niF <= i)) {}
        }
        for (this.niF = i;; this.niF = 0)
        {
          j = this.iGo;
          i = j;
          if (k < 0) {
            i = j + k;
          }
          j = i;
          if (m > this.nig) {
            j = i - (m - this.nig);
          }
          if ((this.niD != -1) && (this.niD >= j)) {
            break;
          }
          this.niD = j;
          return;
          this.niI = 0;
          break label151;
          if ((this.niC != 0L) || (this.niz == 0L)) {
            break label725;
          }
          this.niA = k;
          this.niB = m;
          this.niC = System.currentTimeMillis();
          break label725;
          this.niE = 0;
          break label753;
        }
      }
    }
  }
  
  public final com.tencent.mm.protocal.c.bi bwL()
  {
    com.tencent.mm.protocal.c.bi localbi = new com.tencent.mm.protocal.c.bi();
    Object localObject = af.byo().fi(this.egG);
    if (localObject != null)
    {
      localObject = aj.n((n)localObject);
      if (localObject != null)
      {
        localbi.rbI = ((boy)localObject).smO.size();
        localbi.like_count = ((boy)localObject).smL.size();
        return localbi;
      }
    }
    if (this.nib != null)
    {
      localbi.rbI = this.nib.smN;
      localbi.like_count = this.nib.smK;
      return localbi;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
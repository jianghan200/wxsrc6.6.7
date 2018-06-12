package com.tencent.mm.ab;

import com.tencent.mm.bk.a;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bnu;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  extends j
{
  public int cdn = 0;
  public b dID = null;
  public c dIE = null;
  public int dIF;
  public String uri;
  
  private b(a parama1, a parama2, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    boolean bool1 = bool2;
    if (paramBoolean)
    {
      bool1 = bool2;
      if ((parama1 instanceof bhd)) {
        bool1 = true;
      }
    }
    this.dID = new b(parama1, paramInt1, paramInt2, bool1);
    this.dIE = new c(parama2, paramInt3, paramBoolean);
    this.uri = paramString;
    this.dIF = paramInt1;
  }
  
  public final a KN()
  {
    return this.dID.dIL;
  }
  
  public final a KO()
  {
    return this.dIE.dIL;
  }
  
  public final int KP()
  {
    return this.cdn;
  }
  
  public final void a(y paramy)
  {
    this.dID.qWA = paramy;
  }
  
  public final int getType()
  {
    return this.dIF;
  }
  
  public final String getUri()
  {
    return this.uri;
  }
  
  public static final class a
  {
    public int dIF;
    public a dIG;
    public a dIH;
    public int dII = 0;
    public int dIJ = 0;
    public boolean dIK = true;
    public String uri;
    
    public final void KQ()
    {
      this.dIF = 425;
    }
    
    public final void KR()
    {
      this.dII = 209;
    }
    
    public final void KS()
    {
      this.dIJ = 1000000209;
    }
    
    public final b KT()
    {
      if ((this.dIG == null) || (this.dIH == null) || (bi.oW(this.uri)) || (this.dIF <= 0) || (this.dII == Integer.MIN_VALUE) || (this.dIJ == Integer.MIN_VALUE)) {
        throw new IllegalArgumentException();
      }
      return new b(this.dIG, this.dIH, this.uri, this.dIF, this.dII, this.dIJ, this.dIK, (byte)0);
    }
    
    public final void a(a parama)
    {
      this.dIG = parama;
    }
    
    public final void b(a parama)
    {
      this.dIH = parama;
    }
    
    public final void ke(String paramString)
    {
      this.uri = paramString;
    }
  }
  
  public static final class b
    extends k.d
    implements k.b
  {
    public int cmdId;
    private int dIF;
    public a dIL;
    private boolean dIM;
    
    public b(a parama, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.dIL = parama;
      this.dIF = paramInt1;
      this.cmdId = paramInt2;
      this.dIM = paramBoolean;
    }
    
    public final byte[] Ie()
    {
      if ((this.dIL instanceof bhd)) {
        ((bhd)this.dIL).shX = k.a(this);
      }
      return this.dIL.toByteArray();
    }
    
    public final int If()
    {
      return this.dIF;
    }
    
    public final int getCmdId()
    {
      return this.cmdId;
    }
  }
  
  public static final class c
    extends k.e
    implements k.c
  {
    public int cmdId;
    public a dIL = null;
    private boolean dIM;
    
    public c(a parama, int paramInt, boolean paramBoolean)
    {
      this.dIL = parama;
      this.cmdId = paramInt;
      this.dIM = paramBoolean;
    }
    
    public final int G(byte[] paramArrayOfByte)
    {
      this.dIL = this.dIL.aG(paramArrayOfByte);
      if (!(this.dIL instanceof bnu))
      {
        k.a(this, ((bhp)this.dIL).six);
        return ((bhp)this.dIL).six.rfn;
      }
      return ((bnu)this.dIL).getRet();
    }
    
    public final int getCmdId()
    {
      return this.cmdId;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
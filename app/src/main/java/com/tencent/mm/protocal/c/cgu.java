package com.tencent.mm.protocal.c;

public final class cgu
  extends com.tencent.mm.bk.a
{
  public int cbB;
  public String cbC;
  public String grK;
  public int grP;
  public int hcE;
  public int ixe;
  public String jQb;
  public int mEb;
  public int mEc;
  public int pPq;
  public String sAS;
  public String sAT;
  public int sAU;
  public String sAV;
  public String sAW;
  public int sAX;
  public String sAY;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hcE);
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.sAS != null) {
        paramVarArgs.g(3, this.sAS);
      }
      paramVarArgs.fT(4, this.mEb);
      paramVarArgs.fT(5, this.ixe);
      paramVarArgs.fT(6, this.mEc);
      if (this.sAT != null) {
        paramVarArgs.g(7, this.sAT);
      }
      paramVarArgs.fT(8, this.sAU);
      if (this.sAV != null) {
        paramVarArgs.g(9, this.sAV);
      }
      if (this.sAW != null) {
        paramVarArgs.g(10, this.sAW);
      }
      paramVarArgs.fT(11, this.pPq);
      paramVarArgs.fT(12, this.sAX);
      if (this.sAY != null) {
        paramVarArgs.g(13, this.sAY);
      }
      if (this.grK != null) {
        paramVarArgs.g(14, this.grK);
      }
      paramVarArgs.fT(15, this.cbB);
      if (this.cbC != null) {
        paramVarArgs.g(16, this.cbC);
      }
      paramVarArgs.fT(17, this.grP);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.hcE) + 0;
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.sAS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sAS);
      }
      i = i + f.a.a.a.fQ(4, this.mEb) + f.a.a.a.fQ(5, this.ixe) + f.a.a.a.fQ(6, this.mEc);
      paramInt = i;
      if (this.sAT != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sAT);
      }
      i = paramInt + f.a.a.a.fQ(8, this.sAU);
      paramInt = i;
      if (this.sAV != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.sAV);
      }
      i = paramInt;
      if (this.sAW != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.sAW);
      }
      i = i + f.a.a.a.fQ(11, this.pPq) + f.a.a.a.fQ(12, this.sAX);
      paramInt = i;
      if (this.sAY != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.sAY);
      }
      i = paramInt;
      if (this.grK != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.grK);
      }
      i += f.a.a.a.fQ(15, this.cbB);
      paramInt = i;
      if (this.cbC != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.cbC);
      }
      return paramInt + f.a.a.a.fQ(17, this.grP);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cgu localcgu = (cgu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcgu.hcE = locala.vHC.rY();
        return 0;
      case 2: 
        localcgu.jQb = locala.vHC.readString();
        return 0;
      case 3: 
        localcgu.sAS = locala.vHC.readString();
        return 0;
      case 4: 
        localcgu.mEb = locala.vHC.rY();
        return 0;
      case 5: 
        localcgu.ixe = locala.vHC.rY();
        return 0;
      case 6: 
        localcgu.mEc = locala.vHC.rY();
        return 0;
      case 7: 
        localcgu.sAT = locala.vHC.readString();
        return 0;
      case 8: 
        localcgu.sAU = locala.vHC.rY();
        return 0;
      case 9: 
        localcgu.sAV = locala.vHC.readString();
        return 0;
      case 10: 
        localcgu.sAW = locala.vHC.readString();
        return 0;
      case 11: 
        localcgu.pPq = locala.vHC.rY();
        return 0;
      case 12: 
        localcgu.sAX = locala.vHC.rY();
        return 0;
      case 13: 
        localcgu.sAY = locala.vHC.readString();
        return 0;
      case 14: 
        localcgu.grK = locala.vHC.readString();
        return 0;
      case 15: 
        localcgu.cbB = locala.vHC.rY();
        return 0;
      case 16: 
        localcgu.cbC = locala.vHC.readString();
        return 0;
      }
      localcgu.grP = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */